package p147u1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p098n1.C5095o;
import p126r1.C5431a;
import p153v1.C5761d;
import p165x1.C6034a;
import p171y1.C6116a;

/* renamed from: u1.a */
/* compiled from: AlarmManagerScheduler */
public class C5693a implements C5708y {

    /* renamed from: a */
    private final Context f28448a;

    /* renamed from: b */
    private final C5761d f28449b;

    /* renamed from: c */
    private AlarmManager f28450c;

    /* renamed from: d */
    private final C5699g f28451d;

    /* renamed from: e */
    private final C6034a f28452e;

    public C5693a(Context context, C5761d dVar, C6034a aVar, C5699g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    /* renamed from: a */
    public void mo20073a(C5095o oVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", oVar.mo19024b());
        builder.appendQueryParameter("priority", String.valueOf(C6116a.m35764a(oVar.mo19026d())));
        if (oVar.mo19025c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(oVar.mo19025c(), 0));
        }
        Intent intent = new Intent(this.f28448a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !mo20075c(intent)) {
            long C0 = this.f28449b.mo20263C0(oVar);
            long g = this.f28451d.mo20093g(oVar.mo19026d(), C0, i);
            C5431a.m33268c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", oVar, Long.valueOf(g), Long.valueOf(C0), Integer.valueOf(i));
            this.f28450c.set(3, this.f28452e.mo20745a() + g, PendingIntent.getBroadcast(this.f28448a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            return;
        }
        C5431a.m33267b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    /* renamed from: b */
    public void mo20074b(C5095o oVar, int i) {
        mo20073a(oVar, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo20075c(Intent intent) {
        return PendingIntent.getBroadcast(this.f28448a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }

    C5693a(Context context, C5761d dVar, AlarmManager alarmManager, C6034a aVar, C5699g gVar) {
        this.f28448a = context;
        this.f28449b = dVar;
        this.f28450c = alarmManager;
        this.f28452e = aVar;
        this.f28451d = gVar;
    }
}
