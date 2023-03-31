package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7150r4;
import p402y5.C13027e0;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7490r9 {

    /* renamed from: a */
    private C7150r4 f32935a;

    /* renamed from: b */
    private Long f32936b;

    /* renamed from: c */
    private long f32937c;

    /* renamed from: d */
    final /* synthetic */ C7304b f32938d;

    /* synthetic */ C7490r9(C7304b bVar, C13027e0 e0Var) {
        this.f32938d = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C7150r4 mo24637a(java.lang.String r18, com.google.android.gms.internal.measurement.C7150r4 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo23812J()
            java.util.List r9 = r19.mo23813K()
            com.google.android.gms.measurement.internal.b r2 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r2 = r2.f32873b
            r2.mo24127g0()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7325c9.m41394n(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e6
            p033d5.C4141r.m28221k(r4)
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r0 = r0.f32873b
            r0.mo24127g0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C7325c9.m41394n(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24258t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo24209b(r2, r4)
            return r5
        L_0x0055:
            com.google.android.gms.internal.measurement.r4 r0 = r1.f32935a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f32936b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f32936b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
        L_0x006d:
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r0 = r0.f32873b
            com.google.android.gms.measurement.internal.l r13 = r0.mo24112W()
            r13.mo24189f()
            r13.mo24623g()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo24472P()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r0 != 0) goto L_0x00aa
            com.google.android.gms.measurement.internal.j4 r0 = r13.f32389a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Main event not found"
            r0.mo24208a(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            r0 = r5
            goto L_0x0100
        L_0x00aa:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e3 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.internal.measurement.q4 r5 = com.google.android.gms.internal.measurement.C7150r4.m40779G()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.ma r0 = com.google.android.gms.measurement.internal.C7325c9.m41387C(r5, r0)     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.q4 r0 = (com.google.android.gms.internal.measurement.C7134q4) r0     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.h9 r0 = r0.mo23357k()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.r4 r0 = (com.google.android.gms.internal.measurement.C7150r4) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            goto L_0x0100
        L_0x00ce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r5 = r13.f32389a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r18)     // Catch:{ SQLiteException -> 0x00e3 }
            r5.mo24211d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00fc
        L_0x00e3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            r5 = 0
            goto L_0x01e0
        L_0x00e9:
            r0 = move-exception
            r14 = 0
        L_0x00eb:
            com.google.android.gms.measurement.internal.j4 r5 = r13.f32389a     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x01de }
            java.lang.String r12 = "Error selecting main event"
            r5.mo24209b(r12, r0)     // Catch:{ all -> 0x01de }
            if (r14 == 0) goto L_0x00ff
        L_0x00fc:
            r14.close()
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0108
            goto L_0x01cb
        L_0x0108:
            com.google.android.gms.internal.measurement.r4 r5 = (com.google.android.gms.internal.measurement.C7150r4) r5
            r1.f32935a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f32937c = r12
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r0 = r0.f32873b
            r0.mo24127g0()
            com.google.android.gms.internal.measurement.r4 r0 = r1.f32935a
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C7325c9.m41394n(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f32936b = r0
        L_0x0127:
            long r12 = r1.f32937c
            r14 = -1
            long r12 = r12 + r14
            r1.f32937c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016c
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r0 = r0.f32873b
            com.google.android.gms.measurement.internal.l r2 = r0.mo24112W()
            r2.mo24189f()
            com.google.android.gms.measurement.internal.j4 r0 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo24209b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo24472P()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x015b }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x017d
        L_0x015b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo24209b(r3, r0)
            goto L_0x017d
        L_0x016c:
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r0 = r0.f32873b
            com.google.android.gms.measurement.internal.l r2 = r0.mo24112W()
            long r5 = r1.f32937c
            com.google.android.gms.internal.measurement.r4 r7 = r1.f32935a
            r3 = r18
            r2.mo24499v(r3, r4, r5, r7)
        L_0x017d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.r4 r2 = r1.f32935a
            java.util.List r2 = r2.mo23813K()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.v4 r3 = (com.google.android.gms.internal.measurement.C7214v4) r3
            com.google.android.gms.measurement.internal.b r4 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r4 = r4.f32873b
            r4.mo24127g0()
            java.lang.String r4 = r3.mo23949I()
            com.google.android.gms.internal.measurement.v4 r4 = com.google.android.gms.measurement.internal.C7325c9.m41393m(r8, r4)
            if (r4 != 0) goto L_0x018c
            r0.add(r3)
            goto L_0x018c
        L_0x01ad:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b8
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01b8:
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24258t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo24209b(r2, r10)
        L_0x01c9:
            r0 = r10
            goto L_0x0233
        L_0x01cb:
            com.google.android.gms.measurement.internal.b r0 = r1.f32938d
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24258t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo24210c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01de:
            r0 = move-exception
            r5 = r14
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            r5.close()
        L_0x01e5:
            throw r0
        L_0x01e6:
            r1.f32936b = r4
            r1.f32935a = r8
            com.google.android.gms.measurement.internal.b r2 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r2 = r2.f32873b
            r2.mo24127g0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7325c9.m41394n(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f32937c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            com.google.android.gms.measurement.internal.b r2 = r1.f32938d
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24258t()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo24209b(r3, r0)
            goto L_0x0233
        L_0x021c:
            com.google.android.gms.measurement.internal.b r2 = r1.f32938d
            com.google.android.gms.measurement.internal.a9 r2 = r2.f32873b
            com.google.android.gms.measurement.internal.l r2 = r2.mo24112W()
            java.lang.Object r4 = p033d5.C4141r.m28221k(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f32937c
            r3 = r18
            r7 = r19
            r2.mo24499v(r3, r4, r5, r7)
        L_0x0233:
            com.google.android.gms.internal.measurement.e9 r2 = r19.mo23501z()
            com.google.android.gms.internal.measurement.q4 r2 = (com.google.android.gms.internal.measurement.C7134q4) r2
            r2.mo23748A(r0)
            r2.mo23763y()
            r2.mo23760u(r9)
            com.google.android.gms.internal.measurement.h9 r0 = r2.mo23357k()
            com.google.android.gms.internal.measurement.r4 r0 = (com.google.android.gms.internal.measurement.C7150r4) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7490r9.mo24637a(java.lang.String, com.google.android.gms.internal.measurement.r4):com.google.android.gms.internal.measurement.r4");
    }
}
