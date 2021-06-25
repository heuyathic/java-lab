package com.heuyathic.javalab.effective;

public class StaticFactoryMethod {

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
