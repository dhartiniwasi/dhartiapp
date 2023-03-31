package p269ja;

import com.onesignal.C8324c2;
import com.onesignal.C8450g3;
import com.onesignal.C8547p1;
import kotlin.jvm.internal.C11669k;
import org.json.JSONException;
import org.json.JSONObject;
import p249ha.C10490c;
import p278ka.C11603b;

/* renamed from: ja.g */
/* compiled from: OSOutcomeEventsV1Repository.kt */
public final class C11511g extends C11509e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11511g(C8547p1 p1Var, C11506b bVar, C11516l lVar) {
        super(p1Var, bVar, lVar);
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(bVar, "outcomeEventsCache");
        C11669k.m56787e(lVar, "outcomeEventsService");
    }

    /* renamed from: l */
    private final void m56290l(String str, int i, C8324c2 c2Var, C8450g3 g3Var) {
        try {
            JSONObject put = c2Var.mo27664g().put("app_id", str).put("device_type", i).put("direct", true);
            C11516l k = mo35533k();
            C11669k.m56786d(put, "jsonObject");
            k.mo35535a(put, g3Var);
        } catch (JSONException e) {
            mo35532j().mo28015c("Generating direct outcome:JSON Failed.", e);
        }
    }

    /* renamed from: m */
    private final void m56291m(String str, int i, C8324c2 c2Var, C8450g3 g3Var) {
        try {
            JSONObject put = c2Var.mo27664g().put("app_id", str).put("device_type", i).put("direct", false);
            C11516l k = mo35533k();
            C11669k.m56786d(put, "jsonObject");
            k.mo35535a(put, g3Var);
        } catch (JSONException e) {
            mo35532j().mo28015c("Generating indirect outcome:JSON Failed.", e);
        }
    }

    /* renamed from: n */
    private final void m56292n(String str, int i, C8324c2 c2Var, C8450g3 g3Var) {
        try {
            JSONObject put = c2Var.mo27664g().put("app_id", str).put("device_type", i);
            C11516l k = mo35533k();
            C11669k.m56786d(put, "jsonObject");
            k.mo35535a(put, g3Var);
        } catch (JSONException e) {
            mo35532j().mo28015c("Generating unattributed outcome:JSON Failed.", e);
        }
    }

    /* renamed from: e */
    public void mo35534e(String str, int i, C11603b bVar, C8450g3 g3Var) {
        C11669k.m56787e(str, "appId");
        C11669k.m56787e(bVar, "eventParams");
        C11669k.m56787e(g3Var, "responseHandler");
        C8324c2 a = C8324c2.m46360a(bVar);
        C11669k.m56786d(a, "event");
        C10490c d = a.mo27660d();
        if (d != null) {
            int i2 = C11510f.f43944a[d.ordinal()];
            if (i2 == 1) {
                m56290l(str, i, a, g3Var);
            } else if (i2 == 2) {
                m56291m(str, i, a, g3Var);
            } else if (i2 == 3) {
                m56292n(str, i, a, g3Var);
            }
        }
    }
}
