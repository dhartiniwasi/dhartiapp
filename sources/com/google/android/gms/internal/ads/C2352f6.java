package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2352f6 implements qn4 {

    /* renamed from: j */
    public static final xn4 f9127j = C2315e6.f8681b;

    /* renamed from: a */
    private final C2390g6 f9128a = new C2390g6(true, (String) null);

    /* renamed from: b */
    private final y22 f9129b = new y22(2048);

    /* renamed from: c */
    private final y22 f9130c;

    /* renamed from: d */
    private final x12 f9131d;

    /* renamed from: e */
    private tn4 f9132e;

    /* renamed from: f */
    private long f9133f;

    /* renamed from: g */
    private long f9134g = -1;

    /* renamed from: h */
    private boolean f9135h;

    /* renamed from: i */
    private boolean f9136i;

    public C2352f6(int i) {
        y22 y22 = new y22(10);
        this.f9130c = y22;
        byte[] h = y22.mo15295h();
        this.f9131d = new x12(h, h.length);
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        int i = 0;
        while (true) {
            fn4 fn4 = (fn4) rn4;
            fn4.mo9986i(this.f9130c.mo15295h(), 0, 10, false);
            this.f9130c.mo15293f(0);
            if (this.f9130c.mo15308u() != 4801587) {
                break;
            }
            this.f9130c.mo15294g(3);
            int r = this.f9130c.mo15305r();
            i += r + 10;
            fn4.mo10217m(r, false);
        }
        rn4.mo9981W();
        fn4 fn42 = (fn4) rn4;
        fn42.mo10217m(i, false);
        if (this.f9134g == -1) {
            this.f9134g = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            fn42.mo9986i(this.f9130c.mo15295h(), 0, 2, false);
            this.f9130c.mo15293f(0);
            if (!C2390g6.m13047f(this.f9130c.mo15310w())) {
                i2++;
                rn4.mo9981W();
                fn42.mo10217m(i2, false);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                fn42.mo9986i(this.f9130c.mo15295h(), 0, 4, false);
                this.f9131d.mo15039h(14);
                int c = this.f9131d.mo15034c(13);
                if (c <= 6) {
                    i2++;
                    rn4.mo9981W();
                    fn42.mo10217m(i2, false);
                } else {
                    fn42.mo10217m(c - 6, false);
                    i4 += c;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f9132e = tn4;
        this.f9128a.mo8217c(tn4, new C3059y7(RecyclerView.UNDEFINED_DURATION, 0, 1));
        tn4.mo10058C();
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        v91.m22048b(this.f9132e);
        int c = rn4.mo8792c(this.f9129b.mo15295h(), 0, 2048);
        if (!this.f9136i) {
            this.f9132e.mo10059j(new C2606m(-9223372036854775807L, 0));
            this.f9136i = true;
        }
        if (c == -1) {
            return -1;
        }
        this.f9129b.mo15293f(0);
        this.f9129b.mo15292e(c);
        if (!this.f9135h) {
            this.f9128a.mo8218d(this.f9133f, 4);
            this.f9135h = true;
        }
        this.f9128a.mo8216b(this.f9129b);
        return 0;
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f9135h = false;
        this.f9128a.mo8215a();
        this.f9133f = j2;
    }
}
