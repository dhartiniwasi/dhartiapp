package p098n1;

import com.google.auto.value.AutoValue;
import p084l1.C4902b;
import p084l1.C4903c;
import p084l1.C4905e;
import p098n1.C5073c;

@AutoValue
/* renamed from: n1.n */
/* compiled from: SendRequest */
abstract class C5093n {

    @AutoValue.Builder
    /* renamed from: n1.n$a */
    /* compiled from: SendRequest */
    public static abstract class C5094a {
        /* renamed from: a */
        public abstract C5093n mo19018a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C5094a mo19019b(C4902b bVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C5094a mo19020c(C4903c<?> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C5094a mo19021d(C4905e<?, byte[]> eVar);

        /* renamed from: e */
        public abstract C5094a mo19022e(C5095o oVar);

        /* renamed from: f */
        public abstract C5094a mo19023f(String str);
    }

    C5093n() {
    }

    /* renamed from: a */
    public static C5094a m31876a() {
        return new C5073c.C5075b();
    }

    /* renamed from: b */
    public abstract C4902b mo19010b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C4903c<?> mo19011c();

    /* renamed from: d */
    public byte[] mo19056d() {
        return mo19012e().apply(mo19011c().mo18722b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C4905e<?, byte[]> mo19012e();

    /* renamed from: f */
    public abstract C5095o mo19014f();

    /* renamed from: g */
    public abstract String mo19015g();
}
