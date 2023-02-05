package Seminar5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Напишите метод выдающий true false в результате проверки изоморфности

public class ex02 {
    public static void main(String[] args) {
        String s1 = "ego";
        String s2 = "add";
        System.out.println(isIzomorf(s1, s2));
    }

    private static boolean isIzomorf(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Character> wordsMap = new HashMap<>();
        Set<Character> wordsSet = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i), y = s2.charAt(i);
            if (wordsMap.containsKey(x)) {
                if (wordsMap.get(x) != y) {
                    return false;
                }
            } else {
                if (wordsSet.contains(y)) {
                    return false;
                }
                wordsMap.put(x, y);
                wordsSet.add(y);
            }
        }
        return true;
    }
}