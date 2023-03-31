package p073j4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import p053g4.C4409t;

/* renamed from: j4.w */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4819w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f25545a;

    /* renamed from: b */
    final /* synthetic */ String f25546b;

    /* renamed from: c */
    final /* synthetic */ boolean f25547c;

    /* renamed from: d */
    final /* synthetic */ boolean f25548d;

    C4819w(C4822x xVar, Context context, String str, boolean z, boolean z2) {
        this.f25545a = context;
        this.f25546b = str;
        this.f25547c = z;
        this.f25548d = z2;
    }

    public final void run() {
        C4409t.m29326r();
        AlertDialog.Builder g = C4751b2.m30612g(this.f25545a);
        g.setMessage(this.f25546b);
        if (this.f25547c) {
            g.setTitle("Error");
        } else {
            g.setTitle("Info");
        }
        if (this.f25548d) {
            g.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            g.setPositiveButton("Learn More", new C4816v(this));
            g.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        g.create().show();
    }
}
