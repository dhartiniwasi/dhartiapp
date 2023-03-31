package p045f3;

import p182a7.C6425j;

/* renamed from: f3.b */
/* compiled from: BaseUrl */
public final class C4256b {

    /* renamed from: a */
    public final String f23643a;

    /* renamed from: b */
    public final String f23644b;

    /* renamed from: c */
    public final int f23645c;

    /* renamed from: d */
    public final int f23646d;

    public C4256b(String str, String str2, int i, int i2) {
        this.f23643a = str;
        this.f23644b = str2;
        this.f23645c = i;
        this.f23646d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4256b)) {
            return false;
        }
        C4256b bVar = (C4256b) obj;
        if (this.f23645c != bVar.f23645c || this.f23646d != bVar.f23646d || !C6425j.m37541a(this.f23643a, bVar.f23643a) || !C6425j.m37541a(this.f23644b, bVar.f23644b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6425j.m37542b(this.f23643a, this.f23644b, Integer.valueOf(this.f23645c), Integer.valueOf(this.f23646d));
    }
}
