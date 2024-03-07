package unit11.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightJdbc {

    private final Map<String, JDBC> drivers = new HashMap<>();

    public JDBC getDriver(String name){

        JDBC driver = drivers.get(name);

        if(driver==null) {

            switch (name) {
                case ("mysql"):
                    driver = new MySQLJdbc();
                    break;
                case ("oracle"):
                    driver = new OracleJdbc();
                    break;
            }

            drivers.put(name, driver);
        }

        return driver;
    }

}
