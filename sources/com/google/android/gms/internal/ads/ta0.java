package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ta0 implements fa0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ha0 f17911a;

    /* renamed from: b */
    private final ia0 f17912b;

    /* renamed from: c */
    private final aa0 f17913c;

    /* renamed from: d */
    private final String f17914d;

    ta0(aa0 aa0, String str, ia0 ia0, ha0 ha0) {
        this.f17913c = aa0;
        this.f17914d = str;
        this.f17912b = ia0;
        this.f17911a = ha0;
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m20846d(ta0 ta0, u90 u90, ba0 ba0, Object obj, in0 in0) {
        try {
            C4409t.m29326r();
            String uuid = UUID.randomUUID().toString();
            d60.f8092o.mo14453c(uuid, new sa0(ta0, u90, in0));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", ta0.f17912b.mo10378c(obj));
            ba0.mo9090t0(ta0.f17914d, jSONObject);
        } catch (Exception e) {
            in0.mo11173e(e);
            pm0.m18665e("Unable to invokeJavascript", e);
            u90.mo14466g();
        } catch (Throwable th) {
            u90.mo14466g();
            throw th;
        }
    }

    /* renamed from: b */
    public final lf3 mo8156b(Object obj) throws Exception {
        return mo10117c(obj);
    }

    /* renamed from: c */
    public final lf3 mo10117c(Object obj) {
        in0 in0 = new in0();
        u90 b = this.f17913c.mo8282b((C2955ve) null);
        b.mo13311e(new qa0(this, b, obj, in0), new ra0(this, in0, b));
        return in0;
    }
}
