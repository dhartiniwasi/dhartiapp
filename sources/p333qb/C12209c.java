package p333qb;

import android.content.Context;
import android.os.Handler;

/* renamed from: qb.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12209c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12212f f45334a;

    /* renamed from: b */
    public final /* synthetic */ Context f45335b;

    /* renamed from: c */
    public final /* synthetic */ String[] f45336c;

    /* renamed from: d */
    public final /* synthetic */ Handler f45337d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f45338e;

    public /* synthetic */ C12209c(C12212f fVar, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f45334a = fVar;
        this.f45335b = context;
        this.f45336c = strArr;
        this.f45337d = handler;
        this.f45338e = runnable;
    }

    public final void run() {
        this.f45334a.m58646q(this.f45335b, this.f45336c, this.f45337d, this.f45338e);
    }
}
