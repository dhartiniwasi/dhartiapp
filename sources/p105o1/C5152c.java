package p105o1;

import android.content.Context;
import java.util.Objects;
import p165x1.C6034a;

/* renamed from: o1.c */
/* compiled from: AutoValue_CreationContext */
final class C5152c extends C5159h {

    /* renamed from: a */
    private final Context f26677a;

    /* renamed from: b */
    private final C6034a f26678b;

    /* renamed from: c */
    private final C6034a f26679c;

    /* renamed from: d */
    private final String f26680d;

    C5152c(Context context, C6034a aVar, C6034a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f26677a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f26678b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f26679c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f26680d = str;
    }

    /* renamed from: b */
    public Context mo19131b() {
        return this.f26677a;
    }

    /* renamed from: c */
    public String mo19132c() {
        return this.f26680d;
    }

    /* renamed from: d */
    public C6034a mo19133d() {
        return this.f26679c;
    }

    /* renamed from: e */
    public C6034a mo19134e() {
        return this.f26678b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5159h)) {
            return false;
        }
        C5159h hVar = (C5159h) obj;
        if (!this.f26677a.equals(hVar.mo19131b()) || !this.f26678b.equals(hVar.mo19134e()) || !this.f26679c.equals(hVar.mo19133d()) || !this.f26680d.equals(hVar.mo19132c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f26677a.hashCode() ^ 1000003) * 1000003) ^ this.f26678b.hashCode()) * 1000003) ^ this.f26679c.hashCode()) * 1000003) ^ this.f26680d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f26677a + ", wallClock=" + this.f26678b + ", monotonicClock=" + this.f26679c + ", backendName=" + this.f26680d + "}";
    }
}
