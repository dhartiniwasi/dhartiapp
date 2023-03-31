package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import p067i5.C4696j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u33 {

    /* renamed from: a */
    private final File f18349a;

    /* renamed from: b */
    final File f18350b;

    /* renamed from: c */
    private final SharedPreferences f18351c;

    /* renamed from: d */
    private final int f18352d;

    public u33(Context context, int i) {
        this.f18351c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        v33.m21963a(dir, false);
        this.f18349a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        v33.m21963a(dir2, true);
        this.f18350b = dir2;
        this.f18352d = i;
    }

    /* renamed from: a */
    static String m21399a(C2810rh rhVar) {
        return C4696j.m30401a(rhVar.mo9402e().mo11531j());
    }

    /* renamed from: e */
    private final File m21400e() {
        File file = new File(this.f18349a, Integer.toString(this.f18352d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: f */
    private final String m21401f() {
        int i = this.f18352d;
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* renamed from: g */
    private final String m21402g() {
        int i = this.f18352d;
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0162  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14443b(com.google.android.gms.internal.ads.C2698oh r8, com.google.android.gms.internal.ads.a43 r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.rh r0 = r8.mo12916I()
            java.lang.String r0 = r0.mo13800P()
            com.google.android.gms.internal.ads.jw3 r1 = r8.mo12918K()
            byte[] r1 = r1.mo11531j()
            com.google.android.gms.internal.ads.jw3 r2 = r8.mo12917J()
            byte[] r2 = r2.mo11531j()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x017d
            if (r2 == 0) goto L_0x017d
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x017d
        L_0x0026:
            java.io.File r3 = r7.f18350b
            com.google.android.gms.internal.ads.v33.m21966d(r3)
            java.io.File r3 = r7.f18350b
            r3.mkdirs()
            java.io.File r3 = r7.f18350b
            java.io.File r3 = com.google.android.gms.internal.ads.v33.m21965c(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.f18350b
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.v33.m21964b(r0, r5, r3)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004c
            boolean r1 = com.google.android.gms.internal.ads.v33.m21967e(r3, r1)
            if (r1 == 0) goto L_0x017d
        L_0x004c:
            java.io.File r1 = r7.f18350b
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.v33.m21964b(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.v33.m21967e(r0, r2)
            if (r0 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.rh r0 = r8.mo12916I()
            java.lang.String r0 = r0.mo13800P()
            java.io.File r1 = r7.f18350b
            java.io.File r0 = com.google.android.gms.internal.ads.v33.m21964b(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            boolean r9 = r9.mo8203a(r0)
            if (r9 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            return r4
        L_0x0078:
            com.google.android.gms.internal.ads.rh r9 = r8.mo12916I()
            java.lang.String r9 = r9.mo13800P()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8 = 0
            goto L_0x0137
        L_0x008a:
            java.io.File r0 = r7.f18350b
            java.io.File r0 = com.google.android.gms.internal.ads.v33.m21964b(r9, r5, r0)
            java.io.File r2 = r7.f18350b
            java.io.File r2 = com.google.android.gms.internal.ads.v33.m21964b(r9, r3, r2)
            java.io.File r6 = r7.m21400e()
            java.io.File r5 = com.google.android.gms.internal.ads.v33.m21964b(r9, r5, r6)
            java.io.File r6 = r7.m21400e()
            java.io.File r9 = com.google.android.gms.internal.ads.v33.m21964b(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0087
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.qh r9 = com.google.android.gms.internal.ads.C2810rh.m19821J()
            com.google.android.gms.internal.ads.rh r0 = r8.mo12916I()
            java.lang.String r0 = r0.mo13800P()
            r9.mo13537v(r0)
            com.google.android.gms.internal.ads.rh r0 = r8.mo12916I()
            java.lang.String r0 = r0.mo13799O()
            r9.mo13533p(r0)
            com.google.android.gms.internal.ads.rh r0 = r8.mo12916I()
            long r2 = r0.mo13796G()
            r9.mo13534r(r2)
            com.google.android.gms.internal.ads.rh r0 = r8.mo12916I()
            long r2 = r0.mo13798I()
            r9.mo13536u(r2)
            com.google.android.gms.internal.ads.rh r8 = r8.mo12916I()
            long r2 = r8.mo13797H()
            r9.mo13535s(r2)
            com.google.android.gms.internal.ads.sx3 r8 = r9.mo13423m()
            com.google.android.gms.internal.ads.rh r8 = (com.google.android.gms.internal.ads.C2810rh) r8
            com.google.android.gms.internal.ads.rh r9 = r7.mo14444c(r1)
            android.content.SharedPreferences r0 = r7.f18351c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0125
            java.lang.String r2 = r8.mo13800P()
            java.lang.String r3 = r9.mo13800P()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = r7.m21401f()
            java.lang.String r9 = m21399a(r9)
            r0.putString(r2, r9)
        L_0x0125:
            java.lang.String r9 = r7.m21402g()
            java.lang.String r8 = m21399a(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0087
            r8 = 1
        L_0x0137:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.rh r0 = r7.mo14444c(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = r0.mo13800P()
            r9.add(r0)
        L_0x0149:
            r0 = 2
            com.google.android.gms.internal.ads.rh r0 = r7.mo14444c(r0)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.mo13800P()
            r9.add(r0)
        L_0x0157:
            java.io.File r0 = r7.m21400e()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x0160:
            if (r4 >= r1) goto L_0x017c
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0179
            java.io.File r3 = r7.m21400e()
            java.io.File r2 = com.google.android.gms.internal.ads.v33.m21965c(r2, r3)
            com.google.android.gms.internal.ads.v33.m21966d(r2)
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x0160
        L_0x017c:
            return r8
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u33.mo14443b(com.google.android.gms.internal.ads.oh, com.google.android.gms.internal.ads.a43):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2810rh mo14444c(int i) {
        String str;
        if (i == 1) {
            str = this.f18351c.getString(m21402g(), (String) null);
        } else {
            str = this.f18351c.getString(m21401f(), (String) null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C2810rh M = C2810rh.m19824M(jw3.m15086K(C4696j.m30404d(str)));
            String P = M.mo13800P();
            File b = v33.m21964b(P, "pcam.jar", m21400e());
            if (!b.exists()) {
                b = v33.m21964b(P, "pcam", m21400e());
            }
            File b2 = v33.m21964b(P, "pcbc", m21400e());
            if (!b.exists() || !b2.exists()) {
                return null;
            }
            return M;
        } catch (ey3 unused) {
        }
    }

    /* renamed from: d */
    public final t33 mo14445d(int i) {
        C2810rh c = mo14444c(1);
        if (c == null) {
            return null;
        }
        String P = c.mo13800P();
        File b = v33.m21964b(P, "pcam.jar", m21400e());
        if (!b.exists()) {
            b = v33.m21964b(P, "pcam", m21400e());
        }
        return new t33(c, b, v33.m21964b(P, "pcbc", m21400e()), v33.m21964b(P, "pcopt", m21400e()));
    }
}
