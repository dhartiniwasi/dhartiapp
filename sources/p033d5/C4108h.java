package p033d5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: d5.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C4108h {

    /* renamed from: a */
    private static int f23323a = 4225;

    /* renamed from: b */
    private static final Object f23324b = new Object();

    /* renamed from: c */
    private static C4146s1 f23325c = null;

    /* renamed from: d */
    static HandlerThread f23326d = null;

    /* renamed from: e */
    private static boolean f23327e = false;

    /* renamed from: a */
    public static int m28148a() {
        return f23323a;
    }

    /* renamed from: b */
    public static C4108h m28149b(Context context) {
        Looper looper;
        synchronized (f23324b) {
            if (f23325c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f23327e) {
                    looper = m28150c().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f23325c = new C4146s1(applicationContext, looper);
            }
        }
        return f23325c;
    }

    /* renamed from: c */
    public static HandlerThread m28150c() {
        synchronized (f23324b) {
            HandlerThread handlerThread = f23326d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f23326d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f23326d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo17397d(C4132o1 o1Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void mo17398e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo17397d(new C4132o1(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo17399f(C4132o1 o1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
