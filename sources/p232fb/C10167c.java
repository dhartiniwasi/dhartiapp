package p232fb;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9700g;
import p080k4.C4883a;
import p179z3.C6334g;
import p241gb.C10308b;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: fb.c */
/* compiled from: ScarInterstitialAd */
public class C10167c extends C10165a<C4883a> {
    public C10167c(Context context, C10308b bVar, C12939c cVar, C9697d dVar, C9700g gVar) {
        super(context, cVar, bVar, dVar);
        this.f40567e = new C10168d(gVar, this);
    }

    /* renamed from: a */
    public void mo22952a(Activity activity) {
        T t = this.f40563a;
        if (t != null) {
            ((C4883a) t).mo13165f(activity);
        } else {
            this.f40568f.handleError(C9695b.m50612a(this.f40565c));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo32841c(C6334g gVar, C12938b bVar) {
        C4883a.m31060b(this.f40564b, this.f40565c.mo37979b(), gVar, ((C10168d) this.f40567e).mo32844e());
    }
}
