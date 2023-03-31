package p115p4;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.bv1;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.lv1;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;

/* renamed from: p4.t */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C5312t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f27325a;

    /* renamed from: b */
    private final long f27326b;

    /* renamed from: c */
    private final boolean f27327c;

    /* renamed from: d */
    private final boolean f27328d;

    /* renamed from: e */
    private final Map f27329e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ArrayDeque f27330f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f27331g = new ArrayDeque();

    /* renamed from: h */
    private final lv1 f27332h;

    /* renamed from: i */
    private Map f27333i;

    public C5312t(lv1 lv1) {
        this.f27332h = lv1;
        this.f27325a = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14514b6)).intValue();
        this.f27326b = ((Long) C4596v.m30088c().mo12227b(C2679nz.f14524c6)).longValue();
        this.f27327c = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14574h6)).booleanValue();
        this.f27328d = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14554f6)).booleanValue();
        this.f27329e = Collections.synchronizedMap(new C5311s(this));
    }

    /* renamed from: g */
    private final synchronized void m32629g(bv1 bv1) {
        if (this.f27327c) {
            ArrayDeque clone = this.f27331g.clone();
            this.f27331g.clear();
            ArrayDeque clone2 = this.f27330f.clone();
            this.f27330f.clear();
            dn0.f8325a.execute(new C5278b(this, bv1, clone, clone2));
        }
    }

    /* renamed from: h */
    private final void m32630h(bv1 bv1, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(bv1.mo8951a());
            this.f27333i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f27333i.put("e_r", str);
            this.f27333i.put("e_id", (String) pair2.first);
            if (this.f27328d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(C5315w.m32638a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                m32632j(this.f27333i, "e_type", (String) pair.first);
                m32632j(this.f27333i, "e_agent", (String) pair.second);
            }
            this.f27332h.mo12717e(this.f27333i);
        }
    }

    /* renamed from: i */
    private final synchronized void m32631i() {
        long a = C4409t.m29310b().mo18370a();
        try {
            Iterator it = this.f27329e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f27326b) {
                    break;
                }
                this.f27331g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            C4409t.m29325q().mo15126t(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    /* renamed from: j */
    private static final void m32632j(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: b */
    public final synchronized String mo19285b(String str, bv1 bv1) {
        Pair pair = (Pair) this.f27329e.get(str);
        bv1.mo8951a().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.f27329e.remove(str);
            bv1.mo8951a().put("mhit", "true");
            return str2;
        }
        bv1.mo8951a().put("mhit", "false");
        return null;
    }

    /* renamed from: d */
    public final synchronized void mo19286d(String str, String str2, bv1 bv1) {
        this.f27329e.put(str, new Pair(Long.valueOf(C4409t.m29310b().mo18370a()), str2));
        m32631i();
        m32629g(bv1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo19287e(bv1 bv1, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        m32630h(bv1, arrayDeque, "to");
        m32630h(bv1, arrayDeque2, "of");
    }

    /* renamed from: f */
    public final synchronized void mo19288f(String str) {
        this.f27329e.remove(str);
    }
}
