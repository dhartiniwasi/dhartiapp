package p144t5;

import android.app.Application;
import android.util.Log;
import java.io.IOException;
import p032d4.C4076a;
import p180z4.C6372g;
import p180z4.C6374h;

/* renamed from: t5.b0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5532b0 {

    /* renamed from: a */
    private final Application f28059a;

    public C5532b0(Application application) {
        this.f28059a = application;
    }

    /* renamed from: a */
    public final C5527a mo19834a() {
        try {
            C4076a.C4077a a = C4076a.m28009a(this.f28059a);
            return new C5527a(a.mo17308a(), a.mo17309b());
        } catch (IOException | C6372g | C6374h e) {
            Log.d("UserMessagingPlatform", "Failed to get ad id.", e);
            return null;
        }
    }
}
