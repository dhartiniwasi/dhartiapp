package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.gms.internal.ads.y7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3059y7 {

    /* renamed from: a */
    private final String f20501a;

    /* renamed from: b */
    private final int f20502b;

    /* renamed from: c */
    private final int f20503c;

    /* renamed from: d */
    private int f20504d;

    /* renamed from: e */
    private String f20505e;

    public C3059y7(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f20501a = str;
        this.f20502b = i2;
        this.f20503c = i3;
        this.f20504d = RecyclerView.UNDEFINED_DURATION;
        this.f20505e = "";
    }

    /* renamed from: d */
    private final void m23784d() {
        if (this.f20504d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final int mo15332a() {
        m23784d();
        return this.f20504d;
    }

    /* renamed from: b */
    public final String mo15333b() {
        m23784d();
        return this.f20505e;
    }

    /* renamed from: c */
    public final void mo15334c() {
        int i = this.f20504d;
        int i2 = i == Integer.MIN_VALUE ? this.f20502b : i + this.f20503c;
        this.f20504d = i2;
        String str = this.f20501a;
        this.f20505e = str + i2;
    }
}
