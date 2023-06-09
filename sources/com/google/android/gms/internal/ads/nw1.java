package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nw1 extends b70 {

    /* renamed from: a */
    private final qw1 f14215a;

    /* renamed from: b */
    private final lw1 f14216b;

    /* renamed from: c */
    private final Map f14217c = new HashMap();

    nw1(qw1 qw1, lw1 lw1) {
        this.f14215a = qw1;
        this.f14216b = lw1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: I6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p060h4.C4541l4 m17310I6(java.util.Map r30) {
        /*
            h4.m4 r0 = new h4.m4
            r0.<init>()
            java.lang.String r1 = "ad_request"
            r2 = r30
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0016
            h4.l4 r0 = r0.mo18073a()
            return r0
        L_0x0016:
            java.lang.String r1 = android.net.Uri.decode(r1)
            android.util.JsonReader r2 = new android.util.JsonReader
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r1)
            r2.<init>(r3)
            r2.beginObject()     // Catch:{ IOException -> 0x010e }
        L_0x0027:
            boolean r1 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = r2.nextName()     // Catch:{ IOException -> 0x010e }
            int r3 = r1.hashCode()     // Catch:{ IOException -> 0x010e }
            r4 = 1
            r5 = 0
            switch(r3) {
                case -1289032093: goto L_0x0077;
                case -839117230: goto L_0x006d;
                case -733436947: goto L_0x0063;
                case -99890337: goto L_0x0059;
                case 523149226: goto L_0x004f;
                case 597632527: goto L_0x0045;
                case 1411582723: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0081
        L_0x003b:
            java.lang.String r3 = "tagForChildDirectedTreatment"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 3
            goto L_0x0082
        L_0x0045:
            java.lang.String r3 = "maxAdContentRating"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 5
            goto L_0x0082
        L_0x004f:
            java.lang.String r3 = "keywords"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0059:
            java.lang.String r3 = "httpTimeoutMillis"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 6
            goto L_0x0082
        L_0x0063:
            java.lang.String r3 = "tagForUnderAgeOfConsent"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 4
            goto L_0x0082
        L_0x006d:
            java.lang.String r3 = "isTestDevice"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 2
            goto L_0x0082
        L_0x0077:
            java.lang.String r3 = "extras"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 0
            goto L_0x0082
        L_0x0081:
            r1 = -1
        L_0x0082:
            switch(r1) {
                case 0: goto L_0x00e8;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a1;
                case 5: goto L_0x0091;
                case 6: goto L_0x0089;
                default: goto L_0x0085;
            }
        L_0x0085:
            r2.skipValue()     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x0089:
            int r1 = r2.nextInt()     // Catch:{ IOException -> 0x010e }
            r0.mo18075c(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x0091:
            java.lang.String r1 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            java.util.List r3 = p179z3.C6351u.f30548e     // Catch:{ IOException -> 0x010e }
            boolean r3 = r3.contains(r1)     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x0027
            r0.mo18078f(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00a1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x00ac
            r0.mo18080h(r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00ac:
            r0.mo18080h(r5)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00b1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x00bc
            r0.mo18079g(r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00bc:
            r0.mo18079g(r5)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00c1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            r0.mo18076d(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00ca:
            r2.beginArray()     // Catch:{ IOException -> 0x010e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x010e }
            r1.<init>()     // Catch:{ IOException -> 0x010e }
        L_0x00d2:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            r1.add(r3)     // Catch:{ IOException -> 0x010e }
            goto L_0x00d2
        L_0x00e0:
            r2.endArray()     // Catch:{ IOException -> 0x010e }
            r0.mo18077e(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00e8:
            r2.beginObject()     // Catch:{ IOException -> 0x010e }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ IOException -> 0x010e }
            r1.<init>()     // Catch:{ IOException -> 0x010e }
        L_0x00f0:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x0102
            java.lang.String r3 = r2.nextName()     // Catch:{ IOException -> 0x010e }
            java.lang.String r4 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            r1.putString(r3, r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x00f0
        L_0x0102:
            r2.endObject()     // Catch:{ IOException -> 0x010e }
            r0.mo18074b(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x010a:
            r2.endObject()     // Catch:{ IOException -> 0x010e }
            goto L_0x0113
        L_0x010e:
            java.lang.String r1 = "Ad Request json was malformed, parsing ended early."
            com.google.android.gms.internal.ads.pm0.m18662b(r1)
        L_0x0113:
            h4.l4 r0 = r0.mo18073a()
            android.os.Bundle r1 = r0.f24901u
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 != 0) goto L_0x0128
            android.os.Bundle r1 = r0.f24891c
            android.os.Bundle r3 = r0.f24901u
            r3.putBundle(r2, r1)
        L_0x0128:
            r8 = r1
            h4.l4 r1 = new h4.l4
            r4 = r1
            int r5 = r0.f24889a
            long r6 = r0.f24890b
            int r9 = r0.f24892d
            java.util.List r10 = r0.f24893e
            boolean r11 = r0.f24894f
            int r12 = r0.f24895g
            boolean r13 = r0.f24896h
            java.lang.String r14 = r0.f24897i
            h4.b4 r15 = r0.f24898r
            android.location.Location r2 = r0.f24899s
            r16 = r2
            java.lang.String r2 = r0.f24900t
            r17 = r2
            android.os.Bundle r2 = r0.f24901u
            r18 = r2
            android.os.Bundle r2 = r0.f24902v
            r19 = r2
            java.util.List r2 = r0.f24903w
            r20 = r2
            java.lang.String r2 = r0.f24904x
            r21 = r2
            java.lang.String r2 = r0.f24905y
            r22 = r2
            boolean r2 = r0.f24906z
            r23 = r2
            h4.y0 r2 = r0.f24883A
            r24 = r2
            int r2 = r0.f24884B
            r25 = r2
            java.lang.String r2 = r0.f24885C
            r26 = r2
            java.util.List r2 = r0.f24886D
            r27 = r2
            int r2 = r0.f24887E
            r28 = r2
            java.lang.String r0 = r0.f24888F
            r29 = r0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nw1.m17310I6(java.util.Map):h4.l4");
    }

    /* renamed from: a */
    public final void mo9032a() {
        this.f14217c.clear();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        if (r0.equals("create_interstitial_ad") != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9033v(java.lang.String r12) throws android.os.RemoteException {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14556f8
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Received H5 gmsg: "
            java.lang.String r0 = r1.concat(r0)
            p073j4.C4794n1.m30693k(r0)
            android.net.Uri r12 = android.net.Uri.parse(r12)
            p053g4.C4409t.m29326r()
            java.util.Map r12 = p073j4.C4751b2.m30617l(r12)
            java.lang.String r0 = "action"
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x003f
            java.lang.String r12 = "H5 gmsg did not contain an action"
            com.google.android.gms.internal.ads.pm0.m18662b(r12)
            return
        L_0x003f:
            int r1 = r0.hashCode()
            r2 = 579053441(0x2283a781, float:3.5684973E-18)
            r3 = 0
            r4 = -1
            r5 = 1
            if (r1 == r2) goto L_0x005b
            r2 = 871091088(0x33ebcb90, float:1.0980068E-7)
            if (r1 == r2) goto L_0x0051
            goto L_0x0065
        L_0x0051:
            java.lang.String r1 = "initialize"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0065
            r1 = 0
            goto L_0x0066
        L_0x005b:
            java.lang.String r1 = "dispose_all"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = -1
        L_0x0066:
            if (r1 == 0) goto L_0x02bd
            if (r1 == r5) goto L_0x029d
            java.lang.String r1 = "obj_id"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()     // Catch:{ NullPointerException | NumberFormatException -> 0x028f }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x028f }
            int r6 = r0.hashCode()
            switch(r6) {
                case -1790951212: goto L_0x00bc;
                case -1266374734: goto L_0x00b2;
                case -257098725: goto L_0x00a8;
                case 393881811: goto L_0x009f;
                case 585513149: goto L_0x0095;
                case 1671767583: goto L_0x008b;
                case 2109237041: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00c6
        L_0x0081:
            java.lang.String r3 = "create_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 3
            goto L_0x00c7
        L_0x008b:
            java.lang.String r3 = "dispose"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 6
            goto L_0x00c7
        L_0x0095:
            java.lang.String r3 = "load_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x009f:
            java.lang.String r5 = "create_interstitial_ad"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00a8:
            java.lang.String r3 = "load_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 4
            goto L_0x00c7
        L_0x00b2:
            java.lang.String r3 = "show_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 5
            goto L_0x00c7
        L_0x00bc:
            java.lang.String r3 = "show_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 2
            goto L_0x00c7
        L_0x00c6:
            r3 = -1
        L_0x00c7:
            java.lang.String r4 = "Could not create H5 ad, missing ad unit id"
            java.lang.String r5 = " with ad unit "
            java.lang.String r6 = "Could not create H5 ad, object ID already exists"
            java.lang.String r7 = "ad_unit"
            java.lang.String r8 = "Could not show H5 ad, object ID does not exist"
            java.lang.String r9 = "Could not load H5 ad, object ID does not exist"
            java.lang.String r10 = "Could not create H5 ad, too many existing objects"
            switch(r3) {
                case 0: goto L_0x020b;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01d1;
                case 3: goto L_0x014d;
                case 4: goto L_0x012e;
                case 5: goto L_0x0113;
                case 6: goto L_0x00e2;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            java.lang.String r12 = "H5 gmsg contained invalid action: "
            java.lang.String r12 = r12.concat(r0)
            com.google.android.gms.internal.ads.pm0.m18662b(r12)
            return
        L_0x00e2:
            java.util.Map r12 = r11.f14217c
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.gw1 r12 = (com.google.android.gms.internal.ads.gw1) r12
            if (r12 != 0) goto L_0x00f6
            java.lang.String r12 = "Could not dispose H5 ad, object ID does not exist"
            com.google.android.gms.internal.ads.pm0.m18662b(r12)
            return
        L_0x00f6:
            r12.zza()
            java.util.Map r12 = r11.f14217c
            r12.remove(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Disposed H5 ad #"
            r12.append(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            p073j4.C4794n1.m30693k(r12)
            return
        L_0x0113:
            java.util.Map r12 = r11.f14217c
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.gw1 r12 = (com.google.android.gms.internal.ads.gw1) r12
            if (r12 != 0) goto L_0x012a
            com.google.android.gms.internal.ads.pm0.m18662b(r8)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12174q(r1)
            return
        L_0x012a:
            r12.mo10655e()
            return
        L_0x012e:
            java.util.Map r0 = r11.f14217c
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.gw1 r0 = (com.google.android.gms.internal.ads.gw1) r0
            if (r0 != 0) goto L_0x0145
            com.google.android.gms.internal.ads.pm0.m18662b(r9)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12174q(r1)
            return
        L_0x0145:
            h4.l4 r12 = m17310I6(r12)
            r0.mo10654a(r12)
            return
        L_0x014d:
            java.util.Map r0 = r11.f14217c
            int r0 = r0.size()
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14566g8
            com.google.android.gms.internal.ads.lz r8 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r8.mo12227b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L_0x016e
            com.google.android.gms.internal.ads.pm0.m18667g(r10)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12166i(r1)
            return
        L_0x016e:
            java.util.Map r0 = r11.f14217c
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0183
            com.google.android.gms.internal.ads.pm0.m18662b(r6)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12166i(r1)
            return
        L_0x0183:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.pm0.m18667g(r4)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12166i(r1)
            return
        L_0x0198:
            com.google.android.gms.internal.ads.qw1 r0 = r11.f14215a
            com.google.android.gms.internal.ads.hw1 r0 = r0.mo13610d()
            r0.mo10957c(r1)
            r0.mo10959f(r12)
            com.google.android.gms.internal.ads.iw1 r0 = r0.mo10958e()
            com.google.android.gms.internal.ads.xw1 r0 = r0.mo11247d()
            java.util.Map r4 = r11.f14217c
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.lw1 r0 = r11.f14216b
            r0.mo12165h(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Created H5 rewarded #"
            r0.append(r3)
            r0.append(r1)
            r0.append(r5)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            p073j4.C4794n1.m30693k(r12)
            return
        L_0x01d1:
            java.util.Map r12 = r11.f14217c
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.gw1 r12 = (com.google.android.gms.internal.ads.gw1) r12
            if (r12 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.pm0.m18662b(r8)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12163f(r1)
            return
        L_0x01e8:
            r12.mo10655e()
            return
        L_0x01ec:
            java.util.Map r0 = r11.f14217c
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.gw1 r0 = (com.google.android.gms.internal.ads.gw1) r0
            if (r0 != 0) goto L_0x0203
            com.google.android.gms.internal.ads.pm0.m18662b(r9)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12163f(r1)
            return
        L_0x0203:
            h4.l4 r12 = m17310I6(r12)
            r0.mo10654a(r12)
            return
        L_0x020b:
            java.util.Map r0 = r11.f14217c
            int r0 = r0.size()
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14566g8
            com.google.android.gms.internal.ads.lz r8 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r8.mo12227b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L_0x022c
            com.google.android.gms.internal.ads.pm0.m18667g(r10)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12166i(r1)
            return
        L_0x022c:
            java.util.Map r0 = r11.f14217c
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0241
            com.google.android.gms.internal.ads.pm0.m18662b(r6)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12166i(r1)
            return
        L_0x0241:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0256
            com.google.android.gms.internal.ads.pm0.m18667g(r4)
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12166i(r1)
            return
        L_0x0256:
            com.google.android.gms.internal.ads.qw1 r0 = r11.f14215a
            com.google.android.gms.internal.ads.hw1 r0 = r0.mo13610d()
            r0.mo10957c(r1)
            r0.mo10959f(r12)
            com.google.android.gms.internal.ads.iw1 r0 = r0.mo10958e()
            com.google.android.gms.internal.ads.tw1 r0 = r0.zza()
            java.util.Map r4 = r11.f14217c
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.lw1 r0 = r11.f14216b
            r0.mo12165h(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Created H5 interstitial #"
            r0.append(r3)
            r0.append(r1)
            r0.append(r5)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            p073j4.C4794n1.m30693k(r12)
            return
        L_0x028f:
            java.lang.String r12 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "H5 gmsg did not contain a valid object id: "
            java.lang.String r12 = r0.concat(r12)
            com.google.android.gms.internal.ads.pm0.m18662b(r12)
            return
        L_0x029d:
            java.util.Map r12 = r11.f14217c
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x02a7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r0 = r12.next()
            com.google.android.gms.internal.ads.gw1 r0 = (com.google.android.gms.internal.ads.gw1) r0
            r0.zza()
            goto L_0x02a7
        L_0x02b7:
            java.util.Map r12 = r11.f14217c
            r12.clear()
            return
        L_0x02bd:
            java.util.Map r12 = r11.f14217c
            r12.clear()
            com.google.android.gms.internal.ads.lw1 r12 = r11.f14216b
            r12.mo12158a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nw1.mo9033v(java.lang.String):void");
    }
}
