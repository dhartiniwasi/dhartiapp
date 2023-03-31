package p115p4;

import java.util.concurrent.Callable;

/* renamed from: p4.q */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C5308q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C5276a f27319a;

    /* renamed from: b */
    public final /* synthetic */ String f27320b;

    public /* synthetic */ C5308q(C5276a aVar, String str) {
        this.f27319a = aVar;
        this.f27320b = str;
    }

    public final Object call() {
        return this.f27319a.getClickSignals(this.f27320b);
    }
}
