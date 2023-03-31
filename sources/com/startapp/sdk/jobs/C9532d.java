package com.startapp.sdk.jobs;

import com.startapp.C9116l9;
import com.startapp.sdk.jobs.JobRequest;

/* renamed from: com.startapp.sdk.jobs.d */
/* compiled from: Sta */
public final class C9532d extends JobRequest {

    /* renamed from: e */
    public final Long f39145e;

    /* renamed from: com.startapp.sdk.jobs.d$a */
    /* compiled from: Sta */
    public static final class C9533a extends JobRequest.C9525a<C9533a> {

        /* renamed from: d */
        public Long f39146d;

        public C9533a(Class<? extends C9529b> cls) {
            super(cls);
        }

        /* renamed from: a */
        public JobRequest.C9525a mo31229a() {
            return this;
        }
    }

    public C9532d(C9533a aVar) {
        super(aVar);
        this.f39145e = aVar.f39146d;
    }

    /* renamed from: a */
    public boolean mo31217a(C9116l9 l9Var) {
        return l9Var.mo29674a(this, this.f39145e, (Long) null);
    }
}
