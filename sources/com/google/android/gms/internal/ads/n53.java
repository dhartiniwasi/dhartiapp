package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class n53 extends g63 {

    /* renamed from: a */
    private int f13857a;

    /* renamed from: b */
    private String f13858b;

    /* renamed from: c */
    private byte f13859c;

    n53() {
    }

    /* renamed from: a */
    public final g63 mo10399a(String str) {
        this.f13858b = str;
        return this;
    }

    /* renamed from: b */
    public final g63 mo10400b(int i) {
        this.f13857a = i;
        this.f13859c = 1;
        return this;
    }

    /* renamed from: c */
    public final h63 mo10401c() {
        if (this.f13859c == 1) {
            return new p53(this.f13857a, this.f13858b, (o53) null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
