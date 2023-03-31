package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p020c1.C1838c;
import p020c1.C1839d;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6088e;
import p170y0.C6094j;
import p176z0.C6183b;
import p176z0.C6191i;

/* renamed from: androidx.work.impl.foreground.a */
/* compiled from: SystemForegroundDispatcher */
public class C1565a implements C1838c, C6183b {

    /* renamed from: s */
    static final String f4512s = C6094j.m35719f("SystemFgDispatcher");

    /* renamed from: a */
    private Context f4513a;

    /* renamed from: b */
    private C6191i f4514b;

    /* renamed from: c */
    private final C4647a f4515c;

    /* renamed from: d */
    final Object f4516d = new Object();

    /* renamed from: e */
    String f4517e;

    /* renamed from: f */
    final Map<String, C6088e> f4518f;

    /* renamed from: g */
    final Map<String, C4329p> f4519g;

    /* renamed from: h */
    final Set<C4329p> f4520h;

    /* renamed from: i */
    final C1839d f4521i;

    /* renamed from: r */
    private C1567b f4522r;

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* compiled from: SystemForegroundDispatcher */
    class C1566a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WorkDatabase f4523a;

        /* renamed from: b */
        final /* synthetic */ String f4524b;

        C1566a(WorkDatabase workDatabase, String str) {
            this.f4523a = workDatabase;
            this.f4524b = str;
        }

        public void run() {
            C4329p n = this.f4523a.mo6318B().mo17766n(this.f4524b);
            if (n != null && n.mo17744b()) {
                synchronized (C1565a.this.f4516d) {
                    C1565a.this.f4519g.put(this.f4524b, n);
                    C1565a.this.f4520h.add(n);
                    C1565a aVar = C1565a.this;
                    aVar.f4521i.mo7026d(aVar.f4520h);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    /* compiled from: SystemForegroundDispatcher */
    interface C1567b {
        /* renamed from: b */
        void mo6352b(int i, int i2, Notification notification);

        /* renamed from: c */
        void mo6353c(int i, Notification notification);

        /* renamed from: d */
        void mo6354d(int i);

        void stop();
    }

    C1565a(Context context) {
        this.f4513a = context;
        C6191i m = C6191i.m36023m(context);
        this.f4514b = m;
        C4647a r = m.mo21131r();
        this.f4515c = r;
        this.f4517e = null;
        this.f4518f = new LinkedHashMap();
        this.f4520h = new HashSet();
        this.f4519g = new HashMap();
        this.f4521i = new C1839d(this.f4513a, r, this);
        this.f4514b.mo21128o().mo21103c(this);
    }

    /* renamed from: a */
    public static Intent m7248a(Context context, String str, C6088e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.mo20914c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.mo20912a());
        intent.putExtra("KEY_NOTIFICATION", eVar.mo20913b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m7249c(Context context, String str, C6088e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.mo20914c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.mo20912a());
        intent.putExtra("KEY_NOTIFICATION", eVar.mo20913b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: e */
    public static Intent m7250e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: g */
    private void m7251g(Intent intent) {
        C6094j.m35717c().mo20923d(f4512s, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f4514b.mo20938b(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: h */
    private void m7252h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C6094j.m35717c().mo20921a(f4512s, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f4522r != null) {
            this.f4518f.put(stringExtra, new C6088e(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f4517e)) {
                this.f4517e = stringExtra;
                this.f4522r.mo6352b(intExtra, intExtra2, notification);
                return;
            }
            this.f4522r.mo6353c(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, C6088e> value : this.f4518f.entrySet()) {
                    i |= ((C6088e) value.getValue()).mo20912a();
                }
                C6088e eVar = this.f4518f.get(this.f4517e);
                if (eVar != null) {
                    this.f4522r.mo6352b(eVar.mo20914c(), i, eVar.mo20913b());
                }
            }
        }
    }

    /* renamed from: i */
    private void m7253i(Intent intent) {
        C6094j.m35717c().mo20923d(f4512s, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f4515c.mo18322b(new C1566a(this.f4514b.mo21130q(), stringExtra));
    }

    /* renamed from: b */
    public void mo29b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                C6094j.m35717c().mo20921a(f4512s, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f4514b.mo21137y(next);
            }
        }
    }

    /* renamed from: d */
    public void mo31d(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f4516d) {
            C4329p remove = this.f4519g.remove(str);
            if (remove != null ? this.f4520h.remove(remove) : false) {
                this.f4521i.mo7026d(this.f4520h);
            }
        }
        C6088e remove2 = this.f4518f.remove(str);
        if (str.equals(this.f4517e) && this.f4518f.size() > 0) {
            Iterator it = this.f4518f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f4517e = (String) entry.getKey();
            if (this.f4522r != null) {
                C6088e eVar = (C6088e) entry.getValue();
                this.f4522r.mo6352b(eVar.mo20914c(), eVar.mo20912a(), eVar.mo20913b());
                this.f4522r.mo6354d(eVar.mo20914c());
            }
        }
        C1567b bVar = this.f4522r;
        if (remove2 != null && bVar != null) {
            C6094j.m35717c().mo20921a(f4512s, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.mo20914c()), str, Integer.valueOf(remove2.mo20912a())}), new Throwable[0]);
            bVar.mo6354d(remove2.mo20914c());
        }
    }

    /* renamed from: f */
    public void mo33f(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6359j(Intent intent) {
        C6094j.m35717c().mo20923d(f4512s, "Stopping foreground service", new Throwable[0]);
        C1567b bVar = this.f4522r;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6360k() {
        this.f4522r = null;
        synchronized (this.f4516d) {
            this.f4521i.mo7027e();
        }
        this.f4514b.mo21128o().mo21107i(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6361l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m7253i(intent);
            m7252h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m7252h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m7251g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            mo6359j(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6362m(C1567b bVar) {
        if (this.f4522r != null) {
            C6094j.m35717c().mo20922b(f4512s, "A callback already exists.", new Throwable[0]);
        } else {
            this.f4522r = bVar;
        }
    }
}
