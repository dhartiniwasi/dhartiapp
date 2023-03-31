package p350sa;

import p186ac.C6539c;
import p186ac.C6544d;

/* renamed from: sa.e */
/* compiled from: BetterEventChannel */
public class C12497e implements C6544d.C6546b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6544d.C6546b f45948a;

    /* renamed from: sa.e$a */
    /* compiled from: BetterEventChannel */
    class C12498a implements C6544d.C6549d {
        C12498a() {
        }

        /* renamed from: e */
        public void mo22145e(Object obj, C6544d.C6546b bVar) {
            C6544d.C6546b unused = C12497e.this.f45948a = bVar;
        }

        /* renamed from: i */
        public void mo22146i(Object obj) {
            C6544d.C6546b unused = C12497e.this.f45948a = null;
        }
    }

    public C12497e(C6539c cVar, String str) {
        new C6544d(cVar, str).mo22141d(new C12498a());
    }

    /* renamed from: a */
    public void mo22142a() {
        C6544d.C6546b bVar = this.f45948a;
        if (bVar != null) {
            bVar.mo22142a();
        }
    }

    public void error(String str, String str2, Object obj) {
        C6544d.C6546b bVar = this.f45948a;
        if (bVar != null) {
            bVar.error(str, str2, obj);
        }
    }

    public void success(Object obj) {
        C6544d.C6546b bVar = this.f45948a;
        if (bVar != null) {
            bVar.success(obj);
        }
    }
}
