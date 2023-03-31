package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1379a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
/* compiled from: OpReorderer */
class C1408i {

    /* renamed from: a */
    final C1409a f4033a;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* compiled from: OpReorderer */
    interface C1409a {
        /* renamed from: a */
        void mo5377a(C1379a.C1381b bVar);

        /* renamed from: b */
        C1379a.C1381b mo5378b(int i, int i2, int i3, Object obj);
    }

    C1408i(C1409a aVar) {
        this.f4033a = aVar;
    }

    /* renamed from: a */
    private int m6579a(List<C1379a.C1381b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3903a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m6580c(List<C1379a.C1381b> list, int i, C1379a.C1381b bVar, int i2, C1379a.C1381b bVar2) {
        int i3 = bVar.f3906d;
        int i4 = bVar2.f3904b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f3904b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f3904b = i6 + bVar2.f3906d;
        }
        int i7 = bVar2.f3904b;
        if (i7 <= i3) {
            bVar.f3906d = i3 + bVar2.f3906d;
        }
        bVar2.f3904b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    private void m6581d(List<C1379a.C1381b> list, int i, int i2) {
        C1379a.C1381b bVar = list.get(i);
        C1379a.C1381b bVar2 = list.get(i2);
        int i3 = bVar2.f3903a;
        if (i3 == 1) {
            m6580c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo5486e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo5487f(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5485b(List<C1379a.C1381b> list) {
        while (true) {
            int a = m6579a(list);
            if (a != -1) {
                m6581d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5486e(java.util.List<androidx.recyclerview.widget.C1379a.C1381b> r10, int r11, androidx.recyclerview.widget.C1379a.C1381b r12, int r13, androidx.recyclerview.widget.C1379a.C1381b r14) {
        /*
            r9 = this;
            int r0 = r12.f3904b
            int r1 = r12.f3906d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x0016
            int r4 = r14.f3904b
            if (r4 != r0) goto L_0x0014
            int r4 = r14.f3906d
            int r0 = r1 - r0
            if (r4 != r0) goto L_0x0014
            r0 = 0
            goto L_0x0022
        L_0x0014:
            r0 = 0
            goto L_0x0025
        L_0x0016:
            int r4 = r14.f3904b
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0024
            int r4 = r14.f3906d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0024
            r0 = 1
        L_0x0022:
            r2 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            int r4 = r14.f3904b
            r5 = 2
            if (r1 >= r4) goto L_0x002e
            int r4 = r4 - r3
            r14.f3904b = r4
            goto L_0x0047
        L_0x002e:
            int r6 = r14.f3906d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0047
            int r6 = r6 - r3
            r14.f3906d = r6
            r12.f3903a = r5
            r12.f3906d = r3
            int r11 = r14.f3906d
            if (r11 != 0) goto L_0x0046
            r10.remove(r13)
            androidx.recyclerview.widget.i$a r10 = r9.f4033a
            r10.mo5377a(r14)
        L_0x0046:
            return
        L_0x0047:
            int r1 = r12.f3904b
            int r4 = r14.f3904b
            r6 = 0
            if (r1 > r4) goto L_0x0052
            int r4 = r4 + r3
            r14.f3904b = r4
            goto L_0x0068
        L_0x0052:
            int r7 = r14.f3906d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0068
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.i$a r7 = r9.f4033a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo5378b(r5, r1, r4, r6)
            int r1 = r12.f3904b
            int r3 = r14.f3904b
            int r1 = r1 - r3
            r14.f3906d = r1
        L_0x0068:
            if (r2 == 0) goto L_0x0076
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.i$a r10 = r9.f4033a
            r10.mo5377a(r12)
            return
        L_0x0076:
            if (r0 == 0) goto L_0x00a7
            if (r6 == 0) goto L_0x0090
            int r0 = r12.f3904b
            int r1 = r6.f3904b
            if (r0 <= r1) goto L_0x0085
            int r1 = r6.f3906d
            int r0 = r0 - r1
            r12.f3904b = r0
        L_0x0085:
            int r0 = r12.f3906d
            int r1 = r6.f3904b
            if (r0 <= r1) goto L_0x0090
            int r1 = r6.f3906d
            int r0 = r0 - r1
            r12.f3906d = r0
        L_0x0090:
            int r0 = r12.f3904b
            int r1 = r14.f3904b
            if (r0 <= r1) goto L_0x009b
            int r1 = r14.f3906d
            int r0 = r0 - r1
            r12.f3904b = r0
        L_0x009b:
            int r0 = r12.f3906d
            int r1 = r14.f3904b
            if (r0 <= r1) goto L_0x00d5
            int r1 = r14.f3906d
            int r0 = r0 - r1
            r12.f3906d = r0
            goto L_0x00d5
        L_0x00a7:
            if (r6 == 0) goto L_0x00bf
            int r0 = r12.f3904b
            int r1 = r6.f3904b
            if (r0 < r1) goto L_0x00b4
            int r1 = r6.f3906d
            int r0 = r0 - r1
            r12.f3904b = r0
        L_0x00b4:
            int r0 = r12.f3906d
            int r1 = r6.f3904b
            if (r0 < r1) goto L_0x00bf
            int r1 = r6.f3906d
            int r0 = r0 - r1
            r12.f3906d = r0
        L_0x00bf:
            int r0 = r12.f3904b
            int r1 = r14.f3904b
            if (r0 < r1) goto L_0x00ca
            int r1 = r14.f3906d
            int r0 = r0 - r1
            r12.f3904b = r0
        L_0x00ca:
            int r0 = r12.f3906d
            int r1 = r14.f3904b
            if (r0 < r1) goto L_0x00d5
            int r1 = r14.f3906d
            int r0 = r0 - r1
            r12.f3906d = r0
        L_0x00d5:
            r10.set(r11, r14)
            int r14 = r12.f3904b
            int r0 = r12.f3906d
            if (r14 == r0) goto L_0x00e2
            r10.set(r13, r12)
            goto L_0x00e5
        L_0x00e2:
            r10.remove(r13)
        L_0x00e5:
            if (r6 == 0) goto L_0x00ea
            r10.add(r11, r6)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1408i.mo5486e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5487f(java.util.List<androidx.recyclerview.widget.C1379a.C1381b> r9, int r10, androidx.recyclerview.widget.C1379a.C1381b r11, int r12, androidx.recyclerview.widget.C1379a.C1381b r13) {
        /*
            r8 = this;
            int r0 = r11.f3906d
            int r1 = r13.f3904b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f3904b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f3906d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f3906d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f4033a
            int r1 = r11.f3904b
            java.lang.Object r5 = r13.f3905c
            androidx.recyclerview.widget.a$b r0 = r0.mo5378b(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f3904b
            int r5 = r13.f3904b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f3904b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f3906d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r3 = r8.f4033a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f3905c
            androidx.recyclerview.widget.a$b r3 = r3.mo5378b(r2, r1, r5, r4)
            int r1 = r13.f3906d
            int r1 = r1 - r5
            r13.f3906d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f3906d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f4033a
            r11.mo5377a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1408i.mo5487f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
