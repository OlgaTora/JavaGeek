package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Ex00 {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        final int LIST_SIZE = 1000000;



        LinkedList<Random> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(0, new Random());
        }

        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));


        ArrayList<Random> arrayList = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(0,new Random());
        }

        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
}
