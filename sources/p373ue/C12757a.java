package p373ue;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p186ac.C6555j;
import p186ac.C6556k;
import p243gd.C10346p;
import p351sb.C12502a;

/* renamed from: ue.a */
/* compiled from: AudioplayersPlugin.kt */
public final class C12757a implements C6556k.C6560c, C12502a {

    /* renamed from: g */
    public static final C12758a f46709g = new C12758a((C11665g) null);

    /* renamed from: a */
    private C6556k f46710a;

    /* renamed from: b */
    private Context f46711b;

    /* renamed from: c */
    private final Map<String, C12761c> f46712c = new LinkedHashMap();

    /* renamed from: d */
    private final Handler f46713d = new Handler();

    /* renamed from: e */
    private Runnable f46714e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f46715f;

    /* renamed from: ue.a$a */
    /* compiled from: AudioplayersPlugin.kt */
    public static final class C12758a {
        private C12758a() {
        }

        public /* synthetic */ C12758a(C11665g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final Map<String, Object> m60472c(String str, Object obj) {
            return C10508b0.m52915g(C10346p.m52247a("playerId", str), C10346p.m52247a("value", obj));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final Exception m60473d(String str) {
            return new IllegalArgumentException(str);
        }
    }

    /* renamed from: ue.a$b */
    /* compiled from: AudioplayersPlugin.kt */
    private static final class C12759b implements Runnable {

        /* renamed from: a */
        private final WeakReference<Map<String, C12761c>> f46716a;

        /* renamed from: b */
        private final WeakReference<C6556k> f46717b;

        /* renamed from: c */
        private final WeakReference<Handler> f46718c;

        /* renamed from: d */
        private final WeakReference<C12757a> f46719d;

        public C12759b(Map<String, ? extends C12761c> map, C6556k kVar, Handler handler, C12757a aVar) {
            C11669k.m56787e(map, "mediaPlayers");
            C11669k.m56787e(kVar, "channel");
            C11669k.m56787e(handler, "handler");
            C11669k.m56787e(aVar, "audioplayersPlugin");
            this.f46716a = new WeakReference<>(map);
            this.f46717b = new WeakReference<>(kVar);
            this.f46718c = new WeakReference<>(handler);
            this.f46719d = new WeakReference<>(aVar);
        }

        public void run() {
            Map map = (Map) this.f46716a.get();
            C6556k kVar = (C6556k) this.f46717b.get();
            Handler handler = (Handler) this.f46718c.get();
            C12757a aVar = (C12757a) this.f46719d.get();
            if (map != null && kVar != null && handler != null && aVar != null) {
                boolean z = true;
                for (C12761c cVar : map.values()) {
                    if (cVar.mo37701e()) {
                        try {
                            String d = cVar.mo37700d();
                            Integer c = cVar.mo37699c();
                            Integer b = cVar.mo37698b();
                            C12758a aVar2 = C12757a.f46709g;
                            kVar.mo22159c("audio.onDuration", aVar2.m60472c(d, Integer.valueOf(c != null ? c.intValue() : 0)));
                            kVar.mo22159c("audio.onCurrentPosition", aVar2.m60472c(d, Integer.valueOf(b != null ? b.intValue() : 0)));
                            if (aVar.f46715f) {
                                kVar.mo22159c("audio.onSeekComplete", aVar2.m60472c(cVar.mo37700d(), Boolean.TRUE));
                                aVar.f46715f = false;
                            }
                        } catch (UnsupportedOperationException unused) {
                        }
                        z = false;
                    }
                }
                if (z) {
                    aVar.m60463n();
                } else {
                    handler.postDelayed(this, 200);
                }
            } else if (aVar != null) {
                aVar.m60463n();
            }
        }
    }

    /* renamed from: d */
    private final void m60459d(C6555j jVar, C12761c cVar) {
        Boolean bool = (Boolean) jVar.mo22156a("respectSilence");
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) jVar.mo22156a("stayAwake");
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        boolean booleanValue2 = bool2.booleanValue();
        Boolean bool3 = (Boolean) jVar.mo22156a("duckAudio");
        if (bool3 == null) {
            bool3 = Boolean.FALSE;
        }
        cVar.mo37697a(booleanValue, booleanValue2, bool3.booleanValue());
        Double d = (Double) jVar.mo22156a("volume");
        if (d == null) {
            d = Double.valueOf(1.0d);
        }
        cVar.mo37711p(d.doubleValue());
    }

