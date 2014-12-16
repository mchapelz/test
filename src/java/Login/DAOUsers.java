/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author NB20694
 */
public class DAOUsers {

    private final String dbURL = "jdbc:derby://localhost:1527/EzPlanner;create=true;user=capela;password=capela123";
    private Connection conn = null;
    private Statement st = null;
    private List<DTOUsers> users;

    public boolean getUsers(String username, String password) {
        try {
        prepareConnection();
        ResultSet res = st.executeQuery("SELECT * FROM users");
        while (res.next()){
            String uName = res.getString("username");
            String pass = res.getString("password");
            System.out.print(uName + " : " + pass);
            if(username.equals(uName) && pass.equals(password)){
                return true;
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }

    private void prepareConnection() throws Exception {
     
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn = DriverManager.getConnection(dbURL);
            st = conn.createStatement();
        
            
        
    }

}
