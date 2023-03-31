package p073j4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.C2679nz;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p060h4.C4596v;

/* renamed from: j4.j1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4782j1 {

    /* renamed from: a */
    private final BroadcastReceiver f25448a = new C4778i1(this);

    /* renamed from: b */
    private final Map f25449b = new WeakHashMap();

    /* renamed from: c */
    private boolean f25450c = false;

    /* renamed from: d */
    private boolean f25451d;

    /* renamed from: e */
    private Context f25452e;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void m30673e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f25449b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }

    /* renamed from: b */
    public final synchronized void mo18466b(Context context) {
        if (!this.f25450c) {
            Context applicationContext = context.getApplicationContext();
            this.f25452e = applicationContext;
            if (applicationContext == null) {
                this.f25452e = context;
            }
            C2679nz.m17343c(this.f25452e);
            this.f25451d = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14464W2)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14291E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f25452e.registerReceiver(this.f25448a, intentFilter);
            } else {
                this.f25452e.registerReceiver(this.f25448a, intentFilter, 4);
            }
            this.f25450c = true;
        }
    }

    /* renamed from: c */
    public final synchronized void mo18467c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f25451d) {
            this.f25449b.put(broadcastReceiver, intentFilter);
            return;
        }
        C2679nz.m17343c(context);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14291E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    /* renamed from: d */
    public final synchronized void mo18468d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f25451d) {
            this.f25449b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
