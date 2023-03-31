package com.google.firebase.firestore;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.firestore.C7957x0;
import com.google.firebase.firestore.C7959y;
import com.google.firebase.firestore.C7964z;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p008a8.C6452b1;
import p008a8.C6456d;
import p008a8.C6471h;
import p008a8.C6476k1;
import p008a8.C6479m;
import p008a8.C6487p0;
import p025c8.C6831x2;
import p211d8.C9882f;
import p211d8.C9893q;
import p211d8.C9898r;
import p211d8.C9903u;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p238g8.C10234f0;
import p238g8.C10285v;
import p246h7.C10412f;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10460p;
import p247h8.C10472x;
import p276k8.C11598a;
import p284l7.C11760b;
import p293m7.C11806b;
import p347s7.C12462a;
import p404y7.C13064a;
import p404y7.C13068e;
import p404y7.C13072i;
import p404y7.C13073j;

public class FirebaseFirestore {

    /* renamed from: a */
    private final Context f34291a;

    /* renamed from: b */
    private final C9882f f34292b;

    /* renamed from: c */
    private final String f34293c;

    /* renamed from: d */
    private final C13064a<C13073j> f34294d;

    /* renamed from: e */
    private final C13064a<String> f34295e;

    /* renamed from: f */
    private final C10442g f34296f;

    /* renamed from: g */
    private final C10412f f34297g;

    /* renamed from: h */
    private final C7967z0 f34298h;

    /* renamed from: i */
    private final C7891a f34299i;

    /* renamed from: j */
    private C12462a f34300j;

    /* renamed from: k */
    private C7964z f34301k = new C7964z.C7966b().mo26484e();

    /* renamed from: l */
    private volatile C6487p0 f34302l;

    /* renamed from: m */
    private final C10234f0 f34303m;

