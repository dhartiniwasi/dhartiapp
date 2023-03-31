package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.window.layout.C1524d;
import java.util.concurrent.Executor;
import p067i5.C4699m;
import p218e6.C9975i;
import p218e6.C9980l;

/* renamed from: com.google.firebase.messaging.l */
/* compiled from: FcmBroadcastProcessor */
public class C8052l {

    /* renamed from: c */
    private static final Object f34706c = new Object();

    /* renamed from: d */
    private static C8048j1 f34707d;

    /* renamed from: a */
    private final Context f34708a;

    /* renamed from: b */
    private final Executor f34709b = C1524d.f4372a;

    public C8052l(Context context) {
        this.f34708a = context;
    }

    /* renamed from: d */
    private static C9975i<Integer> m44351d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (C8073t0.m44426b().mo26732e(context)) {
            C8031e1.m44241f(context, m44352e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m44352e(context, "com.google.firebase.MESSAGING_EVENT").mo26668c(intent);
        }
        return C9980l.m51031e(-1);
    }

    /* renamed from: e */
    private static C8048j1 m44352e(Context context, String str) {
        C8048j1 j1Var;
        synchronized (f34706c) {
            if (f34707d == null) {
                f34707d = new C8048j1(context, str);
            }
            j1Var = f34707d;
        }
        return j1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Integer m44354g(C9975i iVar) throws Exception {
        return 403;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C9975i m44355h(Context context, Intent intent, C9975i iVar) throws Exception {
        return (!C4699m.m30418i() || ((Integer) iVar.mo26358m()).intValue() != 402) ? iVar : m44351d(context, intent).mo26354i(C1524d.f4372a, C8046j.f34693a);
    }

    /* renamed from: i */
    public C9975i<Integer> mo26676i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo26677j(this.f34708a, intent);
    }

    /* renamed from: j */
    public C9975i<Integer> mo26677j(Context context, Intent intent) {
        boolean z = true;
        boolean z2 = C4699m.m30418i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (!z2 || z) {
            return C9980l.m51029c(this.f34709b, new C8050k(context, intent)).mo26356k(this.f34709b, new C8043i(context, intent));
        }
        return m44351d(context, intent);
    }
}
