package p343rc;

import java.util.IdentityHashMap;
import java.util.Map;
import p182a7.C6425j;

/* renamed from: rc.a */
/* compiled from: Attributes */
public final class C12271a {

    /* renamed from: b */
    private static final IdentityHashMap<C12274c<?>, Object> f45490b;

    /* renamed from: c */
    public static final C12271a f45491c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final IdentityHashMap<C12274c<?>, Object> f45492a;

    /* renamed from: rc.a$b */
    /* compiled from: Attributes */
    public static final class C12273b {

        /* renamed from: a */
        private C12271a f45493a;

        /* renamed from: b */
        private IdentityHashMap<C12274c<?>, Object> f45494b;

        /* renamed from: b */
        private IdentityHashMap<C12274c<?>, Object> m58935b(int i) {
            if (this.f45494b == null) {
                this.f45494b = new IdentityHashMap<>(i);
            }
            return this.f45494b;
        }

        /* renamed from: a */
        public C12271a mo36920a() {
            if (this.f45494b != null) {
                for (Map.Entry entry : this.f45493a.f45492a.entrySet()) {
                    if (!this.f45494b.containsKey(entry.getKey())) {
                        this.f45494b.put((C12274c) entry.getKey(), entry.getValue());
                    }
                }
                this.f45493a = new C12271a(this.f45494b);
                this.f45494b = null;
            }
            return this.f45493a;
        }

        /* renamed from: c */
        public <T> C12273b mo36921c(C12274c<T> cVar) {
            if (this.f45493a.f45492a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f45493a.f45492a);
                identityHashMap.remove(cVar);
                this.f45493a = new C12271a(identityHashMap);
            }
            IdentityHashMap<C12274c<?>, Object> identityHashMap2 = this.f45494b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        /* renamed from: d */
        public <T> C12273b mo36922d(C12274c<T> cVar, T t) {
            m58935b(1).put(cVar, t);
            return this;
        }

        private C12273b(C12271a aVar) {
            this.f45493a = aVar;
        }
    }

    /* renamed from: rc.a$c */
    /* compiled from: Attributes */
    public static final class C12274c<T> {

        /* renamed from: a */
        private final String f45495a;

        private C12274c(String str) {
            this.f45495a = str;
        }

        /* renamed from: a */
        public static <T> C12274c<T> m58939a(String str) {
            return new C12274c<>(str);
        }

        public String toString() {
            return this.f45495a;
        }
    }

    static {
        IdentityHashMap<C12274c<?>, Object> identityHashMap = new IdentityHashMap<>();
        f45490b = identityHashMap;
        f45491c = new C12271a(identityHashMap);
    }

    /* renamed from: c */
    public static C12273b m58932c() {
        return new C12273b();
    }

    /* renamed from: b */
    public <T> T mo36915b(C12274c<T> cVar) {
        return this.f45492a.get(cVar);
    }

    /* renamed from: d */
    public C12273b mo36916d() {
        return new C12273b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r7 == 0) goto L_0x005a
            java.lang.Class<rc.a> r2 = p343rc.C12271a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x005a
        L_0x0010:
            rc.a r7 = (p343rc.C12271a) r7
            java.util.IdentityHashMap<rc.a$c<?>, java.lang.Object> r2 = r6.f45492a
            int r2 = r2.size()
            java.util.IdentityHashMap<rc.a$c<?>, java.lang.Object> r3 = r7.f45492a
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0021
            return r1
        L_0x0021:
            java.util.IdentityHashMap<rc.a$c<?>, java.lang.Object> r2 = r6.f45492a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap<rc.a$c<?>, java.lang.Object> r4 = r7.f45492a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap<rc.a$c<?>, java.lang.Object> r5 = r7.f45492a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = p182a7.C6425j.m37541a(r4, r3)
            if (r3 != 0) goto L_0x002b
            return r1
        L_0x0059:
            return r0
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p343rc.C12271a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry next : this.f45492a.entrySet()) {
            i += C6425j.m37542b(next.getKey(), next.getValue());
        }
        return i;
    }

    public String toString() {
        return this.f45492a.toString();
    }

    private C12271a(IdentityHashMap<C12274c<?>, Object> identityHashMap) {
        this.f45492a = identityHashMap;
    }
}
