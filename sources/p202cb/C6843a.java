package p202cb;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import p122q4.C5399a;
import p179z3.C6334g;
import p214db.C9928b;
import p389wa.C12937a;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: cb.a */
/* compiled from: ScarAdBase */
public abstract class C6843a implements C12937a {

    /* renamed from: a */
    protected Context f31492a;

    /* renamed from: b */
    protected C12939c f31493b;

    /* renamed from: c */
    protected C9928b f31494c;

    /* renamed from: d */
    protected C9697d f31495d;

    public C6843a(Context context, C12939c cVar, C9928b bVar, C9697d dVar) {
        this.f31492a = context;
        this.f31493b = cVar;
        this.f31494c = bVar;
        this.f31495d = dVar;
    }

    /* renamed from: b */
    public void mo22950b(C12938b bVar) {
        C9928b bVar2 = this.f31494c;
        if (bVar2 != null) {
            mo22951c(bVar, new C6334g.C6335a().mo231d(new C5399a(bVar2.mo32488c(), this.f31493b.mo37978a())).mo230c());
            return;
        }
        this.f31495d.handleError(C9695b.m50618g(this.f31493b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo22951c(C12938b bVar, C6334g gVar);
}
