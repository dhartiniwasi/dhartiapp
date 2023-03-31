package p238g8;

import p246h7.C10423n;
import p257i8.C10562j;
import p276k8.C11600b;
import p343rc.C12411y0;
import p367u8.C12709i;

/* renamed from: g8.p */
/* compiled from: FirebaseClientGrpcMetadataProvider */
public class C10265p implements C10234f0 {

    /* renamed from: d */
    private static final C12411y0.C12418g<String> f40796d;

    /* renamed from: e */
    private static final C12411y0.C12418g<String> f40797e;

    /* renamed from: f */
    private static final C12411y0.C12418g<String> f40798f;

    /* renamed from: a */
    private final C11600b<C10562j> f40799a;

    /* renamed from: b */
    private final C11600b<C12709i> f40800b;

    /* renamed from: c */
    private final C10423n f40801c;

    static {
        C12411y0.C12415d<String> dVar = C12411y0.f45761e;
        f40796d = C12411y0.C12418g.m59361e("x-firebase-client-log-type", dVar);
        f40797e = C12411y0.C12418g.m59361e("x-firebase-client", dVar);
        f40798f = C12411y0.C12418g.m59361e("x-firebase-gmpid", dVar);
    }

    public C10265p(C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C10423n nVar) {
        this.f40800b = bVar;
        this.f40799a = bVar2;
        this.f40801c = nVar;
    }

    /* renamed from: b */
    private void m51970b(C12411y0 y0Var) {
        C10423n nVar = this.f40801c;
        if (nVar != null) {
            String c = nVar.mo33480c();
            if (c.length() != 0) {
                y0Var.mo37170p(f40798f, c);
            }
        }
    }

    /* renamed from: a */
    public void mo32938a(C12411y0 y0Var) {
        if (this.f40799a.get() != null && this.f40800b.get() != null) {
            int a = this.f40799a.get().mo33754b("fire-fst").mo33756a();
            if (a != 0) {
                y0Var.mo37170p(f40796d, Integer.toString(a));
            }
            y0Var.mo37170p(f40797e, this.f40800b.get().mo37578a());
            m51970b(y0Var);
        }
    }
}
