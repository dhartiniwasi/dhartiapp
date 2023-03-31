package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.nb0;
import com.google.android.gms.internal.ads.te0;
import p060h4.C4584t;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class OfflinePingSender extends Worker {

    /* renamed from: g */
    private final te0 f5950g;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5950g = C4584t.m30035a().mo18130i(context, new nb0());
    }

    public final ListenableWorker.C1526a doWork() {
        try {
            this.f5950g.mo13784T();
            return ListenableWorker.C1526a.m7085c();
        } catch (RemoteException unused) {
            return ListenableWorker.C1526a.m7083a();
        }
    }
}
