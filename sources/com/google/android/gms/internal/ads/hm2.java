package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hm2 implements b44 {
    /* renamed from: a */
    public static wj2 m13925a(Context context, ll0 ll0, ml0 ml0, Object obj, ok2 ok2, tl2 tl2, v34 v34, v34 v342, v34 v343, v34 v344, v34 v345, v34 v346, v34 v347, v34 v348, v34 v349, Executor executor, yy2 yy2, gv1 gv1) {
        HashSet hashSet = new HashSet();
        hashSet.add((ll2) obj);
        ok2 ok22 = ok2;
        hashSet.add(ok2);
        tl2 tl22 = tl2;
        hashSet.add(tl2);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14387O4)).booleanValue()) {
            hashSet.add((tj2) v34.mo8155d());
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14397P4)).booleanValue()) {
            hashSet.add((tj2) v342.mo8155d());
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14407Q4)).booleanValue()) {
            hashSet.add((tj2) v343.mo8155d());
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14417R4)).booleanValue()) {
            hashSet.add((tj2) v344.mo8155d());
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14457V4)).booleanValue()) {
            hashSet.add((tj2) v346.mo8155d());
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14466W4)).booleanValue()) {
            hashSet.add((tj2) v347.mo8155d());
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14680s2)).booleanValue()) {
            hashSet.add((tj2) v349.mo8155d());
        }
        return new wj2(context, executor, hashSet, yy2, gv1);
    }
}
