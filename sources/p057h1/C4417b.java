package p057h1;

import android.text.TextUtils;
import androidx.work.C1536b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import p050g1.C4329p;
import p170y0.C6083b;
import p170y0.C6094j;
import p170y0.C6099m;
import p176z0.C6184c;
import p176z0.C6187e;
import p176z0.C6188f;
import p176z0.C6189g;
import p176z0.C6191i;

/* renamed from: h1.b */
/* compiled from: EnqueueRunnable */
public class C4417b implements Runnable {

    /* renamed from: c */
    private static final String f24587c = C6094j.m35719f("EnqueueRunnable");

    /* renamed from: a */
    private final C6189g f24588a;

    /* renamed from: b */
    private final C6184c f24589b = new C6184c();

    public C4417b(C6189g gVar) {
        this.f24588a = gVar;
    }

    /* renamed from: b */
    private static boolean m29358b(C6189g gVar) {
        boolean c = m29359c(gVar.mo21120g(), gVar.mo21119f(), (String[]) C6189g.m36004l(gVar).toArray(new String[0]), gVar.mo21117d(), gVar.mo21115b());
        gVar.mo21123k();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e1 A[LOOP:7: B:120:0x01db->B:122:0x01e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x020a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0159  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m29359c(p176z0.C6191i r19, java.util.List<? extends p170y0.C6112u> r20, java.lang.String[] r21, java.lang.String r22, p170y0.C6087d r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.mo21130q()
            r7 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            g1.q r8 = r6.mo6318B()
            g1.p r8 = r8.mo17766n(r15)
            if (r8 != 0) goto L_0x0045
            y0.j r0 = p170y0.C6094j.m35717c()
            java.lang.String r1 = f24587c
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo20922b(r1, r2, r4)
            return r3
        L_0x0045:
            y0.s r8 = r8.f24216b
            y0.s r15 = p170y0.C6110s.SUCCEEDED
            if (r8 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            y0.s r15 = p170y0.C6110s.FAILED
            if (r8 != r15) goto L_0x0055
            r14 = 1
            goto L_0x005a
        L_0x0055:
            y0.s r15 = p170y0.C6110s.CANCELLED
            if (r8 != r15) goto L_0x005a
            r13 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r8 = android.text.TextUtils.isEmpty(r22)
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x014e
            g1.q r10 = r6.mo6318B()
            java.util.List r10 = r10.mo17756d(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x014e
            y0.d r11 = p170y0.C6087d.APPEND
            if (r3 == r11) goto L_0x00ca
            y0.d r11 = p170y0.C6087d.APPEND_OR_REPLACE
            if (r3 != r11) goto L_0x0085
            goto L_0x00ca
        L_0x0085:
            y0.d r11 = p170y0.C6087d.KEEP
            if (r3 != r11) goto L_0x00a5
            java.util.Iterator r3 = r10.iterator()
        L_0x008d:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00a5
            java.lang.Object r11 = r3.next()
            g1.p$b r11 = (p050g1.C4329p.C4331b) r11
            y0.s r11 = r11.f24234b
            y0.s r15 = p170y0.C6110s.ENQUEUED
            if (r11 == r15) goto L_0x00a3
            y0.s r15 = p170y0.C6110s.RUNNING
            if (r11 != r15) goto L_0x008d
        L_0x00a3:
            r11 = 0
            return r11
        L_0x00a5:
            r11 = 0
            h1.a r3 = p057h1.C4413a.m29348c(r2, r0, r11)
            r3.run()
            g1.q r3 = r6.mo6318B()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00c7
            java.lang.Object r15 = r10.next()
            g1.p$b r15 = (p050g1.C4329p.C4331b) r15
            java.lang.String r15 = r15.f24233a
            r3.mo17753a(r15)
            goto L_0x00b5
        L_0x00c7:
            r3 = 1
            goto L_0x014f
        L_0x00ca:
            r11 = 0
            g1.b r9 = r6.mo6320t()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d8:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0113
            java.lang.Object r16 = r10.next()
            r7 = r16
            g1.p$b r7 = (p050g1.C4329p.C4331b) r7
            java.lang.String r11 = r7.f24233a
            boolean r11 = r9.mo17719c(r11)
            if (r11 != 0) goto L_0x010c
            y0.s r11 = r7.f24234b
            r17 = r9
            y0.s r9 = p170y0.C6110s.SUCCEEDED
            if (r11 != r9) goto L_0x00f8
            r9 = 1
            goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            r9 = r9 & r12
            y0.s r12 = p170y0.C6110s.FAILED
            if (r11 != r12) goto L_0x0100
            r14 = 1
            goto L_0x0105
        L_0x0100:
            y0.s r12 = p170y0.C6110s.CANCELLED
            if (r11 != r12) goto L_0x0105
            r13 = 1
        L_0x0105:
            java.lang.String r7 = r7.f24233a
            r15.add(r7)
            r12 = r9
            goto L_0x010e
        L_0x010c:
            r17 = r9
        L_0x010e:
            r9 = r17
            r7 = 1
            r11 = 0
            goto L_0x00d8
        L_0x0113:
            y0.d r7 = p170y0.C6087d.APPEND_OR_REPLACE
            if (r3 != r7) goto L_0x0140
            if (r13 != 0) goto L_0x011b
            if (r14 == 0) goto L_0x0140
        L_0x011b:
            g1.q r3 = r6.mo6318B()
            java.util.List r7 = r3.mo17756d(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0127:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0139
            java.lang.Object r9 = r7.next()
            g1.p$b r9 = (p050g1.C4329p.C4331b) r9
            java.lang.String r9 = r9.f24233a
            r3.mo17753a(r9)
            goto L_0x0127
        L_0x0139:
            java.util.List r15 = java.util.Collections.emptyList()
            r3 = 0
            r13 = 0
            goto L_0x0141
        L_0x0140:
            r3 = r14
        L_0x0141:
            java.lang.Object[] r1 = r15.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r7 = r1.length
            if (r7 <= 0) goto L_0x014c
            r9 = 1
            goto L_0x014d
        L_0x014c:
            r9 = 0
        L_0x014d:
            r14 = r3
        L_0x014e:
            r3 = 0
        L_0x014f:
            java.util.Iterator r7 = r20.iterator()
        L_0x0153:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0210
            java.lang.Object r10 = r7.next()
            y0.u r10 = (p170y0.C6112u) r10
            g1.p r11 = r10.mo20946d()
            if (r9 == 0) goto L_0x017a
            if (r12 != 0) goto L_0x017a
            if (r14 == 0) goto L_0x016e
            y0.s r15 = p170y0.C6110s.FAILED
            r11.f24216b = r15
            goto L_0x0182
        L_0x016e:
            if (r13 == 0) goto L_0x0175
            y0.s r15 = p170y0.C6110s.CANCELLED
            r11.f24216b = r15
            goto L_0x0182
        L_0x0175:
            y0.s r15 = p170y0.C6110s.BLOCKED
            r11.f24216b = r15
            goto L_0x0182
        L_0x017a:
            boolean r15 = r11.mo17746d()
            if (r15 != 0) goto L_0x0185
            r11.f24228n = r4
        L_0x0182:
            r17 = r4
            goto L_0x018b
        L_0x0185:
            r17 = r4
            r4 = 0
            r11.f24228n = r4
        L_0x018b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0199
            r5 = 25
            if (r4 > r5) goto L_0x0199
            m29361g(r11)
            goto L_0x01a8
        L_0x0199:
            r5 = 22
            if (r4 > r5) goto L_0x01a8
            java.lang.String r4 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r4 = m29362h(r0, r4)
            if (r4 == 0) goto L_0x01a8
            m29361g(r11)
        L_0x01a8:
            y0.s r4 = r11.f24216b
            y0.s r5 = p170y0.C6110s.ENQUEUED
            if (r4 != r5) goto L_0x01af
            r3 = 1
        L_0x01af:
            g1.q r4 = r6.mo6318B()
            r4.mo17761i(r11)
            if (r9 == 0) goto L_0x01d3
            int r4 = r1.length
            r5 = 0
        L_0x01ba:
            if (r5 >= r4) goto L_0x01d3
            r11 = r1[r5]
            g1.a r15 = new g1.a
            java.lang.String r0 = r10.mo20944b()
            r15.<init>(r0, r11)
            g1.b r0 = r6.mo6320t()
            r0.mo17720d(r15)
            int r5 = r5 + 1
            r0 = r19
            goto L_0x01ba
        L_0x01d3:
            java.util.Set r0 = r10.mo20945c()
            java.util.Iterator r0 = r0.iterator()
        L_0x01db:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01f8
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            g1.t r5 = r6.mo6319C()
            g1.s r11 = new g1.s
            java.lang.String r15 = r10.mo20944b()
            r11.<init>(r4, r15)
            r5.mo17776b(r11)
            goto L_0x01db
        L_0x01f8:
            if (r8 == 0) goto L_0x020a
            g1.k r0 = r6.mo6323z()
            g1.j r4 = new g1.j
            java.lang.String r5 = r10.mo20944b()
            r4.<init>(r2, r5)
            r0.mo17736a(r4)
        L_0x020a:
            r0 = r19
            r4 = r17
            goto L_0x0153
        L_0x0210:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p057h1.C4417b.m29359c(z0.i, java.util.List, java.lang.String[], java.lang.String, y0.d):boolean");
    }

    /* renamed from: e */
    private static boolean m29360e(C6189g gVar) {
        List<C6189g> e = gVar.mo21118e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (C6189g next : e) {
                if (!next.mo21122j()) {
                    z2 |= m29360e(next);
                } else {
                    C6094j.m35717c().mo20925h(f24587c, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.mo21116c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m29358b(gVar) | z;
    }

    /* renamed from: g */
    private static void m29361g(C4329p pVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        C6083b bVar = pVar.f24224j;
        String str = pVar.f24217c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (bVar.mo20887f() || bVar.mo20891i()) {
            C1536b.C1537a aVar = new C1536b.C1537a();
            aVar.mo6311c(pVar.f24219e).mo6316h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f24217c = cls.getName();
            pVar.f24219e = aVar.mo6309a();
        }
    }

    /* renamed from: h */
    private static boolean m29362h(C6191i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (C6187e eVar : iVar.mo21129p()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo17943a() {
        WorkDatabase q = this.f24588a.mo21120g().mo21130q();
        q.mo5592c();
        try {
            boolean e = m29360e(this.f24588a);
            q.mo5606r();
            return e;
        } finally {
            q.mo5596g();
        }
    }

    /* renamed from: d */
    public C6099m mo17944d() {
        return this.f24589b;
    }

    /* renamed from: f */
    public void mo17945f() {
        C6191i g = this.f24588a.mo21120g();
        C6188f.m36001b(g.mo21126k(), g.mo21130q(), g.mo21129p());
    }

    public void run() {
        try {
            if (!this.f24588a.mo21121h()) {
                if (mo17943a()) {
                    C4419d.m29371a(this.f24588a.mo21120g().mo21125j(), RescheduleReceiver.class, true);
                    mo17945f();
                }
                this.f24589b.mo21102a(C6099m.f29493a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f24588a}));
        } catch (Throwable th) {
            this.f24589b.mo21102a(new C6099m.C6101b.C6102a(th));
        }
    }
}
