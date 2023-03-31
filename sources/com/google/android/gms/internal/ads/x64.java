package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x64 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f20013a;

    /* renamed from: b */
    public q74 f20014b;

    /* renamed from: c */
    public int f20015c;

    /* renamed from: d */
    public boolean f20016d;

    /* renamed from: e */
    public int f20017e;

    /* renamed from: f */
    public boolean f20018f;

    /* renamed from: g */
    public int f20019g;

    public x64(q74 q74) {
        this.f20014b = q74;
    }

    /* renamed from: a */
    public final void mo15056a(int i) {
        boolean z = true;
        if (true != (this.f20013a | i)) {
            z = false;
        }
        this.f20013a = z;
        this.f20015c += i;
    }

    /* renamed from: b */
    public final void mo15057b(int i) {
        this.f20013a = true;
        this.f20018f = true;
        this.f20019g = i;
    }

    /* renamed from: c */
    public final void mo15058c(q74 q74) {
        this.f20013a |= this.f20014b != q74;
        this.f20014b = q74;
    }

    /* renamed from: d */
    public final void mo15059d(int i) {
        boolean z = true;
        if (!this.f20016d || this.f20017e == 5) {
            this.f20013a = true;
            this.f20016d = true;
            this.f20017e = i;
            return;
        }
        if (i != 5) {
            z = false;
        }
        v91.m22050d(z);
    }
}
