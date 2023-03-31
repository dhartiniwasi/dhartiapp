package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.C1580c;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p064i1.C4647a;
import p170y0.C6088e;
import p170y0.C6114v;
import p228f7.C10139c;

public abstract class ListenableWorker {

    /* renamed from: a */
    private Context f4373a;

    /* renamed from: b */
    private WorkerParameters f4374b;

    /* renamed from: c */
    private volatile boolean f4375c;

    /* renamed from: d */
    private boolean f4376d;

    /* renamed from: e */
    private boolean f4377e;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C1526a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C1527a extends C1526a {

            /* renamed from: a */
            private final C1536b f4378a;

            public C1527a() {
                this(C1536b.f4423c);
            }

            /* renamed from: e */
            public C1536b mo6259e() {
                return this.f4378a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1527a.class != obj.getClass()) {
                    return false;
                }
                return this.f4378a.equals(((C1527a) obj).f4378a);
            }

            public int hashCode() {
                return (C1527a.class.getName().hashCode() * 31) + this.f4378a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4378a + '}';
            }

            public C1527a(C1536b bVar) {
                this.f4378a = bVar;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C1528b extends C1526a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C1528b.class == obj.getClass();
            }

            public int hashCode() {
                return C1528b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C1529c extends C1526a {

            /* renamed from: a */
            private final C1536b f4379a;

            public C1529c() {
                this(C1536b.f4423c);
            }

            /* renamed from: e */
            public C1536b mo6266e() {
                return this.f4379a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1529c.class != obj.getClass()) {
                    return false;
                }
                return this.f4379a.equals(((C1529c) obj).f4379a);
            }

            public int hashCode() {
                return (C1529c.class.getName().hashCode() * 31) + this.f4379a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4379a + '}';
            }

            public C1529c(C1536b bVar) {
                this.f4379a = bVar;
            }
        }

        C1526a() {
        }

        /* renamed from: a */
        public static C1526a m7083a() {
            return new C1527a();
        }

        /* renamed from: b */
        public static C1526a m7084b() {
            return new C1528b();
        }

        /* renamed from: c */
        public static C1526a m7085c() {
            return new C1529c();
        }

        /* renamed from: d */
        public static C1526a m7086d(C1536b bVar) {
            return new C1529c(bVar);
        }
    }

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f4373a = context;
            this.f4374b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.f4373a;
    }

    public Executor getBackgroundExecutor() {
        return this.f4374b.mo6273a();
    }

    public C10139c<C6088e> getForegroundInfoAsync() {
        C1580c u = C1580c.m7309u();
        u.mo6381r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u;
    }

    public final UUID getId() {
        return this.f4374b.mo6275c();
    }

    public final C1536b getInputData() {
        return this.f4374b.mo6276d();
    }

    public final Network getNetwork() {
        return this.f4374b.mo6277e();
    }

    public final int getRunAttemptCount() {
        return this.f4374b.mo6279g();
    }

    public final Set<String> getTags() {
        return this.f4374b.mo6280h();
    }

    public C4647a getTaskExecutor() {
        return this.f4374b.mo6281i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f4374b.mo6282j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f4374b.mo6283k();
    }

    public C6114v getWorkerFactory() {
        return this.f4374b.mo6284l();
    }

    public boolean isRunInForeground() {
        return this.f4377e;
    }

    public final boolean isStopped() {
        return this.f4375c;
    }

    public final boolean isUsed() {
        return this.f4376d;
    }

    public void onStopped() {
    }

    public final C10139c<Void> setForegroundAsync(C6088e eVar) {
        this.f4377e = true;
        return this.f4374b.mo6274b().mo17961a(getApplicationContext(), getId(), eVar);
    }

    public C10139c<Void> setProgressAsync(C1536b bVar) {
        return this.f4374b.mo6278f().mo17963a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z) {
        this.f4377e = z;
    }

    public final void setUsed() {
        this.f4376d = true;
    }

    public abstract C10139c<C1526a> startWork();

    public final void stop() {
        this.f4375c = true;
        onStopped();
    }
}
