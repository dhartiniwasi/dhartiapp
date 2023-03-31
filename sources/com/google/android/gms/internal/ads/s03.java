package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s03 {

    /* renamed from: f */
    private static s03 f17170f;

    /* renamed from: a */
    private float f17171a = 0.0f;

    /* renamed from: b */
    private final l03 f17172b;

    /* renamed from: c */
    private final j03 f17173c;

    /* renamed from: d */
    private k03 f17174d;

    /* renamed from: e */
    private m03 f17175e;

    public s03(l03 l03, j03 j03) {
        this.f17172b = l03;
        this.f17173c = j03;
    }

    /* renamed from: b */
    public static s03 m20100b() {
        if (f17170f == null) {
            f17170f = new s03(new l03(), new j03());
        }
        return f17170f;
    }

    /* renamed from: a */
    public final float mo13917a() {
        return this.f17171a;
    }

    /* renamed from: c */
    public final void mo13918c(Context context) {
        this.f17174d = new k03(new Handler(), context, new i03(), this, (byte[]) null);
    }

    /* renamed from: d */
    public final void mo13919d(float f) {
        this.f17171a = f;
        if (this.f17175e == null) {
            this.f17175e = m03.m16344a();
        }
        for (a03 g : this.f17175e.mo12244b()) {
            g.mo8162g().mo15267h(f);
        }
    }

    /* renamed from: e */
    public final void mo13920e() {
        n03.m16839a().mo12479d(this);
        n03.m16839a().mo12477b();
        p13.m18272d().mo13103i();
        this.f17174d.mo11547a();
    }

    /* renamed from: f */
    public final void mo13921f() {
        p13.m18272d().mo13104j();
        n03.m16839a().mo12478c();
        this.f17174d.mo11548b();
    }
}
