package androidx.recyclerview.widget;

import androidx.core.util.C0828e;
import androidx.core.util.C0829f;
import androidx.recyclerview.widget.C1408i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: AdapterHelper */
class C1379a implements C1408i.C1409a {

    /* renamed from: a */
    private C0828e<C1381b> f3895a;

    /* renamed from: b */
    final ArrayList<C1381b> f3896b;

    /* renamed from: c */
    final ArrayList<C1381b> f3897c;

    /* renamed from: d */
    final C1380a f3898d;

    /* renamed from: e */
    Runnable f3899e;

    /* renamed from: f */
    final boolean f3900f;

    /* renamed from: g */
    final C1408i f3901g;

    /* renamed from: h */
    private int f3902h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    interface C1380a {
        /* renamed from: a */
        void mo5049a(int i, int i2);

        /* renamed from: b */
        void mo5050b(C1381b bVar);

        /* renamed from: c */
        void mo5051c(int i, int i2, Object obj);

        /* renamed from: d */
        void mo5052d(C1381b bVar);

        /* renamed from: e */
        RecyclerView.C1336d0 mo5053e(int i);

        /* renamed from: f */
        void mo5054f(int i, int i2);

        /* renamed from: g */
        void mo5055g(int i, int i2);

        /* renamed from: h */
        void mo5056h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static class C1381b {

        /* renamed from: a */
        int f3903a;

        /* renamed from: b */
        int f3904b;

        /* renamed from: c */
        Object f3905c;

        /* renamed from: d */
        int f3906d;

        C1381b(int i, int i2, int i3, Object obj) {
            this.f3903a = i;
            this.f3904b = i2;
            this.f3906d = i3;
            this.f3905c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo5391a() {
            int i = this.f3903a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1381b bVar = (C1381b) obj;
            int i = this.f3903a;
            if (i != bVar.f3903a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3906d - this.f3904b) == 1 && this.f3906d == bVar.f3904b && this.f3904b == bVar.f3906d) {
                return true;
            }
            if (this.f3906d != bVar.f3906d || this.f3904b != bVar.f3904b) {
                return false;
            }
            Object obj2 = this.f3905c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3905c)) {
                    return false;
                }
            } else if (bVar.f3905c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3903a * 31) + this.f3904b) * 31) + this.f3906d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo5391a() + ",s:" + this.f3904b + "c:" + this.f3906d + ",p:" + this.f3905c + "]";
        }
    }

    C1379a(C1380a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m6423c(C1381b bVar) {
        m6429r(bVar);
    }

    /* renamed from: d */
    private void m6424d(C1381b bVar) {
        m6429r(bVar);
    }

    /* renamed from: f */
    private void m6425f(C1381b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3904b;
        int i2 = bVar.f3906d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3898d.mo5053e(i3) != null || m6427h(i3)) {
                if (c2 == 0) {
                    m6428k(mo5378b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m6429r(mo5378b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3906d) {
            mo5377a(bVar);
            bVar = mo5378b(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m6428k(bVar);
        } else {
            m6429r(bVar);
        }
    }

    /* renamed from: g */
    private void m6426g(C1381b bVar) {
        int i = bVar.f3904b;
        int i2 = bVar.f3906d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f3898d.mo5053e(i) != null || m6427h(i)) {
                if (c == 0) {
                    m6428k(mo5378b(4, i3, i4, bVar.f3905c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m6429r(mo5378b(4, i3, i4, bVar.f3905c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3906d) {
            Object obj = bVar.f3905c;
            mo5377a(bVar);
            bVar = mo5378b(4, i3, i4, obj);
        }
        if (c == 0) {
            m6428k(bVar);
        } else {
            m6429r(bVar);
        }
    }

    /* renamed from: h */
    private boolean m6427h(int i) {
        int size = this.f3897c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1381b bVar = this.f3897c.get(i2);
            int i3 = bVar.f3903a;
            if (i3 == 8) {
                if (mo5384n(bVar.f3906d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3904b;
                int i5 = bVar.f3906d + i4;
                while (i4 < i5) {
                    if (mo5384n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m6428k(C1381b bVar) {
        int i;
        int i2 = bVar.f3903a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v = m6430v(bVar.f3904b, i2);
        int i3 = bVar.f3904b;
        int i4 = bVar.f3903a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3906d; i6++) {
            int v2 = m6430v(bVar.f3904b + (i * i6), bVar.f3903a);
            int i7 = bVar.f3903a;
            if (i7 == 2 ? v2 == v : i7 == 4 && v2 == v + 1) {
                i5++;
            } else {
                C1381b b = mo5378b(i7, v, i5, bVar.f3905c);
                mo5382l(b, i3);
                mo5377a(b);
                if (bVar.f3903a == 4) {
                    i3 += i5;
                }
                v = v2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3905c;
        mo5377a(bVar);
        if (i5 > 0) {
            C1381b b2 = mo5378b(bVar.f3903a, v, i5, obj);
            mo5382l(b2, i3);
            mo5377a(b2);
        }
    }

    /* renamed from: r */
    private void m6429r(C1381b bVar) {
        this.f3897c.add(bVar);
        int i = bVar.f3903a;
        if (i == 1) {
            this.f3898d.mo5055g(bVar.f3904b, bVar.f3906d);
        } else if (i == 2) {
            this.f3898d.mo5054f(bVar.f3904b, bVar.f3906d);
        } else if (i == 4) {
            this.f3898d.mo5051c(bVar.f3904b, bVar.f3906d, bVar.f3905c);
        } else if (i == 8) {
            this.f3898d.mo5049a(bVar.f3904b, bVar.f3906d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: v */
    private int m6430v(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f3897c.size() - 1; size >= 0; size--) {
            C1381b bVar = this.f3897c.get(size);
            int i5 = bVar.f3903a;
            if (i5 == 8) {
                int i6 = bVar.f3904b;
                int i7 = bVar.f3906d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f3904b = i6 + 1;
                            bVar.f3906d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f3904b = i6 - 1;
                            bVar.f3906d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f3906d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f3906d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f3904b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f3904b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f3904b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f3906d;
                    } else if (i5 == 2) {
                        i += bVar.f3906d;
                    }
                } else if (i2 == 1) {
                    bVar.f3904b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f3904b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f3897c.size() - 1; size2 >= 0; size2--) {
            C1381b bVar2 = this.f3897c.get(size2);
            if (bVar2.f3903a == 8) {
                int i9 = bVar2.f3906d;
                if (i9 == bVar2.f3904b || i9 < 0) {
                    this.f3897c.remove(size2);
                    mo5377a(bVar2);
                }
            } else if (bVar2.f3906d <= 0) {
                this.f3897c.remove(size2);
                mo5377a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo5377a(C1381b bVar) {
        if (!this.f3900f) {
            bVar.f3905c = null;
            this.f3895a.mo3225a(bVar);
        }
    }

    /* renamed from: b */
    public C1381b mo5378b(int i, int i2, int i3, Object obj) {
        C1381b b = this.f3895a.mo3226b();
        if (b == null) {
            return new C1381b(i, i2, i3, obj);
        }
        b.f3903a = i;
        b.f3904b = i2;
        b.f3906d = i3;
        b.f3905c = obj;
        return b;
    }

    /* renamed from: e */
    public int mo5379e(int i) {
        int size = this.f3896b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1381b bVar = this.f3896b.get(i2);
            int i3 = bVar.f3903a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3904b;
                    if (i4 <= i) {
                        int i5 = bVar.f3906d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3904b;
                    if (i6 == i) {
                        i = bVar.f3906d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3906d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3904b <= i) {
                i += bVar.f3906d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5380i() {
        int size = this.f3897c.size();
        for (int i = 0; i < size; i++) {
            this.f3898d.mo5052d(this.f3897c.get(i));
        }
        mo5389t(this.f3897c);
        this.f3902h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5381j() {
        mo5380i();
        int size = this.f3896b.size();
        for (int i = 0; i < size; i++) {
            C1381b bVar = this.f3896b.get(i);
            int i2 = bVar.f3903a;
            if (i2 == 1) {
                this.f3898d.mo5052d(bVar);
                this.f3898d.mo5055g(bVar.f3904b, bVar.f3906d);
            } else if (i2 == 2) {
                this.f3898d.mo5052d(bVar);
                this.f3898d.mo5056h(bVar.f3904b, bVar.f3906d);
            } else if (i2 == 4) {
                this.f3898d.mo5052d(bVar);
                this.f3898d.mo5051c(bVar.f3904b, bVar.f3906d, bVar.f3905c);
            } else if (i2 == 8) {
                this.f3898d.mo5052d(bVar);
                this.f3898d.mo5049a(bVar.f3904b, bVar.f3906d);
            }
            Runnable runnable = this.f3899e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo5389t(this.f3896b);
        this.f3902h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5382l(C1381b bVar, int i) {
        this.f3898d.mo5050b(bVar);
        int i2 = bVar.f3903a;
        if (i2 == 2) {
            this.f3898d.mo5056h(i, bVar.f3906d);
        } else if (i2 == 4) {
            this.f3898d.mo5051c(i, bVar.f3906d, bVar.f3905c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5383m(int i) {
        return mo5384n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo5384n(int i, int i2) {
        int size = this.f3897c.size();
        while (i2 < size) {
            C1381b bVar = this.f3897c.get(i2);
            int i3 = bVar.f3903a;
            if (i3 == 8) {
                int i4 = bVar.f3904b;
                if (i4 == i) {
                    i = bVar.f3906d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3906d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3904b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3906d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3906d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5385o(int i) {
        return (i & this.f3902h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5386p() {
        return this.f3896b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo5387q() {
        return !this.f3897c.isEmpty() && !this.f3896b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5388s() {
        this.f3901g.mo5485b(this.f3896b);
        int size = this.f3896b.size();
        for (int i = 0; i < size; i++) {
            C1381b bVar = this.f3896b.get(i);
            int i2 = bVar.f3903a;
            if (i2 == 1) {
                m6423c(bVar);
            } else if (i2 == 2) {
                m6425f(bVar);
            } else if (i2 == 4) {
                m6426g(bVar);
            } else if (i2 == 8) {
                m6424d(bVar);
            }
            Runnable runnable = this.f3899e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3896b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo5389t(List<C1381b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5377a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo5390u() {
        mo5389t(this.f3896b);
        mo5389t(this.f3897c);
        this.f3902h = 0;
    }

    C1379a(C1380a aVar, boolean z) {
        this.f3895a = new C0829f(30);
        this.f3896b = new ArrayList<>();
        this.f3897c = new ArrayList<>();
        this.f3902h = 0;
        this.f3898d = aVar;
        this.f3900f = z;
        this.f3901g = new C1408i(this);
    }
}
