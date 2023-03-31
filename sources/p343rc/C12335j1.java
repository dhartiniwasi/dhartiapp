package p343rc;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p182a7.C6415d;
import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;
import p182a7.C6445u;
import p343rc.C12411y0;

/* renamed from: rc.j1 */
/* compiled from: Status */
public final class C12335j1 {

    /* renamed from: d */
    private static final boolean f45604d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final List<C12335j1> f45605e = m59100f();

    /* renamed from: f */
    public static final C12335j1 f45606f = C12337b.OK.mo37032b();

    /* renamed from: g */
    public static final C12335j1 f45607g = C12337b.CANCELLED.mo37032b();

    /* renamed from: h */
    public static final C12335j1 f45608h = C12337b.UNKNOWN.mo37032b();

    /* renamed from: i */
    public static final C12335j1 f45609i = C12337b.INVALID_ARGUMENT.mo37032b();

    /* renamed from: j */
    public static final C12335j1 f45610j = C12337b.DEADLINE_EXCEEDED.mo37032b();

    /* renamed from: k */
    public static final C12335j1 f45611k = C12337b.NOT_FOUND.mo37032b();

    /* renamed from: l */
    public static final C12335j1 f45612l = C12337b.ALREADY_EXISTS.mo37032b();

    /* renamed from: m */
    public static final C12335j1 f45613m = C12337b.PERMISSION_DENIED.mo37032b();

    /* renamed from: n */
    public static final C12335j1 f45614n = C12337b.UNAUTHENTICATED.mo37032b();

    /* renamed from: o */
    public static final C12335j1 f45615o = C12337b.RESOURCE_EXHAUSTED.mo37032b();

    /* renamed from: p */
    public static final C12335j1 f45616p = C12337b.FAILED_PRECONDITION.mo37032b();

    /* renamed from: q */
    public static final C12335j1 f45617q = C12337b.ABORTED.mo37032b();

    /* renamed from: r */
    public static final C12335j1 f45618r = C12337b.OUT_OF_RANGE.mo37032b();

    /* renamed from: s */
    public static final C12335j1 f45619s = C12337b.UNIMPLEMENTED.mo37032b();

    /* renamed from: t */
    public static final C12335j1 f45620t = C12337b.INTERNAL.mo37032b();

    /* renamed from: u */
    public static final C12335j1 f45621u = C12337b.UNAVAILABLE.mo37032b();

    /* renamed from: v */
    public static final C12335j1 f45622v = C12337b.DATA_LOSS.mo37032b();

    /* renamed from: w */
    static final C12411y0.C12418g<C12335j1> f45623w = C12411y0.C12418g.m59363g("grpc-status", false, new C12338c());

    /* renamed from: x */
    private static final C12411y0.C12421j<String> f45624x;

    /* renamed from: y */
    static final C12411y0.C12418g<String> f45625y;

    /* renamed from: a */
    private final C12337b f45626a;

    /* renamed from: b */
    private final String f45627b;

    /* renamed from: c */
    private final Throwable f45628c;

    /* renamed from: rc.j1$b */
    /* compiled from: Status */
    public enum C12337b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: a */
        private final int f45647a;

        /* renamed from: b */
        private final byte[] f45648b;

        private C12337b(int i) {
            this.f45647a = i;
            this.f45648b = Integer.toString(i).getBytes(C6415d.f30662a);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public byte[] m59116j() {
            return this.f45648b;
        }

        /* renamed from: b */
        public C12335j1 mo37032b() {
            return (C12335j1) C12335j1.f45605e.get(this.f45647a);
        }

        /* renamed from: c */
        public int mo37033c() {
            return this.f45647a;
        }
    }

    /* renamed from: rc.j1$c */
    /* compiled from: Status */
    private static final class C12338c implements C12411y0.C12421j<C12335j1> {
        private C12338c() {
        }

        /* renamed from: c */
        public C12335j1 mo35306b(byte[] bArr) {
            return C12335j1.m59103i(bArr);
        }

        /* renamed from: d */
        public byte[] mo35305a(C12335j1 j1Var) {
            return j1Var.mo37026m().m59116j();
        }
    }

    /* renamed from: rc.j1$d */
    /* compiled from: Status */
    private static final class C12339d implements C12411y0.C12421j<String> {

        /* renamed from: a */
        private static final byte[] f45649a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private C12339d() {
        }

