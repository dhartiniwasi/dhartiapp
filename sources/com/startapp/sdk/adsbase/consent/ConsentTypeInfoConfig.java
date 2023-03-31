package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;
    private Integer falseClick;
    private Integer impression;
    private Integer trueClick;

    /* renamed from: a */
    public Integer mo30757a() {
        return this.falseClick;
    }

    /* renamed from: b */
    public Integer mo30758b() {
        return this.impression;
    }

    /* renamed from: c */
    public Integer mo30759c() {
        return this.trueClick;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentTypeInfoConfig.class != obj.getClass()) {
            return false;
        }
        ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
        if (!C9605vb.m50465a(this.impression, consentTypeInfoConfig.impression) || !C9605vb.m50465a(this.trueClick, consentTypeInfoConfig.trueClick) || !C9605vb.m50465a(this.falseClick, consentTypeInfoConfig.falseClick)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
