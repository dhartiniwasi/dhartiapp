package p300me;

import java.io.IOException;

/* renamed from: me.n */
/* compiled from: StreamResetException */
public final class C11926n extends IOException {

    /* renamed from: a */
    public final C11889b f44810a;

    public C11926n(C11889b bVar) {
        super("stream was reset: " + bVar);
        this.f44810a = bVar;
    }
}
