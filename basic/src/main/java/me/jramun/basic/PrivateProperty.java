package me.jramun.basic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateProperty {

    private int x;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName("me.jramun.basic.PrivateProperty");
        Method method = clazz.getDeclaredMethod("method");
        method.setAccessible(true);
        System.out.printf("Method name [%s] parameters [%s] return type [%s] %n", method.getName(), method.getParameterCount(), method.getReturnType().getName());
        System.out.println("Method invoke :");
        method.invoke(clazz.getDeclaredConstructor().newInstance());
        Field field = clazz.getDeclaredField("x");
        field.setAccessible(true);
        System.out.printf("Field name [%s] type [%s] %n", field.getName(), field.getType());
    }

    private void method() {
        System.out.println("Hello reflection");
    }


}
