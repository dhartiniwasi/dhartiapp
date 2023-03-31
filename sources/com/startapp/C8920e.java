package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.e */
/* compiled from: Sta */
public class C8920e implements Comparable<C8920e> {

    /* renamed from: a */
    public long f36709a = System.currentTimeMillis();

    /* renamed from: b */
    public AdPreferences.Placement f36710b;

    /* renamed from: c */
    public String f36711c;

    public C8920e(AdPreferences.Placement placement, String str) {
        this.f36710b = placement;
        this.f36711c = str == null ? "" : str;
    }

    public int compareTo(Object obj) {
        int i = ((this.f36709a - ((C8920e) obj).f36709a) > 0 ? 1 : ((this.f36709a - ((C8920e) obj).f36709a) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i == 0 ? 0 : -1;
    }

    public String toString() {
        StringBuilder a = C8870c1.m48422a("AdDisplayEvent [displayTime=");
        a.append(this.f36709a);
        a.append(", placement=");
        a.append(this.f36710b);
        a.append(", adTag=");
        a.append(this.f36711c);
        a.append("]");
        return a.toString();
    }
}
