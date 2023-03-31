package p190b7;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p182a7.C6431n;
import p190b7.C6690r;

/* renamed from: b7.k0 */
/* compiled from: RegularImmutableMap */
final class C6662k0<K, V> extends C6690r<K, V> {

    /* renamed from: h */
    static final C6690r<Object, Object> f31143h = new C6662k0((Object) null, new Object[0], 0);

    /* renamed from: e */
    private final transient Object f31144e;

    /* renamed from: f */
    final transient Object[] f31145f;

    /* renamed from: g */
    private final transient int f31146g;

    /* renamed from: b7.k0$a */
    /* compiled from: RegularImmutableMap */
    static class C6663a<K, V> extends C6694s<Map.Entry<K, V>> {

        /* renamed from: c */
        private final transient C6690r<K, V> f31147c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final transient Object[] f31148d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final transient int f31149e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final transient int f31150f;

        /* renamed from: b7.k0$a$a */
        /* compiled from: RegularImmutableMap */
        class C6664a extends C6685q<Map.Entry<K, V>> {
            C6664a() {
            }

            /* renamed from: D */
            public Map.Entry<K, V> get(int i) {
                C6431n.m37559l(i, C6663a.this.f31150f);
                int i2 = i * 2;
                Object obj = C6663a.this.f31148d[C6663a.this.f31149e + i2];
                Objects.requireNonNull(obj);
                Object obj2 = C6663a.this.f31148d[i2 + (C6663a.this.f31149e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            /* renamed from: k */
            public boolean mo22452k() {
                return true;
            }

            public int size() {
                return C6663a.this.f31150f;
            }
        }

        C6663a(C6690r<K, V> rVar, Object[] objArr, int i, int i2) {
            this.f31147c = rVar;
            this.f31148d = objArr;
            this.f31149e = i;
            this.f31150f = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo22447c(Object[] objArr, int i) {
            return mo22475b().mo22447c(objArr, i);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f31147c.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22452k() {
            return true;
        }

        /* renamed from: l */
        public C6695s0<Map.Entry<K, V>> iterator() {
            return mo22475b().iterator();
        }

        public int size() {
            return this.f31150f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public C6685q<Map.Entry<K, V>> mo22471t() {
            return new C6664a();
        }
    }

    /* renamed from: b7.k0$b */
    /* compiled from: RegularImmutableMap */
    static final class C6665b<K> extends C6694s<K> {

        /* renamed from: c */
        private final transient C6690r<K, ?> f31152c;

        /* renamed from: d */
        private final transient C6685q<K> f31153d;

        C6665b(C6690r<K, ?> rVar, C6685q<K> qVar) {
            this.f31152c = rVar;
            this.f31153d = qVar;
        }

        /* renamed from: b */
        public C6685q<K> mo22475b() {
            return this.f31153d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo22447c(Object[] objArr, int i) {
            return mo22475b().mo22447c(objArr, i);
        }

        public boolean contains(Object obj) {
            return this.f31152c.get(obj) != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22452k() {
            return true;
        }

        /* renamed from: l */
        public C6695s0<K> iterator() {
            return mo22475b().iterator();
        }

        public int size() {
            return this.f31152c.size();
        }
    }

    /* renamed from: b7.k0$c */
    /* compiled from: RegularImmutableMap */
    static final class C6666c extends C6685q<Object> {

        /* renamed from: c */
        private final transient Object[] f31154c;

        /* renamed from: d */
        private final transient int f31155d;

        /* renamed from: e */
        private final transient int f31156e;

        C6666c(Object[] objArr, int i, int i2) {
            this.f31154c = objArr;
            this.f31155d = i;
            this.f31156e = i2;
        }

        public Object get(int i) {
            C6431n.m37559l(i, this.f31156e);
            Object obj = this.f31154c[(i * 2) + this.f31155d];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22452k() {
            return true;
        }

        public int size() {
            return this.f31156e;
        }
    }

    private C6662k0(Object obj, Object[] objArr, int i) {
        this.f31144e = obj;
        this.f31145f = objArr;
        this.f31146g = i;
    }

    /* renamed from: m */
    static <K, V> C6662k0<K, V> m38374m(int i, Object[] objArr, C6690r.C6691a<K, V> aVar) {
        if (i == 0) {
            return (C6662k0) f31143h;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C6652h.m38334a(obj, obj2);
            return new C6662k0<>((Object) null, objArr, 1);
        }
        C6431n.m37564q(i, objArr.length >> 1);
        Object n = m38375n(objArr, i, C6694s.m38491o(i), 0);
        if (n instanceof Object[]) {
            Object[] objArr2 = (Object[]) n;
            C6690r.C6691a.C6692a aVar2 = (C6690r.C6691a.C6692a) objArr2[2];
            if (aVar != null) {
                aVar.f31190e = aVar2;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                n = obj3;
                i = intValue;
            } else {
                throw aVar2.mo22574a();
            }
        }
        return new C6662k0<>(n, objArr, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m38375n(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0018
            r0 = r16[r19]
            java.util.Objects.requireNonNull(r0)
            r1 = r19 ^ 1
            r1 = r16[r1]
            java.util.Objects.requireNonNull(r1)
            p190b7.C6652h.m38334a(r0, r1)
            return r2
        L_0x0018:
            int r4 = r1 + -1
            r5 = 128(0x80, float:1.794E-43)
            r6 = 3
            r7 = -1
            r8 = 2
            r9 = 0
            if (r1 > r5) goto L_0x008c
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0029:
            if (r5 >= r0) goto L_0x007b
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            p190b7.C6652h.m38334a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = p190b7.C6671n.m38410a(r13)
        L_0x0049:
            r13 = r13 & r4
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x005f
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x005c
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x005c:
            int r7 = r7 + 1
            goto L_0x0075
        L_0x005f:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0078
            b7.r$a$a r2 = new b7.r$a$a
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0078:
            int r13 = r13 + 1
            goto L_0x0049
        L_0x007b:
            if (r7 != r0) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x008b:
            return r1
        L_0x008c:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto L_0x00fc
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0098:
            if (r5 >= r0) goto L_0x00eb
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            p190b7.C6652h.m38334a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = p190b7.C6671n.m38410a(r13)
        L_0x00b8:
            r13 = r13 & r4
            short r14 = r1[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x00cf
            short r14 = (short) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x00cc
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x00cc:
            int r7 = r7 + 1
            goto L_0x00e5
        L_0x00cf:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00e8
            b7.r$a$a r2 = new b7.r$a$a
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x00e5:
            int r5 = r5 + 1
            goto L_0x0098
        L_0x00e8:
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00eb:
            if (r7 != r0) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x00fb:
            return r1
        L_0x00fc:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r10 = 0
        L_0x0103:
            if (r5 >= r0) goto L_0x0153
            int r11 = r5 * 2
            int r11 = r11 + r19
            int r12 = r10 * 2
            int r12 = r12 + r19
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.util.Objects.requireNonNull(r11)
            p190b7.C6652h.m38334a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = p190b7.C6671n.m38410a(r14)
        L_0x0123:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r7) goto L_0x0135
            r1[r14] = r12
            if (r10 >= r5) goto L_0x0132
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L_0x0132:
            int r10 = r10 + 1
            goto L_0x014b
        L_0x0135:
            r7 = r16[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x014f
            b7.r$a$a r2 = new b7.r$a$a
            r7 = r15 ^ 1
            r12 = r16[r7]
            java.util.Objects.requireNonNull(r12)
            r2.<init>(r13, r11, r12)
            r16[r7] = r11
        L_0x014b:
            int r5 = r5 + 1
            r7 = -1
            goto L_0x0103
        L_0x014f:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x0123
        L_0x0153:
            if (r10 != r0) goto L_0x0156
            goto L_0x0163
        L_0x0156:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x0163:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p190b7.C6662k0.m38375n(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: o */
    static Object m38376o(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a = C6671n.m38410a(obj2.hashCode());
                while (true) {
                    int i3 = a & length;
                    byte b = bArr[i3] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b])) {
                        return objArr[b ^ 1];
                    }
                    a = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a2 = C6671n.m38410a(obj2.hashCode());
                while (true) {
                    int i4 = a2 & length2;
                    short s = sArr[i4] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[s])) {
                        return objArr[s ^ 1];
                    }
                    a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a3 = C6671n.m38410a(obj2.hashCode());
                while (true) {
                    int i5 = a3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    a3 = i5 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6694s<Map.Entry<K, V>> mo22461e() {
        return new C6663a(this, this.f31145f, 0, this.f31146g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6694s<K> mo22462f() {
        return new C6665b(this, new C6666c(this.f31145f, 0, this.f31146g));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C6673o<V> mo22463g() {
        return new C6666c(this.f31145f, 1, this.f31146g);
    }

    public V get(Object obj) {
        V o = m38376o(this.f31144e, this.f31145f, this.f31146g, 0, obj);
        if (o == null) {
            return null;
        }
        return o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo22465i() {
        return false;
    }

    public int size() {
        return this.f31146g;
    }
}
