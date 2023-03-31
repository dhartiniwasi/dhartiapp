package p417zb;

import java.util.ArrayList;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.n */
/* compiled from: SpellCheckChannel */
public class C13539n {

    /* renamed from: a */
    public final C6556k f48018a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13541b f48019b;

    /* renamed from: c */
    public final C6556k.C6560c f48020c;

    /* renamed from: zb.n$a */
    /* compiled from: SpellCheckChannel */
    class C13540a implements C6556k.C6560c {
        C13540a() {
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            if (C13539n.this.f48019b == null) {
                C11881b.m57388f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f30999a;
            Object obj = jVar.f31000b;
            C11881b.m57388f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.notImplemented();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                C13539n.this.f48019b.mo34194a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e) {
                dVar.error("error", e.getMessage(), (Object) null);
            }
        }
    }

    /* renamed from: zb.n$b */
    /* compiled from: SpellCheckChannel */
    public interface C13541b {
        /* renamed from: a */
        void mo34194a(String str, String str2, C6556k.C6561d dVar);
    }

    public C13539n(C12051a aVar) {
        C13540a aVar2 = new C13540a();
        this.f48020c = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/spellcheck", C6570s.f31014b);
        this.f48018a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* renamed from: b */
    public void mo38654b(C13541b bVar) {
        this.f48019b = bVar;
    }
}
