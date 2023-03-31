package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C2531jz implements u10 {

    /* renamed from: a */
    final /* synthetic */ C2605lz f11849a;

    C2531jz(C2605lz lzVar) {
        this.f11849a = lzVar;
    }

    /* renamed from: a */
    public final String mo11540a(String str, String str2) {
        return this.f11849a.f13118e.getString(str, str2);
    }

    /* renamed from: b */
    public final Double mo11541b(String str, double d) {
        try {
            return Double.valueOf((double) this.f11849a.f13118e.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f11849a.f13118e.getString(str, String.valueOf(d)));
        }
    }

    /* renamed from: c */
    public final Long mo11542c(String str, long j) {
        try {
            return Long.valueOf(this.f11849a.f13118e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f11849a.f13118e.getInt(str, (int) j));
        }
    }

    /* renamed from: d */
    public final Boolean mo11543d(String str, boolean z) {
        try {
            return Boolean.valueOf(this.f11849a.f13118e.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f11849a.f13118e.getString(str, String.valueOf(z)));
        }
    }
}
