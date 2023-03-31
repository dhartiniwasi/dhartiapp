package p144t5;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: t5.q1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class C5588q1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C5591r1 f28193a;

    /* renamed from: b */
    public final /* synthetic */ String f28194b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f28195c;

    public /* synthetic */ C5588q1(C5591r1 r1Var, String str, JSONObject jSONObject) {
        this.f28193a = r1Var;
        this.f28194b = str;
        this.f28195c = jSONObject;
    }

    public final Object call() {
        return Boolean.valueOf(this.f28193a.mo19875a(this.f28194b, this.f28195c));
    }
}
