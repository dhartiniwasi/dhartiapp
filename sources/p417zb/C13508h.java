package p417zb;

import p186ac.C6552g;
import p186ac.C6555j;
import p186ac.C6556k;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.h */
/* compiled from: NavigationChannel */
public class C13508h {

    /* renamed from: a */
    public final C6556k f47909a;

    /* renamed from: b */
    private final C6556k.C6560c f47910b;

    /* renamed from: zb.h$a */
    /* compiled from: NavigationChannel */
    class C13509a implements C6556k.C6560c {
        C13509a() {
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            dVar.success((Object) null);
        }
    }

    public C13508h(C12051a aVar) {
        C13509a aVar2 = new C13509a();
        this.f47910b = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/navigation", C6552g.f30998a);
        this.f47909a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* renamed from: a */
    public void mo38636a() {
        C11881b.m57388f("NavigationChannel", "Sending message to pop route.");
        this.f47909a.mo22159c("popRoute", (Object) null);
    }

    /* renamed from: b */
    public void mo38637b(String str) {
        C11881b.m57388f("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f47909a.mo22159c("pushRoute", str);
    }

    /* renamed from: c */
    public void mo38638c(String str) {
        C11881b.m57388f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f47909a.mo22159c("setInitialRoute", str);
    }
}
