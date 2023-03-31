package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import p053g4.C4409t;
import p060h4.C4514h1;
import p060h4.C4516h3;
import p060h4.C4520i1;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xt2 {

    /* renamed from: d */
    private static xt2 f20340d;

    /* renamed from: a */
    private final Context f20341a;

    /* renamed from: b */
    private final C4520i1 f20342b;

    /* renamed from: c */
    private final AtomicReference f20343c = new AtomicReference();

    xt2(Context context, C4520i1 i1Var) {
        this.f20341a = context;
        this.f20342b = i1Var;
    }

    /* renamed from: a */
    static C4520i1 m23533a(Context context) {
        try {
            return C4514h1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            pm0.m18665e("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    /* renamed from: d */
    public static xt2 m23534d(Context context) {
        synchronized (xt2.class) {
            xt2 xt2 = f20340d;
            if (xt2 != null) {
                return xt2;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) g10.f9641b.mo13438e()).longValue();
            C4520i1 i1Var = null;
            if (longValue > 0 && longValue <= 223104600) {
                i1Var = m23533a(applicationContext);
            }
            xt2 xt22 = new xt2(applicationContext, i1Var);
            f20340d = xt22;
            return xt22;
        }
    }

    /* renamed from: b */
    public final qb0 mo15243b() {
        return (qb0) this.f20343c.get();
    }

    /* renamed from: c */
    public final vm0 mo15244c(int i, boolean z, int i2) {
        C4409t.m29326r();
        boolean a = C4751b2.m30606a(this.f20341a);
        vm0 vm0 = new vm0(223104000, i2, true, a);
        if (!((Boolean) g10.f9642c.mo13438e()).booleanValue()) {
            return vm0;
        }
        C4520i1 i1Var = this.f20342b;
        C4516h3 h3Var = null;
        if (i1Var != null) {
            try {
                h3Var = i1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        if (h3Var == null) {
            return vm0;
        }
        return new vm0(223104000, h3Var.mo18059I1(), true, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15245e(com.google.android.gms.internal.ads.qb0 r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.q00 r0 = com.google.android.gms.internal.ads.g10.f9640a
            java.lang.Object r0 = r0.mo13438e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0023
            h4.i1 r0 = r3.f20342b
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            com.google.android.gms.internal.ads.qb0 r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r2 = r3.f20343c
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r4 = r0
        L_0x001f:
            com.google.android.gms.internal.ads.wt2.m22904a(r2, r1, r4)
            return
        L_0x0023:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f20343c
            com.google.android.gms.internal.ads.wt2.m22904a(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xt2.mo15245e(com.google.android.gms.internal.ads.qb0):void");
    }
}
