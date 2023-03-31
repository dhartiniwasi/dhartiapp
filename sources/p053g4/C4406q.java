package p053g4;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C2955ve;
import com.google.android.gms.internal.ads.pm0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: g4.q */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4406q extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ C4408s f24529a;

    /* synthetic */ C4406q(C4408s sVar, C4405p pVar) {
        this.f24529a = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            C4408s sVar = this.f24529a;
            sVar.f24543h = (C2955ve) sVar.f24538c.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            pm0.m18668h("", e);
        } catch (TimeoutException e2) {
            pm0.m18668h("", e2);
        }
        return this.f24529a.mo17925b0();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        C4408s sVar = this.f24529a;
        if (sVar.f24541f != null && str != null) {
            sVar.f24541f.loadUrl(str);
        }
    }
}
