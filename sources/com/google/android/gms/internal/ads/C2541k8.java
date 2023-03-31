package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2541k8 {

    /* renamed from: a */
    private String f11953a;

    /* renamed from: b */
    private Uri f11954b;

    /* renamed from: c */
    private final C2617ma f11955c = new C2617ma();

    /* renamed from: d */
    private final C2846sg f11956d = new C2846sg((C2808rf) null);

    /* renamed from: e */
    private final List f11957e = Collections.emptyList();

    /* renamed from: f */
    private final ua3 f11958f = ua3.m21508w();

    /* renamed from: g */
    private final C2960vj f11959g = new C2960vj();

    /* renamed from: h */
    private final C2338et f11960h = C2338et.f8916c;

    /* renamed from: a */
    public final C2541k8 mo11617a(String str) {
        this.f11953a = str;
        return this;
    }

    /* renamed from: b */
    public final C2541k8 mo11618b(Uri uri) {
        this.f11954b = uri;
        return this;
    }

    /* renamed from: c */
    public final C2453hw mo11619c() {
        Uri uri = this.f11954b;
        C2224bq bqVar = uri != null ? new C2224bq(uri, (String) null, (C2884th) null, (C2503j7) null, this.f11957e, (String) null, this.f11958f, (Object) null, (C2186ap) null) : null;
        String str = this.f11953a;
        if (str == null) {
            str = "";
        }
        return new C2453hw(str, new C2770qe(this.f11955c, (C2731pd) null), bqVar, new C3036xl(this.f11959g), m20.f13165v, this.f11960h, (C2415gv) null);
    }
}
