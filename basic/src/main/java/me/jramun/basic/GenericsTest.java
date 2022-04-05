package me.jramun.basic;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    protected List<String> stringList = new ArrayList<>();

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = GenericsTest.class.getMethod("getStringList", null);

        Type returnType = method.getGenericReturnType();

        if (returnType instanceof ParameterizedType type) {
            System.out.println(type.getTypeName());
            System.out.println(type.getRawType().getTypeName());
            Type[] typeArguments = type.getActualTypeArguments();
            for (Type typeArgument : typeArguments) {
                Class<?> typeArgClass = (Class<?>) typeArgument;
                System.out.println("typeArgClass = " + typeArgClass);
            }
        }
    }

    public List<String> getStringList() {
        return this.stringList;
    }
}
