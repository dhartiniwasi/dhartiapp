package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.core.p010os.C0777m;
import androidx.emoji2.text.C1014e;
import androidx.lifecycle.C1184c;
import androidx.lifecycle.C1186d;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1464a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p125r0.C5428a;

public class EmojiCompatInitializer implements C5428a<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    static class C1001a extends C1014e.C1018c {
        protected C1001a(Context context) {
            super(new C1002b(context));
            mo3645b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    static class C1002b implements C1014e.C1022g {

        /* renamed from: a */
        private final Context f2709a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        class C1003a extends C1014e.C1023h {

            /* renamed from: a */
            final /* synthetic */ C1014e.C1023h f2710a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f2711b;

            C1003a(C1014e.C1023h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2710a = hVar;
                this.f2711b = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo3617a(Throwable th) {
                try {
                    this.f2710a.mo3617a(th);
                } finally {
                    this.f2711b.shutdown();
                }
            }

            /* renamed from: b */
            public void mo3618b(C1039m mVar) {
                try {
                    this.f2710a.mo3618b(mVar);
                } finally {
                    this.f2711b.shutdown();
                }
            }
        }

        C1002b(Context context) {
            this.f2709a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo3615a(C1014e.C1023h hVar) {
            ThreadPoolExecutor b = C1006b.m4522b("EmojiCompatInitializer");
            b.execute(new C1025f(this, hVar, b));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void m4516d(C1014e.C1023h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C1031j a = C1008c.m4526a(this.f2709a);
                if (a != null) {
                    a.mo3670c(threadPoolExecutor);
                    a.mo3644a().mo3615a(new C1003a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.mo3617a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    static class C1004c implements Runnable {
        C1004c() {
        }

        public void run() {
            try {
                C0777m.m3535a("EmojiCompat.EmojiCompatInitializer.run");
                if (C1014e.m4548h()) {
                    C1014e.m4544b().mo3630k();
                }
            } finally {
                C0777m.m3536b();
            }
        }
    }

    /* renamed from: a */
    public List<Class<? extends C5428a<?>>> mo3604a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo3605b(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return Boolean.FALSE;
        }
        C1014e.m4547g(new C1001a(context));
        mo3607d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3607d(Context context) {
        final C1208j lifecycle = ((C1220n) C1464a.m6835e(context).mo5651f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo4399a(new C1186d() {
            /* renamed from: a */
            public void mo3609a(C1220n nVar) {
                EmojiCompatInitializer.this.mo3608e();
                lifecycle.mo4401c(this);
            }

            /* renamed from: b */
            public /* synthetic */ void mo3610b(C1220n nVar) {
                C1184c.m5370a(this, nVar);
            }

            /* renamed from: d */
            public /* synthetic */ void mo3611d(C1220n nVar) {
                C1184c.m5372c(this, nVar);
            }

            /* renamed from: f */
            public /* synthetic */ void mo3612f(C1220n nVar) {
                C1184c.m5374e(this, nVar);
            }

            /* renamed from: g */
            public /* synthetic */ void mo3613g(C1220n nVar) {
                C1184c.m5371b(this, nVar);
            }

            /* renamed from: h */
            public /* synthetic */ void mo3614h(C1220n nVar) {
                C1184c.m5373d(this, nVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3608e() {
        C1006b.m4524d().postDelayed(new C1004c(), 500);
    }
}
