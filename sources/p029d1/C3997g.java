package p029d1;

import android.content.Context;
import android.os.Build;
import p020c1.C1837b;
import p036e1.C4182g;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6096k;

/* renamed from: d1.g */
/* compiled from: NetworkUnmeteredController */
public class C3997g extends C3992c<C1837b> {
    public C3997g(Context context, C4647a aVar) {
        super(C4182g.m28319c(context, aVar).mo17523d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17149b(C4329p pVar) {
        return pVar.f24224j.mo20882b() == C6096k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f24224j.mo20882b() == C6096k.TEMPORARILY_UNMETERED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo17150c(C1837b bVar) {
        return !bVar.mo7016a() || bVar.mo7017b();
    }
}
