package p122q4;

import android.content.Context;
import com.google.android.gms.internal.ads.sf0;
import p179z3.C6323b;
import p179z3.C6334g;

/* renamed from: q4.d */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C5402d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f27623a;

    /* renamed from: b */
    public final /* synthetic */ C6323b f27624b;

    /* renamed from: c */
    public final /* synthetic */ C6334g f27625c;

    /* renamed from: d */
    public final /* synthetic */ C5401c f27626d;

    public /* synthetic */ C5402d(Context context, C6323b bVar, C6334g gVar, C5401c cVar) {
        this.f27623a = context;
        this.f27624b = bVar;
        this.f27625c = gVar;
        this.f27626d = cVar;
    }

    public final void run() {
        Context context = this.f27623a;
        C6323b bVar = this.f27624b;
        C6334g gVar = this.f27625c;
        new sf0(context, bVar, gVar == null ? null : gVar.mo229a()).mo13993b(this.f27626d);
    }
}
