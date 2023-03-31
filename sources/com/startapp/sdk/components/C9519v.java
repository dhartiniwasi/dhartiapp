package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.C8873c3;
import com.startapp.C8997h4;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.components.ComponentLocator;
import java.util.List;

/* renamed from: com.startapp.sdk.components.v */
/* compiled from: Sta */
public class C9519v implements C8873c3<Context, List<String>, TrackingParams, C8997h4> {
    public C9519v(ComponentLocator.C9467f0 f0Var) {
    }

    /* renamed from: a */
    public Object mo29242a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        List list = (List) obj2;
        TrackingParams trackingParams = (TrackingParams) obj3;
        if (context == null || list == null) {
            return null;
        }
        return new C8997h4(context, list, trackingParams, new C9518u(this));
    }
}
