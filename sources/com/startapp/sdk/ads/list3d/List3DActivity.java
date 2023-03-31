package com.startapp.sdk.ads.list3d;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.C8823a6;
import com.startapp.C8846b6;
import com.startapp.C8968g4;
import com.startapp.C9023i4;
import com.startapp.C9087k9;
import com.startapp.C9279s7;
import com.startapp.C9605vb;
import com.startapp.C9637x5;
import com.startapp.C9677z5;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Sta */
public class List3DActivity extends Activity implements C9279s7 {

    /* renamed from: a */
    public List3DView f38321a;

    /* renamed from: b */
    public int f38322b;

    /* renamed from: c */
    public Long f38323c;

    /* renamed from: d */
    public Long f38324d;

    /* renamed from: e */
    public long f38325e = 0;

    /* renamed from: f */
    public String f38326f;

    /* renamed from: g */
    public String f38327g;

    /* renamed from: h */
    public List<C9637x5> f38328h;

    /* renamed from: i */
    public BroadcastReceiver f38329i = new C9313a();

    /* renamed from: com.startapp.sdk.ads.list3d.List3DActivity$a */
    /* compiled from: Sta */
    public class C9313a extends BroadcastReceiver {
        public C9313a() {
        }

        public void onReceive(Context context, Intent intent) {
            List3DActivity.this.finish();
        }
    }

    /* renamed from: com.startapp.sdk.ads.list3d.List3DActivity$b */
    /* compiled from: Sta */
    public class C9314b implements AdapterView.OnItemClickListener {

        /* renamed from: com.startapp.sdk.ads.list3d.List3DActivity$b$a */
        /* compiled from: Sta */
        public class C9315a implements Runnable {
            public C9315a() {
            }

            public void run() {
                List3DActivity.this.finish();
            }
        }

