package p241gb;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9694a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p122q4.C5400b;
import p179z3.C6323b;
import p179z3.C6334g;
import p398xa.C12987a;
import p398xa.C12988b;

/* renamed from: gb.c */
/* compiled from: SignalsReader */
public class C10309c implements C12988b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Map<String, String> f40916a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C10311d f40917b;

    /* renamed from: gb.c$a */
    /* compiled from: SignalsReader */
    private class C10310a implements Runnable {

        /* renamed from: a */
        private C12987a f40918a;

        public C10310a(C12987a aVar) {
            this.f40918a = aVar;
        }

        public void run() {
            Map unused = C10309c.f40916a = new HashMap();
            String str = null;
            for (Map.Entry<String, C10308b> value : C10309c.f40917b.mo33160a().entrySet()) {
                C10308b bVar = (C10308b) value.getValue();
                C10309c.f40916a.put(bVar.mo33154b(), bVar.mo33156d());
                if (bVar.mo33153a() != null) {
                    str = bVar.mo33153a();
                }
            }
            if (C10309c.f40916a.size() > 0) {
                this.f40918a.onSignalsCollected(new JSONObject(C10309c.f40916a).toString());
            } else if (str == null) {
                this.f40918a.onSignalsCollected("");
            } else {
                this.f40918a.onSignalsCollectionFailed(str);
            }
        }
    }

    public C10309c(C10311d dVar) {
        f40917b = dVar;
    }

    /* renamed from: e */
    private void m52187e(Context context, String str, C6323b bVar, C9694a aVar) {
        C6334g c = new C6334g.C6335a().mo230c();
        C10308b bVar2 = new C10308b(str);
        C10307a aVar2 = new C10307a(bVar2, aVar);
        f40917b.mo33162c(str, bVar2);
        C5400b.m33145a(context, bVar, c, aVar2);
    }

    /* renamed from: a */
    public void mo22122a(Context context, String[] strArr, String[] strArr2, C12987a aVar) {
        C9694a aVar2 = new C9694a();
        for (String e : strArr) {
            aVar2.mo31563a();
            m52187e(context, e, C6323b.INTERSTITIAL, aVar2);
        }
        for (String e2 : strArr2) {
            aVar2.mo31563a();
            m52187e(context, e2, C6323b.REWARDED, aVar2);
        }
        aVar2.mo31565c(new C10310a(aVar));
    }
}
