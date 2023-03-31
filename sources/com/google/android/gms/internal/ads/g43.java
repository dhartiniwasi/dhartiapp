package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g43 {

    /* renamed from: a */
    private final byte[] f9697a;

    /* renamed from: b */
    private int f9698b;

    /* renamed from: c */
    private int f9699c;

    /* renamed from: d */
    final /* synthetic */ h43 f9700d;

    /* synthetic */ g43(h43 h43, byte[] bArr, f43 f43) {
        this.f9700d = h43;
        this.f9697a = bArr;
    }

    /* renamed from: a */
    public final g43 mo10392a(int i) {
        this.f9699c = i;
        return this;
    }

    /* renamed from: b */
    public final g43 mo10393b(int i) {
        this.f9698b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void mo10394c() {
        try {
            h43 h43 = this.f9700d;
            if (h43.f10191b) {
                h43.f10190a.mo11318q0(this.f9697a);
                this.f9700d.f10190a.mo11319x0(this.f9698b);
                this.f9700d.f10190a.mo11317f0(this.f9699c);
                this.f9700d.f10190a.mo11314C0((int[]) null);
                this.f9700d.f10190a.mo11316T();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
