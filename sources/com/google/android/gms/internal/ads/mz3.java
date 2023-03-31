package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class mz3 implements zy3 {

    /* renamed from: a */
    private final cz3 f13734a;

    /* renamed from: b */
    private final String f13735b;

    /* renamed from: c */
    private final Object[] f13736c;

    /* renamed from: d */
    private final int f13737d;

    mz3(cz3 cz3, String str, Object[] objArr) {
        this.f13734a = cz3;
        this.f13735b = str;
        this.f13736c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13737d = charAt;
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
                this.f13737d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo12472a() {
        return this.f13735b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo12473b() {
        return this.f13736c;
    }

    /* renamed from: d */
    public final boolean mo11550d() {
        return (this.f13737d & 2) == 2;
    }

    /* renamed from: e */
    public final int mo11551e() {
        return (this.f13737d & 1) == 1 ? 1 : 2;
    }

    public final cz3 zza() {
        return this.f13734a;
    }
}
