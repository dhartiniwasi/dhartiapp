package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bb0 implements ie3 {

    /* renamed from: a */
    private final ha0 f7192a;

    /* renamed from: b */
    private final ia0 f7193b;

    /* renamed from: c */
    private final String f7194c = "google.afma.activeView.handleUpdate";

    /* renamed from: d */
    private final lf3 f7195d;

    bb0(lf3 lf3, String str, ia0 ia0, ha0 ha0) {
        this.f7195d = lf3;
        this.f7193b = ia0;
        this.f7192a = ha0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lf3 mo8711a(Object obj, ba0 ba0) throws Exception {
        in0 in0 = new in0();
        C4409t.m29326r();
        String uuid = UUID.randomUUID().toString();
        d60.f8092o.mo14453c(uuid, new ab0(this, in0));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        ba0.mo9090t0(this.f7194c, jSONObject);
        return in0;
    }

    /* renamed from: b */
    public final lf3 mo8156b(Object obj) throws Exception {
        return mo8712c(obj);
    }

    /* renamed from: c */
    public final lf3 mo8712c(Object obj) {
        return cf3.m10916n(this.f7195d, new za0(this, obj), dn0.f8330f);
    }
}
