package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.n5 */
/* compiled from: Sta */
public class C9148n5 {

    /* renamed from: a */
    public boolean f37338a;

    /* renamed from: b */
    public boolean f37339b;

    /* renamed from: c */
    public Runnable f37340c;

    /* renamed from: d */
    public Runnable f37341d;

    /* renamed from: e */
    public Runnable f37342e;

    /* renamed from: f */
    public Context f37343f;

    /* renamed from: g */
    public TrackingParams f37344g;

    public C9148n5(Context context, Runnable runnable, TrackingParams trackingParams, boolean z) {
        this(context, runnable, trackingParams);
        this.f37339b = z;
    }

    @JavascriptInterface
    public void closeAd() {
        if (!this.f37338a) {
            this.f37338a = true;
            this.f37340c.run();
        }
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        Runnable runnable = this.f37342e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (this.f37339b) {
            Map<Activity, Integer> map = C9605vb.f39316a;
            C9396a.m49779a(this.f37343f, str, (String) null);
            return;
        }
        C9396a.m49794b(this.f37343f, str, (String) null);
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            C9396a.m49778a(this.f37343f, str, this.f37344g);
        }
        Intent a = C9605vb.m50444a(this.f37343f, str2);
        if (!(a == null || str3 == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    a.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (a != null) {
            try {
                this.f37343f.startActivity(a);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
        Runnable runnable = this.f37341d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C9148n5(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f37338a = false;
        this.f37339b = true;
        this.f37340c = null;
        this.f37341d = null;
        this.f37342e = null;
        this.f37340c = runnable;
        this.f37343f = context;
        this.f37344g = trackingParams;
    }

    public C9148n5(Context context, Runnable runnable, Runnable runnable2, TrackingParams trackingParams) {
        this(context, runnable, trackingParams);
        this.f37341d = runnable2;
    }
}
