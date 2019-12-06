package core.foo;

import java.lang.reflect.InvocationTargetException;

/**
 * The purpose of this class is to attempt to create a class
 * using reflection without having that class as a dependency
 */
public class CreateApi {
    public void testApi()
      throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls = Class.forName("appPack.MyApi");
        Object obj = cls.getConstructor().newInstance();
        System.out.println(obj.getClass().getMethod("myApiResponse").invoke(obj));
    }
}
