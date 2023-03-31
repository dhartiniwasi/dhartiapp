package p073j4;

import com.unity3d.ads.metadata.MediationMetaData;
import p033d5.C4133p;

/* renamed from: j4.e0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4761e0 {

    /* renamed from: a */
    public final String f25419a;

    /* renamed from: b */
    public final double f25420b;

    /* renamed from: c */
    public final double f25421c;

    /* renamed from: d */
    public final double f25422d;

    /* renamed from: e */
    public final int f25423e;

    public C4761e0(String str, double d, double d2, double d3, int i) {
        this.f25419a = str;
        this.f25421c = d;
        this.f25420b = d2;
        this.f25422d = d3;
        this.f25423e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4761e0)) {
            return false;
        }
        C4761e0 e0Var = (C4761e0) obj;
        if (C4133p.m28193a(this.f25419a, e0Var.f25419a) && this.f25420b == e0Var.f25420b && this.f25421c == e0Var.f25421c && this.f25423e == e0Var.f25423e && Double.compare(this.f25422d, e0Var.f25422d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4133p.m28194b(this.f25419a, Double.valueOf(this.f25420b), Double.valueOf(this.f25421c), Double.valueOf(this.f25422d), Integer.valueOf(this.f25423e));
    }

    public final String toString() {
        return C4133p.m28195c(this).mo17442a(MediationMetaData.KEY_NAME, this.f25419a).mo17442a("minBound", Double.valueOf(this.f25421c)).mo17442a("maxBound", Double.valueOf(this.f25420b)).mo17442a("percent", Double.valueOf(this.f25422d)).mo17442a("count", Integer.valueOf(this.f25423e)).toString();
    }
}
