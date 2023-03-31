package com.startapp.sdk.ads.video.player;

/* compiled from: Sta */
public interface VideoPlayerInterface {

    /* compiled from: Sta */
    public enum VideoPlayerErrorType {
        UNKNOWN,
        SERVER_DIED,
        BUFFERING_TIMEOUT
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$a */
    /* compiled from: Sta */
    public interface C9370a {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$b */
    /* compiled from: Sta */
    public interface C9371b {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$c */
    /* compiled from: Sta */
    public interface C9372c {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$d */
    /* compiled from: Sta */
    public interface C9373d {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$e */
    /* compiled from: Sta */
    public static class C9374e {

        /* renamed from: a */
        public VideoPlayerErrorType f38557a;

        /* renamed from: b */
        public String f38558b;

        /* renamed from: c */
        public int f38559c;

        public C9374e(VideoPlayerErrorType videoPlayerErrorType, String str, int i) {
            this.f38557a = videoPlayerErrorType;
            this.f38558b = str;
            this.f38559c = i;
        }
    }
}
