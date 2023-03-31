package p180z4;

import android.util.Log;

/* renamed from: z4.l0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
class C6383l0 {

    /* renamed from: e */
    private static final C6383l0 f30627e = new C6383l0(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f30628a;

    /* renamed from: b */
    final String f30629b;

    /* renamed from: c */
    final Throwable f30630c;

    /* renamed from: d */
    final int f30631d;

    private C6383l0(boolean z, int i, int i2, String str, Throwable th) {
        this.f30628a = z;
        this.f30631d = i;
        this.f30629b = str;
        this.f30630c = th;
    }

    /* synthetic */ C6383l0(boolean z, int i, int i2, String str, Throwable th, C6381k0 k0Var) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    /* renamed from: b */
    static C6383l0 m37472b() {
        return f30627e;
    }

    /* renamed from: c */
    static C6383l0 m37473c(String str) {
        return new C6383l0(false, 1, 5, str, (Throwable) null);
    }

    /* renamed from: d */
    static C6383l0 m37474d(String str, Throwable th) {
        return new C6383l0(false, 1, 5, str, th);
    }

    /* renamed from: f */
    static C6383l0 m37475f(int i) {
        return new C6383l0(true, i, 1, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    static C6383l0 m37476g(int i, int i2, String str, Throwable th) {
        return new C6383l0(false, i, i2, str, th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo21807a() {
        return this.f30629b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo21810e() {
        if (!this.f30628a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f30630c != null) {
                Log.d("GoogleCertificatesRslt", mo21807a(), this.f30630c);
            } else {
                Log.d("GoogleCertificatesRslt", mo21807a());
            }
        }
    }
}
