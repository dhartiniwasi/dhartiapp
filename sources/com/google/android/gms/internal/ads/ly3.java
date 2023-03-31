package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ly3 extends qy3 {

    /* renamed from: c */
    private static final Class f13113c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ ly3(ky3 ky3) {
        super((py3) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.iy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.iy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.iy3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m16314f(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.y04.m23666p(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jy3
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.iy3 r0 = new com.google.android.gms.internal.ads.iy3
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jz3
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.by3
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.by3 r0 = (com.google.android.gms.internal.ads.by3) r0
            com.google.android.gms.internal.ads.by3 r6 = r0.mo8975h(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.ads.y04.m23646D(r3, r4, r0)
            goto L_0x0087
        L_0x002f:
            java.lang.Class r1 = f13113c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.y04.m23646D(r3, r4, r1)
        L_0x004b:
            r0 = r1
            goto L_0x0087
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.t04
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.iy3 r1 = new com.google.android.gms.internal.ads.iy3
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.t04 r0 = (com.google.android.gms.internal.ads.t04) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.ads.y04.m23646D(r3, r4, r1)
            goto L_0x004b
        L_0x0068:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jz3
            if (r1 == 0) goto L_0x0087
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.by3
            if (r1 == 0) goto L_0x0087
            r1 = r0
            com.google.android.gms.internal.ads.by3 r1 = (com.google.android.gms.internal.ads.by3) r1
            boolean r2 = r1.mo8988e()
            if (r2 == 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.by3 r6 = r1.mo8975h(r0)
            com.google.android.gms.internal.ads.y04.m23646D(r3, r4, r6)
            return r6
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly3.m16314f(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo12224a(Object obj, long j) {
        return m16314f(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12225b(Object obj, long j) {
        Object obj2;
        List list = (List) y04.m23666p(obj, j);
        if (list instanceof jy3) {
            obj2 = ((jy3) list).mo11256a();
        } else if (!f13113c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof jz3) || !(list instanceof by3)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                by3 by3 = (by3) list;
                if (by3.mo8988e()) {
                    by3.mo8987d();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        y04.m23646D(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12226c(Object obj, Object obj2, long j) {
        List list = (List) y04.m23666p(obj2, j);
        List f = m16314f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        y04.m23646D(obj, j, list);
    }
}
