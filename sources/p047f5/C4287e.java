package p047f5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p017b5.C1789c;
import p017b5.C1797g;
import p033d5.C4095d;
import p033d5.C4105g;
import p033d5.C4162y;
import p123q5.C5406d;
import p180z4.C6366d;

/* renamed from: f5.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4287e extends C4105g<C4283a> {

    /* renamed from: Q */
    private final C4162y f23747Q;

    public C4287e(Context context, Looper looper, C4095d dVar, C4162y yVar, C1789c cVar, C1797g gVar) {
        super(context, looper, 270, dVar, cVar, gVar);
        this.f23747Q = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Bundle mo17321E() {
        return this.f23747Q.mo17491d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo17327M() {
        return true;
    }

    /* renamed from: m */
    public final int mo12268m() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C4283a ? (C4283a) queryLocalInterface : new C4283a(iBinder);
    }

    /* renamed from: z */
    public final C6366d[] mo10646z() {
        return C5406d.f27631b;
    }
}
