package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e54 {

    /* renamed from: a */
    final Context f8663a;

    /* renamed from: b */
    wa1 f8664b = wa1.f19542a;

    /* renamed from: c */
    s83 f8665c;

    /* renamed from: d */
    s83 f8666d;

    /* renamed from: e */
    s83 f8667e;

    /* renamed from: f */
    s83 f8668f;

    /* renamed from: g */
    s83 f8669g;

    /* renamed from: h */
    q73 f8670h;

    /* renamed from: i */
    Looper f8671i = gb2.m13165e();

    /* renamed from: j */
    w74 f8672j = w74.f19518c;

    /* renamed from: k */
    int f8673k = 1;

    /* renamed from: l */
    boolean f8674l = true;

    /* renamed from: m */
    a84 f8675m = a84.f6473g;

    /* renamed from: n */
    long f8676n = 500;

    /* renamed from: o */
    long f8677o = 2000;

    /* renamed from: p */
    boolean f8678p = true;

    /* renamed from: q */
    boolean f8679q;

    /* renamed from: r */
    q14 f8680r = new q14(0.97f, 1.03f, 1000, 1.0E-7f, gb2.m13168f0(20), gb2.m13168f0(500), 0.999f, (p04) null);

    public e54(Context context, ds0 ds0, byte[] bArr) {
        Context context2 = context;
        y44 y44 = new y44(ds0, (byte[]) null);
        z44 z44 = new z44(context2);
        a54 a54 = new a54(context2);
        b54 b54 = b54.f7104a;
        c54 c54 = new c54(context2);
        d54 d54 = d54.f8065a;
        Objects.requireNonNull(context);
        this.f8663a = context2;
        this.f8665c = y44;
        this.f8666d = z44;
        this.f8667e = a54;
        this.f8668f = b54;
        this.f8669g = c54;
        this.f8670h = d54;
    }

    /* renamed from: a */
    static /* synthetic */ lg4 m11933a(Context context) {
        return new yf4(context, new ln4());
    }
}
