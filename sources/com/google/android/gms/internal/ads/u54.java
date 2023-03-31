package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u54 {

    /* renamed from: a */
    public final AudioAttributes f18394a;

    /* synthetic */ u54(w74 w74, t44 t44) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = gb2.f9812a;
        if (i >= 29) {
            to2.m21102a(usage, 1);
        }
        if (i >= 32) {
            wf3.m22745a(usage, 0);
        }
        this.f18394a = usage.build();
    }
}
