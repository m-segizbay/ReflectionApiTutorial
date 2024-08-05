package kz.segizbay;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
//        Cat cat = new Cat(); 1
//        int a = Cat.a; 2
//        Cat.doSmth();  3
//        Class.forName("kz.segizbay.Cat"); 4
//        Tiger tiger = new Tiger(); 5

        Class cl = Cat.class;

//        Method[] methods = cl.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

//        Method add = cl.getDeclaredMethod("add", int.class, int.class, int.class);
//        System.out.println(add);
//
//        Cat cat = new Cat();
//        int res = (int)add.invoke(null, 1, 2, 3);
//        System.out.println(res);

//        Cat cat = new Cat(1, 100);
//        Field field = cl.getDeclaredField("privateA");
//        field.setAccessible(true);
//        System.out.println(field.get(cat));

//        Field f = cl.getDeclaredField("publicA");
//        int mods = f.getModifiers();
//        System.out.println(Modifier.isPublic(mods));
//        System.out.println(Modifier.isPrivate(mods));
//        System.out.println(Modifier.isStatic(mods));
//        System.out.println(Modifier.isFinal(mods));


//        Constructor<Cat> constructor1 = cl.getConstructor(int.class, int.class);
//        Constructor<Cat> constructor2 = cl.getConstructor();
//        Cat cat1 = constructor1.newInstance(1, 2);
//        System.out.println(cat1.publicA);

//        Map<String, String> map = new HashMap<>();
//        map.put("A1", "B1");
//        map.put("A2", "B2");
//        map.put("A3", "B3");
//        map.put("A4", "B4");
//        Field table = HashMap.class.getDeclaredField("table");
//        table.setAccessible(true);
//        Object[] array = (Object[])table.get(map);
//        System.out.println(Arrays.toString(array));
    }
}
