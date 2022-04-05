package me.jramun.basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodCall {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("me.jramun.basic.A");
        A a = (A) clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getDeclaredMethod("message", null);
        method.setAccessible(true);
        method.invoke(a);
    }
}

class A {
    private void message() {
        System.out.println("hello java");
    }
}
