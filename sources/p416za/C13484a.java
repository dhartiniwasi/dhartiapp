package p416za;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import p122q4.C5399a;
import p179z3.C6334g;
import p185ab.C6527b;
import p389wa.C12937a;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: za.a */
/* compiled from: ScarAdBase */
public abstract class C13484a implements C12937a {

    /* renamed from: a */
    protected Context f47866a;

    /* renamed from: b */
    protected C12939c f47867b;

    /* renamed from: c */
    protected C6527b f47868c;

    /* renamed from: d */
    protected C9697d f47869d;

    public C13484a(Context context, C12939c cVar, C6527b bVar, C9697d dVar) {
        this.f47866a = context;
        this.f47867b = cVar;
        this.f47868c = bVar;
        this.f47869d = dVar;
    }

    /* renamed from: b */
    public void mo38614b(C12938b bVar) {
        C6527b bVar2 = this.f47868c;
        if (bVar2 != null) {
            mo38615c(bVar, new C6334g.C6335a().mo231d(new C5399a(bVar2.mo22118c(), this.f47867b.mo37978a())).mo230c());
            return;
        }
        this.f47869d.handleError(C9695b.m50618g(this.f47867b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo38615c(C12938b bVar, C6334g gVar);
}
