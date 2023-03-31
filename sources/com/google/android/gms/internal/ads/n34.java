package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class n34 extends t34 {

    /* renamed from: a */
    final String f13839a;

    public n34(String str) {
        this.f13839a = str;
    }

    /* renamed from: a */
    public final void mo12523a(String str) {
        String str2 = this.f13839a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
