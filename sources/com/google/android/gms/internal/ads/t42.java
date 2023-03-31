package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashMap;
import p066i4.C4678r;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class t42 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ o42 f17833a;

    /* renamed from: b */
    public final /* synthetic */ String f17834b;

    /* renamed from: c */
    public final /* synthetic */ gv1 f17835c;

    /* renamed from: d */
    public final /* synthetic */ Activity f17836d;

    /* renamed from: e */
    public final /* synthetic */ ux2 f17837e;

    /* renamed from: f */
    public final /* synthetic */ C4678r f17838f;

    public /* synthetic */ t42(o42 o42, String str, gv1 gv1, Activity activity, ux2 ux2, C4678r rVar) {
        this.f17833a = o42;
        this.f17834b = str;
        this.f17835c = gv1;
        this.f17836d = activity;
        this.f17837e = ux2;
        this.f17838f = rVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        o42 o42 = this.f17833a;
        String str = this.f17834b;
        gv1 gv1 = this.f17835c;
        Activity activity = this.f17836d;
        ux2 ux2 = this.f17837e;
        C4678r rVar = this.f17838f;
        o42.mo12821f(str);
        if (gv1 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            w42.m22576K6(activity, gv1, ux2, o42, str, "dialog_click", hashMap);
        }
        if (rVar != null) {
            rVar.mo18361d();
        }
    }
}
