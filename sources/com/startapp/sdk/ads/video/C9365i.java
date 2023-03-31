package com.startapp.sdk.ads.video;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* renamed from: com.startapp.sdk.ads.video.i */
/* compiled from: Sta */
public class C9365i implements VideoPlayerInterface.C9371b {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f38534a;

    public C9365i(VideoMode videoMode) {
        this.f38534a = videoMode;
    }

    /* renamed from: a */
    public void mo30351a() {
        if (!this.f38534a.mo30304H()) {
            this.f38534a.mo30317a(VideoMode.VideoFinishedReason.COMPLETE);
        }
        VideoPlayerInterface videoPlayerInterface = this.f38534a.f38446K;
        if (videoPlayerInterface != null) {
            ((NativeVideoPlayer) videoPlayerInterface).f38543g.stopPlayback();
        }
    }
}
