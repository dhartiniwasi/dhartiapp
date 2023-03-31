package com.startapp;

import android.net.Uri;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import com.startapp.sdk.common.SDKException;

/* renamed from: com.startapp.o7 */
/* compiled from: Sta */
public class C9195o7 {

    /* renamed from: a */
    public final C9000h7 f38005a;

    /* renamed from: b */
    public final long f38006b = C9605vb.m50443a();

    public C9195o7(C9000h7 h7Var) {
        this.f38005a = h7Var;
    }

    /* renamed from: a */
    public void mo29793a(String str, String str2, SDKException sDKException) {
        int i;
        String str3;
        long a = C9605vb.m50443a();
        C9000h7 h7Var = this.f38005a;
        long j = a - this.f38006b;
        NetworkDiagnosticConfig a2 = h7Var.mo29450a();
        if (a2 != null) {
            if (sDKException == null) {
                str3 = "Success";
                i = 4;
            } else if (sDKException.getCause() != null) {
                StringBuilder a3 = C8870c1.m48422a("Failure: ");
                a3.append(sDKException.getCause().getClass().getName());
                str3 = a3.toString();
                i = 2;
            } else {
                StringBuilder a4 = C8870c1.m48422a("Error: ");
                a4.append(sDKException.mo31155a());
                str3 = a4.toString();
                i = 1;
            }
            if ((a2.mo31083d() & i) != 0) {
                Uri b = sDKException != null ? sDKException.mo31156b() : null;
                if (b == null) {
                    b = Uri.parse(str2).buildUpon().query((String) null).build();
                }
                h7Var.f36902c.execute(new C9026i7(h7Var, str + ' ' + b, str3, j));
            }
            if (i == 4) {
                h7Var.f36902c.execute(h7Var.f36904e);
            }
        }
    }
}
