package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.i2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4521i2 extends C2921uh implements C4527j2 {
    public C4521i2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: I6 */
    public static C4527j2 m29687I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof C4527j2 ? (C4527j2) queryLocalInterface : new C4515h2(iBinder);
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
                case 1: goto L_0x00a4;
                case 2: goto L_0x009d;
                case 3: goto L_0x008f;
                case 4: goto L_0x0084;
                case 5: goto L_0x0079;
                case 6: goto L_0x006e;
                case 7: goto L_0x0063;
                case 8: goto L_0x003d;
                case 9: goto L_0x0031;
                case 10: goto L_0x0025;
                case 11: goto L_0x0019;
                case 12: goto L_0x000d;
                case 13: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            r1.mo10790a0()
            r4.writeNoException()
            goto L_0x00aa
        L_0x000d:
            boolean r2 = r1.mo10787Y()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x00aa
        L_0x0019:
            h4.m2 r2 = r1.mo10785V()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r2)
            goto L_0x00aa
        L_0x0025:
            boolean r2 = r1.mo10791b0()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x00aa
        L_0x0031:
            float r2 = r1.mo10789a()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x00aa
        L_0x003d:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0045
            r2 = 0
            goto L_0x0059
        L_0x0045:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof p060h4.C4545m2
            if (r0 == 0) goto L_0x0053
            r2 = r5
            h4.m2 r2 = (p060h4.C4545m2) r2
            goto L_0x0059
        L_0x0053:
            h4.k2 r5 = new h4.k2
            r5.<init>(r2)
            r2 = r5
        L_0x0059:
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10794l1(r2)
            r4.writeNoException()
            goto L_0x00aa
        L_0x0063:
            float r2 = r1.mo10783T()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x00aa
        L_0x006e:
            float r2 = r1.mo10792c()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x00aa
        L_0x0079:
            int r2 = r1.mo10784U()
            r4.writeNoException()
            r4.writeInt(r2)
            goto L_0x00aa
        L_0x0084:
            boolean r2 = r1.mo10793h()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C2958vh.m22235d(r4, r2)
            goto L_0x00aa
        L_0x008f:
            boolean r2 = com.google.android.gms.internal.ads.C2958vh.m22239h(r3)
            com.google.android.gms.internal.ads.C2958vh.m22234c(r3)
            r1.mo10795n2(r2)
            r4.writeNoException()
            goto L_0x00aa
        L_0x009d:
            r1.mo10786X()
            r4.writeNoException()
            goto L_0x00aa
        L_0x00a4:
            r1.mo10788Z()
            r4.writeNoException()
        L_0x00aa:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4521i2.mo8320H6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
