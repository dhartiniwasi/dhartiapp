package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class r13 extends AsyncTask {

    /* renamed from: a */
    private s13 f16782a;

    /* renamed from: b */
    protected final j13 f16783b;

    public r13(j13 j13, byte[] bArr) {
        this.f16783b = j13;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        s13 s13 = this.f16782a;
        if (s13 != null) {
            s13.mo13932a(this);
        }
    }

    /* renamed from: b */
    public final void mo13653b(s13 s13) {
        this.f16782a = s13;
    }
}
