package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7235w9 extends C6894ba {

    /* renamed from: c */
    private static final Class f32168c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C7235w9(C7219v9 v9Var) {
        super((C7283z9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23128a(Object obj, long j) {
        Object obj2;
        List list = (List) C6879ac.m39545k(obj, j);
        if (list instanceof C7203u9) {
            obj2 = ((C7203u9) list).mo23887a();
        } else if (!f32168c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C7204ua) || !(list instanceof C7091n9)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C7091n9 n9Var = (C7091n9) list;
                if (n9Var.mo23698e()) {
                    n9Var.mo23697d();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C6879ac.m39558x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.t9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.t9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.t9} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23129b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C7203u9
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.t9 r1 = new com.google.android.gms.internal.measurement.t9
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C7204ua
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C7091n9
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.n9 r1 = (com.google.android.gms.internal.measurement.C7091n9) r1
            com.google.android.gms.internal.measurement.n9 r0 = r1.mo23012h(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.measurement.C6879ac.m39558x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class r2 = f32168c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.measurement.C6879ac.m39558x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C7221vb
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.measurement.t9 r2 = new com.google.android.gms.internal.measurement.t9
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.vb r1 = (com.google.android.gms.internal.measurement.C7221vb) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.measurement.C6879ac.m39558x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C7204ua
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C7091n9
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.measurement.n9 r2 = (com.google.android.gms.internal.measurement.C7091n9) r2
            boolean r3 = r2.mo23698e()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.n9 r1 = r2.mo23012h(r1)
            com.google.android.gms.internal.measurement.C6879ac.m39558x(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = r1
        L_0x00a2:
            com.google.android.gms.internal.measurement.C6879ac.m39558x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7235w9.mo23129b(java.lang.Object, java.lang.Object, long):void");
    }
}
