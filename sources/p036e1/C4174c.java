package p036e1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p064i1.C4647a;
import p170y0.C6094j;

/* renamed from: e1.c */
/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class C4174c<T> extends C4176d<T> {

    /* renamed from: h */
    private static final String f23433h = C6094j.m35719f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    private final BroadcastReceiver f23434g = new C4175a();

    /* renamed from: e1.c$a */
    /* compiled from: BroadcastReceiverConstraintTracker */
    class C4175a extends BroadcastReceiver {
        C4175a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C4174c.this.mo17504h(context, intent);
            }
        }
    }

    public C4174c(Context context, C4647a aVar) {
        super(context, aVar);
    }

    /* renamed from: e */
    public void mo17507e() {
        C6094j.m35717c().mo20921a(f23433h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f23438b.registerReceiver(this.f23434g, mo17503g());
    }

    /* renamed from: f */
    public void mo17508f() {
        C6094j.m35717c().mo20921a(f23433h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f23438b.unregisterReceiver(this.f23434g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo17503g();

    /* renamed from: h */
    public abstract void mo17504h(Context context, Intent intent);
}
