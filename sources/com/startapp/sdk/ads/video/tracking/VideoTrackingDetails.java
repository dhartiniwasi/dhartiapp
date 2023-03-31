package com.startapp.sdk.ads.video.tracking;

import com.startapp.C8864bc;
import com.startapp.C9226pb;
import com.startapp.C9644xb;
import com.startapp.sdk.ads.video.vast.C9376a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;
    @C9226pb(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;
    @C9226pb(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;
    @C9226pb(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    /* renamed from: a */
    public AbsoluteTrackingLink[] mo30367a() {
        return this.absoluteTrackingUrls;
    }

    /* renamed from: b */
    public ActionTrackingLink[] mo30370b() {
        return this.creativeViewUrls;
    }

    /* renamed from: c */
    public FractionTrackingLink[] mo30371c() {
        return this.fractionTrackingUrls;
    }

    /* renamed from: d */
    public ActionTrackingLink[] mo30372d() {
        return this.impressionUrls;
    }

    /* renamed from: e */
    public ActionTrackingLink[] mo30373e() {
        return this.inlineErrorTrackingUrls;
    }

    /* renamed from: f */
    public ActionTrackingLink[] mo30374f() {
        return this.soundMuteUrls;
    }

    /* renamed from: g */
    public ActionTrackingLink[] mo30375g() {
        return this.soundUnmuteUrls;
    }

    /* renamed from: h */
    public ActionTrackingLink[] mo30376h() {
        return this.videoClickTrackingUrls;
    }

    /* renamed from: i */
    public ActionTrackingLink[] mo30377i() {
        return this.videoClosedUrls;
    }

    /* renamed from: j */
    public ActionTrackingLink[] mo30378j() {
        return this.videoPausedUrls;
    }

    /* renamed from: k */
    public ActionTrackingLink[] mo30379k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    /* renamed from: l */
    public ActionTrackingLink[] mo30380l() {
        return this.videoPostRollClosedUrls;
    }

    /* renamed from: m */
    public ActionTrackingLink[] mo30381m() {
        return this.videoPostRollImpressionUrls;
    }

    /* renamed from: n */
    public ActionTrackingLink[] mo30382n() {
        return this.videoResumedUrls;
    }

    /* renamed from: o */
    public ActionTrackingLink[] mo30383o() {
        return this.videoRewardedUrls;
    }

    /* renamed from: p */
    public ActionTrackingLink[] mo30384p() {
        return this.videoSkippedUrls;
    }

    public String toString() {
        return super.toString();
    }

    public VideoTrackingDetails(C9644xb xbVar) {
        this.isVAST = true;
        this.impressionUrls = m49570b(xbVar.mo31369j());
        this.soundMuteUrls = m49570b(xbVar.mo31371l());
        this.soundUnmuteUrls = m49570b(xbVar.mo31376q());
        this.videoPausedUrls = m49570b(xbVar.mo31372m());
        this.videoResumedUrls = m49570b(xbVar.mo31373n());
        this.videoSkippedUrls = m49570b(xbVar.mo31375p());
        this.videoClosedUrls = m49570b(xbVar.mo31364e());
        this.inlineErrorTrackingUrls = m49570b(xbVar.mo31367h());
        this.videoClickTrackingUrls = m49570b(xbVar.mo31363d());
        this.absoluteTrackingUrls = mo30368a(xbVar.mo31360a());
        this.fractionTrackingUrls = mo30369a(xbVar.mo31368i(), xbVar.mo31366g());
        C9376a f = xbVar.mo31365f();
        if (f != null) {
            this.videoPostRollImpressionUrls = m49570b(f.mo30405d());
            this.videoPostRollClickTrackingUrls = m49570b(f.mo30403b());
        }
    }

    /* renamed from: b */
    public static ActionTrackingLink[] m49570b(List<String> list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String b : list) {
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.mo30390b(b);
            actionTrackingLink.mo30388a(true);
            actionTrackingLink.mo30387a("");
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
    }

    /* renamed from: a */
    public final AbsoluteTrackingLink[] mo30368a(List<C8864bc<Integer>> list) {
        if (list == null) {
            return new AbsoluteTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C8864bc next : list) {
            AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
            absoluteTrackingLink.mo30390b(next.f36547a);
            if (((Integer) next.f36548b).intValue() != -1) {
                absoluteTrackingLink.mo30360a(((Integer) next.f36548b).intValue());
            }
            absoluteTrackingLink.mo30388a(true);
            absoluteTrackingLink.mo30387a("");
            arrayList.add(absoluteTrackingLink);
        }
        return (AbsoluteTrackingLink[]) arrayList.toArray(new AbsoluteTrackingLink[0]);
    }

    /* renamed from: a */
    public final FractionTrackingLink[] mo30369a(List<C8864bc<Float>> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C8864bc next : list) {
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.mo30390b(next.f36547a);
            fractionTrackingLink.mo30363a((int) (((Float) next.f36548b).floatValue() * 100.0f));
            fractionTrackingLink.mo30388a(true);
            fractionTrackingLink.mo30387a("");
            arrayList.add(fractionTrackingLink);
        }
        for (String b : list2) {
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.mo30390b(b);
            fractionTrackingLink2.mo30363a(100);
            fractionTrackingLink2.mo30388a(true);
            fractionTrackingLink2.mo30387a("");
            arrayList.add(fractionTrackingLink2);
        }
        return arrayList.size() > 0 ? (FractionTrackingLink[]) arrayList.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
    }
}
