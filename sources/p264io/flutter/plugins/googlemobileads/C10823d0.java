package p264io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p129r4.C5454a;
import p129r4.C5455b;
import p129r4.C5456c;
import p129r4.C5457d;
import p179z3.C6344n;
import p179z3.C6349s;
import p264io.flutter.plugins.googlemobileads.C10826e;

/* renamed from: io.flutter.plugins.googlemobileads.d0 */
/* compiled from: FlutterRewardedAd */
class C10823d0 extends C10826e.C10830d {

    /* renamed from: b */
    private final C10813a f42267b;

    /* renamed from: c */
    private final String f42268c;

    /* renamed from: d */
    private final C10838h f42269d;

    /* renamed from: e */
    private final C10853l f42270e;

    /* renamed from: f */
    private final C10843i f42271f;

    /* renamed from: g */
    C5456c f42272g;

    /* renamed from: io.flutter.plugins.googlemobileads.d0$a */
    /* compiled from: FlutterRewardedAd */
    private static final class C10824a extends C5457d implements C5454a, C6349s {

        /* renamed from: a */
        private final WeakReference<C10823d0> f42273a;

        C10824a(C10823d0 d0Var) {
            this.f42273a = new WeakReference<>(d0Var);
        }

        /* renamed from: a */
        public void mo12728a(C5455b bVar) {
            if (this.f42273a.get() != null) {
                ((C10823d0) this.f42273a.get()).mo34488i(bVar);
            }
        }

        /* renamed from: b */
        public void mo19755b() {
            if (this.f42273a.get() != null) {
                ((C10823d0) this.f42273a.get()).mo34487h();
            }
        }

        /* renamed from: d */
        public void mo7703d(C6344n nVar) {
            if (this.f42273a.get() != null) {
                ((C10823d0) this.f42273a.get()).mo34485f(nVar);
            }
        }

        /* renamed from: f */
        public void mo7704e(C5456c cVar) {
            if (this.f42273a.get() != null) {
                ((C10823d0) this.f42273a.get()).mo34486g(cVar);
            }
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.d0$b */
    /* compiled from: FlutterRewardedAd */
    static class C10825b {

        /* renamed from: a */
        final Integer f42274a;

        /* renamed from: b */
        final String f42275b;

        C10825b(Integer num, String str) {
            this.f42274a = num;
            this.f42275b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10825b)) {
                return false;
            }
            C10825b bVar = (C10825b) obj;
            if (!this.f42274a.equals(bVar.f42274a)) {
                return false;
            }
            return this.f42275b.equals(bVar.f42275b);
        }

        public int hashCode() {
            return (this.f42274a.hashCode() * 31) + this.f42275b.hashCode();
        }
    }

    public C10823d0(int i, C10813a aVar, String str, C10853l lVar, C10838h hVar) {
        super(i);
        this.f42267b = aVar;
        this.f42268c = str;
        this.f42270e = lVar;
        this.f42271f = null;
        this.f42269d = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        this.f42272g = null;
    }

    /* renamed from: c */
    public void mo34482c(boolean z) {
        C5456c cVar = this.f42272g;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.mo13806e(z);
        }
    }

    /* renamed from: d */
    public void mo34483d() {
        if (this.f42272g == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else if (this.f42267b.mo34452f() == null) {
            Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
        } else {
            this.f42272g.mo13805d(new C10869s(this.f42267b, this.f42276a));
            this.f42272g.mo13807f(new C10824a(this));
            this.f42272g.mo13810i(this.f42267b.mo34452f(), new C10824a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo34484e() {
        C10824a aVar = new C10824a(this);
        C10853l lVar = this.f42270e;
        if (lVar != null) {
            C10838h hVar = this.f42269d;
            String str = this.f42268c;
            hVar.mo34536i(str, lVar.mo34558b(str), aVar);
            return;
        }
        C10843i iVar = this.f42271f;
        if (iVar != null) {
            C10838h hVar2 = this.f42269d;
            String str2 = this.f42268c;
            hVar2.mo34531d(str2, iVar.mo34541k(str2), aVar);
            return;
        }
        Log.e("FlutterRewardedAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34485f(C6344n nVar) {
        this.f42267b.mo34456k(this.f42276a, new C10826e.C10829c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34486g(C5456c cVar) {
        this.f42272g = cVar;
        cVar.mo13808g(new C10815a0(this.f42267b, this));
        this.f42267b.mo34458m(this.f42276a, cVar.mo13804a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo34487h() {
        this.f42267b.mo34459n(this.f42276a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo34488i(C5455b bVar) {
        this.f42267b.mo34466u(this.f42276a, new C10825b(Integer.valueOf(bVar.mo14016a()), bVar.getType()));
    }

    /* renamed from: j */
    public void mo34489j(C10835f0 f0Var) {
        C5456c cVar = this.f42272g;
        if (cVar != null) {
            cVar.mo13809h(f0Var.mo34522a());
        } else {
            Log.e("FlutterRewardedAd", "RewardedAd is null in setServerSideVerificationOptions");
        }
    }

    public C10823d0(int i, C10813a aVar, String str, C10843i iVar, C10838h hVar) {
        super(i);
        this.f42267b = aVar;
        this.f42268c = str;
        this.f42271f = iVar;
        this.f42270e = null;
        this.f42269d = hVar;
    }
}
