package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.l0 */
/* compiled from: ListFieldSchema */
abstract class C8186l0 {

    /* renamed from: a */
    private static final C8186l0 f35005a = new C8188b();

    /* renamed from: b */
    private static final C8186l0 f35006b = new C8189c();

    /* renamed from: com.google.protobuf.l0$b */
    /* compiled from: ListFieldSchema */
    private static final class C8188b extends C8186l0 {

        /* renamed from: c */
        private static final Class<?> f35007c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C8188b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m45294f(Object obj, long j) {
            return (List) C8268z1.m45984G(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.j0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.j0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.j0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> m45295g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m45294f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.C8178k0
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.j0 r0 = new com.google.protobuf.j0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.C8146g1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.C8119d0.C8130j
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.d0$j r0 = (com.google.protobuf.C8119d0.C8130j) r0
                com.google.protobuf.d0$j r6 = r0.mo26823m(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.C8268z1.m45999V(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f35007c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.C8268z1.m45999V(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.C8257y1
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.j0 r1 = new com.google.protobuf.j0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.y1 r0 = (com.google.protobuf.C8257y1) r0
                r1.addAll(r0)
                com.google.protobuf.C8268z1.m45999V(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.C8146g1
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.C8119d0.C8130j
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.d0$j r1 = (com.google.protobuf.C8119d0.C8130j) r1
                boolean r2 = r1.mo26802F1()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.d0$j r0 = r1.mo26823m(r0)
                com.google.protobuf.C8268z1.m45999V(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8186l0.C8188b.m45295g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo27153c(Object obj, long j) {
            Object obj2;
            List list = (List) C8268z1.m45984G(obj, j);
            if (list instanceof C8178k0) {
                obj2 = ((C8178k0) list).mo27025f1();
            } else if (!f35007c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C8146g1) || !(list instanceof C8119d0.C8130j)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C8119d0.C8130j jVar = (C8119d0.C8130j) list;
                    if (jVar.mo26802F1()) {
                        jVar.mo26803H();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C8268z1.m45999V(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo27154d(Object obj, Object obj2, long j) {
            List f = m45294f(obj2, j);
            List g = m45295g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            C8268z1.m45999V(obj, j, f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo27155e(Object obj, long j) {
            return m45295g(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.l0$c */
    /* compiled from: ListFieldSchema */
    private static final class C8189c extends C8186l0 {
        private C8189c() {
            super();
        }

        /* renamed from: f */
        static <E> C8119d0.C8130j<E> m45299f(Object obj, long j) {
            return (C8119d0.C8130j) C8268z1.m45984G(obj, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo27153c(Object obj, long j) {
            m45299f(obj, j).mo26803H();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo27154d(Object obj, Object obj2, long j) {
            C8119d0.C8130j f = m45299f(obj, j);
            C8119d0.C8130j f2 = m45299f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo26802F1()) {
                    f = f.mo26823m(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C8268z1.m45999V(obj, j, f2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo27155e(Object obj, long j) {
            C8119d0.C8130j f = m45299f(obj, j);
            if (f.mo26802F1()) {
                return f;
            }
            int size = f.size();
            C8119d0.C8130j m = f.mo26823m(size == 0 ? 10 : size * 2);
            C8268z1.m45999V(obj, j, m);
            return m;
        }
    }

    /* renamed from: a */
    static C8186l0 m45289a() {
        return f35005a;
    }

    /* renamed from: b */
    static C8186l0 m45290b() {
        return f35006b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo27153c(Object obj, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo27154d(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo27155e(Object obj, long j);

    private C8186l0() {
    }
}
