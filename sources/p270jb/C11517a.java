package p270jb;

import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6568r;

/* renamed from: jb.a */
/* compiled from: Pigeon */
public class C11517a {

    /* renamed from: jb.a$a */
    /* compiled from: Pigeon */
    public static class C11518a {

        /* renamed from: a */
        private String f43945a;

        /* renamed from: b */
        private Long f43946b;

        /* renamed from: c */
        private Boolean f43947c;

        /* renamed from: a */
        static C11518a m56303a(Map<String, Object> map) {
            Long l;
            C11518a aVar = new C11518a();
            aVar.mo35543f((String) map.get("documentId"));
            Object obj = map.get("pageNumber");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.mo35544g(l);
            aVar.mo35542e((Boolean) map.get("autoCloseAndroid"));
            return aVar;
        }

        /* renamed from: b */
        public Boolean mo35539b() {
            return this.f43947c;
        }

        /* renamed from: c */
        public String mo35540c() {
            return this.f43945a;
        }

        /* renamed from: d */
        public Long mo35541d() {
            return this.f43946b;
        }

        /* renamed from: e */
        public void mo35542e(Boolean bool) {
            this.f43947c = bool;
        }

        /* renamed from: f */
        public void mo35543f(String str) {
            this.f43945a = str;
        }

        /* renamed from: g */
        public void mo35544g(Long l) {
            this.f43946b = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Map<String, Object> mo35545h() {
            HashMap hashMap = new HashMap();
            hashMap.put("documentId", this.f43945a);
            hashMap.put("pageNumber", this.f43946b);
            hashMap.put("autoCloseAndroid", this.f43947c);
            return hashMap;
        }
    }

    /* renamed from: jb.a$b */
    /* compiled from: Pigeon */
    public static class C11519b {

        /* renamed from: a */
        private String f43948a;

        /* renamed from: b */
        private Double f43949b;

        /* renamed from: c */
        private Double f43950c;

        /* renamed from: a */
        static C11519b m56311a(Map<String, Object> map) {
            C11519b bVar = new C11519b();
            bVar.mo35547c((String) map.get("id"));
            bVar.mo35548d((Double) map.get("width"));
            bVar.mo35546b((Double) map.get("height"));
            return bVar;
        }

        /* renamed from: b */
        public void mo35546b(Double d) {
            this.f43950c = d;
        }

        /* renamed from: c */
        public void mo35547c(String str) {
            this.f43948a = str;
        }

        /* renamed from: d */
        public void mo35548d(Double d) {
            this.f43949b = d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<String, Object> mo35549e() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f43948a);
            hashMap.put("width", this.f43949b);
            hashMap.put("height", this.f43950c);
            return hashMap;
        }
    }

    /* renamed from: jb.a$c */
    /* compiled from: Pigeon */
    public static class C11520c {

        /* renamed from: a */
        private String f43951a;

        /* renamed from: a */
        static C11520c m56316a(Map<String, Object> map) {
            C11520c cVar = new C11520c();
            cVar.mo35551c((String) map.get("id"));
            return cVar;
        }

        /* renamed from: b */
        public String mo35550b() {
            return this.f43951a;
        }

