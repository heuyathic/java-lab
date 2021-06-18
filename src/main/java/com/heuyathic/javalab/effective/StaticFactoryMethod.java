package com.heuyathic.javalab;

public class StaticFactoryMethod {

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
