package p014b2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5967v;
import p177z1.C6272r1;
import p190b7.C6685q;
import p190b7.C6690r;
import p190b7.C6695s0;
import p219e7.C9998d;

/* renamed from: b2.f */
/* compiled from: AudioCapabilities */
public final class C1633f {

    /* renamed from: c */
    public static final C1633f f4680c = new C1633f(new int[]{2}, 8);

    /* renamed from: d */
    private static final C1633f f4681d = new C1633f(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C6690r<Integer, Integer> f4682e = new C6690r.C6691a().mo22571f(5, 6).mo22571f(17, 6).mo22571f(7, 6).mo22571f(18, 6).mo22571f(6, 8).mo22571f(8, 8).mo22571f(14, 8).mo22570c();

    /* renamed from: a */
    private final int[] f4683a;

    /* renamed from: b */
    private final int f4684b;

    /* renamed from: b2.f$a */
    /* compiled from: AudioCapabilities */
    private static final class C1634a {

        /* renamed from: a */
        private static final AudioAttributes f4685a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* renamed from: a */
        public static int[] m7514a() {
            C6685q.C6686a r = C6685q.m38441r();
            C6695s0 l = C1633f.f4682e.keySet().iterator();
            while (l.hasNext()) {
                int intValue = ((Integer) l.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f4685a)) {
                    r.mo22506a(Integer.valueOf(intValue));
                }
            }
            r.mo22506a(2);
            return C9998d.m51076k(r.mo22547h());
        }

        /* renamed from: b */
        public static int m7515b(int i, int i2) {
            for (int i3 = 8; i3 > 0; i3--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(C5953m0.m35080G(i3)).build(), f4685a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public C1633f(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f4683a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f4683a = new int[0];
        }
        this.f4684b = i;
    }

    /* renamed from: b */
    private static boolean m7506b() {
        if (C5953m0.f29110a >= 17) {
            String str = C5953m0.f29112c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static C1633f m7507c(Context context) {
        return m7508d(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* renamed from: d */
    static C1633f m7508d(Context context, Intent intent) {
        if (m7506b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f4681d;
        }
        if (C5953m0.f29110a >= 29 && (C5953m0.m35165w0(context) || C5953m0.m35155r0(context))) {
            return new C1633f(C1634a.m7514a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f4680c;
        }
        return new C1633f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* renamed from: e */
    private static int m7509e(int i) {
        int i2 = C5953m0.f29110a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(C5953m0.f29111b) && i == 1) {
            i = 2;
        }
        return C5953m0.m35080G(i);
    }

    /* renamed from: g */
    private static int m7510g(int i, int i2) {
        if (C5953m0.f29110a >= 29) {
            return C1634a.m7515b(i, i2);
        }
        return ((Integer) C5917a.m34872e(f4682e.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633f)) {
            return false;
        }
        C1633f fVar = (C1633f) obj;
        if (!Arrays.equals(this.f4683a, fVar.f4683a) || this.f4684b != fVar.f4684b) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Pair<Integer, Integer> mo6506f(C6272r1 r1Var) {
        int f = C5967v.m35242f((String) C5917a.m34872e(r1Var.f30243t), r1Var.f30240i);
        if (!f4682e.containsKey(Integer.valueOf(f))) {
            return null;
        }
        if (f == 18 && !mo6509i(18)) {
            f = 6;
        } else if (f == 8 && !mo6509i(8)) {
            f = 7;
        }
        if (!mo6509i(f)) {
            return null;
        }
        int i = r1Var.f30224G;
        if (i == -1 || f == 18) {
            int i2 = r1Var.f30225H;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = m7510g(f, i2);
        } else if (i > this.f4684b) {
            return null;
        }
        int e = m7509e(i);
        if (e == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f), Integer.valueOf(e));
    }

    /* renamed from: h */
    public boolean mo6507h(C6272r1 r1Var) {
        return mo6506f(r1Var) != null;
    }

    public int hashCode() {
        return this.f4684b + (Arrays.hashCode(this.f4683a) * 31);
    }

    /* renamed from: i */
    public boolean mo6509i(int i) {
        return Arrays.binarySearch(this.f4683a, i) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4684b + ", supportedEncodings=" + Arrays.toString(this.f4683a) + "]";
    }
}
