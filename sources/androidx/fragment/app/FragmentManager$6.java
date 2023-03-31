package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1220n;

class FragmentManager$6 implements C1216l {

    /* renamed from: a */
    final /* synthetic */ String f2886a;

    /* renamed from: b */
    final /* synthetic */ C1139s f2887b;

    /* renamed from: c */
    final /* synthetic */ C1208j f2888c;

    /* renamed from: d */
    final /* synthetic */ C1114n f2889d;

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        Bundle bundle;
        if (bVar == C1208j.C1210b.ON_START && (bundle = (Bundle) this.f2889d.f3070j.get(this.f2886a)) != null) {
            this.f2887b.mo4234a(this.f2886a, bundle);
            this.f2889d.mo4161q(this.f2886a);
        }
        if (bVar == C1208j.C1210b.ON_DESTROY) {
            this.f2888c.mo4401c(this);
            this.f2889d.f3071k.remove(this.f2886a);
        }
    }
}
