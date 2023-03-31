package p182a7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a7.q */
/* compiled from: Splitter */
public final class C6436q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6409c f30680a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f30681b;

    /* renamed from: c */
    private final C6440c f30682c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f30683d;

    /* renamed from: a7.q$a */
    /* compiled from: Splitter */
    class C6437a implements C6440c {

        /* renamed from: a */
        final /* synthetic */ C6409c f30684a;

        /* renamed from: a7.q$a$a */
        /* compiled from: Splitter */
        class C6438a extends C6439b {
            C6438a(C6436q qVar, CharSequence charSequence) {
                super(qVar, charSequence);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public int mo21855f(int i) {
                return i + 1;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g */
            public int mo21856g(int i) {
                return C6437a.this.f30684a.mo21827c(this.f30686c, i);
            }
        }

        C6437a(C6409c cVar) {
            this.f30684a = cVar;
        }

        /* renamed from: b */
        public C6439b mo21853a(C6436q qVar, CharSequence charSequence) {
            return new C6438a(qVar, charSequence);
        }
    }

    /* renamed from: a7.q$b */
    /* compiled from: Splitter */
    private static abstract class C6439b extends C6405a<String> {

        /* renamed from: c */
        final CharSequence f30686c;

        /* renamed from: d */
        final C6409c f30687d;

        /* renamed from: e */
        final boolean f30688e;

        /* renamed from: f */
        int f30689f = 0;

        /* renamed from: g */
        int f30690g;

        protected C6439b(C6436q qVar, CharSequence charSequence) {
            this.f30687d = qVar.f30680a;
            this.f30688e = qVar.f30681b;
            this.f30690g = qVar.f30683d;
            this.f30686c = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo21821a() {
            int i;
            int i2 = this.f30689f;
            while (true) {
                int i3 = this.f30689f;
                if (i3 == -1) {
                    return (String) mo21822c();
                }
                int g = mo21856g(i3);
                if (g == -1) {
                    g = this.f30686c.length();
                    this.f30689f = -1;
                } else {
                    this.f30689f = mo21855f(g);
                }
                int i4 = this.f30689f;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f30689f = i5;
                    if (i5 > this.f30686c.length()) {
                        this.f30689f = -1;
                    }
                } else {
                    while (i2 < g && this.f30687d.mo21828e(this.f30686c.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f30687d.mo21828e(this.f30686c.charAt(i - 1))) {
                        g = i - 1;
                    }
                    if (!this.f30688e || i2 != i) {
                        int i6 = this.f30690g;
                    } else {
                        i2 = this.f30689f;
                    }
                }
            }
            int i62 = this.f30690g;
            if (i62 == 1) {
                i = this.f30686c.length();
                this.f30689f = -1;
                while (i > i2 && this.f30687d.mo21828e(this.f30686c.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f30690g = i62 - 1;
            }
            return this.f30686c.subSequence(i2, i).toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract int mo21855f(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract int mo21856g(int i);
    }

    /* renamed from: a7.q$c */
    /* compiled from: Splitter */
    private interface C6440c {
        /* renamed from: a */
        Iterator<String> mo21853a(C6436q qVar, CharSequence charSequence);
    }

    private C6436q(C6440c cVar) {
        this(cVar, false, C6409c.m37510f(), Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public static C6436q m37578d(char c) {
        return m37579e(C6409c.m37509d(c));
    }

    /* renamed from: e */
    public static C6436q m37579e(C6409c cVar) {
        C6431n.m37561n(cVar);
        return new C6436q(new C6437a(cVar));
    }

    /* renamed from: g */
    private Iterator<String> m37580g(CharSequence charSequence) {
        return this.f30682c.mo21853a(this, charSequence);
    }

    /* renamed from: f */
    public List<String> mo21850f(CharSequence charSequence) {
        C6431n.m37561n(charSequence);
        Iterator<String> g = m37580g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public C6436q mo21851h() {
        return mo21852i(C6409c.m37512h());
    }

    /* renamed from: i */
    public C6436q mo21852i(C6409c cVar) {
        C6431n.m37561n(cVar);
        return new C6436q(this.f30682c, this.f30681b, cVar, this.f30683d);
    }

    private C6436q(C6440c cVar, boolean z, C6409c cVar2, int i) {
        this.f30682c = cVar;
        this.f30681b = z;
        this.f30680a = cVar2;
        this.f30683d = i;
    }
}
