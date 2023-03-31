package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.onesignal.C8338d3;
import com.onesignal.C8411f0;
import p035e0.C4171a;

public class FCMBroadcastReceiver extends C4171a {

    /* renamed from: com.onesignal.FCMBroadcastReceiver$a */
    class C8277a implements C8411f0.C8416e {
        C8277a() {
        }

        /* renamed from: a */
        public void mo27486a(C8411f0.C8417f fVar) {
            if (fVar == null) {
                FCMBroadcastReceiver.this.m46100j();
            } else if (fVar.mo27770a() || fVar.mo27771b()) {
                FCMBroadcastReceiver.this.m46098h();
            } else {
                FCMBroadcastReceiver.this.m46100j();
            }
        }
    }

    /* renamed from: com.onesignal.FCMBroadcastReceiver$b */
    class C8278b implements C8411f0.C8416e {

        /* renamed from: a */
        final /* synthetic */ C8411f0.C8416e f35248a;

        /* renamed from: b */
        final /* synthetic */ Context f35249b;

        /* renamed from: c */
        final /* synthetic */ Bundle f35250c;

        C8278b(C8411f0.C8416e eVar, Context context, Bundle bundle) {
            this.f35248a = eVar;
            this.f35249b = context;
            this.f35250c = bundle;
        }

        /* renamed from: a */
        public void mo27486a(C8411f0.C8417f fVar) {
            if (fVar == null || !fVar.mo27772c()) {
                FCMBroadcastReceiver.m46101k(this.f35249b, this.f35250c);
                this.f35248a.mo27486a(fVar);
                return;
            }
            this.f35248a.mo27486a(fVar);
        }
    }

    /* renamed from: f */
    private static boolean m46096f(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null || "gcm".equals(stringExtra)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static void m46097g(Context context, Intent intent, Bundle bundle, C8411f0.C8416e eVar) {
        if (!m46096f(intent)) {
            eVar.mo27486a((C8411f0.C8417f) null);
        }
        C8411f0.m46667h(context, bundle, new C8278b(eVar, context, bundle));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m46098h() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    /* renamed from: i */
    private static C8465j m46099i(Bundle bundle, C8465j jVar) {
        jVar.putString("json_payload", C8411f0.m46660a(bundle).toString());
        jVar.mo27873a("timestamp", Long.valueOf(C8338d3.m46448M0().mo28281b() / 1000));
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m46100j() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    /* renamed from: k */
    static void m46101k(Context context, Bundle bundle) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "startFCMService from: " + context + " and bundle: " + bundle);
        if (!C8411f0.m46662c(bundle)) {
            C8338d3.m46492a(r0Var, "startFCMService with no remote resources, no need for services");
            C8411f0.m46669j(context, m46099i(bundle, C8478l.m46995a()));
            return;
        }
        if ((Integer.parseInt(bundle.getString("pri", "0")) > 9) || Build.VERSION.SDK_INT < 26) {
            try {
                m46103m(context, bundle);
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT >= 21) {
                    m46102l(context, bundle);
                    return;
                }
                throw e;
            }
        } else {
            m46102l(context, bundle);
        }
    }

    /* renamed from: l */
    private static void m46102l(Context context, Bundle bundle) {
        C8465j i = m46099i(bundle, C8478l.m46995a());
        Intent intent = new Intent(context, FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", (Parcelable) i.mo27875c());
        FCMIntentJobService.m46106j(context, intent);
    }

    /* renamed from: m */
    private static void m46103m(Context context, Bundle bundle) {
        C4171a.m28288c(context, new Intent().replaceExtras((Bundle) m46099i(bundle, new C8471k()).mo27875c()).setComponent(new ComponentName(context.getPackageName(), FCMIntentService.class.getName())));
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && !"google.com/iid".equals(extras.getString("from"))) {
            C8338d3.m46506d1(context);
            m46097g(context, intent, extras, new C8277a());
        }
    }
}
