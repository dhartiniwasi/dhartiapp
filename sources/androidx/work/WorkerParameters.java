package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p064i1.C4647a;
import p170y0.C6089f;
import p170y0.C6106o;
import p170y0.C6114v;

public final class WorkerParameters {

    /* renamed from: a */
    private UUID f4383a;

    /* renamed from: b */
    private C1536b f4384b;

    /* renamed from: c */
    private Set<String> f4385c;

    /* renamed from: d */
    private C1531a f4386d;

    /* renamed from: e */
    private int f4387e;

    /* renamed from: f */
    private Executor f4388f;

    /* renamed from: g */
    private C4647a f4389g;

    /* renamed from: h */
    private C6114v f4390h;

    /* renamed from: i */
    private C6106o f4391i;

    /* renamed from: j */
    private C6089f f4392j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1531a {

        /* renamed from: a */
        public List<String> f4393a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f4394b = Collections.emptyList();

        /* renamed from: c */
        public Network f4395c;
    }

    public WorkerParameters(UUID uuid, C1536b bVar, Collection<String> collection, C1531a aVar, int i, Executor executor, C4647a aVar2, C6114v vVar, C6106o oVar, C6089f fVar) {
        this.f4383a = uuid;
        this.f4384b = bVar;
        this.f4385c = new HashSet(collection);
        this.f4386d = aVar;
        this.f4387e = i;
        this.f4388f = executor;
        this.f4389g = aVar2;
        this.f4390h = vVar;
        this.f4391i = oVar;
        this.f4392j = fVar;
    }

    /* renamed from: a */
    public Executor mo6273a() {
        return this.f4388f;
    }

    /* renamed from: b */
    public C6089f mo6274b() {
        return this.f4392j;
    }

    /* renamed from: c */
    public UUID mo6275c() {
        return this.f4383a;
    }

    /* renamed from: d */
    public C1536b mo6276d() {
        return this.f4384b;
    }

    /* renamed from: e */
    public Network mo6277e() {
        return this.f4386d.f4395c;
    }

    /* renamed from: f */
    public C6106o mo6278f() {
        return this.f4391i;
    }

    /* renamed from: g */
    public int mo6279g() {
        return this.f4387e;
    }

    /* renamed from: h */
    public Set<String> mo6280h() {
        return this.f4385c;
    }

    /* renamed from: i */
    public C4647a mo6281i() {
        return this.f4389g;
    }

    /* renamed from: j */
    public List<String> mo6282j() {
        return this.f4386d.f4393a;
    }

    /* renamed from: k */
    public List<Uri> mo6283k() {
        return this.f4386d.f4394b;
    }

    /* renamed from: l */
    public C6114v mo6284l() {
        return this.f4390h;
    }
}
