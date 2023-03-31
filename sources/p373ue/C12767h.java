package p373ue;

import android.media.AudioAttributes;
import android.media.MediaDataSource;
import android.media.SoundPool;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p243gd.C10349s;

/* renamed from: ue.h */
/* compiled from: WrappedSoundPool.kt */
public final class C12767h extends C12761c {

    /* renamed from: t */
    public static final C12768a f46746t;

    /* renamed from: u */
    private static final SoundPool f46747u;

    /* renamed from: v */
    private static final Map<Integer, C12767h> f46748v = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: w */
    private static final Map<String, List<C12767h>> f46749w = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: b */
    private final String f46750b;

    /* renamed from: c */
    private String f46751c;

    /* renamed from: d */
    private float f46752d = 1.0f;

    /* renamed from: e */
    private float f46753e = 1.0f;

    /* renamed from: f */
    private Integer f46754f;

    /* renamed from: g */
    private Integer f46755g;

    /* renamed from: h */
    private boolean f46756h;

    /* renamed from: i */
    private boolean f46757i;

    /* renamed from: r */
    private boolean f46758r;

    /* renamed from: s */
    private boolean f46759s;

    /* renamed from: ue.h$a */
    /* compiled from: WrappedSoundPool.kt */
    public static final class C12768a {
        private C12768a() {
        }

        public /* synthetic */ C12768a(C11665g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final SoundPool m60544b() {
            if (Build.VERSION.SDK_INT < 21) {
                return new SoundPool(100, 3, 0);
            }
            SoundPool build = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(RecyclerView.UNDEFINED_DURATION).setUsage(14).build()).setMaxStreams(100).build();
            C11669k.m56786d(build, "{\n                val at…   .build()\n            }");
            return build;
        }
    }

    static {
        C12768a aVar = new C12768a((C11665g) null);
        f46746t = aVar;
        SoundPool a = aVar.m60544b();
        f46747u = a;
        a.setOnLoadCompleteListener(C12766g.f46745a);
    }

    public C12767h(String str) {
        C11669k.m56787e(str, "playerId");
        this.f46750b = str;
    }

