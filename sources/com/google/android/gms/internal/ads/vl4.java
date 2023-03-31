package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vl4 implements DisplayManager.DisplayListener, tl4 {

    /* renamed from: a */
    private final DisplayManager f19146a;

    /* renamed from: b */
    private rl4 f19147b;

    private vl4(DisplayManager displayManager) {
        this.f19146a = displayManager;
    }

    /* renamed from: b */
    public static tl4 m22304b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new vl4(displayManager);
        }
        return null;
    }

    /* renamed from: c */
    private final Display m22305c() {
        return this.f19146a.getDisplay(0);
    }

    /* renamed from: a */
    public final void mo14324a(rl4 rl4) {
        this.f19147b = rl4;
        this.f19146a.registerDisplayListener(this, gb2.m13163d((Handler.Callback) null));
        xl4.m23368b(rl4.f17015a, m22305c());
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        rl4 rl4 = this.f19147b;
        if (rl4 != null && i == 0) {
            xl4.m23368b(rl4.f17015a, m22305c());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.f19146a.unregisterDisplayListener(this);
        this.f19147b = null;
    }
}
