package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ah2 implements tj2 {

    /* renamed from: a */
    private final mf3 f6559a;

    /* renamed from: b */
    private final ViewGroup f6560b;

    /* renamed from: c */
    private final Context f6561c;

    /* renamed from: d */
    private final Set f6562d;

    public ah2(mf3 mf3, ViewGroup viewGroup, Context context, Set set) {
        this.f6559a = mf3;
        this.f6562d = set;
        this.f6560b = viewGroup;
        this.f6561c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bh2 mo8339a() throws Exception {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14475X4)).booleanValue() && this.f6560b != null && this.f6562d.contains("banner")) {
            return new bh2(Boolean.valueOf(this.f6560b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14484Y4)).booleanValue() && this.f6562d.contains("native")) {
            Context context = this.f6561c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new bh2(bool);
            }
        }
        return new bh2((Boolean) null);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f6559a.mo12324a(new zg2(this));
    }

    public final int zza() {
        return 22;
    }
}
