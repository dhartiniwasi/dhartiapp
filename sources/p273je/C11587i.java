package p273je;

import java.io.IOException;
import p253he.C10543e;

/* renamed from: je.i */
/* compiled from: RouteException */
public final class C11587i extends RuntimeException {

    /* renamed from: a */
    private IOException f44106a;

    /* renamed from: b */
    private IOException f44107b;

    C11587i(IOException iOException) {
        super(iOException);
        this.f44106a = iOException;
        this.f44107b = iOException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo35725a(IOException iOException) {
        C10543e.m53041b(this.f44106a, iOException);
        this.f44107b = iOException;
    }

    /* renamed from: b */
    public IOException mo35726b() {
        return this.f44106a;
    }

    /* renamed from: c */
    public IOException mo35727c() {
        return this.f44107b;
    }
}
