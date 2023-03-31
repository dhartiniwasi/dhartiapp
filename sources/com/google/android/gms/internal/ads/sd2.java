package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import p053g4.C4409t;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sd2 implements sj2 {

    /* renamed from: a */
    public final Context f17353a;

    /* renamed from: b */
    public final C4571q4 f17354b;

    /* renamed from: c */
    public final List f17355c;

    public sd2(Context context, C4571q4 q4Var, List list) {
        this.f17353a = context;
        this.f17354b = q4Var;
        this.f17355c = list;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) i10.f10576a.mo13438e()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            C4409t.m29326r();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f17353a.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                        str = componentName.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f17354b.f24976e);
            bundle3.putInt("height", this.f17354b.f24973b);
            bundle2.putBundle("size", bundle3);
            if (!this.f17355c.isEmpty()) {
                List list = this.f17355c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
