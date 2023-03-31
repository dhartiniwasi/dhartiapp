package p416za;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9701h;
import p129r4.C5456c;
import p179z3.C6334g;
import p185ab.C6527b;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: za.d */
/* compiled from: ScarRewardedAd */
public class C13488d extends C13484a {

    /* renamed from: e */
    private C5456c f47877e;

    /* renamed from: f */
    private C13489e f47878f;

    public C13488d(Context context, C6527b bVar, C12939c cVar, C9697d dVar, C9701h hVar) {
        super(context, cVar, bVar, dVar);
        C5456c cVar2 = new C5456c(this.f47866a, this.f47867b.mo37979b());
        this.f47877e = cVar2;
        this.f47878f = new C13489e(cVar2, hVar);
    }

    /* renamed from: a */
    public void mo22952a(Activity activity) {
        if (this.f47877e.isLoaded()) {
            this.f47877e.show(activity, this.f47878f.mo38618a());
        } else {
            this.f47869d.handleError(C9695b.m50612a(this.f47867b));
        }
    }

    /* renamed from: c */
    public void mo38615c(C12938b bVar, C6334g gVar) {
        this.f47878f.mo38620c(bVar);
        this.f47877e.loadAd(gVar, this.f47878f.mo38619b());
    }
}
