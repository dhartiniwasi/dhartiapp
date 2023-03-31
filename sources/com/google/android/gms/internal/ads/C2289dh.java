package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.dh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2289dh extends C2513jh {

    /* renamed from: i */
    private final C2288dg f8254i;

    /* renamed from: j */
    private long f8255j;

    public C2289dh(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, C2288dg dgVar) {
        super(wfVar, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", ybVar, i, 53);
        this.f8254i = dgVar;
        if (dgVar != null) {
            this.f8255j = dgVar.mo9570a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        if (this.f8254i != null) {
            this.f11603e.mo15366H(((Long) this.f11604f.invoke((Object) null, new Object[]{Long.valueOf(this.f8255j)})).longValue());
        }
    }
}
