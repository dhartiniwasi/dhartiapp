package com.startapp.sdk.ads.banner;

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
public class BannerMetaData implements Serializable {

    /* renamed from: a */
    public static Object f38218a = new Object();

    /* renamed from: b */
    public static volatile BannerMetaData f38219b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;
    @C9226pb(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "4.10.8";

    /* renamed from: a */
    public BannerOptions mo29957a() {
        return this.BannerOptions;
    }

    /* renamed from: b */
    public BannerOptions mo29958b() {
        return new BannerOptions(this.BannerOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerMetaData bannerMetaData = (BannerMetaData) obj;
        if (!C9605vb.m50465a(this.BannerOptions, bannerMetaData.BannerOptions) || !C9605vb.m50465a(this.bannerMetadataUpdateVersion, bannerMetaData.bannerMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m49280a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f38218a) {
            bannerMetaData.bannerMetadataUpdateVersion = "4.10.8";
            f38219b = bannerMetaData;
            C9673z2.m50591a(context, "StartappBannerMetadata", (Serializable) bannerMetaData);
        }
    }

    /* renamed from: a */
    public static void m49279a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) C9673z2.m50588a(context, "StartappBannerMetadata", BannerMetaData.class);
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean b = C9605vb.m50473b(bannerMetaData, bannerMetaData2);
            if (!(!"4.10.8".equals(bannerMetaData.bannerMetadataUpdateVersion)) && b) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "metadata_null";
                i4Var.mo29471a();
            }
            f38219b = bannerMetaData;
            return;
        }
        f38219b = bannerMetaData2;
    }
}
