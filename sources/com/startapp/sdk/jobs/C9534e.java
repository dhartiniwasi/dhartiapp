package com.startapp.sdk.jobs;

import com.startapp.C9116l9;
import com.startapp.sdk.jobs.JobRequest;

/* renamed from: com.startapp.sdk.jobs.e */
/* compiled from: Sta */
public final class C9534e extends JobRequest {

    /* renamed from: e */
    public final Long f39147e;

    /* renamed from: com.startapp.sdk.jobs.e$a */
    /* compiled from: Sta */
    public static final class C9535a extends JobRequest.C9525a<C9535a> {

        /* renamed from: d */
        public Long f39148d;

        public C9535a(Class<? extends C9529b> cls) {
            super(cls);
        }
    }

    public C9534e(C9535a aVar) {
        super(aVar);
        this.f39147e = aVar.f39148d;
    }

    /* renamed from: a */
    public boolean mo31217a(C9116l9 l9Var) {
        return l9Var.mo29673a(this, this.f39147e.longValue());
    }
}
