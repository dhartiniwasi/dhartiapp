package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;
import p053g4.C4409t;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class v32 extends w32 {

    /* renamed from: h */
    private static final SparseArray f18903h;

    /* renamed from: c */
    private final Context f18904c;

    /* renamed from: d */
    private final b91 f18905d;

    /* renamed from: e */
    private final TelephonyManager f18906e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final n32 f18907f;

    /* renamed from: g */
    private int f18908g;

    static {
        SparseArray sparseArray = new SparseArray();
        f18903h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), C2603lx.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        C2603lx lxVar = C2603lx.CONNECTING;
        sparseArray.put(ordinal, lxVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), lxVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), lxVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), C2603lx.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        C2603lx lxVar2 = C2603lx.DISCONNECTED;
        sparseArray.put(ordinal2, lxVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), lxVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), lxVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), lxVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), lxVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), C2603lx.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), lxVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), lxVar);
    }

    v32(Context context, b91 b91, n32 n32, j32 j32, C4800p1 p1Var) {
        super(j32, p1Var);
        this.f18904c = context;
        this.f18905d = b91;
        this.f18907f = n32;
        this.f18906e = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ C2231bx m21957b(v32 v32, Bundle bundle) {
        C2936uw G = C2231bx.m10612G();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            v32.f18908g = 2;
        } else {
            v32.f18908g = 1;
            if (i == 0) {
                G.mo14630r(2);
            } else if (i != 1) {
                G.mo14630r(1);
            } else {
                G.mo14630r(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            G.mo14629p(i3);
        }
        return (C2231bx) G.mo13423m();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ C2603lx m21958c(v32 v32, Bundle bundle) {
        return (C2603lx) f18903h.get(pt2.m18893a(pt2.m18893a(bundle, "device"), "network").getInt("active_network_state", -1), C2603lx.UNSPECIFIED);
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ byte[] m21960f(v32 v32, boolean z, ArrayList arrayList, C2231bx bxVar, C2603lx lxVar) {
        C2380fx O = C2417gx.m13567O();
        O.mo10332p(arrayList);
        boolean z2 = false;
        O.mo10327A(m21961g(Settings.Global.getInt(v32.f18904c.getContentResolver(), "airplane_mode_on", 0) != 0));
        O.mo10328B(C4409t.m29327s().mo18425g(v32.f18904c, v32.f18906e));
        O.mo10337x(v32.f18907f.mo12516e());
        O.mo10336v(v32.f18907f.mo12513b());
        O.mo10333r(v32.f18907f.mo12512a());
        O.mo10334s(lxVar);
        O.mo10335u(bxVar);
        O.mo10329C(v32.f18908g);
        O.mo10330D(m21961g(z));
        O.mo10339z(v32.f18907f.mo12515d());
        O.mo10338y(C4409t.m29310b().mo18370a());
        if (Settings.Global.getInt(v32.f18904c.getContentResolver(), "wifi_on", 0) != 0) {
            z2 = true;
        }
        O.mo10331E(m21961g(z2));
        return ((C2417gx) O.mo13423m()).mo9400b();
    }

    /* renamed from: g */
    private static final int m21961g(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: e */
    public final void mo14669e(boolean z) {
        cf3.m10920r(this.f18905d.mo8698b(), new u32(this, z), dn0.f8330f);
    }
}
