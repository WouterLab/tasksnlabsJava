package com.company;

public class Palindrom {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < args.length; i++) {
            s = args[i];
            if (isPalindrom(s)) { // Сравнение слов
                System.out.println(s); // Вывод только палиндромов
            }
        }
    }
        public static String reverseString(String s) { // Метод переворота слова
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                result = s.charAt(i) + result;
            }
        return result;
    }

    public static boolean isPalindrom(String s) { // Метод сравнения двух слов до и после переворота
        String s2 = reverseString(s);
        if (s.equals(s2)) //Сравнение слов
            return true;
            return false;
    }
}
