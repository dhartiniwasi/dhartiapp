package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.d0 */
/* compiled from: Internal */
public final class C8119d0 {

    /* renamed from: a */
    static final Charset f34854a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f34855b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f34856c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f34857d;

    /* renamed from: e */
    public static final ByteBuffer f34858e;

    /* renamed from: f */
    public static final C8167j f34859f;

    /* renamed from: com.google.protobuf.d0$a */
    /* compiled from: Internal */
    public interface C8120a extends C8130j<Boolean> {
    }

    /* renamed from: com.google.protobuf.d0$b */
    /* compiled from: Internal */
    public interface C8121b extends C8130j<Double> {
    }

    /* renamed from: com.google.protobuf.d0$c */
    /* compiled from: Internal */
    public interface C8122c {
        /* renamed from: f */
        int mo26872f();
    }

    /* renamed from: com.google.protobuf.d0$d */
    /* compiled from: Internal */
    public interface C8123d<T extends C8122c> {
        /* renamed from: a */
        T mo26873a(int i);
    }

    /* renamed from: com.google.protobuf.d0$e */
    /* compiled from: Internal */
    public interface C8124e {
        /* renamed from: a */
        boolean mo26874a(int i);
    }

    /* renamed from: com.google.protobuf.d0$f */
    /* compiled from: Internal */
    public interface C8125f extends C8130j<Float> {
    }

    /* renamed from: com.google.protobuf.d0$g */
    /* compiled from: Internal */
    public interface C8126g extends C8130j<Integer> {
        /* renamed from: S */
        void mo26815S(int i);

        /* renamed from: m */
        C8126g mo26823m(int i);
    }

    /* renamed from: com.google.protobuf.d0$h */
    /* compiled from: Internal */
    public static class C8127h<F, T> extends AbstractList<T> {

        /* renamed from: a */
        private final List<F> f34860a;

        /* renamed from: b */
        private final C8128a<F, T> f34861b;

        /* renamed from: com.google.protobuf.d0$h$a */
        /* compiled from: Internal */
        public interface C8128a<F, T> {
            /* renamed from: a */
            T mo26877a(F f);
        }

        public C8127h(List<F> list, C8128a<F, T> aVar) {
            this.f34860a = list;
            this.f34861b = aVar;
        }

        public T get(int i) {
            return this.f34861b.mo26877a(this.f34860a.get(i));
        }

        public int size() {
            return this.f34860a.size();
        }
    }

    /* renamed from: com.google.protobuf.d0$i */
    /* compiled from: Internal */
    public interface C8129i extends C8130j<Long> {
    }

    /* renamed from: com.google.protobuf.d0$j */
    /* compiled from: Internal */
    public interface C8130j<E> extends List<E>, RandomAccess {
        /* renamed from: F1 */
        boolean mo26802F1();

        /* renamed from: H */
        void mo26803H();

        /* renamed from: m */
        C8130j<E> mo26823m(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f34857d = bArr;
        f34858e = ByteBuffer.wrap(bArr);
        f34859f = C8167j.m44845j(bArr);
    }

    /* renamed from: a */
    static <T> T m44649a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    static <T> T m44650b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static int m44651c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m44652d(byte[] bArr) {
        return m44653e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m44653e(byte[] bArr, int i, int i2) {
        int i3 = m44657i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m44654f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m44655g(byte[] bArr) {
        return C8094a2.m44517s(bArr);
    }

    /* renamed from: h */
    static Object m44656h(Object obj, Object obj2) {
        return ((C8243v0) obj).mo27317b().mo26778M0((C8243v0) obj2).mo27323U0();
    }

    /* renamed from: i */
    static int m44657i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m44658j(byte[] bArr) {
        return new String(bArr, f34855b);
    }
}
