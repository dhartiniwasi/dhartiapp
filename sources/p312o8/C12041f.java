package p312o8;

import com.google.auto.value.AutoValue;
import p312o8.C12033b;

@AutoValue
/* renamed from: o8.f */
/* compiled from: TokenResult */
public abstract class C12041f {

    @AutoValue.Builder
    /* renamed from: o8.f$a */
    /* compiled from: TokenResult */
    public static abstract class C12042a {
        /* renamed from: a */
        public abstract C12041f mo36408a();

        /* renamed from: b */
        public abstract C12042a mo36409b(C12043b bVar);

        /* renamed from: c */
        public abstract C12042a mo36410c(String str);

        /* renamed from: d */
        public abstract C12042a mo36411d(long j);
    }

    /* renamed from: o8.f$b */
    /* compiled from: TokenResult */
    public enum C12043b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static C12042a m57984a() {
        return new C12033b.C12035b().mo36411d(0);
    }

    /* renamed from: b */
    public abstract C12043b mo36402b();

    /* renamed from: c */
    public abstract String mo36403c();

    /* renamed from: d */
    public abstract long mo36404d();
}
