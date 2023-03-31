package p170y0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: y0.v */
/* compiled from: WorkerFactory */
public abstract class C6114v {

    /* renamed from: a */
    private static final String f29515a = C6094j.m35719f("WorkerFactory");

    /* renamed from: y0.v$a */
    /* compiled from: WorkerFactory */
    class C6115a extends C6114v {
        C6115a() {
        }

        /* renamed from: a */
        public ListenableWorker mo20953a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static C6114v m35760c() {
        return new C6115a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo20953a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker mo20954b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = mo20953a(context, str, workerParameters);
        if (a == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                C6094j c = C6094j.m35717c();
                String str2 = f29515a;
                c.mo20922b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    C6094j c2 = C6094j.m35717c();
                    String str3 = f29515a;
                    c2.mo20922b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.isUsed()) {
            return a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
