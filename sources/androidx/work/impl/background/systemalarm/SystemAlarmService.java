package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.C1225q;
import androidx.work.impl.background.systemalarm.C1556e;
import p057h1.C4426j;
import p170y0.C6094j;

public class SystemAlarmService extends C1225q implements C1556e.C1559c {

    /* renamed from: d */
    private static final String f4452d = C6094j.m35719f("SystemAlarmService");

    /* renamed from: b */
    private C1556e f4453b;

    /* renamed from: c */
    private boolean f4454c;

    /* renamed from: e */
    private void m7194e() {
        C1556e eVar = new C1556e(this);
        this.f4453b = eVar;
        eVar.mo6343m(this);
    }

    /* renamed from: a */
    public void mo6329a() {
        this.f4454c = true;
        C6094j.m35717c().mo20921a(f4452d, "All commands completed in dispatcher", new Throwable[0]);
        C4426j.m29379a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        m7194e();
        this.f4454c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4454c = true;
        this.f4453b.mo6341j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f4454c) {
            C6094j.m35717c().mo20923d(f4452d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f4453b.mo6341j();
            m7194e();
            this.f4454c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4453b.mo6335a(intent, i2);
        return 3;
    }
}
