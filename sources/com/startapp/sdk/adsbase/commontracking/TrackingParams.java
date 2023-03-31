package com.startapp.sdk.adsbase.commontracking;

import com.startapp.C8870c1;
import com.startapp.C9584u9;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.Serializable;

/* compiled from: Sta */
public class TrackingParams implements Serializable {
    private static final long serialVersionUID = 1;
    private String adTag;
    private String clientSessionId;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public TrackingParams() {
        this((String) null);
    }

    /* renamed from: a */
    public String mo30722a() {
        return this.adTag;
    }

    /* renamed from: b */
    public int mo30723b() {
        return this.offset;
    }

    /* renamed from: c */
    public String mo30396c() {
        if (this.offset <= 0) {
            return "";
        }
        StringBuilder a = C8870c1.m48422a("&offset=");
        a.append(this.offset);
        return a.toString();
    }

    /* renamed from: d */
    public String mo30724d() {
        return this.profileId;
    }

    /* renamed from: e */
    public String mo30365e() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        String str4 = this.adTag;
        String str5 = "";
        if (str4 == null || str4.equals(str5)) {
            str = str5;
        } else {
            int i = 200;
            if (this.adTag.length() < 200) {
                i = this.adTag.length();
            }
            StringBuilder a = C8870c1.m48422a("&adTag=");
            a.append(C9605vb.m50469b(this.adTag.substring(0, i)));
            str = a.toString();
        }
        sb.append(str);
        if (this.clientSessionId != null) {
            StringBuilder a2 = C8870c1.m48422a("&clientSessionId=");
            a2.append(C9605vb.m50469b(this.clientSessionId));
            str2 = a2.toString();
        } else {
            str2 = str5;
        }
        sb.append(str2);
        if (this.profileId != null) {
            StringBuilder a3 = C8870c1.m48422a("&profileId=");
            a3.append(C9605vb.m50469b(this.profileId));
            str3 = a3.toString();
        } else {
            str3 = str5;
        }
        sb.append(str3);
        sb.append(mo30396c());
        String str6 = this.nonImpressionReason;
        if (str6 != null && !str6.equals(str5)) {
            StringBuilder a4 = C8870c1.m48422a("&isShown=false&reason=");
            a4.append(C9605vb.m50469b(this.nonImpressionReason));
            str5 = a4.toString();
        }
        sb.append(str5);
        return sb.toString();
    }

    public TrackingParams(String str) {
        this.adTag = str;
        this.clientSessionId = C9584u9.f39253d.mo31308a();
        this.profileId = MetaData.m50090v().mo30989E();
        this.offset = 0;
    }

    /* renamed from: a */
    public TrackingParams mo30720a(int i) {
        this.offset = i;
        return this;
    }

    /* renamed from: a */
    public TrackingParams mo30721a(String str) {
        this.nonImpressionReason = str;
        return this;
    }
}
