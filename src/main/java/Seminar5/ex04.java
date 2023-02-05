package Seminar5;

import java.util.*;

public class ex04 {
    public static void main(String[] args) {
        String[] str = {"Пора красавица проснись", "Пора красавица проснись", "Мороз и солнце день чудесный"};
        countLetters(str);
    }

    private static void countLetters(String[] str) {
        TreeMap<Integer, List<String>> lettersMap = new TreeMap<>();
        for (int i = 0; i < str.length; i++) {
            if(lettersMap.containsKey(str[i].length())){
                lettersMap.get(str[i].length()).add(str[i]);
            }else{
                ArrayList<String > list = new ArrayList<>();
                list.add(str[i]);
                lettersMap.put(str[i].length(), list);
            }
        }
        System.out.println(lettersMap);
    }
}
