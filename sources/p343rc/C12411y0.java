package p343rc;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6415d;
import p182a7.C6431n;
import p199c7.C6765a;
import p199c7.C6771b;

/* renamed from: rc.y0 */
/* compiled from: Metadata */
public final class C12411y0 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Logger f45759c = Logger.getLogger(C12411y0.class.getName());

    /* renamed from: d */
    public static final C12416e<byte[]> f45760d = new C12412a();

    /* renamed from: e */
    public static final C12415d<String> f45761e = new C12413b();

    /* renamed from: f */
    static final C6765a f45762f = C6765a.m38680a().mo22695k();

    /* renamed from: a */
    private Object[] f45763a;

    /* renamed from: b */
    private int f45764b;

    /* renamed from: rc.y0$a */
    /* compiled from: Metadata */
    class C12412a implements C12416e<byte[]> {
        C12412a() {
        }
    }

    /* renamed from: rc.y0$b */
    /* compiled from: Metadata */
    class C12413b implements C12415d<String> {
        C12413b() {
        }

        /* renamed from: c */
        public String mo35312b(String str) {
            return str;
        }

        /* renamed from: d */
        public String mo35311a(String str) {
            return str;
        }
    }

    /* renamed from: rc.y0$c */
    /* compiled from: Metadata */
    private static class C12414c<T> extends C12418g<T> {

        /* renamed from: f */
        private final C12415d<T> f45765f;

        /* synthetic */ C12414c(String str, boolean z, C12415d dVar, C12412a aVar) {
            this(str, z, dVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public T mo37175h(byte[] bArr) {
            return this.f45765f.mo35312b(new String(bArr, C6415d.f30662a));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public byte[] mo37176j(T t) {
            return this.f45765f.mo35311a(t).getBytes(C6415d.f30662a);
        }

        private C12414c(String str, boolean z, C12415d<T> dVar) {
            super(str, z, dVar, (C12412a) null);
            C6431n.m37558k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f45765f = (C12415d) C6431n.m37562o(dVar, "marshaller");
        }
    }

    /* renamed from: rc.y0$d */
    /* compiled from: Metadata */
    public interface C12415d<T> {
        /* renamed from: a */
        String mo35311a(T t);

        /* renamed from: b */
        T mo35312b(String str);
    }

    /* renamed from: rc.y0$e */
    /* compiled from: Metadata */
    public interface C12416e<T> {
    }

    /* renamed from: rc.y0$f */
    /* compiled from: Metadata */
    public interface C12417f<T> {
        /* renamed from: a */
        InputStream mo37177a(T t);

        /* renamed from: b */
        T mo37178b(InputStream inputStream);
    }

    /* renamed from: rc.y0$g */
    /* compiled from: Metadata */
    public static abstract class C12418g<T> {

        /* renamed from: e */
        private static final BitSet f45766e = m59360b();

        /* renamed from: a */
        private final String f45767a;

        /* renamed from: b */
        private final String f45768b;

        /* renamed from: c */
        private final byte[] f45769c;

        /* renamed from: d */
        private final Object f45770d;

        /* synthetic */ C12418g(String str, boolean z, Object obj, C12412a aVar) {
            this(str, z, obj);
        }

        /* renamed from: b */
        private static BitSet m59360b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        /* renamed from: e */
        public static <T> C12418g<T> m59361e(String str, C12415d<T> dVar) {
            return m59362f(str, false, dVar);
        }

        /* renamed from: f */
        static <T> C12418g<T> m59362f(String str, boolean z, C12415d<T> dVar) {
            return new C12414c(str, z, dVar, (C12412a) null);
        }

        /* renamed from: g */
        static <T> C12418g<T> m59363g(String str, boolean z, C12421j<T> jVar) {
            return new C12420i(str, z, jVar, (C12412a) null);
        }

        /* renamed from: k */
        private static String m59364k(String str, boolean z) {
            C6431n.m37562o(str, MediationMetaData.KEY_NAME);
            C6431n.m37552e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                C12411y0.f45759c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!z || charAt != ':' || i != 0) {
                    C6431n.m37554g(f45766e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] mo37179a() {
            return this.f45769c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final <M> M mo37180c(Class<M> cls) {
            if (cls.isInstance(this.f45770d)) {
                return cls.cast(this.f45770d);
            }
            return null;
        }

        /* renamed from: d */
        public final String mo37181d() {
            return this.f45768b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f45768b.equals(((C12418g) obj).f45768b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract T mo37175h(byte[] bArr);

        public final int hashCode() {
            return this.f45768b.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo37184i() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract byte[] mo37176j(T t);

        public String toString() {
            return "Key{name='" + this.f45768b + "'}";
        }

        private C12418g(String str, boolean z, Object obj) {
            String str2 = (String) C6431n.m37562o(str, MediationMetaData.KEY_NAME);
            this.f45767a = str2;
            String k = m59364k(str2.toLowerCase(Locale.ROOT), z);
            this.f45768b = k;
            this.f45769c = k.getBytes(C6415d.f30662a);
            this.f45770d = obj;
        }
    }

    /* renamed from: rc.y0$h */
    /* compiled from: Metadata */
    static final class C12419h<T> {

        /* renamed from: a */
        private final C12417f<T> f45771a;

        /* renamed from: b */
        private final T f45772b;

        /* renamed from: c */
        private volatile byte[] f45773c;

        C12419h(C12417f<T> fVar, T t) {
            this.f45771a = fVar;
            this.f45772b = t;
        }

        /* renamed from: a */
        static <T> C12419h<T> m59371a(C12418g<T> gVar, T t) {
            return new C12419h<>((C12417f) C6431n.m37561n(m59372b(gVar)), t);
        }

        /* renamed from: b */
        private static <T> C12417f<T> m59372b(C12418g<T> gVar) {
            return (C12417f) gVar.mo37180c(C12417f.class);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public byte[] mo37186c() {
            if (this.f45773c == null) {
                synchronized (this) {
                    if (this.f45773c == null) {
                        this.f45773c = C12411y0.m59337r(mo37188e());
                    }
                }
            }
            return this.f45773c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T2> T2 mo37187d(C12418g<T2> gVar) {
            C12417f<T2> b;
            if (!gVar.mo37184i() || (b = m59372b(gVar)) == null) {
                return gVar.mo37175h(mo37186c());
            }
            return b.mo37178b(mo37188e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public InputStream mo37188e() {
            return this.f45771a.mo37177a(this.f45772b);
        }
    }

    /* renamed from: rc.y0$i */
    /* compiled from: Metadata */
    private static final class C12420i<T> extends C12418g<T> {

        /* renamed from: f */
        private final C12421j<T> f45774f;

        /* synthetic */ C12420i(String str, boolean z, C12421j jVar, C12412a aVar) {
            this(str, z, jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public T mo37175h(byte[] bArr) {
            return this.f45774f.mo35306b(bArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public byte[] mo37176j(T t) {
            return this.f45774f.mo35305a(t);
        }

        private C12420i(String str, boolean z, C12421j<T> jVar) {
            super(str, z, jVar, (C12412a) null);
            C6431n.m37558k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f45774f = (C12421j) C6431n.m37562o(jVar, "marshaller");
        }
    }

    /* renamed from: rc.y0$j */
    /* compiled from: Metadata */
    interface C12421j<T> {
        /* renamed from: a */
        byte[] mo35305a(T t);

        /* renamed from: b */
        T mo35306b(byte[] bArr);
    }

    C12411y0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* renamed from: c */
    private boolean m59329c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: d */
    private int m59330d() {
        Object[] objArr = this.f45763a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: f */
    private void m59331f(int i) {
        Object[] objArr = new Object[i];
        if (!m59332i()) {
            System.arraycopy(this.f45763a, 0, objArr, 0, m59333k());
        }
        this.f45763a = objArr;
    }

    /* renamed from: i */
    private boolean m59332i() {
        return this.f45764b == 0;
    }

    /* renamed from: k */
    private int m59333k() {
        return this.f45764b * 2;
    }

    /* renamed from: l */
    private void m59334l() {
        if (m59333k() == 0 || m59333k() == m59330d()) {
            m59331f(Math.max(m59333k() * 2, 8));
        }
    }

    /* renamed from: n */
    private void m59335n(int i, byte[] bArr) {
        this.f45763a[i * 2] = bArr;
    }

    /* renamed from: o */
    private byte[] m59336o(int i) {
        return (byte[]) this.f45763a[i * 2];
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static byte[] m59337r(InputStream inputStream) {
        try {
            return C6771b.m38714d(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    /* renamed from: s */
    private Object m59338s(int i) {
        return this.f45763a[(i * 2) + 1];
    }

    /* renamed from: t */
    private void m59339t(int i, Object obj) {
        if (this.f45763a instanceof byte[][]) {
            m59331f(m59330d());
        }
        this.f45763a[(i * 2) + 1] = obj;
    }

    /* renamed from: u */
    private void m59340u(int i, byte[] bArr) {
        this.f45763a[(i * 2) + 1] = bArr;
    }

    /* renamed from: v */
    private byte[] m59341v(int i) {
        Object s = m59338s(i);
        if (s instanceof byte[]) {
            return (byte[]) s;
        }
        return ((C12419h) s).mo37186c();
    }

    /* renamed from: w */
    private <T> T m59342w(int i, C12418g<T> gVar) {
        Object s = m59338s(i);
        if (s instanceof byte[]) {
            return gVar.mo37175h((byte[]) s);
        }
        return ((C12419h) s).mo37187d(gVar);
    }

    /* renamed from: e */
    public <T> void mo37165e(C12418g<T> gVar) {
        if (!m59332i()) {
            int i = 0;
            for (int i2 = 0; i2 < this.f45764b; i2++) {
                if (!m59329c(gVar.mo37179a(), m59336o(i2))) {
                    m59335n(i, m59336o(i2));
                    m59339t(i, m59338s(i2));
                    i++;
                }
            }
            Arrays.fill(this.f45763a, i * 2, m59333k(), (Object) null);
            this.f45764b = i;
        }
    }

    /* renamed from: g */
    public <T> T mo37166g(C12418g<T> gVar) {
        for (int i = this.f45764b - 1; i >= 0; i--) {
            if (m59329c(gVar.mo37179a(), m59336o(i))) {
                return m59342w(i, gVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo37167h() {
        return this.f45764b;
    }

    /* renamed from: j */
    public Set<String> mo37168j() {
        if (m59332i()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f45764b);
        for (int i = 0; i < this.f45764b; i++) {
            hashSet.add(new String(m59336o(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: m */
    public void mo37169m(C12411y0 y0Var) {
        if (!y0Var.m59332i()) {
            int d = m59330d() - m59333k();
            if (m59332i() || d < y0Var.m59333k()) {
                m59331f(m59333k() + y0Var.m59333k());
            }
            System.arraycopy(y0Var.f45763a, 0, this.f45763a, m59333k(), y0Var.m59333k());
            this.f45764b += y0Var.f45764b;
        }
    }

    /* renamed from: p */
    public <T> void mo37170p(C12418g<T> gVar, T t) {
        C6431n.m37562o(gVar, "key");
        C6431n.m37562o(t, "value");
        m59334l();
        m59335n(this.f45764b, gVar.mo37179a());
        if (gVar.mo37184i()) {
            m59339t(this.f45764b, C12419h.m59371a(gVar, t));
        } else {
            m59340u(this.f45764b, gVar.mo37176j(t));
        }
        this.f45764b++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public byte[][] mo37171q() {
        byte[][] bArr = new byte[m59333k()][];
        Object[] objArr = this.f45763a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m59333k());
        } else {
            for (int i = 0; i < this.f45764b; i++) {
                int i2 = i * 2;
                bArr[i2] = m59336o(i);
                bArr[i2 + 1] = m59341v(i);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f45764b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] o = m59336o(i);
            Charset charset = C6415d.f30662a;
            String str = new String(o, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f45762f.mo22690e(m59341v(i)));
            } else {
                sb.append(new String(m59341v(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    C12411y0(int i, byte[]... bArr) {
        this(i, (Object[]) bArr);
    }

    C12411y0(int i, Object[] objArr) {
        this.f45764b = i;
        this.f45763a = objArr;
    }

    public C12411y0() {
    }
}
