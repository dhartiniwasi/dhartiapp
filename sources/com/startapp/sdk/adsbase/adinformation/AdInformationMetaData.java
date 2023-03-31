package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: Sta */
public class AdInformationMetaData implements Serializable {

    /* renamed from: a */
    public static volatile AdInformationMetaData f38717a = new AdInformationMetaData();

    /* renamed from: b */
    public static final Object f38718b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;
    @C9226pb(complex = true)
    private AdInformationConfig AdInformation = AdInformationConfig.m49798a();
    private String adInformationMetadataUpdateVersion = "4.10.8";

    /* renamed from: c */
    public static AdInformationMetaData m49810c() {
        return f38717a;
    }

    /* renamed from: a */
    public AdInformationConfig mo30603a() {
        return this.AdInformation;
    }

    /* renamed from: b */
    public String mo30604b() {
        return this.AdInformation.mo30597d();
    }

    /* renamed from: d */
    public String mo30605d() {
        AdInformationConfig adInformationConfig = this.AdInformation;
        EnumMap<AdInformationConfig.ImageResourceType, ImageResourceConfig> enumMap = adInformationConfig.f38716a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        return (!enumMap.containsKey(imageResourceType) || adInformationConfig.f38716a.get(imageResourceType).mo30630b().equals("")) ? "https://info.startappservice.com/InApp/resources/info_l.png" : adInformationConfig.f38716a.get(imageResourceType).mo30630b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
        if (!C9605vb.m50465a(this.AdInformation, adInformationMetaData.AdInformation) || !C9605vb.m50465a(this.adInformationMetadataUpdateVersion, adInformationMetaData.adInformationMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m49808a(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) C9673z2.m50588a(context, "StartappAdInfoMetadata", AdInformationMetaData.class);
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean b = C9605vb.m50473b(adInformationMetaData, adInformationMetaData2);
            if (!(!"4.10.8".equals(adInformationMetaData.adInformationMetadataUpdateVersion)) && b) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "metadata_null";
                i4Var.mo29471a();
            }
            AdInformationConfig adInformationConfig = adInformationMetaData.AdInformation;
            adInformationConfig.getClass();
            adInformationConfig.f38716a = new EnumMap<>(AdInformationConfig.ImageResourceType.class);
            f38717a = adInformationMetaData;
        } else {
            f38717a = adInformationMetaData2;
        }
        f38717a.AdInformation.mo30593a(context);
    }

    /* renamed from: a */
    public static void m49809a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f38718b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "4.10.8";
            f38717a = adInformationMetaData;
            AdInformationConfig.m49799a(f38717a.AdInformation);
            f38717a.AdInformation.mo30593a(context);
            C9673z2.m50591a(context, "StartappAdInfoMetadata", (Serializable) adInformationMetaData);
        }
    }
}
