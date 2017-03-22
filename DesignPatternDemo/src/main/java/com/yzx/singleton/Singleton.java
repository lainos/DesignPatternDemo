package com.yzx.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by laino on 2017/3/22.
 */

public class Singleton {
    // 懒汉式
//    private static Singleton instance;
//
//    private Singleton() {
//    }
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /**
     * 饿汉式
     */
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }

    /**
     * 双重检查锁定（Double Check Lock）实现单例
     */
//    public class DCLSingleton {
//        // JDK1.5后的版本才可使用volatile关键字，保证sInstance对象每次都从主内存中读取
//        private volatile static DCLSingleton sInstance = null;
//
//        private DCLSingleton() {
//        }
//
//        public static DCLSingleton getInstance() {
//            if (sInstance == null) {
//                synchronized (DCLSingleton.class) {
//                    if (sInstance == null) {
//                        sInstance = new DCLSingleton();
//                    }
//                }
//            }
//            return sInstance;
//        }
//    }

    /**
     * 静态内部类单例模式
     */
//    public static class SingletonSeralizable implements Serializable {
//        private SingletonSeralizable() {
//        }
//
//        public static SingletonSeralizable getInstance() {
//            return SingletonHolder.sInstance;
//        }
//
//        /**
//         * 静态内部类
//         */
//        private static class SingletonHolder {
//            private static final SingletonSeralizable sInstance = new SingletonSeralizable();
//        }
//
//        /**
//         * 为了杜绝对象在反序列化时重新生成对象，则重写Serializable的私有方法
//         *
//         * @return
//         * @throws ObjectStreamException
//         */
//        private Object readResolve() throws ObjectStreamException {
//            return SingletonHolder.sInstance;
//        }
//
//    }

    /**
     * 枚举单例
     */
//    public enum SingletonEnum {
//        INSTANCE;
//
//        public void doSomething() {
//            System.out.println("do sth.");
//        }
//    }

    /**
     * 容器实现单例
     */
//    public class SingletonManager {
//        private static Map<String, Object> objMap = new HashMap<String, Object>();
//
//        private SingletonManager() {
//        }
//
//        ;
//
//        public static void registerService(String key, Object instance) {
//            if (!objMap.containsKey(key)) {
//                objMap.put(key, instance);
//            }
//        }
//
//        public static Object getService(String key) {
//            return objMap.get(key);
//        }
//    }
}
