package p269ja;

import com.onesignal.C8408e3;
import com.onesignal.C8450g3;
import kotlin.jvm.internal.C11669k;
import org.json.JSONObject;

/* renamed from: ja.j */
/* compiled from: OSOutcomeEventsV2Service.kt */
public final class C11514j extends C11507c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11514j(C8408e3 e3Var) {
        super(e3Var);
        C11669k.m56787e(e3Var, "client");
    }

    /* renamed from: a */
    public void mo35535a(JSONObject jSONObject, C8450g3 g3Var) {
        C11669k.m56787e(jSONObject, "jsonObject");
        C11669k.m56787e(g3Var, "responseHandler");
        mo35522b().mo27764a("outcomes/measure_sources", jSONObject, g3Var);
    }
}
