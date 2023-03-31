package p045f3;

import android.net.Uri;
import p161w3.C5947k0;

/* renamed from: f3.i */
/* compiled from: RangedUri */
public final class C4264i {

    /* renamed from: a */
    public final long f23692a;

    /* renamed from: b */
    public final long f23693b;

    /* renamed from: c */
    private final String f23694c;

    /* renamed from: d */
    private int f23695d;

    public C4264i(String str, long j, long j2) {
        this.f23694c = str == null ? "" : str;
        this.f23692a = j;
        this.f23693b = j2;
    }

    /* renamed from: a */
    public C4264i mo17681a(C4264i iVar, String str) {
        String c = mo17683c(str);
        if (iVar != null && c.equals(iVar.mo17683c(str))) {
            long j = this.f23693b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f23692a;
                if (j3 + j == iVar.f23692a) {
                    long j4 = iVar.f23693b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new C4264i(c, j3, j2);
                }
            }
            long j5 = iVar.f23693b;
            if (j5 != -1) {
                long j6 = iVar.f23692a;
                if (j6 + j5 == this.f23692a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new C4264i(c, j6, j2);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri mo17682b(String str) {
        return C5947k0.m35055e(str, this.f23694c);
    }

    /* renamed from: c */
    public String mo17683c(String str) {
        return C5947k0.m35054d(str, this.f23694c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4264i.class != obj.getClass()) {
            return false;
        }
        C4264i iVar = (C4264i) obj;
        if (this.f23692a == iVar.f23692a && this.f23693b == iVar.f23693b && this.f23694c.equals(iVar.f23694c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f23695d == 0) {
            this.f23695d = ((((527 + ((int) this.f23692a)) * 31) + ((int) this.f23693b)) * 31) + this.f23694c.hashCode();
        }
        return this.f23695d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f23694c + ", start=" + this.f23692a + ", length=" + this.f23693b + ")";
    }
}
