package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class w43 extends p43 {

    /* renamed from: a */
    private s83<Integer> f19477a;

    /* renamed from: b */
    private s83<Integer> f19478b;

    /* renamed from: c */
    private v43 f19479c;

    /* renamed from: d */
    private HttpURLConnection f19480d;

    w43() {
        this(t43.f17839a, u43.f18375a, (v43) null);
    }

    w43(s83<Integer> s83, s83<Integer> s832, v43 v43) {
        this.f19477a = s83;
        this.f19478b = s832;
        this.f19479c = v43;
    }

    /* renamed from: b */
    static /* synthetic */ Integer m22582b() {
        return -1;
    }

    /* renamed from: f */
    static /* synthetic */ Integer m22583f() {
        return -1;
    }

    /* renamed from: p */
    public static void m22586p(HttpURLConnection httpURLConnection) {
        q43.m19060a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        m22586p(this.f19480d);
    }

    /* renamed from: m */
    public HttpURLConnection mo14870m() throws IOException {
        q43.m19061b(((Integer) this.f19477a.zza()).intValue(), ((Integer) this.f19478b.zza()).intValue());
        v43 v43 = this.f19479c;
        Objects.requireNonNull(v43);
        HttpURLConnection httpURLConnection = (HttpURLConnection) v43.zza();
        this.f19480d = httpURLConnection;
        return httpURLConnection;
    }

    /* renamed from: n */
    public HttpURLConnection mo14871n(v43 v43, int i, int i2) throws IOException {
        this.f19477a = new r43(i);
        this.f19478b = new s43(i2);
        this.f19479c = v43;
        return mo14870m();
    }
}
