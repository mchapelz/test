/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author NB20694
 */
@ManagedBean
@RequestScoped
public class MyRoutesBean {

    /**
     * Creates a new instance of MyRoutesBean
     */
    //private DTORoute route;
    private DTORoute selectedRoute;
    private DAORoutes daoroutes = new DAORoutes();
    private List routes = new ArrayList<DTORoute>();

    public MyRoutesBean() {

    }

    public String createRoute(String name) {

        daoroutes.insertRoute(name);

        //System.out.print(routes.size());
        return "myRoutes";
    }

    public List<DTORoute> getRoutes() {

        routes = daoroutes.getRoutes();
        return routes;
    }

    public void setRoutes(List<DTORoute> routes) {
        this.routes = routes;
    }

    public String routeSelected(String name) {
        for (int i = 0; i < daoroutes.getRoutes().size(); i++) {
            if (daoroutes.getRoutes().get(i).getName().equals(name)) {
                selectedRoute = daoroutes.getRoutes().get(i);
            }
        }
        return "selectedRoute";

    }

}
