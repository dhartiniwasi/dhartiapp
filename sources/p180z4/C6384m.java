package p180z4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C1086d;
import androidx.fragment.app.C1114n;
import p033d5.C4141r;

/* renamed from: z4.m */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C6384m extends C1086d {

    /* renamed from: G0 */
    private Dialog f30632G0;

    /* renamed from: H0 */
    private DialogInterface.OnCancelListener f30633H0;

    /* renamed from: I0 */
    private Dialog f30634I0;

    /* renamed from: U1 */
    public static C6384m m37479U1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C6384m mVar = new C6384m();
        Dialog dialog2 = (Dialog) C4141r.m28222l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        mVar.f30632G0 = dialog2;
        if (onCancelListener != null) {
            mVar.f30633H0 = onCancelListener;
        }
        return mVar;
    }

    /* renamed from: M1 */
    public Dialog mo3971M1(Bundle bundle) {
        Dialog dialog = this.f30632G0;
        if (dialog != null) {
            return dialog;
        }
        mo3975R1(false);
        if (this.f30634I0 == null) {
            this.f30634I0 = new AlertDialog.Builder((Context) C4141r.m28221k(mo3837p())).create();
        }
        return this.f30634I0;
    }

    /* renamed from: T1 */
    public void mo3977T1(C1114n nVar, String str) {
        super.mo3977T1(nVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f30633H0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
