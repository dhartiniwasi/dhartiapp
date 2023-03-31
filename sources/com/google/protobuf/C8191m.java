package com.google.protobuf;

import com.google.protobuf.C8116c2;
import com.google.protobuf.C8204o0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.m */
/* compiled from: CodedOutputStreamWriter */
final class C8191m implements C8116c2 {

    /* renamed from: a */
    private final C8180l f35008a;

    /* renamed from: com.google.protobuf.m$a */
    /* compiled from: CodedOutputStreamWriter */
    static /* synthetic */ class C8192a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35009a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.C8105b2.C8107b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35009a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f35009a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8191m.C8192a.<clinit>():void");
        }
    }

    private C8191m(C8180l lVar) {
        C8180l lVar2 = (C8180l) C8119d0.m44650b(lVar, "output");
        this.f35008a = lVar2;
        lVar2.f34994a = this;
    }

    /* renamed from: P */
    public static C8191m m45345P(C8180l lVar) {
        C8191m mVar = lVar.f34994a;
        if (mVar != null) {
            return mVar;
        }
        return new C8191m(lVar);
    }

    /* renamed from: Q */
    private <V> void m45346Q(int i, boolean z, V v, C8204o0.C8205a<Boolean, V> aVar) throws IOException {
        this.f35008a.mo27112W0(i, 2);
        this.f35008a.mo27114Y0(C8204o0.m45469b(aVar, Boolean.valueOf(z), v));
        C8204o0.m45471e(this.f35008a, aVar, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    private <V> void m45347R(int i, C8204o0.C8205a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f35008a.mo27112W0(i, 2);
            this.f35008a.mo27114Y0(C8204o0.m45469b(aVar, Integer.valueOf(i4), v));
            C8204o0.m45471e(this.f35008a, aVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: S */
    private <V> void m45348S(int i, C8204o0.C8205a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f35008a.mo27112W0(i, 2);
            this.f35008a.mo27114Y0(C8204o0.m45469b(aVar, Long.valueOf(j), v));
            C8204o0.m45471e(this.f35008a, aVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: T */
    private <K, V> void m45349T(int i, C8204o0.C8205a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (C8192a.f35009a[aVar.f35034a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    m45346Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    m45346Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m45347R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m45348S(i, aVar, map);
                return;
            case 12:
                m45350U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f35034a);
        }
    }

    /* renamed from: U */
    private <V> void m45350U(int i, C8204o0.C8205a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f35008a.mo27112W0(i, 2);
            this.f35008a.mo27114Y0(C8204o0.m45469b(aVar, str2, v));
            C8204o0.m45471e(this.f35008a, aVar, str2, v);
        }
    }

    /* renamed from: V */
    private void m45351V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f35008a.mo27110U0(i, (String) obj);
        } else {
            this.f35008a.mo27127o0(i, (C8153i) obj);
        }
    }

    /* renamed from: A */
    public void mo26831A(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45159o(list.get(i4).intValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27134v0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27133u0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public void mo26832B(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45147f(list.get(i4).booleanValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27124l0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27123k0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: C */
    public <K, V> void mo26833C(int i, C8204o0.C8205a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f35008a.mo27120e0()) {
            m45349T(i, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f35008a.mo27112W0(i, 2);
            this.f35008a.mo27114Y0(C8204o0.m45469b(aVar, next.getKey(), next.getValue()));
            C8204o0.m45471e(this.f35008a, aVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: D */
    public void mo26834D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45140X(list.get(i4).intValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27114Y0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27113X0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo26835E(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45135S(list.get(i4).longValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27109T0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27108S0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public void mo26836F(int i, long j) throws IOException {
        this.f35008a.mo27108S0(i, j);
    }

    /* renamed from: G */
    public void mo26837G(int i, float f) throws IOException {
        this.f35008a.mo27137y0(i, f);
    }

    @Deprecated
    /* renamed from: H */
    public void mo26838H(int i) throws IOException {
        this.f35008a.mo27112W0(i, 4);
    }

    /* renamed from: I */
    public void mo26839I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45133Q(list.get(i4).intValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27107R0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27106Q0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public void mo26840J(int i, int i2) throws IOException {
        this.f35008a.mo27131s0(i, i2);
    }

    /* renamed from: K */
    public void mo26841K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45170z(list.get(i4).longValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27097H0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27096G0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: L */
    public void mo26842L(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45157m(list.get(i4).intValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27132t0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27131s0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: M */
    public void mo26843M(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45155k(list.get(i4).doubleValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27130r0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27129q0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: N */
    public void mo26844N(int i, int i2) throws IOException {
        this.f35008a.mo27106Q0(i, i2);
    }

    /* renamed from: O */
    public void mo26845O(int i, List<C8153i> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f35008a.mo27127o0(i, list.get(i2));
        }
    }

    /* renamed from: a */
    public void mo26846a(int i, List<?> list, C8202n1 n1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo26855j(i, list.get(i2), n1Var);
        }
    }

    /* renamed from: b */
    public void mo26847b(int i, List<?> list, C8202n1 n1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo26864s(i, list.get(i2), n1Var);
        }
    }

    /* renamed from: c */
    public void mo26848c(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45163s(list.get(i4).floatValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27138z0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27137y0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: d */
    public void mo26849d(int i, int i2) throws IOException {
        this.f35008a.mo27113X0(i, i2);
    }

    /* renamed from: e */
    public final void mo26850e(int i, Object obj) throws IOException {
        if (obj instanceof C8153i) {
            this.f35008a.mo27101L0(i, (C8153i) obj);
        } else {
            this.f35008a.mo27100K0(i, (C8243v0) obj);
        }
    }

    /* renamed from: f */
    public void mo26851f(int i, int i2) throws IOException {
        this.f35008a.mo27133u0(i, i2);
    }

    /* renamed from: g */
    public void mo26852g(int i, double d) throws IOException {
        this.f35008a.mo27129q0(i, d);
    }

    /* renamed from: h */
    public void mo26853h(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45131O(list.get(i4).longValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27105P0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27104O0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo26854i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45142Z(list.get(i4).longValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27116a1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27115Z0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public void mo26855j(int i, Object obj, C8202n1 n1Var) throws IOException {
        this.f35008a.mo27098I0(i, (C8243v0) obj, n1Var);
    }

    /* renamed from: k */
    public void mo26856k(int i, long j) throws IOException {
        this.f35008a.mo27135w0(i, j);
    }

    /* renamed from: l */
    public C8116c2.C8117a mo26857l() {
        return C8116c2.C8117a.ASCENDING;
    }

    /* renamed from: m */
    public void mo26858m(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C8178k0) {
            C8178k0 k0Var = (C8178k0) list;
            while (i2 < list.size()) {
                m45351V(i, k0Var.mo27031q1(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27110U0(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: n */
    public void mo26859n(int i, String str) throws IOException {
        this.f35008a.mo27110U0(i, str);
    }

    /* renamed from: o */
    public void mo26860o(int i, long j) throws IOException {
        this.f35008a.mo27115Z0(i, j);
    }

    /* renamed from: p */
    public void mo26861p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45168x(list.get(i4).intValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27095F0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27094E0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: q */
    public void mo26862q(int i, long j) throws IOException {
        this.f35008a.mo27096G0(i, j);
    }

    /* renamed from: r */
    public void mo26863r(int i, boolean z) throws IOException {
        this.f35008a.mo27123k0(i, z);
    }

    /* renamed from: s */
    public void mo26864s(int i, Object obj, C8202n1 n1Var) throws IOException {
        this.f35008a.mo27091B0(i, (C8243v0) obj, n1Var);
    }

    /* renamed from: t */
    public void mo26865t(int i, int i2) throws IOException {
        this.f35008a.mo27102M0(i, i2);
    }

    @Deprecated
    /* renamed from: u */
    public void mo26866u(int i) throws IOException {
        this.f35008a.mo27112W0(i, 3);
    }

    /* renamed from: v */
    public void mo26867v(int i, C8153i iVar) throws IOException {
        this.f35008a.mo27127o0(i, iVar);
    }

    /* renamed from: w */
    public void mo26868w(int i, int i2) throws IOException {
        this.f35008a.mo27094E0(i, i2);
    }

    /* renamed from: x */
    public void mo26869x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45161q(list.get(i4).longValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27136x0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27135w0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: y */
    public void mo26870y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f35008a.mo27112W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8180l.m45129M(list.get(i4).intValue());
            }
            this.f35008a.mo27114Y0(i3);
            while (i2 < list.size()) {
                this.f35008a.mo27103N0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35008a.mo27102M0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: z */
    public void mo26871z(int i, long j) throws IOException {
        this.f35008a.mo27104O0(i, j);
    }
}
