package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p060h4.C4596v;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nz2 {

    /* renamed from: a */
    private final s82 f14761a;

    /* renamed from: b */
    private final String f14762b;

    /* renamed from: c */
    private final String f14763c;

    /* renamed from: d */
    private final String f14764d;

    /* renamed from: e */
    private final Context f14765e;

    /* renamed from: f */
    private final vs2 f14766f;

    /* renamed from: g */
    private final ws2 f14767g;

    /* renamed from: h */
    private final C4691e f14768h;

    /* renamed from: i */
    private final C2955ve f14769i;

    public nz2(s82 s82, vm0 vm0, String str, String str2, Context context, vs2 vs2, ws2 ws2, C4691e eVar, C2955ve veVar) {
        this.f14761a = s82;
        this.f14762b = vm0.f19150a;
        this.f14763c = str;
        this.f14764d = str2;
        this.f14765e = context;
        this.f14766f = vs2;
        this.f14767g = ws2;
        this.f14768h = eVar;
        this.f14769i = veVar;
    }

    /* renamed from: f */
    public static final List m17349f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m17351h((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static String m17350g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return om0.m17944l() ? "fakeForAdDebugLog" : str;
    }

    /* renamed from: h */
    private static String m17351h(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: c */
    public final List mo12731c(us2 us2, is2 is2, List list) {
        return mo12732d(us2, is2, false, "", "", list);
    }

    /* renamed from: d */
    public final List mo12732d(us2 us2, is2 is2, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String h = m17351h(m17351h(m17351h((String) it.next(), "@gw_adlocid@", us2.f18722a.f17091a.f8935f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f14762b);
            if (is2 != null) {
                h = uk0.m21685c(m17351h(m17351h(m17351h(h, "@gw_qdata@", is2.f11009z), "@gw_adnetid@", is2.f11008y), "@gw_allocid@", is2.f11007x), this.f14765e, is2.f10965X);
            }
            String h2 = m17351h(m17351h(m17351h(h, "@gw_adnetstatus@", this.f14761a.mo13961f()), "@gw_seqnum@", this.f14763c), "@gw_sessid@", this.f14764d);
            boolean z2 = false;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14325I2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(h2);
                }
            }
            if (this.f14769i.mo14740f(Uri.parse(h2))) {
                Uri.Builder buildUpon = Uri.parse(h2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                h2 = buildUpon.build().toString();
            }
            arrayList.add(h2);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f A[LOOP:0: B:12:0x0059->B:14:0x005f, LOOP_END] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo12733e(com.google.android.gms.internal.ads.is2 r10, java.util.List r11, com.google.android.gms.internal.ads.oh0 r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            i5.e r1 = r9.f14768h
            long r1 = r1.mo18370a()
            java.lang.String r3 = r12.mo12017e()     // Catch:{ RemoteException -> 0x00a8 }
            int r12 = r12.mo12016d()     // Catch:{ RemoteException -> 0x00a8 }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ RemoteException -> 0x00a8 }
            com.google.android.gms.internal.ads.ez r4 = com.google.android.gms.internal.ads.C2679nz.f14335J2
            com.google.android.gms.internal.ads.lz r5 = p060h4.C4596v.m30088c()
            java.lang.Object r4 = r5.mo12227b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.ws2 r4 = r9.f14767g
            if (r4 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.x73 r4 = com.google.android.gms.internal.ads.x73.m23111c()
            goto L_0x003b
        L_0x0032:
            com.google.android.gms.internal.ads.vs2 r4 = r4.f19769a
            goto L_0x0037
        L_0x0035:
            com.google.android.gms.internal.ads.vs2 r4 = r9.f14766f
        L_0x0037:
            com.google.android.gms.internal.ads.x73 r4 = com.google.android.gms.internal.ads.x73.m23112d(r4)
        L_0x003b:
            com.google.android.gms.internal.ads.lz2 r5 = com.google.android.gms.internal.ads.lz2.f13126a
            com.google.android.gms.internal.ads.x73 r5 = r4.mo10409a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.mo10410b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.mz2 r7 = com.google.android.gms.internal.ads.mz2.f13733a
            com.google.android.gms.internal.ads.x73 r4 = r4.mo10409a(r7)
            java.lang.Object r4 = r4.mo10410b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L_0x0059:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = m17351h(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = m17351h(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = m17351h(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = m17351h(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = m17351h(r6, r7, r12)
            java.lang.String r7 = r9.f14762b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = m17351h(r6, r8, r7)
            android.content.Context r7 = r9.f14765e
            boolean r8 = r10.f10965X
            java.lang.String r6 = com.google.android.gms.internal.ads.uk0.m21685c(r6, r7, r8)
            r0.add(r6)
            goto L_0x0059
        L_0x00a7:
            return r0
        L_0x00a8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.pm0.m18665e(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nz2.mo12733e(com.google.android.gms.internal.ads.is2, java.util.List, com.google.android.gms.internal.ads.oh0):java.util.List");
    }
}
