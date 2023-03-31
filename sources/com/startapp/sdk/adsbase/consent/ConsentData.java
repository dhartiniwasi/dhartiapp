package com.startapp.sdk.adsbase.consent;

import java.io.Serializable;

/* compiled from: Sta */
public final class ConsentData implements Serializable {
    private static final long serialVersionUID = 4245437752472461229L;
    private Boolean apc;
    private String infoDialogClickUrl;
    private String infoDialogDParam;
    private String infoDialogImpressionUrl;
    private Long timeStamp;
    private Integer type;

    /* renamed from: a */
    public void mo30747a(Integer num) {
        this.type = num;
    }

    /* renamed from: b */
    public void mo30751b(String str) {
        this.infoDialogDParam = str;
    }

    /* renamed from: c */
    public String mo30752c() {
        return this.infoDialogDParam;
    }

    /* renamed from: d */
    public String mo30754d() {
        return this.infoDialogImpressionUrl;
    }

    /* renamed from: e */
    public Long mo30755e() {
        return this.timeStamp;
    }

    /* renamed from: f */
    public Integer mo30756f() {
        return this.type;
    }

    /* renamed from: a */
    public void mo30748a(Long l) {
        this.timeStamp = l;
    }

    /* renamed from: b */
    public String mo30750b() {
        return this.infoDialogClickUrl;
    }

    /* renamed from: c */
    public void mo30753c(String str) {
        this.infoDialogImpressionUrl = str;
    }

    /* renamed from: a */
    public Boolean mo30745a() {
        return this.apc;
    }

    /* renamed from: a */
    public void mo30746a(Boolean bool) {
        this.apc = bool;
    }

    /* renamed from: a */
    public void mo30749a(String str) {
        this.infoDialogClickUrl = str;
    }
}
