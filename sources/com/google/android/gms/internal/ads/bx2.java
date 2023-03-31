package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class bx2 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final lf3 f7513d = cf3.m10911i((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final mf3 f7514a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f7515b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final dx2 f7516c;

    public bx2(mf3 mf3, ScheduledExecutorService scheduledExecutorService, dx2 dx2) {
        this.f7514a = mf3;
        this.f7515b = scheduledExecutorService;
        this.f7516c = dx2;
    }

    /* renamed from: a */
    public final rw2 mo8965a(Object obj, lf3... lf3Arr) {
        return new rw2(this, obj, Arrays.asList(lf3Arr), (qw2) null);
    }

    /* renamed from: b */
    public final ax2 mo8966b(Object obj, lf3 lf3) {
        return new ax2(this, obj, (String) null, lf3, Collections.singletonList(lf3), lf3, (zw2) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo8967f(Object obj);
}
