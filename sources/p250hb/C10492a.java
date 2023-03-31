package p250hb;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6568r;

/* renamed from: hb.a */
/* compiled from: Messages */
public class C10492a {

    /* renamed from: hb.a$a */
    /* compiled from: Messages */
    public static class C10493a {

        /* renamed from: a */
        private Boolean f41542a;

        /* renamed from: a */
        static C10493a m52876a(Map<String, Object> map) {
            C10493a aVar = new C10493a();
            aVar.f41542a = (Boolean) map.get("enabled");
            return aVar;
        }

        /* renamed from: b */
        public void mo33628b(Boolean bool) {
            this.f41542a = bool;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<String, Object> mo33629c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enabled", this.f41542a);
            return hashMap;
        }
    }

    /* renamed from: hb.a$b */
    /* compiled from: Messages */
    public static class C10494b {

        /* renamed from: a */
        private Boolean f41543a;

        /* renamed from: a */
        static C10494b m52879a(Map<String, Object> map) {
            C10494b bVar = new C10494b();
            bVar.f41543a = (Boolean) map.get("enable");
            return bVar;
        }

        /* renamed from: b */
        public Boolean mo33630b() {
            return this.f41543a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<String, Object> mo33631c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enable", this.f41543a);
            return hashMap;
        }
    }

    /* renamed from: hb.a$c */
    /* compiled from: Messages */
    public interface C10495c {
        /* renamed from: a */
        void mo33632a(C10494b bVar);

        C10493a isEnabled();
    }

    /* renamed from: hb.a$d */
    /* compiled from: Messages */
    private static class C10496d extends C6568r {

        /* renamed from: d */
        public static final C10496d f41544d = new C10496d();

        private C10496d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo22176g(byte b, ByteBuffer byteBuffer) {
            if (b == Byte.MIN_VALUE) {
                return C10493a.m52876a((Map) mo22175f(byteBuffer));
            }
            if (b != -127) {
                return super.mo22176g(b, byteBuffer);
            }
            return C10494b.m52879a((Map) mo22175f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C10493a) {
                byteArrayOutputStream.write(128);
                mo22177p(byteArrayOutputStream, ((C10493a) obj).mo33629c());
            } else if (obj instanceof C10494b) {
                byteArrayOutputStream.write(129);
                mo22177p(byteArrayOutputStream, ((C10494b) obj).mo33631c());
            } else {
                super.mo22177p(byteArrayOutputStream, obj);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m52875b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", (Object) null);
        return hashMap;
    }
}
