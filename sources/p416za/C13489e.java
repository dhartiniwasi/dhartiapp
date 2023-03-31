package p416za;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.unity3d.scar.adapter.common.C9701h;
import p129r4.C5456c;
import p129r4.C5457d;
import p389wa.C12938b;

/* renamed from: za.e */
/* compiled from: ScarRewardedAdListener */
public class C13489e {

    /* renamed from: a */
    private C5456c f47879a;

    /* renamed from: b */
    private C9701h f47880b;

    /* renamed from: c */
    private C12938b f47881c;

    /* renamed from: d */
    private C5457d f47882d = new C13490a();

    /* renamed from: e */
    private RewardedAdCallback f47883e = new C13491b();

    /* renamed from: za.e$a */
    /* compiled from: ScarRewardedAdListener */
    class C13490a extends C5457d {
        C13490a() {
        }
    }

    /* renamed from: za.e$b */
    /* compiled from: ScarRewardedAdListener */
    class C13491b extends RewardedAdCallback {
        C13491b() {
        }
    }

    public C13489e(C5456c cVar, C9701h hVar) {
        this.f47879a = cVar;
        this.f47880b = hVar;
    }

    /* renamed from: a */
    public RewardedAdCallback mo38618a() {
        return this.f47883e;
    }

    /* renamed from: b */
    public C5457d mo38619b() {
        return this.f47882d;
    }

    /* renamed from: c */
    public void mo38620c(C12938b bVar) {
        this.f47881c = bVar;
    }
}
