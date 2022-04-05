package me.jramun.basic;

import java.lang.reflect.InvocationTargetException;

public class NewInstanceTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> c = Class.forName("me.jramun.basic.NewInstanceTest");
        NewInstanceTest instance = (NewInstanceTest) c.getDeclaredConstructor().newInstance();
        instance.message();
    }

    public void message() {
        System.out.println("Hello message");
    }


}
