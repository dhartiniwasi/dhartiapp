package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.nb0;
import com.google.android.gms.internal.ads.qb0;
import p060h4.C4514h1;
import p060h4.C4516h3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class LiteSdkInfo extends C4514h1 {
    public LiteSdkInfo(Context context) {
    }

    public qb0 getAdapterCreator() {
        return new nb0();
    }

    public C4516h3 getLiteSdkVersion() {
        return new C4516h3(ModuleDescriptor.MODULE_VERSION, 223104000, "21.3.0");
    }
}