    /* renamed from: f */
    private final C12761c m60460f(String str, String str2) {
        C12761c cVar;
        Map<String, C12761c> map = this.f46712c;
        C12761c cVar2 = map.get(str);
        if (cVar2 == null) {
            if (C13010n.m61256j(str2, "PlayerMode.MEDIA_PLAYER", true)) {
                cVar = new C12765f(this, str);
            } else {
                cVar = new C12767h(str);
            }
            cVar2 = cVar;
            map.put(str, cVar2);
        }
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025f, code lost:
        r2.success(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0262, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m60461k(p186ac.C6555j r17, p186ac.C6556k.C6561d r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = r1.f30999a
            java.lang.String r4 = "changeLogLevel"
            boolean r3 = kotlin.jvm.internal.C11669k.m56783a(r3, r4)
            r5 = 46
            java.lang.String r6 = "argument<String>(name) ?: return null"
            r7 = 0
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = "value"
            java.lang.Object r1 = r1.mo22156a(r3)
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x0027
            r4 = 0
            goto L_0x0040
        L_0x0027:
            kotlin.jvm.internal.C11669k.m56786d(r10, r6)
            char[] r11 = new char[r8]
            r11[r7] = r5
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            java.util.List r1 = p401xd.C13011o.m61279S(r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = p252hd.C10530r.m52986s(r1)
            java.lang.String r1 = (java.lang.String) r1
            a r4 = p000.C0000a.valueOf(r1)
        L_0x0040:
            if (r4 == 0) goto L_0x004b
            b r1 = p000.C1583b.f4571a
            r1.mo6403e(r4)
            r2.success(r9)
            return
        L_0x004b:
            ue.a$a r1 = f46709g
            java.lang.String r2 = "value is required"
            java.lang.Exception r1 = r1.m60473d(r2)
            throw r1
        L_0x0054:
            java.lang.String r3 = "playerId"
            java.lang.Object r3 = r1.mo22156a(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x005f
            return
        L_0x005f:
            java.lang.String r10 = "mode"
            java.lang.Object r10 = r1.mo22156a(r10)
            java.lang.String r10 = (java.lang.String) r10
            ue.c r3 = r0.m60460f(r3, r10)
            java.lang.String r11 = r1.f30999a
            if (r11 == 0) goto L_0x026c
            int r12 = r11.hashCode()
            java.lang.String r13 = "PlayerMode.LOW_LATENCY"
            java.lang.String r14 = "isLocal"
            java.lang.String r15 = "url"
            java.lang.String r4 = "position"
            switch(r12) {
                case -1904138857: goto L_0x0229;
                case -1757019252: goto L_0x020e;
                case -934426579: goto L_0x0201;
                case -905798227: goto L_0x01dc;
                case -844904701: goto L_0x01ba;
                case -402284771: goto L_0x0194;
                case 3443508: goto L_0x0153;
                case 3526264: goto L_0x012f;
                case 3540994: goto L_0x0120;
                case 85887754: goto L_0x0104;
                case 106440182: goto L_0x00f5;
                case 670514716: goto L_0x00cf;
                case 1090594823: goto L_0x00c0;
                case 2096116872: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x026c
        L_0x0080:
            java.lang.String r4 = "setReleaseMode"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x008a
            goto L_0x026c
        L_0x008a:
            java.lang.String r4 = "releaseMode"
            java.lang.Object r1 = r1.mo22156a(r4)
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x0097
            r4 = 0
            goto L_0x00b0
        L_0x0097:
            kotlin.jvm.internal.C11669k.m56786d(r10, r6)
            char[] r11 = new char[r8]
            r11[r7] = r5
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            java.util.List r1 = p401xd.C13011o.m61279S(r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = p252hd.C10530r.m52986s(r1)
            java.lang.String r1 = (java.lang.String) r1
            ue.d r4 = p373ue.C12763d.valueOf(r1)
        L_0x00b0:
            if (r4 == 0) goto L_0x00b7
            r3.mo37709n(r4)
            goto L_0x025f
        L_0x00b7:
            ue.a$a r1 = f46709g
            java.lang.String r2 = "releaseMode is required"
            java.lang.Exception r1 = r1.m60473d(r2)
            throw r1
        L_0x00c0:
            java.lang.String r1 = "release"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x00ca
            goto L_0x026c
        L_0x00ca:
            r3.mo37704i()
            goto L_0x025f
        L_0x00cf:
            java.lang.String r4 = "setVolume"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x00d9
            goto L_0x026c
        L_0x00d9:
            java.lang.String r4 = "volume"
            java.lang.Object r1 = r1.mo22156a(r4)
            java.lang.Double r1 = (java.lang.Double) r1
            if (r1 == 0) goto L_0x00ec
            double r4 = r1.doubleValue()
            r3.mo37711p(r4)
            goto L_0x025f
        L_0x00ec:
            ue.a$a r1 = f46709g
            java.lang.String r2 = "volume is required"
            java.lang.Exception r1 = r1.m60473d(r2)
            throw r1
        L_0x00f5:
            java.lang.String r1 = "pause"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x00ff
            goto L_0x026c
        L_0x00ff:
            r3.mo37702g()
            goto L_0x025f
        L_0x0104:
            java.lang.String r1 = "getDuration"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x010e
            goto L_0x026c
        L_0x010e:
            java.lang.Integer r1 = r3.mo37699c()
            if (r1 == 0) goto L_0x0118
            int r7 = r1.intValue()
        L_0x0118:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2.success(r1)
            return
        L_0x0120:
            java.lang.String r1 = "stop"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x012a
            goto L_0x026c
        L_0x012a:
            r3.mo37712q()
            goto L_0x025f
        L_0x012f:
            java.lang.String r5 = "seek"
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x0139
            goto L_0x026c
        L_0x0139:
            java.lang.Object r1 = r1.mo22156a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x014a
            int r1 = r1.intValue()
            r3.mo37705j(r1)
            goto L_0x025f
        L_0x014a:
            ue.a$a r1 = f46709g
            java.lang.String r2 = "position is required"
            java.lang.Exception r1 = r1.m60473d(r2)
            throw r1
        L_0x0153:
            java.lang.String r5 = "play"
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x015d
            goto L_0x026c
        L_0x015d:
            r0.m60459d(r1, r3)
            java.lang.Object r5 = r1.mo22156a(r15)
            kotlin.jvm.internal.C11669k.m56784b(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.mo22156a(r14)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 != 0) goto L_0x0173
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L_0x0173:
            boolean r6 = r6.booleanValue()
            r3.mo37710o(r5, r6)
            java.lang.Object r1 = r1.mo22156a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x018f
            boolean r4 = kotlin.jvm.internal.C11669k.m56783a(r10, r13)
            if (r4 != 0) goto L_0x018f
            int r1 = r1.intValue()
            r3.mo37705j(r1)
        L_0x018f:
            r3.mo37703h()
            goto L_0x025f
        L_0x0194:
            java.lang.String r4 = "setPlaybackRate"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x019e
            goto L_0x026c
        L_0x019e:
            java.lang.String r4 = "playbackRate"
            java.lang.Object r1 = r1.mo22156a(r4)
            java.lang.Double r1 = (java.lang.Double) r1
            if (r1 == 0) goto L_0x01b1
            double r4 = r1.doubleValue()
            r3.mo37708m(r4)
            goto L_0x025f
        L_0x01b1:
            ue.a$a r1 = f46709g
            java.lang.String r2 = "playbackRate is required"
            java.lang.Exception r1 = r1.m60473d(r2)
            throw r1
        L_0x01ba:
            java.lang.String r4 = "earpieceOrSpeakersToggle"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x01c4
            goto L_0x026c
        L_0x01c4:
            java.lang.String r4 = "playingRoute"
            java.lang.Object r1 = r1.mo22156a(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x01d3
            r3.mo37707l(r1)
            goto L_0x025f
        L_0x01d3:
            ue.a$a r1 = f46709g
            java.lang.String r2 = "playingRoute is required"
            java.lang.Exception r1 = r1.m60473d(r2)
            throw r1
        L_0x01dc:
            java.lang.String r4 = "setUrl"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x01e6
            goto L_0x026c
        L_0x01e6:
            java.lang.Object r4 = r1.mo22156a(r15)
            kotlin.jvm.internal.C11669k.m56784b(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.mo22156a(r14)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L_0x01f9
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x01f9:
            boolean r1 = r1.booleanValue()
            r3.mo37710o(r4, r1)
            goto L_0x025f
        L_0x0201:
            java.lang.String r1 = "resume"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x020a
            goto L_0x026c
        L_0x020a:
            r3.mo37703h()
            goto L_0x025f
        L_0x020e:
            java.lang.String r1 = "getCurrentPosition"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0217
            goto L_0x026c
        L_0x0217:
            java.lang.Integer r1 = r3.mo37698b()
            if (r1 == 0) goto L_0x0221
            int r7 = r1.intValue()
        L_0x0221:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2.success(r1)
            return
        L_0x0229:
            java.lang.String r5 = "playBytes"
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x0232
            goto L_0x026c
        L_0x0232:
            r0.m60459d(r1, r3)
            java.lang.String r5 = "bytes"
            java.lang.Object r5 = r1.mo22156a(r5)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L_0x0263
            ue.b r6 = new ue.b
            r6.<init>(r5)
            r3.mo37706k(r6)
            java.lang.Object r1 = r1.mo22156a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x025c
            boolean r4 = kotlin.jvm.internal.C11669k.m56783a(r10, r13)
            if (r4 != 0) goto L_0x025c
            int r1 = r1.intValue()
            r3.mo37705j(r1)
        L_0x025c:
            r3.mo37703h()
        L_0x025f:
            r2.success(r9)
            return
        L_0x0263:
            ue.a$a r1 = f46709g
            java.lang.String r2 = "bytes are required"
            java.lang.Exception r1 = r1.m60473d(r2)
            throw r1
        L_0x026c:
            r18.notImplemented()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p373ue.C12757a.m60461k(ac.j, ac.k$d):void");
    }

    /* renamed from: m */
    private final void m60462m() {
        if (this.f46714e == null) {
            Map<String, C12761c> map = this.f46712c;
            C6556k kVar = this.f46710a;
            if (kVar == null) {
                C11669k.m56797o("channel");
                kVar = null;
            }
            C12759b bVar = new C12759b(map, kVar, this.f46713d, this);
            this.f46713d.post(bVar);
            this.f46714e = bVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m60463n() {
        this.f46714e = null;
        this.f46713d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: e */
    public final Context mo37687e() {
        Context context = this.f46711b;
        if (context == null) {
            C11669k.m56797o("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        C11669k.m56786d(applicationContext, "context.applicationContext");
        return applicationContext;
    }

    /* renamed from: g */
    public final void mo37688g(C12761c cVar) {
        C11669k.m56787e(cVar, "player");
        C6556k kVar = this.f46710a;
        if (kVar == null) {
            C11669k.m56797o("channel");
            kVar = null;
        }
        kVar.mo22159c("audio.onComplete", f46709g.m60472c(cVar.mo37700d(), Boolean.TRUE));
    }

    /* renamed from: h */
    public final void mo37689h(C12761c cVar) {
        C11669k.m56787e(cVar, "player");
        C6556k kVar = this.f46710a;
        if (kVar == null) {
            C11669k.m56797o("channel");
            kVar = null;
        }
        C12758a aVar = f46709g;
        String d = cVar.mo37700d();
        Integer c = cVar.mo37699c();
        kVar.mo22159c("audio.onDuration", aVar.m60472c(d, Integer.valueOf(c != null ? c.intValue() : 0)));
    }

    /* renamed from: i */
    public final void mo37690i(C12761c cVar, String str) {
        C11669k.m56787e(cVar, "player");
        C11669k.m56787e(str, "message");
        C6556k kVar = this.f46710a;
        if (kVar == null) {
            C11669k.m56797o("channel");
            kVar = null;
        }
        kVar.mo22159c("audio.onError", f46709g.m60472c(cVar.mo37700d(), str));
    }

    /* renamed from: j */
    public final void mo37691j() {
        m60462m();
    }

    /* renamed from: l */
    public final void mo37692l() {
        this.f46715f = true;
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        this.f46710a = new C6556k(bVar.mo37293b(), "xyz.luan/audioplayers");
        Context a = bVar.mo37292a();
        C11669k.m56786d(a, "binding.applicationContext");
        this.f46711b = a;
        this.f46715f = false;
        C6556k kVar = this.f46710a;
        if (kVar == null) {
            C11669k.m56797o("channel");
            kVar = null;
        }
        kVar.mo22161e(this);
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "response");
        try {
            m60461k(jVar, dVar);
        } catch (Exception e) {
            C1583b.f4571a.mo6401a("Unexpected error!", e);
            dVar.error("Unexpected error!", e.getMessage(), e);
        }
    }
}
