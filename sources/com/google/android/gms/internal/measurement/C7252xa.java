package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7252xa implements C7044ka {

    /* renamed from: a */
    private final C7092na f32183a;

    /* renamed from: b */
    private final String f32184b;

    /* renamed from: c */
    private final Object[] f32185c;

    /* renamed from: d */
    private final int f32186d;

    C7252xa(C7092na naVar, String str, Object[] objArr) {
        this.f32183a = naVar;
        this.f32184b = str;
        this.f32185c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f32186d = charAt;
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
                this.f32186d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo23992a() {
        return this.f32184b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo23993b() {
        return this.f32185c;
    }

    /* renamed from: d */
    public final boolean mo23609d() {
        return (this.f32186d & 2) == 2;
    }

    /* renamed from: e */
    public final int mo23610e() {
        return (this.f32186d & 1) == 1 ? 1 : 2;
    }

    public final C7092na zza() {
        return this.f32183a;
    }
}
