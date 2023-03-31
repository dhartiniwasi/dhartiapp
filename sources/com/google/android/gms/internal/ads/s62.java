package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.C0584d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;
import p060h4.C4470a;
import p066i4.C4661c0;
import p066i4.C4665e0;
import p066i4.C4669i;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s62 implements d52 {

    /* renamed from: a */
    private final Context f17277a;

    /* renamed from: b */
    private final mj1 f17278b;

    /* renamed from: c */
    private final Executor f17279c;

    /* renamed from: d */
    private final hs2 f17280d;

    public s62(Context context, Executor executor, mj1 mj1, hs2 hs2) {
        this.f17277a = context;
        this.f17278b = mj1;
        this.f17279c = executor;
        this.f17280d = hs2;
    }

    /* renamed from: d */
    private static String m20182d(is2 is2) {
        try {
            return is2.f11006w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        Context context = this.f17277a;
        return (context instanceof Activity) && m00.m16334g(context) && !TextUtils.isEmpty(m20182d(is2));
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        String d = m20182d(is2);
        return cf3.m10916n(cf3.m10911i((Object) null), new q62(this, d != null ? Uri.parse(d) : null, us2, is2), this.f17279c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo13955c(Uri uri, us2 us2, is2 is2, Object obj) throws Exception {
        try {
            C0584d b = new C0584d.C0585a().mo2688b();
            b.f1914a.setData(uri);
            C4669i iVar = new C4669i(b.f1914a, (C4661c0) null);
            in0 in0 = new in0();
            li1 c = this.f17278b.mo12362c(new k61(us2, is2, (String) null), new oi1(new r62(in0), (vs0) null));
            in0.mo11172d(new AdOverlayInfoParcel(iVar, (C4470a) null, c.mo12022h(), (C4665e0) null, new vm0(0, 0, false, false, false), (vs0) null, (qh1) null));
            this.f17280d.mo10941a();
            return cf3.m10911i(c.mo12023i());
        } catch (Throwable th) {
            pm0.m18665e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
