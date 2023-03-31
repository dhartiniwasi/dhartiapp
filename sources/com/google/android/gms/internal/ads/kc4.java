package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kc4 {

    /* renamed from: a */
    public final C2388g4 f12023a;

    /* renamed from: b */
    public final int f12024b;

    /* renamed from: c */
    public final int f12025c;

    /* renamed from: d */
    public final int f12026d;

    /* renamed from: e */
    public final int f12027e;

    /* renamed from: f */
    public final int f12028f;

    /* renamed from: g */
    public final int f12029g;

    /* renamed from: h */
    public final int f12030h;

    /* renamed from: i */
    public final gb4[] f12031i;

    public kc4(C2388g4 g4Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, gb4[] gb4Arr) {
        this.f12023a = g4Var;
        this.f12024b = i;
        this.f12025c = i2;
        this.f12026d = i3;
        this.f12027e = i4;
        this.f12028f = i5;
        this.f12029g = i6;
        this.f12030h = i7;
        this.f12031i = gb4Arr;
    }

    /* renamed from: a */
    public final long mo11659a(long j) {
        return (j * 1000000) / ((long) this.f12027e);
    }

    /* renamed from: b */
    public final AudioTrack mo11660b(boolean z, w74 w74, int i) throws ub4 {
        AudioTrack audioTrack;
        try {
            int i2 = gb2.f9812a;
            if (i2 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(w74.mo14874a().f18394a).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f12027e).setChannelMask(this.f12028f).setEncoding(this.f12029g).build()).setTransferMode(1).setBufferSizeInBytes(this.f12030h).setSessionId(i).setOffloadedPlayback(this.f12025c == 1).build();
            } else if (i2 >= 21) {
                audioTrack = new AudioTrack(w74.mo14874a().f18394a, new AudioFormat.Builder().setSampleRate(this.f12027e).setChannelMask(this.f12028f).setEncoding(this.f12029g).build(), this.f12030h, 1, i);
            } else {
                int i3 = w74.f19520a;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.f12027e, this.f12028f, this.f12029g, this.f12030h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f12027e, this.f12028f, this.f12029g, this.f12030h, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new ub4(state, this.f12027e, this.f12028f, this.f12030h, this.f12023a, mo11661c(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new ub4(0, this.f12027e, this.f12028f, this.f12030h, this.f12023a, mo11661c(), e);
        }
    }

    /* renamed from: c */
    public final boolean mo11661c() {
        return this.f12025c == 1;
    }
}
