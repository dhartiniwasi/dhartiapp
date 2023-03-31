package p033d5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p017b5.C1793e;

/* renamed from: d5.g0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4106g0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C4106g0 m28142b(Activity activity, Intent intent, int i) {
        return new C4100e0(intent, activity, i);
    }

    /* renamed from: c */
    public static C4106g0 m28143c(C1793e eVar, Intent intent, int i) {
        return new C4103f0(intent, eVar, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17383a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo17383a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
