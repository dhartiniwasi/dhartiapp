package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xk0 {

    /* renamed from: a */
    private final Map f20122a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List f20123b = new ArrayList();

    /* renamed from: c */
    private final Context f20124c;

    /* renamed from: d */
    private final tj0 f20125d;

    xk0(Context context, tj0 tj0) {
        this.f20124c = context;
        this.f20125d = tj0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo15104b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f20125d.mo14315e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo15105c(String str) {
        SharedPreferences sharedPreferences;
        if (!this.f20122a.containsKey(str)) {
            if ("__default__".equals(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f20124c);
            } else {
                sharedPreferences = this.f20124c.getSharedPreferences(str, 0);
            }
            wk0 wk0 = new wk0(this, str);
            this.f20122a.put(str, wk0);
            sharedPreferences.registerOnSharedPreferenceChangeListener(wk0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo15106d(vk0 vk0) {
        this.f20123b.add(vk0);
    }
}
