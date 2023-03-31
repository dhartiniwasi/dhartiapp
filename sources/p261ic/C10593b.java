package p261ic;

import android.os.Handler;
import p264io.flutter.embedding.engine.C10697e;
import p264io.flutter.plugins.firebase.messaging.C10789b;
import p333qb.C12212f;

/* renamed from: ic.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10593b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10789b f41650a;

    /* renamed from: b */
    public final /* synthetic */ C12212f f41651b;

    /* renamed from: c */
    public final /* synthetic */ Handler f41652c;

    /* renamed from: d */
    public final /* synthetic */ C10697e f41653d;

    /* renamed from: e */
    public final /* synthetic */ long f41654e;

    public /* synthetic */ C10593b(C10789b bVar, C12212f fVar, Handler handler, C10697e eVar, long j) {
        this.f41650a = bVar;
        this.f41651b = fVar;
        this.f41652c = handler;
        this.f41653d = eVar;
        this.f41654e = j;
    }

    public final void run() {
        this.f41650a.m53950k(this.f41651b, this.f41652c, this.f41653d, this.f41654e);
    }
}
