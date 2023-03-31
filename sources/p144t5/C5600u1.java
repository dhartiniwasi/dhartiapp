package p144t5;

import android.util.Log;
import p403y6.C13058e;

/* renamed from: t5.u1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5600u1 extends Exception {

    /* renamed from: a */
    private final int f28216a;

    public C5600u1(int i, String str) {
        super(str);
        this.f28216a = i;
    }

    /* renamed from: a */
    public final C13058e mo19895a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new C13058e(this.f28216a, getMessage());
    }

    public C5600u1(int i, String str, Throwable th) {
        super(str, th);
        this.f28216a = i;
    }
}