        public C9314b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C9087k9 k9Var;
            int i2 = i;
            String str = List3DActivity.this.f38328h.get(i2).f39369b;
            String[] strArr = List3DActivity.this.f38328h.get(i2).f39371d;
            String str2 = List3DActivity.this.f38328h.get(i2).f39373f;
            boolean z = List3DActivity.this.f38328h.get(i2).f39378k;
            boolean z2 = List3DActivity.this.f38328h.get(i2).f39379l;
            String str3 = List3DActivity.this.f38328h.get(i2).f39381n;
            String str4 = List3DActivity.this.f38328h.get(i2).f39380m;
            Boolean bool = List3DActivity.this.f38328h.get(i2).f39383p;
            C9677z5 a = C8823a6.f36412b.mo29085a(List3DActivity.this.f38326f);
            String[] strArr2 = List3DActivity.this.f38328h.get(i2).f39370c;
            C8968g4 g4Var = a.f39552a;
            String a2 = g4Var.mo29386a(strArr2, a.f39554c);
            HashMap<String, C9087k9> hashMap = g4Var.f36812a;
            if (!(hashMap == null || (k9Var = hashMap.get(a2)) == null)) {
                k9Var.mo29608a((String) null, (JSONObject) null);
            }
            if (str3 != null && !TextUtils.isEmpty(str3)) {
                List3DActivity list3DActivity = List3DActivity.this;
                C9396a.m49785a(str3, str4, str, (Context) list3DActivity, new TrackingParams(list3DActivity.f38327g));
                List3DActivity.this.finish();
            } else if (!TextUtils.isEmpty(str)) {
                boolean l = MetaData.f38952k.mo31031l();
                boolean a3 = C9396a.m49790a(List3DActivity.this.getApplicationContext(), AdPreferences.Placement.INAPP_OFFER_WALL);
                if (!z || a3) {
                    List3DActivity list3DActivity2 = List3DActivity.this;
                    C9396a.m49781a((Context) list3DActivity2, str, strArr, list3DActivity2.mo30106a(), z2 && !a3, false);
                    if (l) {
                        List3DActivity.this.finish();
                        return;
                    }
                    return;
                }
                List3DActivity list3DActivity3 = List3DActivity.this;
                C9396a.m49782a(list3DActivity3, str, strArr, str2, list3DActivity3.mo30106a(), AdsCommonMetaData.f38625h.mo30481z(), AdsCommonMetaData.f38625h.mo30480y(), z2, bool, false, l ? new C9315a() : null);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.list3d.List3DActivity$c */
    /* compiled from: Sta */
    public class C9316c implements View.OnClickListener {
        public C9316c() {
        }

        public void onClick(View view) {
            List3DActivity list3DActivity = List3DActivity.this;
            C9396a.m49778a((Context) list3DActivity, list3DActivity.mo30107b(), List3DActivity.this.mo30106a());
            List3DActivity.this.finish();
        }
    }

    /* renamed from: com.startapp.sdk.ads.list3d.List3DActivity$d */
    /* compiled from: Sta */
    public class C9317d implements Runnable {
        public C9317d() {
        }

        public void run() {
            try {
                List3DActivity.this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (Throwable th) {
                if (!C9605vb.m50466a(th, (Class<? extends Throwable>) RemoteException.class)) {
                    C9023i4.m48681a(th);
                }
            }
        }
    }

    /* renamed from: a */
    public TrackingParams mo30106a() {
        return new CloseTrackingParams((SystemClock.uptimeMillis() - this.f38325e) / 1000, this.f38327g);
    }

    /* renamed from: b */
    public String mo30107b() {
        List<C9637x5> list = this.f38328h;
        if (list == null || list.isEmpty() || this.f38328h.get(0).f39372e == null) {
            return "";
        }
        return this.f38328h.get(0).f39372e;
    }

    public void finish() {
        try {
            SystemClock.uptimeMillis();
            C9396a.m49778a((Context) this, mo30107b(), mo30106a());
            Object obj = StartAppSDKInternal.f38662D;
            StartAppSDKInternal.C9395d.f38707a.f38681o = false;
            if (this.f38322b == getResources().getConfiguration().orientation) {
                C8846b6.m48400a((Context) this).mo29213a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                if (this.f38329i != null) {
                    C8846b6.m48400a((Context) this).mo29211a(this.f38329i);
                    this.f38329i = null;
                }
            }
            String str = this.f38326f;
            if (str != null) {
                C8823a6.f36412b.mo29085a(str).mo31512a();
                if (!AdsConstants.f38631f.booleanValue()) {
                    C8823a6 a6Var = C8823a6.f36412b;
                    a6Var.f36413a.remove(this.f38326f);
                }
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
        super.finish();
    }

    public void onBackPressed() {
        C8823a6.f36412b.mo29085a(this.f38326f).mo31512a();
        super.onBackPressed();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: android.widget.ImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 0
            r14.overridePendingTransition(r0, r0)     // Catch:{ all -> 0x0380 }
            super.onCreate(r15)     // Catch:{ all -> 0x0380 }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r2 = "fullscreen"
            boolean r1 = r1.getBooleanExtra(r2, r0)     // Catch:{ all -> 0x0380 }
            r2 = 1
            if (r1 == 0) goto L_0x0020
            r14.requestWindowFeature(r2)     // Catch:{ all -> 0x0380 }
            android.view.Window r1 = r14.getWindow()     // Catch:{ all -> 0x0380 }
            r3 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r3, r3)     // Catch:{ all -> 0x0380 }
        L_0x0020:
            java.lang.String r1 = "adCacheTtl"
            java.lang.String r3 = "lastLoadTime"
            if (r15 != 0) goto L_0x004d
            com.startapp.b6 r15 = com.startapp.C8846b6.m48400a((android.content.Context) r14)     // Catch:{ all -> 0x0380 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x0380 }
            java.lang.String r5 = "com.startapp.android.ShowDisplayBroadcastListener"
            r4.<init>(r5)     // Catch:{ all -> 0x0380 }
            r15.mo29213a((android.content.Intent) r4)     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.io.Serializable r15 = r15.getSerializableExtra(r3)     // Catch:{ all -> 0x0380 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0380 }
            r14.f38323c = r15     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.io.Serializable r15 = r15.getSerializableExtra(r1)     // Catch:{ all -> 0x0380 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0380 }
            r14.f38324d = r15     // Catch:{ all -> 0x0380 }
            goto L_0x0069
        L_0x004d:
            boolean r4 = r15.containsKey(r3)     // Catch:{ all -> 0x0380 }
            if (r4 == 0) goto L_0x005b
            java.io.Serializable r3 = r15.getSerializable(r3)     // Catch:{ all -> 0x0380 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0380 }
            r14.f38323c = r3     // Catch:{ all -> 0x0380 }
        L_0x005b:
            boolean r3 = r15.containsKey(r1)     // Catch:{ all -> 0x0380 }
            if (r3 == 0) goto L_0x0069
            java.io.Serializable r15 = r15.getSerializable(r1)     // Catch:{ all -> 0x0380 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0380 }
            r14.f38324d = r15     // Catch:{ all -> 0x0380 }
        L_0x0069:
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "position"
            r15.getStringExtra(r1)     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "listModelUuid"
            java.lang.String r15 = r15.getStringExtra(r1)     // Catch:{ all -> 0x0380 }
            r14.f38326f = r15     // Catch:{ all -> 0x0380 }
            com.startapp.b6 r15 = com.startapp.C8846b6.m48400a((android.content.Context) r14)     // Catch:{ all -> 0x0380 }
            android.content.BroadcastReceiver r1 = r14.f38329i     // Catch:{ all -> 0x0380 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x0380 }
            java.lang.String r4 = "com.startapp.android.CloseAdActivity"
            r3.<init>(r4)     // Catch:{ all -> 0x0380 }
            r15.mo29212a(r1, r3)     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.content.res.Configuration r15 = r15.getConfiguration()     // Catch:{ all -> 0x0380 }
            int r15 = r15.orientation     // Catch:{ all -> 0x0380 }
            r14.f38322b = r15     // Catch:{ all -> 0x0380 }
            java.util.Map<android.app.Activity, java.lang.Integer> r15 = com.startapp.C9605vb.f39316a     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.content.res.Configuration r15 = r15.getConfiguration()     // Catch:{ all -> 0x0380 }
            int r15 = r15.orientation     // Catch:{ all -> 0x0380 }
            com.startapp.C9605vb.m50442a((android.app.Activity) r14, (int) r15, (boolean) r2)     // Catch:{ all -> 0x0380 }
            r14.requestWindowFeature(r2)     // Catch:{ all -> 0x0380 }
            android.content.Intent r15 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "adTag"
            java.lang.String r15 = r15.getStringExtra(r1)     // Catch:{ all -> 0x0380 }
            r14.f38327g = r15     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r15 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            int r15 = r15.mo30458d()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            int r1 = r1.mo30457c()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r3 = new com.startapp.sdk.ads.list3d.List3DView     // Catch:{ all -> 0x0380 }
            java.lang.String r4 = r14.f38327g     // Catch:{ all -> 0x0380 }
            java.lang.String r5 = r14.f38326f     // Catch:{ all -> 0x0380 }
            r6 = 0
            r3.<init>(r14, r6, r4, r5)     // Catch:{ all -> 0x0380 }
            r14.f38321a = r3     // Catch:{ all -> 0x0380 }
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch:{ all -> 0x0380 }
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ all -> 0x0380 }
            r5 = 2
            int[] r7 = new int[r5]     // Catch:{ all -> 0x0380 }
            r7[r0] = r15     // Catch:{ all -> 0x0380 }
            r7[r2] = r1     // Catch:{ all -> 0x0380 }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f38321a     // Catch:{ all -> 0x0380 }
            r15.setBackgroundDrawable(r3)     // Catch:{ all -> 0x0380 }
            com.startapp.a6 r15 = com.startapp.C8823a6.f36412b     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = r14.f38326f     // Catch:{ all -> 0x0380 }
            com.startapp.z5 r15 = r15.mo29085a(r1)     // Catch:{ all -> 0x0380 }
            java.util.List<com.startapp.x5> r15 = r15.f39553b     // Catch:{ all -> 0x0380 }
            r14.f38328h = r15     // Catch:{ all -> 0x0380 }
            if (r15 != 0) goto L_0x00f5
            r14.finish()     // Catch:{ all -> 0x0380 }
            return
        L_0x00f5:
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f38321a     // Catch:{ all -> 0x0380 }
            r15.setStarted()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f38321a     // Catch:{ all -> 0x0380 }
            r15.setHint(r2)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f38321a     // Catch:{ all -> 0x0380 }
            r15.setFade(r2)     // Catch:{ all -> 0x0380 }
            com.startapp.t5 r15 = new com.startapp.t5     // Catch:{ all -> 0x0380 }
            java.util.List<com.startapp.x5> r1 = r14.f38328h     // Catch:{ all -> 0x0380 }
            java.lang.String r3 = r14.f38327g     // Catch:{ all -> 0x0380 }
            java.lang.String r4 = r14.f38326f     // Catch:{ all -> 0x0380 }
            r15.<init>(r14, r1, r3, r4)     // Catch:{ all -> 0x0380 }
            com.startapp.a6 r1 = com.startapp.C8823a6.f36412b     // Catch:{ all -> 0x0380 }
            java.lang.String r3 = r14.f38326f     // Catch:{ all -> 0x0380 }
            com.startapp.z5 r1 = r1.mo29085a(r3)     // Catch:{ all -> 0x0380 }
            r1.mo31513a(r14, r2)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r1 = r14.f38321a     // Catch:{ all -> 0x0380 }
            r1.setAdapter(r15)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f38321a     // Catch:{ all -> 0x0380 }
            com.startapp.z9 r1 = new com.startapp.z9     // Catch:{ all -> 0x0380 }
            r3 = 1063675494(0x3f666666, float:0.9)
            r4 = 1058642330(0x3f19999a, float:0.6)
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0380 }
            r15.setDynamics(r1)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r15 = r14.f38321a     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DActivity$b r1 = new com.startapp.sdk.ads.list3d.List3DActivity$b     // Catch:{ all -> 0x0380 }
            r1.<init>()     // Catch:{ all -> 0x0380 }
            r15.setOnItemClickListener(r1)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout r15 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0380 }
            r15.<init>(r14)     // Catch:{ all -> 0x0380 }
            java.lang.String r1 = "StartApp Ad"
            r15.setContentDescription(r1)     // Catch:{ all -> 0x0380 }
            r1 = 1475346432(0x57f00000, float:5.27765581E14)
            r15.setId(r1)     // Catch:{ all -> 0x0380 }
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r3 = -1
            r1.<init>(r3, r3)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r4.<init>(r3, r3)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout r7 = new android.widget.LinearLayout     // Catch:{ all -> 0x0380 }
            r7.<init>(r14)     // Catch:{ all -> 0x0380 }
            r7.setOrientation(r2)     // Catch:{ all -> 0x0380 }
            r15.addView(r7, r4)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout r4 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0380 }
            r4.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r9 = -2
            r8.<init>(r3, r9)     // Catch:{ all -> 0x0380 }
            r4.setLayoutParams(r8)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r8 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r8 = r8.mo30439A()     // Catch:{ all -> 0x0380 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0380 }
            r4.setBackgroundColor(r8)     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.TextView r8 = new android.widget.TextView     // Catch:{ all -> 0x0380 }
            r8.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r10.<init>(r9, r9)     // Catch:{ all -> 0x0380 }
            r11 = 13
            r10.addRule(r11)     // Catch:{ all -> 0x0380 }
            r8.setLayoutParams(r10)     // Catch:{ all -> 0x0380 }
            float r5 = (float) r5     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r10 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r10 = android.util.TypedValue.applyDimension(r2, r5, r10)     // Catch:{ all -> 0x0380 }
            int r10 = java.lang.Math.round(r10)     // Catch:{ all -> 0x0380 }
            r11 = 5
            float r11 = (float) r11     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r12 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r11 = android.util.TypedValue.applyDimension(r2, r11, r12)     // Catch:{ all -> 0x0380 }
            int r11 = java.lang.Math.round(r11)     // Catch:{ all -> 0x0380 }
            r8.setPadding(r0, r10, r0, r11)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r10 = r10.mo30442D()     // Catch:{ all -> 0x0380 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0380 }
            r8.setTextColor(r10)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r10 = r10.mo30444F()     // Catch:{ all -> 0x0380 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0380 }
            float r10 = (float) r10     // Catch:{ all -> 0x0380 }
            r8.setTextSize(r10)     // Catch:{ all -> 0x0380 }
            r8.setSingleLine(r2)     // Catch:{ all -> 0x0380 }
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END     // Catch:{ all -> 0x0380 }
            r8.setEllipsize(r10)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.lang.String r10 = r10.mo30440B()     // Catch:{ all -> 0x0380 }
            r8.setText(r10)     // Catch:{ all -> 0x0380 }
            r10 = 1075838976(0x40200000, float:2.5)
            r11 = -1073741824(0xffffffffc0000000, float:-2.0)
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = -11513776(0xffffffffff505050, float:-2.7689643E38)
            r8.setShadowLayer(r10, r11, r12, r13)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r10 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.util.Set r10 = r10.mo30443E()     // Catch:{ all -> 0x0380 }
            com.startapp.C9265rb.m49238a((android.widget.TextView) r8, (java.util.Set<java.lang.String>) r10)     // Catch:{ all -> 0x0380 }
            r4.addView(r8)     // Catch:{ all -> 0x0380 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r8.<init>(r9, r9)     // Catch:{ all -> 0x0380 }
            r10 = 11
            r8.addRule(r10)     // Catch:{ all -> 0x0380 }
            r10 = 15
            r8.addRule(r10)     // Catch:{ all -> 0x0380 }
            java.lang.String r10 = "close_button.png"
            android.graphics.Bitmap r10 = com.startapp.C8941f1.m48561a(r14, r10)     // Catch:{ all -> 0x0380 }
            if (r10 == 0) goto L_0x0242
            android.widget.ImageButton r11 = new android.widget.ImageButton     // Catch:{ all -> 0x0380 }
            r12 = 16973839(0x103000f, float:2.4060942E-38)
            r11.<init>(r14, r6, r12)     // Catch:{ all -> 0x0380 }
            r6 = 36
            float r6 = (float) r6     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r12 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r12 = android.util.TypedValue.applyDimension(r2, r6, r12)     // Catch:{ all -> 0x0380 }
            int r12 = java.lang.Math.round(r12)     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r13 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r13)     // Catch:{ all -> 0x0380 }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0380 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r10, r12, r6, r2)     // Catch:{ all -> 0x0380 }
            r11.setImageBitmap(r6)     // Catch:{ all -> 0x0380 }
            goto L_0x0251
        L_0x0242:
            android.widget.TextView r11 = new android.widget.TextView     // Catch:{ all -> 0x0380 }
            r11.<init>(r14)     // Catch:{ all -> 0x0380 }
            java.lang.String r6 = "   x   "
            r11.setText(r6)     // Catch:{ all -> 0x0380 }
            r6 = 1101004800(0x41a00000, float:20.0)
            r11.setTextSize(r6)     // Catch:{ all -> 0x0380 }
        L_0x0251:
            r11.setLayoutParams(r8)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DActivity$c r6 = new com.startapp.sdk.ads.list3d.List3DActivity$c     // Catch:{ all -> 0x0380 }
            r6.<init>()     // Catch:{ all -> 0x0380 }
            r11.setOnClickListener(r6)     // Catch:{ all -> 0x0380 }
            java.lang.String r6 = "x"
            r11.setContentDescription(r6)     // Catch:{ all -> 0x0380 }
            r6 = 1475346435(0x57f00003, float:5.27765682E14)
            r11.setId(r6)     // Catch:{ all -> 0x0380 }
            r4.addView(r11)     // Catch:{ all -> 0x0380 }
            android.view.View r4 = new android.view.View     // Catch:{ all -> 0x0380 }
            r4.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r8 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r8 = android.util.TypedValue.applyDimension(r2, r5, r8)     // Catch:{ all -> 0x0380 }
            int r8 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0380 }
            r6.<init>(r3, r8)     // Catch:{ all -> 0x0380 }
            r4.setLayoutParams(r6)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r6 = r6.mo30441C()     // Catch:{ all -> 0x0380 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0380 }
            r4.setBackgroundColor(r6)     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x0380 }
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.weight = r6     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r6 = r14.f38321a     // Catch:{ all -> 0x0380 }
            r6.setLayoutParams(r4)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DView r4 = r14.f38321a     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch:{ all -> 0x0380 }
            r4.<init>(r14)     // Catch:{ all -> 0x0380 }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0380 }
            r6.<init>(r3, r9)     // Catch:{ all -> 0x0380 }
            r3 = 80
            r6.gravity = r3     // Catch:{ all -> 0x0380 }
            r4.setLayoutParams(r6)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r3 = r3.mo30476u()     // Catch:{ all -> 0x0380 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0380 }
            r4.setBackgroundColor(r3)     // Catch:{ all -> 0x0380 }
            r3 = 17
            r4.setGravity(r3)     // Catch:{ all -> 0x0380 }
            r7.addView(r4)     // Catch:{ all -> 0x0380 }
            android.widget.TextView r3 = new android.widget.TextView     // Catch:{ all -> 0x0380 }
            r3.<init>(r14)     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0380 }
            java.lang.Integer r6 = r6.mo30477v()     // Catch:{ all -> 0x0380 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0380 }
            r3.setTextColor(r6)     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r6 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r5 = android.util.TypedValue.applyDimension(r2, r5, r6)     // Catch:{ all -> 0x0380 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x0380 }
            r6 = 3
            float r6 = (float) r6     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r7 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r7)     // Catch:{ all -> 0x0380 }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0380 }
            r3.setPadding(r0, r5, r0, r6)     // Catch:{ all -> 0x0380 }
            java.lang.String r0 = "Powered By "
            r3.setText(r0)     // Catch:{ all -> 0x0380 }
            r0 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r0)     // Catch:{ all -> 0x0380 }
            r4.addView(r3)     // Catch:{ all -> 0x0380 }
            android.widget.ImageView r0 = new android.widget.ImageView     // Catch:{ all -> 0x0380 }
            r0.<init>(r14)     // Catch:{ all -> 0x0380 }
            java.lang.String r3 = "logo.png"
            android.graphics.Bitmap r3 = com.startapp.C8941f1.m48561a(r14, r3)     // Catch:{ all -> 0x0380 }
            r5 = 56
            float r5 = (float) r5     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r6 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r5 = android.util.TypedValue.applyDimension(r2, r5, r6)     // Catch:{ all -> 0x0380 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x0380 }
            r6 = 12
            float r6 = (float) r6     // Catch:{ all -> 0x0380 }
            android.content.res.Resources r7 = r14.getResources()     // Catch:{ all -> 0x0380 }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x0380 }
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r7)     // Catch:{ all -> 0x0380 }
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0380 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r3, r5, r6, r2)     // Catch:{ all -> 0x0380 }
            r0.setImageBitmap(r2)     // Catch:{ all -> 0x0380 }
            r4.addView(r0)     // Catch:{ all -> 0x0380 }
            android.content.Intent r0 = r14.getIntent()     // Catch:{ all -> 0x0380 }
            java.lang.String r2 = "adInfoOverride"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)     // Catch:{ all -> 0x0380 }
            r6 = r0
            com.startapp.sdk.adsbase.adinformation.AdInformationOverrides r6 = (com.startapp.sdk.adsbase.adinformation.AdInformationOverrides) r6     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.adinformation.AdInformationObject r0 = new com.startapp.sdk.adsbase.adinformation.AdInformationObject     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size r4 = com.startapp.sdk.adsbase.adinformation.AdInformationObject.Size.LARGE     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r5 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_OFFER_WALL     // Catch:{ all -> 0x0380 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0380 }
            r0.mo30608a(r15)     // Catch:{ all -> 0x0380 }
            r14.setContentView(r15, r1)     // Catch:{ all -> 0x0380 }
            android.os.Handler r15 = new android.os.Handler     // Catch:{ all -> 0x0380 }
            r15.<init>()     // Catch:{ all -> 0x0380 }
            com.startapp.sdk.ads.list3d.List3DActivity$d r0 = new com.startapp.sdk.ads.list3d.List3DActivity$d     // Catch:{ all -> 0x0380 }
            r0.<init>()     // Catch:{ all -> 0x0380 }
            r1 = 500(0x1f4, double:2.47E-321)
            r15.postDelayed(r0, r1)     // Catch:{ all -> 0x0380 }
            goto L_0x0387
        L_0x0380:
            r15 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r15)
            r14.finish()
        L_0x0387:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        if (this.f38329i != null) {
            C8846b6.m48400a((Context) this).mo29211a(this.f38329i);
        }
        Map<Activity, Integer> map = C9605vb.f39316a;
        C9605vb.m50442a((Activity) this, getResources().getConfiguration().orientation, false);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        for (C9087k9 next : C8823a6.f36412b.mo29085a(this.f38326f).f39552a.f36812a.values()) {
            if (next != null) {
                next.mo29606a();
            }
        }
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        super.onResume();
        if ((this.f38323c == null || this.f38324d == null || System.currentTimeMillis() - this.f38323c.longValue() <= this.f38324d.longValue()) ? false : true) {
            finish();
            return;
        }
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.f38681o = true;
        this.f38325e = SystemClock.uptimeMillis();
        C8968g4 g4Var = C8823a6.f36412b.mo29085a(this.f38326f).f39552a;
        for (String next : g4Var.f36812a.keySet()) {
            if (g4Var.f36812a.get(next) != null) {
                g4Var.f36812a.get(next).mo29609b();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l = this.f38323c;
        if (l != null) {
            bundle.putSerializable("lastLoadTime", l);
        }
        Long l2 = this.f38324d;
        if (l2 != null) {
            bundle.putSerializable("adCacheTtl", l2);
        }
    }
}
