package com.startapp;

import android.os.Handler;
import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.tc */
/* compiled from: Sta */
public class C9568tc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f39215a;

    public C9568tc(VideoMode videoMode) {
        this.f39215a = videoMode;
    }

    public void run() {
        int M = this.f39215a.mo30309M();
        if (M >= 1000) {
            Handler handler = this.f39215a.f38474m0;
            long j = 1000;
            long j2 = ((long) M) % 1000;
            if (j2 != 0) {
                j = j2;
            }
            handler.postDelayed(this, j + 50);
        }
    }
}
