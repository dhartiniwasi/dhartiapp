package com.google.protobuf;

import com.google.protobuf.C8119d0;

/* renamed from: com.google.protobuf.e1 */
/* compiled from: NullValue */
public enum C8137e1 implements C8119d0.C8122c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private static final C8119d0.C8123d<C8137e1> f34868d = null;

    /* renamed from: a */
    private final int f34870a;

    /* renamed from: com.google.protobuf.e1$a */
    /* compiled from: NullValue */
    static class C8138a implements C8119d0.C8123d<C8137e1> {
        C8138a() {
        }

        /* renamed from: b */
        public C8137e1 mo26873a(int i) {
            return C8137e1.m44696a(i);
        }
    }

    static {
        f34868d = new C8138a();
    }

    private C8137e1(int i) {
        this.f34870a = i;
    }

    /* renamed from: a */
    public static C8137e1 m44696a(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    /* renamed from: f */
    public final int mo26872f() {
        if (this != UNRECOGNIZED) {
            return this.f34870a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
