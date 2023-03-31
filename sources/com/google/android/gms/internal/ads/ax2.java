package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ax2 {

    /* renamed from: a */
    private final Object f7002a;

    /* renamed from: b */
    private final String f7003b;

    /* renamed from: c */
    private final lf3 f7004c;

    /* renamed from: d */
    private final List f7005d;

    /* renamed from: e */
    private final lf3 f7006e;

    /* renamed from: f */
    final /* synthetic */ bx2 f7007f;

    private ax2(bx2 bx2, Object obj, String str, lf3 lf3, List list, lf3 lf32) {
        this.f7007f = bx2;
        this.f7002a = obj;
        this.f7003b = str;
        this.f7004c = lf3;
        this.f7005d = list;
        this.f7006e = lf32;
    }

    /* synthetic */ ax2(bx2 bx2, Object obj, String str, lf3 lf3, List list, lf3 lf32, zw2 zw2) {
        this(bx2, obj, (String) null, lf3, list, lf32);
    }

    /* renamed from: a */
    public final ow2 mo8577a() {
        Object obj = this.f7002a;
        String str = this.f7003b;
        if (str == null) {
            str = this.f7007f.mo8967f(obj);
        }
        ow2 ow2 = new ow2(obj, str, this.f7006e);
        this.f7007f.f7516c.mo9739h0(ow2);
        lf3 lf3 = this.f7004c;
        uw2 uw2 = new uw2(this, ow2);
        mf3 mf3 = dn0.f8330f;
        lf3.mo10135j(uw2, mf3);
        cf3.m10920r(ow2, new yw2(this, ow2), mf3);
        return ow2;
    }

    /* renamed from: b */
    public final ax2 mo8578b(Object obj) {
        return this.f7007f.mo8966b(obj, mo8577a());
    }

    /* renamed from: c */
    public final ax2 mo8579c(Class cls, ie3 ie3) {
        bx2 bx2 = this.f7007f;
        return new ax2(bx2, this.f7002a, this.f7003b, this.f7004c, this.f7005d, cf3.m10909g(this.f7006e, cls, ie3, bx2.f7514a));
    }

    /* renamed from: d */
    public final ax2 mo8580d(lf3 lf3) {
        return mo8583g(new vw2(lf3), dn0.f8330f);
    }

    /* renamed from: e */
    public final ax2 mo8581e(mw2 mw2) {
        return mo8582f(new xw2(mw2));
    }

    /* renamed from: f */
    public final ax2 mo8582f(ie3 ie3) {
        return mo8583g(ie3, this.f7007f.f7514a);
    }

    /* renamed from: g */
    public final ax2 mo8583g(ie3 ie3, Executor executor) {
        return new ax2(this.f7007f, this.f7002a, this.f7003b, this.f7004c, this.f7005d, cf3.m10916n(this.f7006e, ie3, executor));
    }

    /* renamed from: h */
    public final ax2 mo8584h(String str) {
        return new ax2(this.f7007f, this.f7002a, str, this.f7004c, this.f7005d, this.f7006e);
    }

    /* renamed from: i */
    public final ax2 mo8585i(long j, TimeUnit timeUnit) {
        bx2 bx2 = this.f7007f;
        return new ax2(bx2, this.f7002a, this.f7003b, this.f7004c, this.f7005d, cf3.m10917o(this.f7006e, j, timeUnit, bx2.f7515b));
    }
}
