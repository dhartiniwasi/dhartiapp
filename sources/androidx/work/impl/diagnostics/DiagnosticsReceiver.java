package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p170y0.C6094j;
import p170y0.C6097l;
import p170y0.C6111t;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4496a = C6094j.m35719f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C6094j.m35717c().mo20921a(f4496a, "Requesting diagnostics", new Throwable[0]);
            try {
                C6111t.m35740g(context).mo20940d(C6097l.m35730e(DiagnosticsWorker.class));
            } catch (IllegalStateException e) {
                C6094j.m35717c().mo20922b(f4496a, "WorkManager is not initialized", e);
            }
        }
    }
}
