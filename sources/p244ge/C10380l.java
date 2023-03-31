package p244ge;

import java.util.concurrent.TimeUnit;
import p273je.C11585g;

/* renamed from: ge.l */
/* compiled from: ConnectionPool */
public final class C10380l {

    /* renamed from: a */
    final C11585g f41258a;

    public C10380l() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C10380l(int i, long j, TimeUnit timeUnit) {
        this.f41258a = new C11585g(i, j, timeUnit);
    }
}
