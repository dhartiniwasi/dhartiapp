package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* renamed from: com.startapp.cd */
/* compiled from: Sta */
public class C8895cd implements VideoPlayerInterface.C9370a {

    /* renamed from: a */
    public final /* synthetic */ VideoMode f36656a;

    public C8895cd(VideoMode videoMode) {
        this.f36656a = videoMode;
    }

    /* renamed from: a */
    public void mo29285a(int i) {
        VideoMode videoMode;
        VideoPlayerInterface videoPlayerInterface;
        VideoPlayerInterface videoPlayerInterface2 = this.f36656a.f38446K;
        int duration = videoPlayerInterface2 != null ? ((NativeVideoPlayer) videoPlayerInterface2).f38543g.getDuration() : 0;
        VideoMode videoMode2 = this.f36656a;
        if (videoMode2.f38466e0 && videoMode2.f38467f0 && duration > 0) {
            videoMode2.f38465d0 = i;
            int currentPosition = (((NativeVideoPlayer) videoMode2.f38446K).f38543g.getCurrentPosition() * 100) / duration;
            if (this.f36656a.mo30302F()) {
                VideoMode videoMode3 = this.f36656a;
                if (videoMode3.f38468g0 || !videoMode3.mo30300D()) {
                    int i2 = this.f36656a.f38465d0;
                    if (i2 == 100 || i2 - currentPosition > AdsCommonMetaData.f38625h.mo30445G().mo30580h()) {
                        VideoMode videoMode4 = this.f36656a;
                        videoMode4.mo30311O();
                        videoMode4.mo30313Q();
                        return;
                    }
                    return;
                }
                this.f36656a.mo30312P();
                return;
            }
            int i3 = this.f36656a.f38465d0;
            if (i3 < 100 && i3 - currentPosition <= AdsCommonMetaData.f38625h.mo30445G().mo30582i() && (videoPlayerInterface = videoMode.f38446K) != null) {
                ((NativeVideoPlayer) videoPlayerInterface).f38543g.pause();
                (videoMode = this.f36656a).mo30310N();
            }
        }
    }
}
