package p350sa;

import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p014b2.C1624e;
import p015b3.C1697e;
import p015b3.C1716k;
import p015b3.C1730l0;
import p015b3.C1757s0;
import p015b3.C1760t0;
import p015b3.C1772x;
import p015b3.C1776x0;
import p037e2.C4210i;
import p037e2.C4221r;
import p079k3.C4868e;
import p127r2.C5432a;
import p127r2.C5440f;
import p154v2.C5783b;
import p154v2.C5785c;
import p155v3.C5828l;
import p155v3.C5847t;
import p155v3.C5849u;
import p161w3.C5953m0;
import p167x3.C6076z;
import p177z1.C6214e2;
import p177z1.C6230j;
import p177z1.C6234k;
import p177z1.C6248m;
import p177z1.C6259o;
import p177z1.C6264q;
import p177z1.C6265q2;
import p177z1.C6266q3;
import p177z1.C6276s;
import p177z1.C6280t2;
import p177z1.C6282u2;
import p177z1.C6290v3;
import p177z1.C6292w1;
import p177z1.C6293w2;
import p177z1.C6295x1;
import p177z1.C6300z1;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p297mb.C11881b;

/* renamed from: sa.d */
/* compiled from: AudioPlayer */
public class C12493d implements C6556k.C6560c, C6282u2.C6287d, C5440f {

    /* renamed from: Q */
    private static Random f45905Q = new Random();

    /* renamed from: A */
    private C1624e f45906A;

    /* renamed from: B */
    private C6295x1 f45907B;

    /* renamed from: C */
    private boolean f45908C;

    /* renamed from: D */
    private C6292w1 f45909D;

    /* renamed from: E */
    private List<Object> f45910E;

    /* renamed from: F */
    private List<AudioEffect> f45911F = new ArrayList();

    /* renamed from: G */
    private Map<String, AudioEffect> f45912G = new HashMap();

    /* renamed from: H */
    private int f45913H = 0;

    /* renamed from: I */
    private Map<String, Object> f45914I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C6276s f45915J;

    /* renamed from: K */
    private C4210i f45916K = new C4210i();

    /* renamed from: L */
    private Integer f45917L;

    /* renamed from: M */
    private C1772x f45918M;

    /* renamed from: N */
    private Integer f45919N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final Handler f45920O = new Handler(Looper.getMainLooper());

    /* renamed from: P */
    private final Runnable f45921P = new C12494a();

    /* renamed from: a */
    private final Context f45922a;

    /* renamed from: b */
    private final C6556k f45923b;

    /* renamed from: c */
    private final C12497e f45924c;

    /* renamed from: d */
    private final C12497e f45925d;

    /* renamed from: e */
    private C12496c f45926e;

    /* renamed from: f */
    private long f45927f;

    /* renamed from: g */
    private long f45928g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f45929h;

    /* renamed from: i */
    private Long f45930i;

    /* renamed from: r */
    private long f45931r;

    /* renamed from: s */
    private Integer f45932s;

    /* renamed from: t */
    private C6556k.C6561d f45933t;

    /* renamed from: u */
    private C6556k.C6561d f45934u;

    /* renamed from: v */
    private C6556k.C6561d f45935v;

    /* renamed from: w */
    private Map<String, C1772x> f45936w = new HashMap();

    /* renamed from: x */
    private C5785c f45937x;

    /* renamed from: y */
    private C5783b f45938y;

    /* renamed from: z */
    private int f45939z;

    /* renamed from: sa.d$a */
    /* compiled from: AudioPlayer */
    class C12494a implements Runnable {
        C12494a() {
        }

        public void run() {
            if (C12493d.this.f45915J != null) {
                if (C12493d.this.f45915J.mo21192s() != C12493d.this.f45929h) {
                    C12493d.this.m59577g0();
                }
                int N = C12493d.this.f45915J.mo21162N();
                if (N == 2) {
                    C12493d.this.f45920O.postDelayed(this, 200);
                } else if (N == 3) {
                    if (C12493d.this.f45915J.mo21183i()) {
                        C12493d.this.f45920O.postDelayed(this, 500);
                    } else {
                        C12493d.this.f45920O.postDelayed(this, 1000);
                    }
                }
            }
        }
    }

