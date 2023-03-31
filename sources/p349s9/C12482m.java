package p349s9;

/* renamed from: s9.m */
/* compiled from: CurrentParsingState */
final class C12482m {

    /* renamed from: a */
    private int f45881a = 0;

    /* renamed from: b */
    private C12483a f45882b = C12483a.NUMERIC;

    /* renamed from: s9.m$a */
    /* compiled from: CurrentParsingState */
    private enum C12483a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C12482m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo37256a() {
        return this.f45881a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37257b(int i) {
        this.f45881a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo37258c() {
        return this.f45882b == C12483a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo37259d() {
        return this.f45882b == C12483a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo37260e() {
        this.f45882b = C12483a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo37261f() {
        this.f45882b = C12483a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo37262g() {
        this.f45882b = C12483a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo37263h(int i) {
        this.f45881a = i;
    }
}
