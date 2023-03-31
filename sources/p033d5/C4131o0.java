package p033d5;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p007a5.C0106c;
import p033d5.C4137q;
import p218e6.C9977j;

/* renamed from: d5.o0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4131o0 implements C0106c.C0107a {

    /* renamed from: a */
    final /* synthetic */ C0106c f23364a;

    /* renamed from: b */
    final /* synthetic */ C9977j f23365b;

    /* renamed from: c */
    final /* synthetic */ C4137q.C4138a f23366c;

    /* renamed from: d */
    final /* synthetic */ C4139q0 f23367d;

    C4131o0(C0106c cVar, C9977j jVar, C4137q.C4138a aVar, C4139q0 q0Var) {
        this.f23364a = cVar;
        this.f23365b = jVar;
        this.f23366c = aVar;
        this.f23367d = q0Var;
    }

    /* renamed from: a */
    public final void mo255a(Status status) {
        if (status.mo7953M1()) {
            this.f23365b.mo32544c(this.f23366c.mo17444a(this.f23364a.mo254b(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f23365b.mo32543b(C4084b.m28028a(status));
    }
}
