package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.C1524d;
import com.google.firebase.messaging.C8037g1;
import java.util.concurrent.ExecutorService;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;

/* renamed from: com.google.firebase.messaging.h */
/* compiled from: EnhancedIntentService */
public abstract class C8039h extends Service {

    /* renamed from: a */
    final ExecutorService f34678a = C8054m.m44361d();

    /* renamed from: b */
    private Binder f34679b;

    /* renamed from: c */
    private final Object f34680c = new Object();

    /* renamed from: d */
    private int f34681d;

    /* renamed from: e */
    private int f34682e = 0;

    /* renamed from: com.google.firebase.messaging.h$a */
    /* compiled from: EnhancedIntentService */
    class C8040a implements C8037g1.C8038a {
        C8040a() {
        }

        /* renamed from: a */
        public C9975i<Void> mo26637a(Intent intent) {
            return C8039h.this.m44263j(intent);
        }
    }

    /* renamed from: d */
    private void m44260d(Intent intent) {
        if (intent != null) {
            C8031e1.m44238c(intent);
        }
        synchronized (this.f34680c) {
            int i = this.f34682e - 1;
            this.f34682e = i;
            if (i == 0) {
                mo26639k(this.f34681d);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m44261h(Intent intent, C9975i iVar) {
        m44260d(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m44262i(Intent intent, C9977j jVar) {
        try {
            mo26594f(intent);
        } finally {
            jVar.mo32544c(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C9975i<Void> m44263j(Intent intent) {
        if (mo26638g(intent)) {
            return C9980l.m51031e(null);
        }
        C9977j jVar = new C9977j();
        this.f34678a.execute(new C8035g(this, intent, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Intent mo26593e(Intent intent) {
        return intent;
    }

    /* renamed from: f */
    public abstract void mo26594f(Intent intent);

    /* renamed from: g */
    public boolean mo26638g(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo26639k(int i) {
        return stopSelfResult(i);
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f34679b == null) {
            this.f34679b = new C8037g1(new C8040a());
        }
        return this.f34679b;
    }

    public void onDestroy() {
        this.f34678a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f34680c) {
            this.f34681d = i2;
            this.f34682e++;
        }
        Intent e = mo26593e(intent);
        if (e == null) {
            m44260d(intent);
            return 2;
        }
        C9975i<Void> j = m44263j(e);
        if (j.mo26361p()) {
            m44260d(intent);
            return 2;
        }
        j.mo26348c(C1524d.f4372a, new C8032f(this, intent));
        return 3;
    }
}
