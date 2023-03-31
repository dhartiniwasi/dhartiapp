package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class d20 extends q20 {

    /* renamed from: a */
    private final Drawable f8034a;

    /* renamed from: b */
    private final Uri f8035b;

    /* renamed from: c */
    private final double f8036c;

    /* renamed from: d */
    private final int f8037d;

    /* renamed from: e */
    private final int f8038e;

    public d20(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f8034a = drawable;
        this.f8035b = uri;
        this.f8036c = d;
        this.f8037d = i;
        this.f8038e = i2;
    }

    /* renamed from: T */
    public final C4954a mo9422T() throws RemoteException {
        return C4956b.m31385o3(this.f8034a);
    }

    /* renamed from: a */
    public final Uri mo9423a() throws RemoteException {
        return this.f8035b;
    }

    /* renamed from: b */
    public final int mo9424b() {
        return this.f8037d;
    }

    /* renamed from: d */
    public final double mo9425d() {
        return this.f8036c;
    }

    /* renamed from: e */
    public final int mo9426e() {
        return this.f8038e;
    }
}
