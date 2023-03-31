package p188ae;

import kotlinx.coroutines.internal.C11690e0;
import kotlinx.coroutines.internal.C11721r;
import p410yd.C13326m;
import p410yd.C13333o0;

/* renamed from: ae.j */
/* compiled from: AbstractChannel.kt */
public final class C6595j<E> extends C6604s implements C6602q<E> {

    /* renamed from: d */
    public final Throwable f31058d;

    /* renamed from: B */
    public C6595j<E> mo22233a() {
        return this;
    }

    /* renamed from: C */
    public C6595j<E> mo22220y() {
        return this;
    }

    /* renamed from: D */
    public final Throwable mo22231D() {
        Throwable th = this.f31058d;
        return th == null ? new C6596k("Channel was closed") : th;
    }

    /* renamed from: E */
    public final Throwable mo22232E() {
        Throwable th = this.f31058d;
        return th == null ? new C6597l("Channel was closed") : th;
    }

    /* renamed from: f */
    public void mo22201f(E e) {
    }

    /* renamed from: g */
    public C11690e0 mo22202g(E e, C11721r.C11723b bVar) {
        return C13326m.f47647a;
    }

    public String toString() {
        return "Closed@" + C13333o0.m62288b(this) + '[' + this.f31058d + ']';
    }

    /* renamed from: x */
    public void mo22219x() {
    }

    /* renamed from: z */
    public C11690e0 mo22221z(C11721r.C11723b bVar) {
        return C13326m.f47647a;
    }
}
