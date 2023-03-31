package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tu2 {

    /* renamed from: a */
    private final su2 f18258a = new su2();

    /* renamed from: b */
    private int f18259b;

    /* renamed from: c */
    private int f18260c;

    /* renamed from: d */
    private int f18261d;

    /* renamed from: e */
    private int f18262e;

    /* renamed from: f */
    private int f18263f;

    tu2() {
    }

    /* renamed from: a */
    public final su2 mo14392a() {
        su2 a = this.f18258a.clone();
        su2 su2 = this.f18258a;
        su2.f17661a = false;
        su2.f17662b = false;
        return a;
    }

    /* renamed from: b */
    public final String mo14393b() {
        return "\n\tPool does not exist: " + this.f18261d + "\n\tNew pools created: " + this.f18259b + "\n\tPools removed: " + this.f18260c + "\n\tEntries added: " + this.f18263f + "\n\tNo entries retrieved: " + this.f18262e + "\n";
    }

    /* renamed from: c */
    public final void mo14394c() {
        this.f18263f++;
    }

    /* renamed from: d */
    public final void mo14395d() {
        this.f18259b++;
        this.f18258a.f17661a = true;
    }

    /* renamed from: e */
    public final void mo14396e() {
        this.f18262e++;
    }

    /* renamed from: f */
    public final void mo14397f() {
        this.f18261d++;
    }

    /* renamed from: g */
    public final void mo14398g() {
        this.f18260c++;
        this.f18258a.f17662b = true;
    }
}
