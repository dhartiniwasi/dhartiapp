package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class v83 extends uc3 {

    /* renamed from: a */
    private Object f18975a;

    /* renamed from: b */
    private int f18976b = 2;

    protected v83() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo8716a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo14695c() {
        this.f18976b = 3;
        return null;
    }

    public final boolean hasNext() {
        b83.m10244h(this.f18976b != 4);
        int i = this.f18976b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.f18976b = 4;
                this.f18975a = mo8716a();
                if (this.f18976b != 3) {
                    this.f18976b = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f18976b = 2;
            Object obj = this.f18975a;
            this.f18975a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
