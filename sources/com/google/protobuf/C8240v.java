package com.google.protobuf;

import com.google.protobuf.C8105b2;
import com.google.protobuf.C8119d0;
import com.google.protobuf.C8148h0;
import com.google.protobuf.C8240v.C8242b;
import com.google.protobuf.C8243v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.v */
/* compiled from: FieldSet */
final class C8240v<T extends C8242b<T>> {

    /* renamed from: d */
    private static final C8240v f35085d = new C8240v(true);

    /* renamed from: a */
    private final C8213q1<T, Object> f35086a;

    /* renamed from: b */
    private boolean f35087b;

    /* renamed from: c */
    private boolean f35088c;

    /* renamed from: com.google.protobuf.v$a */
    /* compiled from: FieldSet */
    static /* synthetic */ class C8241a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35089a;

        /* renamed from: b */
        static final /* synthetic */ int[] f35090b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.C8105b2.C8107b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35090b = r0
                r1 = 1
                com.google.protobuf.b2$b r2 = com.google.protobuf.C8105b2.C8107b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f35090b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r3 = com.google.protobuf.C8105b2.C8107b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f35090b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r4 = com.google.protobuf.C8105b2.C8107b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f35090b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r5 = com.google.protobuf.C8105b2.C8107b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f35090b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r6 = com.google.protobuf.C8105b2.C8107b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f35090b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r7 = com.google.protobuf.C8105b2.C8107b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f35090b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r8 = com.google.protobuf.C8105b2.C8107b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f35090b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r9 = com.google.protobuf.C8105b2.C8107b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f35090b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.C8105b2.C8107b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.b2$c[] r9 = com.google.protobuf.C8105b2.C8112c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f35089a = r9
                com.google.protobuf.b2$c r10 = com.google.protobuf.C8105b2.C8112c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f35089a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.b2$c r9 = com.google.protobuf.C8105b2.C8112c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f35089a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.b2$c r1 = com.google.protobuf.C8105b2.C8112c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f35089a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.C8105b2.C8112c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f35089a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.C8105b2.C8112c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f35089a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.b2$c r1 = com.google.protobuf.C8105b2.C8112c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f35089a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.C8105b2.C8112c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f35089a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.b2$c r1 = com.google.protobuf.C8105b2.C8112c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f35089a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.C8105b2.C8112c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8240v.C8241a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.v$b */
    /* compiled from: FieldSet */
    public interface C8242b<T extends C8242b<T>> extends Comparable<T> {
        /* renamed from: f */
        int mo27311f();

        /* renamed from: g */
        boolean mo27312g();

        /* renamed from: h */
        C8105b2.C8107b mo27313h();

        /* renamed from: i */
        C8243v0.C8244a mo27314i(C8243v0.C8244a aVar, C8243v0 v0Var);

        /* renamed from: l */
        C8105b2.C8112c mo27315l();

        /* renamed from: m */
        boolean mo27316m();
    }

    private C8240v() {
        this.f35086a = C8213q1.m45565r(16);
    }

    /* renamed from: A */
    static void m45650A(C8180l lVar, C8105b2.C8107b bVar, int i, Object obj) throws IOException {
        if (bVar == C8105b2.C8107b.GROUP) {
            lVar.mo27090A0(i, (C8243v0) obj);
            return;
        }
        lVar.mo27112W0(i, m45658m(bVar, false));
        m45651B(lVar, bVar, obj);
    }

