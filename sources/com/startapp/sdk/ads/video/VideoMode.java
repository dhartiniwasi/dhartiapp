package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSDKNotificationListener;
import com.startapp.C8812a0;
import com.startapp.C8831ad;
import com.startapp.C8837b0;
import com.startapp.C8846b6;
import com.startapp.C8865bd;
import com.startapp.C8870c1;
import com.startapp.C8895cd;
import com.startapp.C8917dc;
import com.startapp.C8918dd;
import com.startapp.C8919de;
import com.startapp.C8934ed;
import com.startapp.C8971g5;
import com.startapp.C8999h6;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9058k0;
import com.startapp.C9101l;
import com.startapp.C9148n5;
import com.startapp.C9249qc;
import com.startapp.C9260r7;
import com.startapp.C9265rb;
import com.startapp.C9266rc;
import com.startapp.C9267rd;
import com.startapp.C9268re;
import com.startapp.C9542se;
import com.startapp.C9568tc;
import com.startapp.C9587uc;
import com.startapp.C9605vb;
import com.startapp.C9608vc;
import com.startapp.C9625wc;
import com.startapp.C9645xc;
import com.startapp.C9647xe;
import com.startapp.C9665yc;
import com.startapp.C9685zc;
import com.startapp.sdk.ads.video.C9358d;
import com.startapp.sdk.ads.video.player.C9375a;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p184aa.C6523c;
import p193ba.C6729a;
import p193ba.C6730b;

/* compiled from: Sta */
public class VideoMode extends C8971g5 {

    /* renamed from: K */
    public VideoPlayerInterface f38446K;

    /* renamed from: L */
    public VideoView f38447L;

    /* renamed from: M */
    public RelativeLayout f38448M;

    /* renamed from: N */
    public RelativeLayout f38449N;

    /* renamed from: O */
    public ProgressBar f38450O;

    /* renamed from: P */
    public boolean f38451P = false;

    /* renamed from: Q */
    public int f38452Q = 0;

    /* renamed from: R */
    public int f38453R = 0;

    /* renamed from: S */
    public int f38454S = 0;

    /* renamed from: T */
    public boolean f38455T;

    /* renamed from: U */
    public boolean f38456U = false;

    /* renamed from: V */
    public boolean f38457V = false;

    /* renamed from: W */
    public boolean f38458W = false;

    /* renamed from: X */
    public boolean f38459X = false;

    /* renamed from: Y */
    public HashMap<Integer, Boolean> f38460Y = new HashMap<>();

    /* renamed from: Z */
    public HashMap<Integer, Boolean> f38461Z = new HashMap<>();

    /* renamed from: a0 */
    public int f38462a0 = 1;

    /* renamed from: b0 */
    public boolean f38463b0 = false;

    /* renamed from: c0 */
    public boolean f38464c0 = false;

    /* renamed from: d0 */
    public int f38465d0 = 0;

    /* renamed from: e0 */
    public boolean f38466e0 = false;

    /* renamed from: f0 */
    public boolean f38467f0 = false;

    /* renamed from: g0 */
    public boolean f38468g0 = false;

    /* renamed from: h0 */
    public boolean f38469h0 = false;

    /* renamed from: i0 */
    public int f38470i0 = 0;

    /* renamed from: j0 */
    public int f38471j0;

    /* renamed from: k0 */
    public String f38472k0 = null;

    /* renamed from: l0 */
    public Handler f38473l0 = new Handler();

    /* renamed from: m0 */
    public Handler f38474m0 = new Handler();

    /* renamed from: n0 */
    public Handler f38475n0 = new Handler();

    /* renamed from: o0 */
    public Handler f38476o0 = new Handler();

    /* renamed from: p0 */
    public final Map<Integer, List<FractionTrackingLink>> f38477p0 = new HashMap();

    /* renamed from: q0 */
    public final Map<Integer, List<AbsoluteTrackingLink>> f38478q0 = new HashMap();

    /* renamed from: r0 */
    public long f38479r0;

    /* renamed from: s0 */
    public long f38480s0;

    /* renamed from: t0 */
    public boolean f38481t0 = false;

    /* renamed from: u0 */
    public final BroadcastReceiver f38482u0 = new C9348d();

    /* renamed from: v0 */
    public final Runnable f38483v0 = new C9349e();

    /* compiled from: Sta */
    public enum HtmlMode {
        POST_ROLL
    }

    /* compiled from: Sta */
    public enum VideoFinishedReason {
        COMPLETE,
        CLICKED,
        SKIPPED
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$a */
    /* compiled from: Sta */
    public class C9344a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f38490a;

        /* renamed from: b */
        public final /* synthetic */ Handler f38491b;

        public C9344a(int i, Handler handler) {
            this.f38490a = i;
            this.f38491b = handler;
        }

