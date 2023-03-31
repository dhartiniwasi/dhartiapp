package p016b4;

import android.content.Context;
import com.google.android.gms.internal.ads.C3007wt;
import com.google.android.gms.internal.ads.ag0;
import p006a4.C0095a;
import p016b4.C1781a;

/* renamed from: b4.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C1783b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5299a;

    /* renamed from: b */
    public final /* synthetic */ String f5300b;

    /* renamed from: c */
    public final /* synthetic */ C0095a f5301c;

    /* renamed from: d */
    public final /* synthetic */ int f5302d;

    /* renamed from: e */
    public final /* synthetic */ C1781a.C1782a f5303e;

    public /* synthetic */ C1783b(Context context, String str, C0095a aVar, int i, C1781a.C1782a aVar2) {
        this.f5299a = context;
        this.f5300b = str;
        this.f5301c = aVar;
        this.f5302d = i;
        this.f5303e = aVar2;
    }

    public final void run() {
        Context context = this.f5299a;
        String str = this.f5300b;
        C0095a aVar = this.f5301c;
        try {
            new C3007wt(context, str, aVar.mo229a(), this.f5302d, this.f5303e).mo14991a();
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "AppOpenAdManager.load");
        }
    }
}
