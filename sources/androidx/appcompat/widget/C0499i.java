package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.widget.C0968c;

/* renamed from: androidx.appcompat.widget.i */
/* compiled from: AppCompatCheckedTextViewHelper */
class C0499i {

    /* renamed from: a */
    private final CheckedTextView f1643a;

    /* renamed from: b */
    private ColorStateList f1644b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1645c = null;

    /* renamed from: d */
    private boolean f1646d = false;

    /* renamed from: e */
    private boolean f1647e = false;

    /* renamed from: f */
    private boolean f1648f;

    C0499i(CheckedTextView checkedTextView) {
        this.f1643a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2318a() {
        Drawable a = C0968c.m4405a(this.f1643a);
        if (a == null) {
            return;
        }
        if (this.f1646d || this.f1647e) {
            Drawable mutate = C0732a.m3380r(a).mutate();
            if (this.f1646d) {
                C0732a.m3377o(mutate, this.f1644b);
            }
            if (this.f1647e) {
                C0732a.m3378p(mutate, this.f1645c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1643a.getDrawableState());
            }
            this.f1643a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo2319b() {
        return this.f1644b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo2320c() {
        return this.f1645c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2321d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1643a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p048g.C4297j.f24002P0
            r8 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0452a1.m2210v(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1643a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo2059r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0835a0.m3737l0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p048g.C4297j.f24010R0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo2055n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f1643a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p055h.C4411a.m29346b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p048g.C4297j.f24006Q0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo2055n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f1643a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p055h.C4411a.m29346b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p048g.C4297j.f24014S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f1643a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo2044c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0968c.m4406b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p048g.C4297j.f24018T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f1643a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo2052k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0500i0.m2467d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0968c.m4407c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo2061w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo2061w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0499i.mo2321d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2322e() {
        if (this.f1648f) {
            this.f1648f = false;
            return;
        }
        this.f1648f = true;
        mo2318a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2323f(ColorStateList colorStateList) {
        this.f1644b = colorStateList;
        this.f1646d = true;
        mo2318a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2324g(PorterDuff.Mode mode) {
        this.f1645c = mode;
        this.f1647e = true;
        mo2318a();
    }
}
