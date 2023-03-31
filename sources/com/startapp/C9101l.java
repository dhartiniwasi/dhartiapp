package com.startapp;

import p201ca.C6841a;

/* renamed from: com.startapp.l */
/* compiled from: Sta */
public final class C9101l {

    /* renamed from: a */
    public final C9267rd f37233a;

    public C9101l(C9267rd rdVar) {
        this.f37233a = rdVar;
    }

    /* renamed from: a */
    public static C9101l m48896a(C9180o oVar) {
        C9267rd rdVar = (C9267rd) oVar;
        C6841a aVar = rdVar.f38168e;
        if (aVar.f31484b != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        } else if (!rdVar.f38170g) {
            C9101l lVar = new C9101l(rdVar);
            aVar.f31484b = lVar;
            return lVar;
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
