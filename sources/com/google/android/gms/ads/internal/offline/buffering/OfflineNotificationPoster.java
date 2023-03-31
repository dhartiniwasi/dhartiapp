package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.nb0;
import com.google.android.gms.internal.ads.te0;
import p060h4.C4584t;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: g */
    private final te0 f5949g;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5949g = C4584t.m30035a().mo18130i(context, new nb0());
    }

    public final ListenableWorker.C1526a doWork() {
        try {
            this.f5949g.mo13786v2(C4956b.m31385o3(getApplicationContext()), getInputData().mo6306l("uri"), getInputData().mo6306l("gws_query_id"));
            return ListenableWorker.C1526a.m7085c();
        } catch (RemoteException unused) {
            return ListenableWorker.C1526a.m7083a();
        }
    }
}
