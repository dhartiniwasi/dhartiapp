package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: h4.s */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
abstract class C4578s {

    /* renamed from: a */
    private static final C4478b1 f24998a;

    static {
        C4478b1 b1Var = null;
        try {
            Object newInstance = C4572r.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                pm0.m18667g("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    b1Var = queryLocalInterface instanceof C4478b1 ? (C4478b1) queryLocalInterface : new C4621z0(iBinder);
                }
            }
        } catch (Exception unused) {
            pm0.m18667g("Failed to instantiate ClientApi class.");
        }
        f24998a = b1Var;
    }

    C4578s() {
    }

    /* renamed from: e */
    private final Object m30006e() {
        C4478b1 b1Var = f24998a;
        if (b1Var != null) {
            try {
                return mo18016b(b1Var);
            } catch (RemoteException e) {
                pm0.m18668h("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        } else {
            pm0.m18667g("ClientApi class cannot be loaded.");
            return null;
        }
    }

    /* renamed from: f */
    private final Object m30007f() {
        try {
            return mo18017c();
        } catch (RemoteException e) {
            pm0.m18668h("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo18015a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo18016b(C4478b1 b1Var) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo18017c() throws RemoteException;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo18139d(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x0015
            p060h4.C4584t.m30036b()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = com.google.android.gms.internal.ads.im0.m14413t(r9, r1)
            if (r1 != 0) goto L_0x0015
            java.lang.String r10 = "Google Play Services is not available."
            com.google.android.gms.internal.ads.pm0.m18662b(r10)
            r10 = 1
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.m9484a(r9, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.m9485c(r9, r1)
            r3 = 0
            if (r2 <= r1) goto L_0x0024
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            r1 = r1 ^ r0
            r10 = r10 | r1
            com.google.android.gms.internal.ads.C2679nz.m17343c(r9)
            com.google.android.gms.internal.ads.q00 r1 = com.google.android.gms.internal.ads.z00.f20897a
            java.lang.Object r1 = r1.mo13438e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x003a
        L_0x0038:
            r10 = 0
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.internal.ads.q00 r1 = com.google.android.gms.internal.ads.z00.f20898b
            java.lang.Object r1 = r1.mo13438e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x004b
            r10 = 1
            r3 = 1
            goto L_0x004d
        L_0x004b:
            r3 = r10
            goto L_0x0038
        L_0x004d:
            if (r3 == 0) goto L_0x005c
            java.lang.Object r9 = r8.m30006e()
            if (r9 != 0) goto L_0x00a2
            if (r10 != 0) goto L_0x00a2
            java.lang.Object r9 = r8.m30007f()
            goto L_0x00a2
        L_0x005c:
            java.lang.Object r10 = r8.m30007f()
            if (r10 != 0) goto L_0x009a
            com.google.android.gms.internal.ads.q00 r1 = com.google.android.gms.internal.ads.n10.f13750a
            java.lang.Object r1 = r1.mo13438e()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.util.Random r2 = p060h4.C4584t.m30039e()
            int r1 = r2.nextInt(r1)
            if (r1 != 0) goto L_0x009a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r6.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r6.putInt(r1, r0)
            com.google.android.gms.internal.ads.im0 r2 = p060h4.C4584t.m30036b()
            com.google.android.gms.internal.ads.vm0 r0 = p060h4.C4584t.m30037c()
            java.lang.String r4 = r0.f19150a
            r7 = 1
            java.lang.String r5 = "gmob-apps"
            r3 = r9
            r2.mo11164o(r3, r4, r5, r6, r7)
        L_0x009a:
            if (r10 != 0) goto L_0x00a1
            java.lang.Object r9 = r8.m30006e()
            goto L_0x00a2
        L_0x00a1:
            r9 = r10
        L_0x00a2:
            if (r9 != 0) goto L_0x00a8
            java.lang.Object r9 = r8.mo18015a()
        L_0x00a8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4578s.mo18139d(android.content.Context, boolean):java.lang.Object");
    }
}
