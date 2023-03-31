package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.C0788e;
import androidx.core.provider.C0795g;
import androidx.core.util.C0831h;
import androidx.emoji2.text.C1014e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.j */
/* compiled from: FontRequestEmojiCompatConfig */
public class C1031j extends C1014e.C1018c {

    /* renamed from: j */
    private static final C1032a f2774j = new C1032a();

    /* renamed from: androidx.emoji2.text.j$a */
    /* compiled from: FontRequestEmojiCompatConfig */
    public static class C1032a {
        /* renamed from: a */
        public Typeface mo3671a(Context context, C0795g.C0797b bVar) throws PackageManager.NameNotFoundException {
            return C0795g.m3571a(context, (CancellationSignal) null, new C0795g.C0797b[]{bVar});
        }

        /* renamed from: b */
        public C0795g.C0796a mo3672b(Context context, C0788e eVar) throws PackageManager.NameNotFoundException {
            return C0795g.m3572b(context, (CancellationSignal) null, eVar);
        }

        /* renamed from: c */
        public void mo3673c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    /* compiled from: FontRequestEmojiCompatConfig */
    private static class C1033b implements C1014e.C1022g {

        /* renamed from: a */
        private final Context f2775a;

        /* renamed from: b */
        private final C0788e f2776b;

        /* renamed from: c */
        private final C1032a f2777c;

        /* renamed from: d */
        private final Object f2778d = new Object();

        /* renamed from: e */
        private Handler f2779e;

        /* renamed from: f */
        private Executor f2780f;

        /* renamed from: g */
        private ThreadPoolExecutor f2781g;

        /* renamed from: h */
        C1014e.C1023h f2782h;

        /* renamed from: i */
        private ContentObserver f2783i;

        /* renamed from: j */
        private Runnable f2784j;

        C1033b(Context context, C0788e eVar, C1032a aVar) {
            C0831h.m3663g(context, "Context cannot be null");
            C0831h.m3663g(eVar, "FontRequest cannot be null");
            this.f2775a = context.getApplicationContext();
            this.f2776b = eVar;
            this.f2777c = aVar;
        }

        /* renamed from: b */
        private void m4617b() {
            synchronized (this.f2778d) {
                this.f2782h = null;
                ContentObserver contentObserver = this.f2783i;
                if (contentObserver != null) {
                    this.f2777c.mo3673c(this.f2775a, contentObserver);
                    this.f2783i = null;
                }
                Handler handler = this.f2779e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2784j);
                }
                this.f2779e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2781g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2780f = null;
                this.f2781g = null;
            }
        }

        /* renamed from: e */
        private C0795g.C0797b m4618e() {
            try {
                C0795g.C0796a b = this.f2777c.mo3672b(this.f2775a, this.f2776b);
                if (b.mo3176c() == 0) {
                    C0795g.C0797b[] b2 = b.mo3175b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo3176c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: a */
        public void mo3615a(C1014e.C1023h hVar) {
            C0831h.m3663g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2778d) {
                this.f2782h = hVar;
            }
            mo3675d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r4.f2778d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
            if (r1 != 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            androidx.core.p010os.C0777m.m3535a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f2777c.mo3671a(r4.f2775a, r0);
            r0 = androidx.core.graphics.C0755m.m3498f(r4.f2775a, (android.os.CancellationSignal) null, r0.mo3179d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
            if (r1 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
            r0 = androidx.emoji2.text.C1039m.m4637b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            androidx.core.p010os.C0777m.m3536b();
            r1 = r4.f2778d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r4.f2782h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
            if (r2 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
            r2.mo3618b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            m4617b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005c, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            androidx.core.p010os.C0777m.m3536b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
            monitor-enter(r4.f2778d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2 = r4.f2782h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0084, code lost:
            if (r2 != null) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
            r2.mo3617a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            m4617b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = m4618e();
            r1 = r0.mo3177b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3674c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f2778d
                monitor-enter(r0)
                androidx.emoji2.text.e$h r1 = r4.f2782h     // Catch:{ all -> 0x0091 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                androidx.core.provider.g$b r0 = r4.m4618e()     // Catch:{ all -> 0x007e }
                int r1 = r0.mo3177b()     // Catch:{ all -> 0x007e }
                r2 = 2
                if (r1 != r2) goto L_0x001e
                java.lang.Object r2 = r4.f2778d     // Catch:{ all -> 0x007e }
                monitor-enter(r2)     // Catch:{ all -> 0x007e }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                goto L_0x001e
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x001c:
                r0 = move-exception
                goto L_0x001a
            L_0x001e:
                if (r1 != 0) goto L_0x0062
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.p010os.C0777m.m3535a(r1)     // Catch:{ all -> 0x005d }
                androidx.emoji2.text.j$a r1 = r4.f2777c     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2775a     // Catch:{ all -> 0x005d }
                android.graphics.Typeface r1 = r1.mo3671a(r2, r0)     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2775a     // Catch:{ all -> 0x005d }
                r3 = 0
                android.net.Uri r0 = r0.mo3179d()     // Catch:{ all -> 0x005d }
                java.nio.ByteBuffer r0 = androidx.core.graphics.C0755m.m3498f(r2, r3, r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0055
                if (r1 == 0) goto L_0x0055
                androidx.emoji2.text.m r0 = androidx.emoji2.text.C1039m.m4637b(r1, r0)     // Catch:{ all -> 0x005d }
                androidx.core.p010os.C0777m.m3536b()     // Catch:{ all -> 0x007e }
                java.lang.Object r1 = r4.f2778d     // Catch:{ all -> 0x007e }
                monitor-enter(r1)     // Catch:{ all -> 0x007e }
                androidx.emoji2.text.e$h r2 = r4.f2782h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x004d
                r2.mo3618b(r0)     // Catch:{ all -> 0x0052 }
            L_0x004d:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.m4617b()     // Catch:{ all -> 0x007e }
                goto L_0x008d
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005d }
                throw r0     // Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception
                androidx.core.p010os.C0777m.m3536b()     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0062:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r2.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x007e }
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007e }
                r0.<init>(r1)     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                java.lang.Object r1 = r4.f2778d
                monitor-enter(r1)
                androidx.emoji2.text.e$h r2 = r4.f2782h     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x0089
                r2.mo3617a(r0)     // Catch:{ all -> 0x008e }
            L_0x0089:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                r4.m4617b()
            L_0x008d:
                return
            L_0x008e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r0
            L_0x0091:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1031j.C1033b.mo3674c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3675d() {
            synchronized (this.f2778d) {
                if (this.f2782h != null) {
                    if (this.f2780f == null) {
                        ThreadPoolExecutor b = C1006b.m4522b("emojiCompat");
                        this.f2781g = b;
                        this.f2780f = b;
                    }
                    this.f2780f.execute(new C1034k(this));
                }
            }
        }

        /* renamed from: f */
        public void mo3676f(Executor executor) {
            synchronized (this.f2778d) {
                this.f2780f = executor;
            }
        }
    }

    public C1031j(Context context, C0788e eVar) {
        super(new C1033b(context, eVar, f2774j));
    }

    /* renamed from: c */
    public C1031j mo3670c(Executor executor) {
        ((C1033b) mo3644a()).mo3676f(executor);
        return this;
    }
}
