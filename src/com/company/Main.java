package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] array = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(24));


        ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); // unnecessary but for demo
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // unnecessary but for demo
        }

        Integer myIntValue = 12; // Integer.valueOf(12);
        int myInt = myIntValue; // myIntValue.intValue(myintValue);

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); // unnecessary but for demo
        }

        System.out.println();

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); // unnecessary but for demo
            System.out.println( i + " --> " + value );
        }
    }
}


class IntClass{
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public IntClass(int myValue) {

        this.myValue = myValue;
    }
}