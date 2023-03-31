package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p023c4.C1862d;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class s20 extends C1862d {

    /* renamed from: a */
    private final r20 f17199a;

    /* renamed from: b */
    private final Drawable f17200b;

    /* renamed from: c */
    private final Uri f17201c;

    /* renamed from: d */
    private final double f17202d;

    /* renamed from: e */
    private final int f17203e;

    /* renamed from: f */
    private final int f17204f;

    public s20(r20 r20) {
        Drawable drawable;
        double d;
        int i;
        this.f17199a = r20;
        Uri uri = null;
        try {
            C4954a T = r20.mo9422T();
            if (T != null) {
                drawable = (Drawable) C4956b.m31384P0(T);
                this.f17200b = drawable;
                uri = this.f17199a.mo9423a();
                this.f17201c = uri;
                d = this.f17199a.mo9425d();
                this.f17202d = d;
                int i2 = -1;
                i = this.f17199a.mo9424b();
                this.f17203e = i;
                i2 = this.f17199a.mo9426e();
                this.f17204f = i2;
            }
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
        drawable = null;
        this.f17200b = drawable;
        try {
            uri = this.f17199a.mo9423a();
        } catch (RemoteException e2) {
            pm0.m18665e("", e2);
        }
        this.f17201c = uri;
        try {
            d = this.f17199a.mo9425d();
        } catch (RemoteException e3) {
            pm0.m18665e("", e3);
            d = 1.0d;
        }
        this.f17202d = d;
        int i22 = -1;
        try {
            i = this.f17199a.mo9424b();
        } catch (RemoteException e4) {
            pm0.m18665e("", e4);
            i = -1;
        }
        this.f17203e = i;
        try {
            i22 = this.f17199a.mo9426e();
        } catch (RemoteException e5) {
            pm0.m18665e("", e5);
        }
        this.f17204f = i22;
    }

    /* renamed from: a */
    public final Drawable mo7085a() {
        return this.f17200b;
    }

    /* renamed from: b */
    public final double mo7086b() {
        return this.f17202d;
    }

    /* renamed from: c */
    public final Uri mo7087c() {
        return this.f17201c;
    }

    /* renamed from: d */
    public final int mo7088d() {
        return this.f17204f;
    }

    /* renamed from: e */
    public final int mo7089e() {
        return this.f17203e;
    }
}
