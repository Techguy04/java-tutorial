package Java_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ListDemo {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();

//        cars.add("Ford");
//        cars.add("suzuki");
//        cars.add("Toyota");
//        cars.add("Tesla");
//
////        System.out.println(cars);
////        for (String vehicle : cars) {
//////            if (vehicle.startsWith("T")) {
//////                System.out.println(vehicle);
//////            }
////
////        }
//        if (cars.contains("Ford")) {
//            cars.remove(cars.indexOf("Ford"));
//        }
//        //size
//        int size = cars.size();
//        System.out.println("Size:  "+size);
//
//        //get element
//        String s = cars.get(2);
//        System.out.println(s);
//        System.out.println(cars);
//
//        cars.stream().filter(items -> items.length() == 6)
//                .forEach(i-> System.out.println(i));
        //How to work with an Object with array list
        Ex ex1 = new Ex(101, "Dauda", "Barnabas", 20, "2340668869");
        Ex ex2 = new Ex(102, "Priscilla", "Henshaw", 20, "23467496740");
        Ex ex3 = new Ex(103, "Ifeoma", "Promise", 20, "2340180555735");
        //Create arrayList
        ArrayList<Ex> listofEx = new ArrayList<>();
        listofEx.add(ex1);
        listofEx.add(ex2);
        listofEx.add(ex3);

        //iterate
        listofEx.stream()
                .forEach(a-> System.out.println("names: "+a.getFirstName()+" "+a.getLastName()+ " " + "Age: "+a.getAge()));


    }
}