        public void run() {
            VideoMode videoMode;
            C9260r7 r7Var;
            VideoMode videoMode2 = VideoMode.this;
            if (videoMode2.f38446K != null) {
                videoMode2.mo30311O();
                int i = this.f38490a;
                if (i > 0 && (r7Var = videoMode.f36831H) != null) {
                    float f = (float) i;
                    float f2 = (videoMode = VideoMode.this).f38451P ? 0.0f : 1.0f;
                    C8999h6 h6Var = r7Var.f38150c;
                    if (h6Var != null) {
                        if (f > 0.0f) {
                            h6Var.mo29449a(f2);
                            C9542se.m50337a(h6Var.f36899a);
                            JSONObject jSONObject = new JSONObject();
                            C8919de.m48529a(jSONObject, "duration", Float.valueOf(f));
                            C8919de.m48529a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
                            C8919de.m48529a(jSONObject, "deviceVolume", Float.valueOf(C9647xe.m50536a().f39412a));
                            C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "start", jSONObject);
                        } else {
                            throw new IllegalArgumentException("Invalid Media duration");
                        }
                    }
                }
                VideoMode videoMode3 = VideoMode.this;
                videoMode3.f38458W = true;
                videoMode3.mo30313Q();
                this.f38491b.post(VideoMode.this.f38483v0);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$b */
    /* compiled from: Sta */
    public class C9345b implements Runnable {
        public C9345b() {
        }

        public void run() {
            try {
                VideoPlayerInterface videoPlayerInterface = VideoMode.this.f38446K;
                if (videoPlayerInterface == null) {
                    return;
                }
                if (((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition() > 0) {
                    VideoMode.this.mo30326f(0);
                    VideoMode.this.mo30325e(0);
                    VideoMode videoMode = VideoMode.this;
                    if (videoMode.f36829E == 0) {
                        videoMode.mo30305I();
                        return;
                    }
                    return;
                }
                VideoMode videoMode2 = VideoMode.this;
                if (!videoMode2.f38459X) {
                    videoMode2.f38473l0.postDelayed(this, 100);
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                VideoMode.this.mo29351b();
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$c */
    /* compiled from: Sta */
    public class C9346c implements Runnable {

        /* renamed from: com.startapp.sdk.ads.video.VideoMode$c$a */
        /* compiled from: Sta */
        public class C9347a implements Runnable {
            public C9347a() {
            }

            public void run() {
                try {
                    VideoMode.this.mo30313Q();
                    VideoMode.this.getClass();
                    VideoMode videoMode = VideoMode.this;
                    videoMode.mo30318a(new VideoPlayerInterface.C9374e(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", videoMode.f38452Q));
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
        }

        public C9346c() {
        }

        public void run() {
            C8999h6 h6Var;
            try {
                VideoMode.this.f38450O.setVisibility(0);
                C9260r7 r7Var = VideoMode.this.f36831H;
                if (!(r7Var == null || (h6Var = r7Var.f38150c) == null)) {
                    C9542se.m50337a(h6Var.f36899a);
                    C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "bufferStart", (JSONObject) null);
                }
                VideoMode.this.f38476o0.postDelayed(new C9347a(), AdsCommonMetaData.f38625h.mo30445G().mo30574c());
            } catch (Throwable th) {
                VideoMode.this.mo30313Q();
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$d */
    /* compiled from: Sta */
    public class C9348d extends BroadcastReceiver {
        public C9348d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!VideoMode.this.f38482u0.isInitialStickyBroadcast()) {
                VideoMode videoMode = VideoMode.this;
                videoMode.f38451P = !videoMode.f38451P;
                videoMode.mo30307K();
                VideoMode videoMode2 = VideoMode.this;
                videoMode2.mo30319a(videoMode2.f38451P);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$e */
    /* compiled from: Sta */
    public class C9349e implements Runnable {
        public C9349e() {
        }

        public void run() {
            VideoMode.this.mo30298B();
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$f */
    /* compiled from: Sta */
    public class C9350f extends C8971g5.C8978g {
        public C9350f() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            VideoMode.this.mo29398j();
            VideoMode.this.mo29411w();
        }
    }

    /* renamed from: A */
    public final void mo30297A() {
        String e = mo30329y().mo30280e();
        if (e != null) {
            this.f36834v.setWebViewClient(new C9350f());
            C9605vb.m50464a(this.f36834v, e);
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f38446K != null);
        C9605vb.m50458a(this.f36834v, true, "videoApi.setReplayEnabled", objArr);
        C9605vb.m50458a(this.f36834v, true, "videoApi.setMode", HtmlMode.POST_ROLL + "_" + mo30329y().mo30281f());
        C9605vb.m50458a(this.f36834v, true, "videoApi.setCloseable", Boolean.TRUE);
    }

    /* renamed from: B */
    public void mo30298B() {
        if (this.f38458W) {
            mo30322b((View) this.f38447L);
            if (!mo30304H()) {
                C9605vb.m50458a(this.f36834v, true, "videoApi.setClickableVideo", Boolean.valueOf(mo30329y().mo30286k()));
                C9605vb.m50458a(this.f36834v, true, "videoApi.setMode", "PLAYER");
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(mo30329y().mo30287l() || this.f38464c0);
                C9605vb.m50458a(this.f36834v, true, "videoApi.setCloseable", objArr);
                C9605vb.m50458a(this.f36834v, true, "videoApi.setSkippable", Boolean.valueOf(mo30315S()));
            }
        }
    }

    /* renamed from: C */
    public final void mo30299C() {
        FractionTrackingLink[] c = mo30329y().mo30283h().mo30371c();
        if (c != null) {
            for (FractionTrackingLink fractionTrackingLink : c) {
                List list = this.f38477p0.get(Integer.valueOf(fractionTrackingLink.mo30364e()));
                if (list == null) {
                    list = new ArrayList();
                    this.f38477p0.put(Integer.valueOf(fractionTrackingLink.mo30364e()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a = mo30329y().mo30283h().mo30367a();
        if (a != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a) {
                List list2 = this.f38478q0.get(Integer.valueOf(absoluteTrackingLink.mo30361e()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f38478q0.put(Integer.valueOf(absoluteTrackingLink.mo30361e()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    /* renamed from: D */
    public boolean mo30300D() {
        if (!this.f38466e0) {
            if (!mo30301E() || !this.f38456U) {
                return false;
            }
            return true;
        } else if (this.f38465d0 < AdsCommonMetaData.f38625h.mo30445G().mo30582i() || !mo30301E() || !this.f38456U) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: E */
    public boolean mo30301E() {
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        return videoPlayerInterface != null && ((NativeVideoPlayer) videoPlayerInterface).mo30355a();
    }

    /* renamed from: F */
    public boolean mo30302F() {
        ProgressBar progressBar = this.f38450O;
        return progressBar != null && progressBar.isShown();
    }

    /* renamed from: G */
    public final boolean mo30303G() {
        VideoPlayerInterface videoPlayerInterface;
        boolean m = mo30329y().mo30288m();
        Long p = mo30329y().mo30291p();
        if (p == null || (videoPlayerInterface = this.f38446K) == null || !((NativeVideoPlayer) videoPlayerInterface).mo30355a()) {
            return m;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return m && timeUnit.toSeconds((long) ((NativeVideoPlayer) this.f38446K).f38543g.getDuration()) > timeUnit.toSeconds(p.longValue());
    }

    /* renamed from: H */
    public boolean mo30304H() {
        return this.f38452Q == -1;
    }

    /* renamed from: I */
    public void mo30305I() {
        this.f36826B.mo29609b();
        mo30320a(mo30329y().mo30283h().mo30372d(), new VideoTrackingParams(this.f36769p, 0, this.f36829E, this.f38472k0), 0, AdSDKNotificationListener.IMPRESSION_EVENT);
        mo30320a(mo30329y().mo30283h().mo30370b(), new VideoTrackingParams(this.f36769p, 0, this.f36829E, this.f38472k0), 0, "creativeView");
        C9260r7 r7Var = this.f36831H;
        if (r7Var != null) {
            r7Var.mo29872b();
        }
    }

    /* renamed from: J */
    public final void mo30306J() {
        C9605vb.m50458a(this.f36834v, true, "videoApi.setSkipTimer", Long.valueOf(mo30323c(this.f38452Q + 50)));
    }

    /* renamed from: K */
    public void mo30307K() {
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        if (videoPlayerInterface != null) {
            try {
                boolean z = this.f38451P;
                MediaPlayer mediaPlayer = ((NativeVideoPlayer) videoPlayerInterface).f38542f;
                if (mediaPlayer != null) {
                    if (z) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.f38451P ? "OFF" : "ON";
        C9605vb.m50458a(this.f36834v, true, "videoApi.setSound", objArr);
    }

    /* renamed from: L */
    public void mo30308L() {
        if (this.f38446K != null) {
            boolean p = AdsCommonMetaData.f38625h.mo30445G().mo30589p();
            String c = mo30329y().mo30278c();
            if (c != null) {
                VideoPlayerInterface videoPlayerInterface = this.f38446K;
                if (videoPlayerInterface != null) {
                    ((NativeVideoPlayer) videoPlayerInterface).mo30354a(c);
                }
                if (p && c.endsWith(".temp")) {
                    this.f38466e0 = true;
                    this.f38469h0 = true;
                    this.f38465d0 = AdsCommonMetaData.f38625h.mo30445G().mo30582i();
                }
            } else if (p) {
                String i = mo30329y().mo30284i();
                C9358d dVar = C9358d.C9360b.f38520a;
                if (i != null && i.equals(dVar.f38519c)) {
                    dVar.f38517a = false;
                }
                VideoPlayerInterface videoPlayerInterface2 = this.f38446K;
                if (videoPlayerInterface2 != null) {
                    ((NativeVideoPlayer) videoPlayerInterface2).mo30354a(i);
                }
                this.f38466e0 = true;
                mo30310N();
            } else {
                mo30317a(VideoFinishedReason.SKIPPED);
            }
            if (this.f38472k0 == null) {
                this.f38472k0 = this.f38466e0 ? "2" : "1";
            }
        }
    }

    /* renamed from: M */
    public int mo30309M() {
        int i;
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        if (videoPlayerInterface == null) {
            i = 0;
        } else if (((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition() != ((NativeVideoPlayer) this.f38446K).f38543g.getDuration() || mo30304H()) {
            i = ((NativeVideoPlayer) this.f38446K).f38543g.getDuration() - ((NativeVideoPlayer) this.f38446K).f38543g.getCurrentPosition();
        } else {
            i = ((NativeVideoPlayer) this.f38446K).f38543g.getDuration();
        }
        int i2 = i / AdError.NETWORK_ERROR_CODE;
        if (i2 > 0 && i % AdError.NETWORK_ERROR_CODE < 100) {
            i2--;
        }
        C9605vb.m50458a(this.f36834v, true, "videoApi.setVideoRemainingTimer", Integer.valueOf(i2));
        return i;
    }

    /* renamed from: N */
    public void mo30310N() {
        if (!mo30302F()) {
            this.f38476o0.postDelayed(new C9346c(), AdsCommonMetaData.f38625h.mo30445G().mo30579g());
        }
    }

    /* renamed from: O */
    public void mo30311O() {
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        if (videoPlayerInterface != null) {
            ((NativeVideoPlayer) videoPlayerInterface).f38543g.start();
            this.f36834v.setBackgroundColor(33554431);
            mo29389a((View) null);
        }
    }

    /* renamed from: P */
    public void mo30312P() {
        this.f38468g0 = true;
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        int i = 0;
        C9605vb.m50458a(this.f36834v, true, "videoApi.setVideoDuration", Integer.valueOf(videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f38543g.getDuration() / AdError.NETWORK_ERROR_CODE : 0));
        mo30309M();
        mo30306J();
        C9605vb.m50458a(this.f36834v, true, "videoApi.setVideoCurrentPosition", Integer.valueOf(this.f38452Q / AdError.NETWORK_ERROR_CODE));
        if (mo30304H()) {
            VideoPlayerInterface videoPlayerInterface2 = this.f38446K;
            if (videoPlayerInterface2 != null) {
                ((NativeVideoPlayer) videoPlayerInterface2).f38543g.pause();
                return;
            }
            return;
        }
        VideoPlayerInterface videoPlayerInterface3 = this.f38446K;
        int duration = videoPlayerInterface3 != null ? ((NativeVideoPlayer) videoPlayerInterface3).f38543g.getDuration() : 0;
        Handler handler = new Handler();
        C9344a aVar = new C9344a(duration, handler);
        long currentTimeMillis = System.currentTimeMillis() - this.f38479r0;
        long j = 0;
        if (this.f38452Q == 0 && this.f36829E == 0 && currentTimeMillis < 500) {
            j = Math.max(200, 500 - currentTimeMillis);
        }
        handler.postDelayed(aVar, j);
        if (this.f38452Q == 0) {
            this.f38473l0.postDelayed(new C9345b(), 100);
        }
        VideoPlayerInterface videoPlayerInterface4 = this.f38446K;
        if (videoPlayerInterface4 != null) {
            i = ((NativeVideoPlayer) videoPlayerInterface4).f38543g.getDuration();
        }
        this.f38454S = i;
        for (Integer intValue : this.f38477p0.keySet()) {
            int intValue2 = intValue.intValue();
            mo30316a(mo30324d(intValue2), this.f38473l0, new C9608vc(this, intValue2));
        }
        for (Integer intValue3 : this.f38478q0.keySet()) {
            int intValue4 = intValue3.intValue();
            mo30316a(intValue4, this.f38473l0, new C9625wc(this, intValue4));
        }
        if (!this.f38466e0) {
            mo30316a(mo30324d(AdsCommonMetaData.f38625h.mo30445G().mo30584k()), this.f38475n0, new C9645xc(this));
        }
        this.f38474m0.post(new C9568tc(this));
        mo30306J();
        this.f38474m0.post(new C9587uc(this));
        this.f36756c.f38720b.setVisibility(4);
        mo30307K();
    }

    /* renamed from: Q */
    public void mo30313Q() {
        C8999h6 h6Var;
        this.f38476o0.removeCallbacksAndMessages((Object) null);
        if (mo30302F()) {
            this.f38450O.setVisibility(8);
            C9260r7 r7Var = this.f36831H;
            if (r7Var != null && (h6Var = r7Var.f38150c) != null) {
                C9542se.m50337a(h6Var.f36899a);
                C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "bufferFinish", (JSONObject) null);
            }
        }
    }

    /* renamed from: R */
    public void mo30314R() {
        if (mo30302F()) {
            mo30313Q();
        }
        mo30317a(VideoFinishedReason.SKIPPED);
        mo30320a(mo30329y().mo30283h().mo30384p(), new VideoTrackingParams(this.f36769p, mo30321b(this.f38453R), this.f36829E, this.f38472k0), this.f38453R, "skipped");
    }

    /* renamed from: S */
    public final boolean mo30315S() {
        return this.f36829E > 0 || mo30303G() || this.f38463b0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29070a(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r0 = "currentPosition"
            super.mo29070a((android.os.Bundle) r4)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            r3.f38479r0 = r1     // Catch:{ all -> 0x0085 }
            r1 = 100
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0085 }
            com.startapp.sdk.adsbase.VideoConfig r2 = r2.mo30445G()     // Catch:{ all -> 0x0085 }
            int r2 = r2.mo30580h()     // Catch:{ all -> 0x0085 }
            int r1 = r1 / r2
            r3.f38471j0 = r1     // Catch:{ all -> 0x0085 }
            r3.mo30330z()     // Catch:{ all -> 0x0085 }
            r3.mo30299C()     // Catch:{ all -> 0x0085 }
            com.startapp.sdk.ads.video.VideoAdDetails r1 = r3.mo30329y()     // Catch:{ all -> 0x0085 }
            boolean r1 = r1.mo30289n()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x003f
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0085 }
            com.startapp.sdk.adsbase.VideoConfig r1 = r1.mo30445G()     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r1.mo30585l()     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "muted"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r1 = 0
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            r3.f38451P = r1     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x008f
            boolean r1 = r4.containsKey(r0)     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x008f
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0085 }
            r3.f38452Q = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "latestPosition"
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0085 }
            r3.f38453R = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "fractionProgressImpressionsSent"
            java.io.Serializable r0 = r4.getSerializable(r0)     // Catch:{ all -> 0x0085 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0085 }
            r3.f38460Y = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "absoluteProgressImpressionsSent"
            java.io.Serializable r0 = r4.getSerializable(r0)     // Catch:{ all -> 0x0085 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0085 }
            r3.f38461Z = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "isMuted"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x0085 }
            r3.f38451P = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "shouldSetBg"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x0085 }
            r3.f38455T = r0     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "pauseNum"
            int r4 = r4.getInt(r0)     // Catch:{ all -> 0x0085 }
            r3.f38462a0 = r4     // Catch:{ all -> 0x0085 }
            goto L_0x008f
        L_0x0085:
            r4 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r4)
            r3.mo30328x()
            r3.mo29351b()
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.VideoMode.mo29070a(android.os.Bundle):void");
    }

    /* renamed from: b */
    public void mo29394b(WebView webView) {
        this.f36827C = false;
        webView.setOnTouchListener(new C8971g5.C8976e());
        C8837b0.m48301a(webView, (Paint) null);
    }

    /* renamed from: c */
    public long mo30323c(int i) {
        if (this.f38463b0 || this.f36829E > 0) {
            return 0;
        }
        long s = mo30327s() - ((long) i);
        if (s <= 0) {
            return 0;
        }
        return (s / 1000) + 1;
    }

    /* renamed from: d */
    public int mo30324d(int i) {
        return (this.f38454S * i) / 100;
    }

    /* renamed from: e */
    public void mo29073e() {
        C8999h6 h6Var;
        if (!mo30304H() && !this.f36755b.isFinishing() && !this.f38464c0 && !this.f38463b0) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            VideoPlayerInterface videoPlayerInterface = this.f38446K;
            if (videoPlayerInterface != null) {
                int currentPosition = ((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition();
                this.f38452Q = currentPosition;
                this.f38453R = currentPosition;
                ((NativeVideoPlayer) this.f38446K).f38543g.pause();
                C9260r7 r7Var = this.f36831H;
                if (!(r7Var == null || (h6Var = r7Var.f38150c) == null)) {
                    C9542se.m50337a(h6Var.f36899a);
                    C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "pause", (JSONObject) null);
                }
            }
            mo30320a(mo30329y().mo30283h().mo30378j(), new VideoPausedTrackingParams(this.f36769p, mo30321b(this.f38453R), this.f36829E, this.f38462a0, pauseOrigin, this.f38472k0), this.f38453R, "paused");
        }
        VideoPlayerInterface videoPlayerInterface2 = this.f38446K;
        if (videoPlayerInterface2 != null) {
            NativeVideoPlayer nativeVideoPlayer = (NativeVideoPlayer) videoPlayerInterface2;
            if (nativeVideoPlayer.f38542f != null) {
                nativeVideoPlayer.f38542f = null;
            }
            C9358d.C9360b.f38520a.f38518b = null;
            this.f38446K = null;
        }
        this.f38473l0.removeCallbacksAndMessages((Object) null);
        this.f38474m0.removeCallbacksAndMessages((Object) null);
        this.f38475n0.removeCallbacksAndMessages((Object) null);
        mo30313Q();
        this.f38455T = true;
        if (this.f38481t0) {
            this.f36755b.unregisterReceiver(this.f38482u0);
            this.f38481t0 = false;
        }
        super.mo29073e();
    }

    /* renamed from: f */
    public void mo29074f() {
        C8999h6 h6Var;
        super.mo29074f();
        this.f36755b.registerReceiver(this.f38482u0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f38481t0 = true;
        if (!this.f36755b.isFinishing()) {
            if (this.f38447L == null) {
                Context a = C9058k0.m48718a(this.f36755b);
                if (a == null) {
                    a = this.f36755b;
                }
                this.f38480s0 = SystemClock.uptimeMillis();
                this.f38449N = (RelativeLayout) this.f36755b.findViewById(1475346432);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                VideoView videoView = new VideoView(a);
                this.f38447L = videoView;
                videoView.setId(100);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                ProgressBar progressBar = new ProgressBar(a, (AttributeSet) null, 16843399);
                this.f38450O = progressBar;
                progressBar.setVisibility(4);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(14);
                layoutParams3.addRule(15);
                RelativeLayout relativeLayout = new RelativeLayout(a);
                this.f38448M = relativeLayout;
                relativeLayout.setId(1475346436);
                this.f36755b.setContentView(this.f38448M);
                this.f38448M.addView(this.f38447L, layoutParams2);
                this.f38448M.addView(this.f38449N, layoutParams);
                this.f38448M.addView(this.f38450O, layoutParams3);
                if (AdsConstants.f38632g.booleanValue()) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(12);
                    layoutParams4.addRule(14);
                    RelativeLayout relativeLayout2 = this.f38448M;
                    TextView textView = new TextView(a);
                    textView.setBackgroundColor(-16777216);
                    int i = C8837b0.f36438a;
                    if (Build.VERSION.SDK_INT >= 11) {
                        textView.setAlpha(0.5f);
                    }
                    textView.setTextColor(-7829368);
                    textView.setSingleLine(false);
                    textView.setText("url=" + mo30329y().mo30284i());
                    relativeLayout2.addView(textView, layoutParams4);
                }
                this.f36756c.f38720b.setVisibility(4);
            }
            if (this.f38446K == null) {
                this.f38446K = new NativeVideoPlayer(this.f38447L);
            }
            this.f38457V = false;
            this.f38448M.setBackgroundColor(-16777216);
            mo30308L();
            if (mo30304H()) {
                this.f36756c.f38720b.setVisibility(0);
                this.f38447L.setVisibility(4);
            } else {
                int i2 = this.f38452Q;
                if (i2 != 0) {
                    ((NativeVideoPlayer) this.f38446K).f38543g.seekTo(i2);
                    VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                    C9260r7 r7Var = this.f36831H;
                    if (!(r7Var == null || (h6Var = r7Var.f38150c) == null)) {
                        C9542se.m50337a(h6Var.f36899a);
                        C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "resume", (JSONObject) null);
                    }
                    mo30320a(mo30329y().mo30283h().mo30382n(), new VideoPausedTrackingParams(this.f36769p, mo30321b(this.f38453R), this.f36829E, this.f38462a0, pauseOrigin, this.f38472k0), this.f38453R, "resumed");
                    this.f38462a0++;
                }
            }
            VideoPlayerInterface videoPlayerInterface = this.f38446K;
            C9375a aVar = (C9375a) videoPlayerInterface;
            aVar.f38561b = new C8865bd(this);
            aVar.f38563d = new C9365i(this);
            C8895cd cdVar = new C8895cd(this);
            aVar.f38562c = new C8918dd(this);
            videoPlayerInterface.getClass();
            VideoPlayerInterface videoPlayerInterface2 = this.f38446K;
            ((C9375a) videoPlayerInterface2).f38564e = cdVar;
            videoPlayerInterface2.getClass();
            VideoView videoView2 = this.f38447L;
            C8934ed edVar = new C8934ed(this);
            int i3 = C8837b0.f36438a;
            if (Build.VERSION.SDK_INT >= 11) {
                videoView2.addOnLayoutChangeListener(new C8812a0(edVar));
            }
        }
    }

    /* renamed from: h */
    public void mo29355h() {
        if (!this.f38459X) {
            C8846b6.m48400a((Context) this.f36755b).mo29213a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
        }
    }

    /* renamed from: i */
    public void mo29397i() {
        if (this.f38459X) {
            return;
        }
        if (mo30304H() || this.f38447L == null) {
            mo30320a(mo30329y().mo30283h().mo30380l(), new VideoTrackingParams(this.f36769p, mo30321b(this.f38453R), this.f36829E, this.f38472k0), this.f38453R, "postrollClosed");
            super.mo29397i();
            return;
        }
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        int currentPosition = videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition() : 0;
        mo30320a(mo30329y().mo30283h().mo30377i(), new VideoTrackingParams(this.f36769p, mo30321b(currentPosition), this.f36829E, this.f38472k0), currentPosition, "closed");
    }

    /* renamed from: k */
    public long mo29399k() {
        return (SystemClock.uptimeMillis() - this.f38480s0) / 1000;
    }

    /* renamed from: l */
    public C9148n5 mo29400l() {
        Activity activity = this.f36755b;
        Runnable runnable = this.f36832I;
        return new C9266rc(activity, runnable, runnable, new C8831ad(this), new C9685zc(this), new C9665yc(this), new TrackingParams(this.f36769p), mo29350a(0));
    }

    /* renamed from: m */
    public long mo29401m() {
        Long l = this.f36770q;
        if (l != null) {
            return TimeUnit.SECONDS.toMillis(l.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f38952k.mo31038s());
    }

    /* renamed from: n */
    public TrackingParams mo29402n() {
        return new VideoTrackingParams(this.f36769p, 0, this.f36829E, this.f38472k0);
    }

    public void onClick(View view) {
        this.f36832I.run();
    }

    /* renamed from: p */
    public boolean mo29405p() {
        return this.f36765l.getType() == C9381Ad.AdType.REWARDED_VIDEO;
    }

    /* renamed from: q */
    public void mo29406q() {
    }

    /* renamed from: r */
    public void mo29407r() {
        this.f38456U = true;
        if (this.f38457V && mo30301E()) {
            mo30298B();
        } else if (mo30304H()) {
            mo30322b((View) this.f36834v);
        }
        if (mo30300D()) {
            mo30312P();
        }
        if (mo30304H()) {
            mo30297A();
        }
    }

    /* renamed from: s */
    public final long mo30327s() {
        long g = mo30329y().mo30282g();
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        return (videoPlayerInterface == null || !((NativeVideoPlayer) videoPlayerInterface).mo30355a()) ? g : Math.min(g, (long) ((NativeVideoPlayer) this.f38446K).f38543g.getDuration());
    }

    /* renamed from: t */
    public void mo29408t() {
        mo30320a(mo30329y().mo30283h().mo30383o(), new VideoTrackingParams(this.f36769p, AdsCommonMetaData.f38625h.mo30445G().mo30584k(), this.f36829E, this.f38472k0), mo30324d(AdsCommonMetaData.f38625h.mo30445G().mo30584k()), "rewarded");
    }

    /* renamed from: x */
    public final void mo30328x() {
        Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
        intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
        C8846b6.m48400a((Context) this.f36755b).mo29213a(intent);
        this.f38459X = true;
    }

    /* renamed from: y */
    public VideoAdDetails mo30329y() {
        return ((VideoEnabledAd) this.f36765l).mo30296w();
    }

    /* renamed from: z */
    public final void mo30330z() {
        if (!this.f36761h.equals("back")) {
            return;
        }
        if (AdsCommonMetaData.f38625h.mo30445G().mo30572a().equals(VideoConfig.BackMode.BOTH)) {
            this.f38463b0 = true;
            this.f38464c0 = true;
        } else if (AdsCommonMetaData.f38625h.mo30445G().mo30572a().equals(VideoConfig.BackMode.SKIP)) {
            this.f38463b0 = true;
            this.f38464c0 = false;
        } else if (AdsCommonMetaData.f38625h.mo30445G().mo30572a().equals(VideoConfig.BackMode.CLOSE)) {
            this.f38463b0 = false;
            this.f38464c0 = true;
        } else if (AdsCommonMetaData.f38625h.mo30445G().mo30572a().equals(VideoConfig.BackMode.DISABLED)) {
            this.f38463b0 = false;
            this.f38464c0 = false;
        } else {
            this.f38463b0 = false;
            this.f38464c0 = false;
        }
    }

    /* renamed from: b */
    public final void mo30322b(View view) {
        C9605vb.m50458a(this.f36834v, true, "videoApi.setVideoFrame", Integer.valueOf(C9265rb.m49239b(this.f36755b, view.getLeft())), Integer.valueOf(C9265rb.m49239b(this.f36755b, view.getTop())), Integer.valueOf(C9265rb.m49239b(this.f36755b, view.getWidth())), Integer.valueOf(C9265rb.m49239b(this.f36755b, view.getHeight())));
    }

    /* renamed from: c */
    public boolean mo29352c() {
        if (mo30304H()) {
            mo29397i();
            return false;
        }
        VideoPlayerInterface videoPlayerInterface = this.f38446K;
        if (videoPlayerInterface == null) {
            return false;
        }
        long c = mo30323c(((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition() + 50);
        if (mo30315S() && c == 0) {
            mo30314R();
            return true;
        } else if (!mo30329y().mo30287l() && !this.f38464c0) {
            return true;
        } else {
            mo29397i();
            return false;
        }
    }

    /* renamed from: b */
    public void mo29072b(Bundle bundle) {
        super.mo29072b(bundle);
        bundle.putInt("currentPosition", this.f38452Q);
        bundle.putInt("latestPosition", this.f38453R);
        bundle.putSerializable("fractionProgressImpressionsSent", this.f38460Y);
        bundle.putSerializable("absoluteProgressImpressionsSent", this.f38461Z);
        bundle.putBoolean("isMuted", this.f38451P);
        bundle.putBoolean("shouldSetBg", this.f38455T);
        bundle.putInt("pauseNum", this.f38462a0);
    }

    /* renamed from: a */
    public void mo29389a(View view) {
        VideoAdDetails y;
        List<VerificationDetails> a;
        C8917dc dcVar;
        if (MetaData.f38952k.mo31005U() && (y = mo30329y()) != null && (a = y.mo30273a()) != null) {
            C9260r7 r7Var = new C9260r7(this.f36834v.getContext(), a, true);
            this.f36831H = r7Var;
            if (r7Var.mo29873c()) {
                try {
                    AdInformationView adInformationView = this.f36756c.f38720b;
                    if (adInformationView != null) {
                        this.f36831H.mo29871a(adInformationView, C6523c.OTHER, (String) null);
                    }
                    if (view != null) {
                        this.f36831H.mo29871a(view, C6523c.CLOSE_AD, (String) null);
                    }
                    this.f36831H.mo29871a(this.f36834v, C6523c.VIDEO_CONTROLS, (String) null);
                    this.f36831H.mo29871a(this.f38449N, C6523c.OTHER, (String) null);
                } catch (RuntimeException unused) {
                }
                this.f36831H.mo29870a(this.f38447L);
                this.f36831H.mo29875e();
                C9260r7 r7Var2 = this.f36831H;
                boolean S = mo30315S();
                long s = mo30303G() ? mo30327s() : 0;
                if (r7Var2.f38149b != null && r7Var2.f38152e.compareAndSet(false, true)) {
                    if (S) {
                        dcVar = new C8917dc(true, Float.valueOf((float) s), true, C6730b.STANDALONE);
                    } else {
                        dcVar = new C8917dc(false, (Float) null, true, C6730b.STANDALONE);
                    }
                    C9101l lVar = r7Var2.f38149b;
                    lVar.getClass();
                    C9542se.m50337a(lVar.f37233a);
                    C9542se.m50341c(lVar.f37233a);
                    C9267rd rdVar = lVar.f37233a;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("skippable", dcVar.f36701a);
                        if (dcVar.f36701a) {
                            jSONObject.put("skipOffset", dcVar.f36702b);
                        }
                        jSONObject.put("autoPlay", dcVar.f36703c);
                        jSONObject.put("position", dcVar.f36704d);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "VastProperties: JSON error", e);
                    }
                    if (!rdVar.f38173j) {
                        C9268re.f38174a.mo29889a(rdVar.f38168e.mo22948c(), "publishLoadedEvent", jSONObject);
                        rdVar.f38173j = true;
                        return;
                    }
                    throw new IllegalStateException("Loaded event can only be sent once");
                }
            }
        }
    }

    /* renamed from: b */
    public void mo29351b() {
        super.mo29351b();
        if (this.f38469h0) {
            String c = mo30329y().mo30278c();
            if (c != null && c.endsWith(".temp")) {
                new File(c).delete();
            }
        }
    }

    /* renamed from: b */
    public final int mo30321b(int i) {
        int i2 = this.f38454S;
        if (i2 > 0) {
            return (i * 100) / i2;
        }
        return 0;
    }

    /* renamed from: e */
    public void mo30325e(int i) {
        List list;
        if (this.f38461Z.get(Integer.valueOf(i)) == null) {
            if (this.f38478q0.containsKey(Integer.valueOf(i)) && (list = this.f38478q0.get(Integer.valueOf(i))) != null) {
                mo30320a((VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]), new VideoProgressTrackingParams(this.f36769p, i, this.f36829E, this.f38472k0), i, "absolute");
            }
            this.f38461Z.put(Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public void mo30317a(VideoFinishedReason videoFinishedReason) {
        C9260r7 r7Var;
        C8999h6 h6Var;
        C9260r7 r7Var2;
        C8999h6 h6Var2;
        if (!(videoFinishedReason != VideoFinishedReason.COMPLETE || (r7Var2 = this.f36831H) == null || (h6Var2 = r7Var2.f38150c) == null)) {
            C9542se.m50337a(h6Var2.f36899a);
            C9268re.f38174a.mo29888a(h6Var2.f36899a.f38168e.mo22948c(), "complete", (JSONObject) null);
        }
        VideoFinishedReason videoFinishedReason2 = VideoFinishedReason.SKIPPED;
        if (!(videoFinishedReason != videoFinishedReason2 || (r7Var = this.f36831H) == null || (h6Var = r7Var.f38150c) == null)) {
            C9542se.m50337a(h6Var.f36899a);
            C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "skipped", (JSONObject) null);
        }
        if (videoFinishedReason == videoFinishedReason2 || videoFinishedReason == VideoFinishedReason.CLICKED) {
            this.f38473l0.removeCallbacksAndMessages((Object) null);
            this.f38475n0.removeCallbacksAndMessages((Object) null);
            VideoPlayerInterface videoPlayerInterface = this.f38446K;
            if (videoPlayerInterface != null) {
                this.f38453R = ((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition();
                ((NativeVideoPlayer) this.f38446K).f38543g.pause();
            }
        } else {
            this.f38453R = this.f38454S;
            mo29409u();
        }
        this.f38474m0.removeCallbacksAndMessages((Object) null);
        this.f38460Y.clear();
        this.f38461Z.clear();
        if (videoFinishedReason == VideoFinishedReason.CLICKED) {
            this.f38452Q = -1;
            return;
        }
        if (mo30329y().mo30285j()) {
            mo30297A();
            this.f36756c.f38720b.setVisibility(0);
        } else {
            mo29351b();
        }
        this.f38452Q = -1;
        if (mo30329y().mo30285j()) {
            mo30320a(mo30329y().mo30283h().mo30381m(), new VideoTrackingParams(this.f36769p, mo30321b(this.f38453R), this.f36829E, this.f38472k0), this.f38453R, "postrollImression");
        }
    }

    /* renamed from: f */
    public void mo30326f(int i) {
        C8999h6 h6Var;
        if (this.f38460Y.get(Integer.valueOf(i)) == null) {
            if (this.f38477p0.containsKey(Integer.valueOf(i))) {
                List list = this.f38477p0.get(Integer.valueOf(i));
                if (list != null) {
                    mo30320a((VideoTrackingLink[]) list.toArray(new FractionTrackingLink[0]), new VideoProgressTrackingParams(this.f36769p, i, this.f36829E, this.f38472k0), (this.f38454S * i) / 100, "fraction");
                }
                C9260r7 r7Var = this.f36831H;
                if (r7Var != null) {
                    if (i == 25) {
                        C8999h6 h6Var2 = r7Var.f38150c;
                        if (h6Var2 != null) {
                            C9542se.m50337a(h6Var2.f36899a);
                            C9268re.f38174a.mo29888a(h6Var2.f36899a.f38168e.mo22948c(), "firstQuartile", (JSONObject) null);
                        }
                    } else if (i == 50) {
                        C8999h6 h6Var3 = r7Var.f38150c;
                        if (h6Var3 != null) {
                            C9542se.m50337a(h6Var3.f36899a);
                            C9268re.f38174a.mo29888a(h6Var3.f36899a.f38168e.mo22948c(), "midpoint", (JSONObject) null);
                        }
                    } else if (i == 75 && (h6Var = r7Var.f38150c) != null) {
                        C9542se.m50337a(h6Var.f36899a);
                        C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "thirdQuartile", (JSONObject) null);
                    }
                }
            }
            this.f38460Y.put(Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public final void mo30316a(int i, Handler handler, Runnable runnable) {
        int i2 = this.f38452Q;
        if (i2 < i) {
            handler.postDelayed(runnable, (long) (i - i2));
        }
    }

    /* renamed from: a */
    public void mo30318a(VideoPlayerInterface.C9374e eVar) {
        VASTErrorCodes vASTErrorCodes;
        int i;
        VideoPlayerInterface videoPlayerInterface;
        C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
        StringBuilder a = C8870c1.m48422a("Video player error: ");
        a.append(eVar.f38557a);
        i4Var.f36952d = a.toString();
        i4Var.f36953e = eVar.f38558b;
        i4Var.f36955g = mo29347a();
        i4Var.mo29471a();
        int ordinal = eVar.f38557a.ordinal();
        boolean z = true;
        if (ordinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (ordinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (ordinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        C9249qc qcVar = new C9249qc(mo30329y().mo30283h().mo30373e(), new VideoTrackingParams(this.f36769p, mo30321b(this.f38453R), this.f36829E, this.f38472k0), mo30329y().mo30284i(), this.f38453R);
        qcVar.f38130f = vASTErrorCodes;
        qcVar.f38129e = "error";
        VideoUtil.m49536a((Context) this.f36755b, qcVar.mo29860a());
        if (!this.f38466e0 || (videoPlayerInterface = this.f38446K) == null) {
            i = this.f38452Q;
        } else {
            i = ((NativeVideoPlayer) videoPlayerInterface).f38543g.getCurrentPosition();
        }
        if (i == 0) {
            C9396a.m49783a((Context) this.f36755b, this.f36762i, this.f36769p, this.f36829E, "VIDEO_ERROR", (JSONObject) null);
            if (!this.f38466e0) {
                VideoUtil.m49537b(this.f36755b);
            } else if (!eVar.f38557a.equals(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                VideoUtil.m49537b(this.f36755b);
            }
        }
        if (this.f36765l.getType() != C9381Ad.AdType.REWARDED_VIDEO) {
            z = false;
        }
        if ((!z || this.f36828D) && mo30329y().mo30285j()) {
            mo30317a(VideoFinishedReason.SKIPPED);
            return;
        }
        mo30328x();
        mo29351b();
    }

    /* renamed from: a */
    public boolean mo29393a(String str, boolean z) {
        String str2;
        ActionTrackingLink[] actionTrackingLinkArr;
        boolean H = mo30304H();
        if (H) {
            str2 = mo30329y().mo30279d();
        } else {
            str2 = mo30329y().mo30277b();
        }
        if (!TextUtils.isEmpty(str2)) {
            z = true;
            str = str2;
        }
        if (!H) {
            mo30317a(VideoFinishedReason.CLICKED);
        }
        if (H) {
            actionTrackingLinkArr = mo30329y().mo30283h().mo30379k();
        } else {
            actionTrackingLinkArr = mo30329y().mo30283h().mo30376h();
        }
        mo30320a(actionTrackingLinkArr, new VideoClickedTrackingParams(this.f36769p, mo30321b(this.f38453R), this.f36829E, H, this.f38472k0), this.f38453R, "clicked");
        C9260r7 r7Var = this.f36831H;
        if (r7Var != null) {
            C6729a aVar = C6729a.CLICK;
            C8999h6 h6Var = r7Var.f38150c;
            if (h6Var != null) {
                C9542se.m50337a(h6Var.f36899a);
                JSONObject jSONObject = new JSONObject();
                C8919de.m48529a(jSONObject, "interactionType", aVar);
                C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "adUserInteraction", jSONObject);
            }
        }
        return super.mo29393a(str, z);
    }

    /* renamed from: a */
    public void mo30319a(boolean z) {
        ActionTrackingLink[] actionTrackingLinkArr;
        if (this.f38446K != null) {
            if (z) {
                actionTrackingLinkArr = mo30329y().mo30283h().mo30374f();
            } else {
                actionTrackingLinkArr = mo30329y().mo30283h().mo30375g();
            }
            mo30320a(actionTrackingLinkArr, new VideoTrackingParams(this.f36769p, mo30321b(((NativeVideoPlayer) this.f38446K).f38543g.getCurrentPosition()), this.f36829E, this.f38472k0), ((NativeVideoPlayer) this.f38446K).f38543g.getCurrentPosition(), "sound");
            C9260r7 r7Var = this.f36831H;
            if (r7Var != null) {
                float f = z ? 0.0f : 1.0f;
                C8999h6 h6Var = r7Var.f38150c;
                if (h6Var != null) {
                    h6Var.mo29449a(f);
                    C9542se.m50337a(h6Var.f36899a);
                    JSONObject jSONObject = new JSONObject();
                    C8919de.m48529a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
                    C8919de.m48529a(jSONObject, "deviceVolume", Float.valueOf(C9647xe.m50536a().f39412a));
                    C9268re.f38174a.mo29888a(h6Var.f36899a.f38168e.mo22948c(), "volumeChange", jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo30320a(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, int i, String str) {
        C9249qc qcVar = new C9249qc(videoTrackingLinkArr, videoTrackingParams, mo30329y().mo30284i(), i);
        qcVar.f38129e = str;
        VideoUtil.m49536a((Context) this.f36755b, qcVar.mo29860a());
    }
}
