package androidx.work;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p170y0.C6094j;

/* renamed from: androidx.work.b */
/* compiled from: Data */
public final class C1536b {

    /* renamed from: b */
    private static final String f4422b = C6094j.m35719f("Data");

    /* renamed from: c */
    public static final C1536b f4423c = new C1537a().mo6309a();

    /* renamed from: a */
    Map<String, Object> f4424a;

    /* renamed from: androidx.work.b$a */
    /* compiled from: Data */
    public static final class C1537a {

        /* renamed from: a */
        private Map<String, Object> f4425a = new HashMap();

        /* renamed from: a */
        public C1536b mo6309a() {
            C1536b bVar = new C1536b((Map<String, ?>) this.f4425a);
            C1536b.m7128n(bVar);
            return bVar;
        }

        /* renamed from: b */
        public C1537a mo6310b(String str, Object obj) {
            if (obj == null) {
                this.f4425a.put(str, (Object) null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f4425a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f4425a.put(str, C1536b.m7121a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f4425a.put(str, C1536b.m7122b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f4425a.put(str, C1536b.m7125e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f4425a.put(str, C1536b.m7126f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f4425a.put(str, C1536b.m7124d((float[]) obj));
                } else if (cls == double[].class) {
                    this.f4425a.put(str, C1536b.m7123c((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }

        /* renamed from: c */
        public C1537a mo6311c(C1536b bVar) {
            mo6312d(bVar.f4424a);
            return this;
        }

        /* renamed from: d */
        public C1537a mo6312d(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                mo6310b((String) next.getKey(), next.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public C1537a mo6313e(String str, boolean z) {
            this.f4425a.put(str, Boolean.valueOf(z));
            return this;
        }

        /* renamed from: f */
        public C1537a mo6314f(String str, int i) {
            this.f4425a.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: g */
        public C1537a mo6315g(String str, long j) {
            this.f4425a.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: h */
        public C1537a mo6316h(String str, String str2) {
            this.f4425a.put(str, str2);
            return this;
        }
    }

    C1536b() {
    }

    /* renamed from: a */
    public static Boolean[] m7121a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m7122b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m7123c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m7124d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m7125e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m7126f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC, Splitter:B:36:0x006b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0035=Splitter:B:14:0x0035, B:28:0x0058=Splitter:B:28:0x0058} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1536b m7127g(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x0080
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = f4422b
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x0039:
            r7 = move-exception
            goto L_0x0047
        L_0x003b:
            r7 = move-exception
            goto L_0x0047
        L_0x003d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L_0x0069
        L_0x0041:
            r3 = move-exception
            goto L_0x0044
        L_0x0043:
            r3 = move-exception
        L_0x0044:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0047:
            java.lang.String r4 = f4422b     // Catch:{ all -> 0x0068 }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r7 = move-exception
            java.lang.String r3 = f4422b
            android.util.Log.e(r3, r0, r7)
        L_0x0058:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r7 = move-exception
            java.lang.String r2 = f4422b
            android.util.Log.e(r2, r0, r7)
        L_0x0062:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>((java.util.Map<java.lang.String, ?>) r1)
            return r7
        L_0x0068:
            r7 = move-exception
        L_0x0069:
            if (r3 == 0) goto L_0x0075
            r3.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0075
        L_0x006f:
            r1 = move-exception
            java.lang.String r3 = f4422b
            android.util.Log.e(r3, r0, r1)
        L_0x0075:
            r2.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x007f
        L_0x0079:
            r1 = move-exception
            java.lang.String r2 = f4422b
            android.util.Log.e(r2, r0, r1)
        L_0x007f:
            throw r7
        L_0x0080:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1536b.m7127g(byte[]):androidx.work.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[SYNTHETIC, Splitter:B:31:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[SYNTHETIC, Splitter:B:41:0x008f] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m7128n(androidx.work.C1536b r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006c }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006c }
            int r2 = r5.mo6307m()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f4424a     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
        L_0x001e:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            goto L_0x001e
        L_0x003b:
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0045
        L_0x003f:
            r5 = move-exception
            java.lang.String r2 = f4422b
            android.util.Log.e(r2, r0, r5)
        L_0x0045:
            r1.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r5 = move-exception
            java.lang.String r2 = f4422b
            android.util.Log.e(r2, r0, r5)
        L_0x004f:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005c
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0064:
            r5 = move-exception
            r2 = r3
            goto L_0x008d
        L_0x0067:
            r5 = move-exception
            r2 = r3
            goto L_0x006d
        L_0x006a:
            r5 = move-exception
            goto L_0x008d
        L_0x006c:
            r5 = move-exception
        L_0x006d:
            java.lang.String r3 = f4422b     // Catch:{ all -> 0x006a }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006a }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0082
        L_0x007c:
            r2 = move-exception
            java.lang.String r3 = f4422b
            android.util.Log.e(r3, r0, r2)
        L_0x0082:
            r1.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            r1 = move-exception
            java.lang.String r2 = f4422b
            android.util.Log.e(r2, r0, r1)
        L_0x008c:
            return r5
        L_0x008d:
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0099
        L_0x0093:
            r2 = move-exception
            java.lang.String r3 = f4422b
            android.util.Log.e(r3, r0, r2)
        L_0x0099:
            r1.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a3
        L_0x009d:
            r1 = move-exception
            java.lang.String r2 = f4422b
            android.util.Log.e(r2, r0, r1)
        L_0x00a3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1536b.m7128n(androidx.work.b):byte[]");
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1536b.class != obj.getClass()) {
            return false;
        }
        C1536b bVar = (C1536b) obj;
        Set<String> keySet = this.f4424a.keySet();
        if (!keySet.equals(bVar.f4424a.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.f4424a.get(next);
            Object obj3 = bVar.f4424a.get(next);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo6301h(String str, boolean z) {
        Object obj = this.f4424a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public int hashCode() {
        return this.f4424a.hashCode() * 31;
    }

    /* renamed from: i */
    public int mo6303i(String str, int i) {
        Object obj = this.f4424a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    /* renamed from: j */
    public Map<String, Object> mo6304j() {
        return Collections.unmodifiableMap(this.f4424a);
    }

    /* renamed from: k */
    public long mo6305k(String str, long j) {
        Object obj = this.f4424a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    /* renamed from: l */
    public String mo6306l(String str) {
        Object obj = this.f4424a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: m */
    public int mo6307m() {
        return this.f4424a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f4424a.isEmpty()) {
            for (String next : this.f4424a.keySet()) {
                sb.append(next);
                sb.append(" : ");
                Object obj = this.f4424a.get(next);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C1536b(C1536b bVar) {
        this.f4424a = new HashMap(bVar.f4424a);
    }

    public C1536b(Map<String, ?> map) {
        this.f4424a = new HashMap(map);
    }
}
