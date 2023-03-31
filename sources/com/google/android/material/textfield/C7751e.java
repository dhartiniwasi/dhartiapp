package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
/* compiled from: EndIconDelegate */
abstract class C7751e {

    /* renamed from: a */
    TextInputLayout f33993a;

    /* renamed from: b */
    Context f33994b;

    /* renamed from: c */
    CheckableImageButton f33995c;

    C7751e(TextInputLayout textInputLayout) {
        this.f33993a = textInputLayout;
        this.f33994b = textInputLayout.getContext();
        this.f33995c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25906a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo25919b(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo25920c() {
        return false;
    }
}
