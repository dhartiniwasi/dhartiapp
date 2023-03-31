package com.onesignal.flutter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import p186ac.C6539c;
import p186ac.C6556k;

/* renamed from: com.onesignal.flutter.a */
/* compiled from: FlutterRegistrarResponder */
abstract class C8434a {

    /* renamed from: a */
    Context f35621a;

    /* renamed from: b */
    C6556k f35622b;

    /* renamed from: c */
    C6539c f35623c;

    /* renamed from: com.onesignal.flutter.a$a */
    /* compiled from: FlutterRegistrarResponder */
    class C8435a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f35624a;

        /* renamed from: b */
        final /* synthetic */ Object f35625b;

        C8435a(C6556k.C6561d dVar, Object obj) {
            this.f35624a = dVar;
            this.f35625b = obj;
        }

        public void run() {
            this.f35624a.success(this.f35625b);
        }
    }

    /* renamed from: com.onesignal.flutter.a$b */
    /* compiled from: FlutterRegistrarResponder */
    class C8436b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f35627a;

        /* renamed from: b */
        final /* synthetic */ String f35628b;

        /* renamed from: c */
        final /* synthetic */ String f35629c;

        /* renamed from: d */
        final /* synthetic */ Object f35630d;

        C8436b(C6556k.C6561d dVar, String str, String str2, Object obj) {
            this.f35627a = dVar;
            this.f35628b = str;
            this.f35629c = str2;
            this.f35630d = obj;
        }

        public void run() {
            this.f35627a.error(this.f35628b, this.f35629c, this.f35630d);
        }
    }

    /* renamed from: com.onesignal.flutter.a$c */
    /* compiled from: FlutterRegistrarResponder */
    class C8437c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f35632a;

        C8437c(C6556k.C6561d dVar) {
            this.f35632a = dVar;
        }

        public void run() {
            this.f35632a.notImplemented();
        }
    }

    /* renamed from: com.onesignal.flutter.a$d */
    /* compiled from: FlutterRegistrarResponder */
    class C8438d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6556k f35634a;

        /* renamed from: b */
        final /* synthetic */ String f35635b;

        /* renamed from: c */
        final /* synthetic */ HashMap f35636c;

        C8438d(C6556k kVar, String str, HashMap hashMap) {
            this.f35634a = kVar;
            this.f35635b = str;
            this.f35636c = hashMap;
        }

        public void run() {
            this.f35634a.mo22159c(this.f35635b, this.f35636c);
        }
    }

    C8434a() {
    }

    /* renamed from: s */
    private void m46770s(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo27798o(String str, HashMap hashMap) {
        m46770s(new C8438d(this.f35622b, str, hashMap));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo27799p(C6556k.C6561d dVar, String str, String str2, Object obj) {
        m46770s(new C8436b(dVar, str, str2, obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo27800q(C6556k.C6561d dVar) {
        m46770s(new C8437c(dVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo27801r(C6556k.C6561d dVar, Object obj) {
        m46770s(new C8435a(dVar, obj));
    }
}
