package com.startapp.sdk.adsbase.apppresence;

import java.io.Serializable;

/* compiled from: Sta */
public class AppPresenceDetails implements Serializable {
    private static final long serialVersionUID = 1;
    private int adAttempt;
    private boolean appPresence = false;
    private boolean isShown = true;
    private int minAppVersion;
    private String packageName;
    private String trackingUrl;

    public AppPresenceDetails(String str, String str2, int i, int i2) {
        this.trackingUrl = str;
        this.packageName = str2;
        this.adAttempt = i;
        this.minAppVersion = i2;
    }

    /* renamed from: a */
    public void mo30649a(String str) {
        this.trackingUrl = str;
    }

    /* renamed from: b */
    public String mo30651b() {
        return this.packageName;
    }

    /* renamed from: c */
    public String mo30653c() {
        return this.trackingUrl;
    }

    /* renamed from: d */
    public boolean mo30654d() {
        return this.appPresence;
    }

    /* renamed from: e */
    public boolean mo30655e() {
        return this.isShown;
    }

    /* renamed from: a */
    public void mo30650a(boolean z) {
        this.appPresence = z;
    }

    /* renamed from: b */
    public void mo30652b(boolean z) {
        this.isShown = z;
    }

    /* renamed from: a */
    public int mo30648a() {
        return this.minAppVersion;
    }
}
