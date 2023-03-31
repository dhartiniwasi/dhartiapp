package p264io.flutter.plugins.firebase.core;

import android.util.Log;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6568r;

/* renamed from: io.flutter.plugins.firebase.core.l */
/* compiled from: GeneratedAndroidFirebaseCore */
public class C10763l {

    /* renamed from: io.flutter.plugins.firebase.core.l$b */
    /* compiled from: GeneratedAndroidFirebaseCore */
    public interface C10765b {
        /* renamed from: d */
        void mo34343d(String str, Boolean bool, C10773h<Void> hVar);

        /* renamed from: e */
        void mo34344e(String str, C10773h<Void> hVar);

        /* renamed from: f */
        void mo34345f(String str, Boolean bool, C10773h<Void> hVar);
    }

    /* renamed from: io.flutter.plugins.firebase.core.l$c */
    /* compiled from: GeneratedAndroidFirebaseCore */
    private static class C10766c extends C6568r {

        /* renamed from: d */
        public static final C10766c f42130d = new C10766c();

        private C10766c() {
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.l$d */
    /* compiled from: GeneratedAndroidFirebaseCore */
    public interface C10767d {
        /* renamed from: a */
        void mo34340a(String str, C10769f fVar, C10773h<C10771g> hVar);

        /* renamed from: b */
        void mo34341b(C10773h<List<C10771g>> hVar);

        /* renamed from: c */
        void mo34342c(C10773h<C10769f> hVar);
    }

    /* renamed from: io.flutter.plugins.firebase.core.l$e */
    /* compiled from: GeneratedAndroidFirebaseCore */
    private static class C10768e extends C6568r {

        /* renamed from: d */
        public static final C10768e f42131d = new C10768e();

        private C10768e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            if (b == Byte.MIN_VALUE) {
                return C10769f.m53855a((Map) mo22175f(byteBuffer));
            }
            if (b != -127) {
                return super.mo22176g(b, byteBuffer);
            }
            return C10771g.m53886a((Map) mo22175f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C10769f) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C10769f) obj).mo34369w());
            } else if (obj instanceof C10771g) {
                byteArrayOutputStream.write(129);
                mo22177p(byteArrayOutputStream, ((C10771g) obj).mo34382f());
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.l$f */
    /* compiled from: GeneratedAndroidFirebaseCore */
    public static class C10769f {

        /* renamed from: a */
        private String f42132a;

        /* renamed from: b */
        private String f42133b;

        /* renamed from: c */
        private String f42134c;

        /* renamed from: d */
        private String f42135d;

        /* renamed from: e */
        private String f42136e;

        /* renamed from: f */
        private String f42137f;

        /* renamed from: g */
        private String f42138g;

        /* renamed from: h */
        private String f42139h;

        /* renamed from: i */
        private String f42140i;

        /* renamed from: j */
        private String f42141j;

        /* renamed from: k */
        private String f42142k;

        /* renamed from: l */
        private String f42143l;

        /* renamed from: m */
        private String f42144m;

        /* renamed from: n */
        private String f42145n;

        /* renamed from: io.flutter.plugins.firebase.core.l$f$a */
        /* compiled from: GeneratedAndroidFirebaseCore */
        public static final class C10770a {

            /* renamed from: a */
            private String f42146a;

            /* renamed from: b */
            private String f42147b;

            /* renamed from: c */
            private String f42148c;

            /* renamed from: d */
            private String f42149d;

            /* renamed from: e */
            private String f42150e;

            /* renamed from: f */
            private String f42151f;

            /* renamed from: g */
            private String f42152g;

            /* renamed from: h */
            private String f42153h;

            /* renamed from: i */
            private String f42154i;

            /* renamed from: j */
            private String f42155j;

            /* renamed from: k */
            private String f42156k;

            /* renamed from: l */
            private String f42157l;

            /* renamed from: m */
            private String f42158m;

            /* renamed from: n */
            private String f42159n;

            /* renamed from: a */
            public C10769f mo34370a() {
                C10769f fVar = new C10769f();
                fVar.mo34356j(this.f42146a);
                fVar.mo34358l(this.f42147b);
                fVar.mo34365s(this.f42148c);
                fVar.mo34366t(this.f42149d);
                fVar.mo34359m(this.f42150e);
                fVar.mo34360n(this.f42151f);
                fVar.mo34367u(this.f42152g);
                fVar.mo34364r(this.f42153h);
                fVar.mo34368v(this.f42154i);
                fVar.mo34361o(this.f42155j);
                fVar.mo34355i(this.f42156k);
                fVar.mo34363q(this.f42157l);
                fVar.mo34362p(this.f42158m);
                fVar.mo34357k(this.f42159n);
                return fVar;
            }

            /* renamed from: b */
            public C10770a mo34371b(String str) {
                this.f42146a = str;
                return this;
            }

            /* renamed from: c */
            public C10770a mo34372c(String str) {
                this.f42147b = str;
                return this;
            }

            /* renamed from: d */
            public C10770a mo34373d(String str) {
                this.f42151f = str;
                return this;
            }

            /* renamed from: e */
            public C10770a mo34374e(String str) {
                this.f42148c = str;
                return this;
            }

            /* renamed from: f */
            public C10770a mo34375f(String str) {
                this.f42149d = str;
                return this;
            }

            /* renamed from: g */
            public C10770a mo34376g(String str) {
                this.f42152g = str;
                return this;
            }

            /* renamed from: h */
            public C10770a mo34377h(String str) {
                this.f42154i = str;
                return this;
            }
        }

        /* renamed from: a */
        static C10769f m53855a(Map<String, Object> map) {
            C10769f fVar = new C10769f();
            fVar.mo34356j((String) map.get("apiKey"));
            fVar.mo34358l((String) map.get("appId"));
            fVar.mo34365s((String) map.get("messagingSenderId"));
            fVar.mo34366t((String) map.get("projectId"));
            fVar.mo34359m((String) map.get("authDomain"));
            fVar.mo34360n((String) map.get("databaseURL"));
            fVar.mo34367u((String) map.get("storageBucket"));
            fVar.mo34364r((String) map.get("measurementId"));
            fVar.mo34368v((String) map.get("trackingId"));
            fVar.mo34361o((String) map.get("deepLinkURLScheme"));
            fVar.mo34355i((String) map.get("androidClientId"));
            fVar.mo34363q((String) map.get("iosClientId"));
            fVar.mo34362p((String) map.get("iosBundleId"));
            fVar.mo34357k((String) map.get("appGroupId"));
            return fVar;
        }

        /* renamed from: b */
        public String mo34348b() {
            return this.f42132a;
        }

        /* renamed from: c */
        public String mo34349c() {
            return this.f42133b;
        }

        /* renamed from: d */
        public String mo34350d() {
            return this.f42137f;
        }

        /* renamed from: e */
        public String mo34351e() {
            return this.f42134c;
        }

        /* renamed from: f */
        public String mo34352f() {
            return this.f42135d;
        }

        /* renamed from: g */
        public String mo34353g() {
            return this.f42138g;
        }

        /* renamed from: h */
        public String mo34354h() {
            return this.f42140i;
        }

        /* renamed from: i */
        public void mo34355i(String str) {
            this.f42142k = str;
        }

        /* renamed from: j */
        public void mo34356j(String str) {
            if (str != null) {
                this.f42132a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        /* renamed from: k */
        public void mo34357k(String str) {
            this.f42145n = str;
        }

        /* renamed from: l */
        public void mo34358l(String str) {
            if (str != null) {
                this.f42133b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        /* renamed from: m */
        public void mo34359m(String str) {
            this.f42136e = str;
        }

        /* renamed from: n */
        public void mo34360n(String str) {
            this.f42137f = str;
        }

        /* renamed from: o */
        public void mo34361o(String str) {
            this.f42141j = str;
        }

        /* renamed from: p */
        public void mo34362p(String str) {
            this.f42144m = str;
        }

        /* renamed from: q */
        public void mo34363q(String str) {
            this.f42143l = str;
        }

        /* renamed from: r */
        public void mo34364r(String str) {
            this.f42139h = str;
        }

        /* renamed from: s */
        public void mo34365s(String str) {
            if (str != null) {
                this.f42134c = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        /* renamed from: t */
        public void mo34366t(String str) {
            if (str != null) {
                this.f42135d = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        /* renamed from: u */
        public void mo34367u(String str) {
            this.f42138g = str;
        }

        /* renamed from: v */
        public void mo34368v(String str) {
            this.f42140i = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public Map<String, Object> mo34369w() {
            HashMap hashMap = new HashMap();
            hashMap.put("apiKey", this.f42132a);
            hashMap.put("appId", this.f42133b);
            hashMap.put("messagingSenderId", this.f42134c);
            hashMap.put("projectId", this.f42135d);
            hashMap.put("authDomain", this.f42136e);
            hashMap.put("databaseURL", this.f42137f);
            hashMap.put("storageBucket", this.f42138g);
            hashMap.put("measurementId", this.f42139h);
            hashMap.put("trackingId", this.f42140i);
            hashMap.put("deepLinkURLScheme", this.f42141j);
            hashMap.put("androidClientId", this.f42142k);
            hashMap.put("iosClientId", this.f42143l);
            hashMap.put("iosBundleId", this.f42144m);
            hashMap.put("appGroupId", this.f42145n);
            return hashMap;
        }

        private C10769f() {
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.l$g */
    /* compiled from: GeneratedAndroidFirebaseCore */
    public static class C10771g {

        /* renamed from: a */
        private String f42160a;

        /* renamed from: b */
        private C10769f f42161b;

        /* renamed from: c */
        private Boolean f42162c;

        /* renamed from: d */
        private Map<String, Object> f42163d;

        /* renamed from: io.flutter.plugins.firebase.core.l$g$a */
        /* compiled from: GeneratedAndroidFirebaseCore */
        public static final class C10772a {

            /* renamed from: a */
            private String f42164a;

            /* renamed from: b */
            private C10769f f42165b;

            /* renamed from: c */
            private Boolean f42166c;

            /* renamed from: d */
            private Map<String, Object> f42167d;

            /* renamed from: a */
            public C10771g mo34383a() {
                C10771g gVar = new C10771g();
                gVar.mo34379c(this.f42164a);
                gVar.mo34380d(this.f42165b);
                gVar.mo34378b(this.f42166c);
                gVar.mo34381e(this.f42167d);
                return gVar;
            }

            /* renamed from: b */
            public C10772a mo34384b(Boolean bool) {
                this.f42166c = bool;
                return this;
            }

            /* renamed from: c */
            public C10772a mo34385c(String str) {
                this.f42164a = str;
                return this;
            }

            /* renamed from: d */
            public C10772a mo34386d(C10769f fVar) {
                this.f42165b = fVar;
                return this;
            }

            /* renamed from: e */
            public C10772a mo34387e(Map<String, Object> map) {
                this.f42167d = map;
                return this;
            }
        }

        /* renamed from: a */
        static C10771g m53886a(Map<String, Object> map) {
            C10769f fVar;
            C10771g gVar = new C10771g();
            gVar.mo34379c((String) map.get(MediationMetaData.KEY_NAME));
            Object obj = map.get("options");
            if (obj == null) {
                fVar = null;
            } else {
                fVar = C10769f.m53855a((Map) obj);
            }
            gVar.mo34380d(fVar);
            gVar.mo34378b((Boolean) map.get("isAutomaticDataCollectionEnabled"));
            gVar.mo34381e((Map) map.get("pluginConstants"));
            return gVar;
        }

        /* renamed from: b */
        public void mo34378b(Boolean bool) {
            this.f42162c = bool;
        }

        /* renamed from: c */
        public void mo34379c(String str) {
            if (str != null) {
                this.f42160a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        /* renamed from: d */
        public void mo34380d(C10769f fVar) {
            if (fVar != null) {
                this.f42161b = fVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        /* renamed from: e */
        public void mo34381e(Map<String, Object> map) {
            if (map != null) {
                this.f42163d = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, Object> mo34382f() {
            HashMap hashMap = new HashMap();
            hashMap.put(MediationMetaData.KEY_NAME, this.f42160a);
            C10769f fVar = this.f42161b;
            hashMap.put("options", fVar == null ? null : fVar.mo34369w());
            hashMap.put("isAutomaticDataCollectionEnabled", this.f42162c);
            hashMap.put("pluginConstants", this.f42163d);
            return hashMap;
        }

        private C10771g() {
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.l$h */
    /* compiled from: GeneratedAndroidFirebaseCore */
    public interface C10773h<T> {
        /* renamed from: a */
        void mo34388a(Throwable th);

        void success(T t);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m53846b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
