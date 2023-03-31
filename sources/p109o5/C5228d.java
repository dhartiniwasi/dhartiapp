package p109o5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p017b5.C1789c;
import p017b5.C1797g;
import p033d5.C4095d;
import p033d5.C4105g;
import p150u4.C5752h;
import p180z4.C6366d;

/* renamed from: o5.d */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5228d extends C4105g<C5231g> {
    protected C5228d(Context context, Looper looper, C4095d dVar, C1789c cVar, C1797g gVar) {
        super(context, looper, 300, dVar, cVar, gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.appset.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo17327M() {
        return true;
    }

    /* renamed from: W */
    public final boolean mo17337W() {
        return true;
    }

    /* renamed from: m */
    public final int mo12268m() {
        return 212800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof C5231g ? (C5231g) queryLocalInterface : new C5231g(iBinder);
    }

    /* renamed from: z */
    public final C6366d[] mo10646z() {
        return C5752h.f28722b;
    }
}
