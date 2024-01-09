package com.javarush.task.pro.task13.task1304;

import java.util.Iterator;

public class MyIter implements Iterator<String> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    public static void main(String[] args) {
        MyIter myIter = new MyIter();
        myIter.remove();
    }
}
