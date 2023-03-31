package p029d1;

import android.content.Context;
import android.os.Build;
import p020c1.C1837b;
import p036e1.C4182g;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6094j;
import p170y0.C6096k;

/* renamed from: d1.f */
/* compiled from: NetworkNotRoamingController */
public class C3996f extends C3992c<C1837b> {

    /* renamed from: e */
    private static final String f23015e = C6094j.m35719f("NetworkNotRoamingCtrlr");

    public C3996f(Context context, C4647a aVar) {
        super(C4182g.m28319c(context, aVar).mo17523d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17149b(C4329p pVar) {
        return pVar.f24224j.mo20882b() == C6096k.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo17150c(C1837b bVar) {
        if (Build.VERSION.SDK_INT < 24) {
            C6094j.m35717c().mo20921a(f23015e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.mo7016a();
        } else if (!bVar.mo7016a() || !bVar.mo7018c()) {
            return true;
        } else {
            return false;
        }
    }
}
