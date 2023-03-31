package p167x3;

import android.os.Bundle;
import p177z1.C6224h;

/* renamed from: x3.z */
/* compiled from: VideoSize */
public final class C6076z implements C6224h {

    /* renamed from: e */
    public static final C6076z f29443e = new C6076z(0, 0);

    /* renamed from: f */
    public static final C6224h.C6225a<C6076z> f29444f = C12973y.f47234a;

    /* renamed from: a */
    public final int f29445a;

    /* renamed from: b */
    public final int f29446b;

    /* renamed from: c */
    public final int f29447c;

    /* renamed from: d */
    public final float f29448d;

    public C6076z(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    /* renamed from: b */
    private static String m35675b(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C6076z m35676c(Bundle bundle) {
        return new C6076z(bundle.getInt(m35675b(0), 0), bundle.getInt(m35675b(1), 0), bundle.getInt(m35675b(2), 0), bundle.getFloat(m35675b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6076z)) {
            return false;
        }
        C6076z zVar = (C6076z) obj;
        if (this.f29445a == zVar.f29445a && this.f29446b == zVar.f29446b && this.f29447c == zVar.f29447c && this.f29448d == zVar.f29448d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f29445a) * 31) + this.f29446b) * 31) + this.f29447c) * 31) + Float.floatToRawIntBits(this.f29448d);
    }

    public C6076z(int i, int i2, int i3, float f) {
        this.f29445a = i;
        this.f29446b = i2;
        this.f29447c = i3;
        this.f29448d = f;
    }
}
