package p316oc;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6568r;

/* renamed from: oc.b */
/* compiled from: Messages */
public class C12074b {

    /* renamed from: oc.b$b */
    /* compiled from: Messages */
    public interface C12076b {
        /* renamed from: a */
        void mo36447a(C12086j jVar);

        /* renamed from: b */
        void mo36448b(C12084i iVar);

        /* renamed from: c */
        void mo36449c(C12084i iVar);

        /* renamed from: d */
        void mo36450d(C12082h hVar);

        /* renamed from: e */
        void mo36451e(C12079e eVar);

        /* renamed from: f */
        void mo36452f(C12080f fVar);

        /* renamed from: g */
        void mo36453g(C12084i iVar);

        /* renamed from: h */
        void mo36454h(C12081g gVar);

        /* renamed from: i */
        C12084i mo36455i(C12078d dVar);

        void initialize();

        /* renamed from: j */
        C12082h mo36457j(C12084i iVar);
    }

    /* renamed from: oc.b$c */
    /* compiled from: Messages */
    private static class C12077c extends C6568r {

        /* renamed from: d */
        public static final C12077c f45102d = new C12077c();

        private C12077c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return C12078d.m58074a((Map) mo22175f(byteBuffer));
                case -127:
                    return C12079e.m58086a((Map) mo22175f(byteBuffer));
                case -126:
                    return C12080f.m58092a((Map) mo22175f(byteBuffer));
                case -125:
                    return C12081g.m58096a((Map) mo22175f(byteBuffer));
                case -124:
                    return C12082h.m58102a((Map) mo22175f(byteBuffer));
                case -123:
                    return C12084i.m58111a((Map) mo22175f(byteBuffer));
                case -122:
                    return C12086j.m58117a((Map) mo22175f(byteBuffer));
                default:
                    return super.mo22176g(b, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C12078d) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C12078d) obj).mo36468l());
            } else if (obj instanceof C12079e) {
                byteArrayOutputStream.write(129);
                mo22177p(byteArrayOutputStream, ((C12079e) obj).mo36473f());
            } else if (obj instanceof C12080f) {
                byteArrayOutputStream.write(130);
                mo22177p(byteArrayOutputStream, ((C12080f) obj).mo36476d());
            } else if (obj instanceof C12081g) {
                byteArrayOutputStream.write(131);
                mo22177p(byteArrayOutputStream, ((C12081g) obj).mo36481f());
            } else if (obj instanceof C12082h) {
                byteArrayOutputStream.write(132);
                mo22177p(byteArrayOutputStream, ((C12082h) obj).mo36486f());
            } else if (obj instanceof C12084i) {
                byteArrayOutputStream.write(133);
                mo22177p(byteArrayOutputStream, ((C12084i) obj).mo36492d());
            } else if (obj instanceof C12086j) {
                byteArrayOutputStream.write(134);
                mo22177p(byteArrayOutputStream, ((C12086j) obj).mo36499f());
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        }
    }

    /* renamed from: oc.b$d */
    /* compiled from: Messages */
    public static class C12078d {

        /* renamed from: a */
        private String f45103a;

        /* renamed from: b */
        private String f45104b;

        /* renamed from: c */
        private String f45105c;

        /* renamed from: d */
        private String f45106d;

        /* renamed from: e */
        private Map<String, String> f45107e;

        private C12078d() {
        }

        /* renamed from: a */
        static C12078d m58074a(Map<String, Object> map) {
            C12078d dVar = new C12078d();
            dVar.mo36463g((String) map.get("asset"));
            dVar.mo36467k((String) map.get("uri"));
            dVar.mo36466j((String) map.get("packageName"));
            dVar.mo36464h((String) map.get("formatHint"));
            dVar.mo36465i((Map) map.get("httpHeaders"));
            return dVar;
        }

        /* renamed from: b */
        public String mo36458b() {
            return this.f45103a;
        }

        /* renamed from: c */
        public String mo36459c() {
            return this.f45106d;
        }

        /* renamed from: d */
        public Map<String, String> mo36460d() {
            return this.f45107e;
        }

        /* renamed from: e */
        public String mo36461e() {
            return this.f45105c;
        }

        /* renamed from: f */
        public String mo36462f() {
            return this.f45104b;
        }

        /* renamed from: g */
        public void mo36463g(String str) {
            this.f45103a = str;
        }

        /* renamed from: h */
        public void mo36464h(String str) {
            this.f45106d = str;
        }

        /* renamed from: i */
        public void mo36465i(Map<String, String> map) {
            if (map != null) {
                this.f45107e = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
        }

        /* renamed from: j */
        public void mo36466j(String str) {
            this.f45105c = str;
        }

        /* renamed from: k */
        public void mo36467k(String str) {
            this.f45104b = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Map<String, Object> mo36468l() {
            HashMap hashMap = new HashMap();
            hashMap.put("asset", this.f45103a);
            hashMap.put("uri", this.f45104b);
            hashMap.put("packageName", this.f45105c);
            hashMap.put("formatHint", this.f45106d);
            hashMap.put("httpHeaders", this.f45107e);
            return hashMap;
        }
    }

    /* renamed from: oc.b$e */
    /* compiled from: Messages */
    public static class C12079e {

        /* renamed from: a */
        private Long f45108a;

        /* renamed from: b */
        private Boolean f45109b;

        private C12079e() {
        }

        /* renamed from: a */
        static C12079e m58086a(Map<String, Object> map) {
            Long l;
            C12079e eVar = new C12079e();
            Object obj = map.get("textureId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eVar.mo36472e(l);
            eVar.mo36471d((Boolean) map.get("isLooping"));
            return eVar;
        }

        /* renamed from: b */
        public Boolean mo36469b() {
            return this.f45109b;
        }

        /* renamed from: c */
        public Long mo36470c() {
            return this.f45108a;
        }

        /* renamed from: d */
        public void mo36471d(Boolean bool) {
            if (bool != null) {
                this.f45109b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isLooping\" is null.");
        }

        /* renamed from: e */
        public void mo36472e(Long l) {
            if (l != null) {
                this.f45108a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, Object> mo36473f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f45108a);
            hashMap.put("isLooping", this.f45109b);
            return hashMap;
        }
    }

    /* renamed from: oc.b$f */
    /* compiled from: Messages */
    public static class C12080f {

        /* renamed from: a */
        private Boolean f45110a;

        private C12080f() {
        }

        /* renamed from: a */
        static C12080f m58092a(Map<String, Object> map) {
            C12080f fVar = new C12080f();
            fVar.mo36475c((Boolean) map.get("mixWithOthers"));
            return fVar;
        }

        /* renamed from: b */
        public Boolean mo36474b() {
            return this.f45110a;
        }

        /* renamed from: c */
        public void mo36475c(Boolean bool) {
            if (bool != null) {
                this.f45110a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mixWithOthers\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, Object> mo36476d() {
            HashMap hashMap = new HashMap();
            hashMap.put("mixWithOthers", this.f45110a);
            return hashMap;
        }
    }

    /* renamed from: oc.b$g */
    /* compiled from: Messages */
    public static class C12081g {

        /* renamed from: a */
        private Long f45111a;

        /* renamed from: b */
        private Double f45112b;

        private C12081g() {
        }

        /* renamed from: a */
        static C12081g m58096a(Map<String, Object> map) {
            Long l;
            C12081g gVar = new C12081g();
            Object obj = map.get("textureId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            gVar.mo36480e(l);
            gVar.mo36479d((Double) map.get("speed"));
            return gVar;
        }

        /* renamed from: b */
        public Double mo36477b() {
            return this.f45112b;
        }

        /* renamed from: c */
        public Long mo36478c() {
            return this.f45111a;
        }

        /* renamed from: d */
        public void mo36479d(Double d) {
            if (d != null) {
                this.f45112b = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"speed\" is null.");
        }

        /* renamed from: e */
        public void mo36480e(Long l) {
            if (l != null) {
                this.f45111a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, Object> mo36481f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f45111a);
            hashMap.put("speed", this.f45112b);
            return hashMap;
        }
    }

    /* renamed from: oc.b$h */
    /* compiled from: Messages */
    public static class C12082h {

        /* renamed from: a */
        private Long f45113a;

        /* renamed from: b */
        private Long f45114b;

        /* renamed from: oc.b$h$a */
        /* compiled from: Messages */
        public static class C12083a {

            /* renamed from: a */
            private Long f45115a;

            /* renamed from: b */
            private Long f45116b;

            /* renamed from: a */
            public C12082h mo36487a() {
                C12082h hVar = new C12082h();
                hVar.mo36485e(this.f45115a);
                hVar.mo36484d(this.f45116b);
                return hVar;
            }

            /* renamed from: b */
            public C12083a mo36488b(Long l) {
                this.f45116b = l;
                return this;
            }

            /* renamed from: c */
            public C12083a mo36489c(Long l) {
                this.f45115a = l;
                return this;
            }
        }

        /* renamed from: a */
        static C12082h m58102a(Map<String, Object> map) {
            Long l;
            C12082h hVar = new C12082h();
            Object obj = map.get("textureId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hVar.mo36485e(l);
            Object obj2 = map.get("position");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            hVar.mo36484d(l2);
            return hVar;
        }

        /* renamed from: b */
        public Long mo36482b() {
            return this.f45114b;
        }

        /* renamed from: c */
        public Long mo36483c() {
            return this.f45113a;
        }

        /* renamed from: d */
        public void mo36484d(Long l) {
            if (l != null) {
                this.f45114b = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"position\" is null.");
        }

        /* renamed from: e */
        public void mo36485e(Long l) {
            if (l != null) {
                this.f45113a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, Object> mo36486f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f45113a);
            hashMap.put("position", this.f45114b);
            return hashMap;
        }

        private C12082h() {
        }
    }

    /* renamed from: oc.b$i */
    /* compiled from: Messages */
    public static class C12084i {

        /* renamed from: a */
        private Long f45117a;

        /* renamed from: oc.b$i$a */
        /* compiled from: Messages */
        public static class C12085a {

            /* renamed from: a */
            private Long f45118a;

            /* renamed from: a */
            public C12084i mo36493a() {
                C12084i iVar = new C12084i();
                iVar.mo36491c(this.f45118a);
                return iVar;
            }

            /* renamed from: b */
            public C12085a mo36494b(Long l) {
                this.f45118a = l;
                return this;
            }
        }

        /* renamed from: a */
        static C12084i m58111a(Map<String, Object> map) {
            Long l;
            C12084i iVar = new C12084i();
            Object obj = map.get("textureId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.mo36491c(l);
            return iVar;
        }

        /* renamed from: b */
        public Long mo36490b() {
            return this.f45117a;
        }

        /* renamed from: c */
        public void mo36491c(Long l) {
            if (l != null) {
                this.f45117a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, Object> mo36492d() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f45117a);
            return hashMap;
        }

        private C12084i() {
        }
    }

    /* renamed from: oc.b$j */
    /* compiled from: Messages */
    public static class C12086j {

        /* renamed from: a */
        private Long f45119a;

        /* renamed from: b */
        private Double f45120b;

        private C12086j() {
        }

        /* renamed from: a */
        static C12086j m58117a(Map<String, Object> map) {
            Long l;
            C12086j jVar = new C12086j();
            Object obj = map.get("textureId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.mo36497d(l);
            jVar.mo36498e((Double) map.get("volume"));
            return jVar;
        }

        /* renamed from: b */
        public Long mo36495b() {
            return this.f45119a;
        }

        /* renamed from: c */
        public Double mo36496c() {
            return this.f45120b;
        }

        /* renamed from: d */
        public void mo36497d(Long l) {
            if (l != null) {
                this.f45119a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* renamed from: e */
        public void mo36498e(Double d) {
            if (d != null) {
                this.f45120b = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"volume\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, Object> mo36499f() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f45119a);
            hashMap.put("volume", this.f45120b);
            return hashMap;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m58061b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
