package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0244f;
import androidx.appcompat.view.C0336b;
import androidx.core.view.C0905f;
import p048g.C4288a;

/* renamed from: androidx.appcompat.app.i */
/* compiled from: AppCompatDialog */
public class C0315i extends C0244f implements C0285e {

    /* renamed from: c */
    private C0286f f843c;

    /* renamed from: d */
    private final C0905f.C0906a f844d = new C0314h(this);

    public C0315i(Context context, int i) {
        super(context, m1506e(context, i));
        C0286f d = mo1033d();
        d.mo932F(m1506e(context, i));
        d.mo946r((Bundle) null);
    }

    /* renamed from: e */
    private static int m1506e(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4288a.f23786z, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1033d().mo935d(view, layoutParams);
    }

    /* renamed from: d */
    public C0286f mo1033d() {
        if (this.f843c == null) {
            this.f843c = C0286f.m1345h(this, this);
        }
        return this.f843c;
    }

    public void dismiss() {
        super.dismiss();
        mo1033d().mo947s();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0905f.m4107e(this.f844d, getWindow().getDecorView(), this, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo1036f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo1033d().mo938i(i);
    }

    /* renamed from: g */
    public boolean mo1038g(int i) {
        return mo1033d().mo927A(i);
    }

    public void invalidateOptionsMenu() {
        mo1033d().mo944p();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo1033d().mo943o();
        super.onCreate(bundle);
        mo1033d().mo946r(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1033d().mo952x();
    }

    public void onSupportActionModeFinished(C0336b bVar) {
    }

    public void onSupportActionModeStarted(C0336b bVar) {
    }

    public C0336b onWindowStartingSupportActionMode(C0336b.C0337a aVar) {
        return null;
    }

    public void setContentView(int i) {
        mo1033d().mo928B(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo1033d().mo933G(charSequence);
    }

    public void setContentView(View view) {
        mo1033d().mo929C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1033d().mo930D(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo1033d().mo933G(getContext().getString(i));
    }
}
