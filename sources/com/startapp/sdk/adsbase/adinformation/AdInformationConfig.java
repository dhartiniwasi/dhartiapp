package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import com.startapp.C8947f4;
import com.startapp.C8960g1;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AdInformationConfig implements Serializable {

    /* renamed from: b */
    public static final String f38715b = "https://funnel-assets.startappservice.com/consent/index.html";
    private static final long serialVersionUID = 8911501868319500986L;
    @C9226pb(type = ArrayList.class, value = ImageResourceConfig.class)
    private List<ImageResourceConfig> ImageResources = new ArrayList();
    @C9226pb(key = AdPreferences.Placement.class, type = HashMap.class, value = AdInformationPositions.Position.class)
    public HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap<>();

    /* renamed from: a */
    public transient EnumMap<ImageResourceType, ImageResourceConfig> f38716a = new EnumMap<>(ImageResourceType.class);
    private Integer consentTypeInfo;
    private String dialogUrlSecured = f38715b;
    private boolean enabled = true;
    private String eulaUrlSecured = "https://www.startapp.com/policy/privacy-policy/";
    private float fatFingersFactor = 200.0f;

    /* compiled from: Sta */
    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_EX_S(88, 14),
        INFO_L(25, 21),
        INFO_EX_L(130, 21);
        
        private final int height;
        private final int width;

        private ImageResourceType(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public static ImageResourceType getByName(String str) {
            ImageResourceType imageResourceType = INFO_S;
            for (ImageResourceType imageResourceType2 : values()) {
                if (imageResourceType2.name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    imageResourceType = imageResourceType2;
                }
            }
            return imageResourceType;
        }

        public int getDefaultHeight() {
            return this.height;
        }

        public int getDefaultWidth() {
            return this.width;
        }
    }

    private AdInformationConfig() {
    }

    /* renamed from: a */
    public static AdInformationConfig m49798a() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        m49799a(adInformationConfig);
        return adInformationConfig;
    }

    /* renamed from: b */
    public Integer mo30594b() {
        return this.consentTypeInfo;
    }

    /* renamed from: c */
    public String mo30596c() {
        String str = this.dialogUrlSecured;
        return str != null ? str : f38715b;
    }

    /* renamed from: d */
    public String mo30597d() {
        String str = this.eulaUrlSecured;
        return (str == null || str.equals("")) ? "https://www.startapp.com/policy/privacy-policy/" : this.eulaUrlSecured;
    }

    /* renamed from: e */
    public float mo30598e() {
        return this.fatFingersFactor / 100.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
        if (this.enabled != adInformationConfig.enabled || Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) != 0 || !C9605vb.m50465a(this.consentTypeInfo, adInformationConfig.consentTypeInfo) || !C9605vb.m50465a(this.dialogUrlSecured, adInformationConfig.dialogUrlSecured) || !C9605vb.m50465a(this.eulaUrlSecured, adInformationConfig.eulaUrlSecured) || !C9605vb.m50465a(this.Positions, adInformationConfig.Positions) || !C9605vb.m50465a(this.ImageResources, adInformationConfig.ImageResources)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.consentTypeInfo, Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: b */
    public boolean mo30595b(Context context) {
        if (ComponentLocator.m50248a(context).mo31168d().getBoolean("userDisabledAdInformation", false) || !this.enabled) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m49799a(AdInformationConfig adInformationConfig) {
        boolean z;
        adInformationConfig.getClass();
        int i = 0;
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            ImageResourceConfig imageResourceConfig = adInformationConfig.f38716a.get(imageResourceType);
            if (imageResourceConfig == null) {
                imageResourceConfig = ImageResourceConfig.m49827a(imageResourceType.name());
                Iterator<ImageResourceConfig> it = adInformationConfig.ImageResources.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ImageResourceType.getByName(it.next().mo30633c()).equals(imageResourceType)) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                adInformationConfig.f38716a.put(imageResourceType, imageResourceConfig);
                if (z) {
                    adInformationConfig.ImageResources.add(imageResourceConfig);
                }
            }
            imageResourceConfig.mo30631b(imageResourceType.getDefaultWidth());
            imageResourceConfig.mo30629a(imageResourceType.getDefaultHeight());
            imageResourceConfig.mo30632b(imageResourceType.name().toLowerCase() + ".png");
        }
        ImageResourceType[] values = ImageResourceType.values();
        int length = values.length;
        while (i < length) {
            ImageResourceType imageResourceType2 = values[i];
            if (adInformationConfig.f38716a.get(imageResourceType2) != null) {
                i++;
            } else {
                throw new IllegalArgumentException(String.valueOf(imageResourceType2));
            }
        }
    }

    /* renamed from: a */
    public AdInformationPositions.Position mo30591a(AdPreferences.Placement placement) {
        AdInformationPositions.Position position = this.Positions.get(placement);
        if (position != null) {
            return position;
        }
        AdInformationPositions.Position position2 = AdInformationPositions.Position.BOTTOM_LEFT;
        this.Positions.put(placement, position2);
        return position2;
    }

    /* renamed from: a */
    public void mo30593a(Context context) {
        for (ImageResourceConfig next : this.ImageResources) {
            this.f38716a.put(ImageResourceType.getByName(next.mo30633c()), next);
            next.f38740a = null;
            new C8960g1(context, next.mo30630b(), new C8947f4(next), 0).mo29368a();
        }
    }

    /* renamed from: a */
    public ImageResourceConfig mo30592a(ImageResourceType imageResourceType) {
        return this.f38716a.get(imageResourceType);
    }
}
