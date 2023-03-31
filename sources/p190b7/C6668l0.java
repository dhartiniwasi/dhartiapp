package p190b7;

/* renamed from: b7.l0 */
/* compiled from: RegularImmutableSet */
final class C6668l0<E> extends C6694s<E> {

    /* renamed from: h */
    private static final Object[] f31157h;

    /* renamed from: i */
    static final C6668l0<Object> f31158i;

    /* renamed from: c */
    final transient Object[] f31159c;

    /* renamed from: d */
    private final transient int f31160d;

    /* renamed from: e */
    final transient Object[] f31161e;

    /* renamed from: f */
    private final transient int f31162f;

    /* renamed from: g */
    private final transient int f31163g;

    static {
        Object[] objArr = new Object[0];
        f31157h = objArr;
        f31158i = new C6668l0(objArr, 0, objArr, 0, 0);
    }

    C6668l0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f31159c = objArr;
        this.f31160d = i;
        this.f31161e = objArr2;
        this.f31162f = i2;
        this.f31163g = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo22447c(Object[] objArr, int i) {
        System.arraycopy(this.f31159c, 0, objArr, i, this.f31163g);
        return i + this.f31163g;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f31161e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = C6671n.m38411b(obj);
        while (true) {
            int i = b & this.f31162f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo22448f() {
        return this.f31159c;
    }

    public int hashCode() {
        return this.f31160d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo22450i() {
        return this.f31163g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo22451j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo22452k() {
        return false;
    }

    /* renamed from: l */
    public C6695s0<E> iterator() {
        return mo22475b().iterator();
    }

    public int size() {
        return this.f31163g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C6685q<E> mo22471t() {
        return C6685q.m38440q(this.f31159c, this.f31163g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo22489u() {
        return true;
    }
}
