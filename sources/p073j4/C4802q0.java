package p073j4;

import android.content.Context;
import com.google.android.gms.internal.ads.C2282da;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C2839s9;
import com.google.android.gms.internal.ads.C2986w8;
import com.google.android.gms.internal.ads.C3025xa;
import com.google.android.gms.internal.ads.in0;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.om0;
import com.google.android.gms.internal.ads.pm0;
import java.util.Map;
import p060h4.C4596v;
import p067i5.C4690d;

/* renamed from: j4.q0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4802q0 {

    /* renamed from: a */
    private static C2839s9 f25485a;

    /* renamed from: b */
    private static final Object f25486b = new Object();
    @Deprecated

    /* renamed from: c */
    public static final C4787l0 f25487c = new C4777i0();

    public C4802q0(Context context) {
        C2839s9 s9Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f25486b) {
            if (f25485a == null) {
                C2679nz.m17343c(context);
                if (!C4690d.m30374a()) {
                    if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14266C3)).booleanValue()) {
                        s9Var = C4825y.m30843b(context);
                        f25485a = s9Var;
                    }
                }
                s9Var = C3025xa.m23150a(context, (C2282da) null);
                f25485a = s9Var;
            }
        }
    }

    /* renamed from: a */
    public final lf3 mo18524a(String str) {
        in0 in0 = new in0();
        f25485a.mo13962a(new C4799p0(str, (Map) null, in0));
        return in0;
    }

    /* renamed from: b */
    public final lf3 mo18525b(int i, String str, Map map, byte[] bArr) {
        String str2 = str;
        C4793n0 n0Var = new C4793n0((C4790m0) null);
        C4781j0 j0Var = new C4781j0(this, str2, n0Var);
        om0 om0 = new om0((String) null);
        C4784k0 k0Var = new C4784k0(this, i, str, n0Var, j0Var, bArr, map, om0);
        if (om0.m17944l()) {
            try {
                om0.mo12978d(str2, "GET", k0Var.mo13185s(), k0Var.mo13173E());
            } catch (C2986w8 e) {
                pm0.m18667g(e.getMessage());
            }
        }
        f25485a.mo13962a(k0Var);
        return n0Var;
    }
}
