package com.xrc;

import java.util.ArrayList;
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
        // Exercise 3-1
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println(c1.name);

        // Exercise 3-2
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 10.5;
        item1.tax = 0.2;
        item2.description = "Red Jacket";
        item2.price = 10.4;
        item2.size = "S";
        item2.tax = 0.2;
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
        Clothing[] items = {item1, item2};
        c1.setItems(items);
        total = c1.getTotalClothingCost();
        System.out.println(total);




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
