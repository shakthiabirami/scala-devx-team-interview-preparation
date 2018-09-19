package com.abirami.java.generics;


public class D_GenericsType<T> {

    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        D_GenericsType<String> type = new D_GenericsType<>();
        type.set("Pankaj"); //valid
        D_GenericsType type1 = new D_GenericsType(); //raw type
        type1.set("Pankaj"); //valid
        System.out.println(type1.get());
        type1.set(10); //valid and autoboxing support
        System.out.println(type1.get());

    }
}
