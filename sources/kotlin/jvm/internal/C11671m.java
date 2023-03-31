package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.m */
/* compiled from: PackageReference.kt */
public final class C11671m implements C11661d {

    /* renamed from: a */
    private final Class<?> f44238a;

    /* renamed from: b */
    private final String f44239b;

    public C11671m(Class<?> cls, String str) {
        C11669k.m56787e(cls, "jClass");
        C11669k.m56787e(str, "moduleName");
        this.f44238a = cls;
        this.f44239b = str;
    }

    /* renamed from: b */
    public Class<?> mo35837b() {
        return this.f44238a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11671m) && C11669k.m56783a(mo35837b(), ((C11671m) obj).mo35837b());
    }

    public int hashCode() {
        return mo35837b().hashCode();
    }

    public String toString() {
        return mo35837b().toString() + " (Kotlin reflection is not available)";
    }
}
