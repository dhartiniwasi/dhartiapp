package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
abstract class n83 extends h73 {

    /* renamed from: c */
    final CharSequence f13905c;

    /* renamed from: d */
    final n73 f13906d;

    /* renamed from: e */
    int f13907e = 0;

    /* renamed from: f */
    int f13908f;

    protected n83(p83 p83, CharSequence charSequence) {
        this.f13906d = p83.f15748a;
        this.f13908f = Integer.MAX_VALUE;
        this.f13905c = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10750a() {
        int i;
        int i2 = this.f13907e;
        while (true) {
            int i3 = this.f13907e;
            if (i3 != -1) {
                int e = mo11057e(i3);
                if (e == -1) {
                    e = this.f13905c.length();
                    this.f13907e = -1;
                    i = -1;
                } else {
                    i = mo11056d(e);
                    this.f13907e = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f13907e = i4;
                    if (i4 > this.f13905c.length()) {
                        this.f13907e = -1;
                    }
                } else {
                    if (i2 < e) {
                        this.f13905c.charAt(i2);
                    }
                    if (i2 < e) {
                        this.f13905c.charAt(e - 1);
                    }
                    int i5 = this.f13908f;
                    if (i5 == 1) {
                        e = this.f13905c.length();
                        this.f13907e = -1;
                        if (e > i2) {
                            this.f13905c.charAt(e - 1);
                        }
                    } else {
                        this.f13908f = i5 - 1;
                    }
                    return this.f13905c.subSequence(i2, e).toString();
                }
            } else {
                mo10751c();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo11056d(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo11057e(int i);
}
