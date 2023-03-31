package com.google.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.C7837p0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p033d5.C4141r;
import p218e6.C9979k;
import p293m7.C11830j;

/* renamed from: com.google.firebase.auth.o0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7833o0 {

    /* renamed from: a */
    private final FirebaseAuth f34169a;

    /* renamed from: b */
    private Long f34170b;

    /* renamed from: c */
    private C7837p0.C7839b f34171c;

    /* renamed from: d */
    private Executor f34172d;

    /* renamed from: e */
    private String f34173e;

    /* renamed from: f */
    private Activity f34174f;

    /* renamed from: g */
    private C7837p0.C7838a f34175g;

    /* renamed from: h */
    private C7819k0 f34176h;

    /* renamed from: i */
    private C7848s0 f34177i;

    /* renamed from: j */
    private boolean f34178j;

    /* renamed from: com.google.firebase.auth.o0$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static final class C7834a {

        /* renamed from: a */
        private final FirebaseAuth f34179a;

        /* renamed from: b */
        private String f34180b;

        /* renamed from: c */
        private Long f34181c;

        /* renamed from: d */
        private C7837p0.C7839b f34182d;

        /* renamed from: e */
        private Executor f34183e;

        /* renamed from: f */
        private Activity f34184f;

        /* renamed from: g */
        private C7837p0.C7838a f34185g;

        /* renamed from: h */
        private C7819k0 f34186h;

        /* renamed from: i */
        private C7848s0 f34187i;

        /* renamed from: j */
        private boolean f34188j;

        public C7834a(FirebaseAuth firebaseAuth) {
            this.f34179a = (FirebaseAuth) C4141r.m28221k(firebaseAuth);
        }

        /* renamed from: a */
        public C7833o0 mo26167a() {
            C4141r.m28222l(this.f34179a, "FirebaseAuth instance cannot be null");
            C4141r.m28222l(this.f34181c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            C4141r.m28222l(this.f34182d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            C4141r.m28222l(this.f34184f, "You must specify an Activity on your PhoneAuthOptions. Please call #setActivity()");
            this.f34183e = C9979k.f39917a;
            if (this.f34181c.longValue() < 0 || this.f34181c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            C7819k0 k0Var = this.f34186h;
            boolean z = false;
            if (k0Var == null) {
                C4141r.m28218h(this.f34180b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                C4141r.m28212b(!this.f34188j, "You cannot require sms validation without setting a multi-factor session.");
                if (this.f34187i == null) {
                    z = true;
                }
                C4141r.m28212b(z, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (((C11830j) k0Var).mo36061M1()) {
                C4141r.m28217g(this.f34180b);
                if (this.f34187i == null) {
                    z = true;
                }
                C4141r.m28212b(z, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            } else {
                C4141r.m28212b(this.f34187i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                if (this.f34180b == null) {
                    z = true;
                }
                C4141r.m28212b(z, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            }
            return new C7833o0(this.f34179a, this.f34181c, this.f34182d, this.f34183e, this.f34180b, this.f34184f, this.f34185g, this.f34186h, this.f34187i, this.f34188j, (C7808h1) null);
        }

        /* renamed from: b */
        public C7834a mo26168b(Activity activity) {
            this.f34184f = activity;
            return this;
        }

        /* renamed from: c */
        public C7834a mo26169c(C7837p0.C7839b bVar) {
            this.f34182d = bVar;
            return this;
        }

        /* renamed from: d */
        public C7834a mo26170d(C7837p0.C7838a aVar) {
            this.f34185g = aVar;
            return this;
        }

        /* renamed from: e */
        public C7834a mo26171e(C7848s0 s0Var) {
            this.f34187i = s0Var;
            return this;
        }

        /* renamed from: f */
        public C7834a mo26172f(C7819k0 k0Var) {
            this.f34186h = k0Var;
            return this;
        }

        /* renamed from: g */
        public C7834a mo26173g(String str) {
            this.f34180b = str;
            return this;
        }

        /* renamed from: h */
        public C7834a mo26174h(Long l, TimeUnit timeUnit) {
            this.f34181c = Long.valueOf(TimeUnit.SECONDS.convert(l.longValue(), timeUnit));
            return this;
        }
    }

    /* synthetic */ C7833o0(FirebaseAuth firebaseAuth, Long l, C7837p0.C7839b bVar, Executor executor, String str, Activity activity, C7837p0.C7838a aVar, C7819k0 k0Var, C7848s0 s0Var, boolean z, C7808h1 h1Var) {
        this.f34169a = firebaseAuth;
        this.f34173e = str;
        this.f34170b = l;
        this.f34171c = bVar;
        this.f34174f = activity;
        this.f34172d = executor;
        this.f34175g = aVar;
        this.f34176h = k0Var;
        this.f34177i = s0Var;
        this.f34178j = z;
    }

    /* renamed from: a */
    public final Activity mo26156a() {
        return this.f34174f;
    }

    /* renamed from: b */
    public final FirebaseAuth mo26157b() {
        return this.f34169a;
    }

    /* renamed from: c */
    public final C7819k0 mo26158c() {
        return this.f34176h;
    }

    /* renamed from: d */
    public final C7837p0.C7838a mo26159d() {
        return this.f34175g;
    }

    /* renamed from: e */
    public final C7837p0.C7839b mo26160e() {
        return this.f34171c;
    }

    /* renamed from: f */
    public final C7848s0 mo26161f() {
        return this.f34177i;
    }

    /* renamed from: g */
    public final Long mo26162g() {
        return this.f34170b;
    }

    /* renamed from: h */
    public final String mo26163h() {
        return this.f34173e;
    }

    /* renamed from: i */
    public final Executor mo26164i() {
        return this.f34172d;
    }

    /* renamed from: j */
    public final boolean mo26165j() {
        return this.f34178j;
    }

    /* renamed from: k */
    public final boolean mo26166k() {
        return this.f34176h != null;
    }
}
