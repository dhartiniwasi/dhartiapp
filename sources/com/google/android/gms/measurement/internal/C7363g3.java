package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.g3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7363g3 {

    /* renamed from: a */
    public final String f32497a;

    /* renamed from: b */
    public final String f32498b;

    /* renamed from: c */
    public final long f32499c;

    /* renamed from: d */
    public final Bundle f32500d;

    public C7363g3(String str, String str2, Bundle bundle, long j) {
        this.f32497a = str;
        this.f32498b = str2;
        this.f32500d = bundle;
        this.f32499c = j;
    }

    /* renamed from: b */
    public static C7363g3 m41489b(C7524v vVar) {
        return new C7363g3(vVar.f33101a, vVar.f33103c, vVar.f33102b.mo24661K1(), vVar.f33104d);
    }

    /* renamed from: a */
    public final C7524v mo24270a() {
        return new C7524v(this.f32497a, new C7502t(new Bundle(this.f32500d)), this.f32498b, this.f32499c);
    }

    public final String toString() {
        String str = this.f32498b;
        String str2 = this.f32497a;
        String obj = this.f32500d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
