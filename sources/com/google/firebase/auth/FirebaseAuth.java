package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3155at;
import com.google.android.gms.internal.p026firebaseauthapi.C3453ju;
import com.google.android.gms.internal.p026firebaseauthapi.C3485kt;
import com.google.android.gms.internal.p026firebaseauthapi.C3554n;
import com.google.android.gms.internal.p026firebaseauthapi.C3682qs;
import com.google.android.gms.internal.p026firebaseauthapi.C3783tu;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import com.google.android.gms.internal.p026firebaseauthapi.C3847vs;
import com.google.firebase.auth.C7837p0;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p033d5.C4141r;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10412f;
import p276k8.C11600b;
import p293m7.C11803a;
import p293m7.C11806b;
import p293m7.C11807b0;
import p293m7.C11823g1;
import p293m7.C11830j;
import p293m7.C11834k0;
import p293m7.C11838l1;
import p293m7.C11840m0;
import p293m7.C11841m1;
import p293m7.C11843n0;
import p293m7.C11846o0;
import p293m7.C11851q0;
import p293m7.C11859u0;
import p330q8.C12193b;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class FirebaseAuth implements C11806b {

    /* renamed from: a */
    private C10412f f34079a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List f34080b = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List f34081c = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f34082d = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3682qs f34083e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7869z f34084f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C11838l1 f34085g;

    /* renamed from: h */
    private final Object f34086h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f34087i;

    /* renamed from: j */
    private final Object f34088j = new Object();

    /* renamed from: k */
    private String f34089k;

    /* renamed from: l */
    private final C11834k0 f34090l;

    /* renamed from: m */
    private final C11851q0 f34091m;

    /* renamed from: n */
    private final C11859u0 f34092n;

    /* renamed from: o */
    private final C11600b f34093o;

    /* renamed from: p */
    private C11840m0 f34094p;

    /* renamed from: q */
    private C11843n0 f34095q = C11843n0.m57305b();

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public interface C7775a {
        /* renamed from: a */
        void mo26047a(FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public interface C7776b {
        /* renamed from: a */
        void mo26048a(FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(C10412f fVar, C11600b bVar) {
        C3784tv b;
        C3682qs qsVar = new C3682qs(fVar);
        C11834k0 k0Var = new C11834k0(fVar.mo33469m(), fVar.mo33472s());
        C11851q0 b2 = C11851q0.m57317b();
        C11859u0 b3 = C11859u0.m57334b();
        this.f34079a = (C10412f) C4141r.m28221k(fVar);
        this.f34083e = (C3682qs) C4141r.m28221k(qsVar);
        C11834k0 k0Var2 = (C11834k0) C4141r.m28221k(k0Var);
        this.f34090l = k0Var2;
        this.f34085g = new C11838l1();
        C11851q0 q0Var = (C11851q0) C4141r.m28221k(b2);
        this.f34091m = q0Var;
        this.f34092n = (C11859u0) C4141r.m28221k(b3);
        this.f34093o = bVar;
        C7869z a = k0Var2.mo36067a();
        this.f34084f = a;
        if (!(a == null || (b = k0Var2.mo36068b(a)) == null)) {
            m43238O(this, this.f34084f, b, false, false);
        }
        q0Var.mo36102d(this);
    }

    /* renamed from: M */
    public static void m43236M(FirebaseAuth firebaseAuth, C7869z zVar) {
        if (zVar != null) {
            String b = zVar.mo26209b();
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + b + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f34095q.execute(new C7864x1(firebaseAuth));
    }

    /* renamed from: N */
    public static void m43237N(FirebaseAuth firebaseAuth, C7869z zVar) {
        if (zVar != null) {
            String b = zVar.mo26209b();
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + b + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f34095q.execute(new C7861w1(firebaseAuth, new C12193b(zVar != null ? zVar.mo26248h2() : null)));
    }

    /* renamed from: O */
    static void m43238O(FirebaseAuth firebaseAuth, C7869z zVar, C3784tv tvVar, boolean z, boolean z2) {
        boolean z3;
        C4141r.m28221k(zVar);
        C4141r.m28221k(tvVar);
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = firebaseAuth.f34084f != null && zVar.mo26209b().equals(firebaseAuth.f34084f.mo26209b());
        if (z6 || !z2) {
            C7869z zVar2 = firebaseAuth.f34084f;
            if (zVar2 == null) {
                z3 = true;
            } else {
                boolean z7 = !zVar2.mo26247g2().mo16834J1().equals(tvVar.mo16834J1());
                if (!z6 || z7) {
                    z4 = true;
                }
                z3 = true ^ z6;
                z5 = z4;
            }
            C4141r.m28221k(zVar);
            C7869z zVar3 = firebaseAuth.f34084f;
            if (zVar3 == null) {
                firebaseAuth.f34084f = zVar;
            } else {
                zVar3.mo26246f2(zVar.mo26227M1());
                if (!zVar.mo26229O1()) {
                    firebaseAuth.f34084f.mo26245e2();
                }
                firebaseAuth.f34084f.mo26252l2(zVar.mo26226L1().mo26100b());
            }
            if (z) {
                firebaseAuth.f34090l.mo36070d(firebaseAuth.f34084f);
            }
            if (z5) {
                C7869z zVar4 = firebaseAuth.f34084f;
                if (zVar4 != null) {
                    zVar4.mo26251k2(tvVar);
                }
                m43237N(firebaseAuth, firebaseAuth.f34084f);
            }
            if (z3) {
                m43236M(firebaseAuth, firebaseAuth.f34084f);
            }
            if (z) {
                firebaseAuth.f34090l.mo36071e(zVar, tvVar);
            }
            C7869z zVar5 = firebaseAuth.f34084f;
            if (zVar5 != null) {
                m43245q0(firebaseAuth).mo36079e(zVar5.mo26247g2());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final C7837p0.C7839b m43239S(String str, C7837p0.C7839b bVar) {
        return (!this.f34085g.mo36075g() || str == null || !str.equals(this.f34085g.mo36072d())) ? bVar : new C7784b2(this, bVar);
    }

    /* renamed from: T */
    private final boolean m43240T(String str) {
        C7798f c = C7798f.m43367c(str);
        return c != null && !TextUtils.equals(this.f34089k, c.mo26094d());
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C10412f.m52582o().mo33468k(FirebaseAuth.class);
    }

    /* renamed from: q0 */
    public static C11840m0 m43245q0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f34094p == null) {
            firebaseAuth.f34094p = new C11840m0((C10412f) C4141r.m28221k(firebaseAuth.f34079a));
        }
        return firebaseAuth.f34094p;
    }

    /* renamed from: A */
    public C9975i<C7810i> mo25990A(String str, String str2) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        return this.f34083e.mo16628b(this.f34079a, str, str2, this.f34089k, new C7792d2(this));
    }

    /* renamed from: B */
    public C9975i<C7810i> mo25991B(String str, String str2) {
        return mo26045y(C7818k.m43425b(str, str2));
    }

    /* renamed from: C */
    public void mo25992C() {
        mo25997K();
        C11840m0 m0Var = this.f34094p;
        if (m0Var != null) {
            m0Var.mo36077c();
        }
    }

    /* renamed from: D */
    public C9975i<C7810i> mo25993D(Activity activity, C7829n nVar) {
        C4141r.m28221k(nVar);
        C4141r.m28221k(activity);
        C9977j jVar = new C9977j();
        if (!this.f34091m.mo36106h(activity, jVar, this)) {
            return C9980l.m51030d(C3847vs.m27245a(new Status(17057)));
        }
        this.f34091m.mo36104f(activity.getApplicationContext(), this);
        nVar.mo26137c(activity);
        return jVar.mo32542a();
    }

    /* renamed from: E */
    public void mo25994E() {
        synchronized (this.f34086h) {
            this.f34087i = C3485kt.m26018a();
        }
    }

    /* renamed from: F */
    public void mo25995F(String str, int i) {
        C4141r.m28217g(str);
        boolean z = false;
        if (i >= 0 && i <= 65535) {
            z = true;
        }
        C4141r.m28212b(z, "Port number must be in the range 0-65535");
        C3783tu.m27056f(this.f34079a, str, i);
    }

    /* renamed from: G */
    public C9975i<String> mo25996G(String str) {
        C4141r.m28217g(str);
        return this.f34083e.mo16640n(this.f34079a, str, this.f34089k);
    }

    /* renamed from: K */
    public final void mo25997K() {
        C4141r.m28221k(this.f34090l);
        C7869z zVar = this.f34084f;
        if (zVar != null) {
            C11834k0 k0Var = this.f34090l;
            C4141r.m28221k(zVar);
            k0Var.mo36069c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{zVar.mo26209b()}));
            this.f34084f = null;
        }
        this.f34090l.mo36069c("com.google.firebase.auth.FIREBASE_USER");
        m43237N(this, (C7869z) null);
        m43236M(this, (C7869z) null);
    }

    /* renamed from: L */
    public final void mo25998L(C7869z zVar, C3784tv tvVar, boolean z) {
        m43238O(this, zVar, tvVar, true, false);
    }

    /* renamed from: P */
    public final void mo25999P(C7833o0 o0Var) {
        String str;
        if (o0Var.mo26166k()) {
            FirebaseAuth b = o0Var.mo26157b();
            if (((C11830j) C4141r.m28221k(o0Var.mo26158c())).mo36061M1()) {
                str = C4141r.m28217g(o0Var.mo26163h());
            } else {
                str = C4141r.m28217g(((C7848s0) C4141r.m28221k(o0Var.mo26161f())).mo26111b());
            }
            if (o0Var.mo26159d() == null || !C3453ju.m25952d(str, o0Var.mo26160e(), (Activity) C4141r.m28221k(o0Var.mo26156a()), o0Var.mo26164i())) {
                b.f34092n.mo36110a(b, o0Var.mo26163h(), (Activity) C4141r.m28221k(o0Var.mo26156a()), b.mo26001R()).mo26347b(new C7780a2(b, o0Var));
                return;
            }
            return;
        }
        FirebaseAuth b2 = o0Var.mo26157b();
        String g = C4141r.m28217g(o0Var.mo26163h());
        long longValue = o0Var.mo26162g().longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C7837p0.C7839b e = o0Var.mo26160e();
        Activity activity = (Activity) C4141r.m28221k(o0Var.mo26156a());
        Executor i = o0Var.mo26164i();
        boolean z = o0Var.mo26159d() != null;
        if (z || !C3453ju.m25952d(g, e, activity, i)) {
            b2.f34092n.mo36110a(b2, g, activity, b2.mo26001R()).mo26347b(new C7871z1(b2, g, longValue, timeUnit, e, activity, i, z));
        }
    }

    /* renamed from: Q */
    public final void mo26000Q(String str, long j, TimeUnit timeUnit, C7837p0.C7839b bVar, Activity activity, Executor executor, boolean z, String str2, String str3) {
        long j2 = j;
        long convert = TimeUnit.SECONDS.convert(j, timeUnit);
        if (convert < 0 || convert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String str4 = str;
        this.f34083e.mo16641p(this.f34079a, new C3554n(str, convert, z, this.f34087i, this.f34089k, str2, mo26001R(), str3), m43239S(str, bVar), activity, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo26001R() {
        return C3155at.m25054a(mo26030l().mo33469m());
    }

    /* renamed from: U */
    public final C9975i mo26002U(C7869z zVar) {
        C4141r.m28221k(zVar);
        return this.f34083e.mo16646u(zVar, new C7852t1(this, zVar));
    }

    /* renamed from: V */
    public final C9975i mo26003V(C7869z zVar, C7807h0 h0Var, String str) {
        C4141r.m28221k(zVar);
        C4141r.m28221k(h0Var);
        if (!(h0Var instanceof C7842q0)) {
            return C9980l.m51030d(C3847vs.m27245a(new Status(17499)));
        }
        return this.f34083e.mo16648w(this.f34079a, (C7842q0) h0Var, zVar, str, new C7792d2(this));
    }

    /* renamed from: W */
    public final C9975i mo26004W(C7869z zVar, boolean z) {
        if (zVar == null) {
            return C9980l.m51030d(C3847vs.m27245a(new Status(17495)));
        }
        C3784tv g2 = zVar.mo26247g2();
        if (!g2.mo16839O1() || z) {
            return this.f34083e.mo16650y(this.f34079a, zVar, g2.mo16835K1(), new C7868y1(this));
        }
        return C9980l.m51031e(C11807b0.m57198a(g2.mo16834J1()));
    }

    /* renamed from: X */
    public final C9975i mo26005X(C7869z zVar, C7806h hVar) {
        C4141r.m28221k(hVar);
        C4141r.m28221k(zVar);
        return this.f34083e.mo16651z(this.f34079a, zVar, hVar.mo26064K1(), new C7797e2(this));
    }

    /* renamed from: Y */
    public final C9975i mo26006Y(C7869z zVar, C7806h hVar) {
        C4141r.m28221k(zVar);
        C4141r.m28221k(hVar);
        C7806h K1 = hVar.mo26064K1();
        if (K1 instanceof C7814j) {
            C7814j jVar = (C7814j) K1;
            if (URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD.equals(jVar.mo26063J1())) {
                return this.f34083e.mo16619C(this.f34079a, zVar, jVar.mo26118N1(), C4141r.m28217g(jVar.mo26119O1()), zVar.mo26228N1(), new C7797e2(this));
            } else if (m43240T(C4141r.m28217g(jVar.mo26120P1()))) {
                return C9980l.m51030d(C3847vs.m27245a(new Status(17072)));
            } else {
                return this.f34083e.mo16618B(this.f34079a, zVar, jVar, new C7797e2(this));
            }
        } else if (K1 instanceof C7830n0) {
            return this.f34083e.mo16620D(this.f34079a, zVar, (C7830n0) K1, this.f34089k, new C7797e2(this));
        } else {
            return this.f34083e.mo16617A(this.f34079a, zVar, K1, zVar.mo26228N1(), new C7797e2(this));
        }
    }

    /* renamed from: Z */
    public final C9975i mo26007Z(C7869z zVar, C11846o0 o0Var) {
        C4141r.m28221k(zVar);
        return this.f34083e.mo16621E(this.f34079a, zVar, o0Var);
    }

    /* renamed from: a */
    public void mo26008a(C11803a aVar) {
        C4141r.m28221k(aVar);
        this.f34081c.add(aVar);
        mo26035p0().mo36078d(this.f34081c.size());
    }

    /* renamed from: a0 */
    public final C9975i mo26009a0(C7807h0 h0Var, C11830j jVar, C7869z zVar) {
        C4141r.m28221k(h0Var);
        C4141r.m28221k(jVar);
        return this.f34083e.mo16649x(this.f34079a, zVar, (C7842q0) h0Var, C4141r.m28217g(jVar.mo36060L1()), new C7792d2(this));
    }

    /* renamed from: b */
    public final String mo26010b() {
        C7869z zVar = this.f34084f;
        if (zVar == null) {
            return null;
        }
        return zVar.mo26209b();
    }

    /* renamed from: b0 */
    public final C9975i mo26011b0(C7793e eVar, String str) {
        C4141r.m28217g(str);
        if (this.f34087i != null) {
            if (eVar == null) {
                eVar = C7793e.m43335Q1();
            }
            eVar.mo26081U1(this.f34087i);
        }
        return this.f34083e.mo16622F(this.f34079a, eVar, str);
    }

    /* renamed from: c */
    public final C9975i mo26012c(boolean z) {
        return mo26004W(this.f34084f, z);
    }

    /* renamed from: c0 */
    public final C9975i mo26013c0(Activity activity, C7829n nVar, C7869z zVar) {
        C4141r.m28221k(activity);
        C4141r.m28221k(nVar);
        C4141r.m28221k(zVar);
        C9977j jVar = new C9977j();
        if (!this.f34091m.mo36107i(activity, jVar, this, zVar)) {
            return C9980l.m51030d(C3847vs.m27245a(new Status(17057)));
        }
        this.f34091m.mo36105g(activity.getApplicationContext(), this, zVar);
        nVar.mo26135a(activity);
        return jVar.mo32542a();
    }

    /* renamed from: d */
    public void mo26014d(C11803a aVar) {
        C4141r.m28221k(aVar);
        this.f34081c.remove(aVar);
        mo26035p0().mo36078d(this.f34081c.size());
    }

    /* renamed from: d0 */
    public final C9975i mo26015d0(Activity activity, C7829n nVar, C7869z zVar) {
        C4141r.m28221k(activity);
        C4141r.m28221k(nVar);
        C4141r.m28221k(zVar);
        C9977j jVar = new C9977j();
        if (!this.f34091m.mo36107i(activity, jVar, this, zVar)) {
            return C9980l.m51030d(C3847vs.m27245a(new Status(17057)));
        }
        this.f34091m.mo36105g(activity.getApplicationContext(), this, zVar);
        nVar.mo26136b(activity);
        return jVar.mo32542a();
    }

    /* renamed from: e */
    public void mo26016e(C7775a aVar) {
        this.f34082d.add(aVar);
        this.f34095q.execute(new C7858v1(this, aVar));
    }

    /* renamed from: e0 */
    public final C9975i mo26017e0(C7869z zVar, String str) {
        C4141r.m28221k(zVar);
        C4141r.m28217g(str);
        return this.f34083e.mo16633g(this.f34079a, zVar, str, new C7797e2(this)).mo26355j(new C7788c2(this));
    }

    /* renamed from: f */
    public void mo26018f(C7776b bVar) {
        this.f34080b.add(bVar);
        ((C11843n0) C4141r.m28221k(this.f34095q)).execute(new C7855u1(this, bVar));
    }

    /* renamed from: f0 */
    public final C9975i mo26019f0(C7869z zVar, String str) {
        C4141r.m28217g(str);
        C4141r.m28221k(zVar);
        return this.f34083e.mo16634h(this.f34079a, zVar, str, new C7797e2(this));
    }

    /* renamed from: g */
    public C9975i<Void> mo26020g(String str) {
        C4141r.m28217g(str);
        return this.f34083e.mo16642q(this.f34079a, str, this.f34089k);
    }

    /* renamed from: g0 */
    public final C9975i mo26021g0(C7869z zVar, String str) {
        C4141r.m28221k(zVar);
        C4141r.m28217g(str);
        return this.f34083e.mo16635i(this.f34079a, zVar, str, new C7797e2(this));
    }

    /* renamed from: h */
    public C9975i<C7789d> mo26022h(String str) {
        C4141r.m28217g(str);
        return this.f34083e.mo16643r(this.f34079a, str, this.f34089k);
    }

    /* renamed from: h0 */
    public final C9975i mo26023h0(C7869z zVar, String str) {
        C4141r.m28221k(zVar);
        C4141r.m28217g(str);
        return this.f34083e.mo16636j(this.f34079a, zVar, str, new C7797e2(this));
    }

    /* renamed from: i */
    public C9975i<Void> mo26024i(String str, String str2) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        return this.f34083e.mo16644s(this.f34079a, str, str2, this.f34089k);
    }

    /* renamed from: i0 */
    public final C9975i mo26025i0(C7869z zVar, C7830n0 n0Var) {
        C4141r.m28221k(zVar);
        C4141r.m28221k(n0Var);
        return this.f34083e.mo16637k(this.f34079a, zVar, n0Var.clone(), new C7797e2(this));
    }

    /* renamed from: j */
    public C9975i<C7810i> mo26026j(String str, String str2) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        return this.f34083e.mo16645t(this.f34079a, str, str2, this.f34089k, new C7792d2(this));
    }

    /* renamed from: j0 */
    public final C9975i mo26027j0(C7869z zVar, C7866y0 y0Var) {
        C4141r.m28221k(zVar);
        C4141r.m28221k(y0Var);
        return this.f34083e.mo16638l(this.f34079a, zVar, y0Var, new C7797e2(this));
    }

    /* renamed from: k */
    public C9975i<C7854u0> mo26028k(String str) {
        C4141r.m28217g(str);
        return this.f34083e.mo16647v(this.f34079a, str, this.f34089k);
    }

    /* renamed from: k0 */
    public final C9975i mo26029k0(String str, String str2, C7793e eVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        if (eVar == null) {
            eVar = C7793e.m43335Q1();
        }
        String str3 = this.f34087i;
        if (str3 != null) {
            eVar.mo26081U1(str3);
        }
        return this.f34083e.mo16639m(str, str2, eVar);
    }

    /* renamed from: l */
    public C10412f mo26030l() {
        return this.f34079a;
    }

    /* renamed from: m */
    public C7869z mo26031m() {
        return this.f34084f;
    }

    /* renamed from: n */
    public C7856v mo26032n() {
        return this.f34085g;
    }

    /* renamed from: o */
    public String mo26033o() {
        String str;
        synchronized (this.f34086h) {
            str = this.f34087i;
        }
        return str;
    }

    /* renamed from: p */
    public String mo26034p() {
        String str;
        synchronized (this.f34088j) {
            str = this.f34089k;
        }
        return str;
    }

    /* renamed from: p0 */
    public final synchronized C11840m0 mo26035p0() {
        return m43245q0(this);
    }

    /* renamed from: q */
    public void mo26036q(C7775a aVar) {
        this.f34082d.remove(aVar);
    }

    /* renamed from: r */
    public void mo26037r(C7776b bVar) {
        this.f34080b.remove(bVar);
    }

    /* renamed from: r0 */
    public final C11600b mo26038r0() {
        return this.f34093o;
    }

    /* renamed from: s */
    public C9975i<Void> mo26039s(String str) {
        C4141r.m28217g(str);
        return mo26040t(str, (C7793e) null);
    }

    /* renamed from: t */
    public C9975i<Void> mo26040t(String str, C7793e eVar) {
        C4141r.m28217g(str);
        if (eVar == null) {
            eVar = C7793e.m43335Q1();
        }
        String str2 = this.f34087i;
        if (str2 != null) {
            eVar.mo26081U1(str2);
        }
        eVar.mo26082V1(1);
        return this.f34083e.mo16623G(this.f34079a, str, eVar, this.f34089k);
    }

    /* renamed from: u */
    public C9975i<Void> mo26041u(String str, C7793e eVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(eVar);
        if (eVar.mo26071I1()) {
            String str2 = this.f34087i;
            if (str2 != null) {
                eVar.mo26081U1(str2);
            }
            return this.f34083e.mo16624H(this.f34079a, str, eVar, this.f34089k);
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    /* renamed from: v */
    public void mo26042v(String str) {
        C4141r.m28217g(str);
        synchronized (this.f34086h) {
            this.f34087i = str;
        }
    }

    /* renamed from: w */
    public void mo26043w(String str) {
        C4141r.m28217g(str);
        synchronized (this.f34088j) {
            this.f34089k = str;
        }
    }

    /* renamed from: x */
    public C9975i<C7810i> mo26044x() {
        C7869z zVar = this.f34084f;
        if (zVar == null || !zVar.mo26229O1()) {
            return this.f34083e.mo16625I(this.f34079a, new C7792d2(this), this.f34089k);
        }
        C11841m1 m1Var = (C11841m1) this.f34084f;
        m1Var.mo36086s2(false);
        return C9980l.m51031e(new C11823g1(m1Var));
    }

    /* renamed from: y */
    public C9975i<C7810i> mo26045y(C7806h hVar) {
        C4141r.m28221k(hVar);
        C7806h K1 = hVar.mo26064K1();
        if (K1 instanceof C7814j) {
            C7814j jVar = (C7814j) K1;
            if (!jVar.mo26121Q1()) {
                return this.f34083e.mo16628b(this.f34079a, jVar.mo26118N1(), C4141r.m28217g(jVar.mo26119O1()), this.f34089k, new C7792d2(this));
            }
            if (m43240T(C4141r.m28217g(jVar.mo26120P1()))) {
                return C9980l.m51030d(C3847vs.m27245a(new Status(17072)));
            }
            return this.f34083e.mo16629c(this.f34079a, jVar, new C7792d2(this));
        } else if (!(K1 instanceof C7830n0)) {
            return this.f34083e.mo16626J(this.f34079a, K1, this.f34089k, new C7792d2(this));
        } else {
            return this.f34083e.mo16630d(this.f34079a, (C7830n0) K1, this.f34089k, new C7792d2(this));
        }
    }

    /* renamed from: z */
    public C9975i<C7810i> mo26046z(String str) {
        C4141r.m28217g(str);
        return this.f34083e.mo16627K(this.f34079a, str, this.f34089k, new C7792d2(this));
    }

    @Keep
    public static FirebaseAuth getInstance(C10412f fVar) {
        return (FirebaseAuth) fVar.mo33468k(FirebaseAuth.class);
    }
}
