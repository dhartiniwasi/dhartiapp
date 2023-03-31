package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.widget.C0972d;

/* renamed from: androidx.appcompat.widget.j */
/* compiled from: AppCompatCompoundButtonHelper */
class C0502j {

    /* renamed from: a */
    private final CompoundButton f1654a;

    /* renamed from: b */
    private ColorStateList f1655b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1656c = null;

    /* renamed from: d */
    private boolean f1657d = false;

    /* renamed from: e */
    private boolean f1658e = false;

    /* renamed from: f */
    private boolean f1659f;

    C0502j(CompoundButton compoundButton) {
        this.f1654a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2369a() {
        Drawable a = C0972d.m4412a(this.f1654a);
        if (a == null) {
            return;
        }
        if (this.f1657d || this.f1658e) {
            Drawable mutate = C0732a.m3380r(a).mutate();
            if (this.f1657d) {
                C0732a.m3377o(mutate, this.f1655b);
            }
            if (this.f1658e) {
                C0732a.m3378p(mutate, this.f1656c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1654a.getDrawableState());
            }
            this.f1654a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C0972d.m4412a(r2.f1654a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo2370b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1654a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0972d.m4412a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0502j.mo2370b(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2371c() {
        return this.f1655b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2372d() {
        return this.f1656c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2373e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1654a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p048g.C4297j.f24022U0
            r8 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0452a1.m2210v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1654a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo2059r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0835a0.m3737l0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p048g.C4297j.f24030W0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo2055n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1654a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p055h.C4411a.m29346b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p048g.C4297j.f24026V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo2055n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1654a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p055h.C4411a.m29346b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p048g.C4297j.f24034X0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1654a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo2044c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0972d.m4414c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p048g.C4297j.f24038Y0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo2060s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1654a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo2052k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0500i0.m2467d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0972d.m4415d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo2061w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo2061w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0502j.mo2373e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2374f() {
        if (this.f1659f) {
            this.f1659f = false;
            return;
        }
        this.f1659f = true;
        mo2369a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2375g(ColorStateList colorStateList) {
        this.f1655b = colorStateList;
        this.f1657d = true;
        mo2369a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2376h(PorterDuff.Mode mode) {
        this.f1656c = mode;
        this.f1658e = true;
        mo2369a();
    }
}
