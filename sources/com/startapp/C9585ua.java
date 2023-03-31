package com.startapp;

import android.os.Build;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.startapp.ua */
/* compiled from: Sta */
public class C9585ua implements Iterator<Throwable> {

    /* renamed from: a */
    public Throwable f39257a;

    /* renamed from: b */
    public Throwable[] f39258b;

    /* renamed from: c */
    public int f39259c;

    /* renamed from: d */
    public boolean f39260d;

    public C9585ua(Throwable th) {
        this.f39257a = th;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f39258b = th.getSuppressed();
        }
    }

    /* renamed from: a */
    public Throwable next() {
        int i;
        Throwable th = this.f39257a;
        boolean z = false;
        this.f39260d = false;
        if (th != null) {
            this.f39257a = th.getCause();
        } else {
            Throwable[] thArr = this.f39258b;
            if (thArr != null && (i = this.f39259c) < thArr.length) {
                if (i == 0) {
                    z = true;
                }
                this.f39260d = z;
                this.f39259c = i + 1;
                th = thArr[i];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f39258b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r2 = this;
            java.lang.Throwable r0 = r2.f39257a
            if (r0 != 0) goto L_0x0010
            java.lang.Throwable[] r0 = r2.f39258b
            if (r0 == 0) goto L_0x000e
            int r1 = r2.f39259c
            int r0 = r0.length
            if (r1 >= r0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9585ua.hasNext():boolean");
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
