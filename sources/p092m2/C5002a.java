package p092m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p161w3.C5918a0;

/* renamed from: m2.a */
/* compiled from: Atom */
abstract class C5002a {

    /* renamed from: a */
    public final int f26200a;

    /* renamed from: m2.a$a */
    /* compiled from: Atom */
    static final class C5003a extends C5002a {

        /* renamed from: b */
        public final long f26201b;

        /* renamed from: c */
        public final List<C5004b> f26202c = new ArrayList();

        /* renamed from: d */
        public final List<C5003a> f26203d = new ArrayList();

        public C5003a(int i, long j) {
            super(i);
            this.f26201b = j;
        }

        /* renamed from: d */
        public void mo18930d(C5003a aVar) {
            this.f26203d.add(aVar);
        }

        /* renamed from: e */
        public void mo18931e(C5004b bVar) {
            this.f26202c.add(bVar);
        }

        /* renamed from: f */
        public C5003a mo18932f(int i) {
            int size = this.f26203d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5003a aVar = this.f26203d.get(i2);
                if (aVar.f26200a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public C5004b mo18933g(int i) {
            int size = this.f26202c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5004b bVar = this.f26202c.get(i2);
                if (bVar.f26200a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C5002a.m31553a(this.f26200a) + " leaves: " + Arrays.toString(this.f26202c.toArray()) + " containers: " + Arrays.toString(this.f26203d.toArray());
        }
    }

    /* renamed from: m2.a$b */
    /* compiled from: Atom */
    static final class C5004b extends C5002a {

        /* renamed from: b */
        public final C5918a0 f26204b;

        public C5004b(int i, C5918a0 a0Var) {
            super(i);
            this.f26204b = a0Var;
        }
    }

    public C5002a(int i) {
        this.f26200a = i;
    }

    /* renamed from: a */
    public static String m31553a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m31554b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static int m31555c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m31553a(this.f26200a);
    }
}
