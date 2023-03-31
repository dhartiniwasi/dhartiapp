package p116p5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p017b5.C1789c;
import p017b5.C1797g;
import p033d5.C4095d;
import p033d5.C4105g;
import p180z4.C6366d;
import p180z4.C6378j;

/* renamed from: p5.j */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class C5328j extends C4105g<C5324f> {
    public C5328j(Context context, Looper looper, C4095d dVar, C1789c cVar, C1797g gVar) {
        super(context, looper, 126, dVar, cVar, gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* renamed from: m */
    public final int mo12268m() {
        return C6378j.f30617a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof C5324f) {
            return (C5324f) queryLocalInterface;
        }
        return new C5323e(iBinder);
    }

    /* renamed from: z */
    public final C6366d[] mo10646z() {
        return C5320b.f27346d;
    }
}
