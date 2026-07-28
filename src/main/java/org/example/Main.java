package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Car class demo");
        Car c1 = new Car(100000,1200);
        Car c2 = new Car(120000,1300);
        Car c3 = new Car(900000,900);
        Car c4 = new Car(800000,746);

        List<Car> carList = new ArrayList<>(Arrays.asList(c1,c2,c3,c4));

        carList.sort(new CarPriceComparator());

        System.out.println(carList);


    }
}