package com.startapp;

import p201ca.C6841a;

/* renamed from: com.startapp.h6 */
/* compiled from: Sta */
public final class C8999h6 {

    /* renamed from: a */
    public final C9267rd f36899a;

    public C8999h6(C9267rd rdVar) {
        this.f36899a = rdVar;
    }

    /* renamed from: a */
    public static C8999h6 m48661a(C9180o oVar) {
        C9267rd rdVar = (C9267rd) oVar;
        if (!rdVar.mo29887e()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (rdVar.f38169f) {
            throw new IllegalStateException("AdSession is started");
        } else if (!rdVar.f38170g) {
            C6841a aVar = rdVar.f38168e;
            if (aVar.f31485c == null) {
                C8999h6 h6Var = new C8999h6(rdVar);
                aVar.f31485c = h6Var;
                return h6Var;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public final void mo29449a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }
}
