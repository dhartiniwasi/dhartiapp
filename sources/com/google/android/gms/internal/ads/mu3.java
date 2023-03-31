package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mu3 implements qg3 {

    /* renamed from: f */
    private static final byte[] f13509f = new byte[0];

    /* renamed from: a */
    private final pu3 f13510a;

    /* renamed from: b */
    private final String f13511b;

    /* renamed from: c */
    private final byte[] f13512c;

    /* renamed from: d */
    private final ju3 f13513d;

    /* renamed from: e */
    private final int f13514e;

    public mu3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, ju3 ju3) throws GeneralSecurityException {
        qu3.m19360d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f13510a = new pu3(eCPublicKey);
        this.f13512c = bArr;
        this.f13511b = str;
        this.f13514e = i;
        this.f13513d = ju3;
    }

    /* renamed from: a */
    public final byte[] mo12040a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ou3 a = this.f13510a.mo13392a(this.f13511b, this.f13512c, bArr2, this.f13513d.zza(), this.f13514e);
        byte[] a2 = this.f13513d.mo11517b(a.mo13039b()).mo12044a(bArr, f13509f);
        byte[] a3 = a.mo13038a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
