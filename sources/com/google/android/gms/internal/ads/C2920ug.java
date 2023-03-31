package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ug */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2920ug extends C2513jh {

    /* renamed from: i */
    private final C3103ze f18521i;

    /* renamed from: j */
    private final long f18522j;

    /* renamed from: k */
    private final long f18523k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2920ug(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, C3103ze zeVar, long j, long j2) {
        super(wfVar, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", ybVar, i, 11);
        this.f18521i = zeVar;
        this.f18522j = j;
        this.f18523k = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        C3103ze zeVar = this.f18521i;
        if (zeVar != null) {
            C3029xe xeVar = new C3029xe((String) this.f11604f.invoke((Object) null, new Object[]{zeVar.mo15584b(), Long.valueOf(this.f18522j), Long.valueOf(this.f18523k)}));
            synchronized (this.f11603e) {
                this.f11603e.mo15416z0(xeVar.f20075b.longValue());
                if (xeVar.f20076c.longValue() >= 0) {
                    this.f11603e.mo15367I(xeVar.f20076c.longValue());
                }
                if (xeVar.f20077d.longValue() >= 0) {
                    this.f11603e.mo15388e0(xeVar.f20077d.longValue());
                }
            }
        }
    }
}
