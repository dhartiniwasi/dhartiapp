package p170y0;

import android.os.Build;
import androidx.work.C1536b;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p050g1.C4329p;

/* renamed from: y0.u */
/* compiled from: WorkRequest */
public abstract class C6112u {

    /* renamed from: a */
    private UUID f29507a;

    /* renamed from: b */
    private C4329p f29508b;

    /* renamed from: c */
    private Set<String> f29509c;

    /* renamed from: y0.u$a */
    /* compiled from: WorkRequest */
    public static abstract class C6113a<B extends C6113a<?, ?>, W extends C6112u> {

        /* renamed from: a */
        boolean f29510a = false;

        /* renamed from: b */
        UUID f29511b = UUID.randomUUID();

        /* renamed from: c */
        C4329p f29512c;

        /* renamed from: d */
        Set<String> f29513d = new HashSet();

        /* renamed from: e */
        Class<? extends ListenableWorker> f29514e;

        C6113a(Class<? extends ListenableWorker> cls) {
            this.f29514e = cls;
            this.f29512c = new C4329p(this.f29511b.toString(), cls.getName());
            mo20947a(cls.getName());
        }

        /* renamed from: a */
        public final B mo20947a(String str) {
            this.f29513d.add(str);
            return mo20927d();
        }

        /* renamed from: b */
        public final W mo20948b() {
            W c = mo20926c();
            C6083b bVar = this.f29512c.f24224j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && bVar.mo20885e()) || bVar.mo20887f() || bVar.mo20888g() || (i >= 23 && bVar.mo20889h());
            C4329p pVar = this.f29512c;
            if (pVar.f24231q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (pVar.f24221g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f29511b = UUID.randomUUID();
            C4329p pVar2 = new C4329p(this.f29512c);
            this.f29512c = pVar2;
            pVar2.f24215a = this.f29511b.toString();
            return c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract W mo20926c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract B mo20927d();

        /* renamed from: e */
        public final B mo20949e(C6082a aVar, long j, TimeUnit timeUnit) {
            this.f29510a = true;
            C4329p pVar = this.f29512c;
            pVar.f24226l = aVar;
            pVar.mo17747e(timeUnit.toMillis(j));
            return mo20927d();
        }

        /* renamed from: f */
        public final B mo20950f(C6083b bVar) {
            this.f29512c.f24224j = bVar;
            return mo20927d();
        }

        /* renamed from: g */
        public B mo20951g(long j, TimeUnit timeUnit) {
            this.f29512c.f24221g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f29512c.f24221g) {
                return mo20927d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        /* renamed from: h */
        public final B mo20952h(C1536b bVar) {
            this.f29512c.f24219e = bVar;
            return mo20927d();
        }
    }

    protected C6112u(UUID uuid, C4329p pVar, Set<String> set) {
        this.f29507a = uuid;
        this.f29508b = pVar;
        this.f29509c = set;
    }

    /* renamed from: a */
    public UUID mo20943a() {
        return this.f29507a;
    }

    /* renamed from: b */
    public String mo20944b() {
        return this.f29507a.toString();
    }

    /* renamed from: c */
    public Set<String> mo20945c() {
        return this.f29509c;
    }

    /* renamed from: d */
    public C4329p mo20946d() {
        return this.f29508b;
    }
}
