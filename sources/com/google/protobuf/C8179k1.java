package com.google.protobuf;

/* renamed from: com.google.protobuf.k1 */
/* compiled from: RawMessageInfo */
final class C8179k1 implements C8233t0 {

    /* renamed from: a */
    private final C8243v0 f34988a;

    /* renamed from: b */
    private final String f34989b;

    /* renamed from: c */
    private final Object[] f34990c;

    /* renamed from: d */
    private final int f34991d;

    C8179k1(C8243v0 v0Var, String str, Object[] objArr) {
        this.f34988a = v0Var;
        this.f34989b = str;
        this.f34990c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f34991d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f34991d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo27085a() {
        return (this.f34991d & 2) == 2;
    }

    /* renamed from: b */
    public C8243v0 mo27086b() {
        return this.f34988a;
    }

    /* renamed from: c */
    public C8152h1 mo27087c() {
        return (this.f34991d & 1) == 1 ? C8152h1.PROTO2 : C8152h1.PROTO3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo27088d() {
        return this.f34990c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo27089e() {
        return this.f34989b;
    }
}
