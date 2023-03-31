package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p060h4.C4541l4;
import p060h4.C4607w4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cv2 implements bv2 {

    /* renamed from: a */
    private final Object[] f7965a;

    public cv2(C4541l4 l4Var, String str, int i, String str2, C4607w4 w4Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(l4Var.f24890b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m11207a(l4Var.f24891c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(l4Var.f24891c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(l4Var.f24892d));
        }
        if (hashSet.contains("keywords")) {
            List list = l4Var.f24893e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(l4Var.f24894f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(l4Var.f24895g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(l4Var.f24896h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(l4Var.f24897i);
        }
        if (hashSet.contains("location")) {
            Location location = l4Var.f24899s;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(l4Var.f24900t);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m11207a(l4Var.f24901u));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m11207a(l4Var.f24902v));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = l4Var.f24903w;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(l4Var.f24904x);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(l4Var.f24905y);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(l4Var.f24906z));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(l4Var.f24884B));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(l4Var.f24885C);
        }
        if (hashSet.contains(AdUnitActivity.EXTRA_ORIENTATION)) {
            if (w4Var != null) {
                arrayList.add(Integer.valueOf(w4Var.f25053a));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.f7965a = arrayList.toArray();
    }

    /* renamed from: a */
    private static String m11207a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = m11207a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cv2)) {
            return false;
        }
        return Arrays.equals(this.f7965a, ((cv2) obj).f7965a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7965a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f7965a);
        String arrays = Arrays.toString(this.f7965a);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}