    /* renamed from: com.google.firebase.firestore.FirebaseFirestore$a */
    public interface C7891a {
        void remove(String str);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [y7.a<y7.j>, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, y7.a<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseFirestore(android.content.Context r1, p211d8.C9882f r2, java.lang.String r3, p404y7.C13064a<p404y7.C13073j> r4, p404y7.C13064a<java.lang.String> r5, p247h8.C10442g r6, p246h7.C10412f r7, com.google.firebase.firestore.FirebaseFirestore.C7891a r8, p238g8.C10234f0 r9) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p247h8.C10472x.m52785b(r1)
            android.content.Context r1 = (android.content.Context) r1
            r0.f34291a = r1
            java.lang.Object r1 = p247h8.C10472x.m52785b(r2)
            d8.f r1 = (p211d8.C9882f) r1
            java.lang.Object r1 = p247h8.C10472x.m52785b(r1)
            d8.f r1 = (p211d8.C9882f) r1
            r0.f34292b = r1
            com.google.firebase.firestore.z0 r1 = new com.google.firebase.firestore.z0
            r1.<init>(r2)
            r0.f34298h = r1
            java.lang.Object r1 = p247h8.C10472x.m52785b(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.f34293c = r1
            java.lang.Object r1 = p247h8.C10472x.m52785b(r4)
            y7.a r1 = (p404y7.C13064a) r1
            r0.f34294d = r1
            java.lang.Object r1 = p247h8.C10472x.m52785b(r5)
            y7.a r1 = (p404y7.C13064a) r1
            r0.f34295e = r1
            java.lang.Object r1 = p247h8.C10472x.m52785b(r6)
            h8.g r1 = (p247h8.C10442g) r1
            r0.f34296f = r1
            r0.f34297g = r7
            r0.f34299i = r8
            r0.f34303m = r9
            com.google.firebase.firestore.z$b r1 = new com.google.firebase.firestore.z$b
            r1.<init>()
            com.google.firebase.firestore.z r1 = r1.mo26484e()
            r0.f34301k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.FirebaseFirestore.<init>(android.content.Context, d8.f, java.lang.String, y7.a, y7.a, h8.g, h7.f, com.google.firebase.firestore.FirebaseFirestore$a, g8.f0):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m43634A(C9977j jVar) {
        try {
            if (this.f34302l != null) {
                if (!this.f34302l.mo22023F()) {
                    throw new C7959y("Persistence cannot be cleared while the firestore instance is running.", C7959y.C7960a.FAILED_PRECONDITION);
                }
            }
            C6831x2.m39320s(this.f34291a, this.f34292b, this.f34293c);
            jVar.mo32544c(null);
        } catch (C7959y e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ C7929o0 m43635B(C9975i iVar) throws Exception {
        C6452b1 b1Var = (C6452b1) iVar.mo26358m();
        if (b1Var != null) {
            return new C7929o0(b1Var, this);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ Object m43636C(C7957x0.C7958a aVar, C6476k1 k1Var) throws Exception {
        return aVar.mo26468a(new C7957x0(k1Var, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ C9975i m43637D(Executor executor, C7957x0.C7958a aVar, C6476k1 k1Var) {
        return C9980l.m51029c(executor, new C7956x(this, aVar, k1Var));
    }

    /* renamed from: G */
    private C7964z m43638G(C7964z zVar, C12462a aVar) {
        return zVar;
    }

    /* renamed from: H */
    static FirebaseFirestore m43639H(Context context, C10412f fVar, C11598a<C11806b> aVar, C11598a<C11760b> aVar2, String str, C7891a aVar3, C10234f0 f0Var) {
        String g = fVar.mo33471r().mo33485g();
        if (g != null) {
            String str2 = str;
            C9882f b = C9882f.m50673b(g, str);
            C10442g gVar = new C10442g();
            C11598a<C11806b> aVar4 = aVar;
            C11598a<C11760b> aVar5 = aVar2;
            return new FirebaseFirestore(context, b, fVar.mo33470q(), new C13072i(aVar), new C13068e(aVar2), gVar, fVar, aVar3, f0Var);
        }
        throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
    }

    /* renamed from: J */
    private <ResultT> C9975i<ResultT> m43640J(C7961y0 y0Var, C7957x0.C7958a<ResultT> aVar, Executor executor) {
        m43648q();
        return this.f34302l.mo22030j0(y0Var, new C7952v(this, executor, aVar));
    }

    /* renamed from: h */
    private C7904e0 m43647h(Executor executor, Activity activity, Runnable runnable) {
        m43648q();
        C6471h hVar = new C6471h(executor, new C7946s(runnable));
        this.f34302l.mo22033x(hVar);
        return C6456d.m37658c(activity, new C7948t(this, hVar));
    }

    /* renamed from: q */
    private void m43648q() {
        if (this.f34302l == null) {
            synchronized (this.f34292b) {
                if (this.f34302l == null) {
                    this.f34302l = new C6487p0(this.f34291a, new C6479m(this.f34292b, this.f34293c, this.f34301k.mo26478b(), this.f34301k.mo26480d()), this.f34301k, this.f34294d, this.f34295e, this.f34296f, this.f34303m);
                }
            }
        }
    }

    @Keep
    static void setClientLanguage(String str) {
        C10285v.m52037p(str);
    }

    /* renamed from: u */
    public static FirebaseFirestore m43649u(C10412f fVar) {
        return m43650v(fVar, "(default)");
    }

    /* renamed from: v */
    private static FirebaseFirestore m43650v(C10412f fVar, String str) {
        C10472x.m52786c(fVar, "Provided FirebaseApp must not be null.");
        C7893a0 a0Var = (C7893a0) fVar.mo33468k(C7893a0.class);
        C10472x.m52786c(a0Var, "Firestore component is not present.");
        return a0Var.mo26311b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ void m43651y(Runnable runnable, Void voidR, C7959y yVar) {
        C10432b.m52648d(yVar == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m43652z(C6471h hVar) {
        hVar.mo21952d();
        this.f34302l.mo22026f0(hVar);
    }

    /* renamed from: E */
    public C7910g0 mo26287E(InputStream inputStream) {
        m43648q();
        C7910g0 g0Var = new C7910g0();
        this.f34302l.mo22025e0(inputStream, g0Var);
        return g0Var;
    }

    /* renamed from: F */
    public C7910g0 mo26288F(byte[] bArr) {
        return mo26287E(new ByteArrayInputStream(bArr));
    }

    /* renamed from: I */
    public <TResult> C9975i<TResult> mo26289I(C7961y0 y0Var, C7957x0.C7958a<TResult> aVar) {
        C10472x.m52786c(aVar, "Provided transaction update function must not be null.");
        return m43640J(y0Var, aVar, C6476k1.m37771g());
    }

    /* renamed from: K */
    public void mo26290K(C7964z zVar) {
        C7964z G = m43638G(zVar, this.f34300j);
        synchronized (this.f34292b) {
            C10472x.m52786c(G, "Provided settings must not be null.");
            if (this.f34302l != null) {
                if (!this.f34301k.equals(G)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
            }
            this.f34301k = G;
        }
    }

    /* renamed from: L */
    public C9975i<Void> mo26291L(String str) {
        m43648q();
        C10472x.m52788e(this.f34301k.mo26479c(), "Cannot enable indexes when persistence is disabled");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
                    int i2 = 0;
                    while (optJSONArray != null && i2 < optJSONArray.length()) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                        C9898r w = C9898r.m50742w(jSONObject3.getString("fieldPath"));
                        if ("CONTAINS".equals(jSONObject3.optString("arrayConfig"))) {
                            arrayList2.add(C9893q.C9896c.m50737b(w, C9893q.C9896c.C9897a.CONTAINS));
                        } else if ("ASCENDING".equals(jSONObject3.optString("order"))) {
                            arrayList2.add(C9893q.C9896c.m50737b(w, C9893q.C9896c.C9897a.ASCENDING));
                        } else {
                            arrayList2.add(C9893q.C9896c.m50737b(w, C9893q.C9896c.C9897a.DESCENDING));
                        }
                        i2++;
                    }
                    arrayList.add(C9893q.m50716b(-1, string, arrayList2, C9893q.f39723a));
                }
            }
            return this.f34302l.mo22034y(arrayList);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Failed to parse index configuration", e);
        }
    }

    /* renamed from: M */
    public C9975i<Void> mo26292M() {
        this.f34299i.remove(mo26306t().mo32366j());
        m43648q();
        return this.f34302l.mo22029i0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo26293N(C7921l lVar) {
        C10472x.m52786c(lVar, "Provided DocumentReference must not be null.");
        if (lVar.mo26389k() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    /* renamed from: O */
    public C9975i<Void> mo26294O() {
        m43648q();
        return this.f34302l.mo22031l0();
    }

    /* renamed from: g */
    public C7904e0 mo26295g(Runnable runnable) {
        return mo26296i(C10460p.f41437a, runnable);
    }

    /* renamed from: i */
    public C7904e0 mo26296i(Executor executor, Runnable runnable) {
        return m43647h(executor, (Activity) null, runnable);
    }

    /* renamed from: j */
    public C7898b1 mo26297j() {
        m43648q();
        return new C7898b1(this);
    }

    /* renamed from: k */
    public C9975i<Void> mo26298k() {
        C9977j jVar = new C9977j();
        this.f34296f.mo33522m(new C7954w(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: l */
    public C7905f mo26299l(String str) {
        C10472x.m52786c(str, "Provided collection path must not be null.");
        m43648q();
        return new C7905f(C9903u.m50784w(str), this);
    }

    /* renamed from: m */
    public C7929o0 mo26300m(String str) {
        C10472x.m52786c(str, "Provided collection ID must not be null.");
        if (!str.contains("/")) {
            m43648q();
            return new C7929o0(new C6452b1(C9903u.f39750b, str), this);
        }
        throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", new Object[]{str}));
    }

    /* renamed from: n */
    public C9975i<Void> mo26301n() {
        m43648q();
        return this.f34302l.mo22035z();
    }

    /* renamed from: o */
    public C7921l mo26302o(String str) {
        C10472x.m52786c(str, "Provided document path must not be null.");
        m43648q();
        return C7921l.m43755i(C9903u.m50784w(str), this);
    }

    /* renamed from: p */
    public C9975i<Void> mo26303p() {
        m43648q();
        return this.f34302l.mo22019A();
    }

    /* renamed from: r */
    public C10412f mo26304r() {
        return this.f34297g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C6487p0 mo26305s() {
        return this.f34302l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C9882f mo26306t() {
        return this.f34292b;
    }

    /* renamed from: w */
    public C9975i<C7929o0> mo26307w(String str) {
        m43648q();
        return this.f34302l.mo22022D(str).mo26353h(new C7950u(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C7967z0 mo26308x() {
        return this.f34298h;
    }
}
