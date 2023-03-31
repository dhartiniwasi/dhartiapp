package p273je;

import java.io.IOException;
import p244ge.C10351a0;
import p244ge.C10360d0;
import p244ge.C10367f0;
import p244ge.C10399y;
import p282ke.C11640g;

/* renamed from: je.a */
/* compiled from: ConnectInterceptor */
public final class C11577a implements C10399y {

    /* renamed from: a */
    public final C10351a0 f44050a;

    public C11577a(C10351a0 a0Var) {
        this.f44050a = a0Var;
    }

    /* renamed from: a */
    public C10367f0 mo33446a(C10399y.C10400a aVar) throws IOException {
        C11640g gVar = (C11640g) aVar;
        C10360d0 e = gVar.mo33451e();
        C11590k h = gVar.mo35802h();
        return gVar.mo35801g(e, h, h.mo35741k(aVar, !e.mo33258f().equals("GET")));
    }
}
