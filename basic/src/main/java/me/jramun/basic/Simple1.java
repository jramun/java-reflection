package me.jramun.basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Simple1 {

    private String field1;
    private String field2;

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("me.jramun.basic.Simple1");
        System.out.println("List fields");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
        }
        System.out.println("List methods");
        for (Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }
    }

    public void method1() {
        System.out.println("Call method1");
    }

    public void method2() {
        System.out.println("Call method2");
    }
}
