package p115p4;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.cf3;
import com.google.android.gms.internal.ads.ie3;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.yg0;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import p060h4.C4584t;

/* renamed from: p4.l */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C5298l implements ie3 {

    /* renamed from: a */
    public final /* synthetic */ yg0 f27296a;

    public /* synthetic */ C5298l(yg0 yg0) {
        this.f27296a = yg0;
    }

    /* renamed from: b */
    public final lf3 mo8156b(Object obj) {
        yg0 yg0 = this.f27296a;
        C5304o oVar = new C5304o(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            oVar.f27310b = C4584t.m30036b().mo11159j(yg0.f20594a).toString();
        } catch (JSONException unused) {
            oVar.f27310b = "{}";
        }
        return cf3.m10911i(oVar);
    }
}
