package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class RscMetadataItem implements Serializable {
    private static final long serialVersionUID = 1691586261519008915L;
    private String config;
    private Integer ief;
    private Integer limit;
    private int noCache;
    private Integer output;
    private Integer ppid;
    private int[] sortBy;
    private int triggers;
    private Integer ttl;

    /* renamed from: a */
    public String mo31103a() {
        return this.config;
    }

    /* renamed from: b */
    public Integer mo31104b() {
        return this.ief;
    }

    /* renamed from: c */
    public Integer mo31105c() {
        return this.limit;
    }

    /* renamed from: d */
    public int mo31106d() {
        return this.noCache;
    }

    /* renamed from: e */
    public Integer mo31107e() {
        return this.output;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadataItem rscMetadataItem = (RscMetadataItem) obj;
        if (this.triggers != rscMetadataItem.triggers || this.noCache != rscMetadataItem.noCache || !C9605vb.m50465a(this.config, rscMetadataItem.config) || !C9605vb.m50465a(this.ttl, rscMetadataItem.ttl) || !Arrays.equals(this.sortBy, rscMetadataItem.sortBy) || !C9605vb.m50465a(this.limit, rscMetadataItem.limit) || !C9605vb.m50465a(this.ppid, rscMetadataItem.ppid) || !C9605vb.m50465a(this.output, rscMetadataItem.output) || !C9605vb.m50465a(this.ief, rscMetadataItem.ief)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Integer mo31109f() {
        return this.ppid;
    }

    /* renamed from: g */
    public int[] mo31110g() {
        return this.sortBy;
    }

    /* renamed from: h */
    public int mo31111h() {
        return this.triggers;
    }

    public int hashCode() {
        Object[] objArr = {this.config, Integer.valueOf(this.triggers), Integer.valueOf(this.noCache), this.ttl, this.sortBy, this.limit, this.ppid, this.output, this.ief};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public Integer mo31113i() {
        return this.ttl;
    }
}
