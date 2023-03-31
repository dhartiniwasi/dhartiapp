package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.C2043a;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class oe0 extends C2043a.C2045b {

    /* renamed from: a */
    private final r20 f15051a;

    /* renamed from: b */
    private final Drawable f15052b;

    /* renamed from: c */
    private final Uri f15053c;

    /* renamed from: d */
    private final double f15054d;

    public oe0(r20 r20) {
        Drawable drawable;
        double d;
        this.f15051a = r20;
        Uri uri = null;
        try {
            C4954a T = r20.mo9422T();
            if (T != null) {
                drawable = (Drawable) C4956b.m31384P0(T);
                this.f15052b = drawable;
                uri = this.f15051a.mo9423a();
                this.f15053c = uri;
                d = this.f15051a.mo9425d();
                this.f15054d = d;
                this.f15051a.mo9424b();
                this.f15051a.mo9426e();
            }
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
        drawable = null;
        this.f15052b = drawable;
        try {
            uri = this.f15051a.mo9423a();
        } catch (RemoteException e2) {
            pm0.m18665e("", e2);
        }
        this.f15053c = uri;
        try {
            d = this.f15051a.mo9425d();
        } catch (RemoteException e3) {
            pm0.m18665e("", e3);
            d = 1.0d;
        }
        this.f15054d = d;
        try {
            this.f15051a.mo9424b();
        } catch (RemoteException e4) {
            pm0.m18665e("", e4);
        }
        try {
            this.f15051a.mo9426e();
        } catch (RemoteException e5) {
            pm0.m18665e("", e5);
        }
    }

    /* renamed from: a */
    public final Drawable mo7917a() {
        return this.f15052b;
    }
}
