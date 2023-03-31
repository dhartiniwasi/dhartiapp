package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.window.layout.C1524d;
import com.google.firebase.messaging.C8048j1;
import p218e6.C9975i;

/* renamed from: com.google.firebase.messaging.g1 */
/* compiled from: WithinAppServiceBinder */
class C8037g1 extends Binder {

    /* renamed from: a */
    private final C8038a f34677a;

    /* renamed from: com.google.firebase.messaging.g1$a */
    /* compiled from: WithinAppServiceBinder */
    interface C8038a {
        /* renamed from: a */
        C9975i<Void> mo26637a(Intent intent);
    }

    C8037g1(C8038a aVar) {
        this.f34677a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26636c(C8048j1.C8049a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f34677a.mo26637a(aVar.f34701a).mo26348c(C1524d.f4372a, new C8034f1(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
