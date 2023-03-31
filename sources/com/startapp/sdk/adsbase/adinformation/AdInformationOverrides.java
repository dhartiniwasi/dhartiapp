package com.startapp.sdk.adsbase.adinformation;

import com.startapp.C9226pb;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import java.io.Serializable;

/* compiled from: Sta */
public class AdInformationOverrides implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean enable = true;
    private boolean enableOverride = false;
    @C9226pb(type = AdInformationPositions.Position.class)
    private AdInformationPositions.Position position = AdInformationPositions.Position.getByName(AdInformationPositions.f38731a);
    private boolean positionOverride = false;

    private AdInformationOverrides() {
    }

    /* renamed from: a */
    public static AdInformationOverrides m49816a() {
        return new AdInformationOverrides();
    }

    /* renamed from: b */
    public AdInformationPositions.Position mo30614b() {
        return this.position;
    }

    /* renamed from: c */
    public boolean mo30615c() {
        return this.enable;
    }

    /* renamed from: d */
    public boolean mo30616d() {
        return this.enableOverride;
    }

    /* renamed from: e */
    public boolean mo30617e() {
        return this.positionOverride;
    }

    /* renamed from: a */
    public void mo30613a(boolean z) {
        this.enable = z;
        this.enableOverride = true;
    }

    /* renamed from: a */
    public void mo30612a(AdInformationPositions.Position position2) {
        this.position = position2;
        if (position2 != null) {
            this.positionOverride = true;
        } else {
            this.positionOverride = false;
        }
    }
}
