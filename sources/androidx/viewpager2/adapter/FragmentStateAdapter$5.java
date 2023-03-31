package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1220n;

class FragmentStateAdapter$5 implements C1216l {

    /* renamed from: a */
    final /* synthetic */ Handler f4357a;

    /* renamed from: b */
    final /* synthetic */ Runnable f4358b;

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        if (bVar == C1208j.C1210b.ON_DESTROY) {
            this.f4357a.removeCallbacks(this.f4358b);
            nVar.getLifecycle().mo4401c(this);
        }
    }
}
