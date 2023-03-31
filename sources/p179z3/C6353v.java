package p179z3;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4509g2;
import p060h4.C4584t;
import p060h4.C4595u4;

/* renamed from: z3.v */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C6353v {

    /* renamed from: a */
    private final C4509g2 f30557a;

    /* renamed from: b */
    private final List f30558b = new ArrayList();

    /* renamed from: c */
    private C6341k f30559c;

    private C6353v(C4509g2 g2Var) {
        this.f30557a = g2Var;
        if (g2Var != null) {
            try {
                List<C4595u4> W = g2Var.mo12863W();
                if (W != null) {
                    for (C4595u4 i : W) {
                        C6341k i2 = C6341k.m37327i(i);
                        if (i2 != null) {
                            this.f30558b.add(i2);
                        }
                    }
                }
            } catch (RemoteException e) {
                pm0.m18665e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        C4509g2 g2Var2 = this.f30557a;
        if (g2Var2 != null) {
            try {
                C4595u4 T = g2Var2.mo12860T();
                if (T != null) {
                    this.f30559c = C6341k.m37327i(T);
                }
            } catch (RemoteException e2) {
                pm0.m18665e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
            }
        }
    }

    /* renamed from: f */
    public static C6353v m37370f(C4509g2 g2Var) {
        if (g2Var != null) {
            return new C6353v(g2Var);
        }
        return null;
    }

    /* renamed from: g */
    public static C6353v m37371g(C4509g2 g2Var) {
        return new C6353v(g2Var);
    }

    /* renamed from: a */
    public List<C6341k> mo21726a() {
        return this.f30558b;
    }

    /* renamed from: b */
    public C6341k mo21727b() {
        return this.f30559c;
    }

    /* renamed from: c */
    public String mo21728c() {
        try {
            C4509g2 g2Var = this.f30557a;
            if (g2Var != null) {
                return g2Var.mo12867c();
            }
            return null;
        } catch (RemoteException e) {
            pm0.m18665e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    /* renamed from: d */
    public Bundle mo21729d() {
        try {
            C4509g2 g2Var = this.f30557a;
            if (g2Var != null) {
                return g2Var.mo12865a();
            }
        } catch (RemoteException e) {
            pm0.m18665e("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    /* renamed from: e */
    public String mo21730e() {
        try {
            C4509g2 g2Var = this.f30557a;
            if (g2Var != null) {
                return g2Var.mo12862V();
            }
            return null;
        } catch (RemoteException e) {
            pm0.m18665e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    /* renamed from: h */
    public final C4509g2 mo21731h() {
        return this.f30557a;
    }

    /* renamed from: i */
    public final JSONObject mo21732i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String e = mo21730e();
        if (e == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", e);
        }
        String c = mo21728c();
        if (c == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", c);
        }
        JSONArray jSONArray = new JSONArray();
        for (C6341k j : this.f30558b) {
            jSONArray.put(j.mo21693j());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        C6341k kVar = this.f30559c;
        if (kVar != null) {
            jSONObject.put("Loaded Adapter Response", kVar.mo21693j());
        }
        Bundle d = mo21729d();
        if (d != null) {
            jSONObject.put("Response Extras", C4584t.m30036b().mo11159j(d));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return mo21732i().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
