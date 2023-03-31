package p410yd;

import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.scheduling.C11747h;
import p272jd.C11565d;

/* renamed from: yd.u0 */
/* compiled from: DispatchedTask.kt */
public abstract class C13353u0<T> extends C11747h {

    /* renamed from: c */
    public int f47674c;

    public C13353u0(int i) {
        this.f47674c = i;
    }

    /* renamed from: b */
    public void mo35890b(Object obj, Throwable th) {
    }

    /* renamed from: d */
    public abstract C11565d<T> mo35891d();

    /* renamed from: f */
    public Throwable mo38451f(Object obj) {
        C13355v vVar = obj instanceof C13355v ? (C13355v) obj : null;
        if (vVar == null) {
            return null;
        }
        return vVar.f47676a;
    }

    /* renamed from: g */
    public <T> T mo38452g(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void mo38488h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C10329b.m52230a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C11669k.m56784b(th);
            C13297g0.m62201a(mo35891d().getContext(), new C13327m0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: l */
    public abstract Object mo35892l();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        if (r4.mo38440z0() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d3, code lost:
        if (r4.mo38440z0() != false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = p410yd.C13330n0.m62281a()
            if (r0 == 0) goto L_0x0017
            int r0 = r10.f47674c
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            kotlinx.coroutines.scheduling.i r0 = r10.f44359b
            jd.d r1 = r10.mo35891d()     // Catch:{ all -> 0x00d9 }
            kotlinx.coroutines.internal.h r1 = (kotlinx.coroutines.internal.C11695h) r1     // Catch:{ all -> 0x00d9 }
            jd.d<T> r2 = r1.f44262e     // Catch:{ all -> 0x00d9 }
            java.lang.Object r1 = r1.f44264g     // Catch:{ all -> 0x00d9 }
            jd.g r3 = r2.getContext()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r1 = kotlinx.coroutines.internal.C11698i0.m56883c(r3, r1)     // Catch:{ all -> 0x00d9 }
            kotlinx.coroutines.internal.e0 r4 = kotlinx.coroutines.internal.C11698i0.f44267a     // Catch:{ all -> 0x00d9 }
            r5 = 0
            if (r1 == r4) goto L_0x0035
            yd.i2 r4 = p410yd.C13275c0.m62176f(r2, r3, r1)     // Catch:{ all -> 0x00d9 }
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            jd.g r6 = r2.getContext()     // Catch:{ all -> 0x00cc }
            java.lang.Object r7 = r10.mo35892l()     // Catch:{ all -> 0x00cc }
            java.lang.Throwable r8 = r10.mo38451f(r7)     // Catch:{ all -> 0x00cc }
            if (r8 != 0) goto L_0x0055
            int r9 = r10.f47674c     // Catch:{ all -> 0x00cc }
            boolean r9 = p410yd.C13356v0.m62349b(r9)     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x0055
            yd.p1$b r9 = p410yd.C13337p1.f47660Z     // Catch:{ all -> 0x00cc }
            jd.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00cc }
            yd.p1 r6 = (p410yd.C13337p1) r6     // Catch:{ all -> 0x00cc }
            goto L_0x0056
        L_0x0055:
            r6 = r5
        L_0x0056:
            if (r6 == 0) goto L_0x0085
            boolean r9 = r6.mo38375b()     // Catch:{ all -> 0x00cc }
            if (r9 != 0) goto L_0x0085
            java.util.concurrent.CancellationException r6 = r6.mo38470h()     // Catch:{ all -> 0x00cc }
            r10.mo35890b(r7, r6)     // Catch:{ all -> 0x00cc }
            gd.m$a r7 = p243gd.C10341m.f40958a     // Catch:{ all -> 0x00cc }
            boolean r7 = p410yd.C13330n0.m62284d()     // Catch:{ all -> 0x00cc }
            if (r7 == 0) goto L_0x0079
            boolean r7 = r2 instanceof kotlin.coroutines.jvm.internal.C11649e     // Catch:{ all -> 0x00cc }
            if (r7 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r7 = r2
            kotlin.coroutines.jvm.internal.e r7 = (kotlin.coroutines.jvm.internal.C11649e) r7     // Catch:{ all -> 0x00cc }
            java.lang.Throwable r6 = kotlinx.coroutines.internal.C11688d0.m56846j(r6, r7)     // Catch:{ all -> 0x00cc }
        L_0x0079:
            java.lang.Object r6 = p243gd.C10344n.m52244a(r6)     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p243gd.C10341m.m52240a(r6)     // Catch:{ all -> 0x00cc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00cc }
            goto L_0x00a2
        L_0x0085:
            if (r8 == 0) goto L_0x0095
            gd.m$a r6 = p243gd.C10341m.f40958a     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p243gd.C10344n.m52244a(r8)     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p243gd.C10341m.m52240a(r6)     // Catch:{ all -> 0x00cc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00cc }
            goto L_0x00a2
        L_0x0095:
            java.lang.Object r6 = r10.mo38452g(r7)     // Catch:{ all -> 0x00cc }
            gd.m$a r7 = p243gd.C10341m.f40958a     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p243gd.C10341m.m52240a(r6)     // Catch:{ all -> 0x00cc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00cc }
        L_0x00a2:
            gd.s r2 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x00cc }
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r4.mo38440z0()     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x00af
        L_0x00ac:
            kotlinx.coroutines.internal.C11698i0.m56881a(r3, r1)     // Catch:{ all -> 0x00d9 }
        L_0x00af:
            gd.m$a r1 = p243gd.C10341m.f40958a     // Catch:{ all -> 0x00b9 }
            r0.mo35985a()     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = p243gd.C10341m.m52240a(r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x00c4
        L_0x00b9:
            r0 = move-exception
            gd.m$a r1 = p243gd.C10341m.f40958a
            java.lang.Object r0 = p243gd.C10344n.m52244a(r0)
            java.lang.Object r0 = p243gd.C10341m.m52240a(r0)
        L_0x00c4:
            java.lang.Throwable r0 = p243gd.C10341m.m52241b(r0)
            r10.mo38488h(r5, r0)
            goto L_0x00f8
        L_0x00cc:
            r2 = move-exception
            if (r4 == 0) goto L_0x00d5
            boolean r4 = r4.mo38440z0()     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x00d8
        L_0x00d5:
            kotlinx.coroutines.internal.C11698i0.m56881a(r3, r1)     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r1 = move-exception
            gd.m$a r2 = p243gd.C10341m.f40958a     // Catch:{ all -> 0x00e6 }
            r0.mo35985a()     // Catch:{ all -> 0x00e6 }
            gd.s r0 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = p243gd.C10341m.m52240a(r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x00f1
        L_0x00e6:
            r0 = move-exception
            gd.m$a r2 = p243gd.C10341m.f40958a
            java.lang.Object r0 = p243gd.C10344n.m52244a(r0)
            java.lang.Object r0 = p243gd.C10341m.m52240a(r0)
        L_0x00f1:
            java.lang.Throwable r0 = p243gd.C10341m.m52241b(r0)
            r10.mo38488h(r1, r0)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13353u0.run():void");
    }
}
