package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class i84 {

    /* renamed from: a */
    private final Context f10672a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f10673b;

    /* renamed from: c */
    private final e84 f10674c;

    /* renamed from: d */
    private final AudioManager f10675d;

    /* renamed from: e */
    private h84 f10676e;

    /* renamed from: f */
    private int f10677f = 3;

    /* renamed from: g */
    private int f10678g;

    /* renamed from: h */
    private boolean f10679h;

    public i84(Context context, Handler handler, e84 e84) {
        Context applicationContext = context.getApplicationContext();
        this.f10672a = applicationContext;
        this.f10673b = handler;
        this.f10674c = e84;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        v91.m22048b(audioManager);
        this.f10675d = audioManager;
        this.f10678g = m14230g(audioManager, 3);
        this.f10679h = m14232i(audioManager, this.f10677f);
        h84 h84 = new h84(this, (g84) null);
        try {
            gb2.m13157a(applicationContext, h84, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f10676e = h84;
        } catch (RuntimeException e) {
            ot1.m18061f("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: g */
    private static int m14230g(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            ot1.m18061f("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14231h() {
        int g = m14230g(this.f10675d, this.f10677f);
        boolean i = m14232i(this.f10675d, this.f10677f);
        if (this.f10678g != g || this.f10679h != i) {
            this.f10678g = g;
            this.f10679h = i;
            lq1 x0 = ((k64) this.f10674c).f11934a.f14961k;
            x0.mo12062d(30, new f64(g, i));
            x0.mo12061c();
        }
    }

    /* renamed from: i */
    private static boolean m14232i(AudioManager audioManager, int i) {
        if (gb2.f9812a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m14230g(audioManager, i) == 0;
    }

    /* renamed from: a */
    public final int mo11058a() {
        return this.f10675d.getStreamMaxVolume(this.f10677f);
    }

    /* renamed from: b */
    public final int mo11059b() {
        if (gb2.f9812a >= 28) {
            return this.f10675d.getStreamMinVolume(this.f10677f);
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo11060e() {
        h84 h84 = this.f10676e;
        if (h84 != null) {
            try {
                this.f10672a.unregisterReceiver(h84);
            } catch (RuntimeException e) {
                ot1.m18061f("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f10676e = null;
        }
    }

    /* renamed from: f */
    public final void mo11061f(int i) {
        if (this.f10677f != 3) {
            this.f10677f = 3;
            m14231h();
            k64 k64 = (k64) this.f10674c;
            ch4 w0 = o64.m17533b0(k64.f11934a.f14975y);
            if (!w0.equals(k64.f11934a.f14945b0)) {
                k64.f11934a.f14945b0 = w0;
                lq1 x0 = k64.f11934a.f14961k;
                x0.mo12062d(29, new g64(w0));
                x0.mo12061c();
            }
        }
    }
}
