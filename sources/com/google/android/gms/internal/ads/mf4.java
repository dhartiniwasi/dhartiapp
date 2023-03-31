package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class mf4 implements og4 {

    /* renamed from: a */
    private final ArrayList f13320a = new ArrayList(1);

    /* renamed from: b */
    private final HashSet f13321b = new HashSet(1);

    /* renamed from: c */
    private final vg4 f13322c = new vg4();

    /* renamed from: d */
    private final ld4 f13323d = new ld4();

    /* renamed from: e */
    private Looper f13324e;

    /* renamed from: f */
    private gt0 f13325f;

    /* renamed from: g */
    private bb4 f13326g;

    /* renamed from: a */
    public final void mo12325a(ng4 ng4) {
        this.f13320a.remove(ng4);
        if (this.f13320a.isEmpty()) {
            this.f13324e = null;
            this.f13325f = null;
            this.f13326g = null;
            this.f13321b.clear();
            mo9592x();
            return;
        }
        mo12327e(ng4);
    }

    /* renamed from: b */
    public final void mo12326b(Handler handler, wg4 wg4) {
        Objects.requireNonNull(wg4);
        this.f13322c.mo14752b(handler, wg4);
    }

    /* renamed from: e */
    public final void mo12327e(ng4 ng4) {
        boolean isEmpty = this.f13321b.isEmpty();
        this.f13321b.remove(ng4);
        if ((!isEmpty) && this.f13321b.isEmpty()) {
            mo12340s();
        }
    }

    /* renamed from: f */
    public final void mo12328f(md4 md4) {
        this.f13323d.mo11982c(md4);
    }

    /* renamed from: g */
    public final void mo12329g(wg4 wg4) {
        this.f13322c.mo14763m(wg4);
    }

    /* renamed from: h */
    public final void mo12330h(ng4 ng4) {
        Objects.requireNonNull(this.f13324e);
        boolean isEmpty = this.f13321b.isEmpty();
        this.f13321b.add(ng4);
        if (isEmpty) {
            mo12341u();
        }
    }

    /* renamed from: i */
    public final void mo12331i(ng4 ng4, ve3 ve3, bb4 bb4) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f13324e;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        v91.m22050d(z);
        this.f13326g = bb4;
        gt0 gt0 = this.f13325f;
        this.f13320a.add(ng4);
        if (this.f13324e == null) {
            this.f13324e = myLooper;
            this.f13321b.add(ng4);
            mo9591v(ve3);
        } else if (gt0 != null) {
            mo12330h(ng4);
            ng4.mo11616a(this, gt0);
        }
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo12332j() {
        return true;
    }

    /* renamed from: l */
    public final void mo12333l(Handler handler, md4 md4) {
        Objects.requireNonNull(md4);
        this.f13323d.mo11981b(handler, md4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bb4 mo12334m() {
        bb4 bb4 = this.f13326g;
        v91.m22048b(bb4);
        return bb4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final ld4 mo12335n(mg4 mg4) {
        return this.f13323d.mo11980a(0, mg4);
    }

    /* renamed from: o */
    public final /* synthetic */ gt0 mo12336o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final ld4 mo12337p(int i, mg4 mg4) {
        return this.f13323d.mo11980a(i, mg4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final vg4 mo12338q(mg4 mg4) {
        return this.f13322c.mo14751a(0, mg4, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final vg4 mo12339r(int i, mg4 mg4, long j) {
        return this.f13322c.mo14751a(i, mg4, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo12340s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12341u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo9591v(ve3 ve3);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo12342w(gt0 gt0) {
        this.f13325f = gt0;
        ArrayList arrayList = this.f13320a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ng4) arrayList.get(i)).mo11616a(this, gt0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo9592x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo12343y() {
        return !this.f13321b.isEmpty();
    }
}
