package p014b2;

/* renamed from: b2.w */
/* compiled from: AuxEffectInfo */
public final class C1670w {

    /* renamed from: a */
    public final int f4841a;

    /* renamed from: b */
    public final float f4842b;

    public C1670w(int i, float f) {
        this.f4841a = i;
        this.f4842b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1670w.class != obj.getClass()) {
            return false;
        }
        C1670w wVar = (C1670w) obj;
        if (this.f4841a == wVar.f4841a && Float.compare(wVar.f4842b, this.f4842b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f4841a) * 31) + Float.floatToIntBits(this.f4842b);
    }
}
