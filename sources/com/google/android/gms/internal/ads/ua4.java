package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ua4 implements ya4 {

    /* renamed from: h */
    public static final s83 f18477h = sa4.f17338a;

    /* renamed from: i */
    private static final Random f18478i = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final fs0 f18479a = new fs0();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final dq0 f18480b = new dq0();

    /* renamed from: c */
    private final HashMap f18481c = new HashMap();

    /* renamed from: d */
    private final s83 f18482d;

    /* renamed from: e */
    private xa4 f18483e;

    /* renamed from: f */
    private gt0 f18484f = gt0.f10059a;

    /* renamed from: g */
    private String f18485g;

    public ua4(s83 s83) {
        this.f18482d = s83;
    }

    /* renamed from: k */
    private final ta4 m21520k(int i, mg4 mg4) {
        int i2;
        ta4 ta4 = null;
        long j = Long.MAX_VALUE;
        for (ta4 ta42 : this.f18481c.values()) {
            ta42.mo14269g(i, mg4);
            if (ta42.mo14270j(i, mg4)) {
                long b = ta42.f17925c;
                if (b == -1 || b < j) {
                    ta4 = ta42;
                    j = b;
                } else if (i2 == 0) {
                    int i3 = gb2.f9812a;
                    if (!(ta4.f17926d == null || ta42.f17926d == null)) {
                        ta4 = ta42;
                    }
                }
            }
        }
        if (ta4 != null) {
            return ta4;
        }
        String l = m21521l();
        ta4 ta43 = new ta4(this, l, i, mg4);
        this.f18481c.put(l, ta43);
        return ta43;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static String m21521l() {
        byte[] bArr = new byte[12];
        f18478i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: m */
    private final void m21522m(m84 m84) {
        if (m84.f13270b.mo10643o()) {
            this.f18485g = null;
            return;
        }
        ta4 ta4 = (ta4) this.f18481c.get(this.f18485g);
        ta4 k = m21520k(m84.f13271c, m84.f13272d);
        this.f18485g = k.f17923a;
        mo14489g(m84);
        mg4 mg4 = m84.f13272d;
        if (mg4 != null && mg4.mo11883b()) {
            if (ta4 == null || ta4.f17925c != m84.f13272d.f12632d || ta4.f17926d == null || ta4.f17926d.f12630b != m84.f13272d.f12630b || ta4.f17926d.f12631c != m84.f13272d.f12631c) {
                mg4 mg42 = m84.f13272d;
                String unused = m21520k(m84.f13271c, new mg4(mg42.f12629a, mg42.f12632d)).f17923a;
                String unused2 = k.f17923a;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo14483a(m84 m84) {
        Objects.requireNonNull(this.f18483e);
        gt0 gt0 = this.f18484f;
        this.f18484f = m84.f13270b;
        Iterator it = this.f18481c.values().iterator();
        while (it.hasNext()) {
            ta4 ta4 = (ta4) it.next();
            if (!ta4.mo14272l(gt0, this.f18484f) || ta4.mo14271k(m84)) {
                it.remove();
                if (ta4.f17927e) {
                    if (ta4.f17923a.equals(this.f18485g)) {
                        this.f18485g = null;
                    }
                    this.f18483e.mo14884a(m84, ta4.f17923a, false);
                }
            }
        }
        m21522m(m84);
    }

    /* renamed from: b */
    public final synchronized String mo14484b() {
        return this.f18485g;
    }

    /* renamed from: c */
    public final synchronized String mo14485c(gt0 gt0, mg4 mg4) {
        return m21520k(gt0.mo10608n(mg4.f12629a, this.f18480b).f8361c, mg4).f17923a;
    }

    /* renamed from: d */
    public final void mo14486d(xa4 xa4) {
        this.f18483e = xa4;
    }

    /* renamed from: e */
    public final synchronized void mo14487e(m84 m84) {
        xa4 xa4;
        this.f18485g = null;
        Iterator it = this.f18481c.values().iterator();
        while (it.hasNext()) {
            ta4 ta4 = (ta4) it.next();
            it.remove();
            if (ta4.f17927e && (xa4 = this.f18483e) != null) {
                xa4.mo14884a(m84, ta4.f17923a, false);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo14488f(m84 m84, int i) {
        Objects.requireNonNull(this.f18483e);
        Iterator it = this.f18481c.values().iterator();
        while (it.hasNext()) {
            ta4 ta4 = (ta4) it.next();
            if (ta4.mo14271k(m84)) {
                it.remove();
                if (ta4.f17927e) {
                    boolean equals = ta4.f17923a.equals(this.f18485g);
                    boolean z = false;
                    if (i == 0 && equals && ta4.f17928f) {
                        z = true;
                    }
                    if (equals) {
                        this.f18485g = null;
                    }
                    this.f18483e.mo14884a(m84, ta4.f17923a, z);
                }
            }
        }
        m21522m(m84);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r10.f13272d.f12632d < com.google.android.gms.internal.ads.ta4.m20860b(r0)) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14489g(com.google.android.gms.internal.ads.m84 r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.xa4 r0 = r9.f18483e     // Catch:{ all -> 0x00cb }
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.gt0 r0 = r10.f13270b     // Catch:{ all -> 0x00cb }
            boolean r0 = r0.mo10643o()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r9)
            return
        L_0x0010:
            java.util.HashMap r0 = r9.f18481c     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.f18485g     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.ta4 r0 = (com.google.android.gms.internal.ads.ta4) r0     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.mg4 r1 = r10.f13272d     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0041
            long r1 = r0.f17925c     // Catch:{ all -> 0x00cb }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0033
            int r0 = r0.f17924b     // Catch:{ all -> 0x00cb }
            int r1 = r10.f13271c     // Catch:{ all -> 0x00cb }
            if (r0 != r1) goto L_0x003f
            goto L_0x0041
        L_0x0033:
            com.google.android.gms.internal.ads.mg4 r1 = r10.f13272d     // Catch:{ all -> 0x00cb }
            long r1 = r1.f12632d     // Catch:{ all -> 0x00cb }
            long r3 = r0.f17925c     // Catch:{ all -> 0x00cb }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
        L_0x003f:
            monitor-exit(r9)
            return
        L_0x0041:
            int r0 = r10.f13271c     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.mg4 r1 = r10.f13272d     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.ta4 r0 = r9.m21520k(r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.f18485g     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = r0.f17923a     // Catch:{ all -> 0x00cb }
            r9.f18485g = r1     // Catch:{ all -> 0x00cb }
        L_0x0053:
            com.google.android.gms.internal.ads.mg4 r1 = r10.f13272d     // Catch:{ all -> 0x00cb }
            r2 = 1
            if (r1 == 0) goto L_0x009d
            boolean r3 = r1.mo11883b()     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.mg4 r3 = new com.google.android.gms.internal.ads.mg4     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r1.f12629a     // Catch:{ all -> 0x00cb }
            long r5 = r1.f12632d     // Catch:{ all -> 0x00cb }
            int r1 = r1.f12630b     // Catch:{ all -> 0x00cb }
            r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00cb }
            int r1 = r10.f13271c     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.ta4 r1 = r9.m21520k(r1, r3)     // Catch:{ all -> 0x00cb }
            boolean r3 = r1.f17927e     // Catch:{ all -> 0x00cb }
            if (r3 != 0) goto L_0x009d
            r1.f17927e = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.gt0 r3 = r10.f13270b     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.mg4 r4 = r10.f13272d     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r4.f12629a     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.dq0 r5 = r9.f18480b     // Catch:{ all -> 0x00cb }
            r3.mo10608n(r4, r5)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.dq0 r3 = r9.f18480b     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.mg4 r4 = r10.f13272d     // Catch:{ all -> 0x00cb }
            int r4 = r4.f12630b     // Catch:{ all -> 0x00cb }
            r3.mo9658h(r4)     // Catch:{ all -> 0x00cb }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.gb2.m13176j0(r3)     // Catch:{ all -> 0x00cb }
            long r7 = com.google.android.gms.internal.ads.gb2.m13176j0(r3)     // Catch:{ all -> 0x00cb }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r1.f17923a     // Catch:{ all -> 0x00cb }
        L_0x009d:
            boolean r1 = r0.f17927e     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00a9
            r0.f17927e = true     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r0.f17923a     // Catch:{ all -> 0x00cb }
        L_0x00a9:
            java.lang.String r1 = r0.f17923a     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = r9.f18485g     // Catch:{ all -> 0x00cb }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r0.f17928f     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00c9
            r0.f17928f = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.xa4 r1 = r9.f18483e     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r0.f17923a     // Catch:{ all -> 0x00cb }
            r1.mo14885b(r10, r0)     // Catch:{ all -> 0x00cb }
            monitor-exit(r9)
            return
        L_0x00c9:
            monitor-exit(r9)
            return
        L_0x00cb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ua4.mo14489g(com.google.android.gms.internal.ads.m84):void");
    }
}
