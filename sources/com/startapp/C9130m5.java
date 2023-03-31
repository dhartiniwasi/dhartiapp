package com.startapp;

import com.startapp.sdk.jobs.JobRequest;

/* renamed from: com.startapp.m5 */
/* compiled from: Sta */
public class C9130m5 {

    /* renamed from: a */
    public final C9116l9 f37297a;

    /* renamed from: b */
    public final C9116l9 f37298b;

    public C9130m5(C9116l9 l9Var, C9116l9 l9Var2) {
        this.f37297a = l9Var;
        this.f37298b = l9Var2;
    }

    /* renamed from: a */
    public boolean mo29688a(JobRequest... jobRequestArr) {
        boolean z = true;
        for (JobRequest jobRequest : jobRequestArr) {
            if (jobRequest.f39130d) {
                if (jobRequest.mo31217a(this.f37298b)) {
                }
            } else if (jobRequest.mo31217a(this.f37297a)) {
            }
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo29687a(int i) {
        if (!this.f37298b.mo29672a(i)) {
            return this.f37297a.mo29672a(i);
        }
        return true;
    }
}
