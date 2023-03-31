package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hw */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2453hw {

    /* renamed from: i */
    public static final C2453hw f10506i = new C2541k8().mo11619c();

    /* renamed from: j */
    public static final za4 f10507j = C2464i6.f10626a;

    /* renamed from: a */
    public final String f10508a;

    /* renamed from: b */
    public final C3112zn f10509b;
    @Deprecated

    /* renamed from: c */
    public final C2224bq f10510c;

    /* renamed from: d */
    public final C3036xl f10511d;

    /* renamed from: e */
    public final m20 f10512e;

    /* renamed from: f */
    public final C2693oc f10513f;
    @Deprecated

    /* renamed from: g */
    public final C2770qe f10514g;

    /* renamed from: h */
    public final C2338et f10515h;

    /* synthetic */ C2453hw(String str, C2770qe qeVar, C2224bq bqVar, C3036xl xlVar, m20 m20, C2338et etVar, C2415gv gvVar) {
        this.f10508a = str;
        this.f10509b = bqVar;
        this.f10510c = bqVar;
        this.f10511d = xlVar;
        this.f10512e = m20;
        this.f10513f = qeVar;
        this.f10514g = qeVar;
        this.f10515h = etVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2453hw)) {
            return false;
        }
        C2453hw hwVar = (C2453hw) obj;
        return gb2.m13186t(this.f10508a, hwVar.f10508a) && this.f10513f.equals(hwVar.f10513f) && gb2.m13186t(this.f10509b, hwVar.f10509b) && gb2.m13186t(this.f10511d, hwVar.f10511d) && gb2.m13186t(this.f10512e, hwVar.f10512e) && gb2.m13186t(this.f10515h, hwVar.f10515h);
    }

    public final int hashCode() {
        int hashCode = this.f10508a.hashCode() * 31;
        C3112zn znVar = this.f10509b;
        return (((((((hashCode + (znVar != null ? znVar.hashCode() : 0)) * 31) + this.f10511d.hashCode()) * 31) + this.f10513f.hashCode()) * 31) + this.f10512e.hashCode()) * 31;
    }
}
