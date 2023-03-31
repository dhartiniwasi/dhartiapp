package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C9529b;

/* renamed from: com.startapp.c8 */
/* compiled from: Sta */
public class C8884c8 extends C9529b {

    /* renamed from: com.startapp.c8$a */
    /* compiled from: Sta */
    public class C8885a implements C9620w7 {
        public C8885a() {
        }

        /* renamed from: a */
        public void mo29232a(Object obj) {
            C8884c8.this.callback.mo31223a(C8884c8.this, false);
        }
    }

    public C8884c8(Context context, C9529b.C9530a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        try {
            MetaData.m50089c(this.context);
            MetaData.f38952k.f38955b = true;
            if (MetaData.f38952k.mo31007W()) {
                ComponentLocator.m50248a(this.context).mo31186v().mo31290b();
                StartAppSDKInternal.m49730a(true, (C9620w7) new C8885a());
                return;
            }
            this.callback.mo31223a(this, false);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
