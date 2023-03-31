package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class mo1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ no1 f13424a;

    /* renamed from: b */
    public final /* synthetic */ lf3 f13425b;

    /* renamed from: c */
    public final /* synthetic */ lf3 f13426c;

    /* renamed from: d */
    public final /* synthetic */ lf3 f13427d;

    /* renamed from: e */
    public final /* synthetic */ lf3 f13428e;

    /* renamed from: f */
    public final /* synthetic */ lf3 f13429f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f13430g;

    /* renamed from: h */
    public final /* synthetic */ lf3 f13431h;

    /* renamed from: i */
    public final /* synthetic */ lf3 f13432i;

    /* renamed from: j */
    public final /* synthetic */ lf3 f13433j;

    /* renamed from: k */
    public final /* synthetic */ lf3 f13434k;

    public /* synthetic */ mo1(no1 no1, lf3 lf3, lf3 lf32, lf3 lf33, lf3 lf34, lf3 lf35, JSONObject jSONObject, lf3 lf36, lf3 lf37, lf3 lf38, lf3 lf39) {
        this.f13424a = no1;
        this.f13425b = lf3;
        this.f13426c = lf32;
        this.f13427d = lf33;
        this.f13428e = lf34;
        this.f13429f = lf35;
        this.f13430g = jSONObject;
        this.f13431h = lf36;
        this.f13432i = lf37;
        this.f13433j = lf38;
        this.f13434k = lf39;
    }

    public final Object call() {
        lf3 lf3 = this.f13425b;
        lf3 lf32 = this.f13426c;
        lf3 lf33 = this.f13427d;
        lf3 lf34 = this.f13428e;
        lf3 lf35 = this.f13429f;
        JSONObject jSONObject = this.f13430g;
        lf3 lf36 = this.f13431h;
        lf3 lf37 = this.f13432i;
        lf3 lf38 = this.f13433j;
        lf3 lf39 = this.f13434k;
        xl1 xl1 = (xl1) lf3.get();
        xl1.mo15168n((List) lf32.get());
        xl1.mo15165k((r20) lf33.get());
        xl1.mo15169o((r20) lf34.get());
        xl1.mo15161h((j20) lf35.get());
        xl1.mo15171q(ap1.m9898j(jSONObject));
        xl1.mo15164j(ap1.m9897i(jSONObject));
        vs0 vs0 = (vs0) lf36.get();
        if (vs0 != null) {
            xl1.mo15179y(vs0);
            xl1.mo15178x(vs0.mo10647w());
            xl1.mo15177w(vs0.mo8467d0());
        }
        vs0 vs02 = (vs0) lf37.get();
        if (vs02 != null) {
            xl1.mo15167m(vs02);
            xl1.mo15180z(vs02.mo10647w());
        }
        vs0 vs03 = (vs0) lf38.get();
        if (vs03 != null) {
            xl1.mo15172r(vs03);
        }
        for (ep1 ep1 : (List) lf39.get()) {
            if (ep1.f8887a != 1) {
                xl1.mo15166l(ep1.f8888b, ep1.f8890d);
            } else {
                xl1.mo15175u(ep1.f8888b, ep1.f8889c);
            }
        }
        return xl1;
    }
}
