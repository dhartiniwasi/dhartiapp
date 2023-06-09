package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class CacheKey implements Serializable {
    private static final long serialVersionUID = 5066050766568512916L;
    private String adTag;
    private String advertiserId;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    private String country;
    private boolean forceFullpage;
    private boolean forceOfferWall2D;
    private boolean forceOfferWall3D;
    private boolean forceOverlay;
    private Double minCpm;
    private AdPreferences.Placement placement;
    private String placementId;
    private String productId;
    private String template;
    private boolean testMode;
    private C9381Ad.AdType type;
    private boolean videoMuted;

    public CacheKey(AdPreferences.Placement placement2, AdPreferences adPreferences) {
        this.placement = placement2;
        this.placementId = adPreferences.getPlacementId();
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.videoMuted = adPreferences.isVideoMuted();
        this.minCpm = adPreferences.getMinCpm();
        this.forceOfferWall3D = adPreferences.isForceOfferWall3D();
        this.forceOfferWall2D = adPreferences.isForceOfferWall2D();
        this.forceFullpage = adPreferences.isForceFullpage();
        this.forceOverlay = adPreferences.isForceOverlay();
        this.testMode = adPreferences.isTestMode();
        this.adTag = adPreferences.getAdTag();
        this.productId = adPreferences.getCustomProductId();
        this.type = adPreferences.getType();
    }

    /* renamed from: a */
    public AdPreferences.Placement mo30672a() {
        return this.placement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) obj;
        if (this.forceOfferWall3D != cacheKey.forceOfferWall3D || this.forceOfferWall2D != cacheKey.forceOfferWall2D || this.forceFullpage != cacheKey.forceFullpage || this.forceOverlay != cacheKey.forceOverlay || this.testMode != cacheKey.testMode || this.videoMuted != cacheKey.videoMuted || this.placement != cacheKey.placement || !C9605vb.m50465a(this.placementId, cacheKey.placementId) || !C9605vb.m50465a(this.categories, cacheKey.categories) || !C9605vb.m50465a(this.categoriesExclude, cacheKey.categoriesExclude) || !C9605vb.m50465a(this.minCpm, cacheKey.minCpm) || !C9605vb.m50465a(this.adTag, cacheKey.adTag) || !C9605vb.m50465a(this.productId, cacheKey.productId) || !C9605vb.m50465a(this.country, cacheKey.country) || !C9605vb.m50465a(this.advertiserId, cacheKey.advertiserId) || !C9605vb.m50465a(this.template, cacheKey.template) || this.type != cacheKey.type) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.placement, this.placementId, this.categories, this.categoriesExclude, this.minCpm, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), Boolean.valueOf(this.testMode), Boolean.valueOf(this.videoMuted), this.adTag, this.productId, this.country, this.advertiserId, this.template, this.type};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        return super.toString();
    }
}
