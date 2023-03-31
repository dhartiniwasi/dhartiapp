package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.C9441e;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.startapp.e8 */
/* compiled from: Sta */
public class C8929e8 implements CookieStore {

    /* renamed from: a */
    public final CookieStore f36725a = new CookieManager().getCookieStore();

    /* renamed from: b */
    public final SharedPreferences f36726b;

    public C8929e8(Context context) {
        HttpCookie httpCookie;
        C9441e eVar = new C9441e(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f36726b = eVar;
        String string = eVar.getString("names", (String) null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                SharedPreferences sharedPreferences = this.f36726b;
                String string2 = sharedPreferences.getString("cookie_" + str, (String) null);
                if (!(string2 == null || (httpCookie = (HttpCookie) C9065k5.m48755a(string2, HttpCookie.class)) == null)) {
                    if (httpCookie.hasExpired()) {
                        mo29333b(httpCookie);
                        mo29331a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f36725a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo29331a() {
        SharedPreferences.Editor edit = this.f36726b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie a : this.f36725a.getCookies()) {
            hashSet.add(mo29330a(a));
        }
        edit.putString("names", TextUtils.join(";", hashSet));
        edit.apply();
    }

    public void add(URI uri, HttpCookie httpCookie) {
        String a = mo29330a(httpCookie);
        this.f36725a.add(uri, httpCookie);
        SharedPreferences.Editor edit = this.f36726b.edit();
        edit.putString(C9688ze.m50607a("cookie_", a), String.valueOf(C9065k5.m48756b(httpCookie)));
        edit.apply();
        mo29331a();
    }

    /* renamed from: b */
    public final void mo29333b(HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f36726b.edit();
        StringBuilder a = C8870c1.m48422a("cookie_");
        a.append(mo29330a(httpCookie));
        edit.remove(a.toString());
        edit.apply();
    }

    public List<HttpCookie> get(URI uri) {
        return this.f36725a.get(uri);
    }

    public List<HttpCookie> getCookies() {
        return this.f36725a.getCookies();
    }

    public List<URI> getURIs() {
        return this.f36725a.getURIs();
    }

    public boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f36725a.remove(uri, httpCookie)) {
            return false;
        }
        mo29333b(httpCookie);
        mo29331a();
        return true;
    }

    public boolean removeAll() {
        if (!this.f36725a.removeAll()) {
            return false;
        }
        SharedPreferences.Editor edit = this.f36726b.edit();
        edit.clear();
        edit.apply();
        mo29331a();
        return true;
    }

    /* renamed from: a */
    public final String mo29330a(HttpCookie httpCookie) {
        return httpCookie.getDomain() + "_" + httpCookie.getName();
    }
}
