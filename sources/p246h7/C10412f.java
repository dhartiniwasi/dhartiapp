package p246h7;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p010os.C0779n;
import com.google.android.gms.common.api.internal.C2069a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p033d5.C4133p;
import p033d5.C4141r;
import p067i5.C4689c;
import p067i5.C4699m;
import p067i5.C4701o;
import p124r.C5413a;
import p257i8.C10557f;
import p276k8.C11600b;
import p302n7.C11934c;
import p302n7.C11945g;
import p302n7.C11958o;
import p302n7.C11972x;
import p311o7.C12029k;
import p330q8.C12192a;
import p377v8.C12853b;
import p377v8.C12854c;
import p395x7.C12979c;

/* renamed from: h7.f */
/* compiled from: FirebaseApp */
public class C10412f {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Object f41334k = new Object();

    /* renamed from: l */
    static final Map<String, C10412f> f41335l = new C5413a();

    /* renamed from: a */
    private final Context f41336a;

    /* renamed from: b */
    private final String f41337b;

    /* renamed from: c */
    private final C10423n f41338c;

    /* renamed from: d */
    private final C11958o f41339d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f41340e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f41341f = new AtomicBoolean();

    /* renamed from: g */
    private final C11972x<C12192a> f41342g;

    /* renamed from: h */
    private final C11600b<C10557f> f41343h;

    /* renamed from: i */
    private final List<C10413a> f41344i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<C10416g> f41345j = new CopyOnWriteArrayList();

    /* renamed from: h7.f$a */
    /* compiled from: FirebaseApp */
    public interface C10413a {
        /* renamed from: a */
        void mo33459a(boolean z);
    }

    /* renamed from: h7.f$b */
    /* compiled from: FirebaseApp */
    private static class C10414b implements C2069a.C2070a {

        /* renamed from: a */
        private static AtomicReference<C10414b> f41346a = new AtomicReference<>();

