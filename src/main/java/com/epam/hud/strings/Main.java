package com.epam.hud.strings;

public class Main {
    public static void main(String[] args) {
        //Разница между String и StringBuilder/StringBuffer
        String s = "Hello, ";
        System.out.println(s.hashCode());
        s = s + "World";
        System.out.println(s.hashCode());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("World!");
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder);


    }
}
