package com.startapp.sdk.ads.video;

import android.content.Context;
import android.util.Base64;
import com.startapp.C9023i4;
import com.startapp.C9673z2;
import com.startapp.sdk.ads.video.C9358d;
import com.startapp.sdk.ads.video.C9366j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

/* renamed from: com.startapp.sdk.ads.video.e */
/* compiled from: Sta */
public class C9361e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f38521a;

    /* renamed from: b */
    public final /* synthetic */ C9366j.C9368b f38522b;

    /* renamed from: c */
    public final /* synthetic */ C9358d.C9359a f38523c;

    /* renamed from: d */
    public final /* synthetic */ C9364h f38524d;

    public C9361e(C9364h hVar, String str, C9366j.C9368b bVar, C9358d.C9359a aVar) {
        this.f38524d = hVar;
        this.f38521a = str;
        this.f38522b = bVar;
        this.f38523c = aVar;
    }

    public void run() {
        String str;
        C9364h hVar = this.f38524d;
        Context context = hVar.f38531b;
        String str2 = this.f38521a;
        C9366j.C9368b bVar = this.f38522b;
        C9358d.C9359a aVar = this.f38523c;
        if (hVar.f38530a == null) {
            LinkedList<CachedVideoAd> linkedList = (LinkedList) C9673z2.m50588a(context, "CachedAds", LinkedList.class);
            hVar.f38530a = linkedList;
            if (linkedList == null) {
                hVar.f38530a = new LinkedList<>();
            }
            if (hVar.mo30350a(AdsCommonMetaData.f38625h.mo30445G().mo30573b())) {
                C9673z2.m50596b(context, "CachedAds", hVar.f38530a);
            }
        }
        try {
            URL url = new URL(str2);
            String str3 = url.getHost() + url.getPath().replace("/", "_");
            try {
                String substring = str3.substring(0, str3.lastIndexOf(46));
                str = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(substring.getBytes()), 0).replaceAll("[^a-zA-Z0-9]+", "_") + str3.substring(str3.lastIndexOf(46));
            } catch (NoSuchAlgorithmException e) {
                C9023i4.m48681a((Throwable) e);
                str = str3;
            }
            new C9366j(context, url, str, new C9362f(hVar, bVar, new CachedVideoAd(str), context), new C9363g(hVar, aVar)).mo30352a();
        } catch (MalformedURLException e2) {
            if (bVar != null) {
                bVar.mo30345a((String) null);
            }
            C9023i4.m48681a((Throwable) e2);
        }
    }
}
