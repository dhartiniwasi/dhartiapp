package p269ja;

import com.onesignal.C8450g3;
import com.onesignal.C8547p1;
import kotlin.jvm.internal.C11669k;
import org.json.JSONException;
import org.json.JSONObject;
import p278ka.C11603b;

/* renamed from: ja.i */
/* compiled from: OSOutcomeEventsV2Repository.kt */
public final class C11513i extends C11509e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11513i(C8547p1 p1Var, C11506b bVar, C11516l lVar) {
        super(p1Var, bVar, lVar);
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(bVar, "outcomeEventsCache");
        C11669k.m56787e(lVar, "outcomeEventsService");
    }

    /* renamed from: e */
    public void mo35534e(String str, int i, C11603b bVar, C8450g3 g3Var) {
        C11669k.m56787e(str, "appId");
        C11669k.m56787e(bVar, "event");
        C11669k.m56787e(g3Var, "responseHandler");
        try {
            JSONObject put = bVar.mo35762g().put("app_id", str).put("device_type", i);
            C11516l k = mo35533k();
            C11669k.m56786d(put, "jsonObject");
            k.mo35535a(put, g3Var);
        } catch (JSONException e) {
            mo35532j().mo28015c("Generating indirect outcome:JSON Failed.", e);
        }
    }
}
