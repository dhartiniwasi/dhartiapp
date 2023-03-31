package p073j4;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.C0584d;
import com.google.android.gms.internal.ads.j00;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.p44;

/* renamed from: j4.w1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4821w1 implements j00 {

    /* renamed from: a */
    final /* synthetic */ m00 f25550a;

    /* renamed from: b */
    final /* synthetic */ Context f25551b;

    /* renamed from: c */
    final /* synthetic */ Uri f25552c;

    C4821w1(C4751b2 b2Var, m00 m00, Context context, Uri uri) {
        this.f25550a = m00;
        this.f25551b = context;
        this.f25552c = uri;
    }

    public final void zza() {
        C0584d b = new C0584d.C0585a(this.f25550a.mo12237a()).mo2688b();
        b.f1914a.setPackage(p44.m18330a(this.f25551b));
        b.mo2686a(this.f25551b, this.f25552c);
        this.f25550a.mo12242f((Activity) this.f25551b);
    }
}
