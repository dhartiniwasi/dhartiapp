package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.C9673z2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class SplashMetaData implements Serializable {

    /* renamed from: a */
    public static volatile SplashMetaData f38416a = new SplashMetaData();

    /* renamed from: b */
    public static final Object f38417b = new Object();
    private static final long serialVersionUID = 5949259263399692883L;
    @C9226pb(complex = true)
    private SplashConfig SplashConfig = new SplashConfig();
    private String splashMetadataUpdateVersion = "4.10.8";

    /* renamed from: a */
    public SplashConfig mo30255a() {
        return this.SplashConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashMetaData splashMetaData = (SplashMetaData) obj;
        if (!C9605vb.m50465a(this.SplashConfig, splashMetaData.SplashConfig) || !C9605vb.m50465a(this.splashMetadataUpdateVersion, splashMetaData.splashMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.SplashConfig, this.splashMetadataUpdateVersion};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m49439a(Context context, SplashMetaData splashMetaData) {
        synchronized (f38417b) {
            splashMetaData.splashMetadataUpdateVersion = "4.10.8";
            f38416a = splashMetaData;
            C9673z2.m50591a(context, "StartappSplashMetadata", (Serializable) splashMetaData);
        }
    }

    /* renamed from: a */
    public static void m49438a(Context context) {
        SplashMetaData splashMetaData = (SplashMetaData) C9673z2.m50588a(context, "StartappSplashMetadata", SplashMetaData.class);
        SplashMetaData splashMetaData2 = new SplashMetaData();
        if (splashMetaData != null) {
            boolean b = C9605vb.m50473b(splashMetaData, splashMetaData2);
            if (!(!"4.10.8".equals(splashMetaData.splashMetadataUpdateVersion)) && b) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "metadata_null";
                i4Var.mo29471a();
            }
            f38416a = splashMetaData;
            return;
        }
        f38416a = splashMetaData2;
    }
}
