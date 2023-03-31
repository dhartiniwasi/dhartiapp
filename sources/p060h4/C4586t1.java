package p060h4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: h4.t1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4586t1 {

    /* renamed from: a */
    private final String f25011a;

    /* renamed from: b */
    private final C4580s1 f25012b;

    public C4586t1(C4580s1 s1Var) {
        String str;
        this.f25012b = s1Var;
        try {
            str = s1Var.mo18054a();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            str = null;
        }
        this.f25011a = str;
    }

    public final String toString() {
        return this.f25011a;
    }
}
