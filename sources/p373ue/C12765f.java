package p373ue;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.os.Build;
import kotlin.jvm.internal.C11669k;

/* renamed from: ue.f */
/* compiled from: WrappedMediaPlayer.kt */
public final class C12765f extends C12761c implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: A */
    private int f46727A = -1;

    /* renamed from: b */
    private final C12757a f46728b;

    /* renamed from: c */
    private final String f46729c;

    /* renamed from: d */
    private final AudioManager.OnAudioFocusChangeListener f46730d;

    /* renamed from: e */
    private AudioFocusRequest f46731e;

    /* renamed from: f */
    private MediaPlayer f46732f;

    /* renamed from: g */
    private String f46733g;

    /* renamed from: h */
    private MediaDataSource f46734h;

    /* renamed from: i */
    private double f46735i = 1.0d;

    /* renamed from: r */
    private float f46736r = 1.0f;

    /* renamed from: s */
    private boolean f46737s;

    /* renamed from: t */
    private boolean f46738t;

    /* renamed from: u */
    private boolean f46739u;

    /* renamed from: v */
    private C12763d f46740v = C12763d.RELEASE;

    /* renamed from: w */
    private String f46741w = "speakers";

    /* renamed from: x */
    private boolean f46742x = true;

    /* renamed from: y */
    private boolean f46743y;

    /* renamed from: z */
    private boolean f46744z;

    public C12765f(C12757a aVar, String str) {
        C11669k.m56787e(aVar, "ref");
        C11669k.m56787e(str, "playerId");
        this.f46728b = aVar;
        this.f46729c = str;
    }

    /* renamed from: s */
    private final void m60494s() {
        MediaDataSource mediaDataSource;
        if (!this.f46744z) {
            MediaPlayer mediaPlayer = this.f46732f;
            this.f46744z = true;
            if (this.f46742x || mediaPlayer == null) {
                this.f46742x = false;
                MediaPlayer t = m60495t();
                if (Build.VERSION.SDK_INT < 23 || (mediaDataSource = this.f46734h) == null) {
                    t.setDataSource(this.f46733g);
                } else {
                    t.setDataSource(mediaDataSource);
                }
                t.prepareAsync();
                this.f46732f = t;
            } else if (this.f46743y) {
                mediaPlayer.start();
                this.f46728b.mo37691j();
            }
        }
    }

    /* renamed from: t */
    private final MediaPlayer m60495t() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnErrorListener(this);
        m60500y(mediaPlayer);
        double d = this.f46735i;
        mediaPlayer.setVolume((float) d, (float) d);
        mediaPlayer.setLooping(this.f46740v == C12763d.LOOP);
        return mediaPlayer;
    }

    /* renamed from: u */
    private final AudioManager m60496u() {
        Object systemService = this.f46728b.mo37687e().getSystemService("audio");
        C11669k.m56785c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    /* renamed from: v */
    private final MediaPlayer m60497v() {
        MediaPlayer mediaPlayer = this.f46732f;
        if (this.f46742x || mediaPlayer == null) {
            MediaPlayer t = m60495t();
            this.f46732f = t;
            this.f46742x = false;
            return t;
        } else if (!this.f46743y) {
            return mediaPlayer;
        } else {
            mediaPlayer.reset();
            this.f46743y = false;
            return mediaPlayer;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m60498w(C12765f fVar, int i) {
        C11669k.m56787e(fVar, "this$0");
        fVar.m60494s();
    }

    /* renamed from: x */
    private final void m60499x(MediaPlayer mediaPlayer) {
        double d = this.f46735i;
        mediaPlayer.setVolume((float) d, (float) d);
        mediaPlayer.setLooping(this.f46740v == C12763d.LOOP);
        mediaPlayer.prepareAsync();
    }

    /* renamed from: y */
    private final void m60500y(MediaPlayer mediaPlayer) {
        int i;
        int i2 = 2;
        if (Build.VERSION.SDK_INT >= 21) {
            if (!C11669k.m56783a(this.f46741w, "speakers")) {
                i = 2;
            } else {
                i = this.f46737s ? 6 : 1;
            }
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(i).setContentType(2).build());
            if (i == 2) {
                m60496u().setSpeakerphoneOn(false);
            }
        } else if (C11669k.m56783a(this.f46741w, "speakers")) {
            if (!this.f46737s) {
                i2 = 3;
            }
            mediaPlayer.setAudioStreamType(i2);
        } else {
            mediaPlayer.setAudioStreamType(0);
        }
    }

    /* renamed from: a */
    public void mo37697a(boolean z, boolean z2, boolean z3) {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        MediaPlayer mediaPlayer3;
        if (this.f46737s != z) {
            this.f46737s = z;
            if (!this.f46742x && (mediaPlayer3 = this.f46732f) != null) {
                m60500y(mediaPlayer3);
            }
        }
        if (this.f46739u != z3) {
            this.f46739u = z3;
            if (!this.f46742x && (mediaPlayer2 = this.f46732f) != null) {
                m60500y(mediaPlayer2);
            }
        }
        if (this.f46738t != z2) {
            this.f46738t = z2;
            if (!this.f46742x && z2 && (mediaPlayer = this.f46732f) != null) {
                mediaPlayer.setWakeMode(this.f46728b.mo37687e(), 1);
            }
        }
    }

    /* renamed from: b */
    public Integer mo37698b() {
        MediaPlayer mediaPlayer = this.f46732f;
        if (mediaPlayer != null) {
            return Integer.valueOf(mediaPlayer.getCurrentPosition());
        }
        return null;
    }

    /* renamed from: c */
    public Integer mo37699c() {
        MediaPlayer mediaPlayer = this.f46732f;
        if (mediaPlayer != null) {
            return Integer.valueOf(mediaPlayer.getDuration());
        }
        return null;
    }

    /* renamed from: d */
    public String mo37700d() {
        return this.f46729c;
    }

    /* renamed from: e */
    public boolean mo37701e() {
        return this.f46744z && this.f46743y;
    }

    /* renamed from: g */
    public void mo37702g() {
        if (this.f46744z) {
            this.f46744z = false;
            MediaPlayer mediaPlayer = this.f46732f;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
        }
    }

    /* renamed from: h */
    public void mo37703h() {
        if (this.f46739u) {
            AudioManager u = m60496u();
            int i = 1;
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                if (this.f46737s) {
                    i = 6;
                }
                AudioFocusRequest build = builder.setAudioAttributes(builder2.setUsage(i).setContentType(2).build()).setOnAudioFocusChangeListener(new C12764e(this)).build();
                this.f46731e = build;
                u.requestAudioFocus(build);
            } else if (u.requestAudioFocus(this.f46730d, 3, 3) == 1) {
                m60494s();
            }
        } else {
            m60494s();
        }
    }

    /* renamed from: i */
    public void mo37704i() {
        MediaPlayer mediaPlayer;
        if (!this.f46742x) {
            if (this.f46744z && (mediaPlayer = this.f46732f) != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f46732f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.reset();
            }
            MediaPlayer mediaPlayer3 = this.f46732f;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            this.f46732f = null;
            this.f46743y = false;
            this.f46742x = true;
            this.f46744z = false;
        }
    }

    /* renamed from: j */
    public void mo37705j(int i) {
        if (this.f46743y) {
            MediaPlayer mediaPlayer = this.f46732f;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(i);
                return;
            }
            return;
        }
        this.f46727A = i;
    }

    /* renamed from: k */
    public void mo37706k(MediaDataSource mediaDataSource) {
        if (Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("setDataSource is only available on API >= 23");
        } else if (!C12761c.m60474f(this.f46734h, mediaDataSource)) {
            this.f46734h = mediaDataSource;
            MediaPlayer v = m60497v();
            v.setDataSource(mediaDataSource);
            m60499x(v);
        }
    }

    /* renamed from: l */
    public void mo37707l(String str) {
        C11669k.m56787e(str, "playingRoute");
        if (!C11669k.m56783a(this.f46741w, str)) {
            boolean z = this.f46744z;
            if (z) {
                mo37702g();
            }
            this.f46741w = str;
            MediaPlayer mediaPlayer = this.f46732f;
            int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : 0;
            this.f46742x = false;
            MediaPlayer t = m60495t();
            t.setDataSource(this.f46733g);
            t.prepare();
            mo37705j(currentPosition);
            if (z) {
                this.f46744z = true;
                t.start();
            }
            this.f46732f = t;
        }
    }

    /* renamed from: m */
    public void mo37708m(double d) {
        this.f46736r = (float) d;
        MediaPlayer mediaPlayer = this.f46732f;
        if (mediaPlayer != null && Build.VERSION.SDK_INT >= 23) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(this.f46736r));
        }
    }

    /* renamed from: n */
    public void mo37709n(C12763d dVar) {
        MediaPlayer mediaPlayer;
        C11669k.m56787e(dVar, "releaseMode");
        if (this.f46740v != dVar) {
            this.f46740v = dVar;
            if (!this.f46742x && (mediaPlayer = this.f46732f) != null) {
                mediaPlayer.setLooping(dVar == C12763d.LOOP);
            }
        }
    }

    /* renamed from: o */
    public void mo37710o(String str, boolean z) {
        C11669k.m56787e(str, "url");
        if (!C11669k.m56783a(this.f46733g, str)) {
            this.f46733g = str;
            MediaPlayer v = m60497v();
            v.setDataSource(str);
            m60499x(v);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f46734h = null;
        }
    }

    public void onAudioFocusChange(int i) {
        if (i == 1) {
            m60494s();
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C11669k.m56787e(mediaPlayer, "mediaPlayer");
        if (this.f46740v != C12763d.LOOP) {
            mo37712q();
        }
        this.f46728b.mo37688g(this);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        String str2;
        C11669k.m56787e(mediaPlayer, "mp");
        if (i == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + i + '}';
        }
        if (i2 == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (i2 == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i2 == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (i2 == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (i2 != -110) {
            str = "MEDIA_ERROR_UNKNOWN {extra:" + i2 + '}';
            str2 = str;
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        this.f46728b.mo37690i(this, "MediaPlayer error with what:" + str + " extra:" + str2);
        return false;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        C11669k.m56787e(mediaPlayer, "mediaPlayer");
        this.f46743y = true;
        this.f46728b.mo37689h(this);
        if (this.f46744z) {
            MediaPlayer mediaPlayer2 = this.f46732f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
            this.f46728b.mo37691j();
        }
        int i = this.f46727A;
        if (i >= 0) {
            MediaPlayer mediaPlayer3 = this.f46732f;
            if (mediaPlayer3 != null) {
                mediaPlayer3.seekTo(i);
            }
            this.f46727A = -1;
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        C11669k.m56787e(mediaPlayer, "mediaPlayer");
        this.f46728b.mo37692l();
    }

    /* renamed from: p */
    public void mo37711p(double d) {
        MediaPlayer mediaPlayer;
        if (!(this.f46735i == d)) {
            this.f46735i = d;
            if (!this.f46742x && (mediaPlayer = this.f46732f) != null) {
                float f = (float) d;
                mediaPlayer.setVolume(f, f);
            }
        }
    }

    /* renamed from: q */
    public void mo37712q() {
        if (this.f46739u) {
            AudioManager u = m60496u();
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f46731e;
                if (audioFocusRequest != null) {
                    u.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                u.abandonAudioFocus(this.f46730d);
            }
        }
        if (!this.f46742x) {
            if (this.f46740v == C12763d.RELEASE) {
                mo37704i();
            } else if (this.f46744z) {
                this.f46744z = false;
                MediaPlayer mediaPlayer = this.f46732f;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
                MediaPlayer mediaPlayer2 = this.f46732f;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.seekTo(0);
                }
            }
        }
    }
}
