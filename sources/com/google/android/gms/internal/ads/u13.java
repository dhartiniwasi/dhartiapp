package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u13 extends q13 {
    public u13(j13 j13, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(j13, hashSet, jSONObject, j, (byte[]) null);
    }

    /* renamed from: c */
    private final void m21373c(String str) {
        m03 a = m03.m16344a();
        if (a != null) {
            for (a03 a03 : a.mo12245c()) {
                if (this.f16129c.contains(a03.mo8163h())) {
                    a03.mo8162g().mo15264d(str, this.f16131e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13652a(String str) {
        m21373c(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f16130d.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m21373c(str);
        super.onPostExecute(str);
    }
}
