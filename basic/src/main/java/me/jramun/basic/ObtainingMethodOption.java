package me.jramun.basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObtainingMethodOption {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        Class<?> clazz = Class.forName("me.jramun.basic.ObtainingMethodOption");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.printf("Method name [%s] parameters [%s] return type [%s] %n", method.getName(), method.getParameterCount(), method.getReturnType().getName());
            if (method.getName().equals("sum")) {
                int result = (int) method.invoke(clazz.getDeclaredConstructor().newInstance(), 1, 2);
                System.out.printf("Method sum result [%s]", result);
            }

        }
    }


    public int sum(int x, int y) {
        return x + y;
    }
}
