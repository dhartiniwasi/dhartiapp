package p174y4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: y4.j */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C6153j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6140b f29596a;

    /* renamed from: b */
    public final /* synthetic */ Intent f29597b;

    /* renamed from: c */
    public final /* synthetic */ Context f29598c;

    /* renamed from: d */
    public final /* synthetic */ boolean f29599d;

    /* renamed from: e */
    public final /* synthetic */ BroadcastReceiver.PendingResult f29600e;

    public /* synthetic */ C6153j(C6140b bVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f29596a = bVar;
        this.f29597b = intent;
        this.f29598c = context;
        this.f29599d = z;
        this.f29600e = pendingResult;
    }

    public final void run() {
        this.f29596a.mo21000d(this.f29597b, this.f29598c, this.f29599d, this.f29600e);
    }
}