    /* renamed from: A */
    private final UnsupportedOperationException m60517A(String str) {
        return new UnsupportedOperationException("LOW_LATENCY mode does not support: " + str);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m60519s(SoundPool soundPool, int i, int i2) {
        C1583b bVar = C1583b.f4571a;
        bVar.mo6402b("Loaded " + i);
        Map<Integer, C12767h> map = f46748v;
        C12767h hVar = map.get(Integer.valueOf(i));
        if (hVar != null) {
            map.remove(hVar.f46754f);
            Map<String, List<C12767h>> map2 = f46749w;
            C11669k.m56786d(map2, "urlToPlayers");
            synchronized (map2) {
                List<C12767h> list = map2.get(hVar.f46751c);
                if (list == null) {
                    list = C10522j.m52968d();
                }
                for (C12767h hVar2 : list) {
                    C1583b bVar2 = C1583b.f4571a;
                    bVar2.mo6402b("Marking " + hVar2 + " as loaded");
                    hVar2.f46759s = false;
                    if (hVar2.f46756h) {
                        bVar2.mo6402b("Delayed start of " + hVar2);
                        hVar2.m60524z();
                    }
                }
                C10349s sVar = C10349s.f40964a;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        p317od.C12114b.m58233a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        throw r1;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] m60520t(java.net.URL r7) {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.InputStream r7 = r7.openStream()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003d }
        L_0x000d:
            int r2 = r7.read(r1)     // Catch:{ all -> 0x003d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003d }
            int r3 = r2.intValue()     // Catch:{ all -> 0x003d }
            r4 = 0
            if (r3 <= 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            r5 = 0
            if (r3 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            if (r2 == 0) goto L_0x002e
            int r2 = r2.intValue()     // Catch:{ all -> 0x003d }
            r0.write(r1, r4, r2)     // Catch:{ all -> 0x003d }
            goto L_0x000d
        L_0x002e:
            gd.s r1 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x003d }
            p317od.C12114b.m58233a(r7, r5)
            byte[] r7 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.C11669k.m56786d(r7, r0)
            return r7
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            p317od.C12114b.m58233a(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p373ue.C12767h.m60520t(java.net.URL):byte[]");
    }

    /* renamed from: u */
    private final String m60521u(String str, boolean z) {
        if (!z) {
            return m60522x(str).getAbsolutePath();
        }
        if (str != null) {
            return C13011o.m61274N(str, "file://");
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        p317od.C12114b.m58233a(r1, r3);
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File m60522x(java.lang.String r3) {
        /*
            r2 = this;
            java.net.URI r3 = java.net.URI.create(r3)
            java.net.URL r3 = r3.toURL()
            java.lang.String r0 = "create(url).toURL()"
            kotlin.jvm.internal.C11669k.m56786d(r3, r0)
            byte[] r3 = r2.m60520t(r3)
            java.lang.String r0 = "sound"
            java.lang.String r1 = ""
            java.io.File r0 = java.io.File.createTempFile(r0, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r3)     // Catch:{ all -> 0x0030 }
            r0.deleteOnExit()     // Catch:{ all -> 0x0030 }
            gd.s r3 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x0030 }
            r3 = 0
            p317od.C12114b.m58233a(r1, r3)
            java.lang.String r3 = "tempFile"
            kotlin.jvm.internal.C11669k.m56786d(r0, r3)
            return r0
        L_0x0030:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            p317od.C12114b.m58233a(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p373ue.C12767h.m60522x(java.lang.String):java.io.File");
    }

    /* renamed from: y */
    private final int m60523y() {
        return this.f46758r ? -1 : 0;
    }

    /* renamed from: z */
    private final void m60524z() {
        mo37708m((double) this.f46753e);
        if (this.f46757i) {
            Integer num = this.f46755g;
            if (num != null) {
                f46747u.resume(num.intValue());
            }
            this.f46757i = false;
            return;
        }
        Integer num2 = this.f46754f;
        if (num2 != null) {
            int intValue = num2.intValue();
            SoundPool soundPool = f46747u;
            float f = this.f46752d;
            this.f46755g = Integer.valueOf(soundPool.play(intValue, f, f, 0, m60523y(), 1.0f));
        }
    }

    /* renamed from: a */
    public void mo37697a(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Integer mo37698b() {
        return (Integer) mo37721v();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Integer mo37699c() {
        return (Integer) mo37722w();
    }

    /* renamed from: d */
    public String mo37700d() {
        return this.f46750b;
    }

    /* renamed from: e */
    public boolean mo37701e() {
        return false;
    }

    /* renamed from: g */
    public void mo37702g() {
        Integer num;
        if (this.f46756h && (num = this.f46755g) != null) {
            f46747u.pause(num.intValue());
        }
        this.f46756h = false;
        this.f46757i = true;
    }

    /* renamed from: h */
    public void mo37703h() {
        if (!this.f46759s) {
            m60524z();
        }
        this.f46756h = true;
        this.f46757i = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37704i() {
        /*
            r5 = this;
            r5.mo37712q()
            java.lang.Integer r0 = r5.f46754f
            if (r0 == 0) goto L_0x005d
            int r0 = r0.intValue()
            java.lang.String r1 = r5.f46751c
            if (r1 != 0) goto L_0x0010
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.util.List<ue.h>> r2 = f46749w
            java.lang.String r3 = "urlToPlayers"
            kotlin.jvm.internal.C11669k.m56786d(r2, r3)
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r1)     // Catch:{ all -> 0x005a }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x005a }
            if (r3 != 0) goto L_0x0022
            monitor-exit(r2)
            return
        L_0x0022:
            java.lang.Object r4 = p252hd.C10530r.m52990w(r3)     // Catch:{ all -> 0x005a }
            if (r4 != r5) goto L_0x0055
            r2.remove(r1)     // Catch:{ all -> 0x005a }
            android.media.SoundPool r1 = f46747u     // Catch:{ all -> 0x005a }
            r1.unload(r0)     // Catch:{ all -> 0x005a }
            java.util.Map<java.lang.Integer, ue.h> r1 = f46748v     // Catch:{ all -> 0x005a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005a }
            r1.remove(r3)     // Catch:{ all -> 0x005a }
            r1 = 0
            r5.f46754f = r1     // Catch:{ all -> 0x005a }
            b r1 = p000.C1583b.f4571a     // Catch:{ all -> 0x005a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r3.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "unloaded soundId "
            r3.append(r4)     // Catch:{ all -> 0x005a }
            r3.append(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x005a }
            r1.mo6402b(r0)     // Catch:{ all -> 0x005a }
            gd.s r0 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x0055:
            r3.remove(r5)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r2)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p373ue.C12767h.mo37704i():void");
    }

    /* renamed from: j */
    public void mo37705j(int i) {
        throw m60517A("seek");
    }

    /* renamed from: k */
    public void mo37706k(MediaDataSource mediaDataSource) {
        throw m60517A("setDataSource");
    }

    /* renamed from: l */
    public void mo37707l(String str) {
        C11669k.m56787e(str, "playingRoute");
        throw m60517A("setPlayingRoute");
    }

    /* renamed from: m */
    public void mo37708m(double d) {
        this.f46753e = (float) d;
        Integer num = this.f46755g;
        if (num != null && num != null) {
            f46747u.setRate(num.intValue(), this.f46753e);
        }
    }

    /* renamed from: n */
    public void mo37709n(C12763d dVar) {
        Integer num;
        C11669k.m56787e(dVar, "releaseMode");
        this.f46758r = dVar == C12763d.LOOP;
        if (this.f46756h && (num = this.f46755g) != null) {
            f46747u.setLoop(num.intValue(), m60523y());
        }
    }

    /* renamed from: o */
    public void mo37710o(String str, boolean z) {
        C11669k.m56787e(str, "url");
        String str2 = this.f46751c;
        if (str2 == null || !C11669k.m56783a(str2, str)) {
            if (this.f46754f != null) {
                mo37704i();
            }
            Map<String, List<C12767h>> map = f46749w;
            C11669k.m56786d(map, "urlToPlayers");
            synchronized (map) {
                this.f46751c = str;
                C11669k.m56786d(map, "urlToPlayers");
                List<C12767h> list = map.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(str, list);
                }
                List list2 = list;
                C12767h hVar = (C12767h) C10530r.m52981n(list2);
                if (hVar != null) {
                    this.f46759s = hVar.f46759s;
                    this.f46754f = hVar.f46754f;
                    C1583b bVar = C1583b.f4571a;
                    bVar.mo6402b("Reusing soundId " + this.f46754f + " for " + str + " is loading=" + this.f46759s + ' ' + this);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f46759s = true;
                    this.f46754f = Integer.valueOf(f46747u.load(m60521u(str, z), 1));
                    Map<Integer, C12767h> map2 = f46748v;
                    C11669k.m56786d(map2, "soundIdToPlayer");
                    map2.put(this.f46754f, this);
                    C1583b bVar2 = C1583b.f4571a;
                    bVar2.mo6402b("time to call load() for " + str + ": " + (System.currentTimeMillis() - currentTimeMillis) + " player=" + this);
                }
                list2.add(this);
            }
        }
    }

    /* renamed from: p */
    public void mo37711p(double d) {
        Integer num;
        this.f46752d = (float) d;
        if (this.f46756h && (num = this.f46755g) != null) {
            int intValue = num.intValue();
            SoundPool soundPool = f46747u;
            float f = this.f46752d;
            soundPool.setVolume(intValue, f, f);
        }
    }

    /* renamed from: q */
    public void mo37712q() {
        if (this.f46756h) {
            Integer num = this.f46755g;
            if (num != null) {
                f46747u.stop(num.intValue());
            }
            this.f46756h = false;
        }
        this.f46757i = false;
    }

    /* renamed from: v */
    public Void mo37721v() {
        throw m60517A("getDuration");
    }

    /* renamed from: w */
    public Void mo37722w() {
        throw m60517A("getDuration");
    }
}
