package p364u5;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.GoogleApiClient;
import p364u5.C12689j;

/* renamed from: u5.k */
final class C12692k extends C12689j.C12691b {

    /* renamed from: u */
    private final /* synthetic */ byte[] f46455u;

    /* renamed from: v */
    private final /* synthetic */ String f46456v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12692k(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        super(googleApiClient);
        this.f46455u = bArr;
        this.f46456v = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final /* synthetic */ void mo8025p(C2051a.C2053b bVar) throws RemoteException {
        C12694m mVar = (C12694m) bVar;
        C12685f fVar = this.f46454t;
        byte[] bArr = this.f46455u;
        String str = this.f46456v;
        if (TextUtils.isEmpty(str)) {
            str = mVar.mo37567p0("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((C12687h) mVar.mo17324H()).mo37565O1(fVar, bArr, str);
    }
}
