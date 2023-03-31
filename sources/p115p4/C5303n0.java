package p115p4;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.cl0;
import com.google.android.gms.internal.ads.jl0;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.ny2;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.x00;
import com.google.android.gms.internal.ads.ye3;
import com.google.android.gms.internal.ads.yy2;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* renamed from: p4.n0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C5303n0 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ lf3 f27303a;

    /* renamed from: b */
    final /* synthetic */ jl0 f27304b;

    /* renamed from: c */
    final /* synthetic */ cl0 f27305c;

    /* renamed from: d */
    final /* synthetic */ ny2 f27306d;

    /* renamed from: e */
    final /* synthetic */ long f27307e;

    /* renamed from: f */
    final /* synthetic */ C5280c f27308f;

    C5303n0(C5280c cVar, lf3 lf3, jl0 jl0, cl0 cl0, ny2 ny2, long j) {
        this.f27308f = cVar;
        this.f27303a = lf3;
        this.f27304b = jl0;
        this.f27305c = cl0;
        this.f27306d = ny2;
        this.f27307e = j;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        long a = C4409t.m29310b().mo18370a();
        long j = this.f27307e;
        String message = th.getMessage();
        C4409t.m29325q().mo15126t(th, "SignalGeneratorImpl.generateSignals");
        C5280c cVar = this.f27308f;
        C5315w.m32640c(cVar.f27256u, cVar.f27248e, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(a - j)));
        yy2 o7 = C5280c.m32574o7(this.f27303a, this.f27304b);
        if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
            ny2 ny2 = this.f27306d;
            ny2.mo11826G(false);
            o7.mo15515a(ny2);
            o7.mo15521g();
        }
        try {
            cl0 cl0 = this.f27305c;
            cl0.mo8429i("Internal error. " + message);
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        C5304o oVar = (C5304o) obj;
        yy2 o7 = C5280c.m32574o7(this.f27303a, this.f27304b);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14299F6)).booleanValue()) {
            try {
                this.f27305c.mo8429i("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                pm0.m18664d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
                ny2 ny2 = this.f27306d;
                ny2.mo11826G(false);
                o7.mo15515a(ny2);
                o7.mo15521g();
                return;
            }
            return;
        }
        long a = C4409t.m29310b().mo18370a() - this.f27307e;
        if (oVar == null) {
            try {
                this.f27305c.mo8428d2((String) null, (String) null, (Bundle) null);
                C5280c cVar = this.f27308f;
                C5315w.m32640c(cVar.f27256u, cVar.f27248e, "sgs", new Pair("rid", "-1"));
                this.f27306d.mo11826G(true);
                if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
                    o7.mo15515a(this.f27306d);
                    o7.mo15521g();
                }
            } catch (RemoteException e2) {
                this.f27306d.mo11826G(false);
                pm0.m18665e("", e2);
                if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
                    o7.mo15515a(this.f27306d);
                    o7.mo15521g();
                }
            } catch (Throwable th) {
                if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
                    o7.mo15515a(this.f27306d);
                    o7.mo15521g();
                }
                throw th;
            }
        } else {
            try {
                String optString = new JSONObject(oVar.f27310b).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    pm0.m18667g("The request ID is empty in request JSON.");
                    this.f27305c.mo8429i("Internal error: request ID is empty in request JSON.");
                    C5280c cVar2 = this.f27308f;
                    C5315w.m32640c(cVar2.f27256u, cVar2.f27248e, "sgf", new Pair("sgf_reason", "rid_missing"));
                    this.f27306d.mo11826G(false);
                    if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
                        o7.mo15515a(this.f27306d);
                        o7.mo15521g();
                        return;
                    }
                    return;
                }
                C5280c cVar3 = this.f27308f;
                C5280c.m32555P6(cVar3, optString, oVar.f27310b, cVar3.f27248e);
                Bundle bundle = oVar.f27311c;
                C5280c cVar4 = this.f27308f;
                if (cVar4.f27261z && bundle != null && bundle.getInt(cVar4.f27235B, -1) == -1) {
                    C5280c cVar5 = this.f27308f;
                    bundle.putInt(cVar5.f27235B, cVar5.f27236C.get());
                }
                C5280c cVar6 = this.f27308f;
                if (cVar6.f27260y && bundle != null && TextUtils.isEmpty(bundle.getString(cVar6.f27234A))) {
                    if (TextUtils.isEmpty(this.f27308f.f27238E)) {
                        C5280c cVar7 = this.f27308f;
                        C4751b2 r = C4409t.m29326r();
                        C5280c cVar8 = this.f27308f;
                        cVar7.f27238E = r.mo18438z(cVar8.f27245b, cVar8.f27237D.f19150a);
                    }
                    C5280c cVar9 = this.f27308f;
                    bundle.putString(cVar9.f27234A, cVar9.f27238E);
                }
                this.f27305c.mo8428d2(oVar.f27309a, oVar.f27310b, bundle);
                C5280c cVar10 = this.f27308f;
                C5315w.m32640c(cVar10.f27256u, cVar10.f27248e, "sgs", new Pair("tqgt", String.valueOf(a)));
                this.f27306d.mo11826G(true);
                if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
                    o7.mo15515a(this.f27306d);
                    o7.mo15521g();
                }
            } catch (JSONException e3) {
                pm0.m18667g("Failed to create JSON object from the request string.");
                cl0 cl0 = this.f27305c;
                String obj2 = e3.toString();
                cl0.mo8429i("Internal error for request JSON: " + obj2);
                C5280c cVar11 = this.f27308f;
                C5315w.m32640c(cVar11.f27256u, cVar11.f27248e, "sgf", new Pair("sgf_reason", "request_invalid"));
                this.f27306d.mo11826G(false);
                if (((Boolean) x00.f19925e.mo13438e()).booleanValue() && o7 != null) {
                    o7.mo15515a(this.f27306d);
                    o7.mo15521g();
                }
            }
        }
    }
}
