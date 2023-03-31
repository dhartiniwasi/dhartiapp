package p053g4;

import com.google.android.gms.internal.ads.az2;
import com.google.android.gms.internal.ads.cf3;
import com.google.android.gms.internal.ads.ie3;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.ny2;
import org.json.JSONObject;

/* renamed from: g4.d */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C4393d implements ie3 {

    /* renamed from: a */
    public final /* synthetic */ az2 f24495a;

    /* renamed from: b */
    public final /* synthetic */ ny2 f24496b;

    public /* synthetic */ C4393d(az2 az2, ny2 ny2) {
        this.f24495a = az2;
        this.f24496b = ny2;
    }

    /* renamed from: b */
    public final lf3 mo8156b(Object obj) {
        az2 az2 = this.f24495a;
        ny2 ny2 = this.f24496b;
        JSONObject jSONObject = (JSONObject) obj;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            C4409t.m29325q().mo15117h().mo18514s(jSONObject.getString("appSettingsJson"));
        }
        ny2.mo11826G(optBoolean);
        az2.mo8629b(ny2.mo11831W());
        return cf3.m10911i((Object) null);
    }
}
