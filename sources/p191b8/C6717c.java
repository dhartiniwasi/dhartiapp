package p191b8;

import com.google.protobuf.C8234t1;
import java.util.Map;
import p200c9.C6838a;
import p211d8.C9903u;
import p211d8.C9907y;
import p405y8.C13085b;
import p405y8.C13088b0;
import p405y8.C13161s;

/* renamed from: b8.c */
/* compiled from: FirestoreIndexValueWriter */
public class C6717c {

    /* renamed from: a */
    public static final C6717c f31213a = new C6717c();

    /* renamed from: b8.c$a */
    /* compiled from: FirestoreIndexValueWriter */
    static /* synthetic */ class C6718a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31214a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                y8.b0$c[] r0 = p405y8.C13088b0.C13091c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31214a = r0
                y8.b0$c r1 = p405y8.C13088b0.C13091c.NULL_VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x001d }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.BOOLEAN_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.DOUBLE_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x0033 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.INTEGER_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x003e }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.TIMESTAMP_VALUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x0049 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.STRING_VALUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x0054 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.BYTES_VALUE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x0060 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.REFERENCE_VALUE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x006c }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.GEO_POINT_VALUE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x0078 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.MAP_VALUE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f31214a     // Catch:{ NoSuchFieldError -> 0x0084 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.ARRAY_VALUE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p191b8.C6717c.C6718a.<clinit>():void");
        }
    }

    private C6717c() {
    }

    /* renamed from: a */
    private void m38571a(C13085b bVar, C6716b bVar2) {
        m38578i(bVar2, 50);
        for (C13088b0 f : bVar.mo38104g()) {
            m38575f(f, bVar2);
        }
    }

    /* renamed from: b */
    private void m38572b(String str, C6716b bVar) {
        m38578i(bVar, 37);
        C9903u w = C9903u.m50784w(str);
        int r = w.mo32358r();
        for (int i = 5; i < r; i++) {
            String o = w.mo32355o(i);
            m38578i(bVar, 60);
            m38577h(o, bVar);
        }
    }

    /* renamed from: c */
    private void m38573c(C13161s sVar, C6716b bVar) {
        m38578i(bVar, 55);
        for (Map.Entry next : sVar.mo38227e0().entrySet()) {
            m38574d((String) next.getKey(), bVar);
            m38575f((C13088b0) next.getValue(), bVar);
        }
    }

    /* renamed from: d */
    private void m38574d(String str, C6716b bVar) {
        m38578i(bVar, 25);
        m38577h(str, bVar);
    }

    /* renamed from: f */
    private void m38575f(C13088b0 b0Var, C6716b bVar) {
        switch (C6718a.f31214a[b0Var.mo38122x0().ordinal()]) {
            case 1:
                m38578i(bVar, 5);
                return;
            case 2:
                m38578i(bVar, 10);
                bVar.mo22620d(b0Var.mo38113n0() ? 1 : 0);
                return;
            case 3:
                double q0 = b0Var.mo38115q0();
                if (Double.isNaN(q0)) {
                    m38578i(bVar, 13);
                    return;
                }
                m38578i(bVar, 15);
                if (q0 == -0.0d) {
                    bVar.mo22618b(0.0d);
                    return;
                } else {
                    bVar.mo22618b(q0);
                    return;
                }
            case 4:
                m38578i(bVar, 15);
                bVar.mo22618b((double) b0Var.mo38117s0());
                return;
            case 5:
                C8234t1 w0 = b0Var.mo38121w0();
                m38578i(bVar, 20);
                bVar.mo22620d(w0.mo27291f0());
                bVar.mo22620d((long) w0.mo27290e0());
                return;
            case 6:
                m38574d(b0Var.mo38120v0(), bVar);
                m38576g(bVar);
                return;
            case 7:
                m38578i(bVar, 30);
                bVar.mo22617a(b0Var.mo38114o0());
                m38576g(bVar);
                return;
            case 8:
                m38572b(b0Var.mo38119u0(), bVar);
                return;
            case 9:
                C6838a r0 = b0Var.mo38116r0();
                m38578i(bVar, 45);
                bVar.mo22618b(r0.mo22936e0());
                bVar.mo22618b(r0.mo22937f0());
                return;
            case 10:
                if (C9907y.m50829x(b0Var)) {
                    m38578i(bVar, Integer.MAX_VALUE);
                    return;
                }
                m38573c(b0Var.mo38118t0(), bVar);
                m38576g(bVar);
                return;
            case 11:
                m38571a(b0Var.mo38112m0(), bVar);
                m38576g(bVar);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + b0Var.mo38122x0());
        }
    }

    /* renamed from: g */
    private void m38576g(C6716b bVar) {
        bVar.mo22620d(2);
    }

    /* renamed from: h */
    private void m38577h(String str, C6716b bVar) {
        bVar.mo22621e(str);
    }

    /* renamed from: i */
    private void m38578i(C6716b bVar, int i) {
        bVar.mo22620d((long) i);
    }

    /* renamed from: e */
    public void mo22622e(C13088b0 b0Var, C6716b bVar) {
        m38575f(b0Var, bVar);
        bVar.mo22619c();
    }
}
