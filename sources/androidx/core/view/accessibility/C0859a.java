package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
/* compiled from: AccessibilityClickableSpanCompat */
public final class C0859a extends ClickableSpan {

    /* renamed from: a */
    private final int f2473a;

    /* renamed from: b */
    private final C0862c f2474b;

    /* renamed from: c */
    private final int f2475c;

    public C0859a(int i, C0862c cVar, int i2) {
        this.f2473a = i;
        this.f2474b = cVar;
        this.f2475c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2473a);
        this.f2474b.mo3286O(this.f2475c, bundle);
    }
}
