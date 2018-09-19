package com.abirami.java.generics;

public class C_GenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]){
        C_GenericsTypeOld type = new C_GenericsTypeOld();
        type.set(1);
        String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
    }
}

