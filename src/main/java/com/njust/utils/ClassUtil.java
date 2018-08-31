package com.njust.utils;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/**
 * <h6>Description:<h6>
 * <p>Java Class与反射相关的一些工具类</p>
 */
public final class ClassUtil {


    /**
     * 获取类加载器
     */
    public static ClassLoader overridenClassLoader;
    private static Logger logger = Logger.getLogger(ClassUtil.class);

    public static ClassLoader getContextClassLoader() {
        return overridenClassLoader != null ?
                overridenClassLoader : Thread.currentThread().getContextClassLoader();
    }

    /**
     * 获取指定类的全部属性字段
     *
     * @param className    需要获取的类名
     * @param extendsField 是否获取接口或父类中的公共属性
     * @return 属性字段数组
     */
    public final static String[] getField(String className, boolean extendsField) {
        Class classz = loadClass(className);
        Field[] fields = classz.getFields();
        Set<String> set = new HashSet<String>();
        if (fields != null) {
            for (Field f : fields) {
                set.add(f.getName());
            }
        }
        if (extendsField) {
            Field[] fieldz = classz.getDeclaredFields();
            if (fieldz != null) {
                for (Field f : fieldz) {
                    set.add(f.getName());
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

    /**
     * 获取类中的公共属性
     *
     * @param className    需要获取的类名
     * @param extendsField 是否获取接口或父类中的公共属性
     * @return 属性字段数组
     */
    public final static String[] getPublicField(String className, boolean extendsField) {
        Class classz = loadClass(className);
        Set<String> set = new HashSet<String>();
        Field[] fields = classz.getDeclaredFields();
        if (fields != null) {
            for (Field f : fields) {
                String modifier = Modifier.toString(f.getModifiers());
                if (modifier.startsWith("public")) {
                    set.add(f.getName());
                }
            }
        }
        if (extendsField) {
            Field[] fieldz = classz.getFields();
            if (fieldz != null) {
                for (Field f : fieldz) {
                    set.add(f.getName());
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

    /**
     * 获取类中定义的protected类型的属性字段
     *
     * @param className 需要获取的类名
     * @return protected类型的属性字段数组
     */
    public final static String[] getProtectedField(String className) {
        Class classz = loadClass(className);
        Set<String> set = new HashSet<String>();
        Field[] fields = classz.getDeclaredFields();
        if (fields != null) {
            for (Field f : fields) {
                String modifier = Modifier.toString(f.getModifiers());
                if (modifier.startsWith("protected")) {
                    set.add(f.getName());
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

    /**
     * 获取类中定义的private类型的属性字段
     *
     * @param className 需要获取的类名
     * @return private类型的属性字段数组
     */
    public final static String[] getPrivateField(String className) {
        Class classz = loadClass(className);
        Set<String> set = new HashSet<String>();
        Field[] fields = classz.getDeclaredFields();
        if (fields != null) {
            for (Field f : fields) {
                String modifier = Modifier.toString(f.getModifiers());
                if (modifier.startsWith("private")) {
                    set.add(f.getName());
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

    /**
     * 获取对象的全部public类型方法
     *
     * @param className     需要获取的类名
     * @param extendsMethod 是否获取继承来的方法
     * @return 方法名数组
     */
    public final static String[] getPublicMethod(String className, boolean extendsMethod) {
        Class classz = loadClass(className);
        Method[] methods;
        if (extendsMethod) {
            methods = classz.getMethods();
        } else {
            methods = classz.getDeclaredMethods();
        }
        Set<String> set = new HashSet<String>();
        if (methods != null) {
            for (Method f : methods) {
                String modifier = Modifier.toString(f.getModifiers());
                if (modifier.startsWith("public")) {
                    set.add(f.getName());
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }


    /**
     * 获取对象的全部protected类型方法
     *
     * @param className     需要获取的类名
     * @param extendsMethod 是否获取继承来的方法
     * @return 方法名数组
     */
    public final static String[] getProtectedMethod(String className, boolean extendsMethod) {
        Class classz = loadClass(className);
        Method[] methods;
        if (extendsMethod) {
            methods = classz.getMethods();
        } else {
            methods = classz.getDeclaredMethods();
        }
        Set<String> set = new HashSet<String>();
        if (methods != null) {
            for (Method f : methods) {
                String modifier = Modifier.toString(f.getModifiers());
                if (modifier.startsWith("protected")) {
                    set.add(f.getName());
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

    /**
     * 获取对象的全部private类型方法
     *
     * @param className 需要获取的类名
     * @return 方法名数组
     */
    public final static String[] getPrivateMethod(String className) {
        Class classz = loadClass(className);
        Method[] methods = classz.getDeclaredMethods();
        Set<String> set = new HashSet<String>();
        if (methods != null) {
            for (Method f : methods) {
                String modifier = Modifier.toString(f.getModifiers());
                if (modifier.startsWith("private")) {
                    set.add(f.getName());
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

    /**
     * 获取对象的全部方法
     *
     * @param className     需要获取的类名
     * @param extendsMethod 是否获取继承来的方法
     * @return 方法名数组
     */
    public final static String[] getMethod(String className, boolean extendsMethod) {
        Class classz = loadClass(className);
        Method[] methods;
        if (extendsMethod) {
            methods = classz.getMethods();
        } else {
            methods = classz.getDeclaredMethods();
        }
        Set<String> set = new HashSet<String>();
        if (methods != null) {
            for (Method f : methods) {
                set.add(f.getName());
            }
        }
        return set.toArray(new String[set.size()]);
    }


    /**
     * 调用对象的setter方法
     *
     * @param obj   对象
     * @param att   属性名
     * @param value 属性值
     * @param type  属性类型
     */
    public final static void setter(Object obj, String att, Object value, Class<?> type)
            throws InvocationTargetException, IllegalAccessException {
        try {
            String name = att.substring(0, 1).toUpperCase() + att.substring(1);
            Method met = obj.getClass().getMethod("set" + name, type);
            met.invoke(obj, value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }


    /**
     * 加载指定的类
     *
     * @param className 需要加载的类
     * @return 加载后的类
     */
    public final static Class loadClass(String className) {
        Class theClass = null;
        try {
            theClass = Class.forName(className);
        } catch (ClassNotFoundException e1) {
            logger.error("load class error:" + e1.getMessage());
            e1.printStackTrace();
        }
        return theClass;
    }

    /**
     * 获取一个类的父类
     *
     * @param className 需要获取的类
     * @return 父类的名称
     */
    public final static String getSuperClass(String className) {
        Class classz = loadClass(className);
        Class superclass = classz.getSuperclass();
        return superclass.getName();
    }
}
