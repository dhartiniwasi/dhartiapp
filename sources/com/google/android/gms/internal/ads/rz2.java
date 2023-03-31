package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rz2 {

    /* renamed from: a */
    private final Context f17148a;

    /* renamed from: b */
    private final Executor f17149b;

    /* renamed from: c */
    private final um0 f17150c;

    /* renamed from: d */
    private final az2 f17151d;

    rz2(Context context, Executor executor, um0 um0, az2 az2) {
        this.f17148a = context;
        this.f17149b = executor;
        this.f17150c = um0;
        this.f17151d = az2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13907a(String str) {
        this.f17150c.mo9501f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo13908b(String str, yy2 yy2) {
        ny2 a = my2.m16825a(this.f17148a, 14);
        a.mo11828T();
        a.mo11826G(this.f17150c.mo9501f(str));
        if (yy2 == null) {
            this.f17151d.mo8629b(a.mo11831W());
            return;
        }
        yy2.mo15515a(a);
        yy2.mo15521g();
    }

    /* renamed from: c */
    public final void mo13909c(String str, yy2 yy2) {
        if (!az2.m10140a() || !((Boolean) x00.f19924d.mo13438e()).booleanValue()) {
            this.f17149b.execute(new pz2(this, str));
        } else {
            this.f17149b.execute(new qz2(this, str, yy2));
        }
    }

    /* renamed from: d */
    public final void mo13910d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo13909c((String) it.next(), (yy2) null);
        }
    }
}
