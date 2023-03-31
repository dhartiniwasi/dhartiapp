package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.nb0;
import com.google.android.gms.internal.ads.pm0;
import p060h4.C4584t;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        try {
            C4584t.m30035a().mo18130i(this, new nb0()).mo13785T0(intent);
        } catch (RemoteException e) {
            pm0.m18664d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
