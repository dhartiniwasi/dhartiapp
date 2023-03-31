package p016b4;

import android.content.Context;
import com.google.android.gms.internal.ads.C3007wt;
import com.google.android.gms.internal.ads.ag0;
import p016b4.C1781a;
import p179z3.C6334g;

/* renamed from: b4.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C1784c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5304a;

    /* renamed from: b */
    public final /* synthetic */ String f5305b;

    /* renamed from: c */
    public final /* synthetic */ C6334g f5306c;

    /* renamed from: d */
    public final /* synthetic */ int f5307d;

    /* renamed from: e */
    public final /* synthetic */ C1781a.C1782a f5308e;

    public /* synthetic */ C1784c(Context context, String str, C6334g gVar, int i, C1781a.C1782a aVar) {
        this.f5304a = context;
        this.f5305b = str;
        this.f5306c = gVar;
        this.f5307d = i;
        this.f5308e = aVar;
    }

    public final void run() {
        Context context = this.f5304a;
        String str = this.f5305b;
        C6334g gVar = this.f5306c;
        try {
            new C3007wt(context, str, gVar.mo229a(), this.f5307d, this.f5308e).mo14991a();
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "AppOpenAd.load");
        }
    }
}
