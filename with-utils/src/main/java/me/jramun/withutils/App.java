package me.jramun.withutils;

import org.reflections.Reflections;

public class App {

    public static void main(String[] args) {
        Reflections reflections = new Reflections("me.jramun.withutils");
        System.out.println("Hello");
    }
}
