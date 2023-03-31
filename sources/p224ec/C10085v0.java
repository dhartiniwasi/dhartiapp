package p224ec;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6568r;

/* renamed from: ec.v0 */
/* compiled from: GeneratedAndroidFirebaseAuth */
public class C10085v0 {

    /* renamed from: ec.v0$b */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface C10087b {
        /* renamed from: a */
        void mo32688a(String str, C10095h hVar, C10096i<Map<String, Object>> iVar);
    }

    /* renamed from: ec.v0$c */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    private static class C10088c extends C6568r {

        /* renamed from: d */
        public static final C10088c f40141d = new C10088c();

        private C10088c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return C10091f.m51385a((Map) mo22175f(byteBuffer));
                case -127:
                    return C10093g.m51398a((Map) mo22175f(byteBuffer));
                case -126:
                    return C10095h.m51403a((Map) mo22175f(byteBuffer));
                default:
                    return super.mo22176g(b, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C10091f) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C10091f) obj).mo32703g());
            } else if (obj instanceof C10093g) {
                byteArrayOutputStream.write(129);
                mo22177p(byteArrayOutputStream, ((C10093g) obj).mo32711c());
            } else if (obj instanceof C10095h) {
                byteArrayOutputStream.write(130);
                mo22177p(byteArrayOutputStream, ((C10095h) obj).mo32718f());
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        }
    }

    /* renamed from: ec.v0$d */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface C10089d {
        /* renamed from: b */
        void mo32689b(String str, C10095h hVar, String str2, C10096i<Void> iVar);

        /* renamed from: c */
        void mo32690c(String str, C10096i<List<C10091f>> iVar);

        /* renamed from: d */
        void mo32691d(String str, String str2, C10096i<Void> iVar);

        /* renamed from: e */
        void mo32692e(String str, C10096i<C10093g> iVar);
    }

    /* renamed from: ec.v0$e */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    private static class C10090e extends C6568r {

        /* renamed from: d */
        public static final C10090e f40142d = new C10090e();

        private C10090e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return C10091f.m51385a((Map) mo22175f(byteBuffer));
                case -127:
                    return C10093g.m51398a((Map) mo22175f(byteBuffer));
                case -126:
                    return C10095h.m51403a((Map) mo22175f(byteBuffer));
                default:
                    return super.mo22176g(b, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C10091f) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C10091f) obj).mo32703g());
            } else if (obj instanceof C10093g) {
                byteArrayOutputStream.write(129);
                mo22177p(byteArrayOutputStream, ((C10093g) obj).mo32711c());
            } else if (obj instanceof C10095h) {
                byteArrayOutputStream.write(130);
                mo22177p(byteArrayOutputStream, ((C10095h) obj).mo32718f());
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        }
    }

    /* renamed from: ec.v0$f */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static class C10091f {

        /* renamed from: a */
        private String f40143a;

        /* renamed from: b */
        private Double f40144b;

        /* renamed from: c */
        private String f40145c;

        /* renamed from: d */
        private String f40146d;

        /* renamed from: e */
        private String f40147e;

        /* renamed from: ec.v0$f$a */
        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class C10092a {

            /* renamed from: a */
            private String f40148a;

            /* renamed from: b */
            private Double f40149b;

            /* renamed from: c */
            private String f40150c;

            /* renamed from: d */
            private String f40151d;

            /* renamed from: e */
            private String f40152e;

            /* renamed from: a */
            public C10091f mo32704a() {
                C10091f fVar = new C10091f();
                fVar.mo32698b(this.f40148a);
                fVar.mo32699c(this.f40149b);
                fVar.mo32700d(this.f40150c);
                fVar.mo32702f(this.f40151d);
                fVar.mo32701e(this.f40152e);
                return fVar;
            }

            /* renamed from: b */
            public C10092a mo32705b(String str) {
                this.f40148a = str;
                return this;
            }

            /* renamed from: c */
            public C10092a mo32706c(Double d) {
                this.f40149b = d;
                return this;
            }

            /* renamed from: d */
            public C10092a mo32707d(String str) {
                this.f40150c = str;
                return this;
            }

            /* renamed from: e */
            public C10092a mo32708e(String str) {
                this.f40152e = str;
                return this;
            }

            /* renamed from: f */
            public C10092a mo32709f(String str) {
                this.f40151d = str;
                return this;
            }
        }

        /* renamed from: a */
        static C10091f m51385a(Map<String, Object> map) {
            C10091f fVar = new C10091f();
            fVar.mo32698b((String) map.get("displayName"));
            fVar.mo32699c((Double) map.get("enrollmentTimestamp"));
            fVar.mo32700d((String) map.get("factorId"));
            fVar.mo32702f((String) map.get("uid"));
            fVar.mo32701e((String) map.get("phoneNumber"));
            return fVar;
        }

        /* renamed from: b */
        public void mo32698b(String str) {
            this.f40143a = str;
        }

        /* renamed from: c */
        public void mo32699c(Double d) {
            if (d != null) {
                this.f40144b = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
        }

        /* renamed from: d */
        public void mo32700d(String str) {
            this.f40145c = str;
        }

        /* renamed from: e */
        public void mo32701e(String str) {
            this.f40147e = str;
        }

        /* renamed from: f */
        public void mo32702f(String str) {
            if (str != null) {
                this.f40146d = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Map<String, Object> mo32703g() {
            HashMap hashMap = new HashMap();
            hashMap.put("displayName", this.f40143a);
            hashMap.put("enrollmentTimestamp", this.f40144b);
            hashMap.put("factorId", this.f40145c);
            hashMap.put("uid", this.f40146d);
            hashMap.put("phoneNumber", this.f40147e);
            return hashMap;
        }

        private C10091f() {
        }
    }

    /* renamed from: ec.v0$g */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static class C10093g {

        /* renamed from: a */
        private String f40153a;

        /* renamed from: ec.v0$g$a */
        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class C10094a {

            /* renamed from: a */
            private String f40154a;

            /* renamed from: a */
            public C10093g mo32712a() {
                C10093g gVar = new C10093g();
                gVar.mo32710b(this.f40154a);
                return gVar;
            }

            /* renamed from: b */
            public C10094a mo32713b(String str) {
                this.f40154a = str;
                return this;
            }
        }

        /* renamed from: a */
        static C10093g m51398a(Map<String, Object> map) {
            C10093g gVar = new C10093g();
            gVar.mo32710b((String) map.get("id"));
            return gVar;
        }

        /* renamed from: b */
        public void mo32710b(String str) {
            if (str != null) {
                this.f40153a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<String, Object> mo32711c() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f40153a);
            return hashMap;
        }

        private C10093g() {
        }
    }

    /* renamed from: ec.v0$h */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static class C10095h {

        /* renamed from: a */
        private String f40155a;

        /* renamed from: b */
        private String f40156b;

        private C10095h() {
        }

        /* renamed from: a */
        static C10095h m51403a(Map<String, Object> map) {
            C10095h hVar = new C10095h();
            hVar.mo32717e((String) map.get("verificationId"));
            hVar.mo32716d((String) map.get("verificationCode"));
            return hVar;
        }

        /* renamed from: b */
        public String mo32714b() {
            return this.f40156b;
        }

        /* renamed from: c */
        public String mo32715c() {
            return this.f40155a;
        }

        /* renamed from: d */
        public void mo32716d(String str) {
            if (str != null) {
                this.f40156b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
        }

        /* renamed from: e */
        public void mo32717e(String str) {
            if (str != null) {
                this.f40155a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map<String, Object> mo32718f() {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", this.f40155a);
            hashMap.put("verificationCode", this.f40156b);
            return hashMap;
        }
    }

    /* renamed from: ec.v0$i */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface C10096i<T> {
        /* renamed from: a */
        void mo32652a(Throwable th);

        void success(T t);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m51375b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
