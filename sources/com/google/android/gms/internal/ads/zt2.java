package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zt2 implements pk2 {

    /* renamed from: a */
    private final e83 f21268a = new e83();

    /* renamed from: b */
    private ve3 f21269b;

    /* renamed from: c */
    private String f21270c;

    /* renamed from: d */
    private int f21271d = 8000;

    /* renamed from: e */
    private int f21272e = 8000;

    /* renamed from: f */
    private boolean f21273f;

    /* renamed from: a */
    public final zt2 mo15660a(boolean z) {
        this.f21273f = true;
        return this;
    }

    /* renamed from: b */
    public final zt2 mo15661b(int i) {
        this.f21271d = i;
        return this;
    }

    /* renamed from: c */
    public final zt2 mo15662c(int i) {
        this.f21272e = i;
        return this;
    }

    /* renamed from: d */
    public final zt2 mo15663d(ve3 ve3) {
        this.f21269b = ve3;
        return this;
    }

    /* renamed from: e */
    public final zt2 mo15664e(String str) {
        this.f21270c = str;
        return this;
    }

    /* renamed from: f */
    public final ez2 zza() {
        ez2 ez2 = new ez2(this.f21270c, this.f21271d, this.f21272e, this.f21273f, this.f21268a, (c83) null, false, (dy2) null);
        ve3 ve3 = this.f21269b;
        if (ve3 != null) {
            ez2.mo8795k(ve3);
        }
        return ez2;
    }
}
