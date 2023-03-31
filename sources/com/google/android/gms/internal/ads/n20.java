package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class n20 extends C2921uh implements o20 {
    public n20() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            switch(r2) {
                case 2: goto L_0x0074;
                case 3: goto L_0x0062;
                case 4: goto L_0x0057;
                case 5: goto L_0x004c;
                case 6: goto L_0x0041;
                case 7: goto L_0x0036;
                case 8: goto L_0x002b;
                case 9: goto L_0x0005;
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
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.y30
            if (r0 == 0) goto L_0x001b
            r2 = r5
            com.google.android.gms.internal.ads.y30 r2 = (com.google.android.gms.internal.ads.y30) r2
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.y30 r5 = new com.google.android.gms.internal.ads.y30
            r5.<init>(r2)
            r2 = r5
        L_0x0021:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo11424P5(r2)
            r4.writeNoException()
            goto L_0x007e
        L_0x002b:
            boolean r2 = r1.mo11428X()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x007e
        L_0x0036:
            h4.j2 r2 = r1.mo11426U()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x007e
        L_0x0041:
            float r2 = r1.mo11425T()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x007e
        L_0x004c:
            float r2 = r1.mo11430c()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x007e
        L_0x0057:
            l5.a r2 = r1.mo11427V()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x007e
        L_0x0062:
            android.os.IBinder r2 = r3.readStrongBinder()
            l5.a r2 = p088l5.C4954a.C4955a.m31383B0(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo11423B(r2)
            r4.writeNoException()
            goto L_0x007e
        L_0x0074:
            float r2 = r1.mo11429a()
            r4.writeNoException()
            r4.writeFloat(r2)
        L_0x007e:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n20.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
