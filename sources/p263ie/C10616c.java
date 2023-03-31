package p263ie;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p244ge.C10360d0;
import p244ge.C10362e;
import p244ge.C10367f0;
import p244ge.C10395w;
import p253he.C10539a;
import p282ke.C11636d;
import p282ke.C11638e;

/* renamed from: ie.c */
/* compiled from: CacheStrategy */
public final class C10616c {

    /* renamed from: a */
    public final C10360d0 f41692a;

    /* renamed from: b */
    public final C10367f0 f41693b;

    /* renamed from: ie.c$a */
    /* compiled from: CacheStrategy */
    public static class C10617a {

        /* renamed from: a */
        final long f41694a;

        /* renamed from: b */
        final C10360d0 f41695b;

        /* renamed from: c */
        final C10367f0 f41696c;

        /* renamed from: d */
        private Date f41697d;

        /* renamed from: e */
        private String f41698e;

        /* renamed from: f */
        private Date f41699f;

        /* renamed from: g */
        private String f41700g;

        /* renamed from: h */
        private Date f41701h;

        /* renamed from: i */
        private long f41702i;

        /* renamed from: j */
        private long f41703j;

        /* renamed from: k */
        private String f41704k;

        /* renamed from: l */
        private int f41705l = -1;

        public C10617a(long j, C10360d0 d0Var, C10367f0 f0Var) {
            this.f41694a = j;
            this.f41695b = d0Var;
            this.f41696c = f0Var;
            if (f0Var != null) {
                this.f41702i = f0Var.mo33302x();
                this.f41703j = f0Var.mo33299t();
                C10395w n = f0Var.mo33296n();
                int h = n.mo33405h();
                for (int i = 0; i < h; i++) {
                    String e = n.mo33402e(i);
                    String i2 = n.mo33407i(i);
                    if ("Date".equalsIgnoreCase(e)) {
                        this.f41697d = C11636d.m56724b(i2);
                        this.f41698e = i2;
                    } else if ("Expires".equalsIgnoreCase(e)) {
                        this.f41701h = C11636d.m56724b(i2);
                    } else if ("Last-Modified".equalsIgnoreCase(e)) {
                        this.f41699f = C11636d.m56724b(i2);
                        this.f41700g = i2;
                    } else if ("ETag".equalsIgnoreCase(e)) {
                        this.f41704k = i2;
                    } else if ("Age".equalsIgnoreCase(e)) {
                        this.f41705l = C11638e.m56729d(i2, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m53206a() {
            Date date = this.f41697d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f41703j - date.getTime());
            }
            int i = this.f41705l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f41703j;
            return j + (j2 - this.f41702i) + (this.f41694a - j2);
        }

        /* renamed from: b */
        private long m53207b() {
            long j;
            long j2;
            C10362e b = this.f41696c.mo33290b();
            if (b.mo33272d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b.mo33272d());
            }
            if (this.f41701h != null) {
                Date date = this.f41697d;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.f41703j;
                }
                long time = this.f41701h.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f41699f == null || this.f41696c.mo33301w().mo33260h().mo33433x() != null) {
                return 0;
            } else {
                Date date2 = this.f41697d;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.f41702i;
                }
                long time2 = j - this.f41699f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: d */
        private C10616c m53208d() {
            if (this.f41696c == null) {
                return new C10616c(this.f41695b, (C10367f0) null);
            }
            if (this.f41695b.mo33257e() && this.f41696c.mo33293g() == null) {
                return new C10616c(this.f41695b, (C10367f0) null);
            }
            if (!C10616c.m53205a(this.f41696c, this.f41695b)) {
                return new C10616c(this.f41695b, (C10367f0) null);
            }
            C10362e b = this.f41695b.mo33254b();
            if (b.mo33276h() || m53209e(this.f41695b)) {
                return new C10616c(this.f41695b, (C10367f0) null);
            }
            C10362e b2 = this.f41696c.mo33290b();
            long a = m53206a();
            long b3 = m53207b();
            if (b.mo33272d() != -1) {
                b3 = Math.min(b3, TimeUnit.SECONDS.toMillis((long) b.mo33272d()));
            }
            long j = 0;
            long millis = b.mo33274f() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo33274f()) : 0;
            if (!b2.mo33275g() && b.mo33273e() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo33273e());
            }
            if (!b2.mo33276h()) {
                long j2 = millis + a;
                if (j2 < j + b3) {
                    C10367f0.C10368a p = this.f41696c.mo33297p();
                    if (j2 >= b3) {
                        p.mo33303a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m53210f()) {
                        p.mo33303a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C10616c((C10360d0) null, p.mo33305c());
                }
            }
            String str = this.f41704k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f41699f != null) {
                str = this.f41700g;
            } else if (this.f41697d == null) {
                return new C10616c(this.f41695b, (C10367f0) null);
            } else {
                str = this.f41698e;
            }
            C10395w.C10396a f = this.f41695b.mo33256d().mo33404f();
            C10539a.f41555a.mo33229b(f, str2, str);
            return new C10616c(this.f41695b.mo33259g().mo33265d(f.mo33413d()).mo33262a(), this.f41696c);
        }

        /* renamed from: e */
        private static boolean m53209e(C10360d0 d0Var) {
            return (d0Var.mo33255c("If-Modified-Since") == null && d0Var.mo33255c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m53210f() {
            return this.f41696c.mo33290b().mo33272d() == -1 && this.f41701h == null;
        }

        /* renamed from: c */
        public C10616c mo33813c() {
            C10616c d = m53208d();
            return (d.f41692a == null || !this.f41695b.mo33254b().mo33278j()) ? d : new C10616c((C10360d0) null, (C10367f0) null);
        }
    }

    C10616c(C10360d0 d0Var, C10367f0 f0Var) {
        this.f41692a = d0Var;
        this.f41693b = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo33290b().mo33270b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m53205a(p244ge.C10367f0 r3, p244ge.C10360d0 r4) {
        /*
            int r0 = r3.mo33292f()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo33294h(r0)
            if (r0 != 0) goto L_0x005a
            ge.e r0 = r3.mo33290b()
            int r0 = r0.mo33272d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            ge.e r0 = r3.mo33290b()
            boolean r0 = r0.mo33271c()
            if (r0 != 0) goto L_0x005a
            ge.e r0 = r3.mo33290b()
            boolean r0 = r0.mo33270b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            ge.e r3 = r3.mo33290b()
            boolean r3 = r3.mo33277i()
            if (r3 != 0) goto L_0x006f
            ge.e r3 = r4.mo33254b()
            boolean r3 = r3.mo33277i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p263ie.C10616c.m53205a(ge.f0, ge.d0):boolean");
    }
}
