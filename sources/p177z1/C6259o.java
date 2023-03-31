package p177z1;

import android.os.Bundle;
import p177z1.C6224h;

/* renamed from: z1.o */
/* compiled from: DeviceInfo */
public final class C6259o implements C6224h {

    /* renamed from: d */
    public static final C6259o f30157d = new C6259o(0, 0, 0);

    /* renamed from: e */
    public static final C6224h.C6225a<C6259o> f30158e = C13408n.f47746a;

    /* renamed from: a */
    public final int f30159a;

    /* renamed from: b */
    public final int f30160b;

    /* renamed from: c */
    public final int f30161c;

    public C6259o(int i, int i2, int i3) {
        this.f30159a = i;
        this.f30160b = i2;
        this.f30161c = i3;
    }

    /* renamed from: b */
    private static String m36800b(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C6259o m36801c(Bundle bundle) {
        return new C6259o(bundle.getInt(m36800b(0), 0), bundle.getInt(m36800b(1), 0), bundle.getInt(m36800b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6259o)) {
            return false;
        }
        C6259o oVar = (C6259o) obj;
        if (this.f30159a == oVar.f30159a && this.f30160b == oVar.f30160b && this.f30161c == oVar.f30161c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f30159a) * 31) + this.f30160b) * 31) + this.f30161c;
    }
}
