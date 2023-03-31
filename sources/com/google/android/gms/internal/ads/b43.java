package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
import p067i5.C4696j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b43 {

    /* renamed from: f */
    private static final Object f7092f = new Object();

    /* renamed from: a */
    private final Context f7093a;

    /* renamed from: b */
    private final SharedPreferences f7094b;

    /* renamed from: c */
    private final String f7095c;

    /* renamed from: d */
    private final i33 f7096d;

    /* renamed from: e */
    private boolean f7097e = false;

    public b43(Context context, int i, i33 i33, boolean z) {
        this.f7093a = context;
        this.f7095c = Integer.toString(i - 1);
        this.f7094b = context.getSharedPreferences("pcvmspf", 0);
        this.f7096d = i33;
        this.f7097e = z;
    }

    /* renamed from: e */
    private final File m10184e(String str) {
        return new File(new File(this.f7093a.getDir("pccache", 0), this.f7095c), str);
    }

    /* renamed from: f */
    private static String m10185f(C2698oh ohVar) {
        C2773qh J = C2810rh.m19821J();
        J.mo13537v(ohVar.mo12916I().mo13800P());
        J.mo13533p(ohVar.mo12916I().mo13799O());
        J.mo13534r(ohVar.mo12916I().mo13796G());
        J.mo13536u(ohVar.mo12916I().mo13798I());
        J.mo13535s(ohVar.mo12916I().mo13797H());
        return C4696j.m30401a(((C2810rh) J.mo13423m()).mo9402e().mo11531j());
    }

    /* renamed from: g */
    private final String m10186g() {
        return "FBAMTD".concat(String.valueOf(this.f7095c));
    }

    /* renamed from: h */
    private final String m10187h() {
        return "LATMTD".concat(String.valueOf(this.f7095c));
    }

    /* renamed from: i */
    private final void m10188i(int i, long j) {
        i33 i33 = this.f7096d;
        if (i33 != null) {
            i33.mo11014d(i, j);
        }
    }

    /* renamed from: j */
    private final void m10189j(int i, long j, String str) {
        i33 i33 = this.f7096d;
        if (i33 != null) {
            i33.mo11013a(i, j, str);
        }
    }

    /* renamed from: k */
    private final C2810rh m10190k(int i) {
        String str;
        ex3 ex3;
        if (i == 1) {
            str = this.f7094b.getString(m10187h(), (String) null);
        } else {
            str = this.f7094b.getString(m10186g(), (String) null);
        }
        if (str == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            jw3 K = jw3.m15086K(C4696j.m30404d(str));
            if (this.f7097e) {
                ex3 = ex3.m12308a();
            } else {
                ex3 = ex3.m12309b();
            }
            return C2810rh.m19825N(K, ex3);
        } catch (ey3 unused) {
            return null;
        } catch (NullPointerException unused2) {
            m10188i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m10188i(2032, currentTimeMillis);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8671a(com.google.android.gms.internal.ads.C2698oh r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = f7092f
            monitor-enter(r2)
            com.google.android.gms.internal.ads.rh r3 = r7.mo12916I()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.mo13800P()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.m10184e(r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.jw3 r3 = r7.mo12917J()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.mo11531j()     // Catch:{ all -> 0x0054 }
            boolean r3 = com.google.android.gms.internal.ads.v33.m21967e(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.m10188i(r7, r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r7 = 0
            return r7
        L_0x0030:
            java.lang.String r7 = m10185f(r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.f7094b     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.m10187h()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.m10188i(r3, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.m10188i(r3, r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b43.mo8671a(com.google.android.gms.internal.ads.oh):boolean");
    }

    /* renamed from: b */
    public final boolean mo8672b(C2698oh ohVar, a43 a43) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f7092f) {
            C2810rh k = m10190k(1);
            String P = ohVar.mo12916I().mo13800P();
            if (k == null || !k.mo13800P().equals(P)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File e = m10184e(P);
                if (e.exists()) {
                    String str = "1";
                    if (true != e.isDirectory()) {
                        str = "0";
                    }
                    String str2 = "1";
                    if (true != e.isFile()) {
                        str2 = "0";
                    }
                    m10189j(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    m10188i(4015, currentTimeMillis2);
                } else if (!e.mkdirs()) {
                    String str3 = "1";
                    if (true != e.canWrite()) {
                        str3 = "0";
                    }
                    m10189j(4024, currentTimeMillis2, "cw:".concat(str3));
                    m10188i(4015, currentTimeMillis2);
                    return false;
                }
                File e2 = m10184e(P);
                File file = new File(e2, "pcam.jar");
                File file2 = new File(e2, "pcbc");
                if (!v33.m21967e(file, ohVar.mo12918K().mo11531j())) {
                    m10188i(4016, currentTimeMillis);
                    return false;
                } else if (!v33.m21967e(file2, ohVar.mo12917J().mo11531j())) {
                    m10188i(4017, currentTimeMillis);
                    return false;
                } else if (a43 == null || a43.mo8203a(file)) {
                    String f = m10185f(ohVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.f7094b.getString(m10187h(), (String) null);
                    SharedPreferences.Editor edit = this.f7094b.edit();
                    edit.putString(m10187h(), f);
                    if (string != null) {
                        edit.putString(m10186g(), string);
                    }
                    if (!edit.commit()) {
                        m10188i(4019, currentTimeMillis3);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    C2810rh k2 = m10190k(1);
                    if (k2 != null) {
                        hashSet.add(k2.mo13800P());
                    }
                    C2810rh k3 = m10190k(2);
                    if (k3 != null) {
                        hashSet.add(k3.mo13800P());
                    }
                    for (File file3 : new File(this.f7093a.getDir("pccache", 0), this.f7095c).listFiles()) {
                        if (!hashSet.contains(file3.getName())) {
                            v33.m21966d(file3);
                        }
                    }
                    m10188i(5014, currentTimeMillis);
                    return true;
                } else {
                    m10188i(4018, currentTimeMillis);
                    v33.m21966d(e2);
                    return false;
                }
            } else {
                m10188i(4014, currentTimeMillis);
                return false;
            }
        }
    }

    /* renamed from: c */
    public final t33 mo8673c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f7092f) {
            C2810rh k = m10190k(1);
            if (k == null) {
                m10188i(4022, currentTimeMillis);
                return null;
            }
            File e = m10184e(k.mo13800P());
            File file = new File(e, "pcam.jar");
            if (!file.exists()) {
                file = new File(e, "pcam");
            }
            File file2 = new File(e, "pcbc");
            File file3 = new File(e, "pcopt");
            m10188i(5016, currentTimeMillis);
            t33 t33 = new t33(k, file, file2, file3);
            return t33;
        }
    }

    /* renamed from: d */
    public final boolean mo8674d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f7092f) {
            C2810rh k = m10190k(1);
            if (k == null) {
                m10188i(4025, currentTimeMillis);
                return false;
            }
            File e = m10184e(k.mo13800P());
            if (!new File(e, "pcam.jar").exists()) {
                m10188i(4026, currentTimeMillis);
                return false;
            } else if (!new File(e, "pcbc").exists()) {
                m10188i(4027, currentTimeMillis);
                return false;
            } else {
                m10188i(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
