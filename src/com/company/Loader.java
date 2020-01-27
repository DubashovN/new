package com.company;

public class Loader {
    void start() {
        apple("apple", 'p');
    }

    void vertical(String string) {
        for (int i = 0; i < string.length(); i++) {
            char vertical = string.charAt(i);
            System.out.print(vertical + "\n");
        }
    }

    void calculate(String string, char a) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == a)
                count++;
        }
        System.out.println(count);
    }

    String fixed;
    void apple(String string, char a) {
        System.out.println(string);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == a){
                fixed = string.replace(a, '^');
                 }
            }
        System.out.println(fixed);
        }
    }

    //написать метод, который принимает на вход строку и выводит её по вертикали.
    //метод, который принимает строку и символ и считает кол-во символов в строке.
    //Apple
    // ^^


