package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import androidx.annotation.Keep;
import com.startapp.C9226pb;
import com.startapp.C9565tb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class RscMetadata implements Serializable {
    private static final long serialVersionUID = -5424519918396264553L;
    private boolean enabled;
    private int ief;
    @C9226pb(parser = ItemsParser.class, type = ArrayList.class, value = RscMetadataItem.class)
    private List<RscMetadataItem> items;
    private String triggers;

    @Keep
    /* compiled from: Sta */
    public static class ItemsParser extends C9565tb<RscMetadataItem> {
        public ItemsParser() {
            super(RscMetadataItem.class);
        }
    }

    /* renamed from: a */
    public int mo31096a() {
        return this.ief;
    }

    /* renamed from: b */
    public List<RscMetadataItem> mo31098b() {
        return this.items;
    }

    /* renamed from: c */
    public String mo31099c() {
        return this.triggers;
    }

    /* renamed from: d */
    public boolean mo31100d() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadata rscMetadata = (RscMetadata) obj;
        if (this.enabled != rscMetadata.enabled || this.ief != rscMetadata.ief || !C9605vb.m50465a(this.triggers, rscMetadata.triggers) || !C9605vb.m50465a(this.items, rscMetadata.items)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.triggers, this.items, Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public int mo31097a(RscMetadataItem rscMetadataItem) {
        return rscMetadataItem.mo31104b() != null ? rscMetadataItem.mo31104b().intValue() : this.ief;
    }
}
