package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class MetaDataStyle implements Serializable {

    /* renamed from: a */
    public static final Integer f38982a = 18;

    /* renamed from: b */
    public static final Integer f38983b = -1;

    /* renamed from: c */
    public static final Set<String> f38984c = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: d */
    public static final Integer f38985d = 14;

    /* renamed from: e */
    public static final Integer f38986e = -1;

    /* renamed from: f */
    public static final Set<String> f38987f = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private Integer itemDescriptionTextColor = f38986e;
    @C9226pb(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = f38987f;
    private Integer itemDescriptionTextSize = f38985d;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = f38983b;
    @C9226pb(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f38984c;
    private Integer itemTitleTextSize = f38982a;
    private String name = "";

    /* renamed from: a */
    public Integer mo31047a() {
        return this.itemDescriptionTextColor;
    }

    /* renamed from: b */
    public Set<String> mo31048b() {
        return this.itemDescriptionTextDecoration;
    }

    /* renamed from: c */
    public Integer mo31049c() {
        return this.itemDescriptionTextSize;
    }

    /* renamed from: d */
    public Integer mo31050d() {
        return this.itemGradientBottom;
    }

    /* renamed from: e */
    public Integer mo31051e() {
        return this.itemGradientTop;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
        if (!C9605vb.m50465a(this.name, metaDataStyle.name) || !C9605vb.m50465a(this.itemGradientTop, metaDataStyle.itemGradientTop) || !C9605vb.m50465a(this.itemGradientBottom, metaDataStyle.itemGradientBottom) || !C9605vb.m50465a(this.itemTitleTextSize, metaDataStyle.itemTitleTextSize) || !C9605vb.m50465a(this.itemTitleTextColor, metaDataStyle.itemTitleTextColor) || !C9605vb.m50465a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) || !C9605vb.m50465a(this.itemDescriptionTextSize, metaDataStyle.itemDescriptionTextSize) || !C9605vb.m50465a(this.itemDescriptionTextColor, metaDataStyle.itemDescriptionTextColor) || !C9605vb.m50465a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Integer mo31053f() {
        return this.itemTitleTextColor;
    }

    /* renamed from: g */
    public Set<String> mo31054g() {
        return this.itemTitleTextDecoration;
    }

    /* renamed from: h */
    public Integer mo31055h() {
        return this.itemTitleTextSize;
    }

    public int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
