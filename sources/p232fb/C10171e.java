package p232fb;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9701h;
import p129r4.C5456c;
import p179z3.C6334g;
import p241gb.C10308b;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: fb.e */
/* compiled from: ScarRewardedAd */
public class C10171e extends C10165a<C5456c> {
    public C10171e(Context context, C10308b bVar, C12939c cVar, C9697d dVar, C9701h hVar) {
        super(context, cVar, bVar, dVar);
        this.f40567e = new C10172f(hVar, this);
    }

    /* renamed from: a */
    public void mo22952a(Activity activity) {
        T t = this.f40563a;
        if (t != null) {
            ((C5456c) t).mo13810i(activity, ((C10172f) this.f40567e).mo32847f());
        } else {
            this.f40568f.handleError(C9695b.m50612a(this.f40565c));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo32841c(C6334g gVar, C12938b bVar) {
        C5456c.m33389c(this.f40564b, this.f40565c.mo37979b(), gVar, ((C10172f) this.f40567e).mo32846e());
    }
}
