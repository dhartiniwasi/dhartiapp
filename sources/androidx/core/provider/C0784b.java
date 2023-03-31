package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.core.provider.b */
/* compiled from: CalleeHandler */
class C0784b {
    /* renamed from: a */
    static Handler m3544a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
