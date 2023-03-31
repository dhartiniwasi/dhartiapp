package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rv3;
import com.google.android.gms.internal.ads.sv3;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class rv3<MessageType extends sv3<MessageType, BuilderType>, BuilderType extends rv3<MessageType, BuilderType>> implements bz3 {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract rv3 mo13419g(sv3 sv3);

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ bz3 mo8996w(cz3 cz3) {
        if (mo9745c().getClass().isInstance(cz3)) {
            return mo13419g((sv3) cz3);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
