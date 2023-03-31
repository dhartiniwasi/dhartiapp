package p033d5;

import android.os.Bundle;
import com.google.android.gms.common.api.C2051a;

/* renamed from: d5.y */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4162y implements C2051a.C2055d {

    /* renamed from: c */
    public static final C4162y f23424c = m28269c().mo17494a();

    /* renamed from: b */
    private final String f23425b;

    /* renamed from: d5.y$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4163a {

        /* renamed from: a */
        private String f23426a;

        /* synthetic */ C4163a(C4082a0 a0Var) {
        }

        /* renamed from: a */
        public C4162y mo17494a() {
            return new C4162y(this.f23426a, (C4085b0) null);
        }
    }

    /* synthetic */ C4162y(String str, C4085b0 b0Var) {
        this.f23425b = str;
    }

    /* renamed from: c */
    public static C4163a m28269c() {
        return new C4163a((C4082a0) null);
    }

    /* renamed from: d */
    public final Bundle mo17491d() {
        Bundle bundle = new Bundle();
        String str = this.f23425b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4162y)) {
            return false;
        }
        return C4133p.m28193a(this.f23425b, ((C4162y) obj).f23425b);
    }

    public final int hashCode() {
        return C4133p.m28194b(this.f23425b);
    }
}