        /* renamed from: c */
        private static boolean m59123c(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        /* renamed from: e */
        private static String m59124e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == 37 && i + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, C6415d.f30662a), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i]);
                i++;
            }
            return new String(allocate.array(), 0, allocate.position(), C6415d.f30664c);
        }

        /* renamed from: g */
        private static byte[] m59125g(byte[] bArr, int i) {
            byte[] bArr2 = new byte[(((bArr.length - i) * 3) + i)];
            if (i != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            int i2 = i;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (m59123c(b)) {
                    bArr2[i2] = 37;
                    byte[] bArr3 = f45649a;
                    bArr2[i2 + 1] = bArr3[(b >> 4) & 15];
                    bArr2[i2 + 2] = bArr3[b & 15];
                    i2 += 3;
                } else {
                    bArr2[i2] = b;
                    i2++;
                }
                i++;
            }
            return Arrays.copyOf(bArr2, i2);
        }

        /* renamed from: d */
        public String mo35306b(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    return m59124e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        /* renamed from: f */
        public byte[] mo35305a(String str) {
            byte[] bytes = str.getBytes(C6415d.f30664c);
            for (int i = 0; i < bytes.length; i++) {
                if (m59123c(bytes[i])) {
                    return m59125g(bytes, i);
                }
            }
            return bytes;
        }
    }

    static {
        C12339d dVar = new C12339d();
        f45624x = dVar;
        f45625y = C12411y0.C12418g.m59363g("grpc-message", false, dVar);
    }

    private C12335j1(C12337b bVar) {
        this(bVar, (String) null, (Throwable) null);
    }

    /* renamed from: f */
    private static List<C12335j1> m59100f() {
        TreeMap treeMap = new TreeMap();
        C12337b[] values = C12337b.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            C12337b bVar = values[i];
            C12335j1 j1Var = (C12335j1) treeMap.put(Integer.valueOf(bVar.mo37033c()), new C12335j1(bVar));
            if (j1Var == null) {
                i++;
            } else {
                throw new IllegalStateException("Code value duplication between " + j1Var.mo37026m().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* renamed from: g */
    static String m59101g(C12335j1 j1Var) {
        if (j1Var.f45627b == null) {
            return j1Var.f45626a.toString();
        }
        return j1Var.f45626a + ": " + j1Var.f45627b;
    }

    /* renamed from: h */
    public static C12335j1 m59102h(int i) {
        if (i >= 0) {
            List<C12335j1> list = f45605e;
            if (i <= list.size()) {
                return list.get(i);
            }
        }
        C12335j1 j1Var = f45608h;
        return j1Var.mo37030q("Unknown code " + i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static C12335j1 m59103i(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f45606f;
        }
        return m59104j(bArr);
    }

    /* renamed from: j */
    private static C12335j1 m59104j(byte[] bArr) {
        int length = bArr.length;
        char c = 1;
        int i = 0;
        if (length != 1) {
            if (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) {
                i = 0 + ((bArr[0] - 48) * 10);
            }
            C12335j1 j1Var = f45608h;
            return j1Var.mo37030q("Unknown code " + new String(bArr, C6415d.f30662a));
        }
        c = 0;
        if (bArr[c] >= 48 && bArr[c] <= 57) {
            int i2 = i + (bArr[c] - 48);
            List<C12335j1> list = f45605e;
            if (i2 < list.size()) {
                return list.get(i2);
            }
        }
        C12335j1 j1Var2 = f45608h;
        return j1Var2.mo37030q("Unknown code " + new String(bArr, C6415d.f30662a));
    }

    /* renamed from: k */
    public static C12335j1 m59105k(Throwable th) {
        for (Throwable th2 = (Throwable) C6431n.m37562o(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof C12345k1) {
                return ((C12345k1) th2).mo37047a();
            }
            if (th2 instanceof C12350l1) {
                return ((C12350l1) th2).mo37053a();
            }
        }
        return f45608h.mo37029p(th);
    }

    /* renamed from: c */
    public C12345k1 mo37020c() {
        return new C12345k1(this);
    }

    /* renamed from: d */
    public C12350l1 mo37021d() {
        return new C12350l1(this);
    }

    /* renamed from: e */
    public C12335j1 mo37022e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f45627b == null) {
            return new C12335j1(this.f45626a, str, this.f45628c);
        }
        C12337b bVar = this.f45626a;
        return new C12335j1(bVar, this.f45627b + "\n" + str, this.f45628c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l */
    public Throwable mo37025l() {
        return this.f45628c;
    }

    /* renamed from: m */
    public C12337b mo37026m() {
        return this.f45626a;
    }

    /* renamed from: n */
    public String mo37027n() {
        return this.f45627b;
    }

    /* renamed from: o */
    public boolean mo37028o() {
        return C12337b.OK == this.f45626a;
    }

    /* renamed from: p */
    public C12335j1 mo37029p(Throwable th) {
        if (C6425j.m37541a(this.f45628c, th)) {
            return this;
        }
        return new C12335j1(this.f45626a, this.f45627b, th);
    }

    /* renamed from: q */
    public C12335j1 mo37030q(String str) {
        if (C6425j.m37541a(this.f45627b, str)) {
            return this;
        }
        return new C12335j1(this.f45626a, str, this.f45628c);
    }

    public String toString() {
        C6419h.C6421b d = C6419h.m37528c(this).mo21842d("code", this.f45626a.name()).mo21842d("description", this.f45627b);
        Throwable th = this.f45628c;
        Object obj = th;
        if (th != null) {
            obj = C6445u.m37607e(th);
        }
        return d.mo21842d("cause", obj).toString();
    }

    private C12335j1(C12337b bVar, String str, Throwable th) {
        this.f45626a = (C12337b) C6431n.m37562o(bVar, "code");
        this.f45627b = str;
        this.f45628c = th;
    }
}
