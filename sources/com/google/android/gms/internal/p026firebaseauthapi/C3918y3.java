package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3918y3 implements C3492l3 {

    /* renamed from: a */
    private final C3591o3 f22944a;

    /* renamed from: b */
    private final String f22945b;

    /* renamed from: c */
    private final Object[] f22946c;

    /* renamed from: d */
    private final int f22947d;

    C3918y3(C3591o3 o3Var, String str, Object[] objArr) {
        this.f22944a = o3Var;
        this.f22945b = str;
        this.f22946c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f22947d = charAt;
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
                this.f22947d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo17068a() {
        return this.f22945b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo17069b() {
        return this.f22946c;
    }

    /* renamed from: d */
    public final boolean mo16322d() {
        return (this.f22947d & 2) == 2;
    }

    /* renamed from: e */
    public final int mo16323e() {
        return (this.f22947d & 1) == 1 ? 1 : 2;
    }

    public final C3591o3 zza() {
        return this.f22944a;
    }
}
