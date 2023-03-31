package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ConsentConfig implements Serializable {
    private static final long serialVersionUID = 8363121715420063423L;
    private boolean allowCT;
    private String clickUrl;
    private Integer consentType;
    @C9226pb(complex = true)
    private ConsentTypeInfoConfig consentTypeInfo;
    private String dParam;
    private boolean detectConsentCovering;
    private String impressionUrl;
    private String template;
    private Integer templateId;
    private Integer templateName;
    private long timeStamp = 0;

    /* renamed from: a */
    public String mo30732a() {
        return this.clickUrl;
    }

    /* renamed from: b */
    public Integer mo30733b() {
        return this.consentType;
    }

    /* renamed from: c */
    public ConsentTypeInfoConfig mo30734c() {
        return this.consentTypeInfo;
    }

    /* renamed from: d */
    public String mo30735d() {
        return this.dParam;
    }

    /* renamed from: e */
    public String mo30736e() {
        return this.impressionUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentConfig.class != obj.getClass()) {
            return false;
        }
        ConsentConfig consentConfig = (ConsentConfig) obj;
        if (this.allowCT != consentConfig.allowCT || this.detectConsentCovering != consentConfig.detectConsentCovering || this.timeStamp != consentConfig.timeStamp || !C9605vb.m50465a(this.template, consentConfig.template) || !C9605vb.m50465a(this.impressionUrl, consentConfig.impressionUrl) || !C9605vb.m50465a(this.clickUrl, consentConfig.clickUrl) || !C9605vb.m50465a(this.templateName, consentConfig.templateName) || !C9605vb.m50465a(this.templateId, consentConfig.templateId) || !C9605vb.m50465a(this.dParam, consentConfig.dParam) || !C9605vb.m50465a(this.consentTypeInfo, consentConfig.consentTypeInfo)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo30738f() {
        return this.template;
    }

    /* renamed from: g */
    public Integer mo30739g() {
        return this.templateId;
    }

    /* renamed from: h */
    public Integer mo30740h() {
        return this.templateName;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.allowCT), Boolean.valueOf(this.detectConsentCovering), this.template, Long.valueOf(this.timeStamp), this.impressionUrl, this.clickUrl, this.templateName, this.templateId, this.dParam, this.consentTypeInfo};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public long mo30742i() {
        return this.timeStamp;
    }

    /* renamed from: j */
    public boolean mo30743j() {
        return this.detectConsentCovering;
    }

    /* renamed from: k */
    public boolean mo30744k() {
        return this.allowCT;
    }
}
