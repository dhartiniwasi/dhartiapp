package p202cb;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.unity3d.scar.adapter.common.C9701h;
import p129r4.C5456c;
import p129r4.C5457d;
import p389wa.C12938b;

/* renamed from: cb.e */
/* compiled from: ScarRewardedAdListener */
public class C6848e {

    /* renamed from: a */
    private C5456c f31505a;

    /* renamed from: b */
    private C9701h f31506b;

    /* renamed from: c */
    private C12938b f31507c;

    /* renamed from: d */
    private C5457d f31508d = new C6849a();

    /* renamed from: e */
    private RewardedAdCallback f31509e = new C6850b();

    /* renamed from: cb.e$a */
    /* compiled from: ScarRewardedAdListener */
    class C6849a extends C5457d {
        C6849a() {
        }
    }

    /* renamed from: cb.e$b */
    /* compiled from: ScarRewardedAdListener */
    class C6850b extends RewardedAdCallback {
        C6850b() {
        }
    }

    public C6848e(C5456c cVar, C9701h hVar) {
        this.f31505a = cVar;
        this.f31506b = hVar;
    }

    /* renamed from: a */
    public RewardedAdCallback mo22955a() {
        return this.f31509e;
    }

    /* renamed from: b */
    public C5457d mo22956b() {
        return this.f31508d;
    }

    /* renamed from: c */
    public void mo22957c(C12938b bVar) {
        this.f31507c = bVar;
    }
}
