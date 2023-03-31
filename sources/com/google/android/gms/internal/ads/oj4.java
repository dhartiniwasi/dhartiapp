package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oj4 {

    /* renamed from: a */
    private final Spatializer f15164a;

    /* renamed from: b */
    private final boolean f15165b;

    /* renamed from: c */
    private Handler f15166c;

    /* renamed from: d */
    private Spatializer.OnSpatializerStateChangedListener f15167d;

    private oj4(Spatializer spatializer) {
        this.f15164a = spatializer;
        this.f15165b = spatializer.getImmersiveAudioLevel() != 0;
    }

    /* renamed from: a */
    public static oj4 m17900a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new oj4(audioManager.getSpatializer());
    }

    /* renamed from: b */
    public final void mo12957b(vj4 vj4, Looper looper) {
        if (this.f15167d == null && this.f15166c == null) {
            this.f15167d = new nj4(this, vj4);
            Handler handler = new Handler(looper);
            this.f15166c = handler;
            this.f15164a.addOnSpatializerStateChangedListener(new mj4(handler), this.f15167d);
        }
    }

    /* renamed from: c */
    public final void mo12958c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f15167d;
        if (onSpatializerStateChangedListener != null && this.f15166c != null) {
            this.f15164a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.f15166c;
            int i = gb2.f9812a;
            handler.removeCallbacksAndMessages((Object) null);
            this.f15166c = null;
            this.f15167d = null;
        }
    }

    /* renamed from: d */
    public final boolean mo12959d(w74 w74, C2388g4 g4Var) {
        int i;
        if (!"audio/eac3-joc".equals(g4Var.f9673l) || g4Var.f9686y != 16) {
            i = g4Var.f9686y;
        } else {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(gb2.m13150T(i));
        int i2 = g4Var.f9687z;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return this.f15164a.canBeSpatialized(w74.mo14874a().f18394a, channelMask.build());
    }

    /* renamed from: e */
    public final boolean mo12960e() {
        return this.f15164a.isAvailable();
    }

    /* renamed from: f */
    public final boolean mo12961f() {
        return this.f15164a.isEnabled();
    }

    /* renamed from: g */
    public final boolean mo12962g() {
        return this.f15165b;
    }
}
