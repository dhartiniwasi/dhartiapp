package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7469q {

    /* renamed from: a */
    final String f32875a;

    /* renamed from: b */
    final String f32876b;

    /* renamed from: c */
    final String f32877c;

    /* renamed from: d */
    final long f32878d;

    /* renamed from: e */
    final long f32879e;

    /* renamed from: f */
    final C7502t f32880f;

    C7469q(C7397j4 j4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C7502t tVar;
        C4141r.m28217g(str2);
        C4141r.m28217g(str3);
        this.f32875a = str2;
        this.f32876b = str3;
        this.f32877c = true == TextUtils.isEmpty(str) ? null : str;
        this.f32878d = j;
        this.f32879e = j2;
        if (j2 != 0 && j2 > j) {
            j4Var.mo24135l().mo24261w().mo24209b("Event created with reverse previous/current timestamps. appId", C7352f3.m41475z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new C7502t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    j4Var.mo24135l().mo24256q().mo24208a("Param name can't be null");
                    it.remove();
                } else {
                    Object n = j4Var.mo24423N().mo24392n(str4, bundle2.get(str4));
                    if (n == null) {
                        j4Var.mo24135l().mo24261w().mo24209b("Param value can't be null", j4Var.mo24414D().mo24096e(str4));
                        it.remove();
                    } else {
                        j4Var.mo24423N().mo24366C(bundle2, str4, n);
                    }
                }
            }
            tVar = new C7502t(bundle2);
        }
        this.f32880f = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C7469q mo24615a(C7397j4 j4Var, long j) {
        return new C7469q(j4Var, this.f32877c, this.f32875a, this.f32876b, this.f32878d, j, this.f32880f);
    }

    public final String toString() {
        String str = this.f32875a;
        String str2 = this.f32876b;
        String obj = this.f32880f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    private C7469q(C7397j4 j4Var, String str, String str2, String str3, long j, long j2, C7502t tVar) {
        C4141r.m28217g(str2);
        C4141r.m28217g(str3);
        C4141r.m28221k(tVar);
        this.f32875a = str2;
        this.f32876b = str3;
        this.f32877c = true == TextUtils.isEmpty(str) ? null : str;
        this.f32878d = j;
        this.f32879e = j2;
        if (j2 != 0 && j2 > j) {
            j4Var.mo24135l().mo24261w().mo24210c("Event created with reverse previous/current timestamps. appId, name", C7352f3.m41475z(str2), C7352f3.m41475z(str3));
        }
        this.f32880f = tVar;
    }
}
