package p073j4;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.b53;
import p053g4.C4409t;

/* renamed from: j4.o1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4797o1 extends b53 {
    public C4797o1(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8677a(Message message) {
        try {
            super.mo8677a(message);
        } catch (Throwable th) {
            C4409t.m29326r();
            C4751b2.m30614i(C4409t.m29325q().mo15113c(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C4409t.m29325q().mo15126t(e, "AdMobHandler.handleMessage");
        }
    }
}