    /* renamed from: sa.d$b */
    /* compiled from: AudioPlayer */
    static /* synthetic */ class C12495b {

        /* renamed from: a */
        static final /* synthetic */ int[] f45941a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                sa.d$c[] r0 = p350sa.C12493d.C12496c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45941a = r0
                sa.d$c r1 = p350sa.C12493d.C12496c.none     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f45941a     // Catch:{ NoSuchFieldError -> 0x001d }
                sa.d$c r1 = p350sa.C12493d.C12496c.loading     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p350sa.C12493d.C12495b.<clinit>():void");
        }
    }

    /* renamed from: sa.d$c */
    /* compiled from: AudioPlayer */
    enum C12496c {
        none,
        loading,
        buffering,
        ready,
        completed
    }

    public C12493d(Context context, C6539c cVar, String str, Map<?, ?> map, List<Object> list, Boolean bool) {
        this.f45922a = context;
        this.f45910E = list;
        this.f45908C = bool != null ? bool.booleanValue() : false;
        C6556k kVar = new C6556k(cVar, "com.ryanheise.just_audio.methods." + str);
        this.f45923b = kVar;
        kVar.mo22161e(this);
        this.f45924c = new C12497e(cVar, "com.ryanheise.just_audio.events." + str);
        this.f45925d = new C12497e(cVar, "com.ryanheise.just_audio.data." + str);
        this.f45926e = C12496c.none;
        this.f45916K.mo17576h(true);
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                C6234k.C6235a b = new C6234k.C6235a().mo21370c((int) (m59554I0(map2.get("minBufferDuration")).longValue() / 1000), (int) (m59554I0(map2.get("maxBufferDuration")).longValue() / 1000), (int) (m59554I0(map2.get("bufferForPlaybackDuration")).longValue() / 1000), (int) (m59554I0(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000)).mo21371d(((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue()).mo21369b((int) (m59554I0(map2.get("backBufferDuration")).longValue() / 1000), false);
                if (map2.get("targetBufferBytes") != null) {
                    b.mo21372e(((Integer) map2.get("targetBufferBytes")).intValue());
                }
                this.f45907B = b.mo21368a();
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                this.f45909D = new C6230j.C6232b().mo21352c((float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue()).mo21351b((float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue()).mo21355f(m59554I0(map3.get("minUpdateInterval")).longValue() / 1000).mo21356g((float) ((Double) map3.get("proportionalControlFactor")).doubleValue()).mo21353d(m59554I0(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000).mo21357h(m59554I0(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000).mo21354e((float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue()).mo21350a();
            }
        }
    }

    /* renamed from: A0 */
    private void m59544A0() {
        if (this.f45915J == null) {
            C6276s.C6278b bVar = new C6276s.C6278b(this.f45922a);
            C6295x1 x1Var = this.f45907B;
            if (x1Var != null) {
                bVar.mo21534o(x1Var);
            }
            C6292w1 w1Var = this.f45909D;
            if (w1Var != null) {
                bVar.mo21533n(w1Var);
            }
            if (this.f45908C) {
                bVar.mo21535p(new C6248m(this.f45922a).mo21409j(true));
            }
            C6276s g = bVar.mo21532g();
            this.f45915J = g;
            g.mo21197x(this.f45908C);
            m59569V0(this.f45915J.getAudioSessionId());
            this.f45915J.mo21187l(this);
        }
    }

    /* renamed from: B0 */
    private Map<String, Object> m59545B0() {
        Equalizer equalizer = (Equalizer) this.f45912G.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s = 0; s < equalizer.getNumberOfBands(); s = (short) (s + 1)) {
            arrayList.add(m59563P0("index", Short.valueOf(s), "lowerFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s)[0]) / 1000.0d), "upperFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s)[1]) / 1000.0d), "centerFrequency", Double.valueOf(((double) equalizer.getCenterFreq(s)) / 1000.0d), "gain", Double.valueOf(((double) equalizer.getBandLevel(s)) / 1000.0d)));
        }
        return m59563P0("parameters", m59563P0("minDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[0]) / 1000.0d), "maxDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[1]) / 1000.0d), "bands", arrayList));
    }

    /* renamed from: C0 */
    private void m59546C0(int i, double d) {
        ((Equalizer) this.f45912G.get("AndroidEqualizer")).setBandLevel((short) i, (short) ((int) Math.round(d * 1000.0d)));
    }

    /* renamed from: D0 */
    private C1772x m59547D0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        C1772x xVar = this.f45936w.get(str);
        if (xVar != null) {
            return xVar;
        }
        C1772x v0 = m59587v0(map);
        this.f45936w.put(str, v0);
        return v0;
    }

    /* renamed from: E0 */
    private List<C1772x> m59549E0(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(m59547D0(list.get(i)));
            }
            return arrayList;
        }
        throw new RuntimeException("List expected: " + obj);
    }

    /* renamed from: F0 */
    private C1772x[] m59550F0(Object obj) {
        List<C1772x> E0 = m59549E0(obj);
        C1772x[] xVarArr = new C1772x[E0.size()];
        E0.toArray(xVarArr);
        return xVarArr;
    }

    /* renamed from: G0 */
    private long m59552G0() {
        long j = this.f45931r;
        if (j != -9223372036854775807L) {
            return j;
        }
        C12496c cVar = this.f45926e;
        if (cVar == C12496c.none || cVar == C12496c.loading) {
            long currentPosition = this.f45915J.getCurrentPosition();
            if (currentPosition < 0) {
                return 0;
            }
            return currentPosition;
        }
        Long l = this.f45930i;
        if (l == null || l.longValue() == -9223372036854775807L) {
            return this.f45915J.getCurrentPosition();
        }
        return this.f45930i.longValue();
    }

    /* renamed from: H0 */
    private long m59553H0() {
        C12496c cVar = this.f45926e;
        if (cVar == C12496c.none || cVar == C12496c.loading) {
            return -9223372036854775807L;
        }
        return this.f45915J.getDuration();
    }

    /* renamed from: I0 */
    public static Long m59554I0(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue());
    }

    /* renamed from: M0 */
    private void m59559M0(C1772x xVar, long j, Integer num, C6556k.C6561d dVar) {
        this.f45931r = j;
        this.f45932s = num;
        this.f45919N = Integer.valueOf(num != null ? num.intValue() : 0);
        int i = C12495b.f45941a[this.f45926e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.f45915J.stop();
            } else {
                m59562P();
                this.f45915J.stop();
            }
        }
        this.f45939z = 0;
        this.f45933t = dVar;
        m59576f1();
        this.f45926e = C12496c.loading;
        m59589z0();
        this.f45918M = xVar;
        this.f45915J.mo21160I(xVar);
        this.f45915J.mo21159H();
    }

    /* renamed from: N0 */
    private void m59560N0(double d) {
        ((LoudnessEnhancer) this.f45912G.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d * 1000.0d));
    }

    /* renamed from: O0 */
    static <T> T m59561O0(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    /* renamed from: P */
    private void m59562P() {
        m59566T0("abort", "Connection aborted");
    }

    /* renamed from: P0 */
    static Map<String, Object> m59563P0(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            hashMap.put(objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    /* renamed from: Q */
    private void m59564Q() {
        C6556k.C6561d dVar = this.f45935v;
        if (dVar != null) {
            try {
                dVar.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f45935v = null;
            this.f45930i = null;
        }
    }

    /* renamed from: T0 */
    private void m59566T0(String str, String str2) {
        C6556k.C6561d dVar = this.f45933t;
        if (dVar != null) {
            dVar.error(str, str2, (Object) null);
            this.f45933t = null;
        }
        this.f45924c.error(str, str2, (Object) null);
    }

    /* renamed from: U0 */
    private void m59567U0(int i, int i2, int i3) {
        C1624e.C1629e eVar = new C1624e.C1629e();
        eVar.mo6462c(i);
        eVar.mo6463d(i2);
        eVar.mo6465f(i3);
        C1624e a = eVar.mo6460a();
        if (this.f45926e == C12496c.loading) {
            this.f45906A = a;
        } else {
            this.f45915J.mo21158F(a, false);
        }
    }

    /* renamed from: V0 */
    private void m59569V0(int i) {
        if (i == 0) {
            this.f45917L = null;
        } else {
            this.f45917L = Integer.valueOf(i);
        }
        m59581o0();
        if (this.f45917L != null) {
            for (Object next : this.f45910E) {
                Map map = (Map) next;
                AudioEffect u0 = m59586u0(next, this.f45917L.intValue());
                if (((Boolean) map.get("enabled")).booleanValue()) {
                    u0.setEnabled(true);
                }
                this.f45911F.add(u0);
                this.f45912G.put((String) map.get("type"), u0);
            }
        }
        m59589z0();
    }

    /* renamed from: Z0 */
    private void m59572Z0(Object obj) {
        Map map = (Map) obj;
        C1772x xVar = this.f45936w.get((String) m59561O0(map, "id"));
        if (xVar != null) {
            String str = (String) m59561O0(map, "type");
            str.hashCode();
            if (str.equals("concatenating")) {
                ((C1716k) xVar).mo6755u0(m59588w0((List) m59561O0(map, "shuffleOrder")));
                for (Object Z0 : (List) m59561O0(map, "children")) {
                    m59572Z0(Z0);
                }
            } else if (str.equals("looping")) {
                m59572Z0(m59561O0(map, "child"));
            }
        }
    }

    /* renamed from: d1 */
    private void m59573d1() {
        this.f45920O.removeCallbacks(this.f45921P);
        this.f45920O.post(this.f45921P);
    }

    /* renamed from: e1 */
    private boolean m59574e1() {
        Integer valueOf = Integer.valueOf(this.f45915J.mo21154A());
        if (valueOf.equals(this.f45919N)) {
            return false;
        }
        this.f45919N = valueOf;
        return true;
    }

    /* renamed from: f0 */
    private void m59575f0(String str, boolean z) {
        this.f45912G.get(str).setEnabled(z);
    }

    /* renamed from: f1 */
    private void m59576f1() {
        this.f45927f = m59552G0();
        this.f45928g = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m59577g0() {
        m59589z0();
        m59579i0();
    }

    /* renamed from: g1 */
    private boolean m59578g1() {
        if (m59552G0() == this.f45927f) {
            return false;
        }
        this.f45927f = m59552G0();
        this.f45928g = System.currentTimeMillis();
        return true;
    }

    /* renamed from: i0 */
    private void m59579i0() {
        Map<String, Object> map = this.f45914I;
        if (map != null) {
            this.f45924c.success(map);
            this.f45914I = null;
        }
    }

    /* renamed from: k0 */
    private C5828l.C5829a m59580k0() {
        return new C5847t.C5848a(this.f45922a, new C5849u.C5851b().mo20395e(C5953m0.m35143l0(this.f45922a, "just_audio")).mo20393c(true));
    }

    /* renamed from: o0 */
    private void m59581o0() {
        Iterator<AudioEffect> it = this.f45911F.iterator();
        while (it.hasNext()) {
            it.next().release();
            it.remove();
        }
        this.f45912G.clear();
    }

    /* renamed from: q0 */
    private Map<String, Object> m59582q0() {
        HashMap hashMap = new HashMap();
        if (this.f45937x != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("title", this.f45937x.f28777b);
            hashMap2.put("url", this.f45937x.f28778c);
            hashMap.put("info", hashMap2);
        }
        if (this.f45938y != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("bitrate", Integer.valueOf(this.f45938y.f28770a));
            hashMap3.put("genre", this.f45938y.f28771b);
            hashMap3.put(MediationMetaData.KEY_NAME, this.f45938y.f28772c);
            hashMap3.put("metadataInterval", Integer.valueOf(this.f45938y.f28775f));
            hashMap3.put("url", this.f45938y.f28773d);
            hashMap3.put("isPublic", Boolean.valueOf(this.f45938y.f28774e));
            hashMap.put("headers", hashMap3);
        }
        return hashMap;
    }

    /* renamed from: r0 */
    private void m59583r0() {
        this.f45930i = null;
        this.f45935v.success(new HashMap());
        this.f45935v = null;
    }

    /* renamed from: s0 */
    private C1716k m59584s0(Object obj) {
        return (C1716k) this.f45936w.get((String) obj);
    }

    /* renamed from: t0 */
    private Map<String, Object> m59585t0() {
        HashMap hashMap = new HashMap();
        Long valueOf = m59553H0() == -9223372036854775807L ? null : Long.valueOf(m59553H0() * 1000);
        C6276s sVar = this.f45915J;
        this.f45929h = sVar != null ? sVar.mo21192s() : 0;
        hashMap.put("processingState", Integer.valueOf(this.f45926e.ordinal()));
        hashMap.put("updatePosition", Long.valueOf(this.f45927f * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f45928g));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f45927f, this.f45929h) * 1000));
        hashMap.put("icyMetadata", m59582q0());
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.f45919N);
        hashMap.put("androidAudioSessionId", this.f45917L);
        return hashMap;
    }

    /* renamed from: u0 */
    private AudioEffect m59586u0(Object obj, int i) {
        Map map = (Map) obj;
        String str = (String) map.get("type");
        str.hashCode();
        if (str.equals("AndroidEqualizer")) {
            return new Equalizer(0, i);
        }
        if (!str.equals("AndroidLoudnessEnhancer")) {
            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
        } else if (Build.VERSION.SDK_INT >= 19) {
            int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
            LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i);
            loudnessEnhancer.setTargetGain(round);
            return loudnessEnhancer;
        } else {
            throw new RuntimeException("AndroidLoudnessEnhancer requires minSdkVersion >= 19");
        }
    }

    /* renamed from: v0 */
    private C1772x m59587v0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        String str2 = (String) map.get("type");
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -445916622:
                if (str2.equals("concatenating")) {
                    c = 0;
                    break;
                }
                break;
            case 103407:
                if (str2.equals("hls")) {
                    c = 1;
                    break;
                }
                break;
            case 3075986:
                if (str2.equals("dash")) {
                    c = 2;
                    break;
                }
                break;
            case 349937342:
                if (str2.equals("looping")) {
                    c = 3;
                    break;
                }
                break;
            case 918617282:
                if (str2.equals("clipping")) {
                    c = 4;
                    break;
                }
                break;
            case 1131547531:
                if (str2.equals("progressive")) {
                    c = 5;
                    break;
                }
                break;
            case 2092627105:
                if (str2.equals("silence")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C1716k(false, ((Boolean) map.get("useLazyPreparation")).booleanValue(), m59588w0((List) m59561O0(map, "shuffleOrder")), m59550F0(map.get("children")));
            case 1:
                return new HlsMediaSource.Factory(m59580k0()).mo7791a(new C6300z1.C6303c().mo21592f(Uri.parse((String) map.get("uri"))).mo21590d("application/x-mpegURL").mo21587a());
            case 2:
                return new DashMediaSource.Factory(m59580k0()).mo7731a(new C6300z1.C6303c().mo21592f(Uri.parse((String) map.get("uri"))).mo21590d("application/dash+xml").mo21591e(str).mo21587a());
            case 3:
                C1772x D0 = m59547D0(map.get("child"));
                int intValue = ((Integer) map.get("count")).intValue();
                C1772x[] xVarArr = new C1772x[intValue];
                for (int i = 0; i < intValue; i++) {
                    xVarArr[i] = D0;
                }
                return new C1716k(xVarArr);
            case 4:
                Long I0 = m59554I0(map.get("start"));
                Long I02 = m59554I0(map.get("end"));
                return new C1697e(m59547D0(map.get("child")), I0 != null ? I0.longValue() : 0, I02 != null ? I02.longValue() : Long.MIN_VALUE);
            case 5:
                return new C1730l0.C1732b(m59580k0(), (C4221r) this.f45916K).mo6791b(new C6300z1.C6303c().mo21592f(Uri.parse((String) map.get("uri"))).mo21591e(str).mo21587a());
            case 6:
                return new C1760t0.C1762b().mo6882b(m59554I0(map.get("duration")).longValue()).mo6883c(str).mo6881a();
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
        }
    }

    /* renamed from: w0 */
    private C1757s0 m59588w0(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return new C1757s0.C1758a(iArr, f45905Q.nextLong());
    }

    /* renamed from: z0 */
    private void m59589z0() {
        new HashMap();
        this.f45914I = m59585t0();
    }

    /* renamed from: A */
    public /* synthetic */ void mo140A(boolean z) {
        C6293w2.m37122j(this, z);
    }

    /* renamed from: B */
    public /* synthetic */ void mo141B(int i) {
        C6293w2.m37131s(this, i);
    }

    /* renamed from: C */
    public void mo142C(C6266q3 q3Var, int i) {
        if (!(this.f45931r == -9223372036854775807L && this.f45932s == null)) {
            Integer num = this.f45932s;
            this.f45915J.mo21182h(num != null ? num.intValue() : 0, this.f45931r);
            this.f45932s = null;
            this.f45931r = -9223372036854775807L;
        }
        if (m59574e1()) {
            m59577g0();
        }
        if (this.f45915J.mo21162N() == 4) {
            try {
                if (this.f45915J.mo21183i()) {
                    if (this.f45913H == 0 && this.f45915J.mo21245o() > 0) {
                        this.f45915J.mo21182h(0, 0);
                    } else if (this.f45915J.mo21249y()) {
                        this.f45915J.mo21248u();
                    }
                } else if (this.f45915J.mo21154A() < this.f45915J.mo21245o()) {
                    C6276s sVar = this.f45915J;
                    sVar.mo21182h(sVar.mo21154A(), 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f45913H = this.f45915J.mo21245o();
    }

    /* renamed from: D */
    public /* synthetic */ void mo143D(boolean z) {
        C6293w2.m37120h(this, z);
    }

    /* renamed from: F */
    public /* synthetic */ void mo146F() {
        C6293w2.m37135w(this);
    }

    /* renamed from: H */
    public /* synthetic */ void mo149H(C6282u2 u2Var, C6282u2.C6286c cVar) {
        C6293w2.m37119g(this, u2Var, cVar);
    }

    /* renamed from: I */
    public /* synthetic */ void mo150I(float f) {
        C6293w2.m37112D(this, f);
    }

    /* renamed from: K */
    public void mo151K(int i) {
        if (i == 2) {
            m59578g1();
            C12496c cVar = this.f45926e;
            C12496c cVar2 = C12496c.buffering;
            if (!(cVar == cVar2 || cVar == C12496c.loading)) {
                this.f45926e = cVar2;
                m59577g0();
            }
            m59573d1();
        } else if (i == 3) {
            if (this.f45915J.mo21183i()) {
                m59576f1();
            }
            this.f45926e = C12496c.ready;
            m59577g0();
            if (this.f45933t != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", m59553H0() == -9223372036854775807L ? null : Long.valueOf(m59553H0() * 1000));
                this.f45933t.success(hashMap);
                this.f45933t = null;
                C1624e eVar = this.f45906A;
                if (eVar != null) {
                    this.f45915J.mo21158F(eVar, false);
                    this.f45906A = null;
                }
            }
            if (this.f45935v != null) {
                m59583r0();
            }
        } else if (i == 4) {
            C12496c cVar3 = this.f45926e;
            C12496c cVar4 = C12496c.completed;
            if (cVar3 != cVar4) {
                m59576f1();
                this.f45926e = cVar4;
                m59577g0();
            }
            if (this.f45933t != null) {
                this.f45933t.success(new HashMap());
                this.f45933t = null;
                C1624e eVar2 = this.f45906A;
                if (eVar2 != null) {
                    this.f45915J.mo21158F(eVar2, false);
                    this.f45906A = null;
                }
            }
            C6556k.C6561d dVar = this.f45934u;
            if (dVar != null) {
                dVar.success(new HashMap());
                this.f45934u = null;
            }
        }
    }

    /* renamed from: O */
    public /* synthetic */ void mo153O(boolean z) {
        C6293w2.m37136x(this, z);
    }

    /* renamed from: Q0 */
    public void mo37280Q0() {
        if (this.f45915J.mo21183i()) {
            this.f45915J.mo21190q(false);
            m59576f1();
            C6556k.C6561d dVar = this.f45934u;
            if (dVar != null) {
                dVar.success(new HashMap());
                this.f45934u = null;
            }
        }
    }

    /* renamed from: R */
    public /* synthetic */ void mo156R(C1624e eVar) {
        C6293w2.m37113a(this, eVar);
    }

    /* renamed from: R0 */
    public void mo37281R0(C6556k.C6561d dVar) {
        C6556k.C6561d dVar2;
        if (this.f45915J.mo21183i()) {
            dVar.success(new HashMap());
            return;
        }
        C6556k.C6561d dVar3 = this.f45934u;
        if (dVar3 != null) {
            dVar3.success(new HashMap());
        }
        this.f45934u = dVar;
        this.f45915J.mo21190q(true);
        m59576f1();
        if (this.f45926e == C12496c.completed && (dVar2 = this.f45934u) != null) {
            dVar2.success(new HashMap());
            this.f45934u = null;
        }
    }

    /* renamed from: S */
    public void mo157S(C6290v3 v3Var) {
        for (int i = 0; i < v3Var.mo21555b().size(); i++) {
            C1776x0 b = v3Var.mo21555b().get(i).mo21559b();
            for (int i2 = 0; i2 < b.f5280a; i2++) {
                C5432a aVar = b.mo6897b(i2).f30241r;
                if (aVar != null) {
                    for (int i3 = 0; i3 < aVar.mo19696d(); i3++) {
                        C5432a.C5434b c = aVar.mo19695c(i3);
                        if (c instanceof C5783b) {
                            this.f45938y = (C5783b) c;
                            m59577g0();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: S0 */
    public void mo37282S0(long j, Integer num, C6556k.C6561d dVar) {
        int i;
        C12496c cVar = this.f45926e;
        if (cVar == C12496c.none || cVar == C12496c.loading) {
            dVar.success(new HashMap());
            return;
        }
        m59564Q();
        this.f45930i = Long.valueOf(j);
        this.f45935v = dVar;
        if (num != null) {
            try {
                i = num.intValue();
            } catch (RuntimeException e) {
                this.f45935v = null;
                this.f45930i = null;
                throw e;
            }
        } else {
            i = this.f45915J.mo21154A();
        }
        this.f45915J.mo21182h(i, j);
    }

    /* renamed from: U */
    public void mo159U(C6265q2 q2Var) {
        Integer num;
        int intValue;
        if (q2Var instanceof C6264q) {
            C6264q qVar = (C6264q) q2Var;
            int i = qVar.f30171d;
            if (i == 0) {
                C11881b.m57384b("AudioPlayer", "TYPE_SOURCE: " + qVar.mo21442m().getMessage());
            } else if (i == 1) {
                C11881b.m57384b("AudioPlayer", "TYPE_RENDERER: " + qVar.mo21441l().getMessage());
            } else if (i != 2) {
                C11881b.m57384b("AudioPlayer", "default ExoPlaybackException: " + qVar.mo21443n().getMessage());
            } else {
                C11881b.m57384b("AudioPlayer", "TYPE_UNEXPECTED: " + qVar.mo21443n().getMessage());
            }
            m59566T0(String.valueOf(qVar.f30171d), qVar.getMessage());
        } else {
            C11881b.m57384b("AudioPlayer", "default PlaybackException: " + q2Var.getMessage());
            m59566T0(String.valueOf(q2Var.f30179a), q2Var.getMessage());
        }
        this.f45939z++;
        if (this.f45915J.mo21249y() && (num = this.f45919N) != null && this.f45939z <= 5 && (intValue = num.intValue() + 1) < this.f45915J.mo21156D().mo6761t()) {
            this.f45915J.mo21160I(this.f45918M);
            this.f45915J.mo21159H();
            this.f45915J.mo21182h(intValue, 0);
        }
    }

    /* renamed from: W0 */
    public void mo37283W0(int i) {
        this.f45915J.mo21163Q(i);
    }

    /* renamed from: X */
    public void mo162X(C6282u2.C6288e eVar, C6282u2.C6288e eVar2, int i) {
        m59576f1();
        if (i == 0 || i == 1) {
            m59574e1();
        }
        m59577g0();
    }

    /* renamed from: X0 */
    public void mo37284X0(float f) {
        C6280t2 e = this.f45915J.mo21176e();
        if (e.f30332b != f) {
            this.f45915J.mo21171c(new C6280t2(e.f30331a, f));
            m59589z0();
        }
    }

    /* renamed from: Y0 */
    public void mo37285Y0(boolean z) {
        this.f45915J.mo21185j(z);
    }

    /* renamed from: Z */
    public /* synthetic */ void mo165Z(int i, boolean z) {
        C6293w2.m37118f(this, i, z);
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo166a0(boolean z, int i) {
        C6293w2.m37130r(this, z, i);
    }

    /* renamed from: a1 */
    public void mo37286a1(boolean z) {
        this.f45915J.mo21177f(z);
    }

    /* renamed from: b */
    public /* synthetic */ void mo167b(boolean z) {
        C6293w2.m37137y(this, z);
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo168b0(C6300z1 z1Var, int i) {
        C6293w2.m37123k(this, z1Var, i);
    }

    /* renamed from: b1 */
    public void mo37287b1(float f) {
        C6280t2 e = this.f45915J.mo21176e();
        if (e.f30331a != f) {
            this.f45915J.mo21171c(new C6280t2(f, e.f30332b));
            if (this.f45915J.mo21183i()) {
                m59576f1();
            }
            m59589z0();
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ void mo169c0(C6282u2.C6284b bVar) {
        C6293w2.m37114b(this, bVar);
    }

    /* renamed from: c1 */
    public void mo37288c1(float f) {
        this.f45915J.setVolume(f);
    }

    /* renamed from: d0 */
    public /* synthetic */ void mo170d0() {
        C6293w2.m37133u(this);
    }

    /* renamed from: e0 */
    public /* synthetic */ void mo171e0(C6265q2 q2Var) {
        C6293w2.m37129q(this, q2Var);
    }

    /* renamed from: g */
    public /* synthetic */ void mo173g(C6280t2 t2Var) {
        C6293w2.m37127o(this, t2Var);
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo175h0(C6214e2 e2Var) {
        C6293w2.m37124l(this, e2Var);
    }

    /* renamed from: j */
    public /* synthetic */ void mo177j(C4868e eVar) {
        C6293w2.m37116d(this, eVar);
    }

    /* renamed from: j0 */
    public /* synthetic */ void mo178j0(boolean z, int i) {
        C6293w2.m37126n(this, z, i);
    }

    /* renamed from: l0 */
    public /* synthetic */ void mo180l0(C6259o oVar) {
        C6293w2.m37117e(this, oVar);
    }

    /* renamed from: m0 */
    public /* synthetic */ void mo181m0(int i, int i2) {
        C6293w2.m37138z(this, i, i2);
    }

    /* renamed from: o */
    public void mo182o(C5432a aVar) {
        for (int i = 0; i < aVar.mo19696d(); i++) {
            C5432a.C5434b c = aVar.mo19695c(i);
            if (c instanceof C5785c) {
                this.f45937x = (C5785c) c;
                m59577g0();
            }
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C6555j jVar2 = jVar;
        C6556k.C6561d dVar2 = dVar;
        m59544A0();
        try {
            String str = jVar2.f30999a;
            char c = 65535;
            switch (str.hashCode()) {
                case -2058172951:
                    if (str.equals("androidEqualizerBandSetGain")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1987605894:
                    if (str.equals("setShuffleMode")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1875704736:
                    if (str.equals("setSkipSilence")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1540835818:
                    if (str.equals("concatenatingInsertAll")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1484304041:
                    if (str.equals("setShuffleOrder")) {
                        c = 9;
                        break;
                    }
                    break;
                case -704119678:
                    if (str.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                        c = 11;
                        break;
                    }
                    break;
                case -345307082:
                    if (str.equals("androidLoudnessEnhancerSetTargetGain")) {
                        c = 19;
                        break;
                    }
                    break;
                case -104999328:
                    if (str.equals("setAndroidAudioAttributes")) {
                        c = 17;
                        break;
                    }
                    break;
                case -48357143:
                    if (str.equals("setLoopMode")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3327206:
                    if (str.equals("load")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3526264:
                    if (str.equals("seek")) {
                        c = 13;
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        c = 2;
                        break;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        c = 3;
                        break;
                    }
                    break;
                case 845471111:
                    if (str.equals("concatenatingRemoveRange")) {
                        c = 15;
                        break;
                    }
                    break;
                case 986980643:
                    if (str.equals("concatenatingMove")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1401390078:
                    if (str.equals("setPitch")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1404354821:
                    if (str.equals("setSpeed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1454606831:
                    if (str.equals("setPreferredPeakBitRate")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1624925565:
                    if (str.equals("androidEqualizerGetParameters")) {
                        c = 20;
                        break;
                    }
                    break;
                case 1631191096:
                    if (str.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                        c = 10;
                        break;
                    }
                    break;
                case 2117606630:
                    if (str.equals("audioEffectSetEnabled")) {
                        c = 18;
                        break;
                    }
                    break;
            }
            long j = -9223372036854775807L;
            switch (c) {
                case 0:
                    Long I0 = m59554I0(jVar2.mo22156a("initialPosition"));
                    Integer num = (Integer) jVar2.mo22156a("initialIndex");
                    C1772x D0 = m59547D0(jVar2.mo22156a("audioSource"));
                    if (I0 != null) {
                        j = I0.longValue() / 1000;
                    }
                    m59559M0(D0, j, num, dVar);
                    break;
                case 1:
                    mo37281R0(dVar2);
                    break;
                case 2:
                    mo37280Q0();
                    dVar2.success(new HashMap());
                    break;
                case 3:
                    mo37288c1((float) ((Double) jVar2.mo22156a("volume")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 4:
                    mo37287b1((float) ((Double) jVar2.mo22156a("speed")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 5:
                    mo37284X0((float) ((Double) jVar2.mo22156a("pitch")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 6:
                    mo37286a1(((Boolean) jVar2.mo22156a("enabled")).booleanValue());
                    dVar2.success(new HashMap());
                    break;
                case 7:
                    mo37283W0(((Integer) jVar2.mo22156a("loopMode")).intValue());
                    dVar2.success(new HashMap());
                    break;
                case 8:
                    mo37285Y0(((Integer) jVar2.mo22156a("shuffleMode")).intValue() == 1);
                    dVar2.success(new HashMap());
                    break;
                case 9:
                    m59572Z0(jVar2.mo22156a("audioSource"));
                    dVar2.success(new HashMap());
                    break;
                case 10:
                    dVar2.success(new HashMap());
                    break;
                case 11:
                    dVar2.success(new HashMap());
                    break;
                case 12:
                    dVar2.success(new HashMap());
                    break;
                case 13:
                    Long I02 = m59554I0(jVar2.mo22156a("position"));
                    Integer num2 = (Integer) jVar2.mo22156a("index");
                    if (I02 != null) {
                        j = I02.longValue() / 1000;
                    }
                    mo37282S0(j, num2, dVar2);
                    break;
                case 14:
                    m59584s0(jVar2.mo22156a("id")).mo6747S(((Integer) jVar2.mo22156a("index")).intValue(), m59549E0(jVar2.mo22156a("children")), this.f45920O, new C12491b(dVar2));
                    m59584s0(jVar2.mo22156a("id")).mo6755u0(m59588w0((List) jVar2.mo22156a("shuffleOrder")));
                    break;
                case 15:
                    m59584s0(jVar2.mo22156a("id")).mo6754p0(((Integer) jVar2.mo22156a("startIndex")).intValue(), ((Integer) jVar2.mo22156a("endIndex")).intValue(), this.f45920O, new C12492c(dVar2));
                    m59584s0(jVar2.mo22156a("id")).mo6755u0(m59588w0((List) jVar2.mo22156a("shuffleOrder")));
                    break;
                case 16:
                    m59584s0(jVar2.mo22156a("id")).mo6752k0(((Integer) jVar2.mo22156a("currentIndex")).intValue(), ((Integer) jVar2.mo22156a("newIndex")).intValue(), this.f45920O, new C12490a(dVar2));
                    m59584s0(jVar2.mo22156a("id")).mo6755u0(m59588w0((List) jVar2.mo22156a("shuffleOrder")));
                    break;
                case 17:
                    m59567U0(((Integer) jVar2.mo22156a("contentType")).intValue(), ((Integer) jVar2.mo22156a("flags")).intValue(), ((Integer) jVar2.mo22156a("usage")).intValue());
                    dVar2.success(new HashMap());
                    break;
                case 18:
                    m59575f0((String) jVar2.mo22156a("type"), ((Boolean) jVar2.mo22156a("enabled")).booleanValue());
                    dVar2.success(new HashMap());
                    break;
                case 19:
                    m59560N0(((Double) jVar2.mo22156a("targetGain")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 20:
                    dVar2.success(m59545B0());
                    break;
                case 21:
                    m59546C0(((Integer) jVar2.mo22156a("bandIndex")).intValue(), ((Double) jVar2.mo22156a("gain")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                default:
                    dVar.notImplemented();
                    break;
            }
        } catch (IllegalStateException e) {
            IllegalStateException illegalStateException = e;
            illegalStateException.printStackTrace();
            dVar2.error("Illegal state: " + illegalStateException.getMessage(), (String) null, (Object) null);
        } catch (Exception e2) {
            Exception exc = e2;
            exc.printStackTrace();
            dVar2.error("Error: " + exc, (String) null, (Object) null);
        } catch (Throwable th) {
            Throwable th2 = th;
            m59579i0();
            throw th2;
        }
        m59579i0();
    }

    /* renamed from: p */
    public /* synthetic */ void mo184p(C6076z zVar) {
        C6293w2.m37111C(this, zVar);
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo185p0(boolean z) {
        C6293w2.m37121i(this, z);
    }

    /* renamed from: s */
    public /* synthetic */ void mo186s(List list) {
        C6293w2.m37115c(this, list);
    }

    /* renamed from: x0 */
    public void mo37289x0() {
        if (this.f45926e == C12496c.loading) {
            m59562P();
        }
        C6556k.C6561d dVar = this.f45934u;
        if (dVar != null) {
            dVar.success(new HashMap());
            this.f45934u = null;
        }
        this.f45936w.clear();
        this.f45918M = null;
        m59581o0();
        C6276s sVar = this.f45915J;
        if (sVar != null) {
            sVar.mo21168a();
            this.f45915J = null;
            this.f45926e = C12496c.none;
            m59577g0();
        }
        this.f45924c.mo22142a();
        this.f45925d.mo22142a();
    }

    /* renamed from: y0 */
    public /* synthetic */ void mo187y0(int i) {
        C6293w2.m37134v(this, i);
    }

    /* renamed from: z */
    public /* synthetic */ void mo188z(int i) {
        C6293w2.m37128p(this, i);
    }
}
