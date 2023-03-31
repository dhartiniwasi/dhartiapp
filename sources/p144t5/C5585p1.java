package p144t5;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t5.p1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class C5585p1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f28187a;

    /* renamed from: b */
    public final /* synthetic */ String f28188b;

    /* renamed from: c */
    public final /* synthetic */ C5591r1[] f28189c;

    public /* synthetic */ C5585p1(String str, String str2, C5591r1[] r1VarArr) {
        this.f28187a = str;
        this.f28188b = str2;
        this.f28189c = r1VarArr;
    }

    public final void run() {
        JSONObject jSONObject;
        String str = this.f28187a;
        String str2 = this.f28188b;
        C5591r1[] r1VarArr = this.f28189c;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str2).length());
                sb.append("Action[");
                sb.append(lowerCase);
                sb.append("]: failed to parse args: ");
                sb.append(str2);
                Log.d("UserMessagingPlatform", sb.toString());
                return;
            }
        }
        String valueOf = String.valueOf(jSONObject);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length());
        sb2.append("Action[");
        sb2.append(lowerCase);
        sb2.append("]: ");
        sb2.append(valueOf);
        Log.d("UserMessagingPlatform", sb2.toString());
        int length = r1VarArr.length;
        int i = 0;
        while (i < length) {
            C5591r1 r1Var = r1VarArr[i];
            FutureTask futureTask = new FutureTask(new C5588q1(r1Var, lowerCase, jSONObject));
            r1Var.zza().execute(futureTask);
            try {
                if (!((Boolean) futureTask.get()).booleanValue()) {
                    i++;
                } else {
                    return;
                }
            } catch (ExecutionException e) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 24);
                sb3.append("Failed to run Action[");
                sb3.append(lowerCase);
                sb3.append("]: ");
                Log.d("UserMessagingPlatform", sb3.toString(), e.getCause());
            } catch (InterruptedException e2) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + 33);
                sb4.append("Thread interrupted for Action[");
                sb4.append(lowerCase);
                sb4.append("]: ");
                Log.d("UserMessagingPlatform", sb4.toString(), e2);
            }
        }
    }
}
