package me.jramun.basic;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnno {

    String name();

    String value() default "default value";
}

@MyAnno(name = "My baby!")
class MyClass {

}

public class AnnotationTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("me.jramun.basic.MyClass");
        for (Annotation annotation : clazz.getDeclaredAnnotations()) {
            if (annotation instanceof MyAnno anno) {
                System.out.printf("me.jramun.basic.MyAnno name [%s] value [%s] %n", anno.name(), anno.value());
            }
        }
    }
}