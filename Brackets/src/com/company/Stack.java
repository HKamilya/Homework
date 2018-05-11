package com.company;

public class Stack {
    private String[] array;
    private int counter;

    public Stack(int size) {
        array = new String[size];
        counter = 0;
    }

    void push(String elem) {
        //fixme
        if (counter < array.length) {
            array[counter] = elem;
            counter++;
        }
    }

    String pop() {
        if (counter > 0) {
            int numToReturn = counter - 1;
            counter--;
            return array[numToReturn];
        } else {
            return null;
        }
    }
}

