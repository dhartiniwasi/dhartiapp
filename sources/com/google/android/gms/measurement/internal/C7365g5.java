package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7083n1;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7365g5 {

    /* renamed from: a */
    final Context f32505a;

    /* renamed from: b */
    String f32506b;

    /* renamed from: c */
    String f32507c;

    /* renamed from: d */
    String f32508d;

    /* renamed from: e */
    Boolean f32509e;

    /* renamed from: f */
    long f32510f;

    /* renamed from: g */
    C7083n1 f32511g;

    /* renamed from: h */
    boolean f32512h = true;

    /* renamed from: i */
    final Long f32513i;

    /* renamed from: j */
    String f32514j;

    public C7365g5(Context context, C7083n1 n1Var, Long l) {
        C4141r.m28221k(context);
        Context applicationContext = context.getApplicationContext();
        C4141r.m28221k(applicationContext);
        this.f32505a = applicationContext;
        this.f32513i = l;
        if (n1Var != null) {
            this.f32511g = n1Var;
            this.f32506b = n1Var.f31905f;
            this.f32507c = n1Var.f31904e;
            this.f32508d = n1Var.f31903d;
            this.f32512h = n1Var.f31902c;
            this.f32510f = n1Var.f31901b;
            this.f32514j = n1Var.f31907h;
            Bundle bundle = n1Var.f31906g;
            if (bundle != null) {
                this.f32509e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
