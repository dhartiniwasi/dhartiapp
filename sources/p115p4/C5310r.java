package p115p4;

import android.webkit.ValueCallback;
import com.google.android.gms.internal.ads.pm0;
import org.json.JSONException;
import org.json.JSONObject;
import p122q4.C5400b;
import p122q4.C5401c;

/* renamed from: p4.r */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C5310r extends C5401c {

    /* renamed from: a */
    final /* synthetic */ String f27322a;

    /* renamed from: b */
    final /* synthetic */ C5276a f27323b;

    C5310r(C5276a aVar, String str) {
        this.f27323b = aVar;
        this.f27322a = str;
    }

    /* renamed from: a */
    public final void mo19282a(String str) {
        pm0.m18667g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.f27323b.f27216b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", new Object[]{this.f27322a, str}), (ValueCallback) null);
    }

    /* renamed from: b */
    public final void mo19283b(C5400b bVar) {
        String str;
        String b = bVar.mo19524b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f27322a);
            jSONObject.put("signal", b);
            str = String.format("window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", new Object[]{this.f27322a, bVar.mo19524b()});
        }
        this.f27323b.f27216b.evaluateJavascript(str, (ValueCallback) null);
    }
}
