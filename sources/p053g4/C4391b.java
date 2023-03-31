package p053g4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.lg0;
import com.google.android.gms.internal.ads.nj0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p073j4.C4751b2;

/* renamed from: g4.b */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4391b {

    /* renamed from: a */
    private final Context f24491a;

    /* renamed from: b */
    private boolean f24492b;

    /* renamed from: c */
    private final nj0 f24493c;

    /* renamed from: d */
    private final lg0 f24494d = new lg0(false, Collections.emptyList());

    public C4391b(Context context, nj0 nj0, lg0 lg0) {
        this.f24491a = context;
        this.f24493c = nj0;
    }

    /* renamed from: d */
    private final boolean m29216d() {
        nj0 nj0 = this.f24493c;
        return (nj0 != null && nj0.zza().f12125f) || this.f24494d.f12788a;
    }

    /* renamed from: a */
    public final void mo17896a() {
        this.f24492b = true;
    }

    /* renamed from: b */
    public final void mo17897b(String str) {
        List<String> list;
        if (m29216d()) {
            if (str == null) {
                str = "";
            }
            nj0 nj0 = this.f24493c;
            if (nj0 != null) {
                nj0.mo11128b(str, (Map) null, 3);
                return;
            }
            lg0 lg0 = this.f24494d;
            if (lg0.f12788a && (list = lg0.f12789b) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        C4409t.m29326r();
                        C4751b2.m30613h(this.f24491a, "", replace);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo17898c() {
        return !m29216d() || this.f24492b;
    }
}
