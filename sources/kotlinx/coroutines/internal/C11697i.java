package kotlinx.coroutines.internal;

import p272jd.C11565d;
import p344rd.C12439l;

/* renamed from: kotlinx.coroutines.internal.i */
/* compiled from: DispatchedContinuation.kt */
public final class C11697i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11690e0 f44265a = new C11690e0("UNDEFINED");

    /* renamed from: b */
    public static final C11690e0 f44266b = new C11690e0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r8.mo38440z0() != false) goto L_0x0095;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m56879b(p272jd.C11565d<? super T> r6, java.lang.Object r7, p344rd.C12439l<? super java.lang.Throwable, p243gd.C10349s> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C11695h
            if (r0 == 0) goto L_0x00ba
            kotlinx.coroutines.internal.h r6 = (kotlinx.coroutines.internal.C11695h) r6
            java.lang.Object r8 = p410yd.C13370z.m62445b(r7, r8)
            yd.d0 r0 = r6.f44261d
            jd.g r1 = r6.getContext()
            boolean r0 = r0.mo35954I(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f44263f = r8
            r6.f47674c = r1
            yd.d0 r7 = r6.f44261d
            jd.g r8 = r6.getContext()
            r7.mo35925H(r8, r6)
            goto L_0x00bd
        L_0x0026:
            boolean r0 = p410yd.C13330n0.m62281a()
            yd.g2 r0 = p410yd.C13301g2.f47622a
            yd.a1 r0 = r0.mo38422a()
            boolean r2 = r0.mo38386c0()
            if (r2 == 0) goto L_0x003f
            r6.f44263f = r8
            r6.f47674c = r1
            r0.mo38383S(r6)
            goto L_0x00bd
        L_0x003f:
            r0.mo38385X(r1)
            r2 = 0
            jd.g r3 = r6.getContext()     // Catch:{ all -> 0x00ad }
            yd.p1$b r4 = p410yd.C13337p1.f47660Z     // Catch:{ all -> 0x00ad }
            jd.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00ad }
            yd.p1 r3 = (p410yd.C13337p1) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x006d
            boolean r4 = r3.mo38375b()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r3 = r3.mo38470h()     // Catch:{ all -> 0x00ad }
            r6.mo35890b(r8, r3)     // Catch:{ all -> 0x00ad }
            gd.m$a r8 = p243gd.C10341m.f40958a     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p243gd.C10344n.m52244a(r3)     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p243gd.C10341m.m52240a(r8)     // Catch:{ all -> 0x00ad }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00ad }
            r8 = 1
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 != 0) goto L_0x00a6
            jd.d<T> r8 = r6.f44262e     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r6.f44264g     // Catch:{ all -> 0x00ad }
            jd.g r4 = r8.getContext()     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = kotlinx.coroutines.internal.C11698i0.m56883c(r4, r3)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.internal.e0 r5 = kotlinx.coroutines.internal.C11698i0.f44267a     // Catch:{ all -> 0x00ad }
            if (r3 == r5) goto L_0x0085
            yd.i2 r8 = p410yd.C13275c0.m62176f(r8, r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            jd.d<T> r5 = r6.f44262e     // Catch:{ all -> 0x0099 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0099 }
            gd.s r7 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0095
            boolean r7 = r8.mo38440z0()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            kotlinx.coroutines.internal.C11698i0.m56881a(r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x0099:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.mo38440z0()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a5
        L_0x00a2:
            kotlinx.coroutines.internal.C11698i0.m56881a(r4, r3)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            boolean r7 = r0.mo38388f0()     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00ad:
            r7 = move-exception
            r6.mo38488h(r7, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.mo38382L(r1)
            goto L_0x00bd
        L_0x00b5:
            r6 = move-exception
            r0.mo38382L(r1)
            throw r6
        L_0x00ba:
            r6.resumeWith(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11697i.m56879b(jd.d, java.lang.Object, rd.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m56880c(C11565d dVar, Object obj, C12439l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m56879b(dVar, obj, lVar);
    }
}
