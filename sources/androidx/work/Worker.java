package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1580c;
import p228f7.C10139c;

public abstract class Worker extends ListenableWorker {

    /* renamed from: f */
    C1580c<ListenableWorker.C1526a> f4381f;

    /* renamed from: androidx.work.Worker$a */
    class C1530a implements Runnable {
        C1530a() {
        }

        public void run() {
            try {
                Worker.this.f4381f.mo6380q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f4381f.mo6381r(th);
            }
        }
    }

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.C1526a doWork();

    public final C10139c<ListenableWorker.C1526a> startWork() {
        this.f4381f = C1580c.m7309u();
        getBackgroundExecutor().execute(new C1530a());
        return this.f4381f;
    }
}
