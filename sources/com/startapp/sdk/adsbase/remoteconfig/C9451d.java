package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Bundle;
import com.startapp.C9023i4;
import com.startapp.C9061k3;
import com.startapp.C9065k5;
import com.startapp.C9219p7;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C9529b;

/* renamed from: com.startapp.sdk.adsbase.remoteconfig.d */
/* compiled from: Sta */
public class C9451d extends C9529b {
    public static final String LOG_TAG = C9451d.class.getSimpleName();

    public C9451d(Context context, C9529b.C9530a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        C9452a aVar = new C9452a(context, adPreferences, MetaDataRequest.RequestReason.PERIODIC, context, adPreferences);
        ComponentLocator a = ComponentLocator.m50248a(context);
        a.mo31181q().execute(new C9061k3(aVar, a));
    }

    public void run() {
        try {
            ComponentLocator.m50248a(this.context).mo31186v().mo31290b();
            MetaData.m50089c(this.context);
            if (MetaData.f38952k.mo31008X()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.mo31223a(this, false);
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.remoteconfig.d$a */
    /* compiled from: Sta */
    public class C9452a extends C9448a {

        /* renamed from: l */
        public MetaData f39004l;

        /* renamed from: m */
        public final /* synthetic */ Context f39005m;

        /* renamed from: n */
        public final /* synthetic */ AdPreferences f39006n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9452a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason, Context context2, AdPreferences adPreferences2) {
            super(context, adPreferences, requestReason);
            this.f39005m = context2;
            this.f39006n = adPreferences2;
        }

        /* renamed from: a */
        public Boolean mo31150a() {
            try {
                SimpleTokenUtils.m49714e(this.f39005m);
                MetaDataRequest metaDataRequest = new MetaDataRequest(this.f39005m, ComponentLocator.m50248a(this.f39005m).mo31168d(), MetaDataRequest.RequestReason.PERIODIC);
                metaDataRequest.mo31505a(this.f39005m, this.f39006n);
                C9219p7.C9220a a = C9448a.m50231a(this.f39005m, metaDataRequest);
                if (a != null) {
                    MetaData metaData = (MetaData) C9065k5.m48755a(a.f38066b, MetaData.class);
                    this.f39004l = metaData;
                    return Boolean.valueOf(metaData != null);
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
            return Boolean.FALSE;
        }

        /* renamed from: a */
        public void mo31151a(Boolean bool) {
            MetaData metaData;
            Context context;
            try {
                if (!(!bool.booleanValue() || (metaData = this.f39004l) == null || (context = this.f39005m) == null)) {
                    MetaData.m50085a(context, metaData, MetaDataRequest.RequestReason.PERIODIC, this.f39000k);
                }
                C9451d.this.callback.mo31223a(C9451d.this, false);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }
}
