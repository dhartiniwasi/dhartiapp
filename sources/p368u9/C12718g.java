package p368u9;

import java.util.Formatter;

/* renamed from: u9.g */
/* compiled from: DetectionResultColumn */
class C12718g {

    /* renamed from: a */
    private final C12712c f46515a;

    /* renamed from: b */
    private final C12713d[] f46516b;

    C12718g(C12712c cVar) {
        this.f46515a = new C12712c(cVar);
        this.f46516b = new C12713d[((cVar.mo37591f() - cVar.mo37593h()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C12712c mo37616a() {
        return this.f46515a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C12713d mo37617b(int i) {
        return this.f46516b[mo37620e(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C12713d mo37618c(int i) {
        C12713d dVar;
        C12713d dVar2;
        C12713d b = mo37617b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo37620e(i) - i2;
            if (e >= 0 && (dVar2 = this.f46516b[e]) != null) {
                return dVar2;
            }
            int e2 = mo37620e(i) + i2;
            C12713d[] dVarArr = this.f46516b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C12713d[] mo37619d() {
        return this.f46516b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo37620e(int i) {
        return i - this.f46515a.mo37593h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo37621f(int i, C12713d dVar) {
        this.f46516b[mo37620e(i)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (C12713d dVar : this.f46516b) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(dVar.mo37598c()), Integer.valueOf(dVar.mo37600e())});
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
