package com.startapp.sdk.ads.banner;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BannerOptions implements Serializable {
    private static final long serialVersionUID = -5495602901437914475L;
    private int adsNumber = 4;
    private boolean checkAlpha = true;
    private boolean checkCoverage = true;
    private boolean checkFocus;
    private boolean checkVisibility = true;
    private int delayFaceTime = 5000;
    @C9226pb(type = Effect.class)
    private Effect effect = Effect.ROTATE_3D;
    private int height = 50;
    private float heightRatio = 1.0f;
    private int htmlAdsNumber = 10;
    private float minScale = 0.88f;
    private int minViewabilityPercentage = 50;
    private boolean preCheck;
    private int refreshRate = 60000;
    private int refreshRate3D = 60000;
    private boolean rotateThroughOnStart = true;
    private int rotateThroughSpeedMult = 2;
    private int scalePower = 4;
    private int stepSize = 5;
    private int timeBetweenFrames = 25;
    private int width = 300;
    private float widthRatio = 1.0f;

    /* compiled from: Sta */
    public enum Effect {
        ROTATE_3D(1),
        EXCHANGE(2),
        FLY_IN(3);
        
        private int index;

        private Effect(int i) {
            this.index = i;
        }

        public int getRotationMultiplier() {
            return (int) Math.pow(2.0d, (double) (this.index - 1));
        }
    }

    public BannerOptions() {
    }

    /* renamed from: a */
    public void mo29962a(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* renamed from: b */
    public int mo29963b() {
        return this.delayFaceTime;
    }

    /* renamed from: c */
    public Effect mo29964c() {
        return this.effect;
    }

    /* renamed from: d */
    public int mo29965d() {
        return this.height;
    }

    /* renamed from: e */
    public float mo29966e() {
        return this.heightRatio;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerOptions bannerOptions = (BannerOptions) obj;
        if (this.width == bannerOptions.width && this.height == bannerOptions.height && this.minViewabilityPercentage == bannerOptions.minViewabilityPercentage && this.preCheck == bannerOptions.preCheck && this.checkFocus == bannerOptions.checkFocus && this.checkCoverage == bannerOptions.checkCoverage && this.checkVisibility == bannerOptions.checkVisibility && this.checkAlpha == bannerOptions.checkAlpha && this.timeBetweenFrames == bannerOptions.timeBetweenFrames && this.stepSize == bannerOptions.stepSize && this.delayFaceTime == bannerOptions.delayFaceTime && this.adsNumber == bannerOptions.adsNumber && this.htmlAdsNumber == bannerOptions.htmlAdsNumber && this.refreshRate3D == bannerOptions.refreshRate3D && Float.compare(this.widthRatio, bannerOptions.widthRatio) == 0 && Float.compare(this.heightRatio, bannerOptions.heightRatio) == 0 && Float.compare(this.minScale, bannerOptions.minScale) == 0 && this.scalePower == bannerOptions.scalePower && this.rotateThroughOnStart == bannerOptions.rotateThroughOnStart && this.rotateThroughSpeedMult == bannerOptions.rotateThroughSpeedMult && this.refreshRate == bannerOptions.refreshRate && this.effect == bannerOptions.effect) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo29968f() {
        return this.htmlAdsNumber;
    }

    /* renamed from: g */
    public float mo29969g() {
        return this.minScale;
    }

    /* renamed from: h */
    public int mo29970h() {
        return this.minViewabilityPercentage;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.minViewabilityPercentage), Boolean.valueOf(this.preCheck), Boolean.valueOf(this.checkFocus), Boolean.valueOf(this.checkCoverage), Boolean.valueOf(this.checkVisibility), Boolean.valueOf(this.checkAlpha), Integer.valueOf(this.timeBetweenFrames), Integer.valueOf(this.stepSize), Integer.valueOf(this.delayFaceTime), Integer.valueOf(this.adsNumber), Integer.valueOf(this.htmlAdsNumber), Integer.valueOf(this.refreshRate3D), Float.valueOf(this.widthRatio), Float.valueOf(this.heightRatio), Float.valueOf(this.minScale), Integer.valueOf(this.scalePower), this.effect, Boolean.valueOf(this.rotateThroughOnStart), Integer.valueOf(this.rotateThroughSpeedMult), Integer.valueOf(this.refreshRate)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public int mo29972i() {
        return this.refreshRate;
    }

    /* renamed from: j */
    public int mo29973j() {
        return this.refreshRate3D;
    }

    /* renamed from: k */
    public int mo29974k() {
        return this.rotateThroughSpeedMult;
    }

    /* renamed from: l */
    public int mo29975l() {
        return this.scalePower;
    }

    /* renamed from: m */
    public int mo29976m() {
        return this.stepSize;
    }

    /* renamed from: n */
    public int mo29977n() {
        return this.timeBetweenFrames;
    }

    /* renamed from: o */
    public int mo29978o() {
        return this.width;
    }

    /* renamed from: p */
    public float mo29979p() {
        return this.widthRatio;
    }

    /* renamed from: q */
    public boolean mo29980q() {
        return this.checkCoverage;
    }

    /* renamed from: r */
    public boolean mo29981r() {
        return this.checkFocus;
    }

    /* renamed from: s */
    public boolean mo29982s() {
        return this.rotateThroughOnStart;
    }

    /* renamed from: t */
    public boolean mo29983t() {
        return this.checkAlpha;
    }

    /* renamed from: u */
    public boolean mo29984u() {
        return this.checkVisibility;
    }

    /* renamed from: v */
    public boolean mo29985v() {
        return this.preCheck;
    }

    /* renamed from: a */
    public int mo29961a() {
        return this.adsNumber;
    }

    public BannerOptions(BannerOptions bannerOptions) {
        this.width = bannerOptions.width;
        this.height = bannerOptions.height;
        this.timeBetweenFrames = bannerOptions.timeBetweenFrames;
        this.stepSize = bannerOptions.stepSize;
        this.delayFaceTime = bannerOptions.delayFaceTime;
        this.adsNumber = bannerOptions.adsNumber;
        this.htmlAdsNumber = bannerOptions.htmlAdsNumber;
        this.refreshRate3D = bannerOptions.refreshRate3D;
        this.widthRatio = bannerOptions.widthRatio;
        this.heightRatio = bannerOptions.heightRatio;
        this.minScale = bannerOptions.minScale;
        this.scalePower = bannerOptions.scalePower;
        this.effect = bannerOptions.effect;
        this.rotateThroughOnStart = bannerOptions.rotateThroughOnStart;
        this.rotateThroughSpeedMult = bannerOptions.rotateThroughSpeedMult;
        this.refreshRate = bannerOptions.refreshRate;
        this.minViewabilityPercentage = bannerOptions.minViewabilityPercentage;
        this.checkFocus = bannerOptions.checkFocus;
        this.checkCoverage = bannerOptions.checkCoverage;
    }
}
