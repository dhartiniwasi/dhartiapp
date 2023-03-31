package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class eo0 extends go0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: B */
    private static final Map f8864B;

    /* renamed from: A */
    private Integer f8865A = null;

    /* renamed from: d */
    private final ap0 f8866d;

    /* renamed from: e */
    private final bp0 f8867e;

    /* renamed from: f */
    private final boolean f8868f;

    /* renamed from: g */
    private int f8869g = 0;

    /* renamed from: h */
    private int f8870h = 0;

    /* renamed from: i */
    private MediaPlayer f8871i;

    /* renamed from: r */
    private Uri f8872r;

    /* renamed from: s */
    private int f8873s;

    /* renamed from: t */
    private int f8874t;

    /* renamed from: u */
    private int f8875u;

    /* renamed from: v */
    private yo0 f8876v;

    /* renamed from: w */
    private final boolean f8877w;

    /* renamed from: x */
    private int f8878x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public fo0 f8879y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f8880z = false;

    static {
        HashMap hashMap = new HashMap();
        f8864B = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public eo0(Context context, ap0 ap0, boolean z, boolean z2, zo0 zo0, bp0 bp0, Integer num) {
        super(context, num);
        setSurfaceTextureListener(this);
        this.f8866d = ap0;
        this.f8867e = bp0;
        this.f8877w = z;
        this.f8868f = z2;
        bp0.mo8910a(this);
    }

    /* renamed from: B */
    private final void m12183B() {
        C4794n1.m30693k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f8872r != null && surfaceTexture != null) {
            m12184C(false);
            try {
                C4409t.m29321m();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f8871i = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.f8871i.setOnCompletionListener(this);
                this.f8871i.setOnErrorListener(this);
                this.f8871i.setOnInfoListener(this);
                this.f8871i.setOnPreparedListener(this);
                this.f8871i.setOnVideoSizeChangedListener(this);
                this.f8875u = 0;
                if (this.f8877w) {
                    yo0 yo0 = new yo0(getContext());
                    this.f8876v = yo0;
                    yo0.mo15473c(surfaceTexture, getWidth(), getHeight());
                    this.f8876v.start();
                    SurfaceTexture a = this.f8876v.mo15471a();
                    if (a != null) {
                        surfaceTexture = a;
                    } else {
                        this.f8876v.mo15474d();
                        this.f8876v = null;
                    }
                }
                this.f8871i.setDataSource(getContext(), this.f8872r);
                C4409t.m29322n();
                this.f8871i.setSurface(new Surface(surfaceTexture));
                this.f8871i.setAudioStreamType(3);
                this.f8871i.setScreenOnWhilePlaying(true);
                this.f8871i.prepareAsync();
                m12185D(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                pm0.m18668h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f8872r)), e);
                onError(this.f8871i, 1, 0);
            }
        }
    }

    /* renamed from: C */
    private final void m12184C(boolean z) {
        C4794n1.m30693k("AdMediaPlayerView release");
        yo0 yo0 = this.f8876v;
        if (yo0 != null) {
            yo0.mo15474d();
            this.f8876v = null;
        }
        MediaPlayer mediaPlayer = this.f8871i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f8871i.release();
            this.f8871i = null;
            m12185D(0);
            if (z) {
                this.f8870h = 0;
            }
        }
    }

    /* renamed from: D */
    private final void m12185D(int i) {
        if (i == 3) {
            this.f8867e.mo8912c();
            this.f10012b.mo10240b();
        } else if (this.f8869g == 3) {
            this.f8867e.mo8914e();
            this.f10012b.mo10241c();
        }
        this.f8869g = i;
    }

    /* renamed from: E */
    private final void m12186E(float f) {
        MediaPlayer mediaPlayer = this.f8871i;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            pm0.m18667g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f8869g;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m12187F() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f8871i
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f8869g
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eo0.m12187F():boolean");
    }

    /* renamed from: I */
    static /* bridge */ /* synthetic */ void m12190I(eo0 eo0, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && eo0.f8866d != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey("bitrate")) {
                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                eo0.f8865A = valueOf;
                                hashMap.put("bitRate", String.valueOf(valueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            hashMap.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            hashMap.put("audioCodec", format.getString("codecs-string"));
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                eo0.f8866d.mo9081R("onMetadataEvent", hashMap);
            }
        }
    }

    /* renamed from: a0 */
    public final void mo9946a0() {
        m12186E(this.f10012b.mo10239a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo9947b(int i) {
        fo0 fo0 = this.f8879y;
        if (fo0 != null) {
            fo0.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: h */
    public final int mo9948h() {
        if (m12187F()) {
            return this.f8871i.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo9949i() {
        if (Build.VERSION.SDK_INT < 26 || !m12187F()) {
            return -1;
        }
        return this.f8871i.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    /* renamed from: j */
    public final int mo9950j() {
        if (m12187F()) {
            return this.f8871i.getDuration();
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo9951k() {
        MediaPlayer mediaPlayer = this.f8871i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo9952l() {
        MediaPlayer mediaPlayer = this.f8871i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: m */
    public final long mo9953m() {
        return 0;
    }

    /* renamed from: n */
    public final long mo9954n() {
        if (this.f8865A != null) {
            return (mo9955o() * ((long) this.f8875u)) / 100;
        }
        return -1;
    }

    /* renamed from: o */
    public final long mo9955o() {
        if (this.f8865A != null) {
            return ((long) mo9950j()) * ((long) this.f8865A.intValue());
        }
        return -1;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f8875u = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C4794n1.m30693k("AdMediaPlayerView completion");
        m12185D(5);
        this.f8870h = 5;
        C4751b2.f25403i.post(new wn0(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f8864B;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        pm0.m18667g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        m12185D(-1);
        this.f8870h = -1;
        C4751b2.f25403i.post(new xn0(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f8864B;
        C4794n1.m30693k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r1 > r6) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f8873s
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f8874t
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f8873s
            if (r2 <= 0) goto L_0x007e
            int r2 = r5.f8874t
            if (r2 <= 0) goto L_0x007e
            com.google.android.gms.internal.ads.yo0 r2 = r5.f8876v
            if (r2 != 0) goto L_0x007e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0043
            if (r1 != r2) goto L_0x0041
            int r0 = r5.f8873s
            int r1 = r0 * r7
            int r2 = r5.f8874t
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007e
        L_0x003c:
            if (r1 <= r3) goto L_0x0063
            int r1 = r3 / r0
            goto L_0x0054
        L_0x0041:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0043:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0056
            int r0 = r5.f8874t
            int r0 = r0 * r6
            int r2 = r5.f8873s
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0053
            if (r0 <= r7) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r1 = r0
        L_0x0054:
            r0 = r6
            goto L_0x007e
        L_0x0056:
            if (r1 != r2) goto L_0x0067
            int r1 = r5.f8873s
            int r1 = r1 * r7
            int r2 = r5.f8874t
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
        L_0x0063:
            r0 = r6
            goto L_0x003a
        L_0x0065:
            r0 = r1
            goto L_0x003a
        L_0x0067:
            int r2 = r5.f8873s
            int r4 = r5.f8874t
            if (r1 != r3) goto L_0x0073
            if (r4 <= r7) goto L_0x0073
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0075
        L_0x0073:
            r1 = r2
            r7 = r4
        L_0x0075:
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0054
        L_0x007e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.yo0 r6 = r5.f8876v
            if (r6 == 0) goto L_0x0088
            r6.mo15472b(r0, r1)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eo0.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:12:0x005f->B:17:0x007a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPrepared(android.media.MediaPlayer r9) {
        /*
            r8 = this;
            java.lang.String r0 = "AdMediaPlayerView prepared"
            p073j4.C4794n1.m30693k(r0)
            r0 = 2
            r8.m12185D(r0)
            com.google.android.gms.internal.ads.bp0 r0 = r8.f8867e
            r0.mo8911b()
            com.google.android.gms.internal.ads.b53 r0 = p073j4.C4751b2.f25403i
            com.google.android.gms.internal.ads.vn0 r1 = new com.google.android.gms.internal.ads.vn0
            r1.<init>(r8, r9)
            r0.post(r1)
            int r0 = r9.getVideoWidth()
            r8.f8873s = r0
            int r9 = r9.getVideoHeight()
            r8.f8874t = r9
            int r9 = r8.f8878x
            if (r9 == 0) goto L_0x002b
            r8.mo9971s(r9)
        L_0x002b:
            boolean r9 = r8.f8868f
            r0 = 3
            if (r9 != 0) goto L_0x0031
            goto L_0x0084
        L_0x0031:
            boolean r9 = r8.m12187F()
            if (r9 == 0) goto L_0x0084
            android.media.MediaPlayer r9 = r8.f8871i
            int r9 = r9.getCurrentPosition()
            if (r9 <= 0) goto L_0x0084
            int r9 = r8.f8870h
            if (r9 == r0) goto L_0x0084
            java.lang.String r9 = "AdMediaPlayerView nudging MediaPlayer"
            p073j4.C4794n1.m30693k(r9)
            r9 = 0
            r8.m12186E(r9)
            android.media.MediaPlayer r9 = r8.f8871i
            r9.start()
            android.media.MediaPlayer r9 = r8.f8871i
            int r9 = r9.getCurrentPosition()
            i5.e r1 = p053g4.C4409t.m29310b()
            long r1 = r1.mo18370a()
        L_0x005f:
            boolean r3 = r8.m12187F()
            if (r3 == 0) goto L_0x007c
            android.media.MediaPlayer r3 = r8.f8871i
            int r3 = r3.getCurrentPosition()
            if (r3 != r9) goto L_0x007c
            i5.e r3 = p053g4.C4409t.m29310b()
            long r3 = r3.mo18370a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005f
        L_0x007c:
            android.media.MediaPlayer r9 = r8.f8871i
            r9.pause()
            r8.mo9946a0()
        L_0x0084:
            int r9 = r8.f8873s
            int r1 = r8.f8874t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdMediaPlayerView stream dimensions: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = " x "
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            com.google.android.gms.internal.ads.pm0.m18666f(r9)
            int r9 = r8.f8870h
            if (r9 != r0) goto L_0x00ab
            r8.mo9970r()
        L_0x00ab:
            r8.mo9946a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eo0.onPrepared(android.media.MediaPlayer):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C4794n1.m30693k("AdMediaPlayerView surface created");
        m12183B();
        C4751b2.f25403i.post(new yn0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C4794n1.m30693k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f8871i;
        if (mediaPlayer != null && this.f8878x == 0) {
            this.f8878x = mediaPlayer.getCurrentPosition();
        }
        yo0 yo0 = this.f8876v;
        if (yo0 != null) {
            yo0.mo15474d();
        }
        C4751b2.f25403i.post(new ao0(this));
        m12184C(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C4794n1.m30693k("AdMediaPlayerView surface changed");
        int i3 = this.f8870h;
        boolean z = false;
        if (this.f8873s == i && this.f8874t == i2) {
            z = true;
        }
        if (this.f8871i != null && i3 == 3 && z) {
            int i4 = this.f8878x;
            if (i4 != 0) {
                mo9971s(i4);
            }
            mo9970r();
        }
        yo0 yo0 = this.f8876v;
        if (yo0 != null) {
            yo0.mo15472b(i, i2);
        }
        C4751b2.f25403i.post(new zn0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f8867e.mo8915f(this);
        this.f10011a.mo14554a(surfaceTexture, this.f8879y);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        C4794n1.m30693k("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.f8873s = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f8874t = videoHeight;
        if (this.f8873s != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        C4794n1.m30693k("AdMediaPlayerView window visibility changed to " + i);
        C4751b2.f25403i.post(new un0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final String mo9968p() {
        return "MediaPlayer".concat(true != this.f8877w ? "" : " spherical");
    }

    /* renamed from: q */
    public final void mo9969q() {
        C4794n1.m30693k("AdMediaPlayerView pause");
        if (m12187F() && this.f8871i.isPlaying()) {
            this.f8871i.pause();
            m12185D(4);
            C4751b2.f25403i.post(new do0(this));
        }
        this.f8870h = 4;
    }

    /* renamed from: r */
    public final void mo9970r() {
        C4794n1.m30693k("AdMediaPlayerView play");
        if (m12187F()) {
            this.f8871i.start();
            m12185D(3);
            this.f10011a.mo14555b();
            C4751b2.f25403i.post(new co0(this));
        }
        this.f8870h = 3;
    }

    /* renamed from: s */
    public final void mo9971s(int i) {
        C4794n1.m30693k("AdMediaPlayerView seek " + i);
        if (m12187F()) {
            this.f8871i.seekTo(i);
            this.f8878x = 0;
            return;
        }
        this.f8878x = i;
    }

    /* renamed from: t */
    public final void mo9972t(fo0 fo0) {
        this.f8879y = fo0;
    }

    public final String toString() {
        String name = eo0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    /* renamed from: u */
    public final void mo9974u(String str) {
        Uri parse = Uri.parse(str);
        C2451hu I1 = C2451hu.m14045I1(parse);
        if (I1 == null || I1.f10485a != null) {
            if (I1 != null) {
                parse = Uri.parse(I1.f10485a);
            }
            this.f8872r = parse;
            this.f8878x = 0;
            m12183B();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: v */
    public final void mo9975v() {
        C4794n1.m30693k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f8871i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f8871i.release();
            this.f8871i = null;
            m12185D(0);
            this.f8870h = 0;
        }
        this.f8867e.mo8913d();
    }

    /* renamed from: w */
    public final void mo9976w(float f, float f2) {
        yo0 yo0 = this.f8876v;
        if (yo0 != null) {
            yo0.mo15475e(f, f2);
        }
    }
}
