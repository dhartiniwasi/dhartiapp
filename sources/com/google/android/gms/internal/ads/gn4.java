package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class gn4 implements jn4 {

    /* renamed from: a */
    public static final /* synthetic */ gn4 f10008a = new gn4();

    private /* synthetic */ gn4() {
    }

    public final Constructor zza() {
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(qn4.class).getConstructor(new Class[]{Integer.TYPE});
    }
}
