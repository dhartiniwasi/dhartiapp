package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p053g4.C4390a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wq1 implements Callable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4390a f19743a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final it0 f19744b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f19745c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final gv1 f19746d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ux2 f19747e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final o42 f19748f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Executor f19749g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2955ve f19750h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final vm0 f19751i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final rz2 f19752j;

    public wq1(Context context, Executor executor, C2955ve veVar, vm0 vm0, C4390a aVar, it0 it0, o42 o42, rz2 rz2, gv1 gv1, ux2 ux2) {
        this.f19745c = context;
        this.f19749g = executor;
        this.f19750h = veVar;
        this.f19751i = vm0;
        this.f19743a = aVar;
        this.f19744b = it0;
        this.f19748f = o42;
        this.f19752j = rz2;
        this.f19746d = gv1;
        this.f19747e = ux2;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zq1 zq1 = new zq1(this);
        zq1.mo15646h();
        return zq1;
    }
}
