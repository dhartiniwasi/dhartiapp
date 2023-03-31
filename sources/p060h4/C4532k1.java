package p060h4;

import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.k1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4532k1 extends C2921uh implements C4538l1 {
    public C4532k1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x0100;
                case 2: goto L_0x00f2;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00c0;
                case 6: goto L_0x00aa;
                case 7: goto L_0x009f;
                case 8: goto L_0x0094;
                case 9: goto L_0x0088;
                case 10: goto L_0x0079;
                case 11: goto L_0x0066;
                case 12: goto L_0x0053;
                case 13: goto L_0x0047;
                case 14: goto L_0x0034;
                case 15: goto L_0x002c;
                case 16: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000d
            r2 = 0
            goto L_0x0021
        L_0x000d:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof p060h4.C4604w1
            if (r0 == 0) goto L_0x001b
            r2 = r5
            h4.w1 r2 = (p060h4.C4604w1) r2
            goto L_0x0021
        L_0x001b:
            h4.u1 r5 = new h4.u1
            r5.<init>(r2)
            r2 = r5
        L_0x0021:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10699t4(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x002c:
            r1.mo10687V()
            r4.writeNoException()
            goto L_0x0106
        L_0x0034:
            android.os.Parcelable$Creator<h4.y3> r2 = p060h4.C4618y3.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            h4.y3 r2 = (p060h4.C4618y3) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10681E5(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x0047:
            java.util.List r2 = r1.mo10692c()
            r4.writeNoException()
            r4.writeTypedList(r2)
            goto L_0x0106
        L_0x0053:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.z70 r2 = com.google.android.gms.internal.ads.y70.m23788I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10685S2(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x0066:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.qb0 r2 = com.google.android.gms.internal.ads.pb0.m18446I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10680A4(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x0079:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10683M(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x0088:
            java.lang.String r2 = r1.mo10686T()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x0106
        L_0x0094:
            boolean r2 = r1.mo10695g()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x0106
        L_0x009f:
            float r2 = r1.mo10690a()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x0106
        L_0x00aa:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r5 = r3.readStrongBinder()
            l5.a r5 = p088l5.C4954a.C4955a.m31383B0(r5)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10697i4(r2, r5)
            r4.writeNoException()
            goto L_0x0106
        L_0x00c0:
            android.os.IBinder r2 = r3.readStrongBinder()
            l5.a r2 = p088l5.C4954a.C4955a.m31383B0(r2)
            java.lang.String r5 = r3.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10696h5(r2, r5)
            r4.writeNoException()
            goto L_0x0106
        L_0x00d6:
            boolean r2 = com.google.android.gms.internal.ads.C2958vh.m22239h(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10684Q5(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x00e4:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10693c6(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x00f2:
            float r2 = r3.readFloat()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10689X5(r2)
            r4.writeNoException()
            goto L_0x0106
        L_0x0100:
            r1.mo10688W()
            r4.writeNoException()
        L_0x0106:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4532k1.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
