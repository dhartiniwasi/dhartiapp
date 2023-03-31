package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p060h4.C4596v;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s82 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4691e f17299a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final t82 f17300b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final rz2 f17301c;

    /* renamed from: d */
    private final List f17302d = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f17303e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final i52 f17304f;

    public s82(C4691e eVar, t82 t82, i52 i52, rz2 rz2) {
        this.f17299a = eVar;
        this.f17300b = t82;
        this.f17303e = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14458V5)).booleanValue();
        this.f17304f = i52;
        this.f17301c = rz2;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m20199g(s82 s82, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14699u1)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        s82.f17302d.add(str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final lf3 mo13960e(us2 us2, is2 is2, lf3 lf3, nz2 nz2) {
        ls2 ls2 = us2.f18723b.f18244b;
        long b = this.f17299a.mo18371b();
        String str = is2.f11007x;
        if (str != null) {
            cf3.m10920r(lf3, new r82(this, b, str, is2, ls2, nz2, us2), dn0.f8330f);
        }
        return lf3;
    }

    /* renamed from: f */
    public final String mo13961f() {
        return TextUtils.join("_", this.f17302d);
    }
}
