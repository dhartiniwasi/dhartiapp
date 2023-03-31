package p098n1;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import p084l1.C4904d;
import p098n1.C5076d;

@AutoValue
/* renamed from: n1.o */
/* compiled from: TransportContext */
public abstract class C5095o {

    @AutoValue.Builder
    /* renamed from: n1.o$a */
    /* compiled from: TransportContext */
    public static abstract class C5096a {
        /* renamed from: a */
        public abstract C5095o mo19029a();

        /* renamed from: b */
        public abstract C5096a mo19030b(String str);

        /* renamed from: c */
        public abstract C5096a mo19031c(byte[] bArr);

        /* renamed from: d */
        public abstract C5096a mo19032d(C4904d dVar);
    }

    /* renamed from: a */
    public static C5096a m31889a() {
        return new C5076d.C5078b().mo19032d(C4904d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo19024b();

    /* renamed from: c */
    public abstract byte[] mo19025c();

    /* renamed from: d */
    public abstract C4904d mo19026d();

    /* renamed from: e */
    public boolean mo19057e() {
        return mo19025c() != null;
    }

    /* renamed from: f */
    public C5095o mo19058f(C4904d dVar) {
        return m31889a().mo19030b(mo19024b()).mo19032d(dVar).mo19031c(mo19025c()).mo19029a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo19024b();
        objArr[1] = mo19026d();
        objArr[2] = mo19025c() == null ? "" : Base64.encodeToString(mo19025c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
