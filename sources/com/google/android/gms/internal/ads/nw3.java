package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nw3 {

    /* renamed from: a */
    private final AudioManager f14218a;

    /* renamed from: b */
    private final lu3 f14219b;

    /* renamed from: c */
    private mv3 f14220c;

    /* renamed from: d */
    private int f14221d;

    /* renamed from: e */
    private float f14222e = 1.0f;

    public nw3(Context context, Handler handler, mv3 mv3) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f14218a = audioManager;
        this.f14220c = mv3;
        this.f14219b = new lu3(this, handler);
        this.f14221d = 0;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m17313c(nw3 nw3, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                nw3.m17316g(3);
                return;
            }
            nw3.m17315f(0);
            nw3.m17316g(2);
        } else if (i == -1) {
            nw3.m17315f(-1);
            nw3.m17314e();
        } else if (i != 1) {
            ot1.m18060e("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            nw3.m17316g(1);
            nw3.m17315f(1);
        }
    }

    /* renamed from: e */
    private final void m17314e() {
        if (this.f14221d != 0) {
            if (gb2.f9812a < 26) {
                this.f14218a.abandonAudioFocus(this.f14219b);
            }
            m17316g(0);
        }
    }

    /* renamed from: f */
    private final void m17315f(int i) {
        mv3 mv3 = this.f14220c;
        if (mv3 != null) {
            k64 k64 = (k64) mv3;
            boolean h = k64.f11934a.mo9061h();
            k64.f11934a.m17546m0(h, i, o64.m17528O(h, i));
        }
    }

    /* renamed from: g */
    private final void m17316g(int i) {
        if (this.f14221d != i) {
            this.f14221d = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f14222e != f) {
                this.f14222e = f;
                mv3 mv3 = this.f14220c;
                if (mv3 != null) {
                    ((k64) mv3).f11934a.m17540j0();
                }
            }
        }
    }

    /* renamed from: a */
    public final float mo12724a() {
        return this.f14222e;
    }

    /* renamed from: b */
    public final int mo12725b(boolean z, int i) {
        m17314e();
        return z ? 1 : -1;
    }

    /* renamed from: d */
    public final void mo12726d() {
        this.f14220c = null;
        m17314e();
    }
}
