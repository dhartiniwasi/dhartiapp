package com.startapp;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.C9396a;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.qc */
/* compiled from: Sta */
public class C9249qc {

    /* renamed from: a */
    public VideoTrackingLink[] f38125a;

    /* renamed from: b */
    public VideoTrackingParams f38126b;

    /* renamed from: c */
    public String f38127c;

    /* renamed from: d */
    public int f38128d;

    /* renamed from: e */
    public String f38129e = "";

    /* renamed from: f */
    public VASTErrorCodes f38130f;

    public C9249qc(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, String str, int i) {
        this.f38125a = videoTrackingLinkArr;
        this.f38126b = videoTrackingParams;
        this.f38127c = str;
        this.f38128d = i;
    }

    /* renamed from: a */
    public C9227pc mo29860a() {
        Object obj;
        Object obj2 = null;
        if (!((this.f38125a == null || this.f38126b == null) ? false : true)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        VideoTrackingLink[] videoTrackingLinkArr = this.f38125a;
        int length = videoTrackingLinkArr.length;
        int i = 0;
        while (i < length) {
            VideoTrackingLink videoTrackingLink = videoTrackingLinkArr[i];
            if (videoTrackingLink.mo30391c() == null || (this.f38126b.mo30723b() > 0 && !videoTrackingLink.mo30392d())) {
                obj = obj2;
            } else {
                StringBuilder sb = new StringBuilder();
                VideoTrackingLink.TrackingSource b = videoTrackingLink.mo30389b();
                if (b == null) {
                    if (C9605vb.m50477d(videoTrackingLink.mo30391c())) {
                        b = VideoTrackingLink.TrackingSource.STARTAPP;
                    } else {
                        b = VideoTrackingLink.TrackingSource.EXTERNAL;
                    }
                }
                VideoTrackingParams videoTrackingParams = this.f38126b;
                videoTrackingParams.internalParamsIndicator = b == VideoTrackingLink.TrackingSource.STARTAPP;
                VideoTrackingParams c = videoTrackingParams.mo30393a(videoTrackingLink.mo30392d()).mo30395c(videoTrackingLink.mo30386a());
                String c2 = videoTrackingLink.mo30391c();
                String str = this.f38127c;
                String replace = c2.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                int i2 = this.f38128d;
                long convert = TimeUnit.SECONDS.convert((long) i2, TimeUnit.MILLISECONDS);
                long j = (long) (i2 % AdError.NETWORK_ERROR_CODE);
                Locale locale = Locale.US;
                String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(convert % 60), Long.valueOf(j)}))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length2 = format.length() - 2;
                String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length2) + ":" + format.substring(length2)));
                VASTErrorCodes vASTErrorCodes = this.f38130f;
                if (vASTErrorCodes != null) {
                    replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.mo30398a()));
                }
                sb.append(replace3);
                sb.append(c.mo30365e());
                if (c.internalParamsIndicator) {
                    obj = null;
                    sb.append(C8811a.m48227c(C9396a.m49774a(c2, (String) null)));
                } else {
                    obj = null;
                }
                arrayList.add(sb.toString());
            }
            i++;
            obj2 = obj;
        }
        return new C9227pc(arrayList, this.f38129e);
    }
}
