package p341ra;

/* renamed from: ra.f */
/* compiled from: MediaControl */
public class C12268f {

    /* renamed from: a */
    public final String f45476a;

    /* renamed from: b */
    public final String f45477b;

    /* renamed from: c */
    public final long f45478c;

    public C12268f(String str, String str2, long j) {
        this.f45476a = str;
        this.f45477b = str2;
        this.f45478c = j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12268f)) {
            return false;
        }
        C12268f fVar = (C12268f) obj;
        if (!this.f45476a.equals(fVar.f45476a) || !this.f45477b.equals(fVar.f45477b) || this.f45478c != fVar.f45478c) {
            return false;
        }
        return true;
    }
}
