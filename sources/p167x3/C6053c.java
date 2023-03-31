package p167x3;

import android.os.Bundle;
import java.util.Arrays;
import p177z1.C6224h;

/* renamed from: x3.c */
/* compiled from: ColorInfo */
public final class C6053c implements C6224h {

    /* renamed from: f */
    public static final C6224h.C6225a<C6053c> f29331f = C12961b.f47206a;

    /* renamed from: a */
    public final int f29332a;

    /* renamed from: b */
    public final int f29333b;

    /* renamed from: c */
    public final int f29334c;

    /* renamed from: d */
    public final byte[] f29335d;

    /* renamed from: e */
    private int f29336e;

    public C6053c(int i, int i2, int i3, byte[] bArr) {
        this.f29332a = i;
        this.f29333b = i2;
        this.f29334c = i3;
        this.f29335d = bArr;
    }

    /* renamed from: b */
    public static int m35498b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: c */
    public static int m35499c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: d */
    private static String m35500d(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ C6053c m35501e(Bundle bundle) {
        return new C6053c(bundle.getInt(m35500d(0), -1), bundle.getInt(m35500d(1), -1), bundle.getInt(m35500d(2), -1), bundle.getByteArray(m35500d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6053c.class != obj.getClass()) {
            return false;
        }
        C6053c cVar = (C6053c) obj;
        if (this.f29332a == cVar.f29332a && this.f29333b == cVar.f29333b && this.f29334c == cVar.f29334c && Arrays.equals(this.f29335d, cVar.f29335d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f29336e == 0) {
            this.f29336e = ((((((527 + this.f29332a) * 31) + this.f29333b) * 31) + this.f29334c) * 31) + Arrays.hashCode(this.f29335d);
        }
        return this.f29336e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f29332a);
        sb.append(", ");
        sb.append(this.f29333b);
        sb.append(", ");
        sb.append(this.f29334c);
        sb.append(", ");
        sb.append(this.f29335d != null);
        sb.append(")");
        return sb.toString();
    }
}
