package com.startapp;

import com.startapp.sdk.ads.video.C9358d;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* renamed from: com.startapp.h8 */
/* compiled from: Sta */
public class C9005h8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36912a;

    /* renamed from: b */
    public final /* synthetic */ C9358d f36913b;

    public C9005h8(C9358d dVar, int i) {
        this.f36913b = dVar;
        this.f36912a = i;
    }

    public void run() {
        VideoPlayerInterface.C9370a aVar = this.f36913b.f38518b;
        if (aVar != null) {
            ((C8895cd) aVar).mo29285a(this.f36912a);
        }
    }
}
