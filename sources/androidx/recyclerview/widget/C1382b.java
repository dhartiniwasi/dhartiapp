package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
/* compiled from: ChildHelper */
class C1382b {

    /* renamed from: a */
    final C1384b f3907a;

    /* renamed from: b */
    final C1383a f3908b = new C1383a();

    /* renamed from: c */
    final List<View> f3909c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* compiled from: ChildHelper */
    static class C1383a {

        /* renamed from: a */
        long f3910a = 0;

        /* renamed from: b */
        C1383a f3911b;

        C1383a() {
        }

        /* renamed from: c */
        private void m6474c() {
            if (this.f3911b == null) {
                this.f3911b = new C1383a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5413a(int i) {
            if (i >= 64) {
                C1383a aVar = this.f3911b;
                if (aVar != null) {
                    aVar.mo5413a(i - 64);
                    return;
                }
                return;
            }
            this.f3910a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5414b(int i) {
            C1383a aVar = this.f3911b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f3910a);
                }
                return Long.bitCount(this.f3910a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f3910a & ((1 << i) - 1));
            } else {
                return aVar.mo5414b(i - 64) + Long.bitCount(this.f3910a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5415d(int i) {
            if (i < 64) {
                return (this.f3910a & (1 << i)) != 0;
            }
            m6474c();
            return this.f3911b.mo5415d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5416e(int i, boolean z) {
            if (i >= 64) {
                m6474c();
                this.f3911b.mo5416e(i - 64, z);
                return;
            }
            long j = this.f3910a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3910a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo5419h(i);
            } else {
                mo5413a(i);
            }
            if (z2 || this.f3911b != null) {
                m6474c();
                this.f3911b.mo5416e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo5417f(int i) {
            if (i >= 64) {
                m6474c();
                return this.f3911b.mo5417f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3910a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f3910a = j3;
            long j4 = j - 1;
            this.f3910a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1383a aVar = this.f3911b;
            if (aVar != null) {
                if (aVar.mo5415d(0)) {
                    mo5419h(63);
                }
                this.f3911b.mo5417f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5418g() {
            this.f3910a = 0;
            C1383a aVar = this.f3911b;
            if (aVar != null) {
                aVar.mo5418g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5419h(int i) {
            if (i >= 64) {
                m6474c();
                this.f3911b.mo5419h(i - 64);
                return;
            }
            this.f3910a |= 1 << i;
        }

        public String toString() {
            if (this.f3911b == null) {
                return Long.toBinaryString(this.f3910a);
            }
            return this.f3911b.toString() + "xx" + Long.toBinaryString(this.f3910a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* compiled from: ChildHelper */
    interface C1384b {
        /* renamed from: a */
        View mo5038a(int i);

        void addView(View view, int i);

        /* renamed from: b */
        void mo5040b(View view);

        /* renamed from: c */
        int mo5041c();

        /* renamed from: d */
        void mo5042d();

        /* renamed from: e */
        int mo5043e(View view);

        /* renamed from: f */
        RecyclerView.C1336d0 mo5044f(View view);

        /* renamed from: g */
        void mo5045g(int i);

        /* renamed from: h */
        void mo5046h(View view);

        /* renamed from: i */
        void mo5047i(int i);

        /* renamed from: j */
        void mo5048j(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    C1382b(C1384b bVar) {
        this.f3907a = bVar;
    }

    /* renamed from: h */
    private int m6454h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.f3907a.mo5041c();
        int i2 = i;
        while (i2 < c) {
            int b = i - (i2 - this.f3908b.mo5414b(i2));
            if (b == 0) {
                while (this.f3908b.mo5415d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m6455l(View view) {
        this.f3909c.add(view);
        this.f3907a.mo5040b(view);
    }

    /* renamed from: t */
    private boolean m6456t(View view) {
        if (!this.f3909c.remove(view)) {
            return false;
        }
        this.f3907a.mo5046h(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5395a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3907a.mo5041c();
        } else {
            i2 = m6454h(i);
        }
        this.f3908b.mo5416e(i2, z);
        if (z) {
            m6455l(view);
        }
        this.f3907a.addView(view, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5396b(View view, boolean z) {
        mo5395a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5397c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3907a.mo5041c();
        } else {
            i2 = m6454h(i);
        }
        this.f3908b.mo5416e(i2, z);
        if (z) {
            m6455l(view);
        }
        this.f3907a.mo5048j(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5398d(int i) {
        int h = m6454h(i);
        this.f3908b.mo5417f(h);
        this.f3907a.mo5045g(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo5399e(int i) {
        int size = this.f3909c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3909c.get(i2);
            RecyclerView.C1336d0 f = this.f3907a.mo5044f(view);
            if (f.mo5023m() == i && !f.mo5030t() && !f.mo5033v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo5400f(int i) {
        return this.f3907a.mo5038a(m6454h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5401g() {
        return this.f3907a.mo5041c() - this.f3909c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo5402i(int i) {
        return this.f3907a.mo5038a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo5403j() {
        return this.f3907a.mo5041c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5404k(View view) {
        int e = this.f3907a.mo5043e(view);
        if (e >= 0) {
            this.f3908b.mo5419h(e);
            m6455l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5405m(View view) {
        int e = this.f3907a.mo5043e(view);
        if (e != -1 && !this.f3908b.mo5415d(e)) {
            return e - this.f3908b.mo5414b(e);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo5406n(View view) {
        return this.f3909c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5407o() {
        this.f3908b.mo5418g();
        for (int size = this.f3909c.size() - 1; size >= 0; size--) {
            this.f3907a.mo5046h(this.f3909c.get(size));
            this.f3909c.remove(size);
        }
        this.f3907a.mo5042d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5408p(View view) {
        int e = this.f3907a.mo5043e(view);
        if (e >= 0) {
            if (this.f3908b.mo5417f(e)) {
                m6456t(view);
            }
            this.f3907a.mo5047i(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5409q(int i) {
        int h = m6454h(i);
        View a = this.f3907a.mo5038a(h);
        if (a != null) {
            if (this.f3908b.mo5417f(h)) {
                m6456t(a);
            }
            this.f3907a.mo5047i(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5410r(View view) {
        int e = this.f3907a.mo5043e(view);
        if (e == -1) {
            m6456t(view);
            return true;
        } else if (!this.f3908b.mo5415d(e)) {
            return false;
        } else {
            this.f3908b.mo5417f(e);
            m6456t(view);
            this.f3907a.mo5047i(e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5411s(View view) {
        int e = this.f3907a.mo5043e(view);
        if (e < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3908b.mo5415d(e)) {
            this.f3908b.mo5413a(e);
            m6456t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3908b.toString() + ", hidden list:" + this.f3909c.size();
    }
}
