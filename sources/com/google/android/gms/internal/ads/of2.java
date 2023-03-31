package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class of2 implements tj2 {

    /* renamed from: a */
    private final mf3 f15066a;

    /* renamed from: b */
    private final Context f15067b;

    public of2(mf3 mf3, Context context) {
        this.f15066a = mf3;
        this.f15067b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ pf2 mo12908a() throws Exception {
        int i;
        AudioManager audioManager = (AudioManager) this.f15067b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i2 = -1;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14281D8)).booleanValue()) {
            i = C4409t.m29327s().mo18426h(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        return new pf2(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), C4409t.m29328t().mo18439a(), C4409t.m29328t().mo18442e());
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f15066a.mo12324a(new nf2(this));
    }

    public final int zza() {
        return 13;
    }
}
