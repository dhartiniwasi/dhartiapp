package p238g8;

import java.util.concurrent.Executor;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10409c;
import p247h8.C10460p;
import p247h8.C10468v;
import p339r8.C12258a;
import p343rc.C12287b;
import p343rc.C12335j1;
import p343rc.C12411y0;
import p404y7.C13064a;
import p404y7.C13073j;

/* renamed from: g8.r */
/* compiled from: FirestoreCallCredentials */
final class C10269r extends C12287b {

    /* renamed from: c */
    private static final C12411y0.C12418g<String> f40812c;

    /* renamed from: d */
    private static final C12411y0.C12418g<String> f40813d;

    /* renamed from: a */
    private final C13064a<C13073j> f40814a;

    /* renamed from: b */
    private final C13064a<String> f40815b;

    static {
        C12411y0.C12415d<String> dVar = C12411y0.f45761e;
        f40812c = C12411y0.C12418g.m59361e("Authorization", dVar);
        f40813d = C12411y0.C12418g.m59361e("x-firebase-appcheck", dVar);
    }

    C10269r(C13064a<C13073j> aVar, C13064a<String> aVar2) {
        this.f40814a = aVar;
        this.f40815b = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m51976c(C9975i iVar, C12287b.C12288a aVar, C9975i iVar2, C9975i iVar3) {
        C12411y0 y0Var = new C12411y0();
        if (iVar.mo26362q()) {
            String str = (String) iVar.mo26358m();
            C10468v.m52767a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                C12411y0.C12418g<String> gVar = f40812c;
                y0Var.mo37170p(gVar, "Bearer " + str);
            }
        } else {
            Exception l = iVar.mo26357l();
            if (l instanceof C10409c) {
                C10468v.m52767a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else if (l instanceof C12258a) {
                C10468v.m52767a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            } else {
                C10468v.m52770d("FirestoreCallCredentials", "Failed to get auth token: %s.", l);
                aVar.mo35260b(C12335j1.f45614n.mo37029p(l));
                return;
            }
        }
        if (iVar2.mo26362q()) {
            String str2 = (String) iVar2.mo26358m();
            if (str2 != null && !str2.isEmpty()) {
                C10468v.m52767a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                y0Var.mo37170p(f40813d, str2);
            }
        } else {
            Exception l2 = iVar2.mo26357l();
            if (l2 instanceof C10409c) {
                C10468v.m52767a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
            } else {
                C10468v.m52770d("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", l2);
                aVar.mo35260b(C12335j1.f45614n.mo37029p(l2));
                return;
            }
        }
        aVar.mo35259a(y0Var);
    }

    /* renamed from: a */
    public void mo33031a(C12287b.C12289b bVar, Executor executor, C12287b.C12288a aVar) {
        C9975i<String> a = this.f40814a.mo38094a();
        C9975i<String> a2 = this.f40815b.mo38094a();
        C9980l.m51033g(a, a2).mo26348c(C10460p.f41438b, new C10267q(a, aVar, a2));
    }
}
