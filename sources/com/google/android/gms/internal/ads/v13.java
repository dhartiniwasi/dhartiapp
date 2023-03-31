package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class v13 extends q13 {
    public v13(j13 j13, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(j13, hashSet, jSONObject, j, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13652a(String str) {
        m03 a;
        if (!TextUtils.isEmpty(str) && (a = m03.m16344a()) != null) {
            for (a03 a03 : a.mo12245c()) {
                if (this.f16129c.contains(a03.mo8163h())) {
                    a03.mo8162g().mo15265e(str, this.f16131e);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (c13.m10682j(this.f16130d, this.f16783b.mo11295a())) {
            return null;
        }
        this.f16783b.mo11299e(this.f16130d);
        return this.f16130d.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
