package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashMap;
import p066i4.C4678r;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class u42 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ o42 f18369a;

    /* renamed from: b */
    public final /* synthetic */ String f18370b;

    /* renamed from: c */
    public final /* synthetic */ gv1 f18371c;

    /* renamed from: d */
    public final /* synthetic */ Activity f18372d;

    /* renamed from: e */
    public final /* synthetic */ ux2 f18373e;

    /* renamed from: f */
    public final /* synthetic */ C4678r f18374f;

    public /* synthetic */ u42(o42 o42, String str, gv1 gv1, Activity activity, ux2 ux2, C4678r rVar) {
        this.f18369a = o42;
        this.f18370b = str;
        this.f18371c = gv1;
        this.f18372d = activity;
        this.f18373e = ux2;
        this.f18374f = rVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        o42 o42 = this.f18369a;
        String str = this.f18370b;
        gv1 gv1 = this.f18371c;
        Activity activity = this.f18372d;
        ux2 ux2 = this.f18373e;
        C4678r rVar = this.f18374f;
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
