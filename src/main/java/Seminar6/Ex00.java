package Seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ex00 {
    public static void main(String[] args) {
        createHSet();
        createLHSet();
        createTreeSet();
    }

    private static void createTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 5, 3, 5, 3, 8, 4, 7));
        System.out.println("treeSet" + treeSet);
    }

    private static void createLHSet() {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 2, 5, 3, 5, 3, 8, 4, 7));
        System.out.println("linkedHashSet" + linkedHashSet);
    }

    private static void createHSet() {
        HashSet<Integer>hashSet = new HashSet<>(Arrays.asList(1, 2, 5, 3, 5, 3, 8, 4, 7));
        System.out.println("hashSet" + hashSet);
    }
}
