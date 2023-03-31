package p264io.flutter.plugins.googlemobileads;

import java.util.Objects;
import p129r4.C5458e;

/* renamed from: io.flutter.plugins.googlemobileads.f0 */
/* compiled from: FlutterServerSideVerificationOptions */
class C10835f0 {

    /* renamed from: a */
    private final String f42307a;

    /* renamed from: b */
    private final String f42308b;

    public C10835f0(String str, String str2) {
        this.f42307a = str;
        this.f42308b = str2;
    }

    /* renamed from: a */
    public C5458e mo34522a() {
        C5458e.C5459a aVar = new C5458e.C5459a();
        String str = this.f42307a;
        if (str != null) {
            aVar.mo19760c(str);
        }
        String str2 = this.f42308b;
        if (str2 != null) {
            aVar.mo19759b(str2);
        }
        return aVar.mo19758a();
    }

    /* renamed from: b */
    public String mo34523b() {
        return this.f42308b;
    }

    /* renamed from: c */
    public String mo34524c() {
        return this.f42307a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10835f0)) {
            return false;
        }
        C10835f0 f0Var = (C10835f0) obj;
        if (!Objects.equals(f0Var.f42307a, this.f42307a) || !Objects.equals(f0Var.f42308b, this.f42308b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f42307a, this.f42308b});
    }
}
