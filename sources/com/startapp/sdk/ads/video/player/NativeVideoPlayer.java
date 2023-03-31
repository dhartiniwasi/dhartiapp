package com.startapp.sdk.ads.video.player;

import android.media.MediaPlayer;
import android.widget.VideoView;
import com.startapp.C8865bd;
import com.startapp.C8895cd;
import com.startapp.C8918dd;
import com.startapp.C9023i4;
import com.startapp.sdk.ads.video.C9358d;
import com.startapp.sdk.ads.video.C9365i;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.C9396a;

/* compiled from: Sta */
public class NativeVideoPlayer extends C9375a implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* renamed from: f */
    public MediaPlayer f38542f;

    /* renamed from: g */
    public final VideoView f38543g;

    /* compiled from: Sta */
    public enum MediaErrorExtra {
        MEDIA_ERROR_IO,
        MEDIA_ERROR_MALFORMED,
        MEDIA_ERROR_UNSUPPORTED,
        MEDIA_ERROR_TIMED_OUT
    }

    /* compiled from: Sta */
    public enum MediaErrorType {
        MEDIA_ERROR_UNKNOWN,
        MEDIA_ERROR_SERVER_DIED
    }

    /* renamed from: com.startapp.sdk.ads.video.player.NativeVideoPlayer$a */
    /* compiled from: Sta */
    public class C9369a implements MediaPlayer.OnBufferingUpdateListener {
        public C9369a() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            VideoPlayerInterface.C9370a aVar = NativeVideoPlayer.this.f38564e;
            if (aVar != null) {
                ((C8895cd) aVar).mo29285a(i);
            }
        }
    }

    public NativeVideoPlayer(VideoView videoView) {
        this.f38543g = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    /* renamed from: a */
    public void mo30354a(String str) {
        this.f38560a = str;
        if (str != null) {
            try {
                this.f38543g.setVideoPath(str);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                onError(this.f38542f, 1, 0);
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoPlayerInterface.C9371b bVar = this.f38563d;
        if (bVar != null) {
            ((C9365i) bVar).mo30351a();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        MediaErrorType mediaErrorType;
        VideoPlayerInterface.VideoPlayerErrorType videoPlayerErrorType;
        MediaErrorExtra mediaErrorExtra;
        if (this.f38562c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        VideoPlayerInterface.C9372c cVar = this.f38562c;
        if (i == 100) {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_SERVER_DIED;
        } else {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_UNKNOWN;
        }
        if (mediaErrorType == MediaErrorType.MEDIA_ERROR_SERVER_DIED) {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.SERVER_DIED;
        } else {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.UNKNOWN;
        }
        if (i2 == -1010) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED;
        } else if (i2 == -1007) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_MALFORMED;
        } else if (i2 != -110) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_IO;
        } else {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_TIMED_OUT;
        }
        String str = mediaErrorExtra.toString();
        VideoPlayerInterface.C9374e eVar = new VideoPlayerInterface.C9374e(videoPlayerErrorType, str, currentPosition);
        C8918dd ddVar = (C8918dd) cVar;
        VideoMode videoMode = ddVar.f36705a;
        if (videoMode.f38446K != null) {
            videoMode.f38467f0 = false;
            if (!videoMode.f38466e0 || videoMode.f38470i0 > videoMode.f38471j0 || currentPosition <= 0 || !str.equals("MEDIA_ERROR_IO")) {
                ddVar.f36705a.mo30318a(eVar);
            } else {
                VideoMode videoMode2 = ddVar.f36705a;
                videoMode2.f38470i0++;
                videoMode2.mo30310N();
                VideoMode videoMode3 = ddVar.f36705a;
                ((NativeVideoPlayer) videoMode3.f38446K).mo30354a(videoMode3.mo30329y().mo30278c());
                ((NativeVideoPlayer) ddVar.f36705a.f38446K).f38543g.seekTo(eVar.f38559c);
            }
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        this.f38542f = mediaPlayer;
        VideoPlayerInterface.C9373d dVar = this.f38561b;
        if (dVar != null) {
            C8865bd bdVar = (C8865bd) dVar;
            VideoMode videoMode = bdVar.f36549a;
            videoMode.f38467f0 = true;
            if (videoMode.f38456U && videoMode.f38457V) {
                videoMode.mo30298B();
            }
            if (bdVar.f36549a.mo30300D()) {
                bdVar.f36549a.mo30312P();
            }
        }
        if (C9396a.m49797c(this.f38560a) && (mediaPlayer2 = this.f38542f) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new C9369a());
        } else if (!C9396a.m49797c(this.f38560a)) {
            C9358d.C9360b.f38520a.f38518b = this.f38564e;
        }
    }

    /* renamed from: a */
    public boolean mo30355a() {
        return this.f38542f != null;
    }
}