    /* renamed from: B */
    static void m45651B(C8180l lVar, C8105b2.C8107b bVar, Object obj) throws IOException {
        switch (C8241a.f35090b[bVar.ordinal()]) {
            case 1:
                lVar.mo27130r0(((Double) obj).doubleValue());
                return;
            case 2:
                lVar.mo27138z0(((Float) obj).floatValue());
                return;
            case 3:
                lVar.mo27097H0(((Long) obj).longValue());
                return;
            case 4:
                lVar.mo27116a1(((Long) obj).longValue());
                return;
            case 5:
                lVar.mo27095F0(((Integer) obj).intValue());
                return;
            case 6:
                lVar.mo27136x0(((Long) obj).longValue());
                return;
            case 7:
                lVar.mo27134v0(((Integer) obj).intValue());
                return;
            case 8:
                lVar.mo27124l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                lVar.mo27092C0((C8243v0) obj);
                return;
            case 10:
                lVar.mo27099J0((C8243v0) obj);
                return;
            case 11:
                if (obj instanceof C8153i) {
                    lVar.mo27128p0((C8153i) obj);
                    return;
                } else {
                    lVar.mo27111V0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C8153i) {
                    lVar.mo27128p0((C8153i) obj);
                    return;
                } else {
                    lVar.mo27125m0((byte[]) obj);
                    return;
                }
            case 13:
                lVar.mo27114Y0(((Integer) obj).intValue());
                return;
            case 14:
                lVar.mo27103N0(((Integer) obj).intValue());
                return;
            case 15:
                lVar.mo27105P0(((Long) obj).longValue());
                return;
            case 16:
                lVar.mo27107R0(((Integer) obj).intValue());
                return;
            case 17:
                lVar.mo27109T0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C8119d0.C8122c) {
                    lVar.mo27132t0(((C8119d0.C8122c) obj).mo26872f());
                    return;
                } else {
                    lVar.mo27132t0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: c */
    private static Object m45652c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    static int m45653d(C8105b2.C8107b bVar, int i, Object obj) {
        int V = C8180l.m45138V(i);
        if (bVar == C8105b2.C8107b.GROUP) {
            V *= 2;
        }
        return V + m45654e(bVar, obj);
    }

    /* renamed from: e */
    static int m45654e(C8105b2.C8107b bVar, Object obj) {
        switch (C8241a.f35090b[bVar.ordinal()]) {
            case 1:
                return C8180l.m45155k(((Double) obj).doubleValue());
            case 2:
                return C8180l.m45163s(((Float) obj).floatValue());
            case 3:
                return C8180l.m45170z(((Long) obj).longValue());
            case 4:
                return C8180l.m45142Z(((Long) obj).longValue());
            case 5:
                return C8180l.m45168x(((Integer) obj).intValue());
            case 6:
                return C8180l.m45161q(((Long) obj).longValue());
            case 7:
                return C8180l.m45159o(((Integer) obj).intValue());
            case 8:
                return C8180l.m45147f(((Boolean) obj).booleanValue());
            case 9:
                return C8180l.m45165u((C8243v0) obj);
            case 10:
                if (obj instanceof C8148h0) {
                    return C8180l.m45119C((C8148h0) obj);
                }
                return C8180l.m45124H((C8243v0) obj);
            case 11:
                if (obj instanceof C8153i) {
                    return C8180l.m45153i((C8153i) obj);
                }
                return C8180l.m45137U((String) obj);
            case 12:
                if (obj instanceof C8153i) {
                    return C8180l.m45153i((C8153i) obj);
                }
                return C8180l.m45149g((byte[]) obj);
            case 13:
                return C8180l.m45140X(((Integer) obj).intValue());
            case 14:
                return C8180l.m45129M(((Integer) obj).intValue());
            case 15:
                return C8180l.m45131O(((Long) obj).longValue());
            case 16:
                return C8180l.m45133Q(((Integer) obj).intValue());
            case 17:
                return C8180l.m45135S(((Long) obj).longValue());
            case 18:
                if (obj instanceof C8119d0.C8122c) {
                    return C8180l.m45157m(((C8119d0.C8122c) obj).mo26872f());
                }
                return C8180l.m45157m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m45655f(C8242b<?> bVar, Object obj) {
        C8105b2.C8107b h = bVar.mo27313h();
        int f = bVar.mo27311f();
        if (!bVar.mo27312g()) {
            return m45653d(h, f, obj);
        }
        int i = 0;
        if (bVar.mo27316m()) {
            for (Object e : (List) obj) {
                i += m45654e(h, e);
            }
            return C8180l.m45138V(f) + i + C8180l.m45140X(i);
        }
        for (Object d : (List) obj) {
            i += m45653d(h, f, d);
        }
        return i;
    }

    /* renamed from: h */
    public static <T extends C8242b<T>> C8240v<T> m45656h() {
        return f35085d;
    }

    /* renamed from: k */
    private int m45657k(Map.Entry<T, Object> entry) {
        C8242b bVar = (C8242b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo27315l() != C8105b2.C8112c.MESSAGE || bVar.mo27312g() || bVar.mo27316m()) {
            return m45655f(bVar, value);
        }
        if (value instanceof C8148h0) {
            return C8180l.m45117A(((C8242b) entry.getKey()).mo27311f(), (C8148h0) value);
        }
        return C8180l.m45121E(((C8242b) entry.getKey()).mo27311f(), (C8243v0) value);
    }

    /* renamed from: m */
    static int m45658m(C8105b2.C8107b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.mo26801b();
    }

    /* renamed from: q */
    private static <T extends C8242b<T>> boolean m45659q(Map.Entry<T, Object> entry) {
        C8242b bVar = (C8242b) entry.getKey();
        if (bVar.mo27315l() != C8105b2.C8112c.MESSAGE) {
            return true;
        }
        if (!bVar.mo27312g()) {
            return m45660r(entry.getValue());
        }
        for (Object r : (List) entry.getValue()) {
            if (!m45660r(r)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private static boolean m45660r(Object obj) {
        if (obj instanceof C8249w0) {
            return ((C8249w0) obj).isInitialized();
        }
        if (obj instanceof C8148h0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: s */
    private static boolean m45661s(C8105b2.C8107b bVar, Object obj) {
        C8119d0.m44649a(obj);
        switch (C8241a.f35089a[bVar.mo26800a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof C8153i) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C8119d0.C8122c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof C8243v0) || (obj instanceof C8148h0)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: w */
    private void m45662w(Map.Entry<T, Object> entry) {
        C8242b bVar = (C8242b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C8148h0) {
            value = ((C8148h0) value).mo26919f();
        }
        if (bVar.mo27312g()) {
            Object i = mo27301i(bVar);
            if (i == null) {
                i = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) i).add(m45652c(c));
            }
            this.f35086a.put(bVar, i);
        } else if (bVar.mo27315l() == C8105b2.C8112c.MESSAGE) {
            Object i2 = mo27301i(bVar);
            if (i2 == null) {
                this.f35086a.put(bVar, m45652c(value));
                return;
            }
            this.f35086a.put(bVar, bVar.mo27314i(((C8243v0) i2).mo27317b(), (C8243v0) value).build());
        } else {
            this.f35086a.put(bVar, m45652c(value));
        }
    }

    /* renamed from: x */
    public static <T extends C8242b<T>> C8240v<T> m45663x() {
        return new C8240v<>();
    }

    /* renamed from: z */
    private void m45664z(T t, Object obj) {
        if (!m45661s(t.mo27313h(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.mo27311f()), t.mo27313h().mo26800a(), obj.getClass().getName()}));
        }
    }

    /* renamed from: a */
    public void mo27295a(T t, Object obj) {
        List list;
        if (t.mo27312g()) {
            m45664z(t, obj);
            Object i = mo27301i(t);
            if (i == null) {
                list = new ArrayList();
                this.f35086a.put(t, list);
            } else {
                list = (List) i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C8240v<T> clone() {
        C8240v<T> x = m45663x();
        for (int i = 0; i < this.f35086a.mo27239l(); i++) {
            Map.Entry<T, Object> k = this.f35086a.mo27238k(i);
            x.mo27310y((C8242b) k.getKey(), k.getValue());
        }
        for (Map.Entry next : this.f35086a.mo27241n()) {
            x.mo27310y((C8242b) next.getKey(), next.getValue());
        }
        x.f35088c = this.f35088c;
        return x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8240v)) {
            return false;
        }
        return this.f35086a.equals(((C8240v) obj).f35086a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> mo27299g() {
        if (this.f35088c) {
            return new C8148h0.C8151c(this.f35086a.mo27237i().iterator());
        }
        return this.f35086a.mo27237i().iterator();
    }

    public int hashCode() {
        return this.f35086a.hashCode();
    }

    /* renamed from: i */
    public Object mo27301i(T t) {
        Object obj = this.f35086a.get(t);
        return obj instanceof C8148h0 ? ((C8148h0) obj).mo26919f() : obj;
    }

    /* renamed from: j */
    public int mo27302j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f35086a.mo27239l(); i2++) {
            i += m45657k(this.f35086a.mo27238k(i2));
        }
        for (Map.Entry<T, Object> k : this.f35086a.mo27241n()) {
            i += m45657k(k);
        }
        return i;
    }

    /* renamed from: l */
    public int mo27303l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f35086a.mo27239l(); i2++) {
            Map.Entry<T, Object> k = this.f35086a.mo27238k(i2);
            i += m45655f((C8242b) k.getKey(), k.getValue());
        }
        for (Map.Entry next : this.f35086a.mo27241n()) {
            i += m45655f((C8242b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo27304n() {
        return this.f35086a.isEmpty();
    }

    /* renamed from: o */
    public boolean mo27305o() {
        return this.f35087b;
    }

    /* renamed from: p */
    public boolean mo27306p() {
        for (int i = 0; i < this.f35086a.mo27239l(); i++) {
            if (!m45659q(this.f35086a.mo27238k(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q : this.f35086a.mo27241n()) {
            if (!m45659q(q)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public Iterator<Map.Entry<T, Object>> mo27307t() {
        if (this.f35088c) {
            return new C8148h0.C8151c(this.f35086a.entrySet().iterator());
        }
        return this.f35086a.entrySet().iterator();
    }

    /* renamed from: u */
    public void mo27308u() {
        if (!this.f35087b) {
            for (int i = 0; i < this.f35086a.mo27239l(); i++) {
                Map.Entry<T, Object> k = this.f35086a.mo27238k(i);
                if (k.getValue() instanceof C8260z) {
                    ((C8260z) k.getValue()).mo27418K();
                }
            }
            this.f35086a.mo27244q();
            this.f35087b = true;
        }
    }

    /* renamed from: v */
    public void mo27309v(C8240v<T> vVar) {
        for (int i = 0; i < vVar.f35086a.mo27239l(); i++) {
            m45662w(vVar.f35086a.mo27238k(i));
        }
        for (Map.Entry<T, Object> w : vVar.f35086a.mo27241n()) {
            m45662w(w);
        }
    }

    /* renamed from: y */
    public void mo27310y(T t, Object obj) {
        if (!t.mo27312g()) {
            m45664z(t, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object z : arrayList) {
                m45664z(t, z);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C8148h0) {
            this.f35088c = true;
        }
        this.f35086a.put(t, obj);
    }

    private C8240v(boolean z) {
        this(C8213q1.m45565r(0));
        mo27308u();
    }

    private C8240v(C8213q1<T, Object> q1Var) {
        this.f35086a = q1Var;
        mo27308u();
    }
}
