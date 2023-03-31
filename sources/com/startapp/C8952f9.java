package com.startapp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;

/* renamed from: com.startapp.f9 */
/* compiled from: Sta */
public class C8952f9<V> implements Callable<V> {

    /* renamed from: a */
    private final Callable<V> f36780a;

    public C8952f9(Callable<V> callable) {
        this.f36780a = callable;
    }

    /* renamed from: a */
    public static <T> Collection<? extends Callable<T>> m48583a(Collection<? extends Callable<T>> collection) {
        LinkedList linkedList = new LinkedList();
        for (Callable f9Var : collection) {
            linkedList.add(new C8952f9(f9Var));
        }
        return linkedList;
    }

    public V call() {
        try {
            return this.f36780a.call();
        } catch (Throwable th) {
            C9632x2.m50513c(th);
            return null;
        }
    }
}
