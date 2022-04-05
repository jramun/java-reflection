package me.jramun.basic;

interface SimpleInterface {

}

public class Simple3 {

    private String title;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> c = Class.forName("me.jramun.basic.Simple3");
        System.out.printf("Class name %s %n", c.getName());
        System.out.printf("Class name %s %n", c.getDeclaredField("title"));

        Class<?> simpleInterface = Class.forName("me.jramun.basic.SimpleInterface");
        System.out.printf("Is interface %s %n", simpleInterface.isInterface());

        Class<?> simpleClass = Class.forName("me.jramun.basic.Simple3");
        System.out.printf("Is class %s %n", !simpleClass.isInterface());
    }
}
