package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2569l {

    /* renamed from: a */
    public final C2680o f12535a;

    /* renamed from: b */
    public final C2680o f12536b;

    public C2569l(C2680o oVar, C2680o oVar2) {
        this.f12535a = oVar;
        this.f12536b = oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2569l.class == obj.getClass()) {
            C2569l lVar = (C2569l) obj;
            return this.f12535a.equals(lVar.f12535a) && this.f12536b.equals(lVar.f12536b);
        }
    }

    public final int hashCode() {
        return (this.f12535a.hashCode() * 31) + this.f12536b.hashCode();
    }

    public final String toString() {
        String obj = this.f12535a.toString();
        String concat = this.f12535a.equals(this.f12536b) ? "" : ", ".concat(this.f12536b.toString());
        return "[" + obj + concat + "]";
    }
}
