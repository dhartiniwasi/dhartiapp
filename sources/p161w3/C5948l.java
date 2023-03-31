package p161w3;

import android.util.SparseBooleanArray;

/* renamed from: w3.l */
/* compiled from: FlagSet */
public final class C5948l {

    /* renamed from: a */
    private final SparseBooleanArray f29102a;

    /* renamed from: w3.l$b */
    /* compiled from: FlagSet */
    public static final class C5950b {

        /* renamed from: a */
        private final SparseBooleanArray f29103a = new SparseBooleanArray();

        /* renamed from: b */
        private boolean f29104b;

        /* renamed from: a */
        public C5950b mo20639a(int i) {
            C5917a.m34873f(!this.f29104b);
            this.f29103a.append(i, true);
            return this;
        }

        /* renamed from: b */
        public C5950b mo20640b(C5948l lVar) {
            for (int i = 0; i < lVar.mo20636c(); i++) {
                mo20639a(lVar.mo20635b(i));
            }
            return this;
        }

        /* renamed from: c */
        public C5950b mo20641c(int... iArr) {
            for (int a : iArr) {
                mo20639a(a);
            }
            return this;
        }

        /* renamed from: d */
        public C5950b mo20642d(int i, boolean z) {
            return z ? mo20639a(i) : this;
        }

        /* renamed from: e */
        public C5948l mo20643e() {
            C5917a.m34873f(!this.f29104b);
            this.f29104b = true;
            return new C5948l(this.f29103a);
        }
    }

    /* renamed from: a */
    public boolean mo20634a(int i) {
        return this.f29102a.get(i);
    }

    /* renamed from: b */
    public int mo20635b(int i) {
        C5917a.m34870c(i, 0, mo20636c());
        return this.f29102a.keyAt(i);
    }

    /* renamed from: c */
    public int mo20636c() {
        return this.f29102a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5948l)) {
            return false;
        }
        C5948l lVar = (C5948l) obj;
        if (C5953m0.f29110a >= 24) {
            return this.f29102a.equals(lVar.f29102a);
        }
        if (mo20636c() != lVar.mo20636c()) {
            return false;
        }
        for (int i = 0; i < mo20636c(); i++) {
            if (mo20635b(i) != lVar.mo20635b(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (C5953m0.f29110a >= 24) {
            return this.f29102a.hashCode();
        }
        int c = mo20636c();
        for (int i = 0; i < mo20636c(); i++) {
            c = (c * 31) + mo20635b(i);
        }
        return c;
    }

    private C5948l(SparseBooleanArray sparseBooleanArray) {
        this.f29102a = sparseBooleanArray;
    }
}
