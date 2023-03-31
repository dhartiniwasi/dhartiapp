package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dq0 {

    /* renamed from: h */
    public static final za4 f8358h = cp0.f7862a;

    /* renamed from: a */
    public Object f8359a;

    /* renamed from: b */
    public Object f8360b;

    /* renamed from: c */
    public int f8361c;

    /* renamed from: d */
    public long f8362d;

    /* renamed from: e */
    public long f8363e;

    /* renamed from: f */
    public boolean f8364f;

    /* renamed from: g */
    private r61 f8365g = r61.f16847d;

    /* renamed from: a */
    public final int mo9650a(int i) {
        return this.f8365g.mo13683a(i).f17977b;
    }

    /* renamed from: b */
    public final int mo9651b() {
        int i = this.f8365g.f16850a;
        return 0;
    }

    /* renamed from: c */
    public final int mo9652c(long j) {
        return -1;
    }

    /* renamed from: d */
    public final int mo9653d(long j) {
        return -1;
    }

    /* renamed from: e */
    public final int mo9654e(int i) {
        return this.f8365g.mo13683a(i).mo14293a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dq0.class.equals(obj.getClass())) {
            dq0 dq0 = (dq0) obj;
            return gb2.m13186t(this.f8359a, dq0.f8359a) && gb2.m13186t(this.f8360b, dq0.f8360b) && this.f8361c == dq0.f8361c && this.f8362d == dq0.f8362d && this.f8364f == dq0.f8364f && gb2.m13186t(this.f8365g, dq0.f8365g);
        }
    }

    /* renamed from: f */
    public final int mo9656f(int i, int i2) {
        return this.f8365g.mo13683a(i).mo14293a(i2);
    }

    /* renamed from: g */
    public final long mo9657g(int i, int i2) {
        tf0 a = this.f8365g.mo13683a(i);
        if (a.f17977b != -1) {
            return a.f17980e[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final long mo9658h(int i) {
        long j = this.f8365g.mo13683a(i).f17976a;
        return 0;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f8359a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + 217) * 31;
        Object obj2 = this.f8360b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = this.f8361c;
        long j = this.f8362d;
        return ((((((((i3 + i2) * 31) + i4) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.f8364f ? 1 : 0)) * 31) + this.f8365g.hashCode();
    }

    /* renamed from: i */
    public final long mo9660i() {
        long j = this.f8365g.f16851b;
        return 0;
    }

    /* renamed from: j */
    public final long mo9661j(int i) {
        long j = this.f8365g.mo13683a(i).f17981f;
        return 0;
    }

    /* renamed from: k */
    public final dq0 mo9662k(Object obj, Object obj2, int i, long j, long j2, r61 r61, boolean z) {
        this.f8359a = obj;
        this.f8360b = obj2;
        this.f8361c = 0;
        this.f8362d = j;
        this.f8363e = 0;
        this.f8365g = r61;
        this.f8364f = z;
        return this;
    }

    /* renamed from: l */
    public final boolean mo9663l(int i) {
        boolean z = this.f8365g.mo13683a(i).f17982g;
        return false;
    }
}
