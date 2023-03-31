package com.startapp.sdk.ads.video;

import com.startapp.C8867bf;
import com.startapp.C9226pb;
import com.startapp.C9644xb;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.ads.video.vast.C9376a;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 4938639129535870268L;
    @C9226pb(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;
    @C9226pb(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;
    private String postRollHtml;
    private boolean skippable;
    private long skippableAfter;
    private Long unskipLess;
    @C9226pb(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    /* compiled from: Sta */
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    /* renamed from: a */
    public void mo30274a(String str) {
        this.localVideoPath = str;
    }

    /* renamed from: b */
    public String mo30277b() {
        return this.clickUrl;
    }

    /* renamed from: c */
    public String mo30278c() {
        return this.localVideoPath;
    }

    /* renamed from: d */
    public String mo30279d() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    /* renamed from: e */
    public String mo30280e() {
        return this.postRollHtml;
    }

    /* renamed from: f */
    public PostRollType mo30281f() {
        return this.postRoll;
    }

    /* renamed from: g */
    public long mo30282g() {
        return this.skippableAfter;
    }

    /* renamed from: h */
    public VideoTrackingDetails mo30283h() {
        return this.videoTrackingDetails;
    }

    /* renamed from: i */
    public String mo30284i() {
        return this.videoUrl;
    }

    /* renamed from: j */
    public boolean mo30285j() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    /* renamed from: k */
    public boolean mo30286k() {
        return this.clickable;
    }

    /* renamed from: l */
    public boolean mo30287l() {
        return this.closeable;
    }

    /* renamed from: m */
    public boolean mo30288m() {
        return this.skippable;
    }

    /* renamed from: n */
    public boolean mo30289n() {
        return this.isVideoMuted;
    }

    /* renamed from: o */
    public void mo30290o() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    /* renamed from: p */
    public Long mo30291p() {
        return this.unskipLess;
    }

    public String toString() {
        return super.toString();
    }

    public VideoAdDetails(C9644xb xbVar, VideoConfig videoConfig, C8867bf bfVar) {
        long j;
        this.videoTrackingDetails = new VideoTrackingDetails(xbVar);
        this.videoUrl = xbVar.mo31370k();
        boolean z = true;
        if (bfVar != null) {
            Long a = bfVar.mo29238a();
            Integer o = xbVar.mo31374o();
            if (a != null) {
                j = a.longValue();
            } else if (o != null) {
                j = (long) o.intValue();
            } else {
                j = videoConfig.mo30586m();
            }
            this.skippableAfter = j;
            this.skippable = true;
            this.unskipLess = bfVar.mo29239b();
        } else {
            this.skippable = false;
        }
        String c = xbVar.mo31362c();
        this.clickUrl = c;
        this.clickable = c == null ? false : z;
        this.postRoll = PostRollType.NONE;
        C9376a f = xbVar.mo31365f();
        if (f != null) {
            this.postRollHtml = f.mo30404c().mo30399a();
            this.postRollClickThroughUrl = f.mo30402a();
        }
        mo30275a((List<VerificationDetails>) Collections.unmodifiableList(xbVar.mo31361b()));
    }

    /* renamed from: a */
    public void mo30276a(boolean z) {
        this.isVideoMuted = z;
    }

    /* renamed from: a */
    public List<VerificationDetails> mo30273a() {
        return this.adVerifications;
    }

    /* renamed from: a */
    public void mo30275a(List<VerificationDetails> list) {
        this.adVerifications = list;
    }
}
