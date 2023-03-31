package p278ka;

import kotlin.jvm.internal.C11669k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ka.b */
/* compiled from: OSOutcomeEventParams.kt */
public final class C11603b {

    /* renamed from: a */
    private final String f44142a;

    /* renamed from: b */
    private final C11605d f44143b;

    /* renamed from: c */
    private float f44144c;

    /* renamed from: d */
    private long f44145d;

    public C11603b(String str, C11605d dVar, float f, long j) {
        C11669k.m56787e(str, "outcomeId");
        this.f44142a = str;
        this.f44143b = dVar;
        this.f44144c = f;
        this.f44145d = j;
    }

    /* renamed from: a */
    public final String mo35756a() {
        return this.f44142a;
    }

    /* renamed from: b */
    public final C11605d mo35757b() {
        return this.f44143b;
    }

    /* renamed from: c */
    public final long mo35758c() {
        return this.f44145d;
    }

    /* renamed from: d */
    public final float mo35759d() {
        return this.f44144c;
    }

    /* renamed from: e */
    public final boolean mo35760e() {
        C11605d dVar = this.f44143b;
        return dVar == null || (dVar.mo35764a() == null && this.f44143b.mo35765b() == null);
    }

    /* renamed from: f */
    public final void mo35761f(long j) {
        this.f44145d = j;
    }

    /* renamed from: g */
    public final JSONObject mo35762g() throws JSONException {
        JSONObject put = new JSONObject().put("id", this.f44142a);
        C11605d dVar = this.f44143b;
        if (dVar != null) {
            put.put("sources", dVar.mo35768e());
        }
        float f = this.f44144c;
        if (f > ((float) 0)) {
            put.put("weight", Float.valueOf(f));
        }
        long j = this.f44145d;
        if (j > 0) {
            put.put("timestamp", j);
        }
        C11669k.m56786d(put, "json");
        return put;
    }

    public String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f44142a + '\'' + ", outcomeSource=" + this.f44143b + ", weight=" + this.f44144c + ", timestamp=" + this.f44145d + '}';
    }
}
