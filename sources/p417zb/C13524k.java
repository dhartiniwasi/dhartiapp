package p417zb;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.k */
/* compiled from: PlatformViewsChannel */
public class C13524k {

    /* renamed from: a */
    private final C6556k f47963a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13532g f47964b;

    /* renamed from: c */
    private final C6556k.C6560c f47965c;

    /* renamed from: zb.k$a */
    /* compiled from: PlatformViewsChannel */
    class C13525a implements C6556k.C6560c {
        C13525a() {
        }

        /* renamed from: b */
        private void m62689b(C6555j jVar, C6556k.C6561d dVar) {
            try {
                C13524k.this.f47964b.mo34318h(((Integer) jVar.mo22157b()).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e) {
                dVar.error("error", C13524k.m62685c(e), (Object) null);
            }
        }

        /* renamed from: c */
        private void m62690c(C6555j jVar, C6556k.C6561d dVar) {
            C13528d.C13529a aVar;
            C6556k.C6561d dVar2 = dVar;
            Map map = (Map) jVar.mo22157b();
            boolean z = true;
            boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            if (z2) {
                try {
                    C13524k.this.f47964b.mo34316f(new C13528d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), C13528d.C13529a.HYBRID_ONLY, wrap));
                    dVar2.success((Object) null);
                } catch (IllegalStateException e) {
                    dVar2.error("error", C13524k.m62685c(e), (Object) null);
                }
            } else {
                if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z = false;
                }
                if (z) {
                    aVar = C13528d.C13529a.TEXTURE_WITH_HYBRID_FALLBACK;
                } else {
                    aVar = C13528d.C13529a.TEXTURE_WITH_VIRTUAL_FALLBACK;
                }
                C13528d.C13529a aVar2 = aVar;
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d = ((Double) map.get("left")).doubleValue();
                }
                long c = C13524k.this.f47964b.mo34313c(new C13528d(intValue, str, doubleValue, d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), aVar2, wrap));
                if (c != -2) {
                    dVar2.success(Long.valueOf(c));
                } else if (z) {
                    dVar2.success((Object) null);
                } else {
                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                }
            }
        }

        /* renamed from: d */
        private void m62691d(C6555j jVar, C6556k.C6561d dVar) {
            try {
                C13524k.this.f47964b.mo34319i(((Integer) ((Map) jVar.mo22157b()).get("id")).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e) {
                dVar.error("error", C13524k.m62685c(e), (Object) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m62692e(C6556k.C6561d dVar, C13527c cVar) {
            if (cVar == null) {
                dVar.error("error", "Failed to resize the platform view", (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf((double) cVar.f47967a));
            hashMap.put("height", Double.valueOf((double) cVar.f47968b));
            dVar.success(hashMap);
        }

        /* renamed from: f */
        private void m62693f(C6555j jVar, C6556k.C6561d dVar) {
            Map map = (Map) jVar.mo22157b();
            try {
                C13524k.this.f47964b.mo34317g(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e) {
                dVar.error("error", C13524k.m62685c(e), (Object) null);
            }
        }

        /* renamed from: g */
        private void m62694g(C6555j jVar, C6556k.C6561d dVar) {
            Map map = (Map) jVar.mo22157b();
            try {
                C13524k.this.f47964b.mo34315e(new C13530e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new C13523j(dVar));
            } catch (IllegalStateException e) {
                dVar.error("error", C13524k.m62685c(e), (Object) null);
            }
        }

        /* renamed from: h */
        private void m62695h(C6555j jVar, C6556k.C6561d dVar) {
            Map map = (Map) jVar.mo22157b();
            try {
                C13524k.this.f47964b.mo34312b(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e) {
                dVar.error("error", C13524k.m62685c(e), (Object) null);
            }
        }

        /* renamed from: i */
        private void m62696i(C6555j jVar, C6556k.C6561d dVar) {
            try {
                C13524k.this.f47964b.mo34311a(((Boolean) jVar.mo22157b()).booleanValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e) {
                dVar.error("error", C13524k.m62685c(e), (Object) null);
            }
        }

        /* renamed from: j */
        private void m62697j(C6555j jVar, C6556k.C6561d dVar) {
            C6556k.C6561d dVar2;
            C6556k.C6561d dVar3 = dVar;
            List list = (List) jVar.mo22157b();
            C13531f fVar = r2;
            C13531f fVar2 = fVar;
            C13531f fVar3 = new C13531f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                C13524k.this.f47964b.mo34314d(fVar);
                dVar2 = dVar;
                try {
                    dVar2.success((Object) null);
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2 = dVar;
                dVar2.error("error", C13524k.m62685c(e), (Object) null);
            }
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            if (C13524k.this.f47964b != null) {
                C11881b.m57388f("PlatformViewsChannel", "Received '" + jVar.f30999a + "' message.");
                String str = jVar.f30999a;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        m62690c(jVar, dVar);
                        return;
                    case 1:
                        m62693f(jVar, dVar);
                        return;
                    case 2:
                        m62694g(jVar, dVar);
                        return;
                    case 3:
                        m62689b(jVar, dVar);
                        return;
                    case 4:
                        m62696i(jVar, dVar);
                        return;
                    case 5:
                        m62697j(jVar, dVar);
                        return;
                    case 6:
                        m62695h(jVar, dVar);
                        return;
                    case 7:
                        m62691d(jVar, dVar);
                        return;
                    default:
                        dVar.notImplemented();
                        return;
                }
            }
        }
    }

    /* renamed from: zb.k$b */
    /* compiled from: PlatformViewsChannel */
    public interface C13526b {
        /* renamed from: a */
        void mo38641a(C13527c cVar);
    }

    /* renamed from: zb.k$c */
    /* compiled from: PlatformViewsChannel */
    public static class C13527c {

        /* renamed from: a */
        public final int f47967a;

        /* renamed from: b */
        public final int f47968b;

        public C13527c(int i, int i2) {
            this.f47967a = i;
            this.f47968b = i2;
        }
    }

    /* renamed from: zb.k$d */
    /* compiled from: PlatformViewsChannel */
    public static class C13528d {

        /* renamed from: a */
        public final int f47969a;

        /* renamed from: b */
        public final String f47970b;

        /* renamed from: c */
        public final double f47971c;

        /* renamed from: d */
        public final double f47972d;

        /* renamed from: e */
        public final double f47973e;

        /* renamed from: f */
        public final double f47974f;

        /* renamed from: g */
        public final int f47975g;

        /* renamed from: h */
        public final C13529a f47976h;

        /* renamed from: i */
        public final ByteBuffer f47977i;

        /* renamed from: zb.k$d$a */
        /* compiled from: PlatformViewsChannel */
        public enum C13529a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public C13528d(int i, String str, double d, double d2, double d3, double d4, int i2, C13529a aVar, ByteBuffer byteBuffer) {
            this.f47969a = i;
            this.f47970b = str;
            this.f47973e = d;
            this.f47974f = d2;
            this.f47971c = d3;
            this.f47972d = d4;
            this.f47975g = i2;
            this.f47976h = aVar;
            this.f47977i = byteBuffer;
        }
    }

    /* renamed from: zb.k$e */
    /* compiled from: PlatformViewsChannel */
    public static class C13530e {

        /* renamed from: a */
        public final int f47982a;

        /* renamed from: b */
        public final double f47983b;

        /* renamed from: c */
        public final double f47984c;

        public C13530e(int i, double d, double d2) {
            this.f47982a = i;
            this.f47983b = d;
            this.f47984c = d2;
        }
    }

    /* renamed from: zb.k$f */
    /* compiled from: PlatformViewsChannel */
    public static class C13531f {

        /* renamed from: a */
        public final int f47985a;

        /* renamed from: b */
        public final Number f47986b;

        /* renamed from: c */
        public final Number f47987c;

        /* renamed from: d */
        public final int f47988d;

        /* renamed from: e */
        public final int f47989e;

        /* renamed from: f */
        public final Object f47990f;

        /* renamed from: g */
        public final Object f47991g;

        /* renamed from: h */
        public final int f47992h;

        /* renamed from: i */
        public final int f47993i;

        /* renamed from: j */
        public final float f47994j;

        /* renamed from: k */
        public final float f47995k;

        /* renamed from: l */
        public final int f47996l;

        /* renamed from: m */
        public final int f47997m;

        /* renamed from: n */
        public final int f47998n;

        /* renamed from: o */
        public final int f47999o;

        /* renamed from: p */
        public final long f48000p;

        public C13531f(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f47985a = i;
            this.f47986b = number;
            this.f47987c = number2;
            this.f47988d = i2;
            this.f47989e = i3;
            this.f47990f = obj;
            this.f47991g = obj2;
            this.f47992h = i4;
            this.f47993i = i5;
            this.f47994j = f;
            this.f47995k = f2;
            this.f47996l = i6;
            this.f47997m = i7;
            this.f47998n = i8;
            this.f47999o = i9;
            this.f48000p = j;
        }
    }

    /* renamed from: zb.k$g */
    /* compiled from: PlatformViewsChannel */
    public interface C13532g {
        /* renamed from: a */
        void mo34311a(boolean z);

        /* renamed from: b */
        void mo34312b(int i, int i2);

        /* renamed from: c */
        long mo34313c(C13528d dVar);

        /* renamed from: d */
        void mo34314d(C13531f fVar);

        /* renamed from: e */
        void mo34315e(C13530e eVar, C13526b bVar);

        /* renamed from: f */
        void mo34316f(C13528d dVar);

        /* renamed from: g */
        void mo34317g(int i, double d, double d2);

        /* renamed from: h */
        void mo34318h(int i);

        /* renamed from: i */
        void mo34319i(int i);
    }

    public C13524k(C12051a aVar) {
        C13525a aVar2 = new C13525a();
        this.f47965c = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/platform_views", C6570s.f31014b);
        this.f47963a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m62685c(Exception exc) {
        return C11881b.m57386d(exc);
    }

    /* renamed from: d */
    public void mo38642d(int i) {
        C6556k kVar = this.f47963a;
        if (kVar != null) {
            kVar.mo22159c("viewFocused", Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    public void mo38643e(C13532g gVar) {
        this.f47964b = gVar;
    }
}
