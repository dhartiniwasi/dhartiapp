package p060h4;

import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.l0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4537l0 extends C2921uh implements C4543m0 {
    public C4537l0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: h4.c1} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [h4.d0] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x011c;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0080;
                case 8: goto L_0x0065;
                case 9: goto L_0x0052;
                case 10: goto L_0x003f;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x002c;
                case 14: goto L_0x0019;
                case 15: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.Parcelable$Creator<c4.a> r2 = p023c4.C1859a.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            c4.a r2 = (p023c4.C1859a) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13515Y4(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x0019:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.o80 r2 = com.google.android.gms.internal.ads.n80.m16974I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13514U0(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x002c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.f80> r2 = com.google.android.gms.internal.ads.f80.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            com.google.android.gms.internal.ads.f80 r2 = (com.google.android.gms.internal.ads.f80) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13521s4(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x003f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.e40 r2 = com.google.android.gms.internal.ads.d40.m11305I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13511H1(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x0052:
            android.os.Parcelable$Creator<c4.g> r2 = p023c4.C1868g.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            c4.g r2 = (p023c4.C1868g) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13517a1(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x0065:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.b40 r2 = com.google.android.gms.internal.ads.a40.m9569I6(r2)
            android.os.Parcelable$Creator<h4.q4> r5 = p060h4.C4571q4.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r5)
            h4.q4 r5 = (p060h4.C4571q4) r5
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13518a4(r2, r5)
            r4.writeNoException()
            goto L_0x0126
        L_0x0080:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0087
            goto L_0x0099
        L_0x0087:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof p060h4.C4484c1
            if (r0 == 0) goto L_0x0094
            h4.c1 r5 = (p060h4.C4484c1) r5
            goto L_0x0099
        L_0x0094:
            h4.c1 r5 = new h4.c1
            r5.<init>(r2)
        L_0x0099:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13509B6(r5)
            r4.writeNoException()
            goto L_0x0126
        L_0x00a4:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.f20> r2 = com.google.android.gms.internal.ads.f20.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C2958vh.m22232a(r3, r2)
            com.google.android.gms.internal.ads.f20 r2 = (com.google.android.gms.internal.ads.f20) r2
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13520q1(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x00b7:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r5 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.x30 r5 = com.google.android.gms.internal.ads.w30.m22568I6(r5)
            android.os.IBinder r0 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.u30 r0 = com.google.android.gms.internal.ads.t30.m20784I6(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13513R4(r2, r5, r0)
            r4.writeNoException()
            goto L_0x0126
        L_0x00d5:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.r30 r2 = com.google.android.gms.internal.ads.q30.m19054I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13512J1(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x00e7:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.o30 r2 = com.google.android.gms.internal.ads.n30.m16879I6(r2)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13519c5(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x00f9:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0100
            goto L_0x0112
        L_0x0100:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof p060h4.C4489d0
            if (r0 == 0) goto L_0x010d
            h4.d0 r5 = (p060h4.C4489d0) r5
            goto L_0x0112
        L_0x010d:
            h4.b0 r5 = new h4.b0
            r5.<init>(r2)
        L_0x0112:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo13510D6(r5)
            r4.writeNoException()
            goto L_0x0126
        L_0x011c:
            h4.j0 r2 = r1.mo13516a()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
        L_0x0126:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4537l0.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
