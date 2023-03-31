package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0831h;
import androidx.lifecycle.C1217l0;

/* renamed from: androidx.fragment.app.i */
/* compiled from: FragmentController */
public class C1107i {

    /* renamed from: a */
    private final C1109k<?> f3031a;

    private C1107i(C1109k<?> kVar) {
        this.f3031a = kVar;
    }

    /* renamed from: b */
    public static C1107i m4944b(C1109k<?> kVar) {
        return new C1107i((C1109k) C0831h.m3663g(kVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo4041a(Fragment fragment) {
        C1109k<?> kVar = this.f3031a;
        kVar.f3037e.mo4149j(kVar, kVar, fragment);
    }

    /* renamed from: c */
    public void mo4042c() {
        this.f3031a.f3037e.mo4174y();
    }

    /* renamed from: d */
    public void mo4043d(Configuration configuration) {
        this.f3031a.f3037e.mo4090A(configuration);
    }

    /* renamed from: e */
    public boolean mo4044e(MenuItem menuItem) {
        return this.f3031a.f3037e.mo4092B(menuItem);
    }

    /* renamed from: f */
    public void mo4045f() {
        this.f3031a.f3037e.mo4094C();
    }

    /* renamed from: g */
    public boolean mo4046g(Menu menu, MenuInflater menuInflater) {
        return this.f3031a.f3037e.mo4096D(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo4047h() {
        this.f3031a.f3037e.mo4098E();
    }

    /* renamed from: i */
    public void mo4048i() {
        this.f3031a.f3037e.mo4101G();
    }

    /* renamed from: j */
    public void mo4049j(boolean z) {
        this.f3031a.f3037e.mo4102H(z);
    }

    /* renamed from: k */
    public boolean mo4050k(MenuItem menuItem) {
        return this.f3031a.f3037e.mo4106J(menuItem);
    }

    /* renamed from: l */
    public void mo4051l(Menu menu) {
        this.f3031a.f3037e.mo4108K(menu);
    }

    /* renamed from: m */
    public void mo4052m() {
        this.f3031a.f3037e.mo4111M();
    }

    /* renamed from: n */
    public void mo4053n(boolean z) {
        this.f3031a.f3037e.mo4113N(z);
    }

    /* renamed from: o */
    public boolean mo4054o(Menu menu) {
        return this.f3031a.f3037e.mo4114O(menu);
    }

    /* renamed from: p */
    public void mo4055p() {
        this.f3031a.f3037e.mo4118Q();
    }

    /* renamed from: q */
    public void mo4056q() {
        this.f3031a.f3037e.mo4120R();
    }

    /* renamed from: r */
    public void mo4057r() {
        this.f3031a.f3037e.mo4123T();
    }

    /* renamed from: s */
    public boolean mo4058s() {
        return this.f3031a.f3037e.mo4132a0(true);
    }

    /* renamed from: t */
    public C1114n mo4059t() {
        return this.f3031a.f3037e;
    }

    /* renamed from: u */
    public void mo4060u() {
        this.f3031a.f3037e.mo4122S0();
    }

    /* renamed from: v */
    public View mo4061v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3031a.f3037e.mo4168u0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void mo4062w(Parcelable parcelable) {
        C1109k<?> kVar = this.f3031a;
        if (kVar instanceof C1217l0) {
            kVar.f3037e.mo4140f1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable mo4063x() {
        return this.f3031a.f3037e.mo4145h1();
    }
}
