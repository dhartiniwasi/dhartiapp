package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.startapp.k9 */
/* compiled from: Sta */
public class C9087k9 {

    /* renamed from: k */
    public static final boolean f37181k = MetaData.f38952k.mo31009Y();

    /* renamed from: a */
    public final Handler f37182a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public long f37183b;

    /* renamed from: c */
    public final Context f37184c;

    /* renamed from: d */
    public long f37185d;

    /* renamed from: e */
    public boolean f37186e;

    /* renamed from: f */
    public boolean f37187f;

    /* renamed from: g */
    public final String[] f37188g;

    /* renamed from: h */
    public final TrackingParams f37189h;

    /* renamed from: i */
    public final AdPreferences.Placement f37190i;

    /* renamed from: j */
    public WeakReference<C9088a> f37191j = new WeakReference<>((Object) null);

    /* renamed from: l */
    public final AtomicInteger f37192l = new AtomicInteger();

    /* renamed from: com.startapp.k9$a */
    /* compiled from: Sta */
    public interface C9088a {
        void onSent(String str);
    }

    public C9087k9(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j) {
        this.f37184c = C9058k0.m48719b(context);
        this.f37190i = placement;
        this.f37188g = strArr;
        this.f37189h = trackingParams;
        this.f37183b = j;
    }

    /* renamed from: a */
    public void mo29607a(C9088a aVar) {
        this.f37191j = new WeakReference<>(aVar);
    }

    /* renamed from: b */
    public void mo29609b() {
        if (mo29611c()) {
            return;
        }
        if (f37181k) {
            long j = this.f37183b;
            if (!this.f37187f) {
                this.f37187f = true;
                if (!this.f37186e) {
                    this.f37186e = true;
                }
                this.f37185d = System.currentTimeMillis();
                this.f37182a.postDelayed(new C9049j9(this), j);
                return;
            }
            return;
        }
        mo29610b((String) null, (JSONObject) null);
    }

    /* renamed from: c */
    public boolean mo29611c() {
        return this.f37192l.get() != 0;
    }

    /* renamed from: a */
    public void mo29606a() {
        if (this.f37186e && this.f37187f) {
            this.f37182a.removeCallbacksAndMessages((Object) null);
            this.f37183b -= System.currentTimeMillis() - this.f37185d;
            this.f37187f = false;
        }
    }

    /* renamed from: a */
    public void mo29608a(String str, JSONObject jSONObject) {
        mo29610b(str, jSONObject);
        this.f37186e = false;
        this.f37182a.removeCallbacksAndMessages((Object) null);
        this.f37187f = false;
        this.f37185d = 0;
    }

    /* renamed from: b */
    public void mo29610b(String str, JSONObject jSONObject) {
        int i = 0;
        int i2 = 1;
        if (this.f37192l.compareAndSet(0, 1)) {
            String str2 = null;
            if (str == null) {
                Context context = this.f37184c;
                String[] strArr = this.f37188g;
                TrackingParams trackingParams = this.f37189h;
                if (!(context == null || strArr == null)) {
                    C8997h4.m48658a(context, (List<String>) Arrays.asList(strArr), trackingParams);
                }
                C9088a aVar = (C9088a) this.f37191j.get();
                if (aVar != null) {
                    String[] strArr2 = this.f37188g;
                    if (strArr2 != null && strArr2.length > 0) {
                        str2 = C9396a.m49774a(strArr2[0], (String) null);
                    }
                    aVar.onSent(str2);
                }
                try {
                    C9667ye x = ComponentLocator.m50248a(this.f37184c).mo31188x();
                    AdPreferences.Placement placement = this.f37190i;
                    Map<AdPreferences.Placement, Integer> map = x.f39455c;
                    Integer num = map.get(placement);
                    if (num != null) {
                        i = num.intValue();
                    }
                    map.put(placement, Integer.valueOf(i + 1));
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            } else {
                Context context2 = this.f37184c;
                String[] strArr3 = this.f37188g;
                TrackingParams trackingParams2 = this.f37189h;
                if (trackingParams2 != null) {
                    str2 = trackingParams2.mo30722a();
                }
                C9396a.m49783a(context2, strArr3, str2, 0, str, jSONObject);
            }
        } else {
            int incrementAndGet = this.f37192l.incrementAndGet();
            AnalyticsConfig analyticsConfig = MetaData.f38952k.analytics;
            if (analyticsConfig != null) {
                if (str != null) {
                    i2 = 2;
                }
                ComponentInfoEventConfig l = analyticsConfig.mo30952l();
                if (l != null && l.mo30968a((long) i2)) {
                    C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                    i4Var.f36952d = "SI.repImp";
                    i4Var.f36957i = C9688ze.m50607a("reason=", str);
                    i4Var.f36953e = String.valueOf(incrementAndGet);
                    i4Var.mo29471a();
                }
            }
        }
    }
}
