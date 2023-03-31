package p036e1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p064i1.C4647a;
import p170y0.C6094j;

/* renamed from: e1.f */
/* compiled from: StorageNotLowTracker */
public class C4181f extends C4174c<Boolean> {

    /* renamed from: i */
    private static final String f23450i = C6094j.m35719f("StorageNotLowTracker");

    public C4181f(Context context, C4647a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo17503g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo17504h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C6094j.m35717c().mo20921a(f23450i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo17512d(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo17512d(Boolean.TRUE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo17502b() {
        Intent registerReceiver = this.f23438b.registerReceiver((BroadcastReceiver) null, mo17503g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }
}
