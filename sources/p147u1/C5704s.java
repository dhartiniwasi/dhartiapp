package p147u1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p084l1.C4902b;
import p098n1.C5084h;
import p098n1.C5085i;
import p098n1.C5095o;
import p105o1.C5154e;
import p105o1.C5155f;
import p105o1.C5157g;
import p105o1.C5165m;
import p119q1.C5352a;
import p119q1.C5356c;
import p126r1.C5431a;
import p153v1.C5760c;
import p153v1.C5761d;
import p153v1.C5772k;
import p159w1.C5889b;
import p165x1.C6034a;

/* renamed from: u1.s */
/* compiled from: Uploader */
public class C5704s {

    /* renamed from: a */
    private final Context f28470a;

    /* renamed from: b */
    private final C5154e f28471b;

    /* renamed from: c */
    private final C5761d f28472c;

    /* renamed from: d */
    private final C5708y f28473d;

    /* renamed from: e */
    private final Executor f28474e;

    /* renamed from: f */
    private final C5889b f28475f;

    /* renamed from: g */
    private final C6034a f28476g;

    /* renamed from: h */
    private final C6034a f28477h;

    /* renamed from: i */
    private final C5760c f28478i;

    public C5704s(Context context, C5154e eVar, C5761d dVar, C5708y yVar, Executor executor, C5889b bVar, C6034a aVar, C6034a aVar2, C5760c cVar) {
        this.f28470a = context;
        this.f28471b = eVar;
        this.f28472c = dVar;
        this.f28473d = yVar;
        this.f28474e = executor;
        this.f28475f = bVar;
        this.f28476g = aVar;
        this.f28477h = aVar2;
        this.f28478i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m34016l(C5095o oVar) {
        return Boolean.valueOf(this.f28472c.mo20265R(oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m34017m(C5095o oVar) {
        return this.f28472c.mo20264D1(oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m34018n(Iterable iterable, C5095o oVar, long j) {
        this.f28472c.mo20269s1(iterable);
        this.f28472c.mo20267g0(oVar, this.f28476g.mo20745a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m34019o(Iterable iterable) {
        this.f28472c.mo20271y(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m34020p() {
        this.f28478i.mo20260a();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m34021q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f28478i.mo20262g((long) ((Integer) entry.getValue()).intValue(), C5356c.C5358b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m34022r(C5095o oVar, long j) {
        this.f28472c.mo20267g0(oVar, this.f28476g.mo20745a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m34023s(C5095o oVar, int i) {
        this.f28473d.mo20074b(oVar, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f28473d.mo20074b(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m34024t(p098n1.C5095o r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            w1.b r0 = r3.f28475f     // Catch:{ a -> 0x0026 }
            v1.d r1 = r3.f28472c     // Catch:{ a -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0026 }
            u1.i r2 = new u1.i     // Catch:{ a -> 0x0026 }
            r2.<init>(r1)     // Catch:{ a -> 0x0026 }
            r0.mo20278f(r2)     // Catch:{ a -> 0x0026 }
            boolean r0 = r3.mo20098k()     // Catch:{ a -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            w1.b r0 = r3.f28475f     // Catch:{ a -> 0x0026 }
            u1.p r1 = new u1.p     // Catch:{ a -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0026 }
            r0.mo20278f(r1)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo20099u(r4, r5)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            u1.y r0 = r3.f28473d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo20074b(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p147u1.C5704s.m34024t(n1.o, int, java.lang.Runnable):void");
    }

    /* renamed from: j */
    public C5085i mo20097j(C5165m mVar) {
        C5889b bVar = this.f28475f;
        C5760c cVar = this.f28478i;
        Objects.requireNonNull(cVar);
        return mVar.mo7717a(C5085i.m31846a().mo19007i(this.f28476g.mo20745a()).mo19009k(this.f28477h.mo20745a()).mo19008j("GDT_CLIENT_METRICS").mo19006h(new C5084h(C4902b.m31123b("proto"), ((C5352a) bVar.mo20278f(new C12661r(cVar))).mo19400f())).mo19002d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo20098k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f28470a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    public C5157g mo20099u(C5095o oVar, int i) {
        C5157g b;
        C5165m mVar = this.f28471b.get(oVar.mo19024b());
        long j = 0;
        C5157g e = C5157g.m32069e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f28475f.mo20278f(new C12657n(this, oVar))).booleanValue()) {
                Iterable<C5772k> iterable = (Iterable) this.f28475f.mo20278f(new C12658o(this, oVar));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (mVar == null) {
                    C5431a.m33267b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    b = C5157g.m32067a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C5772k b2 : iterable) {
                        arrayList.add(b2.mo20254b());
                    }
                    if (oVar.mo19057e()) {
                        arrayList.add(mo20097j(mVar));
                    }
                    b = mVar.mo7718b(C5155f.m32061a().mo19124b(arrayList).mo19125c(oVar.mo19025c()).mo19123a());
                }
                e = b;
                if (e.mo19127c() == C5157g.C5158a.TRANSIENT_ERROR) {
                    this.f28475f.mo20278f(new C12655l(this, iterable, oVar, j2));
                    this.f28473d.mo20073a(oVar, i + 1, true);
                    return e;
                }
                this.f28475f.mo20278f(new C12654k(this, iterable));
                if (e.mo19127c() == C5157g.C5158a.OK) {
                    j = Math.max(j2, e.mo19126b());
                    if (oVar.mo19057e()) {
                        this.f28475f.mo20278f(new C12653j(this));
                    }
                } else if (e.mo19127c() == C5157g.C5158a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C5772k b3 : iterable) {
                        String j3 = b3.mo20254b().mo18999j();
                        if (!hashMap.containsKey(j3)) {
                            hashMap.put(j3, 1);
                        } else {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        }
                    }
                    this.f28475f.mo20278f(new C12656m(this, hashMap));
                }
            }
            this.f28475f.mo20278f(new C12660q(this, oVar, j2));
            return e;
        }
    }

    /* renamed from: v */
    public void mo20100v(C5095o oVar, int i, Runnable runnable) {
        this.f28474e.execute(new C12651h(this, oVar, i, runnable));
    }
}
