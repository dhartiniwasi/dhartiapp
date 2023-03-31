package p404y7;

import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10409c;
import p247h8.C10460p;
import p247h8.C10467u;
import p275k7.C11597a;
import p276k8.C11598a;
import p276k8.C11600b;
import p284l7.C11759a;
import p284l7.C11760b;

/* renamed from: y7.e */
/* compiled from: FirebaseAppCheckTokenProvider */
public final class C13068e extends C13064a<String> {

    /* renamed from: a */
    private C10467u<String> f47313a;

    /* renamed from: b */
    private C11760b f47314b;

    /* renamed from: c */
    private boolean f47315c;

    /* renamed from: d */
    private final C11759a f47316d = new C13067d(this);

    public C13068e(C11598a<C11760b> aVar) {
        aVar.mo35752a(new C13066c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ C9975i m61413g(C9975i iVar) throws Exception {
        if (iVar.mo26362q()) {
            return C9980l.m51031e(((C11597a) iVar.mo26358m()).mo35751a());
        }
        return C9980l.m51030d(iVar.mo26357l());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m61414h(C11600b bVar) {
        synchronized (this) {
            C11760b bVar2 = (C11760b) bVar.get();
            this.f47314b = bVar2;
            if (bVar2 != null) {
                bVar2.mo35999c(this.f47316d);
            }
        }
    }

    /* renamed from: a */
    public synchronized C9975i<String> mo38094a() {
        C11760b bVar = this.f47314b;
        if (bVar == null) {
            return C9980l.m51030d(new C10409c("AppCheck is not available"));
        }
        C9975i<C11597a> a = bVar.mo35997a(this.f47315c);
        this.f47315c = false;
        return a.mo26356k(C10460p.f41438b, C13065b.f47310a);
    }

    /* renamed from: b */
    public synchronized void mo38095b() {
        this.f47315c = true;
    }

    /* renamed from: c */
    public synchronized void mo38096c() {
        this.f47313a = null;
        C11760b bVar = this.f47314b;
        if (bVar != null) {
            bVar.mo35998b(this.f47316d);
        }
    }

    /* renamed from: d */
    public synchronized void mo38097d(C10467u<String> uVar) {
        this.f47313a = uVar;
    }
}
