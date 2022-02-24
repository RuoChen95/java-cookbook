package com.xrc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class mainCookBook {

    public static class Dog {
        private String size;
        private String color;
        private String age;

        public String getSize() {
            return size;
        }

        public String getColor() {
            return color;
        }

        public String getAge() {
            return age;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }

    public class food {
        private double price;
        private final double tax = 0.5;
    }


    public static void main(String[] args) {
        // 6-3: Use Static Constants
        System.out.println(Clothing.MIN_PRICE);


        // Exercise 3-1
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println(c1.name);

        // Exercise 3-2
        // Exercise 6-2
        Clothing item1 = new Clothing("Blue Jacket", 10.5, 0.2, "S");
        Clothing item2 = new Clothing("Red Jacket", 10.4, 0.2, "S");
        // double tax = 0.2;
        //double total = 0.0;
        //total = total + (item1.price * 2 + item2.price) * (1 + tax);
        // Exercise 5-1 Apply Encapsulation
        double total = item2.getPrice();
        System.out.println(total);

        // Exercise 5-2 Overload a Method
        c1.setSize(8);
        System.out.println("c1.size:");
        System.out.println(c1.size);

        // Exercise 5-3 Associate "Customer" with "Clothing"
        Clothing[] items = {item2, item1};
        c1.setItems(items);
        total = c1.getTotalClothingCost();
        System.out.println(total);

        // Exercise 6-1
        Customer c2 = new Customer("Bob", "S");
        Customer c3 = new Customer("Bob", 3);
        System.out.println(c3.size);

        System.out.println("7-1");
        c2.setItems(items);
        c2.getAverageTotalClothingCost();



        // 8-1: Override the toString Method
        System.out.println(item1);

        Arrays.sort(c1.getItems());

        for (Clothing item : c1.getItems()) {
            System.out.println("Item output " + item);
        }







        // Personal Exercise
        List<Dog> aList = new ArrayList();

        Dog p1 = new Dog();
        p1.setSize("2");
        Dog p2 = new Dog();
        p2.setSize("1");
        Dog p3 = new Dog();
        p3.setSize("2");

        aList.add(p1);
        aList.add(p2);
        aList.add(p3);

        /*
        过滤集合

        stream
        filter
        lambda表达式
        collector
         */
        filterList(aList);

        useEntrySet(aList);
    }


    public static void filterList(List<Dog> aList) {
        System.out.println(
            aList.stream().filter(
                a -> a.getSize().equals("2")
            ).collect(
                Collectors.toList()
            ).size()
        );
    }

    public static void useEntrySet(List<Dog> aList) {
        aList.stream().collect(
                Collectors.groupingBy(Dog::getSize)
        ).entrySet().forEach(e -> {
            List<Dog> subList = e.getValue();

            for (Dog sub: subList) {
                System.out.println(sub.getSize());
            }
        });
    }
}
