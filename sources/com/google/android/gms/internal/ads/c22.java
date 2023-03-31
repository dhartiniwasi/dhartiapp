package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class c22 implements ie3 {

    /* renamed from: a */
    public final /* synthetic */ i22 f7577a;

    public /* synthetic */ c22(i22 i22) {
        this.f7577a = i22;
    }

    /* renamed from: b */
    public final lf3 mo8156b(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        dn0.f8325a.execute(new du2((InputStream) obj, createPipe[1]));
        return cf3.m10911i(parcelFileDescriptor);
    }
}
