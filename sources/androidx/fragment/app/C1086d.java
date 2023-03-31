package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1219m0;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1221n0;
import androidx.lifecycle.C1229u;
import p104o0.C5147f;

/* renamed from: androidx.fragment.app.d */
/* compiled from: DialogFragment */
public class C1086d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0 */
    private C1229u<C1220n> f2984A0 = new C1090d();
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public Dialog f2985B0;

    /* renamed from: C0 */
    private boolean f2986C0;

    /* renamed from: D0 */
    private boolean f2987D0;

    /* renamed from: E0 */
    private boolean f2988E0;

    /* renamed from: F0 */
    private boolean f2989F0 = false;

    /* renamed from: q0 */
    private Handler f2990q0;

    /* renamed from: r0 */
    private Runnable f2991r0 = new C1087a();

    /* renamed from: s0 */
    private DialogInterface.OnCancelListener f2992s0 = new C1088b();
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public DialogInterface.OnDismissListener f2993t0 = new C1089c();

    /* renamed from: u0 */
    private int f2994u0 = 0;

    /* renamed from: v0 */
    private int f2995v0 = 0;

    /* renamed from: w0 */
    private boolean f2996w0 = true;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public boolean f2997x0 = true;

    /* renamed from: y0 */
    private int f2998y0 = -1;

    /* renamed from: z0 */
    private boolean f2999z0;

    /* renamed from: androidx.fragment.app.d$a */
    /* compiled from: DialogFragment */
    class C1087a implements Runnable {
        C1087a() {
        }

        public void run() {
            C1086d.this.f2993t0.onDismiss(C1086d.this.f2985B0);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* compiled from: DialogFragment */
    class C1088b implements DialogInterface.OnCancelListener {
        C1088b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (C1086d.this.f2985B0 != null) {
                C1086d dVar = C1086d.this;
                dVar.onCancel(dVar.f2985B0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    /* compiled from: DialogFragment */
    class C1089c implements DialogInterface.OnDismissListener {
        C1089c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (C1086d.this.f2985B0 != null) {
                C1086d dVar = C1086d.this;
                dVar.onDismiss(dVar.f2985B0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* compiled from: DialogFragment */
    class C1090d implements C1229u<C1220n> {
        C1090d() {
        }

        /* renamed from: b */
        public void mo3983a(C1220n nVar) {
            if (nVar != null && C1086d.this.f2997x0) {
                View n1 = C1086d.this.mo3830n1();
                if (n1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C1086d.this.f2985B0 != null) {
                    if (C1114n.m4999F0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C1086d.this.f2985B0);
                    }
                    C1086d.this.f2985B0.setContentView(n1);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    /* compiled from: DialogFragment */
    class C1091e extends C1105g {

        /* renamed from: a */
        final /* synthetic */ C1105g f3004a;

        C1091e(C1105g gVar) {
            this.f3004a = gVar;
        }

        /* renamed from: c */
        public View mo3873c(int i) {
            if (this.f3004a.mo3874d()) {
                return this.f3004a.mo3873c(i);
            }
            return C1086d.this.mo3972N1(i);
        }

        /* renamed from: d */
        public boolean mo3874d() {
            return this.f3004a.mo3874d() || C1086d.this.mo3973O1();
        }
    }

    /* renamed from: J1 */
    private void m4897J1(boolean z, boolean z2) {
        if (!this.f2987D0) {
            this.f2987D0 = true;
            this.f2988E0 = false;
            Dialog dialog = this.f2985B0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f2985B0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f2990q0.getLooper()) {
                        onDismiss(this.f2985B0);
                    } else {
                        this.f2990q0.post(this.f2991r0);
                    }
                }
            }
            this.f2986C0 = true;
            if (this.f2998y0 >= 0) {
                mo3742C().mo4127V0(this.f2998y0, 1);
                this.f2998y0 = -1;
                return;
            }
            C1146w l = mo3742C().mo4154l();
            l.mo3888l(this);
            if (z) {
                l.mo3884g();
            } else {
                l.mo3883f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: P1 */
    private void m4898P1(Bundle bundle) {
        if (this.f2997x0 && !this.f2989F0) {
            try {
                this.f2999z0 = true;
                Dialog M1 = mo3971M1(bundle);
                this.f2985B0 = M1;
                if (this.f2997x0) {
                    mo3976S1(M1, this.f2994u0);
                    Context p = mo3837p();
                    if (p instanceof Activity) {
                        this.f2985B0.setOwnerActivity((Activity) p);
                    }
                    this.f2985B0.setCancelable(this.f2996w0);
                    this.f2985B0.setOnCancelListener(this.f2992s0);
                    this.f2985B0.setOnDismissListener(this.f2993t0);
                    this.f2989F0 = true;
                } else {
                    this.f2985B0 = null;
                }
                this.f2999z0 = false;
            } catch (Throwable th) {
                this.f2999z0 = false;
                throw th;
            }
        }
    }

    /* renamed from: I0 */
    public void mo3758I0(Bundle bundle) {
        super.mo3758I0(bundle);
        Dialog dialog = this.f2985B0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f2994u0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2995v0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2996w0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2997x0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2998y0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: I1 */
    public void mo3968I1() {
        m4897J1(false, false);
    }

    /* renamed from: J0 */
    public void mo3760J0() {
        super.mo3760J0();
        Dialog dialog = this.f2985B0;
        if (dialog != null) {
            this.f2986C0 = false;
            dialog.show();
            View decorView = this.f2985B0.getWindow().getDecorView();
            C1219m0.m5436a(decorView, this);
            C1221n0.m5437a(decorView, this);
            C5147f.m32049a(decorView, this);
        }
    }

    /* renamed from: K0 */
    public void mo3762K0() {
        super.mo3762K0();
        Dialog dialog = this.f2985B0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: K1 */
    public Dialog mo3969K1() {
        return this.f2985B0;
    }

    /* renamed from: L1 */
    public int mo3970L1() {
        return this.f2995v0;
    }

    /* renamed from: M0 */
    public void mo3766M0(Bundle bundle) {
        Bundle bundle2;
        super.mo3766M0(bundle);
        if (this.f2985B0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2985B0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: M1 */
    public Dialog mo3971M1(Bundle bundle) {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(mo3827m1(), mo3970L1());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public View mo3972N1(int i) {
        Dialog dialog = this.f2985B0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo3973O1() {
        return this.f2989F0;
    }

    /* renamed from: Q1 */
    public final Dialog mo3974Q1() {
        Dialog K1 = mo3969K1();
        if (K1 != null) {
            return K1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: R1 */
    public void mo3975R1(boolean z) {
        this.f2997x0 = z;
    }

    /* renamed from: S1 */
    public void mo3976S1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo3779T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo3779T0(layoutInflater, viewGroup, bundle);
        if (this.f2818P == null && this.f2985B0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2985B0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: T1 */
    public void mo3977T1(C1114n nVar, String str) {
        this.f2987D0 = false;
        this.f2988E0 = true;
        C1146w l = nVar.mo4154l();
        l.mo4290d(this, str);
        l.mo3883f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1105g mo3800e() {
        return new C1091e(super.mo3800e());
    }

    /* renamed from: j0 */
    public void mo3817j0(Context context) {
        super.mo3817j0(context);
        mo3775R().mo4349e(this.f2984A0);
        if (!this.f2988E0) {
            this.f2987D0 = false;
        }
    }

    /* renamed from: m0 */
    public void mo3826m0(Bundle bundle) {
        super.mo3826m0(bundle);
        this.f2990q0 = new Handler();
        this.f2997x0 = this.f2808F == 0;
        if (bundle != null) {
            this.f2994u0 = bundle.getInt("android:style", 0);
            this.f2995v0 = bundle.getInt("android:theme", 0);
            this.f2996w0 = bundle.getBoolean("android:cancelable", true);
            this.f2997x0 = bundle.getBoolean("android:showsDialog", this.f2997x0);
            this.f2998y0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2986C0) {
            if (C1114n.m4999F0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            m4897J1(true, true);
        }
    }

    /* renamed from: t0 */
    public void mo3850t0() {
        super.mo3850t0();
        Dialog dialog = this.f2985B0;
        if (dialog != null) {
            this.f2986C0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f2985B0.dismiss();
            if (!this.f2987D0) {
                onDismiss(this.f2985B0);
            }
            this.f2985B0 = null;
            this.f2989F0 = false;
        }
    }

    /* renamed from: u0 */
    public void mo3854u0() {
        super.mo3854u0();
        if (!this.f2988E0 && !this.f2987D0) {
            this.f2987D0 = true;
        }
        mo3775R().mo4353i(this.f2984A0);
    }

    /* renamed from: v0 */
    public LayoutInflater mo3857v0(Bundle bundle) {
        LayoutInflater v0 = super.mo3857v0(bundle);
        if (!this.f2997x0 || this.f2999z0) {
            if (C1114n.m4999F0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f2997x0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return v0;
        }
        m4898P1(bundle);
        if (C1114n.m4999F0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f2985B0;
        return dialog != null ? v0.cloneInContext(dialog.getContext()) : v0;
    }
}
