package p315ob;

import android.content.res.AssetManager;
import java.nio.ByteBuffer;
import java.util.List;
import p186ac.C6538b;
import p186ac.C6539c;
import p186ac.C6571t;
import p264io.flutter.embedding.engine.FlutterJNI;
import p264io.flutter.view.FlutterCallbackInformation;
import p297mb.C11877a;
import p297mb.C11881b;
import p325pc.C12169e;
import p333qb.C12212f;

/* renamed from: ob.a */
/* compiled from: DartExecutor */
public class C12051a implements C6539c {

    /* renamed from: a */
    private final FlutterJNI f45053a;

    /* renamed from: b */
    private final AssetManager f45054b;

    /* renamed from: c */
    private final C12058c f45055c;

    /* renamed from: d */
    private final C6539c f45056d;

    /* renamed from: e */
    private boolean f45057e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f45058f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C12056e f45059g;

    /* renamed from: h */
    private final C6539c.C6540a f45060h;

    /* renamed from: ob.a$a */
    /* compiled from: DartExecutor */
    class C12052a implements C6539c.C6540a {
        C12052a() {
        }

        /* renamed from: a */
        public void mo22130a(ByteBuffer byteBuffer, C6539c.C6541b bVar) {
            String unused = C12051a.this.f45058f = C6571t.f31017b.mo22148b(byteBuffer);
            if (C12051a.this.f45059g != null) {
                C12051a.this.f45059g.mo36431a(C12051a.this.f45058f);
            }
        }
    }

    /* renamed from: ob.a$b */
    /* compiled from: DartExecutor */
    public static class C12053b {

        /* renamed from: a */
        public final AssetManager f45062a;

        /* renamed from: b */
        public final String f45063b;

        /* renamed from: c */
        public final FlutterCallbackInformation f45064c;

