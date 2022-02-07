package com.xrc;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        List<Dog> aList = new ArrayList();

        Dog p1 = new Dog();
        p1.setSize("1");
        Dog p2 = new Dog();
        p2.setSize("2");
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
    }


    public static void filterList(List<Dog> aList) {
        System.out.println(aList.stream().filter(a -> a.getSize().equals("2"))
                .collect(Collectors.toList()).size());
    }
}
