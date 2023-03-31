package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C6871a4;
import com.google.android.gms.internal.measurement.C6902c1;
import com.google.android.gms.internal.measurement.C6903c2;
import com.google.android.gms.internal.measurement.C6905c4;
import com.google.android.gms.internal.measurement.C6922d4;
import com.google.android.gms.internal.measurement.C6990h4;
import com.google.android.gms.internal.measurement.C7135q5;
import com.google.android.gms.internal.measurement.C7139q9;
import com.google.android.gms.internal.measurement.C7167s5;
import com.google.android.gms.internal.measurement.C7272ye;
import com.google.android.gms.internal.measurement.C7277z3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p033d5.C4141r;
import p124r.C5413a;
import p124r.C5419e;
import p402y5.C13034l;
import p402y5.C13039q;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7331d4 extends C7478q8 implements C7359g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f32414d = new C5413a();

    /* renamed from: e */
    final Map f32415e = new C5413a();

    /* renamed from: f */
    final Map f32416f = new C5413a();

    /* renamed from: g */
    final Map f32417g = new C5413a();

    /* renamed from: h */
    private final Map f32418h = new C5413a();

    /* renamed from: i */
    private final Map f32419i = new C5413a();

    /* renamed from: j */
    final C5419e f32420j = new C7298a4(this, 20);

    /* renamed from: k */
    final C7272ye f32421k = new C7309b4(this);

    /* renamed from: l */
    private final Map f32422l = new C5413a();

    /* renamed from: m */
    private final Map f32423m = new C5413a();

    /* renamed from: n */
    private final Map f32424n = new C5413a();

    C7331d4(C7303a9 a9Var) {
        super(a9Var);
    }

    /* renamed from: k */
    private final C6922d4 m41422k(String str, byte[] bArr) {
        if (bArr == null) {
            return C6922d4.m39902I();
        }
        try {
            C6922d4 d4Var = (C6922d4) ((C6905c4) C7325c9.m41387C(C6922d4.m39900G(), bArr)).mo23357k();
            C7330d3 v = this.f32389a.mo24135l().mo24260v();
            String str2 = null;
            Long valueOf = d4Var.mo23319T() ? Long.valueOf(d4Var.mo23309E()) : null;
            if (d4Var.mo23318S()) {
                str2 = d4Var.mo23311J();
            }
            v.mo24210c("Parsed config. version, gmp_app_id", valueOf, str2);
            return d4Var;
        } catch (C7139q9 e) {
            this.f32389a.mo24135l().mo24261w().mo24210c("Unable to merge remote config. appId", C7352f3.m41475z(str), e);
            return C6922d4.m39902I();
        } catch (RuntimeException e2) {
            this.f32389a.mo24135l().mo24261w().mo24210c("Unable to merge remote config. appId", C7352f3.m41475z(str), e2);
            return C6922d4.m39902I();
        }
    }

    /* renamed from: m */
    private final void m41423m(String str, C6905c4 c4Var) {
        HashSet hashSet = new HashSet();
        C5413a aVar = new C5413a();
        C5413a aVar2 = new C5413a();
        C5413a aVar3 = new C5413a();
        for (C7277z3 D : c4Var.mo23184y()) {
            hashSet.add(D.mo24030D());
        }
        for (int i = 0; i < c4Var.mo23178p(); i++) {
            C6871a4 a4Var = (C6871a4) c4Var.mo23179r(i).mo23501z();
            if (a4Var.mo22995s().isEmpty()) {
                this.f32389a.mo24135l().mo24261w().mo24208a("EventConfig contained null event name");
            } else {
                String s = a4Var.mo22995s();
                String b = C13039q.m61355b(a4Var.mo22995s());
                if (!TextUtils.isEmpty(b)) {
                    a4Var.mo22994r(b);
                    c4Var.mo23181u(i, a4Var);
                }
                if (a4Var.mo22998x() && a4Var.mo22996u()) {
                    aVar.put(s, Boolean.TRUE);
                }
                if (a4Var.mo22999y() && a4Var.mo22997v()) {
                    aVar2.put(a4Var.mo22995s(), Boolean.TRUE);
                }
                if (a4Var.mo23000z()) {
                    if (a4Var.mo22993p() < 2 || a4Var.mo22993p() > 65535) {
                        this.f32389a.mo24135l().mo24261w().mo24210c("Invalid sampling rate. Event name, sample rate", a4Var.mo22995s(), Integer.valueOf(a4Var.mo22993p()));
                    } else {
                        aVar3.put(a4Var.mo22995s(), Integer.valueOf(a4Var.mo22993p()));
                    }
                }
            }
        }
        this.f32415e.put(str, hashSet);
        this.f32416f.put(str, aVar);
        this.f32417g.put(str, aVar2);
        this.f32419i.put(str, aVar3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r2 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m41424n(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo24623g()
            r12.mo24189f()
            p033d5.C4141r.m28217g(r13)
            java.util.Map r0 = r12.f32418h
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x012c
            com.google.android.gms.measurement.internal.a9 r0 = r12.f32873b
            com.google.android.gms.measurement.internal.l r0 = r0.mo24112W()
            p033d5.C4141r.m28217g(r13)
            r0.mo24189f()
            r0.mo24623g()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo24472P()     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0089 }
            if (r3 != 0) goto L_0x0047
            goto L_0x00a6
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.j4 r5 = r0.f32389a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.h r5 = r5.mo24443z()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.t2 r6 = com.google.android.gms.measurement.internal.C7516u2.f33071q0     // Catch:{ SQLiteException -> 0x0089 }
            boolean r5 = r5.mo24279B(r1, r6)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0063
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x0064
        L_0x0063:
            r5 = r1
        L_0x0064:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r6 == 0) goto L_0x007d
            com.google.android.gms.measurement.internal.j4 r6 = r0.f32389a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24256q()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r13)     // Catch:{ SQLiteException -> 0x0089 }
            r6.mo24209b(r7, r8)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x007d:
            if (r3 != 0) goto L_0x0080
            goto L_0x00a6
        L_0x0080:
            com.google.android.gms.measurement.internal.i r6 = new com.google.android.gms.measurement.internal.i     // Catch:{ SQLiteException -> 0x0089 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0089 }
            r2.close()
            goto L_0x00aa
        L_0x0089:
            r3 = move-exception
            goto L_0x0091
        L_0x008b:
            r13 = move-exception
            goto L_0x0126
        L_0x008e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0091:
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r13)     // Catch:{ all -> 0x0124 }
            r0.mo24210c(r4, r5, r3)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00a9
        L_0x00a6:
            r2.close()
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 != 0) goto L_0x00da
            java.util.Map r0 = r12.f32414d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32416f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32415e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32417g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32418h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32422l
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32423m
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32424n
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32419i
            r0.put(r13, r1)
            return
        L_0x00da:
            byte[] r0 = r6.f32548a
            com.google.android.gms.internal.measurement.d4 r0 = r12.m41422k(r13, r0)
            com.google.android.gms.internal.measurement.e9 r0 = r0.mo23501z()
            com.google.android.gms.internal.measurement.c4 r0 = (com.google.android.gms.internal.measurement.C6905c4) r0
            r12.m41423m(r13, r0)
            java.util.Map r1 = r12.f32414d
            com.google.android.gms.internal.measurement.h9 r2 = r0.mo23357k()
            com.google.android.gms.internal.measurement.d4 r2 = (com.google.android.gms.internal.measurement.C6922d4) r2
            java.util.Map r2 = m41426p(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f32418h
            com.google.android.gms.internal.measurement.h9 r2 = r0.mo23357k()
            com.google.android.gms.internal.measurement.d4 r2 = (com.google.android.gms.internal.measurement.C6922d4) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.h9 r1 = r0.mo23357k()
            com.google.android.gms.internal.measurement.d4 r1 = (com.google.android.gms.internal.measurement.C6922d4) r1
            r12.m41425o(r13, r1)
            java.util.Map r1 = r12.f32422l
            java.lang.String r0 = r0.mo23182v()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f32423m
            java.lang.String r1 = r6.f32549b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f32424n
            java.lang.String r1 = r6.f32550c
            r0.put(r13, r1)
            return
        L_0x0124:
            r13 = move-exception
            r1 = r2
        L_0x0126:
            if (r1 == 0) goto L_0x012b
            r1.close()
        L_0x012b:
            throw r13
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7331d4.m41424n(java.lang.String):void");
    }

    /* renamed from: o */
    private final void m41425o(String str, C6922d4 d4Var) {
        if (d4Var.mo23307C() != 0) {
            this.f32389a.mo24135l().mo24260v().mo24209b("EES programs found", Integer.valueOf(d4Var.mo23307C()));
            C7167s5 s5Var = (C7167s5) d4Var.mo23315N().get(0);
            try {
                C6902c1 c1Var = new C6902c1();
                c1Var.mo23143d("internal.remoteConfig", new C7558y3(this, str));
                c1Var.mo23143d("internal.appMetadata", new C13034l(this, str));
                c1Var.mo23143d("internal.logger", new C7568z3(this));
                c1Var.mo23142c(s5Var);
                this.f32420j.mo19587d(str, c1Var);
                this.f32389a.mo24135l().mo24260v().mo24210c("EES program loaded for appId, activities", str, Integer.valueOf(s5Var.mo23871C().mo23723C()));
                for (C7135q5 D : s5Var.mo23871C().mo23724F()) {
                    this.f32389a.mo24135l().mo24260v().mo24209b("EES program activity", D.mo23765D());
                }
            } catch (C6903c2 unused) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Failed to load EES program. appId", str);
            }
        } else {
            this.f32420j.mo19588e(str);
        }
    }

    /* renamed from: p */
    private static final Map m41426p(C6922d4 d4Var) {
        C5413a aVar = new C5413a();
        if (d4Var != null) {
            for (C6990h4 h4Var : d4Var.mo23316O()) {
                aVar.put(h4Var.mo23473D(), h4Var.mo23474E());
            }
        }
        return aVar;
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ C6902c1 m41427r(C7331d4 d4Var, String str) {
        d4Var.mo24623g();
        C4141r.m28217g(str);
        if (!d4Var.mo24214C(str)) {
            return null;
        }
        if (!d4Var.f32418h.containsKey(str) || d4Var.f32418h.get(str) == null) {
            d4Var.m41424n(str);
        } else {
            d4Var.m41425o(str, (C6922d4) d4Var.f32418h.get(str));
        }
        return (C6902c1) d4Var.f32420j.mo19590h().get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo24212A(String str) {
        mo24189f();
        this.f32418h.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean mo24213B(String str) {
        mo24189f();
        C6922d4 t = mo24228t(str);
        if (t == null) {
            return false;
        }
        return t.mo23317R();
    }

    /* renamed from: C */
    public final boolean mo24214C(String str) {
        C6922d4 d4Var;
        if (TextUtils.isEmpty(str) || (d4Var = (C6922d4) this.f32418h.get(str)) == null || d4Var.mo23307C() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo24215D(String str) {
        return "1".equals(mo24226c(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo24216E(String str, String str2) {
        Boolean bool;
        mo24189f();
        m41424n(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f32417g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean mo24217F(String str, String str2) {
        Boolean bool;
        mo24189f();
        m41424n(str);
        if (mo24215D(str) && C7391i9.m41591W(str2)) {
            return true;
        }
        if (mo24218G(str) && C7391i9.m41592X(str2)) {
            return true;
        }
        Map map = (Map) this.f32416f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo24218G(String str) {
        return "1".equals(mo24226c(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo24219H(String str, byte[] bArr, String str2, String str3) {
        mo24623g();
        mo24189f();
        C4141r.m28217g(str);
        C6905c4 c4Var = (C6905c4) m41422k(str, bArr).mo23501z();
        m41423m(str, c4Var);
        m41425o(str, (C6922d4) c4Var.mo23357k());
        this.f32418h.put(str, (C6922d4) c4Var.mo23357k());
        this.f32422l.put(str, c4Var.mo23182v());
        this.f32423m.put(str, str2);
        this.f32424n.put(str, str3);
        this.f32414d.put(str, m41426p((C6922d4) c4Var.mo23357k()));
        this.f32873b.mo24112W().mo24491m(str, new ArrayList(c4Var.mo23183x()));
        try {
            c4Var.mo23180s();
            bArr = ((C6922d4) c4Var.mo23357k()).mo23736h();
        } catch (RuntimeException e) {
            this.f32389a.mo24135l().mo24261w().mo24210c("Unable to serialize reduced-size config. Storing full config instead. appId", C7352f3.m41475z(str), e);
        }
        C7414l W = this.f32873b.mo24112W();
        C4141r.m28217g(str);
        W.mo24189f();
        W.mo24623g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (W.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33071q0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (((long) W.mo24472P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                W.f32389a.mo24135l().mo24256q().mo24209b("Failed to update remote config (got 0). appId", C7352f3.m41475z(str));
            }
        } catch (SQLiteException e2) {
            W.f32389a.mo24135l().mo24256q().mo24210c("Error storing remote config. appId", C7352f3.m41475z(str), e2);
        }
        this.f32418h.put(str, (C6922d4) c4Var.mo23357k());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean mo24220I(String str) {
        mo24189f();
        m41424n(str);
        return this.f32415e.get(str) != null && ((Set) this.f32415e.get(str)).contains("app_instance_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo24221J(String str) {
        mo24189f();
        m41424n(str);
        if (this.f32415e.get(str) == null || (!((Set) this.f32415e.get(str)).contains("device_model") && !((Set) this.f32415e.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo24222K(String str) {
        mo24189f();
        m41424n(str);
        return this.f32415e.get(str) != null && ((Set) this.f32415e.get(str)).contains("enhanced_user_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo24223L(String str) {
        mo24189f();
        m41424n(str);
        return this.f32415e.get(str) != null && ((Set) this.f32415e.get(str)).contains("google_signals");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo24224M(String str) {
        mo24189f();
        m41424n(str);
        if (this.f32415e.get(str) == null || (!((Set) this.f32415e.get(str)).contains("os_version") && !((Set) this.f32415e.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo24225N(String str) {
        mo24189f();
        m41424n(str);
        return this.f32415e.get(str) != null && ((Set) this.f32415e.get(str)).contains("user_id");
    }

    /* renamed from: c */
    public final String mo24226c(String str, String str2) {
        mo24189f();
        m41424n(str);
        Map map = (Map) this.f32414d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo24151j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo24227q(String str, String str2) {
        Integer num;
        mo24189f();
        m41424n(str);
        Map map = (Map) this.f32419i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C6922d4 mo24228t(String str) {
        mo24623g();
        mo24189f();
        C4141r.m28217g(str);
        m41424n(str);
        return (C6922d4) this.f32418h.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo24229u(String str) {
        mo24189f();
        return (String) this.f32424n.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo24230v(String str) {
        mo24189f();
        return (String) this.f32423m.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo24231w(String str) {
        mo24189f();
        m41424n(str);
        return (String) this.f32422l.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Set mo24232y(String str) {
        mo24189f();
        m41424n(str);
        return (Set) this.f32415e.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo24233z(String str) {
        mo24189f();
        this.f32423m.put(str, (Object) null);
    }
}
