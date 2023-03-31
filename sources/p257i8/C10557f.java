package p257i8;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.p010os.C0779n;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10412f;
import p257i8.C10562j;
import p266j7.C11495a;
import p276k8.C11600b;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11943f0;
import p302n7.C11966r;
import p367u8.C12709i;

/* renamed from: i8.f */
/* compiled from: DefaultHeartBeatController */
public class C10557f implements C10561i, C10562j {

    /* renamed from: a */
    private final C11600b<C10564k> f41590a;

    /* renamed from: b */
    private final Context f41591b;

    /* renamed from: c */
    private final C11600b<C12709i> f41592c;

    /* renamed from: d */
    private final Set<C10558g> f41593d;

    /* renamed from: e */
    private final Executor f41594e;

    private C10557f(Context context, String str, Set<C10558g> set, C11600b<C12709i> bVar, Executor executor) {
        this((C11600b<C10564k>) new C10555d(context, str), set, executor, bVar, context);
    }

    /* renamed from: g */
    public static C11934c<C10557f> m53083g() {
        C11943f0<Executor> a = C11943f0.m57674a(C11495a.class, Executor.class);
        return C11934c.m57618d(C10557f.class, C10561i.class, C10562j.class).mo36256b(C11966r.m57744j(Context.class)).mo36256b(C11966r.m57744j(C10412f.class)).mo36256b(C11966r.m57747m(C10558g.class)).mo36256b(C11966r.m57746l(C12709i.class)).mo36256b(C11966r.m57745k(a)).mo36260f(new C10556e(a)).mo36258d();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C10557f m53084h(C11943f0 f0Var, C11940e eVar) {
        return new C10557f((Context) eVar.mo36263a(Context.class), ((C10412f) eVar.mo36263a(C10412f.class)).mo33472s(), eVar.mo36267e(C10558g.class), eVar.mo36266d(C12709i.class), (Executor) eVar.mo36269g(f0Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m53085i() throws Exception {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            C10564k kVar = this.f41590a.get();
            List<C10565l> c = kVar.mo33758c();
            kVar.mo33757b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                C10565l lVar = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.mo33747c());
                jSONObject.put("dates", new JSONArray(lVar.mo33746b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put(MediationMetaData.KEY_VERSION, "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C10564k m53086j(Context context, String str) {
        return new C10564k(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m53087k() throws Exception {
        synchronized (this) {
            this.f41590a.get().mo33763k(System.currentTimeMillis(), this.f41592c.get().mo37578a());
        }
        return null;
    }

    /* renamed from: a */
    public C9975i<String> mo33753a() {
        if (!C0779n.m3539a(this.f41591b)) {
            return C9980l.m51031e("");
        }
        return C9980l.m51029c(this.f41594e, new C10554c(this));
    }

    /* renamed from: b */
    public synchronized C10562j.C10563a mo33754b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C10564k kVar = this.f41590a.get();
        if (kVar.mo33761i(currentTimeMillis)) {
            kVar.mo33760g();
            return C10562j.C10563a.GLOBAL;
        }
        return C10562j.C10563a.NONE;
    }

    /* renamed from: l */
    public C9975i<Void> mo33755l() {
        if (this.f41593d.size() <= 0) {
            return C9980l.m51031e(null);
        }
        if (!C0779n.m3539a(this.f41591b)) {
            return C9980l.m51031e(null);
        }
        return C9980l.m51029c(this.f41594e, new C10553b(this));
    }

    C10557f(C11600b<C10564k> bVar, Set<C10558g> set, Executor executor, C11600b<C12709i> bVar2, Context context) {
        this.f41590a = bVar;
        this.f41593d = set;
        this.f41594e = executor;
        this.f41592c = bVar2;
        this.f41591b = context;
    }
}
