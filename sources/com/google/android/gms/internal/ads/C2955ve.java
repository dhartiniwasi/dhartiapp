package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ve */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2955ve {

    /* renamed from: d */
    private static final String[] f19074d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    private final String f19075a = "ad.doubleclick.net";

    /* renamed from: b */
    private final String[] f19076b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private final C2807re f19077c;

    @Deprecated
    public C2955ve(C2807re reVar) {
        this.f19077c = reVar;
    }

    /* renamed from: g */
    private final Uri m22183g(Uri uri, String str) throws C2992we {
        Objects.requireNonNull(uri);
        try {
            if (uri.getHost().equals(this.f19075a)) {
                try {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new C2992we("Parameter already exists: dc_ms");
                } catch (UnsupportedOperationException unused) {
                    throw new C2992we("Provided Uri is not in a valid state");
                }
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        }
        throw new C2992we("Query parameter already exists: ms");
    }

    @Deprecated
    /* renamed from: a */
    public final Uri mo14735a(Uri uri, Context context, View view, Activity activity) throws C2992we {
        try {
            return m22183g(uri, this.f19077c.mo12593d(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C2992we("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    /* renamed from: b */
    public final Uri mo14736b(Uri uri, Context context) throws C2992we {
        return m22183g(uri, this.f19077c.mo12591b(context));
    }

    @Deprecated
    /* renamed from: c */
    public final C2807re mo14737c() {
        return this.f19077c;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo14738d(MotionEvent motionEvent) {
        this.f19077c.mo12594e(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo14739e(Uri uri) {
        if (mo14740f(uri)) {
            String[] strArr = f19074d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo14740f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f19076b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
