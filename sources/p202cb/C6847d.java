package p202cb;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9701h;
import p129r4.C5456c;
import p179z3.C6334g;
import p214db.C9928b;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: cb.d */
/* compiled from: ScarRewardedAd */
public class C6847d extends C6843a {

    /* renamed from: e */
    private C5456c f31503e;

    /* renamed from: f */
    private C6848e f31504f;

    public C6847d(Context context, C9928b bVar, C12939c cVar, C9697d dVar, C9701h hVar) {
        super(context, cVar, bVar, dVar);
        C5456c cVar2 = new C5456c(this.f31492a, this.f31493b.mo37979b());
        this.f31503e = cVar2;
        this.f31504f = new C6848e(cVar2, hVar);
    }

    /* renamed from: a */
    public void mo22952a(Activity activity) {
        if (this.f31503e.isLoaded()) {
            this.f31503e.show(activity, this.f31504f.mo22955a());
        } else {
            this.f31495d.handleError(C9695b.m50612a(this.f31493b));
        }
    }

    /* renamed from: c */
    public void mo22951c(C12938b bVar, C6334g gVar) {
        this.f31504f.mo22957c(bVar);
        this.f31503e.loadAd(gVar, this.f31504f.mo22956b());
    }
}
