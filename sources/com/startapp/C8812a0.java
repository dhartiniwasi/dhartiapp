package com.startapp;

import android.view.View;
import com.startapp.C8837b0;
import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.a0 */
/* compiled from: Sta */
public class C8812a0 implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C8837b0.C8839b f36372a;

    public C8812a0(C8837b0.C8839b bVar) {
        this.f36372a = bVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C8934ed edVar = (C8934ed) this.f36372a;
        VideoMode videoMode = edVar.f36739a;
        videoMode.f38457V = true;
        if (videoMode.f38456U && videoMode.mo30301E()) {
            edVar.f36739a.mo30298B();
        }
    }
}
