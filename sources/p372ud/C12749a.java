package p372ud;

import kotlin.jvm.internal.C11665g;
import p252hd.C10535w;
import p290ld.C11789c;

/* renamed from: ud.a */
/* compiled from: Progressions.kt */
public class C12749a implements Iterable<Integer> {

    /* renamed from: d */
    public static final C12750a f46699d = new C12750a((C11665g) null);

    /* renamed from: a */
    private final int f46700a;

    /* renamed from: b */
    private final int f46701b;

    /* renamed from: c */
    private final int f46702c;

    /* renamed from: ud.a$a */
    /* compiled from: Progressions.kt */
    public static final class C12750a {
        private C12750a() {
        }

        public /* synthetic */ C12750a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12749a mo37681a(int i, int i2, int i3) {
            return new C12749a(i, i2, i3);
        }
    }

    public C12749a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f46700a = i;
            this.f46701b = C11789c.m57138b(i, i2, i3);
            this.f46702c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: b */
    public final int mo37672b() {
        return this.f46700a;
    }

    /* renamed from: c */
    public final int mo37673c() {
        return this.f46701b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12749a) {
            if (!isEmpty() || !((C12749a) obj).isEmpty()) {
                C12749a aVar = (C12749a) obj;
                if (!(this.f46700a == aVar.f46700a && this.f46701b == aVar.f46701b && this.f46702c == aVar.f46702c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo37675f() {
        return this.f46702c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f46700a * 31) + this.f46701b) * 31) + this.f46702c;
    }

    /* renamed from: i */
    public C10535w iterator() {
        return new C12751b(this.f46700a, this.f46701b, this.f46702c);
    }

    public boolean isEmpty() {
        if (this.f46702c > 0) {
            if (this.f46700a > this.f46701b) {
                return true;
            }
        } else if (this.f46700a < this.f46701b) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f46702c > 0) {
            sb = new StringBuilder();
            sb.append(this.f46700a);
            sb.append("..");
            sb.append(this.f46701b);
            sb.append(" step ");
            i = this.f46702c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f46700a);
            sb.append(" downTo ");
            sb.append(this.f46701b);
            sb.append(" step ");
            i = -this.f46702c;
        }
        sb.append(i);
        return sb.toString();
    }
}
