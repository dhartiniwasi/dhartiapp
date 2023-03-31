package p212d9;

import p248h9.C10475a;
import p248h9.C10476b;

/* renamed from: d9.c */
/* compiled from: BinaryBitmap */
public final class C9911c {

    /* renamed from: a */
    private final C9910b f39782a;

    /* renamed from: b */
    private C10476b f39783b;

    public C9911c(C9910b bVar) {
        if (bVar != null) {
            this.f39782a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C10476b mo32451a() throws C9918j {
        if (this.f39783b == null) {
            this.f39783b = this.f39782a.mo32446b();
        }
        return this.f39783b;
    }

    /* renamed from: b */
    public C10475a mo32452b(int i, C10475a aVar) throws C9918j {
        return this.f39782a.mo32447c(i, aVar);
    }

    /* renamed from: c */
    public int mo32453c() {
        return this.f39782a.mo32448d();
    }

    /* renamed from: d */
    public int mo32454d() {
        return this.f39782a.mo32450f();
    }

    /* renamed from: e */
    public boolean mo32455e() {
        return this.f39782a.mo32449e().mo32460f();
    }

    /* renamed from: f */
    public C9911c mo32456f() {
        return new C9911c(this.f39782a.mo32445a(this.f39782a.mo32449e().mo32461g()));
    }

    public String toString() {
        try {
            return mo32451a().toString();
        } catch (C9918j unused) {
            return "";
        }
    }
}
