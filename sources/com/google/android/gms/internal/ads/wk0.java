package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wk0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final String f19661a;

    /* renamed from: b */
    final /* synthetic */ xk0 f19662b;

    public wk0(xk0 xk0, String str) {
        this.f19662b = xk0;
        this.f19661a = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f19662b) {
            for (vk0 vk0 : this.f19662b.f20123b) {
                vk0.f19133a.mo15104b(vk0.f19134b, sharedPreferences, this.f19661a, str);
            }
        }
    }
}
