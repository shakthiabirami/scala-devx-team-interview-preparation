package com.abirami.java.generics;

public class E_GenericsMethods {

    //Java Generic Method
    public static <T> boolean isEqual(D_GenericsType<T> g1, D_GenericsType<T> g2){
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]){
        D_GenericsType<String> g1 = new D_GenericsType<>();
        g1.set("Pankaj");

        D_GenericsType<String> g2 = new D_GenericsType<>();
        g2.set("Pankaj");

        boolean isEqual = E_GenericsMethods.<String>isEqual(g1, g2);
        //above statement can be written simply as
        isEqual = E_GenericsMethods.isEqual(g1, g2);
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed
    }
}
