package me.jramun.basic;

import java.lang.reflect.Array;

public class ArrayTest {

    public static void main(String[] args) throws ClassNotFoundException {
        int[] intArray = (int[]) Array.newInstance(int.class, 3);
        Array.set(intArray, 0, 123);
        Array.set(intArray, 1, 456);
        Array.set(intArray, 2, 789);
        System.out.println("intArray[0] = " + Array.get(intArray, 0));
        System.out.println("intArray[1] = " + Array.get(intArray, 1));
        System.out.println("intArray[2] = " + Array.get(intArray, 2));
        Class<?> clazzIntArray = Class.forName("[I");
        Class<?> clazzStringArrayClass = Class.forName("[Ljava.lang.String;");
        Class<?> intClass1 = Class.forName("I");
        Class<?> intClass2 = Class.forName("int");
        String[] strings = new String[3];
        Class<?> stringArrayClass = strings.getClass();
        Class<?> stringArrayComponentType = stringArrayClass.getComponentType();
        System.out.println(stringArrayComponentType);
    }
}
