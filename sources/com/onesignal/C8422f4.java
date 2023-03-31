package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.f4 */
/* compiled from: TrackGooglePurchase */
class C8422f4 {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static int f35597i = -99;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static Class<?> f35598j;

    /* renamed from: a */
    private ServiceConnection f35599a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Object f35600b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Method f35601c;

    /* renamed from: d */
    private Method f35602d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f35603e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<String> f35604f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f35605g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f35606h;

    /* renamed from: com.onesignal.f4$a */
    /* compiled from: TrackGooglePurchase */
    class C8423a implements ServiceConnection {
        C8423a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Method h = C8422f4.m46718q(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                h.setAccessible(true);
                Object unused = C8422f4.this.f35600b = h.invoke((Object) null, new Object[]{iBinder});
                C8422f4.this.m46703b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            int unused = C8422f4.f35597i = -99;
            Object unused2 = C8422f4.this.f35600b = null;
        }
    }

    /* renamed from: com.onesignal.f4$b */
    /* compiled from: TrackGooglePurchase */
    class C8424b implements Runnable {
        C8424b() {
        }

        public void run() {
            boolean unused = C8422f4.this.f35606h = true;
            try {
                if (C8422f4.this.f35601c == null) {
                    Method unused2 = C8422f4.this.f35601c = C8422f4.m46719r(C8422f4.f35598j);
                    C8422f4.this.f35601c.setAccessible(true);
                }
                Bundle bundle = (Bundle) C8422f4.this.f35601c.invoke(C8422f4.this.f35600b, new Object[]{3, C8422f4.this.f35603e.getPackageName(), "inapp", null});
                if (bundle.getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str = stringArrayList.get(i);
                        String string = new JSONObject(stringArrayList2.get(i)).getString("purchaseToken");
                        if (!C8422f4.this.f35604f.contains(string) && !arrayList2.contains(string)) {
                            arrayList2.add(string);
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() > 0) {
                        C8422f4.this.m46721t(arrayList, arrayList2);
                    } else if (stringArrayList2.size() == 0) {
                        boolean unused3 = C8422f4.this.f35605g = false;
                        C8500m3.m47111j("GTPlayerPurchases", "ExistingPurchases", false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            boolean unused4 = C8422f4.this.f35606h = false;
        }
    }

    /* renamed from: com.onesignal.f4$c */
    /* compiled from: TrackGooglePurchase */
    class C8425c extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ ArrayList f35609a;

        C8425c(ArrayList arrayList) {
            this.f35609a = arrayList;
        }

        /* renamed from: b */
        public void mo27539b(String str) {
            C8422f4.this.f35604f.addAll(this.f35609a);
            C8500m3.m47114m("GTPlayerPurchases", "purchaseTokens", C8422f4.this.f35604f.toString());
            C8500m3.m47111j("GTPlayerPurchases", "ExistingPurchases", true);
            boolean unused = C8422f4.this.f35605g = false;
            boolean unused2 = C8422f4.this.f35606h = false;
        }
    }

    C8422f4(Context context) {
        boolean z = false;
        this.f35606h = false;
        this.f35603e = context;
        this.f35604f = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(C8500m3.m47107f("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f35604f.add(jSONArray.get(i).toString());
            }
            z = jSONArray.length() == 0 ? true : z;
            this.f35605g = z;
            if (z) {
                this.f35605g = C8500m3.m47103b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo27790u();
    }

    /* renamed from: a */
    static boolean m46702a(Context context) {
        if (f35597i == -99) {
            f35597i = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (f35597i == 0) {
                f35598j = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            if (f35597i == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            f35597i = 0;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m46703b() {
        if (!this.f35606h) {
            new Thread(new C8424b()).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static Method m46718q(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<IBinder>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static Method m46719r(Class cls) {
        Class<String> cls2 = String.class;
        for (Method method : cls.getMethods()) {
            Class<String>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls2 && parameterTypes[2] == cls2 && parameterTypes[3] == cls2) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: s */
    private static Method m46720s(Class cls) {
        Class<String> cls2 = String.class;
        for (Method method : cls.getMethods()) {
            Class<Bundle>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls2 && parameterTypes[2] == cls2 && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m46721t(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.f35602d == null) {
                Method s = m46720s(f35598j);
                this.f35602d = s;
                s.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) this.f35602d.invoke(this.f35600b, new Object[]{3, this.f35603e.getPackageName(), "inapp", bundle});
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (hashMap.containsKey(next)) {
                        jSONArray.put(hashMap.get(next));
                    }
                }
                if (jSONArray.length() > 0) {
                    C8338d3.m46523h2(jSONArray, this.f35605g, new C8425c(arrayList2));
                }
            }
        } catch (Throwable th) {
            C8338d3.m46496b(C8338d3.C8384r0.WARN, "Failed to track IAP purchases", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo27790u() {
        if (this.f35599a == null) {
            this.f35599a = new C8423a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f35603e.bindService(intent, this.f35599a, 1);
        } else if (this.f35600b != null) {
            m46703b();
        }
    }
}
