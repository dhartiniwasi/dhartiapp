package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p035e0.C4171a;
import p402y5.C13032j;
import p402y5.C13033k;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementReceiver extends C4171a implements C13032j {

    /* renamed from: c */
    private C13033k f32296c;

    /* renamed from: a */
    public void mo24066a(Context context, Intent intent) {
        C4171a.m28288c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f32296c == null) {
            this.f32296c = new C13033k(this);
        }
        this.f32296c.mo38079a(context, intent);
    }
}