        private C10414b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m52603c(Context context) {
            if (C4699m.m30410a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f41346a.get() == null) {
                    C10414b bVar = new C10414b();
                    if (f41346a.compareAndSet((Object) null, bVar)) {
                        C2069a.m9142c(application);
                        C2069a.m9141b().mo8009a(bVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo8022a(boolean z) {
            synchronized (C10412f.f41334k) {
                Iterator it = new ArrayList(C10412f.f41335l.values()).iterator();
                while (it.hasNext()) {
                    C10412f fVar = (C10412f) it.next();
                    if (fVar.f41340e.get()) {
                        fVar.m52571C(z);
                    }
                }
            }
        }
    }

    /* renamed from: h7.f$c */
    /* compiled from: FirebaseApp */
    private static class C10415c extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C10415c> f41347b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f41348a;

        public C10415c(Context context) {
            this.f41348a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m52606b(Context context) {
            if (f41347b.get() == null) {
                C10415c cVar = new C10415c(context);
                if (f41347b.compareAndSet((Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo33476c() {
            this.f41348a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C10412f.f41334k) {
                for (C10412f d : C10412f.f41335l.values()) {
                    d.m52584t();
                }
            }
            mo33476c();
        }
    }

    protected C10412f(Context context, String str, C10423n nVar) {
        this.f41336a = (Context) C4141r.m28221k(context);
        this.f41337b = C4141r.m28217g(str);
        this.f41338c = (C10423n) C4141r.m28221k(nVar);
        C10427p b = FirebaseInitProvider.m44473b();
        C12854c.m60799b("Firebase");
        C12854c.m60799b("ComponentDiscovery");
        List<C11600b<ComponentRegistrar>> b2 = C11945g.m57677c(context, ComponentDiscoveryService.class).mo36275b();
        C12854c.m60798a();
        C12854c.m60799b("Runtime");
        C11958o.C11960b g = C11958o.m57701m(C12029k.INSTANCE).mo36285d(b2).mo36284c(new FirebaseCommonRegistrar()).mo36284c(new ExecutorsRegistrar()).mo36283b(C11934c.m57625s(context, Context.class, new Class[0])).mo36283b(C11934c.m57625s(this, C10412f.class, new Class[0])).mo36283b(C11934c.m57625s(nVar, C10423n.class, new Class[0])).mo36287g(new C12853b());
        if (C0779n.m3539a(context) && FirebaseInitProvider.m44474c()) {
            g.mo36283b(C11934c.m57625s(b, C10427p.class, new Class[0]));
        }
        C11958o e = g.mo36286e();
        this.f41339d = e;
        C12854c.m60798a();
        this.f41342g = new C11972x<>(new C10411e(this, context));
        this.f41343h = e.mo36266d(C10557f.class);
        mo33464g(new C10410d(this));
        C12854c.m60798a();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m52569A(boolean z) {
        if (!z) {
            this.f41343h.get().mo33755l();
        }
    }

    /* renamed from: B */
    private static String m52570B(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m52571C(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C10413a a : this.f41344i) {
            a.mo33459a(z);
        }
    }

    /* renamed from: D */
    private void m52572D() {
        for (C10416g a : this.f41345j) {
            a.mo26310a(this.f41337b, this.f41338c);
        }
    }

    /* renamed from: i */
    private void m52579i() {
        C4141r.m28225o(!this.f41341f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: l */
    private static List<String> m52580l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f41334k) {
            for (C10412f q : f41335l.values()) {
                arrayList.add(q.mo33470q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: n */
    public static List<C10412f> m52581n(Context context) {
        ArrayList arrayList;
        synchronized (f41334k) {
            arrayList = new ArrayList(f41335l.values());
        }
        return arrayList;
    }

    /* renamed from: o */
    public static C10412f m52582o() {
        C10412f fVar;
        synchronized (f41334k) {
            fVar = f41335l.get("[DEFAULT]");
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C4701o.m30423a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    /* renamed from: p */
    public static C10412f m52583p(String str) {
        C10412f fVar;
        String str2;
        synchronized (f41334k) {
            fVar = f41335l.get(m52570B(str));
            if (fVar != null) {
                fVar.f41343h.get().mo33755l();
            } else {
                List<String> l = m52580l();
                if (l.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", l);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m52584t() {
        if (!C0779n.m3539a(this.f41336a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo33470q());
            C10415c.m52606b(this.f41336a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + mo33470q());
        this.f41339d.mo36282p(mo33475y());
        this.f41343h.get().mo33755l();
    }

    /* renamed from: u */
    public static C10412f m52585u(Context context) {
        synchronized (f41334k) {
            if (f41335l.containsKey("[DEFAULT]")) {
                C10412f o = m52582o();
                return o;
            }
            C10423n a = C10423n.m52613a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C10412f v = m52586v(context, a);
            return v;
        }
    }

    /* renamed from: v */
    public static C10412f m52586v(Context context, C10423n nVar) {
        return m52587w(context, nVar, "[DEFAULT]");
    }

    /* renamed from: w */
    public static C10412f m52587w(Context context, C10423n nVar, String str) {
        C10412f fVar;
        C10414b.m52603c(context);
        String B = m52570B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f41334k) {
            Map<String, C10412f> map = f41335l;
            boolean z = !map.containsKey(B);
            C4141r.m28225o(z, "FirebaseApp name " + B + " already exists!");
            C4141r.m28222l(context, "Application context cannot be null.");
            fVar = new C10412f(context, B, nVar);
            map.put(B, fVar);
        }
        fVar.m52584t();
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ C12192a m52588z(Context context) {
        return new C12192a(context, mo33472s(), (C12979c) this.f41339d.mo36263a(C12979c.class));
    }

    /* renamed from: E */
    public void mo33461E(boolean z) {
        m52579i();
        if (this.f41340e.compareAndSet(!z, z)) {
            boolean d = C2069a.m9141b().mo8010d();
            if (z && d) {
                m52571C(true);
            } else if (!z && d) {
                m52571C(false);
            }
        }
    }

    /* renamed from: F */
    public void mo33462F(Boolean bool) {
        m52579i();
        this.f41342g.get().mo36703e(bool);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10412f)) {
            return false;
        }
        return this.f41337b.equals(((C10412f) obj).mo33470q());
    }

    /* renamed from: g */
    public void mo33464g(C10413a aVar) {
        m52579i();
        if (this.f41340e.get() && C2069a.m9141b().mo8010d()) {
            aVar.mo33459a(true);
        }
        this.f41344i.add(aVar);
    }

    /* renamed from: h */
    public void mo33465h(C10416g gVar) {
        m52579i();
        C4141r.m28221k(gVar);
        this.f41345j.add(gVar);
    }

    public int hashCode() {
        return this.f41337b.hashCode();
    }

    /* renamed from: j */
    public void mo33467j() {
        if (this.f41341f.compareAndSet(false, true)) {
            synchronized (f41334k) {
                f41335l.remove(this.f41337b);
            }
            m52572D();
        }
    }

    /* renamed from: k */
    public <T> T mo33468k(Class<T> cls) {
        m52579i();
        return this.f41339d.mo36263a(cls);
    }

    /* renamed from: m */
    public Context mo33469m() {
        m52579i();
        return this.f41336a;
    }

    /* renamed from: q */
    public String mo33470q() {
        m52579i();
        return this.f41337b;
    }

    /* renamed from: r */
    public C10423n mo33471r() {
        m52579i();
        return this.f41338c;
    }

    /* renamed from: s */
    public String mo33472s() {
        return C4689c.m30373e(mo33470q().getBytes(Charset.defaultCharset())) + "+" + C4689c.m30373e(mo33471r().mo33480c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return C4133p.m28195c(this).mo17442a(MediationMetaData.KEY_NAME, this.f41337b).mo17442a("options", this.f41338c).toString();
    }

    /* renamed from: x */
    public boolean mo33474x() {
        m52579i();
        return this.f41342g.get().mo36702b();
    }

    /* renamed from: y */
    public boolean mo33475y() {
        return "[DEFAULT]".equals(mo33470q());
    }
}
