package com.startapp.sdk.adsbase.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.C9226pb;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class AdDetails implements Serializable, Parcelable {
    public static final Parcelable.Creator<AdDetails> CREATOR = new C9446a();
    private static final long serialVersionUID = 3187184359567678542L;
    private String adId;
    @C9226pb(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private boolean app;
    private String appPresencePackage;
    private boolean belowMinCPM;
    private String bidToken;
    private String callToAction;
    private String category;
    private String clickUrl;
    private String closeUrl;
    private Long delayImpressionInSeconds;
    private String description;
    @C9226pb(type = ArrayList.class)
    private List<String> externalClickUrls;
    @C9226pb(type = ArrayList.class)
    private List<String> externalImpressionUrls;
    private String imageUrl;
    private String installs;
    private String intentDetails;
    private String intentPackageName;
    private int minAppVersion;
    private String packageName;
    private float rating;
    private String secondaryImageUrl;
    private Boolean sendRedirectHops;
    private boolean smartRedirect;
    private boolean startappBrowserEnabled;
    private String template;
    private String title;
    private String trackingClickUrl;
    private String trackingUrl;
    private Long ttl;

    /* renamed from: com.startapp.sdk.adsbase.model.AdDetails$a */
    /* compiled from: Sta */
    public class C9446a implements Parcelable.Creator<AdDetails> {
        public Object createFromParcel(Parcel parcel) {
            return new AdDetails(parcel);
        }

        public Object[] newArray(int i) {
            return new AdDetails[i];
        }
    }

    public AdDetails() {
        this.rating = 5.0f;
        this.belowMinCPM = false;
    }

    /* renamed from: A */
    public boolean mo30824A() {
        return this.smartRedirect;
    }

    /* renamed from: B */
    public boolean mo30825B() {
        return this.startappBrowserEnabled;
    }

    /* renamed from: C */
    public Boolean mo30826C() {
        return this.sendRedirectHops;
    }

    /* renamed from: a */
    public String mo30827a() {
        return this.adId;
    }

    /* renamed from: b */
    public List<VerificationDetails> mo30828b() {
        return this.adVerifications;
    }

    /* renamed from: c */
    public String mo30829c() {
        return this.appPresencePackage;
    }

    /* renamed from: d */
    public String mo30830d() {
        return this.bidToken;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo30832e() {
        return this.callToAction;
    }

    /* renamed from: f */
    public String mo30833f() {
        return this.category;
    }

    /* renamed from: g */
    public String mo30834g() {
        return this.clickUrl;
    }

    /* renamed from: h */
    public Long mo30835h() {
        return this.delayImpressionInSeconds;
    }

    /* renamed from: i */
    public String mo30836i() {
        return this.description;
    }

    /* renamed from: j */
    public String mo30837j() {
        return this.imageUrl;
    }

    /* renamed from: k */
    public String mo30838k() {
        return this.installs;
    }

    /* renamed from: l */
    public String mo30839l() {
        return this.intentDetails;
    }

    /* renamed from: m */
    public String mo30840m() {
        return this.intentPackageName;
    }

    /* renamed from: n */
    public boolean mo30841n() {
        return this.belowMinCPM;
    }

    /* renamed from: o */
    public int mo30842o() {
        return this.minAppVersion;
    }

    /* renamed from: p */
    public String mo30843p() {
        return this.packageName;
    }

    /* renamed from: q */
    public float mo30844q() {
        return this.rating;
    }

    /* renamed from: r */
    public String mo30845r() {
        return this.secondaryImageUrl;
    }

    /* renamed from: s */
    public String mo30846s() {
        return this.template;
    }

    /* renamed from: t */
    public String mo30847t() {
        return this.title;
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public String[] mo30849u() {
        if (this.externalClickUrls != null) {
            ArrayList arrayList = new ArrayList(this.externalClickUrls);
            arrayList.add(this.trackingClickUrl);
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[]{this.trackingClickUrl};
    }

    /* renamed from: v */
    public String mo30850v() {
        return this.closeUrl;
    }

    /* renamed from: w */
    public String[] mo30851w() {
        if (this.externalImpressionUrls != null) {
            ArrayList arrayList = new ArrayList(this.externalImpressionUrls);
            arrayList.add(this.trackingUrl);
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[]{this.trackingUrl};
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bidToken);
        parcel.writeString(this.adId);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.trackingClickUrl);
        parcel.writeString(this.closeUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.secondaryImageUrl);
        parcel.writeFloat(this.rating);
        boolean z = this.smartRedirect;
        boolean z2 = this.startappBrowserEnabled;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(z2 ? 1 : 0);
        parcel.writeString(this.template);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appPresencePackage);
        parcel.writeString(this.intentPackageName);
        parcel.writeString(this.intentDetails);
        parcel.writeInt(this.minAppVersion);
        parcel.writeString(this.installs);
        parcel.writeString(this.category);
        parcel.writeInt(this.app ? 1 : 0);
        parcel.writeInt(this.belowMinCPM ? 1 : 0);
        Long l = this.ttl;
        if (l != null) {
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeLong(-1);
        }
        Long l2 = this.delayImpressionInSeconds;
        if (l2 != null) {
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeLong(-1);
        }
        Boolean bool = this.sendRedirectHops;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bool.booleanValue() ? 1 : -1);
        }
        parcel.writeList(this.externalImpressionUrls);
        parcel.writeList(this.externalClickUrls);
        parcel.writeString(this.callToAction);
    }

    /* renamed from: x */
    public Long mo30853x() {
        return this.ttl;
    }

    /* renamed from: y */
    public boolean mo30854y() {
        return this.app;
    }

    /* renamed from: z */
    public boolean mo30855z() {
        return this.intentPackageName != null;
    }

    public AdDetails(Parcel parcel) {
        Class<String> cls = String.class;
        this.rating = 5.0f;
        boolean z = false;
        this.belowMinCPM = false;
        this.bidToken = parcel.readString();
        this.adId = parcel.readString();
        this.clickUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.trackingClickUrl = parcel.readString();
        this.closeUrl = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.imageUrl = parcel.readString();
        this.secondaryImageUrl = parcel.readString();
        this.rating = parcel.readFloat();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.smartRedirect = readInt == 1;
        this.startappBrowserEnabled = readInt2 != 0;
        this.template = parcel.readString();
        this.packageName = parcel.readString();
        this.appPresencePackage = parcel.readString();
        this.intentPackageName = parcel.readString();
        this.intentDetails = parcel.readString();
        this.minAppVersion = parcel.readInt();
        this.installs = parcel.readString();
        this.category = parcel.readString();
        this.app = parcel.readInt() == 1;
        this.belowMinCPM = parcel.readInt() == 1;
        Long valueOf = Long.valueOf(parcel.readLong());
        this.ttl = valueOf;
        if (valueOf.longValue() == -1) {
            this.ttl = null;
        }
        Long valueOf2 = Long.valueOf(parcel.readLong());
        this.delayImpressionInSeconds = valueOf2;
        if (valueOf2.longValue() == -1) {
            this.delayImpressionInSeconds = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 == 0) {
            this.sendRedirectHops = null;
        } else {
            this.sendRedirectHops = Boolean.valueOf(readInt3 == 1 ? true : z);
        }
        this.externalImpressionUrls = parcel.readArrayList(cls.getClassLoader());
        this.externalClickUrls = parcel.readArrayList(cls.getClassLoader());
        this.callToAction = parcel.readString();
    }
}
