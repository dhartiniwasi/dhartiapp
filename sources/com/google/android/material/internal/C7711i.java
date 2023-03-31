package com.google.android.material.internal;

import android.widget.ImageButton;

/* renamed from: com.google.android.material.internal.i */
/* compiled from: VisibilityAwareImageButton */
public class C7711i extends ImageButton {

    /* renamed from: a */
    private int f33859a;

    /* renamed from: b */
    public final void mo25745b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f33859a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f33859a;
    }

    public void setVisibility(int i) {
        mo25745b(i, true);
    }
}
