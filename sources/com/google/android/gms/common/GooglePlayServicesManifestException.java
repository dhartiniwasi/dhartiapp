package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a */
    private final int f6010a;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.f6010a = i;
    }
}
