package p115p4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C2955ve;
import com.google.android.gms.internal.ads.bv1;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.lv1;
import com.google.android.gms.internal.ads.pm0;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p122q4.C5400b;
import p179z3.C6323b;
import p179z3.C6334g;

/* renamed from: p4.a */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C5276a {

    /* renamed from: a */
    private final Context f27215a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WebView f27216b;

    /* renamed from: c */
    private final C2955ve f27217c;

    /* renamed from: d */
    private final int f27218d = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14536d8)).intValue();

    /* renamed from: e */
    private final lv1 f27219e;

    /* renamed from: f */
    private final boolean f27220f = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14546e8)).booleanValue();

    C5276a(WebView webView, C2955ve veVar, lv1 lv1) {
        this.f27216b = webView;
        Context context = webView.getContext();
        this.f27215a = context;
        this.f27217c = veVar;
        this.f27219e = lv1;
        C2679nz.m17343c(context);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long a = C4409t.m29310b().mo18370a();
            String g = this.f27217c.mo14737c().mo12596g(this.f27215a, str, this.f27216b);
            if (this.f27220f) {
                long a2 = C4409t.m29310b().mo18370a() - a;
                C5315w.m32640c(this.f27219e, (bv1) null, "csg", new Pair("clat", String.valueOf(a2)));
            }
            return g;
        } catch (RuntimeException e) {
            pm0.m18665e("Exception getting click signals. ", e);
            C4409t.m29325q().mo15126t(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            pm0.m18664d("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.f27218d);
        try {
            return (String) dn0.f8325a.mo12324a(new C5308q(this, str)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            pm0.m18665e("Exception getting click signals with timeout. ", e);
            C4409t.m29325q().mo15126t(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        C4409t.m29326r();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f27215a;
        C6323b bVar = C6323b.BANNER;
        C6334g.C6335a aVar = new C6334g.C6335a();
        aVar.mo21654b(AdMobAdapter.class, bundle);
        C5400b.m33145a(context, bVar, aVar.mo230c(), new C5310r(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long a = C4409t.m29310b().mo18370a();
            String f = this.f27217c.mo14737c().mo12595f(this.f27215a, this.f27216b, (Activity) null);
            if (this.f27220f) {
                long a2 = C4409t.m29310b().mo18370a() - a;
                C5315w.m32640c(this.f27219e, (bv1) null, "vsg", new Pair("vlat", String.valueOf(a2)));
            }
            return f;
        } catch (RuntimeException e) {
            pm0.m18665e("Exception getting view signals. ", e);
            C4409t.m29325q().mo15126t(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            pm0.m18664d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.f27218d);
        try {
            return (String) dn0.f8325a.mo12324a(new C5306p(this)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            pm0.m18665e("Exception getting view signals with timeout. ", e);
            C4409t.m29325q().mo15126t(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt("type");
            try {
                this.f27217c.mo14738d(MotionEvent.obtain(0, (long) i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i, (float) i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e) {
                e = e;
                pm0.m18665e("Failed to parse the touch string. ", e);
                C4409t.m29325q().mo15126t(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
            pm0.m18665e("Failed to parse the touch string. ", e);
            C4409t.m29325q().mo15126t(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
