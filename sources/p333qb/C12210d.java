package p333qb;

import android.content.Context;
import android.os.Handler;

/* renamed from: qb.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12210d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12212f f45339a;

    /* renamed from: b */
    public final /* synthetic */ Context f45340b;

    /* renamed from: c */
    public final /* synthetic */ String[] f45341c;

    /* renamed from: d */
    public final /* synthetic */ Handler f45342d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f45343e;

    public /* synthetic */ C12210d(C12212f fVar, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f45339a = fVar;
        this.f45340b = context;
        this.f45341c = strArr;
        this.f45342d = handler;
        this.f45343e = runnable;
    }

    public final void run() {
        this.f45339a.m58645p(this.f45340b, this.f45341c, this.f45342d, this.f45343e);
    }
}
