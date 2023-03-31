package p073j4;

import android.content.Context;
import com.google.android.gms.internal.ads.om0;
import com.google.android.gms.internal.ads.pm0;
import java.io.IOException;
import p032d4.C4076a;
import p180z4.C6372g;
import p180z4.C6374h;

/* renamed from: j4.c1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4754c1 extends C4749b0 {

    /* renamed from: c */
    private final Context f25414c;

    C4754c1(Context context) {
        this.f25414c = context;
    }

    /* renamed from: a */
    public final void mo14322a() {
        boolean z;
        try {
            z = C4076a.m28010c(this.f25414c);
        } catch (IOException | IllegalStateException | C6372g | C6374h e) {
            pm0.m18665e("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        om0.m17942j(z);
        pm0.m18667g("Update ad debug logging enablement as " + z);
    }
}
