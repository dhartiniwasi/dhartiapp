package p033d5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: d5.r1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C4143r1 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C4146s1 f23389a;

    /* synthetic */ C4143r1(C4146s1 s1Var, C4140q1 q1Var) {
        this.f23389a = s1Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f23389a.f23393f) {
                C4132o1 o1Var = (C4132o1) message.obj;
                C4136p1 p1Var = (C4136p1) this.f23389a.f23393f.get(o1Var);
                if (p1Var != null && p1Var.mo17453i()) {
                    if (p1Var.mo17454j()) {
                        p1Var.mo17451g("GmsClientSupervisor");
                    }
                    this.f23389a.f23393f.remove(o1Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f23389a.f23393f) {
                C4132o1 o1Var2 = (C4132o1) message.obj;
                C4136p1 p1Var2 = (C4136p1) this.f23389a.f23393f.get(o1Var2);
                if (p1Var2 != null && p1Var2.mo17445a() == 3) {
                    String valueOf = String.valueOf(o1Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b = p1Var2.mo17446b();
                    if (b == null) {
                        b = o1Var2.mo17436b();
                    }
                    if (b == null) {
                        String d = o1Var2.mo17438d();
                        C4141r.m28221k(d);
                        b = new ComponentName(d, "unknown");
                    }
                    p1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
