package p264io.flutter.plugins.webviewflutter;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p186ac.C6568r;

/* renamed from: io.flutter.plugins.webviewflutter.k */
/* compiled from: GeneratedAndroidWebView */
public class C10940k {

    /* renamed from: io.flutter.plugins.webviewflutter.k$a0 */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10942a0 {
        /* renamed from: b */
        void mo34675b(Long l, Boolean bool);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$b */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10943b {
        /* renamed from: a */
        void mo34637a(String str, String str2);

        /* renamed from: b */
        void mo34638b(C10962n<Boolean> nVar);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$b0 */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10944b0 extends C6568r {

        /* renamed from: d */
        public static final C10944b0 f42508d = new C10944b0();

        private C10944b0() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$c */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10945c extends C6568r {

        /* renamed from: d */
        public static final C10945c f42509d = new C10945c();

        private C10945c() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$c0 */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10946c0 {
        /* renamed from: A */
        void mo34676A(Long l, Long l2);

        /* renamed from: a */
        void mo34677a(Long l);

        /* renamed from: b */
        void mo34678b(Long l, Boolean bool);

        /* renamed from: c */
        Long mo34679c(Long l);

        /* renamed from: d */
        void mo34680d(Long l, String str, String str2, String str3);

        /* renamed from: e */
        void mo34681e(Long l, Long l2);

        /* renamed from: f */
        void mo34682f(Boolean bool);

        /* renamed from: g */
        void mo34683g(Long l, Long l2);

        /* renamed from: h */
        void mo34684h(Long l);

        /* renamed from: i */
        void mo34685i(Long l, String str, Map<String, String> map);

        /* renamed from: j */
        void mo34686j(Long l, Boolean bool);

        /* renamed from: k */
        void mo34687k(Long l, String str, C10962n<String> nVar);

        /* renamed from: l */
        void mo34688l(Long l, Long l2, Long l3);

        /* renamed from: m */
        void mo34689m(Long l, Long l2);

        /* renamed from: n */
        Long mo34690n(Long l);

        /* renamed from: o */
        C10951e0 mo34691o(Long l);

        /* renamed from: p */
        String mo34692p(Long l);

        /* renamed from: q */
        void mo34693q(Long l);

        /* renamed from: r */
        Boolean mo34694r(Long l);

        /* renamed from: s */
        void mo34695s(Long l, String str, String str2, String str3, String str4, String str5);

        /* renamed from: t */
        void mo34696t(Long l);

        /* renamed from: u */
        void mo34697u(Long l, Long l2);

        /* renamed from: v */
        void mo34698v(Long l, Long l2);

        /* renamed from: w */
        Boolean mo34699w(Long l);

        /* renamed from: x */
        String mo34700x(Long l);

        /* renamed from: y */
        void mo34701y(Long l, String str, byte[] bArr);

        /* renamed from: z */
        void mo34702z(Long l, Long l2, Long l3);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$d */
    /* compiled from: GeneratedAndroidWebView */
    public static class C10947d {

        /* renamed from: a */
        private final C6539c f42510a;

        /* renamed from: io.flutter.plugins.webviewflutter.k$d$a */
        /* compiled from: GeneratedAndroidWebView */
        public interface C10948a<T> {
            /* renamed from: a */
            void mo34650a(T t);
        }

        public C10947d(C6539c cVar) {
            this.f42510a = cVar;
        }

        /* renamed from: d */
        static C6554i<Object> m54459d() {
            return C10950e.f42512d;
        }

        /* renamed from: c */
        public void mo34703c(Long l, C10948a<Void> aVar) {
            new C6531a(this.f42510a, "dev.flutter.pigeon.DownloadListenerFlutterApi.dispose", m54459d()).mo22128d(new ArrayList(Arrays.asList(new Long[]{l})), new C10999o(aVar));
        }

        /* renamed from: g */
        public void mo34704g(Long l, String str, String str2, String str3, String str4, Long l2, C10948a<Void> aVar) {
            new C6531a(this.f42510a, "dev.flutter.pigeon.DownloadListenerFlutterApi.onDownloadStart", m54459d()).mo22128d(new ArrayList(Arrays.asList(new Serializable[]{l, str, str2, str3, str4, l2})), new C11005p(aVar));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$d0 */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10949d0 extends C6568r {

        /* renamed from: d */
        public static final C10949d0 f42511d = new C10949d0();

        private C10949d0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            if (b != Byte.MIN_VALUE) {
                return super.mo22176g(b, byteBuffer);
            }
            return C10951e0.m54467a((Map) mo22175f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C10951e0) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C10951e0) obj).mo34707d());
                return;
            }
            super.mo22177p(byteArrayOutputStream, obj);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$e */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10950e extends C6568r {

        /* renamed from: d */
        public static final C10950e f42512d = new C10950e();

        private C10950e() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$e0 */
    /* compiled from: GeneratedAndroidWebView */
    public static class C10951e0 {

        /* renamed from: a */
        private Long f42513a;

        /* renamed from: b */
        private Long f42514b;

        /* renamed from: io.flutter.plugins.webviewflutter.k$e0$a */
        /* compiled from: GeneratedAndroidWebView */
        public static final class C10952a {

            /* renamed from: a */
            private Long f42515a;

            /* renamed from: b */
            private Long f42516b;

            /* renamed from: a */
            public C10951e0 mo34708a() {
                C10951e0 e0Var = new C10951e0();
                e0Var.mo34705b(this.f42515a);
                e0Var.mo34706c(this.f42516b);
                return e0Var;
            }

            /* renamed from: b */
            public C10952a mo34709b(Long l) {
                this.f42515a = l;
                return this;
            }

            /* renamed from: c */
            public C10952a mo34710c(Long l) {
                this.f42516b = l;
                return this;
            }
        }

        /* renamed from: a */
        static C10951e0 m54467a(Map<String, Object> map) {
            Long l;
            C10951e0 e0Var = new C10951e0();
            Object obj = map.get("x");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e0Var.mo34705b(l);
            Object obj2 = map.get("y");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            e0Var.mo34706c(l2);
            return e0Var;
        }

        /* renamed from: b */
        public void mo34705b(Long l) {
            if (l != null) {
                this.f42513a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"x\" is null.");
        }

        /* renamed from: c */
        public void mo34706c(Long l) {
            if (l != null) {
                this.f42514b = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"y\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, Object> mo34707d() {
            HashMap hashMap = new HashMap();
            hashMap.put("x", this.f42513a);
            hashMap.put("y", this.f42514b);
            return hashMap;
        }

        private C10951e0() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$f */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10953f {
        /* renamed from: a */
        void mo34646a(Long l);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$g */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10954g extends C6568r {

        /* renamed from: d */
        public static final C10954g f42517d = new C10954g();

        private C10954g() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$h */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10955h {
        /* renamed from: a */
        String mo34665a(String str);

        /* renamed from: b */
        List<String> mo34666b(String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$i */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10956i extends C6568r {

        /* renamed from: d */
        public static final C10956i f42518d = new C10956i();

        private C10956i() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$j */
    /* compiled from: GeneratedAndroidWebView */
    public static class C10957j {

        /* renamed from: a */
        private final C6539c f42519a;

        /* renamed from: io.flutter.plugins.webviewflutter.k$j$a */
        /* compiled from: GeneratedAndroidWebView */
        public interface C10958a<T> {
            /* renamed from: a */
            void mo34674a(T t);
        }

        public C10957j(C6539c cVar) {
            this.f42519a = cVar;
        }

        /* renamed from: d */
        static C6554i<Object> m54479d() {
            return C10959k.f42520d;
        }

        /* renamed from: c */
        public void mo34711c(Long l, C10958a<Void> aVar) {
            new C6531a(this.f42519a, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.dispose", m54479d()).mo22128d(new ArrayList(Arrays.asList(new Long[]{l})), new C11043w(aVar));
        }

        /* renamed from: g */
        public void mo34712g(Long l, String str, C10958a<Void> aVar) {
            new C6531a(this.f42519a, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.postMessage", m54479d()).mo22128d(new ArrayList(Arrays.asList(new Serializable[]{l, str})), new C11038v(aVar));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$k */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10959k extends C6568r {

        /* renamed from: d */
        public static final C10959k f42520d = new C10959k();

        private C10959k() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$l */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10960l {
        /* renamed from: a */
        void mo34713a(Long l, String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$m */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10961m extends C6568r {

        /* renamed from: d */
        public static final C10961m f42521d = new C10961m();

        private C10961m() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$n */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10962n<T> {
        void success(T t);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$o */
    /* compiled from: GeneratedAndroidWebView */
    public static class C10963o {

        /* renamed from: a */
        private final C6539c f42522a;

        /* renamed from: io.flutter.plugins.webviewflutter.k$o$a */
        /* compiled from: GeneratedAndroidWebView */
        public interface C10964a<T> {
            /* renamed from: a */
            void mo34716a(T t);
        }

        public C10963o(C6539c cVar) {
            this.f42522a = cVar;
        }

        /* renamed from: d */
        static C6554i<Object> m54488d() {
            return C10965p.f42523d;
        }

        /* renamed from: c */
        public void mo34714c(Long l, C10964a<Void> aVar) {
            new C6531a(this.f42522a, "dev.flutter.pigeon.WebChromeClientFlutterApi.dispose", m54488d()).mo22128d(new ArrayList(Arrays.asList(new Long[]{l})), new C10884a0(aVar));
        }

        /* renamed from: g */
        public void mo34715g(Long l, Long l2, Long l3, C10964a<Void> aVar) {
            new C6531a(this.f42522a, "dev.flutter.pigeon.WebChromeClientFlutterApi.onProgressChanged", m54488d()).mo22128d(new ArrayList(Arrays.asList(new Long[]{l, l2, l3})), new C11060z(aVar));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$p */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10965p extends C6568r {

        /* renamed from: d */
        public static final C10965p f42523d = new C10965p();

        private C10965p() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$q */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10966q {
        /* renamed from: b */
        void mo34717b(Long l, Long l2);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$r */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10967r extends C6568r {

        /* renamed from: d */
        public static final C10967r f42524d = new C10967r();

        private C10967r() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$s */
    /* compiled from: GeneratedAndroidWebView */
    public static class C10968s {

        /* renamed from: a */
        private Long f42525a;

        /* renamed from: b */
        private String f42526b;

        /* renamed from: io.flutter.plugins.webviewflutter.k$s$a */
        /* compiled from: GeneratedAndroidWebView */
        public static final class C10969a {

            /* renamed from: a */
            private Long f42527a;

            /* renamed from: b */
            private String f42528b;

            /* renamed from: a */
            public C10968s mo34721a() {
                C10968s sVar = new C10968s();
                sVar.mo34719c(this.f42527a);
                sVar.mo34718b(this.f42528b);
                return sVar;
            }

            /* renamed from: b */
            public C10969a mo34722b(String str) {
                this.f42528b = str;
                return this;
            }

            /* renamed from: c */
            public C10969a mo34723c(Long l) {
                this.f42527a = l;
                return this;
            }
        }

        /* renamed from: a */
        static C10968s m54495a(Map<String, Object> map) {
            Long l;
            C10968s sVar = new C10968s();
            Object obj = map.get("errorCode");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.mo34719c(l);
            sVar.mo34718b((String) map.get("description"));
            return sVar;
        }

        /* renamed from: b */
        public void mo34718b(String str) {
            if (str != null) {
                this.f42526b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"description\" is null.");
        }

        /* renamed from: c */
        public void mo34719c(Long l) {
            if (l != null) {
                this.f42525a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, Object> mo34720d() {
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", this.f42525a);
            hashMap.put("description", this.f42526b);
            return hashMap;
        }

        private C10968s() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$t */
    /* compiled from: GeneratedAndroidWebView */
    public static class C10970t {

        /* renamed from: a */
        private String f42529a;

        /* renamed from: b */
        private Boolean f42530b;

        /* renamed from: c */
        private Boolean f42531c;

        /* renamed from: d */
        private Boolean f42532d;

        /* renamed from: e */
        private String f42533e;

        /* renamed from: f */
        private Map<String, String> f42534f;

        /* renamed from: io.flutter.plugins.webviewflutter.k$t$a */
        /* compiled from: GeneratedAndroidWebView */
        public static final class C10971a {

            /* renamed from: a */
            private String f42535a;

            /* renamed from: b */
            private Boolean f42536b;

            /* renamed from: c */
            private Boolean f42537c;

            /* renamed from: d */
            private Boolean f42538d;

            /* renamed from: e */
            private String f42539e;

            /* renamed from: f */
            private Map<String, String> f42540f;

            /* renamed from: a */
            public C10970t mo34731a() {
                C10970t tVar = new C10970t();
                tVar.mo34729g(this.f42535a);
                tVar.mo34725c(this.f42536b);
                tVar.mo34726d(this.f42537c);
                tVar.mo34724b(this.f42538d);
                tVar.mo34727e(this.f42539e);
                tVar.mo34728f(this.f42540f);
                return tVar;
            }

            /* renamed from: b */
            public C10971a mo34732b(Boolean bool) {
                this.f42538d = bool;
                return this;
            }

            /* renamed from: c */
            public C10971a mo34733c(Boolean bool) {
                this.f42536b = bool;
                return this;
            }

            /* renamed from: d */
            public C10971a mo34734d(Boolean bool) {
                this.f42537c = bool;
                return this;
            }

            /* renamed from: e */
            public C10971a mo34735e(String str) {
                this.f42539e = str;
                return this;
            }

            /* renamed from: f */
            public C10971a mo34736f(Map<String, String> map) {
                this.f42540f = map;
                return this;
            }

            /* renamed from: g */
            public C10971a mo34737g(String str) {
                this.f42535a = str;
                return this;
            }
        }

        /* renamed from: a */
        static C10970t m54502a(Map<String, Object> map) {
            C10970t tVar = new C10970t();
            tVar.mo34729g((String) map.get("url"));
            tVar.mo34725c((Boolean) map.get("isForMainFrame"));
            tVar.mo34726d((Boolean) map.get("isRedirect"));
            tVar.mo34724b((Boolean) map.get("hasGesture"));
            tVar.mo34727e((String) map.get("method"));
            tVar.mo34728f((Map) map.get("requestHeaders"));
            return tVar;
        }

        /* renamed from: b */
        public void mo34724b(Boolean bool) {
            if (bool != null) {
                this.f42532d = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
        }

        /* renamed from: c */
        public void mo34725c(Boolean bool) {
            if (bool != null) {
                this.f42530b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
        }

        /* renamed from: d */
        public void mo34726d(Boolean bool) {
            this.f42531c = bool;
        }

        /* renamed from: e */
        public void mo34727e(String str) {
            if (str != null) {
                this.f42533e = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"method\" is null.");
        }

        /* renamed from: f */
        public void mo34728f(Map<String, String> map) {
            if (map != null) {
                this.f42534f = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
        }

        /* renamed from: g */
        public void mo34729g(String str) {
            if (str != null) {
                this.f42529a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Map<String, Object> mo34730h() {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.f42529a);
            hashMap.put("isForMainFrame", this.f42530b);
            hashMap.put("isRedirect", this.f42531c);
            hashMap.put("hasGesture", this.f42532d);
            hashMap.put("method", this.f42533e);
            hashMap.put("requestHeaders", this.f42534f);
            return hashMap;
        }

        private C10970t() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$u */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10972u {
        /* renamed from: a */
        void mo34738a(Long l);

        /* renamed from: b */
        void mo34739b(Long l, Long l2);

        /* renamed from: c */
        void mo34740c(Long l, Boolean bool);

        /* renamed from: d */
        void mo34741d(Long l, Boolean bool);

        /* renamed from: e */
        void mo34742e(Long l, Boolean bool);

        /* renamed from: f */
        void mo34743f(Long l, Boolean bool);

        /* renamed from: g */
        void mo34744g(Long l, Boolean bool);

        /* renamed from: h */
        void mo34745h(Long l, Boolean bool);

        /* renamed from: i */
        void mo34746i(Long l, Boolean bool);

        /* renamed from: j */
        void mo34747j(Long l, Boolean bool);

        /* renamed from: k */
        void mo34748k(Long l, Boolean bool);

        /* renamed from: l */
        void mo34749l(Long l, String str);

        /* renamed from: m */
        void mo34750m(Long l, Boolean bool);

        /* renamed from: n */
        void mo34751n(Long l, Boolean bool);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$v */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10973v extends C6568r {

        /* renamed from: d */
        public static final C10973v f42541d = new C10973v();

        private C10973v() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$w */
    /* compiled from: GeneratedAndroidWebView */
    public interface C10974w {
        /* renamed from: a */
        void mo34752a(Long l);

        /* renamed from: b */
        void mo34753b(Long l);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$x */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10975x extends C6568r {

        /* renamed from: d */
        public static final C10975x f42542d = new C10975x();

        private C10975x() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$y */
    /* compiled from: GeneratedAndroidWebView */
    public static class C10976y {

        /* renamed from: a */
        private final C6539c f42543a;

        /* renamed from: io.flutter.plugins.webviewflutter.k$y$a */
        /* compiled from: GeneratedAndroidWebView */
        public interface C10977a<T> {
            /* renamed from: a */
            void mo34636a(T t);
        }

        public C10976y(C6539c cVar) {
            this.f42543a = cVar;
        }

        /* renamed from: i */
        static C6554i<Object> m54540i() {
            return C10978z.f42544d;
        }

        /* renamed from: h */
        public void mo34754h(Long l, C10977a<Void> aVar) {
            new C6531a(this.f42543a, "dev.flutter.pigeon.WebViewClientFlutterApi.dispose", m54540i()).mo22128d(new ArrayList(Arrays.asList(new Long[]{l})), new C10890b1(aVar));
        }

        /* renamed from: q */
        public void mo34755q(Long l, Long l2, String str, C10977a<Void> aVar) {
            new C6531a(this.f42543a, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageFinished", m54540i()).mo22128d(new ArrayList(Arrays.asList(new Serializable[]{l, l2, str})), new C11044w0(aVar));
        }

        /* renamed from: r */
        public void mo34756r(Long l, Long l2, String str, C10977a<Void> aVar) {
            new C6531a(this.f42543a, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageStarted", m54540i()).mo22128d(new ArrayList(Arrays.asList(new Serializable[]{l, l2, str})), new C11061z0(aVar));
        }

        /* renamed from: s */
        public void mo34757s(Long l, Long l2, Long l3, String str, String str2, C10977a<Void> aVar) {
            new C6531a(this.f42543a, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedError", m54540i()).mo22128d(new ArrayList(Arrays.asList(new Serializable[]{l, l2, l3, str, str2})), new C11053y0(aVar));
        }

        /* renamed from: t */
        public void mo34758t(Long l, Long l2, C10970t tVar, C10968s sVar, C10977a<Void> aVar) {
            new C6531a(this.f42543a, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedRequestError", m54540i()).mo22128d(new ArrayList(Arrays.asList(new Object[]{l, l2, tVar, sVar})), new C10885a1(aVar));
        }

        /* renamed from: u */
        public void mo34759u(Long l, Long l2, C10970t tVar, C10977a<Void> aVar) {
            new C6531a(this.f42543a, "dev.flutter.pigeon.WebViewClientFlutterApi.requestLoading", m54540i()).mo22128d(new ArrayList(Arrays.asList(new Object[]{l, l2, tVar})), new C11039v0(aVar));
        }

        /* renamed from: v */
        public void mo34760v(Long l, Long l2, String str, C10977a<Void> aVar) {
            new C6531a(this.f42543a, "dev.flutter.pigeon.WebViewClientFlutterApi.urlLoading", m54540i()).mo22128d(new ArrayList(Arrays.asList(new Serializable[]{l, l2, str})), new C11049x0(aVar));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.k$z */
    /* compiled from: GeneratedAndroidWebView */
    private static class C10978z extends C6568r {

        /* renamed from: d */
        public static final C10978z f42544d = new C10978z();

        private C10978z() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            if (b == Byte.MIN_VALUE) {
                return C10968s.m54495a((Map) mo22175f(byteBuffer));
            }
            if (b != -127) {
                return super.mo22176g(b, byteBuffer);
            }
            return C10970t.m54502a((Map) mo22175f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C10968s) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C10968s) obj).mo34720d());
            } else if (obj instanceof C10970t) {
                byteArrayOutputStream.write(129);
                mo22177p(byteArrayOutputStream, ((C10970t) obj).mo34730h());
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m54426b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