        public C12053b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.f45062a = assetManager;
            this.f45063b = str;
            this.f45064c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.f45063b + ", library path: " + this.f45064c.callbackLibraryPath + ", function: " + this.f45064c.callbackName + " )";
        }
    }

    /* renamed from: ob.a$d */
    /* compiled from: DartExecutor */
    private static class C12055d implements C6539c {

        /* renamed from: a */
        private final C12058c f45068a;

        /* synthetic */ C12055d(C12058c cVar, C12052a aVar) {
            this(cVar);
        }

        /* renamed from: a */
        public C6539c.C6542c mo22134a(C6539c.C6543d dVar) {
            return this.f45068a.mo22134a(dVar);
        }

        /* renamed from: b */
        public /* synthetic */ C6539c.C6542c mo22135b() {
            return C6538b.m38040a(this);
        }

        /* renamed from: d */
        public void mo22136d(String str, C6539c.C6540a aVar, C6539c.C6542c cVar) {
            this.f45068a.mo22136d(str, aVar, cVar);
        }

        /* renamed from: e */
        public void mo22137e(String str, ByteBuffer byteBuffer) {
            this.f45068a.mo22138f(str, byteBuffer, (C6539c.C6541b) null);
        }

        /* renamed from: f */
        public void mo22138f(String str, ByteBuffer byteBuffer, C6539c.C6541b bVar) {
            this.f45068a.mo22138f(str, byteBuffer, bVar);
        }

        /* renamed from: j */
        public void mo22139j(String str, C6539c.C6540a aVar) {
            this.f45068a.mo22139j(str, aVar);
        }

        private C12055d(C12058c cVar) {
            this.f45068a = cVar;
        }
    }

    /* renamed from: ob.a$e */
    /* compiled from: DartExecutor */
    public interface C12056e {
        /* renamed from: a */
        void mo36431a(String str);
    }

    public C12051a(FlutterJNI flutterJNI, AssetManager assetManager) {
        C12052a aVar = new C12052a();
        this.f45060h = aVar;
        this.f45053a = flutterJNI;
        this.f45054b = assetManager;
        C12058c cVar = new C12058c(flutterJNI);
        this.f45055c = cVar;
        cVar.mo22139j("flutter/isolate", aVar);
        this.f45056d = new C12055d(cVar, (C12052a) null);
        if (flutterJNI.isAttached()) {
            this.f45057e = true;
        }
    }

    @Deprecated
    /* renamed from: a */
    public C6539c.C6542c mo22134a(C6539c.C6543d dVar) {
        return this.f45056d.mo22134a(dVar);
    }

    /* renamed from: b */
    public /* synthetic */ C6539c.C6542c mo22135b() {
        return C6538b.m38040a(this);
    }

    @Deprecated
    /* renamed from: d */
    public void mo22136d(String str, C6539c.C6540a aVar, C6539c.C6542c cVar) {
        this.f45056d.mo22136d(str, aVar, cVar);
    }

    @Deprecated
    /* renamed from: e */
    public void mo22137e(String str, ByteBuffer byteBuffer) {
        this.f45056d.mo22137e(str, byteBuffer);
    }

    @Deprecated
    /* renamed from: f */
    public void mo22138f(String str, ByteBuffer byteBuffer, C6539c.C6541b bVar) {
        this.f45056d.mo22138f(str, byteBuffer, bVar);
    }

    /* renamed from: i */
    public void mo36419i(C12053b bVar) {
        if (this.f45057e) {
            C11881b.m57389g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C12169e.m58443a("DartExecutor#executeDartCallback");
        try {
            C11881b.m57388f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f45053a;
            String str = bVar.f45063b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.f45064c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.f45062a, (List<String>) null);
            this.f45057e = true;
        } finally {
            C12169e.m58446d();
        }
    }

    @Deprecated
    /* renamed from: j */
    public void mo22139j(String str, C6539c.C6540a aVar) {
        this.f45056d.mo22139j(str, aVar);
    }

    /* renamed from: k */
    public void mo36420k(C12054c cVar) {
        mo36421l(cVar, (List<String>) null);
    }

    /* renamed from: l */
    public void mo36421l(C12054c cVar, List<String> list) {
        if (this.f45057e) {
            C11881b.m57389g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C12169e.m58443a("DartExecutor#executeDartEntrypoint");
        try {
            C11881b.m57388f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f45053a.runBundleAndSnapshotFromLibrary(cVar.f45065a, cVar.f45067c, cVar.f45066b, this.f45054b, list);
            this.f45057e = true;
        } finally {
            C12169e.m58446d();
        }
    }

    /* renamed from: m */
    public String mo36422m() {
        return this.f45058f;
    }

    /* renamed from: n */
    public boolean mo36423n() {
        return this.f45057e;
    }

    /* renamed from: o */
    public void mo36424o() {
        if (this.f45053a.isAttached()) {
            this.f45053a.notifyLowMemoryWarning();
        }
    }

    /* renamed from: p */
    public void mo36425p() {
        C11881b.m57388f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f45053a.setPlatformMessageHandler(this.f45055c);
    }

    /* renamed from: q */
    public void mo36426q() {
        C11881b.m57388f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f45053a.setPlatformMessageHandler((C12071f) null);
    }

    /* renamed from: ob.a$c */
    /* compiled from: DartExecutor */
    public static class C12054c {

        /* renamed from: a */
        public final String f45065a;

        /* renamed from: b */
        public final String f45066b;

        /* renamed from: c */
        public final String f45067c;

        public C12054c(String str, String str2) {
            this.f45065a = str;
            this.f45066b = null;
            this.f45067c = str2;
        }

        /* renamed from: a */
        public static C12054c m58024a() {
            C12212f c = C11877a.m57376e().mo36134c();
            if (c.mo36745n()) {
                return new C12054c(c.mo36742i(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C12054c cVar = (C12054c) obj;
            if (!this.f45065a.equals(cVar.f45065a)) {
                return false;
            }
            return this.f45067c.equals(cVar.f45067c);
        }

        public int hashCode() {
            return (this.f45065a.hashCode() * 31) + this.f45067c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f45065a + ", function: " + this.f45067c + " )";
        }

        public C12054c(String str, String str2, String str3) {
            this.f45065a = str;
            this.f45066b = str2;
            this.f45067c = str3;
        }
    }
}
