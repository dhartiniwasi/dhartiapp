package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.C1969Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
class DynamicLoaderFallback {
    /* access modifiers changed from: private */
    public static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$a */
    class C1992a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ List f5680a;

        /* renamed from: b */
        final /* synthetic */ Map f5681b;

        /* renamed from: c */
        final /* synthetic */ List f5682c;

        /* renamed from: d */
        final /* synthetic */ List f5683d;

        /* renamed from: e */
        final /* synthetic */ Map f5684e;

        /* renamed from: f */
        final /* synthetic */ List f5685f;

        /* renamed from: g */
        final /* synthetic */ List f5686g;

        /* renamed from: h */
        final /* synthetic */ Method f5687h;

        /* renamed from: i */
        final /* synthetic */ Method f5688i;

        C1992a(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.f5680a = list;
            this.f5681b = map;
            this.f5682c = list2;
            this.f5683d = list3;
            this.f5684e = map2;
            this.f5685f = list4;
            this.f5686g = list5;
            this.f5687h = method;
            this.f5688i = method2;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (method.getReturnType().isPrimitive()) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f5680a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f5681b))) {
                }
                for (Method access$100 : this.f5682c) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$100) && DynamicLoaderFallback.reportError(obj, this.f5681b)) {
                        return null;
                    }
                }
                return null;
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
                    obj2 = obj;
                } else {
                    obj2 = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                }
                Iterator it2 = this.f5683d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f5684e.get(obj), objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method access$1002 : this.f5685f) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1002)) {
                        this.f5684e.put(obj2, obj);
                    }
                }
                for (Method access$1003 : this.f5686g) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1003)) {
                        for (C1969Ad ad : objArr) {
                            if (ad instanceof C1969Ad) {
                                this.f5681b.put(obj2, ad);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f5687h)) {
                    this.f5681b.put(objArr[1], objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f5688i)) {
                    this.f5681b.put(objArr[1], objArr[0]);
                }
                return obj2;
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$b */
    class C1993b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdListener f5689a;

        /* renamed from: b */
        final /* synthetic */ C1969Ad f5690b;

        C1993b(AdListener adListener, C1969Ad ad) {
            this.f5689a = adListener;
            this.f5690b = ad;
        }

        public void run() {
            this.f5689a.onError(this.f5690b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    DynamicLoaderFallback() {
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    static DynamicLoader makeFallbackLoader() {
        Class cls = DynamicLoader.class;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C1994c cVar = new C1994c((C1992a) null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.mo7649c(cls);
        dynamicLoader.createInterstitialAd((Context) null, (String) null, (InterstitialAd) null);
        arrayList5.add(cVar.mo7648b());
        dynamicLoader.createRewardedVideoAd((Context) null, (String) null, (RewardedVideoAd) null);
        arrayList5.add(cVar.mo7648b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.mo7648b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.mo7648b());
        dynamicLoader.createNativeAdApi((NativeAd) null, (NativeAdBaseApi) null);
        Method b = cVar.mo7648b();
        dynamicLoader.createNativeBannerAdApi((NativeBannerAd) null, (NativeAdBaseApi) null);
        Method b2 = cVar.mo7648b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.mo7649c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.mo7648b());
        nativeAdBaseApi.loadAd((NativeAdBase.NativeLoadAdConfig) null);
        arrayList2.add(cVar.mo7648b());
        nativeAdBaseApi.buildLoadAdConfig((NativeAdBase) null);
        arrayList4.add(cVar.mo7648b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.mo7649c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.mo7648b());
        interstitialAdApi.loadAd((InterstitialAd.InterstitialLoadAdConfig) null);
        arrayList2.add(cVar.mo7648b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.mo7648b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.mo7649c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.mo7648b());
        rewardedVideoAdApi.loadAd((RewardedVideoAd.RewardedVideoLoadAdConfig) null);
        arrayList2.add(cVar.mo7648b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.mo7648b());
        AdViewApi adViewApi = (AdViewApi) cVar.mo7649c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.mo7648b());
        adViewApi.loadAd((AdView.AdViewLoadConfig) null);
        arrayList2.add(cVar.mo7648b());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.mo7648b());
        ((AdView.AdViewLoadConfigBuilder) cVar.mo7649c(AdView.AdViewLoadConfigBuilder.class)).withAdListener((AdListener) null);
        arrayList3.add(cVar.mo7648b());
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.mo7649c(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener((NativeAdListener) null);
        arrayList3.add(cVar.mo7648b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.mo7649c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener((InterstitialAdListener) null);
        arrayList3.add(cVar.mo7648b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.mo7649c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener((RewardedVideoAdListener) null);
        arrayList3.add(cVar.mo7648b());
        C1992a aVar = new C1992a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, b, b2);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, aVar);
    }

    /* access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, C1969Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        C1969Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new C1993b(adListener, ad), 500);
        return true;
    }

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$c */
    private static class C1994c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Method f5691a;

        /* renamed from: b */
        private final InvocationHandler f5692b;

        /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$c$a */
        class C1995a implements InvocationHandler {
            C1995a() {
            }

            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                Method unused = C1994c.this.f5691a = method;
                return null;
            }
        }

        private C1994c() {
            this.f5692b = new C1995a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Method mo7648b() {
            return this.f5691a;
        }

        /* renamed from: c */
        public <T> T mo7649c(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f5692b));
        }

        /* synthetic */ C1994c(C1992a aVar) {
            this();
        }
    }
}