        /* renamed from: c */
        public void mo35551c(String str) {
            this.f43951a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, Object> mo35552d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f43951a);
            return hashMap;
        }
    }

    /* renamed from: jb.a$d */
    /* compiled from: Pigeon */
    public static class C11521d {

        /* renamed from: a */
        private byte[] f43952a;

        /* renamed from: b */
        private String f43953b;

        /* renamed from: a */
        static C11521d m56320a(Map<String, Object> map) {
            C11521d dVar = new C11521d();
            dVar.mo35554c((byte[]) map.get(JsonStorageKeyNames.DATA_KEY));
            dVar.mo35555d((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
            return dVar;
        }

        /* renamed from: b */
        public byte[] mo35553b() {
            return this.f43952a;
        }

        /* renamed from: c */
        public void mo35554c(byte[] bArr) {
            this.f43952a = bArr;
        }

        /* renamed from: d */
        public void mo35555d(String str) {
            this.f43953b = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<String, Object> mo35556e() {
            HashMap hashMap = new HashMap();
            hashMap.put(JsonStorageKeyNames.DATA_KEY, this.f43952a);
            hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.f43953b);
            return hashMap;
        }
    }

    /* renamed from: jb.a$e */
    /* compiled from: Pigeon */
    public static class C11522e {

        /* renamed from: a */
        private String f43954a;

        /* renamed from: b */
        private String f43955b;

        /* renamed from: a */
        static C11522e m56325a(Map<String, Object> map) {
            C11522e eVar = new C11522e();
            eVar.mo35559d((String) map.get("path"));
            eVar.mo35558c((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
            return eVar;
        }

        /* renamed from: b */
        public String mo35557b() {
            return this.f43954a;
        }

        /* renamed from: c */
        public void mo35558c(String str) {
            this.f43955b = str;
        }

        /* renamed from: d */
        public void mo35559d(String str) {
            this.f43954a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<String, Object> mo35560e() {
            HashMap hashMap = new HashMap();
            hashMap.put("path", this.f43954a);
            hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.f43955b);
            return hashMap;
        }
    }

    /* renamed from: jb.a$f */
    /* compiled from: Pigeon */
    public static class C11523f {

        /* renamed from: a */
        private String f43956a;

        /* renamed from: b */
        private Long f43957b;

        /* renamed from: a */
        static C11523f m56330a(Map<String, Object> map) {
            Long l;
            C11523f fVar = new C11523f();
            fVar.mo35561b((String) map.get("id"));
            Object obj = map.get("pagesCount");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fVar.mo35562c(l);
            return fVar;
        }

        /* renamed from: b */
        public void mo35561b(String str) {
            this.f43956a = str;
        }

        /* renamed from: c */
        public void mo35562c(Long l) {
            this.f43957b = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, Object> mo35563d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f43956a);
            hashMap.put("pagesCount", this.f43957b);
            return hashMap;
        }
    }

    /* renamed from: jb.a$g */
    /* compiled from: Pigeon */
    public interface C11524g {
        /* renamed from: a */
        void mo22655a(C11531n nVar);

        /* renamed from: b */
        void mo22656b(C11520c cVar);

        /* renamed from: c */
        void mo22657c(C11518a aVar, C11530m<C11519b> mVar);

        /* renamed from: d */
        void mo22658d(C11521d dVar, C11530m<C11523f> mVar);

        /* renamed from: e */
        void mo22659e(C11527j jVar, C11530m<C11528k> mVar);

        /* renamed from: f */
        void mo22660f(C11520c cVar);

        /* renamed from: g */
        void mo22661g(C11522e eVar, C11530m<C11523f> mVar);

        /* renamed from: h */
        void mo22662h(C11522e eVar, C11530m<C11523f> mVar);

        /* renamed from: i */
        void mo22663i(C11532o oVar, C11530m<Void> mVar);

        /* renamed from: j */
        C11526i mo22664j();

        /* renamed from: k */
        void mo22665k(C11529l lVar, C11530m<Void> mVar);
    }

    /* renamed from: jb.a$h */
    /* compiled from: Pigeon */
    private static class C11525h extends C6568r {

        /* renamed from: d */
        public static final C11525h f43958d = new C11525h();

        private C11525h() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return C11518a.m56303a((Map) mo22175f(byteBuffer));
                case -127:
                    return C11519b.m56311a((Map) mo22175f(byteBuffer));
                case -126:
                    return C11520c.m56316a((Map) mo22175f(byteBuffer));
                case -125:
                    return C11521d.m56320a((Map) mo22175f(byteBuffer));
                case -124:
                    return C11522e.m56325a((Map) mo22175f(byteBuffer));
                case -123:
                    return C11523f.m56330a((Map) mo22175f(byteBuffer));
                case -122:
                    return C11526i.m56347a((Map) mo22175f(byteBuffer));
                case -121:
                    return C11527j.m56350a((Map) mo22175f(byteBuffer));
                case -120:
                    return C11528k.m56376a((Map) mo22175f(byteBuffer));
                case -119:
                    return C11529l.m56382a((Map) mo22175f(byteBuffer));
                case -118:
                    return C11531n.m56391a((Map) mo22175f(byteBuffer));
                case -117:
                    return C11532o.m56395a((Map) mo22175f(byteBuffer));
                default:
                    return super.mo22176g(b, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C11518a) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C11518a) obj).mo35545h());
            } else if (obj instanceof C11519b) {
                byteArrayOutputStream.write(129);
                mo22177p(byteArrayOutputStream, ((C11519b) obj).mo35549e());
            } else if (obj instanceof C11520c) {
                byteArrayOutputStream.write(130);
                mo22177p(byteArrayOutputStream, ((C11520c) obj).mo35552d());
            } else if (obj instanceof C11521d) {
                byteArrayOutputStream.write(131);
                mo22177p(byteArrayOutputStream, ((C11521d) obj).mo35556e());
            } else if (obj instanceof C11522e) {
                byteArrayOutputStream.write(132);
                mo22177p(byteArrayOutputStream, ((C11522e) obj).mo35560e());
            } else if (obj instanceof C11523f) {
                byteArrayOutputStream.write(133);
                mo22177p(byteArrayOutputStream, ((C11523f) obj).mo35563d());
            } else if (obj instanceof C11526i) {
                byteArrayOutputStream.write(134);
                mo22177p(byteArrayOutputStream, ((C11526i) obj).mo35565c());
            } else if (obj instanceof C11527j) {
                byteArrayOutputStream.write(135);
                mo22177p(byteArrayOutputStream, ((C11527j) obj).mo35590z());
            } else if (obj instanceof C11528k) {
                byteArrayOutputStream.write(136);
                mo22177p(byteArrayOutputStream, ((C11528k) obj).mo35595f());
            } else if (obj instanceof C11529l) {
                byteArrayOutputStream.write(137);
                mo22177p(byteArrayOutputStream, ((C11529l) obj).mo35602h());
            } else if (obj instanceof C11531n) {
                byteArrayOutputStream.write(138);
                mo22177p(byteArrayOutputStream, ((C11531n) obj).mo35607d());
            } else if (obj instanceof C11532o) {
                byteArrayOutputStream.write(139);
                mo22177p(byteArrayOutputStream, ((C11532o) obj).mo35613F());
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        }
    }

    /* renamed from: jb.a$i */
    /* compiled from: Pigeon */
    public static class C11526i {

        /* renamed from: a */
        private Long f43959a;

        /* renamed from: a */
        static C11526i m56347a(Map<String, Object> map) {
            Long l;
            C11526i iVar = new C11526i();
            Object obj = map.get("id");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.mo35564b(l);
            return iVar;
        }

        /* renamed from: b */
        public void mo35564b(Long l) {
            this.f43959a = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<String, Object> mo35565c() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f43959a);
            return hashMap;
        }
    }

    /* renamed from: jb.a$j */
    /* compiled from: Pigeon */
    public static class C11527j {

        /* renamed from: a */
        private String f43960a;

        /* renamed from: b */
        private Long f43961b;

        /* renamed from: c */
        private Long f43962c;

        /* renamed from: d */
        private Long f43963d;

        /* renamed from: e */
        private String f43964e;

        /* renamed from: f */
        private Boolean f43965f;

        /* renamed from: g */
        private Long f43966g;

        /* renamed from: h */
        private Long f43967h;

        /* renamed from: i */
        private Long f43968i;

        /* renamed from: j */
        private Long f43969j;

        /* renamed from: k */
        private Long f43970k;

        /* renamed from: l */
        private Boolean f43971l;

        /* renamed from: a */
        static C11527j m56350a(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Long l5;
            Long l6;
            Long l7;
            C11527j jVar = new C11527j();
            jVar.mo35587w((String) map.get("pageId"));
            Object obj = map.get("width");
            Long l8 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.mo35589y(l);
            Object obj2 = map.get("height");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            jVar.mo35586v(l2);
            Object obj3 = map.get("format");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            jVar.mo35585u(l3);
            jVar.mo35578n((String) map.get("backgroundColor"));
            jVar.mo35579o((Boolean) map.get("crop"));
            Object obj4 = map.get("cropX");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            jVar.mo35582r(l4);
            Object obj5 = map.get("cropY");
            if (obj5 == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            jVar.mo35583s(l5);
            Object obj6 = map.get("cropHeight");
            if (obj6 == null) {
                l6 = null;
            } else {
                l6 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            jVar.mo35580p(l6);
            Object obj7 = map.get("cropWidth");
            if (obj7 == null) {
                l7 = null;
            } else {
                l7 = Long.valueOf(obj7 instanceof Integer ? (long) ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            jVar.mo35581q(l7);
            Object obj8 = map.get("quality");
            if (obj8 != null) {
                l8 = Long.valueOf(obj8 instanceof Integer ? (long) ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            jVar.mo35588x(l8);
            jVar.mo35584t((Boolean) map.get("forPrint"));
            return jVar;
        }

        /* renamed from: b */
        public String mo35566b() {
            return this.f43964e;
        }

        /* renamed from: c */
        public Boolean mo35567c() {
            return this.f43965f;
        }

        /* renamed from: d */
        public Long mo35568d() {
            return this.f43968i;
        }

        /* renamed from: e */
        public Long mo35569e() {
            return this.f43969j;
        }

        /* renamed from: f */
        public Long mo35570f() {
            return this.f43966g;
        }

        /* renamed from: g */
        public Long mo35571g() {
            return this.f43967h;
        }

        /* renamed from: h */
        public Boolean mo35572h() {
            return this.f43971l;
        }

        /* renamed from: i */
        public Long mo35573i() {
            return this.f43963d;
        }

        /* renamed from: j */
        public Long mo35574j() {
            return this.f43962c;
        }

        /* renamed from: k */
        public String mo35575k() {
            return this.f43960a;
        }

        /* renamed from: l */
        public Long mo35576l() {
            return this.f43970k;
        }

        /* renamed from: m */
        public Long mo35577m() {
            return this.f43961b;
        }

        /* renamed from: n */
        public void mo35578n(String str) {
            this.f43964e = str;
        }

        /* renamed from: o */
        public void mo35579o(Boolean bool) {
            this.f43965f = bool;
        }

        /* renamed from: p */
        public void mo35580p(Long l) {
            this.f43968i = l;
        }

        /* renamed from: q */
        public void mo35581q(Long l) {
            this.f43969j = l;
        }

        /* renamed from: r */
        public void mo35582r(Long l) {
            this.f43966g = l;
        }

        /* renamed from: s */
        public void mo35583s(Long l) {
            this.f43967h = l;
        }

        /* renamed from: t */
        public void mo35584t(Boolean bool) {
            this.f43971l = bool;
        }

        /* renamed from: u */
        public void mo35585u(Long l) {
            this.f43963d = l;
        }

        /* renamed from: v */
        public void mo35586v(Long l) {
            this.f43962c = l;
        }

        /* renamed from: w */
        public void mo35587w(String str) {
            this.f43960a = str;
        }

        /* renamed from: x */
        public void mo35588x(Long l) {
            this.f43970k = l;
        }

        /* renamed from: y */
        public void mo35589y(Long l) {
            this.f43961b = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public Map<String, Object> mo35590z() {
            HashMap hashMap = new HashMap();
            hashMap.put("pageId", this.f43960a);
            hashMap.put("width", this.f43961b);
            hashMap.put("height", this.f43962c);
            hashMap.put("format", this.f43963d);
            hashMap.put("backgroundColor", this.f43964e);
            hashMap.put("crop", this.f43965f);
            hashMap.put("cropX", this.f43966g);
            hashMap.put("cropY", this.f43967h);
            hashMap.put("cropHeight", this.f43968i);
            hashMap.put("cropWidth", this.f43969j);
            hashMap.put("quality", this.f43970k);
            hashMap.put("forPrint", this.f43971l);
            return hashMap;
        }
    }

    /* renamed from: jb.a$k */
    /* compiled from: Pigeon */
    public static class C11528k {

        /* renamed from: a */
        private Long f43972a;

        /* renamed from: b */
        private Long f43973b;

        /* renamed from: c */
        private String f43974c;

        /* renamed from: d */
        private byte[] f43975d;

        /* renamed from: a */
        static C11528k m56376a(Map<String, Object> map) {
            Long l;
            C11528k kVar = new C11528k();
            Object obj = map.get("width");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            kVar.mo35594e(l);
            Object obj2 = map.get("height");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            kVar.mo35592c(l2);
            kVar.mo35593d((String) map.get("path"));
            kVar.mo35591b((byte[]) map.get(JsonStorageKeyNames.DATA_KEY));
            return kVar;
        }

        /* renamed from: b */
        public void mo35591b(byte[] bArr) {
            this.f43975d = bArr;
        }

        /* renamed from: c */
        public void mo35592c(Long l) {
            this.f43973b = l;
        }

        /* renamed from: d */
        public void mo35593d(String str) {
            this.f43974c = str;
        }

        /* renamed from: e */
        public void mo35594e(Long l) {
            this.f43972a = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, Object> mo35595f() {
            HashMap hashMap = new HashMap();
            hashMap.put("width", this.f43972a);
            hashMap.put("height", this.f43973b);
            hashMap.put("path", this.f43974c);
            hashMap.put(JsonStorageKeyNames.DATA_KEY, this.f43975d);
            return hashMap;
        }
    }

    /* renamed from: jb.a$l */
    /* compiled from: Pigeon */
    public static class C11529l {

        /* renamed from: a */
        private Long f43976a;

        /* renamed from: b */
        private Long f43977b;

        /* renamed from: c */
        private Long f43978c;

        /* renamed from: a */
        static C11529l m56382a(Map<String, Object> map) {
            Long l;
            Long l2;
            C11529l lVar = new C11529l();
            Object obj = map.get("textureId");
            Long l3 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            lVar.mo35600f(l);
            Object obj2 = map.get("width");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            lVar.mo35601g(l2);
            Object obj3 = map.get("height");
            if (obj3 != null) {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            lVar.mo35599e(l3);
            return lVar;
        }

        /* renamed from: b */
        public Long mo35596b() {
            return this.f43978c;
        }

        /* renamed from: c */
        public Long mo35597c() {
            return this.f43976a;
        }

        /* renamed from: d */
        public Long mo35598d() {
            return this.f43977b;
        }

        /* renamed from: e */
        public void mo35599e(Long l) {
            this.f43978c = l;
        }

        /* renamed from: f */
        public void mo35600f(Long l) {
            this.f43976a = l;
        }

        /* renamed from: g */
        public void mo35601g(Long l) {
            this.f43977b = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Map<String, Object> mo35602h() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f43976a);
            hashMap.put("width", this.f43977b);
            hashMap.put("height", this.f43978c);
            return hashMap;
        }
    }

    /* renamed from: jb.a$m */
    /* compiled from: Pigeon */
    public interface C11530m<T> {
        /* renamed from: a */
        void mo35603a(Throwable th);

        void success(T t);
    }

    /* renamed from: jb.a$n */
    /* compiled from: Pigeon */
    public static class C11531n {

        /* renamed from: a */
        private Long f43979a;

        /* renamed from: a */
        static C11531n m56391a(Map<String, Object> map) {
            Long l;
            C11531n nVar = new C11531n();
            Object obj = map.get("id");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            nVar.mo35606c(l);
            return nVar;
        }

        /* renamed from: b */
        public Long mo35605b() {
            return this.f43979a;
        }

        /* renamed from: c */
        public void mo35606c(Long l) {
            this.f43979a = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, Object> mo35607d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f43979a);
            return hashMap;
        }
    }

    /* renamed from: jb.a$o */
    /* compiled from: Pigeon */
    public static class C11532o {

        /* renamed from: a */
        private String f43980a;

        /* renamed from: b */
        private Long f43981b;

        /* renamed from: c */
        private String f43982c;

        /* renamed from: d */
        private Long f43983d;

        /* renamed from: e */
        private Long f43984e;

        /* renamed from: f */
        private Long f43985f;

        /* renamed from: g */
        private String f43986g;

        /* renamed from: h */
        private Long f43987h;

        /* renamed from: i */
        private Long f43988i;

        /* renamed from: j */
        private Long f43989j;

        /* renamed from: k */
        private Long f43990k;

        /* renamed from: l */
        private Double f43991l;

        /* renamed from: m */
        private Double f43992m;

        /* renamed from: n */
        private Long f43993n;

        /* renamed from: o */
        private Long f43994o;

        /* renamed from: p */
        private Boolean f43995p;

        /* renamed from: a */
        static C11532o m56395a(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Long l5;
            Long l6;
            Long l7;
            Long l8;
            Long l9;
            C11532o oVar = new C11532o();
            oVar.mo35632t((String) map.get("documentId"));
            Object obj = map.get("pageNumber");
            Long l10 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            oVar.mo35637y(l);
            oVar.mo35636x((String) map.get("pageId"));
            Object obj2 = map.get("textureId");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            oVar.mo35610C(l2);
            Object obj3 = map.get("width");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            oVar.mo35612E(l3);
            Object obj4 = map.get("height");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            oVar.mo35635w(l4);
            oVar.mo35629q((String) map.get("backgroundColor"));
            Object obj5 = map.get("sourceX");
            if (obj5 == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            oVar.mo35638z(l5);
            Object obj6 = map.get("sourceY");
            if (obj6 == null) {
                l6 = null;
            } else {
                l6 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            oVar.mo35608A(l6);
            Object obj7 = map.get("destinationX");
            if (obj7 == null) {
                l7 = null;
            } else {
                l7 = Long.valueOf(obj7 instanceof Integer ? (long) ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            oVar.mo35630r(l7);
            Object obj8 = map.get("destinationY");
            if (obj8 == null) {
                l8 = null;
            } else {
                l8 = Long.valueOf(obj8 instanceof Integer ? (long) ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            oVar.mo35631s(l8);
            oVar.mo35634v((Double) map.get("fullWidth"));
            oVar.mo35633u((Double) map.get("fullHeight"));
            Object obj9 = map.get("textureWidth");
            if (obj9 == null) {
                l9 = null;
            } else {
                l9 = Long.valueOf(obj9 instanceof Integer ? (long) ((Integer) obj9).intValue() : ((Long) obj9).longValue());
            }
            oVar.mo35611D(l9);
            Object obj10 = map.get("textureHeight");
            if (obj10 != null) {
                l10 = Long.valueOf(obj10 instanceof Integer ? (long) ((Integer) obj10).intValue() : ((Long) obj10).longValue());
            }
            oVar.mo35609B(l10);
            oVar.mo35628p((Boolean) map.get("allowAntiAliasing"));
            return oVar;
        }

        /* renamed from: A */
        public void mo35608A(Long l) {
            this.f43988i = l;
        }

        /* renamed from: B */
        public void mo35609B(Long l) {
            this.f43994o = l;
        }

        /* renamed from: C */
        public void mo35610C(Long l) {
            this.f43983d = l;
        }

        /* renamed from: D */
        public void mo35611D(Long l) {
            this.f43993n = l;
        }

        /* renamed from: E */
        public void mo35612E(Long l) {
            this.f43984e = l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public Map<String, Object> mo35613F() {
            HashMap hashMap = new HashMap();
            hashMap.put("documentId", this.f43980a);
            hashMap.put("pageNumber", this.f43981b);
            hashMap.put("pageId", this.f43982c);
            hashMap.put("textureId", this.f43983d);
            hashMap.put("width", this.f43984e);
            hashMap.put("height", this.f43985f);
            hashMap.put("backgroundColor", this.f43986g);
            hashMap.put("sourceX", this.f43987h);
            hashMap.put("sourceY", this.f43988i);
            hashMap.put("destinationX", this.f43989j);
            hashMap.put("destinationY", this.f43990k);
            hashMap.put("fullWidth", this.f43991l);
            hashMap.put("fullHeight", this.f43992m);
            hashMap.put("textureWidth", this.f43993n);
            hashMap.put("textureHeight", this.f43994o);
            hashMap.put("allowAntiAliasing", this.f43995p);
            return hashMap;
        }

        /* renamed from: b */
        public String mo35614b() {
            return this.f43986g;
        }

        /* renamed from: c */
        public Long mo35615c() {
            return this.f43989j;
        }

        /* renamed from: d */
        public Long mo35616d() {
            return this.f43990k;
        }

        /* renamed from: e */
        public String mo35617e() {
            return this.f43980a;
        }

        /* renamed from: f */
        public Double mo35618f() {
            return this.f43992m;
        }

        /* renamed from: g */
        public Double mo35619g() {
            return this.f43991l;
        }

        /* renamed from: h */
        public Long mo35620h() {
            return this.f43985f;
        }

        /* renamed from: i */
        public Long mo35621i() {
            return this.f43981b;
        }

        /* renamed from: j */
        public Long mo35622j() {
            return this.f43987h;
        }

        /* renamed from: k */
        public Long mo35623k() {
            return this.f43988i;
        }

        /* renamed from: l */
        public Long mo35624l() {
            return this.f43994o;
        }

        /* renamed from: m */
        public Long mo35625m() {
            return this.f43983d;
        }

        /* renamed from: n */
        public Long mo35626n() {
            return this.f43993n;
        }

        /* renamed from: o */
        public Long mo35627o() {
            return this.f43984e;
        }

        /* renamed from: p */
        public void mo35628p(Boolean bool) {
            this.f43995p = bool;
        }

        /* renamed from: q */
        public void mo35629q(String str) {
            this.f43986g = str;
        }

        /* renamed from: r */
        public void mo35630r(Long l) {
            this.f43989j = l;
        }

        /* renamed from: s */
        public void mo35631s(Long l) {
            this.f43990k = l;
        }

        /* renamed from: t */
        public void mo35632t(String str) {
            this.f43980a = str;
        }

        /* renamed from: u */
        public void mo35633u(Double d) {
            this.f43992m = d;
        }

        /* renamed from: v */
        public void mo35634v(Double d) {
            this.f43991l = d;
        }

        /* renamed from: w */
        public void mo35635w(Long l) {
            this.f43985f = l;
        }

        /* renamed from: x */
        public void mo35636x(String str) {
            this.f43982c = str;
        }

        /* renamed from: y */
        public void mo35637y(Long l) {
            this.f43981b = l;
        }

        /* renamed from: z */
        public void mo35638z(Long l) {
            this.f43987h = l;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m56302b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
