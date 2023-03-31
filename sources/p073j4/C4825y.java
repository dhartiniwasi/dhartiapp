package p073j4;

import android.content.Context;
import com.google.android.gms.internal.ads.C2282da;
import com.google.android.gms.internal.ads.C2319ea;
import com.google.android.gms.internal.ads.C2542k9;
import com.google.android.gms.internal.ads.C2580la;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C2727p9;
import com.google.android.gms.internal.ads.C2766qa;
import com.google.android.gms.internal.ads.C2803ra;
import com.google.android.gms.internal.ads.C2839s9;
import com.google.android.gms.internal.ads.C3061y9;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.r70;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import p060h4.C4584t;
import p060h4.C4596v;

/* renamed from: j4.y */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4825y extends C2319ea {

    /* renamed from: d */
    private final Context f25564d;

    private C4825y(Context context, C2282da daVar) {
        super(daVar);
        this.f25564d = context;
    }

    /* renamed from: b */
    public static C2839s9 m30843b(Context context) {
        C2839s9 s9Var = new C2839s9(new C2580la(new File(context.getCacheDir(), "admob_volley"), 20971520), new C4825y(context, new C2803ra((C2766qa) null, (SSLSocketFactory) null)), 4);
        s9Var.mo13965d();
        return s9Var;
    }

    /* renamed from: a */
    public final C2542k9 mo9863a(C2727p9 p9Var) throws C3061y9 {
        if (p9Var.zza() == 0) {
            if (Pattern.matches((String) C4596v.m30088c().mo12227b(C2679nz.f14276D3), p9Var.mo13184r())) {
                C4584t.m30036b();
                if (im0.m14413t(this.f25564d, 13400000)) {
                    C2542k9 a = new r70(this.f25564d).mo9863a(p9Var);
                    if (a != null) {
                        C4794n1.m30693k("Got gmscore asset response: ".concat(String.valueOf(p9Var.mo13184r())));
                        return a;
                    }
                    C4794n1.m30693k("Failed to get gmscore asset response: ".concat(String.valueOf(p9Var.mo13184r())));
                }
            }
        }
        return super.mo9863a(p9Var);
    }
}
