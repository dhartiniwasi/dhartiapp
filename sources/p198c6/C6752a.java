package p198c6;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import p033d5.C4087c;
import p033d5.C4095d;
import p033d5.C4105g;
import p033d5.C4114j;
import p033d5.C4141r;
import p033d5.C4142r0;
import p033d5.C4148t0;
import p162w4.C5981a;
import p180z4.C6362b;
import p180z4.C6378j;
import p189b6.C6611f;

/* renamed from: c6.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C6752a extends C4105g<C6758g> implements C6611f {

    /* renamed from: b0 */
    public static final /* synthetic */ int f31263b0 = 0;

    /* renamed from: Q */
    private final boolean f31264Q = true;

    /* renamed from: R */
    private final C4095d f31265R;

    /* renamed from: S */
    private final Bundle f31266S;

    /* renamed from: a0 */
    private final Integer f31267a0;

    public C6752a(Context context, Looper looper, boolean z, C4095d dVar, Bundle bundle, GoogleApiClient.C2049b bVar, GoogleApiClient.C2050c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f31265R = dVar;
        this.f31266S = bundle;
        this.f31267a0 = dVar.mo17365g();
    }

    /* renamed from: p0 */
    public static Bundle m38660p0(C4095d dVar) {
        dVar.mo17364f();
        Integer g = dVar.mo17365g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo17359a());
        if (g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Bundle mo17321E() {
        if (!mo17319C().getPackageName().equals(this.f31265R.mo17362d())) {
            this.f31266S.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f31265R.mo17362d());
        }
        return this.f31266S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: k */
    public final void mo22240k(C4114j jVar, boolean z) {
        try {
            ((C6758g) mo17324H()).mo22674i5(jVar, ((Integer) C4141r.m28221k(this.f31267a0)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: m */
    public final int mo12268m() {
        return C6378j.f30617a;
    }

    /* renamed from: o */
    public final void mo22241o() {
        try {
            ((C6758g) mo17324H()).mo22675o3(((Integer) C4141r.m28221k(this.f31267a0)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: q */
    public final void mo22242q(C6757f fVar) {
        C4141r.m28222l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f31265R.mo17360b();
            ((C6758g) mo17324H()).mo22673T5(new C6761j(1, new C4142r0(b, ((Integer) C4141r.m28221k(this.f31267a0)).intValue(), "<<default account>>".equals(b.name) ? C5981a.m35307a(mo17319C()).mo20688b() : null)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.mo6957q4(new C6763l(1, new C6362b(8, (PendingIntent) null), (C4148t0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: s */
    public final boolean mo17354s() {
        return this.f31264Q;
    }

    /* renamed from: t */
    public final void mo22243t() {
        mo17346h(new C4087c.C4091d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C6758g ? (C6758g) queryLocalInterface : new C6758g(iBinder);
    }
}
