package me.jramun.basic;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAno {

}

public class Simple4 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Dog dog = new Dog("Poppy");
        Class<? extends Dog> clazz = dog.getClass();
        Field type = clazz.getDeclaredField("type");
        type.setAccessible(true);
        System.out.printf("Class [%s] %n", clazz.getName());
        System.out.printf("Class mode [%s] %n", Modifier.toString(clazz.getModifiers()));
        System.out.printf("Super class [%s] %n", clazz.getSuperclass().getName());
        System.out.printf("Field name [%s] %n", type.getName());
        System.out.printf("Field name [%s] value [%s] %n", type.getName(), type.get(dog));
        type.set(dog, "New poppy");
        System.out.printf("Field name [%s] value [%s] %n", type.getName(), type.get(dog));
        System.out.printf("Field name [%s] annotation name [%s] %n", type.getName(), type.getDeclaredAnnotations()[0].annotationType().getName());
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.printf("Constructor parameter count [%s] , modifier [%s] %n", constructor.getParameterCount(), Modifier.toString(constructor.getModifiers()));
        }
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.printf("Annotation name [%s] , modifier [%s] %n", annotation.annotationType().getName(), Modifier.toString(annotation.annotationType().getModifiers()));

        }

    }
}

abstract class Animal {
    abstract void run();
}

@MyAno
class Dog extends Animal {

    @MyAno
    private String type;

    public Dog(String type) {
        this.type = type;
    }

    private Dog() {
    }

    @Override
    void run() {
        System.out.println("me.jramun.basic.Dog is running");
    }
}