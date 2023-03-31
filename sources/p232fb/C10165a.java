package p232fb;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import p122q4.C5399a;
import p179z3.C6334g;
import p241gb.C10308b;
import p389wa.C12937a;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: fb.a */
/* compiled from: ScarAdBase */
public abstract class C10165a<T> implements C12937a {

    /* renamed from: a */
    protected T f40563a;

    /* renamed from: b */
    protected Context f40564b;

    /* renamed from: c */
    protected C12939c f40565c;

    /* renamed from: d */
    protected C10308b f40566d;

    /* renamed from: e */
    protected C10166b f40567e;

    /* renamed from: f */
    protected C9697d f40568f;

    public C10165a(Context context, C12939c cVar, C10308b bVar, C9697d dVar) {
        this.f40564b = context;
        this.f40565c = cVar;
        this.f40566d = bVar;
        this.f40568f = dVar;
    }

    /* renamed from: b */
    public void mo32840b(C12938b bVar) {
        C10308b bVar2 = this.f40566d;
        if (bVar2 != null) {
            C6334g c = new C6334g.C6335a().mo231d(new C5399a(bVar2.mo33155c(), this.f40565c.mo37978a())).mo230c();
            this.f40567e.mo32843a(bVar);
            mo32841c(c, bVar);
            return;
        }
        this.f40568f.handleError(C9695b.m50618g(this.f40565c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo32841c(C6334g gVar, C12938b bVar);

    /* renamed from: d */
    public void mo32842d(T t) {
        this.f40563a = t;
    }
}
