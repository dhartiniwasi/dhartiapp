package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.gg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2400gg extends C2513jh {

    /* renamed from: i */
    private final Activity f9898i;

    /* renamed from: j */
    private final View f9899j;

    public C2400gg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, View view, Activity activity) {
        super(wfVar, "uJ6tafbdnitpIiJcEDt3zh4lzBZEYeFsW45S60suhbKyZNy2K2MuNEbuksualim4", "Cv/m6MvBjdOit7tT7cC+xPCpFEqovwYj4XIOcXUxCMs=", ybVar, i, 62);
        this.f9899j = view;
        this.f9898i = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        if (this.f9899j != null) {
            boolean booleanValue = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14560g2)).booleanValue();
            Object[] objArr = (Object[]) this.f11604f.invoke((Object) null, new Object[]{this.f9899j, this.f9898i, Boolean.valueOf(booleanValue)});
            synchronized (this.f11603e) {
                this.f11603e.mo15385b0(((Long) objArr[0]).longValue());
                this.f11603e.mo15387d0(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f11603e.mo15386c0((String) objArr[2]);
                }
            }
        }
    }
}
