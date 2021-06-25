package com.heuyathic.javalab.concurrency;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }
}
