package p264io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.Map;
import p179z3.C6321a;
import p179z3.C6353v;
import p186ac.C6556k;
import p264io.flutter.plugins.googlemobileads.C10823d0;
import p264io.flutter.plugins.googlemobileads.C10826e;

/* renamed from: io.flutter.plugins.googlemobileads.a */
/* compiled from: AdInstanceManager */
class C10813a {

    /* renamed from: a */
    private Activity f42248a;

    /* renamed from: b */
    private final Map<Integer, C10826e> f42249b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6556k f42250c;

    /* renamed from: io.flutter.plugins.googlemobileads.a$a */
    /* compiled from: AdInstanceManager */
    class C10814a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map f42251a;

        C10814a(Map map) {
            this.f42251a = map;
        }

        public void run() {
            C10813a.this.f42250c.mo22159c("onAdEvent", this.f42251a);
        }
    }

    C10813a(C6556k kVar) {
        this.f42250c = kVar;
    }

    /* renamed from: g */
    private void m54049g(Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new C10814a(map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10826e mo34448b(int i) {
        return this.f42249b.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Integer mo34449c(C10826e eVar) {
        for (Integer next : this.f42249b.keySet()) {
            if (this.f42249b.get(next) == eVar) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34450d(int i) {
        if (this.f42249b.containsKey(Integer.valueOf(i))) {
            C10826e eVar = this.f42249b.get(Integer.valueOf(i));
            if (eVar != null) {
                eVar.mo34477a();
            }
            this.f42249b.remove(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo34451e() {
        for (Map.Entry next : this.f42249b.entrySet()) {
            if (next.getValue() != null) {
                ((C10826e) next.getValue()).mo34477a();
            }
        }
        this.f42249b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity mo34452f() {
        return this.f42248a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo34453h(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClicked");
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo34454i(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClosed");
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo34455j(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdDismissedFullScreenContent");
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo34456k(int i, C10826e.C10829c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdFailedToLoad");
        hashMap.put("loadAdError", cVar);
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo34457l(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdImpression");
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo34458m(int i, C6353v vVar) {
        C10826e.C10831e eVar;
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdLoaded");
        if (vVar == null) {
            eVar = null;
        } else {
            eVar = new C10826e.C10831e(vVar);
        }
        hashMap.put("responseInfo", eVar);
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo34459n(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdMetadataChanged");
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo34460o(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdOpened");
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo34461p(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdShowedFullScreenContent");
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo34462q(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAppEvent");
        hashMap.put(MediationMetaData.KEY_NAME, str);
        hashMap.put(JsonStorageKeyNames.DATA_KEY, str2);
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo34463r(int i, C6321a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFailedToShowFullScreenContent");
        hashMap.put("error", new C10826e.C10827a(aVar));
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo34464s(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i2));
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo34465t(C10826e eVar, C10861n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", mo34449c(eVar));
        hashMap.put("eventName", "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(nVar.f42372c));
        hashMap.put("precision", Integer.valueOf(nVar.f42370a));
        hashMap.put("currencyCode", nVar.f42371b);
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo34466u(int i, C10823d0.C10825b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", bVar);
        m54049g(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo34467v(Activity activity) {
        this.f42248a = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo34468w(int i) {
        C10826e.C10830d dVar = (C10826e.C10830d) mo34448b(i);
        if (dVar == null) {
            return false;
        }
        dVar.mo34483d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo34469x(C10826e eVar, int i) {
        if (this.f42249b.get(Integer.valueOf(i)) == null) {
            this.f42249b.put(Integer.valueOf(i), eVar);
        } else {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", new Object[]{Integer.valueOf(i)}));
        }
    }
}
