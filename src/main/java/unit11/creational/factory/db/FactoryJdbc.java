package unit11.creational.factory.db;

import unit11.creational.factory.Circle;
import unit11.creational.factory.Point;
import unit11.creational.factory.Square;

public class FactoryJdbc {

    JDBC driver;

    public JDBC getDriver(String name){

        switch (name){
            case("mysql"): driver = new MySQLJdbc();
                break;
            case("oracle"): driver = new OracleJdbc();
                break;
        }

        return driver;
    }

}
