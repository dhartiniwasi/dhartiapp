package com.startapp.sdk.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.video.C9358d;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* renamed from: com.startapp.sdk.ads.video.j */
/* compiled from: Sta */
public class C9366j {

    /* renamed from: a */
    public Context f38535a;

    /* renamed from: b */
    public URL f38536b;

    /* renamed from: c */
    public String f38537c;

    /* renamed from: d */
    public C9368b f38538d;

    /* renamed from: e */
    public C9358d.C9359a f38539e;

    /* renamed from: com.startapp.sdk.ads.video.j$a */
    /* compiled from: Sta */
    public class C9367a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f38540a;

        public C9367a(String str) {
            this.f38540a = str;
        }

        public void run() {
            C9368b bVar = C9366j.this.f38538d;
            if (bVar != null) {
                bVar.mo30345a(this.f38540a);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.j$b */
    /* compiled from: Sta */
    public interface C9368b {
        /* renamed from: a */
        void mo30345a(String str);
    }

    public C9366j(Context context, URL url, String str, C9368b bVar, C9358d.C9359a aVar) {
        this.f38535a = context;
        this.f38536b = url;
        this.f38537c = str;
        this.f38538d = bVar;
        this.f38539e = aVar;
    }

    /* renamed from: a */
    public void mo30352a() {
        String str;
        try {
            str = AdsCommonMetaData.f38625h.mo30445G().mo30589p() ? C9358d.C9360b.f38520a.mo30348a(this.f38535a, this.f38536b, this.f38537c, this.f38539e) : VideoUtil.m49535a(this.f38535a, this.f38536b, this.f38537c);
        } catch (Exception unused) {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new C9367a(str));
    }
}
