/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NB20694
 */
public class DAORoutes {

    private List<DTORoute> routes;
    private final String dbURL = "jdbc:derby://localhost:1527/EzPlanner;create=true;user=capela;password=capela123";
    private Connection conn = null;
    private Statement st = null;

    public void insertRoute(String name) {
      
        try {
            prepareConnection();
            st.executeUpdate("INSERT INTO ROUTES (NAME) VALUES ('" + name + "')");

        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }

    public List<DTORoute> getRoutes() {
        routes = new ArrayList<DTORoute>();
        try {
            prepareConnection();

            ResultSet res = st.executeQuery("SELECT * FROM ROUTES");
            while (res.next()) {
                String name = res.getString("name");
                String description = res.getString("description");
                routes.add(new DTORoute(name, description));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return routes;
    }

    private void prepareConnection() throws Exception {

        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        conn = DriverManager.getConnection(dbURL);
        st = conn.createStatement();

    }
}
