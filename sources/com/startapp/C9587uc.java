package com.startapp;

import android.os.Handler;
import com.facebook.ads.AdError;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* renamed from: com.startapp.uc */
/* compiled from: Sta */
public class C9587uc implements Runnable {

    /* renamed from: a */
    public boolean f39264a;

    /* renamed from: b */
    public final int f39265b;

    /* renamed from: c */
    public final /* synthetic */ VideoMode f39266c;

    public C9587uc(VideoMode videoMode) {
        this.f39266c = videoMode;
        this.f39265b = videoMode.mo30324d(AdsCommonMetaData.m49636k().mo30445G().mo30584k());
    }

    public void run() {
        try {
            VideoPlayerInterface videoPlayerInterface = this.f39266c.f38446K;
            int currentPosition = videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition() : 0;
            int i = currentPosition + 50;
            long c = this.f39266c.mo30323c(i);
            long j = 0;
            int i2 = (c > 0 ? 1 : (c == 0 ? 0 : -1));
            if (i2 >= 0 && !this.f39264a) {
                if (i2 != 0) {
                    VideoMode videoMode = this.f39266c;
                    if (((long) videoMode.f38452Q) < videoMode.mo30327s()) {
                        C9605vb.m50458a(this.f39266c.f36834v, true, "videoApi.setSkipTimer", Long.valueOf(c));
                    }
                }
                this.f39264a = true;
                C9605vb.m50458a(this.f39266c.f36834v, true, "videoApi.setSkipTimer", 0);
            }
            VideoMode videoMode2 = this.f39266c;
            if (videoMode2.f38466e0 && currentPosition >= this.f39265b) {
                videoMode2.mo29409u();
            }
            int i3 = i / AdError.NETWORK_ERROR_CODE;
            C9605vb.m50458a(this.f39266c.f36834v, true, "videoApi.setVideoCurrentPosition", Integer.valueOf(i3));
            if (i3 < ((NativeVideoPlayer) this.f39266c.f38446K).f38543g.getDuration() / AdError.NETWORK_ERROR_CODE) {
                VideoMode videoMode3 = this.f39266c;
                Handler handler = videoMode3.f38474m0;
                VideoPlayerInterface videoPlayerInterface2 = videoMode3.f38446K;
                if (videoPlayerInterface2 != null) {
                    j = (long) (1000 - (((NativeVideoPlayer) videoPlayerInterface2).f38543g.getCurrentPosition() % AdError.NETWORK_ERROR_CODE));
                }
                handler.postDelayed(this, j);
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
