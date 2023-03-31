package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h43 {

    /* renamed from: a */
    final l43 f10190a;

    /* renamed from: b */
    final boolean f10191b;

    private h43(l43 l43) {
        this.f10190a = l43;
        this.f10191b = l43 != null;
    }

    /* renamed from: b */
    public static h43 m13707b(Context context, String str, String str2) {
        l43 l43;
        try {
            IBinder d = DynamiteModule.m9486e(context, DynamiteModule.f6325b, ModuleDescriptor.MODULE_ID).mo8136d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (d == null) {
                l43 = null;
            } else {
                IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                l43 = queryLocalInterface instanceof l43 ? (l43) queryLocalInterface : new j43(d);
            }
            try {
                l43.mo11315S0(C4956b.m31385o3(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new h43(l43);
            } catch (RemoteException | j33 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new h43(new m43());
            }
        } catch (Exception e) {
            throw new j33(e);
        } catch (Exception e2) {
            throw new j33(e2);
        }
    }

    /* renamed from: c */
    public static h43 m13708c() {
        m43 m43 = new m43();
        Log.d("GASS", "Clearcut logging disabled");
        return new h43(m43);
    }

    /* renamed from: a */
    public final g43 mo10733a(byte[] bArr) {
        return new g43(this, bArr, (f43) null);
    }
}
