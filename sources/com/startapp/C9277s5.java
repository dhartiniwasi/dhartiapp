package com.startapp;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.s5 */
/* compiled from: Sta */
public class C9277s5<T> {

    /* renamed from: a */
    public volatile C8908d3<Object> f38192a;

    /* renamed from: b */
    public volatile AtomicReference<Object> f38193b;

    public C9277s5(C8908d3<T> d3Var) {
        this.f38192a = d3Var;
    }

    /* renamed from: a */
    public T mo29904a() {
        AtomicReference<Object> atomicReference = this.f38193b;
        if (atomicReference == null) {
            synchronized (this) {
                atomicReference = this.f38193b;
                if (atomicReference == null) {
                    C8908d3<Object> d3Var = this.f38192a;
                    Object obj = null;
                    this.f38192a = null;
                    if (d3Var != null) {
                        obj = d3Var.call();
                    }
                    AtomicReference<Object> atomicReference2 = new AtomicReference<>(obj);
                    this.f38193b = atomicReference2;
                    atomicReference = atomicReference2;
                }
            }
        }
        T t = atomicReference.get();
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }
}
