package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.ads.hu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2451hu extends C4240a {
    public static final Parcelable.Creator<C2451hu> CREATOR = new C2489iu();

    /* renamed from: a */
    public final String f10485a;

    /* renamed from: b */
    public final long f10486b;

    /* renamed from: c */
    public final String f10487c;

    /* renamed from: d */
    public final String f10488d;

    /* renamed from: e */
    public final String f10489e;

    /* renamed from: f */
    public final Bundle f10490f;

    /* renamed from: g */
    public final boolean f10491g;

    /* renamed from: h */
    public long f10492h;

    /* renamed from: i */
    public String f10493i;

    /* renamed from: r */
    public int f10494r;

    C2451hu(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.f10485a = str;
        this.f10486b = j;
        this.f10487c = str2 == null ? "" : str2;
        this.f10488d = str3 == null ? "" : str3;
        this.f10489e = str4 == null ? "" : str4;
        this.f10490f = bundle == null ? new Bundle() : bundle;
        this.f10491g = z;
        this.f10492h = j2;
        this.f10493i = str5;
        this.f10494r = i;
    }

    /* renamed from: I1 */
    public static C2451hu m14045I1(Uri uri) {
        long parseLong;
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                pm0.m18667g("Expected 2 path parts for namespace and id, found :" + size);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = "1".equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new C2451hu(queryParameter, j, host, str, str2, bundle, equals, 0, "", 0);
        } catch (NullPointerException | NumberFormatException e) {
            pm0.m18668h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f10485a, false);
        C4243c.m28617n(parcel, 3, this.f10486b);
        C4243c.m28620q(parcel, 4, this.f10487c, false);
        C4243c.m28620q(parcel, 5, this.f10488d, false);
        C4243c.m28620q(parcel, 6, this.f10489e, false);
        C4243c.m28608e(parcel, 7, this.f10490f, false);
        C4243c.m28606c(parcel, 8, this.f10491g);
        C4243c.m28617n(parcel, 9, this.f10492h);
        C4243c.m28620q(parcel, 10, this.f10493i, false);
        C4243c.m28614k(parcel, 11, this.f10494r);
        C4243c.m28605b(parcel, a);
    }
}
