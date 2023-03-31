package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ue */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2918ue extends C2881te {
    protected C2918ue(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: w */
    public static C2918ue m21594w(String str, Context context, boolean z) {
        C2881te.m20988s(context, false);
        return new C2918ue(context, str, false);
    }

    @Deprecated
    /* renamed from: x */
    public static C2918ue m21595x(String str, Context context, boolean z, int i) {
        C2881te.m20988s(context, z);
        return new C2918ue(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final List mo14290q(C2993wf wfVar, Context context, C3063yb ybVar, C2804rb rbVar) {
        if (wfVar.mo14910k() == null || !this.f17968C) {
            return super.mo14290q(wfVar, context, ybVar, (C2804rb) null);
        }
        int a = wfVar.mo14901a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo14290q(wfVar, context, ybVar, (C2804rb) null));
        arrayList.add(new C2697og(wfVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", ybVar, a, 24));
        return arrayList;
    }
}
