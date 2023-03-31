package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3792u6 {

    /* renamed from: a */
    private final Class f22767a;

    /* renamed from: b */
    private ConcurrentMap f22768b = new ConcurrentHashMap();

    /* renamed from: c */
    private C3825v6 f22769c;

    /* renamed from: d */
    private C3635pe f22770d;

    /* synthetic */ C3792u6(Class cls, C3759t6 t6Var) {
        this.f22767a = cls;
        this.f22770d = C3635pe.f22506b;
    }

    /* renamed from: e */
    private final C3792u6 m27105e(Object obj, C3870wj wjVar, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.f22768b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (wjVar.mo17000J() == 3) {
            ConcurrentMap concurrentMap = this.f22768b;
            Integer valueOf = Integer.valueOf(wjVar.mo17001z());
            if (wjVar.mo16998D() == C3674qk.RAW) {
                valueOf = null;
            }
            C3132a6 a = C3894xb.m27370b().mo17038a(C3402ic.m25793a(wjVar.mo16997A().mo16226E(), wjVar.mo16997A().mo16225D(), wjVar.mo16997A().mo16224A(), wjVar.mo16998D(), valueOf), C3331g7.m25647a());
            int ordinal = wjVar.mo16998D().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = C3856w5.f22862a;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(wjVar.mo17001z()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(wjVar.mo17001z()).array();
            }
            C3825v6 v6Var = new C3825v6(obj, bArr, wjVar.mo17000J(), wjVar.mo16998D(), wjVar.mo17001z(), a);
            ArrayList arrayList = new ArrayList();
            arrayList.add(v6Var);
            C3889x6 x6Var = new C3889x6(v6Var.mo16938f(), (C3857w6) null);
            List list = (List) concurrentMap.put(x6Var, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(v6Var);
                concurrentMap.put(x6Var, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.f22769c == null) {
                    this.f22769c = v6Var;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    /* renamed from: a */
    public final C3792u6 mo16862a(Object obj, C3870wj wjVar) throws GeneralSecurityException {
        m27105e(obj, wjVar, true);
        return this;
    }

    /* renamed from: b */
    public final C3792u6 mo16863b(Object obj, C3870wj wjVar) throws GeneralSecurityException {
        m27105e(obj, wjVar, false);
        return this;
    }

    /* renamed from: c */
    public final C3792u6 mo16864c(C3635pe peVar) {
        if (this.f22768b != null) {
            this.f22770d = peVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    /* renamed from: d */
    public final C3953z6 mo16865d() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f22768b;
        if (concurrentMap != null) {
            C3953z6 z6Var = new C3953z6(concurrentMap, this.f22769c, this.f22770d, this.f22767a, (C3921y6) null);
            this.f22768b = null;
            return z6Var;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
