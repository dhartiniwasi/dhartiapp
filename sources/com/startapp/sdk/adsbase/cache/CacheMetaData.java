package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class CacheMetaData implements Serializable {

    /* renamed from: a */
    public static volatile CacheMetaData f38782a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;
    @C9226pb(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private String cacheMetaDataUpdateVersion = "4.10.8";
    private float sendCacheSizeProb = 20.0f;

    /* renamed from: b */
    public static CacheMetaData m49872b() {
        return f38782a;
    }

    /* renamed from: d */
    public static boolean m49873d() {
        ACMConfig aCMConfig = f38782a.ACM;
        if (aCMConfig != null) {
            Object obj = StartAppSDKInternal.f38662D;
            if (aCMConfig.mo30663a(StartAppSDKInternal.C9395d.f38707a.f38683q)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public ACMConfig mo30676a() {
        return this.ACM;
    }

    /* renamed from: c */
    public float mo30677c() {
        return this.sendCacheSizeProb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheMetaData cacheMetaData = (CacheMetaData) obj;
        if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) != 0 || !C9605vb.m50465a(this.ACM, cacheMetaData.ACM) || !C9605vb.m50465a(this.cacheMetaDataUpdateVersion, cacheMetaData.cacheMetaDataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m49871a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "4.10.8";
        f38782a = cacheMetaData;
        C9673z2.m50591a(context, "StartappCacheMetadata", (Serializable) cacheMetaData);
    }

    /* renamed from: a */
    public static void m49870a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) C9673z2.m50588a(context, "StartappCacheMetadata", CacheMetaData.class);
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean b = C9605vb.m50473b(cacheMetaData, cacheMetaData2);
            if (!(!"4.10.8".equals(cacheMetaData.cacheMetaDataUpdateVersion)) && b) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "metadata_null";
                i4Var.mo29471a();
            }
            f38782a = cacheMetaData;
            return;
        }
        f38782a = cacheMetaData2;
    }
}
