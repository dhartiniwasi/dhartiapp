package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class jd0 extends C2921uh implements kd0 {
    public jd0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: I6 */
    public static kd0 m14829I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof kd0 ? (kd0) queryLocalInterface : new id0(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.nd0] */
    /* JADX WARNING: type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.vc0] */
    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.xc0] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.xc0] */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.yc0] */
    /* JADX WARNING: type inference failed for: r2v15, types: [com.google.android.gms.internal.ads.ad0] */
    /* JADX WARNING: type inference failed for: r5v8, types: [com.google.android.gms.internal.ads.ad0] */
    /* JADX WARNING: type inference failed for: r2v19, types: [com.google.android.gms.internal.ads.ed0] */
    /* JADX WARNING: type inference failed for: r2v20, types: [com.google.android.gms.internal.ads.hd0] */
    /* JADX WARNING: type inference failed for: r5v10, types: [com.google.android.gms.internal.ads.hd0] */
    /* JADX WARNING: type inference failed for: r2v24, types: [com.google.android.gms.internal.ads.bd0] */
    /* JADX WARNING: type inference failed for: r2v25, types: [com.google.android.gms.internal.ads.dd0] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.dd0] */
    /* JADX WARNING: type inference failed for: r2v29, types: [com.google.android.gms.internal.ads.ed0] */
    /* JADX WARNING: type inference failed for: r2v30, types: [com.google.android.gms.internal.ads.hd0] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.google.android.gms.internal.ads.hd0] */
    /* JADX WARNING: type inference failed for: r2v34, types: [com.google.android.gms.internal.ads.vc0] */
    /* JADX WARNING: type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.xc0] */
    /* JADX WARNING: type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.xc0] */
    /* JADX WARNING: type inference failed for: r2v39, types: [com.google.android.gms.internal.ads.bd0] */
    /* JADX WARNING: type inference failed for: r2v40, types: [com.google.android.gms.internal.ads.dd0] */
    /* JADX WARNING: type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.dd0] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: H6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8320H6(int r15, android.os.Parcel r16, android.os.Parcel r17, int r18) throws android.os.RemoteException {
        /*
            r14 = this;
            r8 = r14
            r0 = r15
            r1 = r16
            r9 = r17
            r10 = 1
            r2 = 0
            if (r0 == r10) goto L_0x02d9
            r3 = 2
            if (r0 == r3) goto L_0x02ce
            r3 = 3
            if (r0 == r3) goto L_0x02c3
            r3 = 5
            if (r0 == r3) goto L_0x02b7
            r3 = 10
            if (r0 == r3) goto L_0x02a8
            r3 = 11
            if (r0 == r3) goto L_0x0295
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            java.lang.String r4 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            java.lang.String r5 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            switch(r0) {
                case 13: goto L_0x0240;
                case 14: goto L_0x01f2;
                case 15: goto L_0x01db;
                case 16: goto L_0x018f;
                case 17: goto L_0x0178;
                case 18: goto L_0x012c;
                case 19: goto L_0x011d;
                case 20: goto L_0x00d1;
                case 21: goto L_0x007c;
                case 22: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = 0
            return r0
        L_0x0026:
            java.lang.String r4 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<h4.l4> r0 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r6 = r0
            h4.l4 r6 = (p060h4.C4541l4) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r7 = p088l5.C4954a.C4955a.m31383B0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0047
        L_0x0045:
            r11 = r2
            goto L_0x0058
        L_0x0047:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.dd0
            if (r3 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.dd0 r2 = (com.google.android.gms.internal.ads.dd0) r2
            goto L_0x0045
        L_0x0052:
            com.google.android.gms.internal.ads.bd0 r2 = new com.google.android.gms.internal.ads.bd0
            r2.<init>(r0)
            goto L_0x0045
        L_0x0058:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.wb0 r12 = com.google.android.gms.internal.ads.vb0.m22062I6(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.f20> r0 = com.google.android.gms.internal.ads.f20.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r13 = r0
            com.google.android.gms.internal.ads.f20 r13 = (com.google.android.gms.internal.ads.f20) r13
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r7 = r13
            r0.mo11094i3(r1, r2, r3, r4, r5, r6, r7)
            r17.writeNoException()
            goto L_0x0328
        L_0x007c:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<h4.l4> r0 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r6 = r0
            h4.l4 r6 = (p060h4.C4541l4) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r7 = p088l5.C4954a.C4955a.m31383B0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x009d
        L_0x009b:
            r5 = r2
            goto L_0x00ae
        L_0x009d:
            android.os.IInterface r2 = r0.queryLocalInterface(r5)
            boolean r5 = r2 instanceof com.google.android.gms.internal.ads.xc0
            if (r5 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.xc0 r2 = (com.google.android.gms.internal.ads.xc0) r2
            goto L_0x009b
        L_0x00a8:
            com.google.android.gms.internal.ads.vc0 r2 = new com.google.android.gms.internal.ads.vc0
            r2.<init>(r0)
            goto L_0x009b
        L_0x00ae:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.wb0 r11 = com.google.android.gms.internal.ads.vb0.m22062I6(r0)
            android.os.Parcelable$Creator<h4.q4> r0 = p060h4.C4571q4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r12 = r0
            h4.q4 r12 = (p060h4.C4571q4) r12
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r6
            r4 = r7
            r6 = r11
            r7 = r12
            r0.mo11093h1(r1, r2, r3, r4, r5, r6, r7)
            r17.writeNoException()
            goto L_0x0328
        L_0x00d1:
            java.lang.String r3 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<h4.l4> r0 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r6 = r0
            h4.l4 r6 = (p060h4.C4541l4) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r7 = p088l5.C4954a.C4955a.m31383B0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x00f2
        L_0x00f0:
            r11 = r2
            goto L_0x0103
        L_0x00f2:
            android.os.IInterface r2 = r0.queryLocalInterface(r4)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.hd0
            if (r4 == 0) goto L_0x00fd
            com.google.android.gms.internal.ads.hd0 r2 = (com.google.android.gms.internal.ads.hd0) r2
            goto L_0x00f0
        L_0x00fd:
            com.google.android.gms.internal.ads.ed0 r2 = new com.google.android.gms.internal.ads.ed0
            r2.<init>(r0)
            goto L_0x00f0
        L_0x0103:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.wb0 r12 = com.google.android.gms.internal.ads.vb0.m22062I6(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r3
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.mo11091f6(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L_0x0328
        L_0x011d:
            java.lang.String r0 = r16.readString()
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r14.mo11083A(r0)
            r17.writeNoException()
            goto L_0x0328
        L_0x012c:
            java.lang.String r4 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<h4.l4> r0 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r6 = r0
            h4.l4 r6 = (p060h4.C4541l4) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r7 = p088l5.C4954a.C4955a.m31383B0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x014d
        L_0x014b:
            r11 = r2
            goto L_0x015e
        L_0x014d:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.dd0
            if (r3 == 0) goto L_0x0158
            com.google.android.gms.internal.ads.dd0 r2 = (com.google.android.gms.internal.ads.dd0) r2
            goto L_0x014b
        L_0x0158:
            com.google.android.gms.internal.ads.bd0 r2 = new com.google.android.gms.internal.ads.bd0
            r2.<init>(r0)
            goto L_0x014b
        L_0x015e:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.wb0 r12 = com.google.android.gms.internal.ads.vb0.m22062I6(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.mo11087Z1(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L_0x0328
        L_0x0178:
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r0 = p088l5.C4954a.C4955a.m31383B0(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            boolean r0 = r14.mo11085P(r0)
            r17.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r9, r0)
            goto L_0x0328
        L_0x018f:
            java.lang.String r3 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<h4.l4> r0 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r6 = r0
            h4.l4 r6 = (p060h4.C4541l4) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r7 = p088l5.C4954a.C4955a.m31383B0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x01b0
        L_0x01ae:
            r11 = r2
            goto L_0x01c1
        L_0x01b0:
            android.os.IInterface r2 = r0.queryLocalInterface(r4)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.hd0
            if (r4 == 0) goto L_0x01bb
            com.google.android.gms.internal.ads.hd0 r2 = (com.google.android.gms.internal.ads.hd0) r2
            goto L_0x01ae
        L_0x01bb:
            com.google.android.gms.internal.ads.ed0 r2 = new com.google.android.gms.internal.ads.ed0
            r2.<init>(r0)
            goto L_0x01ae
        L_0x01c1:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.wb0 r12 = com.google.android.gms.internal.ads.vb0.m22062I6(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r3
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.mo11084O3(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L_0x0328
        L_0x01db:
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r0 = p088l5.C4954a.C4955a.m31383B0(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            boolean r0 = r14.mo11096r4(r0)
            r17.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r9, r0)
            goto L_0x0328
        L_0x01f2:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<h4.l4> r0 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r5 = r0
            h4.l4 r5 = (p060h4.C4541l4) r5
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r6 = p088l5.C4954a.C4955a.m31383B0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0213
        L_0x0211:
            r7 = r2
            goto L_0x0226
        L_0x0213:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.ad0
            if (r7 == 0) goto L_0x0220
            com.google.android.gms.internal.ads.ad0 r2 = (com.google.android.gms.internal.ads.ad0) r2
            goto L_0x0211
        L_0x0220:
            com.google.android.gms.internal.ads.yc0 r2 = new com.google.android.gms.internal.ads.yc0
            r2.<init>(r0)
            goto L_0x0211
        L_0x0226:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.wb0 r11 = com.google.android.gms.internal.ads.vb0.m22062I6(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo11090f1(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
            goto L_0x0328
        L_0x0240:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<h4.l4> r0 = p060h4.C4541l4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r6 = r0
            h4.l4 r6 = (p060h4.C4541l4) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r7 = p088l5.C4954a.C4955a.m31383B0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0261
        L_0x025f:
            r5 = r2
            goto L_0x0272
        L_0x0261:
            android.os.IInterface r2 = r0.queryLocalInterface(r5)
            boolean r5 = r2 instanceof com.google.android.gms.internal.ads.xc0
            if (r5 == 0) goto L_0x026c
            com.google.android.gms.internal.ads.xc0 r2 = (com.google.android.gms.internal.ads.xc0) r2
            goto L_0x025f
        L_0x026c:
            com.google.android.gms.internal.ads.vc0 r2 = new com.google.android.gms.internal.ads.vc0
            r2.<init>(r0)
            goto L_0x025f
        L_0x0272:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.wb0 r11 = com.google.android.gms.internal.ads.vb0.m22062I6(r0)
            android.os.Parcelable$Creator<h4.q4> r0 = p060h4.C4571q4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r12 = r0
            h4.q4 r12 = (p060h4.C4571q4) r12
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r6
            r4 = r7
            r6 = r11
            r7 = r12
            r0.mo11095k1(r1, r2, r3, r4, r5, r6, r7)
            r17.writeNoException()
            goto L_0x0328
        L_0x0295:
            r16.createStringArray()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r1.createTypedArray(r0)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r17.writeNoException()
            goto L_0x0328
        L_0x02a8:
            android.os.IBinder r0 = r16.readStrongBinder()
            p088l5.C4954a.C4955a.m31383B0(r0)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r17.writeNoException()
            goto L_0x0328
        L_0x02b7:
            h4.j2 r0 = r14.mo11088a()
            r17.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r9, r0)
            goto L_0x0328
        L_0x02c3:
            com.google.android.gms.internal.ads.wd0 r0 = r14.mo11089c()
            r17.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r9, r0)
            goto L_0x0328
        L_0x02ce:
            com.google.android.gms.internal.ads.wd0 r0 = r14.mo11086T()
            r17.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22237f(r9, r0)
            goto L_0x0328
        L_0x02d9:
            android.os.IBinder r0 = r16.readStrongBinder()
            l5.a r3 = p088l5.C4954a.C4955a.m31383B0(r0)
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r6 = r0
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.Parcelable$Creator<h4.q4> r0 = p060h4.C4571q4.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C2958vh.m22232a(r1, r0)
            r7 = r0
            h4.q4 r7 = (p060h4.C4571q4) r7
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0305
        L_0x0303:
            r11 = r2
            goto L_0x0318
        L_0x0305:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r11 = r2 instanceof com.google.android.gms.internal.ads.nd0
            if (r11 == 0) goto L_0x0312
            com.google.android.gms.internal.ads.nd0 r2 = (com.google.android.gms.internal.ads.nd0) r2
            goto L_0x0303
        L_0x0312:
            com.google.android.gms.internal.ads.ld0 r2 = new com.google.android.gms.internal.ads.ld0
            r2.<init>(r0)
            goto L_0x0303
        L_0x0318:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r16)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo11092g5(r1, r2, r3, r4, r5, r6)
            r17.writeNoException()
        L_0x0328:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jd0.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
