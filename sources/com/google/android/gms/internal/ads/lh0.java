package com.google.android.gms.internal.ads;

import p033d5.C4133p;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lh0 extends nh0 {

    /* renamed from: a */
    private final String f12801a;

    /* renamed from: b */
    private final int f12802b;

    public lh0(String str, int i) {
        this.f12801a = str;
        this.f12802b = i;
    }

    /* renamed from: d */
    public final int mo12016d() {
        return this.f12802b;
    }

    /* renamed from: e */
    public final String mo12017e() {
        return this.f12801a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof lh0)) {
            lh0 lh0 = (lh0) obj;
            if (!C4133p.m28193a(this.f12801a, lh0.f12801a) || !C4133p.m28193a(Integer.valueOf(this.f12802b), Integer.valueOf(lh0.f12802b))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
