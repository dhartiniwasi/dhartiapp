package p244ge;

import java.io.IOException;
import java.util.Objects;
import p253he.C10543e;
import p336qe.C12233d;

/* renamed from: ge.e0 */
/* compiled from: RequestBody */
public abstract class C10364e0 {

    /* renamed from: ge.e0$a */
    /* compiled from: RequestBody */
    class C10365a extends C10364e0 {

        /* renamed from: a */
        final /* synthetic */ C10401z f41084a;

        /* renamed from: b */
        final /* synthetic */ int f41085b;

        /* renamed from: c */
        final /* synthetic */ byte[] f41086c;

        /* renamed from: d */
        final /* synthetic */ int f41087d;

        C10365a(C10401z zVar, int i, byte[] bArr, int i2) {
            this.f41085b = i;
            this.f41086c = bArr;
            this.f41087d = i2;
        }

        /* renamed from: a */
        public long mo33284a() {
            return (long) this.f41085b;
        }

        /* renamed from: b */
        public C10401z mo33285b() {
            return this.f41084a;
        }

        /* renamed from: g */
        public void mo33288g(C12233d dVar) throws IOException {
            dVar.mo36816s(this.f41086c, this.f41087d, this.f41085b);
        }
    }

    /* renamed from: c */
    public static C10364e0 m52348c(C10401z zVar, byte[] bArr) {
        return m52349d(zVar, bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static C10364e0 m52349d(C10401z zVar, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        C10543e.m53044e((long) bArr.length, (long) i, (long) i2);
        return new C10365a(zVar, i2, bArr, i);
    }

    /* renamed from: a */
    public abstract long mo33284a() throws IOException;

    /* renamed from: b */
    public abstract C10401z mo33285b();

    /* renamed from: e */
    public boolean mo33286e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo33287f() {
        return false;
    }

    /* renamed from: g */
    public abstract void mo33288g(C12233d dVar) throws IOException;
}
