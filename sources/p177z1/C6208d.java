package p177z1;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p014b2.C1624e;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: z1.d */
/* compiled from: AudioFocusManager */
final class C6208d {

    /* renamed from: a */
    private final AudioManager f29843a;

    /* renamed from: b */
    private final C6209a f29844b;

    /* renamed from: c */
    private C6210b f29845c;

    /* renamed from: d */
    private C1624e f29846d;

    /* renamed from: e */
    private int f29847e;

    /* renamed from: f */
    private int f29848f;

    /* renamed from: g */
    private float f29849g = 1.0f;

    /* renamed from: h */
    private AudioFocusRequest f29850h;

    /* renamed from: i */
    private boolean f29851i;

    /* renamed from: z1.d$a */
    /* compiled from: AudioFocusManager */
    private class C6209a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f29852a;

        public C6209a(Handler handler) {
            this.f29852a = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m36318b(int i) {
            C6208d.this.m36306h(i);
        }

        public void onAudioFocusChange(int i) {
            this.f29852a.post(new C13379c(this, i));
        }
    }

    /* renamed from: z1.d$b */
    /* compiled from: AudioFocusManager */
    public interface C6210b {
        /* renamed from: A */
        void mo21199A(float f);

        /* renamed from: B */
        void mo21200B(int i);
    }

    public C6208d(Context context, Handler handler, C6210b bVar) {
        this.f29843a = (AudioManager) C5917a.m34872e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f29845c = bVar;
        this.f29844b = new C6209a(handler);
        this.f29847e = 0;
    }

    /* renamed from: a */
    private void m36300a() {
        this.f29843a.abandonAudioFocus(this.f29844b);
    }

    /* renamed from: b */
    private void m36301b() {
        if (this.f29847e != 0) {
            if (C5953m0.f29110a >= 26) {
                m36302c();
            } else {
                m36300a();
            }
            m36310n(0);
        }
    }

    /* renamed from: c */
    private void m36302c() {
        AudioFocusRequest audioFocusRequest = this.f29850h;
        if (audioFocusRequest != null) {
            this.f29843a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: e */
    private static int m36304e(C1624e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f4657c) {
            case 0:
                C5961r.m35215i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (eVar.f4655a == 1) {
                    return 2;
                }
                break;
            case 16:
                if (C5953m0.f29110a >= 19) {
                    return 4;
                }
                return 2;
            default:
                C5961r.m35215i("AudioFocusManager", "Unidentified audio usage: " + eVar.f4657c);
                return 0;
        }
        return 3;
    }

    /* renamed from: f */
    private void m36305f(int i) {
        C6210b bVar = this.f29845c;
        if (bVar != null) {
            bVar.mo21200B(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m36306h(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || m36312q()) {
                m36305f(0);
                m36310n(2);
                return;
            }
            m36310n(3);
        } else if (i == -1) {
            m36305f(-1);
            m36301b();
        } else if (i != 1) {
            C5961r.m35215i("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            m36310n(1);
            m36305f(1);
        }
    }

    /* renamed from: j */
    private int m36307j() {
        if (this.f29847e == 1) {
            return 1;
        }
        if ((C5953m0.f29110a >= 26 ? m36309l() : m36308k()) == 1) {
            m36310n(1);
            return 1;
        }
        m36310n(0);
        return -1;
    }

    /* renamed from: k */
    private int m36308k() {
        return this.f29843a.requestAudioFocus(this.f29844b, C5953m0.m35131f0(((C1624e) C5917a.m34872e(this.f29846d)).f4657c), this.f29848f);
    }

    /* renamed from: l */
    private int m36309l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f29850h;
        if (audioFocusRequest == null || this.f29851i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f29848f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f29850h);
            }
            this.f29850h = builder.setAudioAttributes(((C1624e) C5917a.m34872e(this.f29846d)).mo6457b().f4661a).setWillPauseWhenDucked(m36312q()).setOnAudioFocusChangeListener(this.f29844b).build();
            this.f29851i = false;
        }
        return this.f29843a.requestAudioFocus(this.f29850h);
    }

    /* renamed from: n */
    private void m36310n(int i) {
        if (this.f29847e != i) {
            this.f29847e = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f29849g != f) {
                this.f29849g = f;
                C6210b bVar = this.f29845c;
                if (bVar != null) {
                    bVar.mo21199A(f);
                }
            }
        }
    }

    /* renamed from: o */
    private boolean m36311o(int i) {
        return i == 1 || this.f29848f != 1;
    }

    /* renamed from: q */
    private boolean m36312q() {
        C1624e eVar = this.f29846d;
        return eVar != null && eVar.f4655a == 1;
    }

    /* renamed from: g */
    public float mo21214g() {
        return this.f29849g;
    }

    /* renamed from: i */
    public void mo21215i() {
        this.f29845c = null;
        m36301b();
    }

    /* renamed from: m */
    public void mo21216m(C1624e eVar) {
        if (!C5953m0.m35124c(this.f29846d, eVar)) {
            this.f29846d = eVar;
            int e = m36304e(eVar);
            this.f29848f = e;
            boolean z = true;
            if (!(e == 1 || e == 0)) {
                z = false;
            }
            C5917a.m34869b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: p */
    public int mo21217p(boolean z, int i) {
        if (m36311o(i)) {
            m36301b();
            if (z) {
                return 1;
            }
            return -1;
        } else if (z) {
            return m36307j();
        } else {
            return -1;
        }
    }
}
