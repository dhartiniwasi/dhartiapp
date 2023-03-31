package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class q13 extends r13 {

    /* renamed from: c */
    protected final HashSet f16129c;

    /* renamed from: d */
    protected final JSONObject f16130d;

    /* renamed from: e */
    protected final long f16131e;

    public q13(j13 j13, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(j13, (byte[]) null);
        this.f16129c = new HashSet(hashSet);
        this.f16130d = jSONObject;
        this.f16131e = j;
    }
}
