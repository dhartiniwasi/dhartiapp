package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.e */
/* compiled from: SnackbarManager */
class C7717e {

    /* renamed from: e */
    private static C7717e f33872e;

    /* renamed from: a */
    private final Object f33873a = new Object();

    /* renamed from: b */
    private final Handler f33874b = new Handler(Looper.getMainLooper(), new C7718a());

    /* renamed from: c */
    private C7720c f33875c;

    /* renamed from: d */
    private C7720c f33876d;

    /* renamed from: com.google.android.material.snackbar.e$a */
    /* compiled from: SnackbarManager */
    class C7718a implements Handler.Callback {
        C7718a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C7717e.this.mo25768c((C7720c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.e$b */
    /* compiled from: SnackbarManager */
    interface C7719b {
        /* renamed from: a */
        void mo25772a(int i);
    }

    /* renamed from: com.google.android.material.snackbar.e$c */
    /* compiled from: SnackbarManager */
    private static class C7720c {

        /* renamed from: a */
        final WeakReference<C7719b> f33878a;

        /* renamed from: b */
        int f33879b;

        /* renamed from: c */
        boolean f33880c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo25773a(C7719b bVar) {
            return bVar != null && this.f33878a.get() == bVar;
        }
    }

    private C7717e() {
    }

    /* renamed from: a */
    private boolean m42975a(C7720c cVar, int i) {
        C7719b bVar = (C7719b) cVar.f33878a.get();
        if (bVar == null) {
            return false;
        }
        this.f33874b.removeCallbacksAndMessages(cVar);
        bVar.mo25772a(i);
        return true;
    }

    /* renamed from: b */
    static C7717e m42976b() {
        if (f33872e == null) {
            f33872e = new C7717e();
        }
        return f33872e;
    }

    /* renamed from: d */
    private boolean m42977d(C7719b bVar) {
        C7720c cVar = this.f33875c;
        return cVar != null && cVar.mo25773a(bVar);
    }

    /* renamed from: g */
    private void m42978g(C7720c cVar) {
        int i = cVar.f33879b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f33874b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f33874b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo25768c(C7720c cVar) {
        synchronized (this.f33873a) {
            if (this.f33875c == cVar || this.f33876d == cVar) {
                m42975a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public void mo25769e(C7719b bVar) {
        synchronized (this.f33873a) {
            if (m42977d(bVar)) {
                C7720c cVar = this.f33875c;
                if (!cVar.f33880c) {
                    cVar.f33880c = true;
                    this.f33874b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo25770f(C7719b bVar) {
        synchronized (this.f33873a) {
            if (m42977d(bVar)) {
                C7720c cVar = this.f33875c;
                if (cVar.f33880c) {
                    cVar.f33880c = false;
                    m42978g(cVar);
                }
            }
        }
    }
}
