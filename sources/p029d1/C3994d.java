package p029d1;

import android.content.Context;
import android.os.Build;
import p020c1.C1837b;
import p036e1.C4182g;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6096k;

/* renamed from: d1.d */
/* compiled from: NetworkConnectedController */
public class C3994d extends C3992c<C1837b> {
    public C3994d(Context context, C4647a aVar) {
        super(C4182g.m28319c(context, aVar).mo17523d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17149b(C4329p pVar) {
        return pVar.f24224j.mo20882b() == C6096k.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo17150c(C1837b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return !bVar.mo7016a();
        }
        if (!bVar.mo7016a() || !bVar.mo7019d()) {
            return true;
        }
        return false;
    }
}
