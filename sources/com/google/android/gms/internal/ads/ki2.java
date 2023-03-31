package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ki2 implements sj2 {

    /* renamed from: a */
    private final String f12112a;

    /* renamed from: b */
    private final String f12113b;

    public ki2(String str, String str2) {
        this.f12112a = str;
        this.f12113b = str2;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14494Z5)).booleanValue()) {
            bundle.putString("request_id", this.f12113b);
        } else {
            bundle.putString("request_id", this.f12112a);
        }
    }
}
