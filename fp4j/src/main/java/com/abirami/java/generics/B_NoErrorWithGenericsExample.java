package com.abirami.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sundaresan Krishnamurthy on 15/09/18.
 */
public class B_NoErrorWithGenericsExample {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(); // java 7 ? List<String> list1 = new ArrayList<>();
        list1.add("abc");
        //list1.add(new Integer(5)); //compiler error

        for(String str : list1){
            //no type casting needed, avoids ClassCastException
        }

    }
}
