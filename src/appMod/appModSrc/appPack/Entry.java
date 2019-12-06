package appPack;

import core.foo.CreateApi;
import greetPack.Hello;
import java.lang.reflect.InvocationTargetException;

public class Entry {
    public static void main(String[] args) {
        System.out.println(new Hello().sayHello());
        try {
            CreateApi createApi = new CreateApi();
            createApi.testApi();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
