package p177z1;

import android.os.Bundle;
import p161w3.C5917a;
import p177z1.C6224h;
import p182a7.C6425j;

/* renamed from: z1.o3 */
/* compiled from: ThumbRating */
public final class C6262o3 extends C6206b3 {

    /* renamed from: d */
    public static final C6224h.C6225a<C6262o3> f30166d = C13411n3.f47749a;

    /* renamed from: b */
    private final boolean f30167b;

    /* renamed from: c */
    private final boolean f30168c;

    public C6262o3() {
        this.f30167b = false;
        this.f30168c = false;
    }

    /* renamed from: c */
    private static String m36807c(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C6262o3 m36809e(Bundle bundle) {
        C5917a.m34868a(bundle.getInt(m36807c(0), -1) == 3);
        if (bundle.getBoolean(m36807c(1), false)) {
            return new C6262o3(bundle.getBoolean(m36807c(2), false));
        }
        return new C6262o3();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6262o3)) {
            return false;
        }
        C6262o3 o3Var = (C6262o3) obj;
        if (this.f30168c == o3Var.f30168c && this.f30167b == o3Var.f30167b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6425j.m37542b(Boolean.valueOf(this.f30167b), Boolean.valueOf(this.f30168c));
    }

    public C6262o3(boolean z) {
        this.f30167b = true;
        this.f30168c = z;
    }
}
