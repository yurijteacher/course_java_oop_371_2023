package unit11.structural.bridge;

import unit11.structural.bridge.maker.BMW;
import unit11.structural.bridge.maker.Seat;
import unit11.structural.bridge.road_type.Car;
import unit11.structural.bridge.road_type.City;
import unit11.structural.bridge.road_type.Sport;

public class Main {


    public static void main(String[] args) {

        Car seat2000 = new Sport(new Seat());

        Car bwm5 = new Sport(new BMW());

        seat2000.carDetails();
        System.out.println("...");
        bwm5.carDetails();

        Car seat3000 = new City(new Seat());
        seat3000.carDetails();


    }
}
