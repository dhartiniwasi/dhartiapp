package p417zb;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.l */
/* compiled from: RestorationChannel */
public class C13533l {

    /* renamed from: a */
    public final boolean f48001a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public byte[] f48002b;

    /* renamed from: c */
    private C6556k f48003c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6556k.C6561d f48004d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f48005e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f48006f;

    /* renamed from: g */
    private final C6556k.C6560c f48007g;

    /* renamed from: zb.l$a */
    /* compiled from: RestorationChannel */
    class C13534a implements C6556k.C6561d {

        /* renamed from: a */
        final /* synthetic */ byte[] f48008a;

        C13534a(byte[] bArr) {
            this.f48008a = bArr;
        }

        public void error(String str, String str2, Object obj) {
            C11881b.m57384b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        public void notImplemented() {
        }

        public void success(Object obj) {
            byte[] unused = C13533l.this.f48002b = this.f48008a;
        }
    }

    /* renamed from: zb.l$b */
    /* compiled from: RestorationChannel */
    class C13535b implements C6556k.C6560c {
        C13535b() {
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            String str = jVar.f30999a;
            Object obj = jVar.f31000b;
            str.hashCode();
            if (str.equals("get")) {
                boolean unused = C13533l.this.f48006f = true;
                if (!C13533l.this.f48005e) {
                    C13533l lVar = C13533l.this;
                    if (lVar.f48001a) {
                        C6556k.C6561d unused2 = lVar.f48004d = dVar;
                        return;
                    }
                }
                C13533l lVar2 = C13533l.this;
                dVar.success(lVar2.m62714i(lVar2.f48002b));
            } else if (!str.equals("put")) {
                dVar.notImplemented();
            } else {
                byte[] unused3 = C13533l.this.f48002b = (byte[]) obj;
                dVar.success((Object) null);
            }
        }
    }

    public C13533l(C12051a aVar, boolean z) {
        this(new C6556k(aVar, "flutter/restoration", C6570s.f31014b), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public Map<String, Object> m62714i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put(JsonStorageKeyNames.DATA_KEY, bArr);
        return hashMap;
    }

    /* renamed from: g */
    public void mo38644g() {
        this.f48002b = null;
    }

    /* renamed from: h */
    public byte[] mo38645h() {
        return this.f48002b;
    }

    /* renamed from: j */
    public void mo38646j(byte[] bArr) {
        this.f48005e = true;
        C6556k.C6561d dVar = this.f48004d;
        if (dVar != null) {
            dVar.success(m62714i(bArr));
            this.f48004d = null;
            this.f48002b = bArr;
        } else if (this.f48006f) {
            this.f48003c.mo22160d("push", m62714i(bArr), new C13534a(bArr));
        } else {
            this.f48002b = bArr;
        }
    }

    C13533l(C6556k kVar, boolean z) {
        this.f48005e = false;
        this.f48006f = false;
        C13535b bVar = new C13535b();
        this.f48007g = bVar;
        this.f48003c = kVar;
        this.f48001a = z;
        kVar.mo22161e(bVar);
    }
}
