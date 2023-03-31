package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7264y6 {

    /* renamed from: a */
    final String f32202a;

    /* renamed from: b */
    final Uri f32203b;

    /* renamed from: c */
    final String f32204c;

    /* renamed from: d */
    final String f32205d;

    /* renamed from: e */
    final boolean f32206e;

    /* renamed from: f */
    final boolean f32207f;

    /* renamed from: g */
    final boolean f32208g;

    /* renamed from: h */
    final boolean f32209h;

    /* renamed from: i */
    final C6976g7 f32210i;

    public C7264y6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C6976g7) null);
    }

    private C7264y6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, C6976g7 g7Var) {
        this.f32202a = null;
        this.f32203b = uri;
        this.f32204c = "";
        this.f32205d = "";
        this.f32206e = z;
        this.f32207f = false;
        this.f32208g = z3;
        this.f32209h = false;
        this.f32210i = null;
    }

    /* renamed from: a */
    public final C7264y6 mo24015a() {
        return new C7264y6((String) null, this.f32203b, this.f32204c, this.f32205d, this.f32206e, false, true, false, (C6976g7) null);
    }

    /* renamed from: b */
    public final C7264y6 mo24016b() {
        if (this.f32204c.isEmpty()) {
            return new C7264y6((String) null, this.f32203b, this.f32204c, this.f32205d, true, false, this.f32208g, false, (C6976g7) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final C6908c7 mo24017c(String str, double d) {
        return new C7232w6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final C6908c7 mo24018d(String str, long j) {
        return new C7200u6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final C6908c7 mo24019e(String str, String str2) {
        return new C7248x6(this, str, str2, true);
    }

    /* renamed from: f */
    public final C6908c7 mo24020f(String str, boolean z) {
        return new C7216v6(this, str, Boolean.valueOf(z), true);
    }
}
