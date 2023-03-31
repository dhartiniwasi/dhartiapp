package p174y4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p074j5.C4831a;
import p130r5.C5467e;
import p218e6.C9975i;
import p218e6.C9980l;

/* renamed from: y4.b */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class C6140b extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f29574a;

    public C6140b() {
        C5467e.m33405a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4831a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f29574a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: e */
    private final int m35817e(Context context, Intent intent) {
        C9975i<Void> iVar;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            iVar = C9980l.m51031e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            iVar = C6167x.m35856b(context).mo21044c(2, bundle);
        }
        int b = mo20998b(context, new C6138a(intent));
        try {
            C9980l.m51028b(iVar, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return b;
    }

    /* renamed from: f */
    private final int m35818f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo20999c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Executor mo20997a() {
        return this.f29574a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo20998b(Context context, C6138a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20999c(Context context, Bundle bundle) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21000d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = m35818f(context, intent2);
            } else {
                i = m35817e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            mo20997a().execute(new C6153j(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
