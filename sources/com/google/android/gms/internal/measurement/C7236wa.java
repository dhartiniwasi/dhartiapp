package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.wa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7236wa extends C7137q7 implements RandomAccess {

    /* renamed from: d */
    private static final C7236wa f32169d;

    /* renamed from: b */
    private Object[] f32170b;

    /* renamed from: c */
    private int f32171c;

    static {
        C7236wa waVar = new C7236wa(new Object[0], 0);
        f32169d = waVar;
        waVar.mo23697d();
    }

    private C7236wa(Object[] objArr, int i) {
        this.f32170b = objArr;
        this.f32171c = i;
    }

    /* renamed from: c */
    public static C7236wa m41066c() {
        return f32169d;
    }

    /* renamed from: f */
    private final String m41067f(int i) {
        int i2 = this.f32171c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m41068i(int i) {
        if (i < 0 || i >= this.f32171c) {
            throw new IndexOutOfBoundsException(m41067f(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo23768b();
        if (i < 0 || i > (i2 = this.f32171c)) {
            throw new IndexOutOfBoundsException(m41067f(i));
        }
        Object[] objArr = this.f32170b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f32170b, i, objArr2, i + 1, this.f32171c - i);
            this.f32170b = objArr2;
        }
        this.f32170b[i] = obj;
        this.f32171c++;
        this.modCount++;
    }

    public final Object get(int i) {
        m41068i(i);
        return this.f32170b[i];
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C7091n9 mo23012h(int i) {
        if (i >= this.f32171c) {
            return new C7236wa(Arrays.copyOf(this.f32170b, i), this.f32171c);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i) {
        mo23768b();
        m41068i(i);
        Object[] objArr = this.f32170b;
        Object obj = objArr[i];
        int i2 = this.f32171c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f32171c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo23768b();
        m41068i(i);
        Object[] objArr = this.f32170b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f32171c;
    }

    public final boolean add(Object obj) {
        mo23768b();
        int i = this.f32171c;
        Object[] objArr = this.f32170b;
        if (i == objArr.length) {
            this.f32170b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f32170b;
        int i2 = this.f32171c;
        this.f32171c = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
