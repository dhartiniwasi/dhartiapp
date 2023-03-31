package androidx.recyclerview.widget;

import android.view.View;
import com.pichillilorenzo.flutter_inappwebview.C8710R;

/* renamed from: androidx.recyclerview.widget.o */
/* compiled from: ViewBoundsCheck */
class C1420o {

    /* renamed from: a */
    final C1422b f4048a;

    /* renamed from: b */
    C1421a f4049b = new C1421a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* compiled from: ViewBoundsCheck */
    static class C1421a {

        /* renamed from: a */
        int f4050a = 0;

        /* renamed from: b */
        int f4051b;

        /* renamed from: c */
        int f4052c;

        /* renamed from: d */
        int f4053d;

        /* renamed from: e */
        int f4054e;

        C1421a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5531a(int i) {
            this.f4050a = i | this.f4050a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5532b() {
            int i = this.f4050a;
            if ((i & 7) != 0 && (i & (mo5533c(this.f4053d, this.f4051b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4050a;
            if ((i2 & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0 && (i2 & (mo5533c(this.f4053d, this.f4052c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4050a;
            if ((i3 & 1792) != 0 && (i3 & (mo5533c(this.f4054e, this.f4051b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4050a;
            if ((i4 & 28672) == 0 || (i4 & (mo5533c(this.f4054e, this.f4052c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5533c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5534d() {
            this.f4050a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5535e(int i, int i2, int i3, int i4) {
            this.f4051b = i;
            this.f4052c = i2;
            this.f4053d = i3;
            this.f4054e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    /* compiled from: ViewBoundsCheck */
    interface C1422b {
        /* renamed from: a */
        View mo5207a(int i);

        /* renamed from: b */
        int mo5208b(View view);

        /* renamed from: c */
        int mo5209c();

        /* renamed from: d */
        int mo5210d();

        /* renamed from: e */
        int mo5211e(View view);
    }

    C1420o(C1422b bVar) {
        this.f4048a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5529a(int i, int i2, int i3, int i4) {
        int c = this.f4048a.mo5209c();
        int d = this.f4048a.mo5210d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f4048a.mo5207a(i);
            this.f4049b.mo5535e(c, d, this.f4048a.mo5208b(a), this.f4048a.mo5211e(a));
            if (i3 != 0) {
                this.f4049b.mo5534d();
                this.f4049b.mo5531a(i3);
                if (this.f4049b.mo5532b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f4049b.mo5534d();
                this.f4049b.mo5531a(i4);
                if (this.f4049b.mo5532b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5530b(View view, int i) {
        this.f4049b.mo5535e(this.f4048a.mo5209c(), this.f4048a.mo5210d(), this.f4048a.mo5208b(view), this.f4048a.mo5211e(view));
        if (i == 0) {
            return false;
        }
        this.f4049b.mo5534d();
        this.f4049b.mo5531a(i);
        return this.f4049b.mo5532b();
    }
}
