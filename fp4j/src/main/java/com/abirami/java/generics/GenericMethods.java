package com.abirami.java.generics;


public class GenericMethods {
    public static <T> boolean  isEqual(D_GenericsType<T> p1, D_GenericsType<T> p2){
        return p1.get().equals(p2.get());

    }

    public static void main(String[] args) {
        GenericMethods.<String> isEqual(new D_GenericsType<String>(),
                new D_GenericsType<String>());

        GenericMethods.isEqual(new D_GenericsType<String>(),
                new D_GenericsType<String>());
    }
}
