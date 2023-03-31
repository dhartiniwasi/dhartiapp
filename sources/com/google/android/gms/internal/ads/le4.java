package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class le4 {

    /* renamed from: a */
    public final pe4 f12757a;

    /* renamed from: b */
    public final MediaFormat f12758b;

    /* renamed from: c */
    public final C2388g4 f12759c;

    /* renamed from: d */
    public final Surface f12760d;

    /* renamed from: e */
    public final MediaCrypto f12761e = null;

    private le4(pe4 pe4, MediaFormat mediaFormat, C2388g4 g4Var, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f12757a = pe4;
        this.f12758b = mediaFormat;
        this.f12759c = g4Var;
        this.f12760d = surface;
    }

    /* renamed from: a */
    public static le4 m15975a(pe4 pe4, MediaFormat mediaFormat, C2388g4 g4Var, MediaCrypto mediaCrypto) {
        return new le4(pe4, mediaFormat, g4Var, (Surface) null, (MediaCrypto) null, 0);
    }

    /* renamed from: b */
    public static le4 m15976b(pe4 pe4, MediaFormat mediaFormat, C2388g4 g4Var, Surface surface, MediaCrypto mediaCrypto) {
        return new le4(pe4, mediaFormat, g4Var, surface, (MediaCrypto) null, 0);
    }
}
