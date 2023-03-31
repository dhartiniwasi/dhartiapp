package p030d2;

import android.os.Looper;
import com.facebook.ads.AdError;
import p004a2.C0079u1;
import p030d2.C4042o;
import p030d2.C4048w;
import p177z1.C6272r1;

/* renamed from: d2.y */
/* compiled from: DrmSessionManager */
public interface C4052y {

    /* renamed from: a */
    public static final C4052y f23132a;
    @Deprecated

    /* renamed from: b */
    public static final C4052y f23133b;

    /* renamed from: d2.y$a */
    /* compiled from: DrmSessionManager */
    class C4053a implements C4052y {
        C4053a() {
        }

        /* renamed from: H */
        public /* synthetic */ void mo17207H() {
            C4051x.m27881b(this);
        }

        /* renamed from: a */
        public /* synthetic */ void mo17208a() {
            C4051x.m27882c(this);
        }

        /* renamed from: b */
        public C4042o mo17209b(C4048w.C4049a aVar, C6272r1 r1Var) {
            if (r1Var.f30246w == null) {
                return null;
            }
            return new C4007e0(new C4042o.C4043a(new C4046p0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        /* renamed from: c */
        public void mo17210c(Looper looper, C0079u1 u1Var) {
        }

        /* renamed from: d */
        public /* synthetic */ C4054b mo17211d(C4048w.C4049a aVar, C6272r1 r1Var) {
            return C4051x.m27880a(this, aVar, r1Var);
        }

        /* renamed from: e */
        public int mo17212e(C6272r1 r1Var) {
            return r1Var.f30246w != null ? 1 : 0;
        }
    }

    /* renamed from: d2.y$b */
    /* compiled from: DrmSessionManager */
    public interface C4054b {

        /* renamed from: a */
        public static final C4054b f23134a = C9863z.f39654b;

        /* renamed from: a */
        void mo17219a();
    }

    static {
        C4053a aVar = new C4053a();
        f23132a = aVar;
        f23133b = aVar;
    }

    /* renamed from: H */
    void mo17207H();

    /* renamed from: a */
    void mo17208a();

    /* renamed from: b */
    C4042o mo17209b(C4048w.C4049a aVar, C6272r1 r1Var);

    /* renamed from: c */
    void mo17210c(Looper looper, C0079u1 u1Var);

    /* renamed from: d */
    C4054b mo17211d(C4048w.C4049a aVar, C6272r1 r1Var);

    /* renamed from: e */
    int mo17212e(C6272r1 r1Var);
}
