package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class sa0 implements t60 {

    /* renamed from: a */
    private final u90 f17328a;

    /* renamed from: b */
    private final in0 f17329b;

    /* renamed from: c */
    final /* synthetic */ ta0 f17330c;

    public sa0(ta0 ta0, u90 u90, in0 in0) {
        this.f17330c = ta0;
        this.f17328a = u90;
        this.f17329b = in0;
    }

    /* renamed from: a */
    public final void mo8297a(JSONObject jSONObject) {
        u90 u90;
        try {
            this.f17329b.mo11172d(this.f17330c.f17911a.mo10772a(jSONObject));
            u90 = this.f17328a;
        } catch (IllegalStateException unused) {
            u90 = this.f17328a;
        } catch (JSONException e) {
            this.f17329b.mo11173e(e);
            u90 = this.f17328a;
        } catch (Throwable th) {
            this.f17328a.mo14466g();
            throw th;
        }
        u90.mo14466g();
    }

    /* renamed from: f */
    public final void mo8298f(String str) {
        u90 u90;
        if (str == null) {
            try {
                this.f17329b.mo11173e(new da0());
            } catch (IllegalStateException unused) {
                u90 = this.f17328a;
            } catch (Throwable th) {
                this.f17328a.mo14466g();
                throw th;
            }
        } else {
            this.f17329b.mo11173e(new da0(str));
        }
        u90 = this.f17328a;
        u90.mo14466g();
    }
}
