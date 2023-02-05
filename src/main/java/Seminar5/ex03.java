package Seminar5;


//Метод, определяющий правильность расстановки скобок

public class ex03 {
    public static void main(String[] args) {
        String s1 = "(df)){f{sg{(()]][[)){dfgfg";
        String s2 = "{n{}df()}";
        System.out.println(isTrueBrackets(s1));
        System.out.println(isTrueBrackets(s2));
    }


    private static boolean isTrueBrackets(String str) {
        boolean flag = false;
        str = str.replaceAll("[a-zA-Zа-яА-Я]*", "");
        System.out.println(str);
        String[] brackets = {"(", ")", "[", "]", "{", "}"};
        for (int i = 1; i <= brackets.length; i++) {
            if (i / 2 == 0) {
                if (str.startsWith(brackets[i])) {
                    return flag;
                }
            }else{
                if(str.endsWith(brackets[i])){
                    return flag;
                }
            }
        }


        return flag;

    }
}