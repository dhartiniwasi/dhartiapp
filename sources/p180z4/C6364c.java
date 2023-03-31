package p180z4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p033d5.C4141r;

/* renamed from: z4.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C6364c extends DialogFragment {

    /* renamed from: a */
    private Dialog f30589a;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f30590b;

    /* renamed from: c */
    private Dialog f30591c;

    /* renamed from: a */
    public static C6364c m37412a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C6364c cVar = new C6364c();
        Dialog dialog2 = (Dialog) C4141r.m28222l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f30589a = dialog2;
        if (onCancelListener != null) {
            cVar.f30590b = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f30590b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f30589a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f30591c == null) {
            this.f30591c = new AlertDialog.Builder((Context) C4141r.m28221k(getActivity())).create();
        }
        return this.f30591c;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
