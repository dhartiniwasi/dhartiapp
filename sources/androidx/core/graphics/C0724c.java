package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.c */
/* compiled from: Insets */
public final class C0724c {

    /* renamed from: e */
    public static final C0724c f2265e = new C0724c(0, 0, 0, 0);

    /* renamed from: a */
    public final int f2266a;

    /* renamed from: b */
    public final int f2267b;

    /* renamed from: c */
    public final int f2268c;

    /* renamed from: d */
    public final int f2269d;

    /* renamed from: androidx.core.graphics.c$a */
    /* compiled from: Insets */
    static class C0725a {
        /* renamed from: a */
        static Insets m3321a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private C0724c(int i, int i2, int i3, int i4) {
        this.f2266a = i;
        this.f2267b = i2;
        this.f2268c = i3;
        this.f2269d = i4;
    }

    /* renamed from: a */
    public static C0724c m3316a(C0724c cVar, C0724c cVar2) {
        return m3317b(Math.max(cVar.f2266a, cVar2.f2266a), Math.max(cVar.f2267b, cVar2.f2267b), Math.max(cVar.f2268c, cVar2.f2268c), Math.max(cVar.f2269d, cVar2.f2269d));
    }

    /* renamed from: b */
    public static C0724c m3317b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f2265e;
        }
        return new C0724c(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0724c m3318c(Rect rect) {
        return m3317b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0724c m3319d(Insets insets) {
        return m3317b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo3053e() {
        return C0725a.m3321a(this.f2266a, this.f2267b, this.f2268c, this.f2269d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0724c.class != obj.getClass()) {
            return false;
        }
        C0724c cVar = (C0724c) obj;
        return this.f2269d == cVar.f2269d && this.f2266a == cVar.f2266a && this.f2268c == cVar.f2268c && this.f2267b == cVar.f2267b;
    }

    public int hashCode() {
        return (((((this.f2266a * 31) + this.f2267b) * 31) + this.f2268c) * 31) + this.f2269d;
    }

    public String toString() {
        return "Insets{left=" + this.f2266a + ", top=" + this.f2267b + ", right=" + this.f2268c + ", bottom=" + this.f2269d + '}';
    }
}
