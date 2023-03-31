package p278ka;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ka.e */
/* compiled from: OSOutcomeSourceBody.kt */
public final class C11606e {

    /* renamed from: a */
    private JSONArray f44148a;

    /* renamed from: b */
    private JSONArray f44149b;

    public C11606e() {
        this((JSONArray) null, (JSONArray) null, 3, (C11665g) null);
    }

    public C11606e(JSONArray jSONArray, JSONArray jSONArray2) {
        this.f44148a = jSONArray;
        this.f44149b = jSONArray2;
    }

    /* renamed from: a */
    public final JSONArray mo35770a() {
        return this.f44149b;
    }

    /* renamed from: b */
    public final JSONArray mo35771b() {
        return this.f44148a;
    }

    /* renamed from: c */
    public final void mo35772c(JSONArray jSONArray) {
        this.f44149b = jSONArray;
    }

    /* renamed from: d */
    public final void mo35773d(JSONArray jSONArray) {
        this.f44148a = jSONArray;
    }

    /* renamed from: e */
    public final JSONObject mo35774e() throws JSONException {
        JSONObject put = new JSONObject().put("notification_ids", this.f44148a).put("in_app_message_ids", this.f44149b);
        C11669k.m56786d(put, "JSONObject()\n           …AM_IDS, inAppMessagesIds)");
        return put;
    }

    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.f44148a + ", inAppMessagesIds=" + this.f44149b + '}';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11606e(JSONArray jSONArray, JSONArray jSONArray2, int i, C11665g gVar) {
        this((i & 1) != 0 ? new JSONArray() : jSONArray, (i & 2) != 0 ? new JSONArray() : jSONArray2);
    }
}
