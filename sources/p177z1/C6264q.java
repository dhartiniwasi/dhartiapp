package p177z1;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.IOException;
import p015b3.C1768v;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6224h;

/* renamed from: z1.q */
/* compiled from: ExoPlaybackException */
public final class C6264q extends C6265q2 {

    /* renamed from: s */
    public static final C6224h.C6225a<C6264q> f30170s = C13413p.f47751a;

    /* renamed from: d */
    public final int f30171d;

    /* renamed from: e */
    public final String f30172e;

    /* renamed from: f */
    public final int f30173f;

    /* renamed from: g */
    public final C6272r1 f30174g;

    /* renamed from: h */
    public final int f30175h;

    /* renamed from: i */
    public final C1768v f30176i;

    /* renamed from: r */
    final boolean f30177r;

    private C6264q(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (C6272r1) null, 4, false);
    }

    /* renamed from: e */
    public static /* synthetic */ C6264q m36811e(Bundle bundle) {
        return new C6264q(bundle);
    }

    /* renamed from: g */
    public static C6264q m36812g(Throwable th, String str, int i, C6272r1 r1Var, int i2, boolean z, int i3) {
        return new C6264q(1, th, (String) null, i3, str, i, r1Var, r1Var == null ? 4 : i2, z);
    }

    /* renamed from: h */
    public static C6264q m36813h(IOException iOException, int i) {
        return new C6264q(0, iOException, i);
    }

    @Deprecated
    /* renamed from: i */
    public static C6264q m36814i(RuntimeException runtimeException) {
        return m36815j(runtimeException, AdError.NETWORK_ERROR_CODE);
    }

    /* renamed from: j */
    public static C6264q m36815j(RuntimeException runtimeException, int i) {
        return new C6264q(2, runtimeException, i);
    }

    /* renamed from: k */
    private static String m36816k(int i, String str, String str2, int i2, C6272r1 r1Var, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + r1Var + ", format_supported=" + C5953m0.m35112W(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6264q mo21440f(C1768v vVar) {
        return new C6264q((String) C5953m0.m35138j(getMessage()), getCause(), this.f30179a, this.f30171d, this.f30172e, this.f30173f, this.f30174g, this.f30175h, vVar, this.f30180b, this.f30177r);
    }

    /* renamed from: l */
    public Exception mo21441l() {
        boolean z = true;
        if (this.f30171d != 1) {
            z = false;
        }
        C5917a.m34873f(z);
        return (Exception) C5917a.m34872e(getCause());
    }

    /* renamed from: m */
    public IOException mo21442m() {
        C5917a.m34873f(this.f30171d == 0);
        return (IOException) C5917a.m34872e(getCause());
    }

    /* renamed from: n */
    public RuntimeException mo21443n() {
        C5917a.m34873f(this.f30171d == 2);
        return (RuntimeException) C5917a.m34872e(getCause());
    }

    private C6264q(int i, Throwable th, String str, int i2, String str2, int i3, C6272r1 r1Var, int i4, boolean z) {
        this(m36816k(i, str, str2, i3, r1Var, i4), th, i2, i, str2, i3, r1Var, i4, (C1768v) null, SystemClock.elapsedRealtime(), z);
    }

    private C6264q(Bundle bundle) {
        super(bundle);
        C6272r1 r1Var;
        this.f30171d = bundle.getInt(C6265q2.m36824d(AdError.NO_FILL_ERROR_CODE), 2);
        this.f30172e = bundle.getString(C6265q2.m36824d(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
        this.f30173f = bundle.getInt(C6265q2.m36824d(1003), -1);
        Bundle bundle2 = bundle.getBundle(C6265q2.m36824d(1004));
        if (bundle2 == null) {
            r1Var = null;
        } else {
            r1Var = C6272r1.f30217P.mo6454a(bundle2);
        }
        this.f30174g = r1Var;
        this.f30175h = bundle.getInt(C6265q2.m36824d(1005), 4);
        this.f30177r = bundle.getBoolean(C6265q2.m36824d(1006), false);
        this.f30176i = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C6264q(String str, Throwable th, int i, int i2, String str2, int i3, C6272r1 r1Var, int i4, C1768v vVar, long j, boolean z) {
        super(str, th, i, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        C5917a.m34868a(!z2 || i5 == 1);
        C5917a.m34868a((th != null || i5 == 3) ? true : z3);
        this.f30171d = i5;
        this.f30172e = str2;
        this.f30173f = i3;
        this.f30174g = r1Var;
        this.f30175h = i4;
        this.f30176i = vVar;
        this.f30177r = z2;
    }
}
