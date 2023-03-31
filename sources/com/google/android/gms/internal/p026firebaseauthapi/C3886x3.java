package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3886x3 extends C3654q0 implements RandomAccess {

    /* renamed from: d */
    private static final C3886x3 f22901d;

    /* renamed from: b */
    private Object[] f22902b;

    /* renamed from: c */
    private int f22903c;

    static {
        C3886x3 x3Var = new C3886x3(new Object[0], 0);
        f22901d = x3Var;
        x3Var.mo16475d();
    }

    private C3886x3(Object[] objArr, int i) {
        this.f22902b = objArr;
        this.f22903c = i;
    }

    /* renamed from: c */
    public static C3886x3 m27348c() {
        return f22901d;
    }

    /* renamed from: f */
    private final String m27349f(int i) {
        int i2 = this.f22903c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m27350i(int i) {
        if (i < 0 || i >= this.f22903c) {
            throw new IndexOutOfBoundsException(m27349f(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo16587b();
        if (i < 0 || i > (i2 = this.f22903c)) {
            throw new IndexOutOfBoundsException(m27349f(i));
        }
        Object[] objArr = this.f22902b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f22902b, i, objArr2, i + 1, this.f22903c - i);
            this.f22902b = objArr2;
        }
        this.f22902b[i] = obj;
        this.f22903c++;
        this.modCount++;
    }

    public final Object get(int i) {
        m27350i(i);
        return this.f22902b[i];
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3590o2 mo15892h(int i) {
        if (i >= this.f22903c) {
            return new C3886x3(Arrays.copyOf(this.f22902b, i), this.f22903c);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i) {
        mo16587b();
        m27350i(i);
        Object[] objArr = this.f22902b;
        Object obj = objArr[i];
        int i2 = this.f22903c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f22903c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo16587b();
        m27350i(i);
        Object[] objArr = this.f22902b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f22903c;
    }

    public final boolean add(Object obj) {
        mo16587b();
        int i = this.f22903c;
        Object[] objArr = this.f22902b;
        if (i == objArr.length) {
            this.f22902b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f22902b;
        int i2 = this.f22903c;
        this.f22903c = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
