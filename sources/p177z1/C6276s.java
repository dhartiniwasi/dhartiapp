package p177z1;

import android.content.Context;
import android.os.Looper;
import p004a2.C0010a;
import p014b2.C1624e;
import p015b3.C1733m;
import p015b3.C1772x;
import p037e2.C4210i;
import p037e2.C4221r;
import p149u3.C5717b0;
import p149u3.C5721m;
import p155v3.C5798f;
import p161w3.C5917a;
import p161w3.C5922c0;
import p161w3.C5923d;
import p161w3.C5953m0;
import p177z1.C6230j;
import p182a7.C6417f;
import p182a7.C6444t;

/* renamed from: z1.s */
/* compiled from: ExoPlayer */
public interface C6276s extends C6282u2 {

    /* renamed from: z1.s$a */
    /* compiled from: ExoPlayer */
    public interface C6277a {
        /* renamed from: E */
        void mo21202E(boolean z);

        /* renamed from: z */
        void mo21211z(boolean z);
    }

    /* renamed from: z1.s$b */
    /* compiled from: ExoPlayer */
    public static final class C6278b {

        /* renamed from: A */
        boolean f30299A;

        /* renamed from: B */
        boolean f30300B;

        /* renamed from: a */
        final Context f30301a;

        /* renamed from: b */
        C5923d f30302b;

        /* renamed from: c */
        long f30303c;

        /* renamed from: d */
        C6444t<C6226h3> f30304d;

        /* renamed from: e */
        C6444t<C1772x.C1773a> f30305e;

        /* renamed from: f */
        C6444t<C5717b0> f30306f;

        /* renamed from: g */
        C6444t<C6295x1> f30307g;

        /* renamed from: h */
        C6444t<C5798f> f30308h;

        /* renamed from: i */
        C6417f<C5923d, C0010a> f30309i;

        /* renamed from: j */
        Looper f30310j;

        /* renamed from: k */
        C5922c0 f30311k;

        /* renamed from: l */
        C1624e f30312l;

        /* renamed from: m */
        boolean f30313m;

        /* renamed from: n */
        int f30314n;

        /* renamed from: o */
        boolean f30315o;

        /* renamed from: p */
        boolean f30316p;

        /* renamed from: q */
        int f30317q;

        /* renamed from: r */
        int f30318r;

        /* renamed from: s */
        boolean f30319s;

        /* renamed from: t */
        C6229i3 f30320t;

        /* renamed from: u */
        long f30321u;

        /* renamed from: v */
        long f30322v;

        /* renamed from: w */
        C6292w1 f30323w;

        /* renamed from: x */
        long f30324x;

        /* renamed from: y */
        long f30325y;

        /* renamed from: z */
        boolean f30326z;

        public C6278b(Context context) {
            this(context, new C13431v(context), new C13436x(context));
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static /* synthetic */ C6226h3 m36994h(Context context) {
            return new C6248m(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static /* synthetic */ C1772x.C1773a m36995i(Context context) {
            return new C1733m(context, (C4221r) new C4210i());
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static /* synthetic */ C5717b0 m36996j(Context context) {
            return new C5721m(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static /* synthetic */ C6295x1 m36998l(C6295x1 x1Var) {
            return x1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static /* synthetic */ C6226h3 m36999m(C6226h3 h3Var) {
            return h3Var;
        }

        /* renamed from: g */
        public C6276s mo21532g() {
            C5917a.m34873f(!this.f30300B);
            this.f30300B = true;
            return new C6200b1(this, (C6282u2) null);
        }

        /* renamed from: n */
        public C6278b mo21533n(C6292w1 w1Var) {
            C5917a.m34873f(!this.f30300B);
            this.f30323w = w1Var;
            return this;
        }

        /* renamed from: o */
        public C6278b mo21534o(C6295x1 x1Var) {
            C5917a.m34873f(!this.f30300B);
            this.f30307g = new C13439y(x1Var);
            return this;
        }

        /* renamed from: p */
        public C6278b mo21535p(C6226h3 h3Var) {
            C5917a.m34873f(!this.f30300B);
            this.f30304d = new C13442z(h3Var);
            return this;
        }

        private C6278b(Context context, C6444t<C6226h3> tVar, C6444t<C1772x.C1773a> tVar2) {
            this(context, tVar, tVar2, new C13434w(context), C13373a0.f47703a, new C13428u(context), C13424t.f47762a);
        }

        private C6278b(Context context, C6444t<C6226h3> tVar, C6444t<C1772x.C1773a> tVar2, C6444t<C5717b0> tVar3, C6444t<C6295x1> tVar4, C6444t<C5798f> tVar5, C6417f<C5923d, C0010a> fVar) {
            this.f30301a = context;
            this.f30304d = tVar;
            this.f30305e = tVar2;
            this.f30306f = tVar3;
            this.f30307g = tVar4;
            this.f30308h = tVar5;
            this.f30309i = fVar;
            this.f30310j = C5953m0.m35100Q();
            this.f30312l = C1624e.f4653g;
            this.f30314n = 0;
            this.f30317q = 1;
            this.f30318r = 0;
            this.f30319s = true;
            this.f30320t = C6229i3.f29982g;
            this.f30321u = 5000;
            this.f30322v = 15000;
            this.f30323w = new C6230j.C6232b().mo21350a();
            this.f30302b = C5923d.f29058a;
            this.f30324x = 500;
            this.f30325y = 2000;
            this.f30299A = true;
        }
    }

    /* renamed from: F */
    void mo21158F(C1624e eVar, boolean z);

    /* renamed from: I */
    void mo21160I(C1772x xVar);

    /* renamed from: f */
    void mo21177f(boolean z);

    int getAudioSessionId();

    /* renamed from: v */
    C6272r1 mo21195v();

    /* renamed from: x */
    void mo21197x(boolean z);
}
