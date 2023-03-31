package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fp0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f9381a;

    /* renamed from: b */
    private final ep0 f9382b;

    /* renamed from: c */
    private boolean f9383c;

    /* renamed from: d */
    private boolean f9384d;

    /* renamed from: e */
    private boolean f9385e;

    /* renamed from: f */
    private float f9386f = 1.0f;

    public fp0(Context context, ep0 ep0) {
        this.f9381a = (AudioManager) context.getSystemService("audio");
        this.f9382b = ep0;
    }

    /* renamed from: f */
    private final void m12774f() {
        boolean z = false;
        if (!this.f9384d || this.f9385e || this.f9386f <= 0.0f) {
            if (this.f9383c) {
                AudioManager audioManager = this.f9381a;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f9383c = z;
                }
                this.f9382b.mo9946a0();
            }
        } else if (!this.f9383c) {
            AudioManager audioManager2 = this.f9381a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f9383c = z;
            }
            this.f9382b.mo9946a0();
        }
    }

    /* renamed from: a */
    public final float mo10239a() {
        float f = this.f9385e ? 0.0f : this.f9386f;
        if (this.f9383c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo10240b() {
        this.f9384d = true;
        m12774f();
    }

    /* renamed from: c */
    public final void mo10241c() {
        this.f9384d = false;
        m12774f();
    }

    /* renamed from: d */
    public final void mo10242d(boolean z) {
        this.f9385e = z;
        m12774f();
    }

    /* renamed from: e */
    public final void mo10243e(float f) {
        this.f9386f = f;
        m12774f();
    }

    public final void onAudioFocusChange(int i) {
        this.f9383c = i > 0;
        this.f9382b.mo9946a0();
    }
}
