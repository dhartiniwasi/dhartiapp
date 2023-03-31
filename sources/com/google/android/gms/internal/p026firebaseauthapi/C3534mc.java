package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3534mc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f22357a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f22358b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f22359c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f22360d;

    public C3534mc() {
        this.f22357a = new HashMap();
        this.f22358b = new HashMap();
        this.f22359c = new HashMap();
        this.f22360d = new HashMap();
    }

    /* renamed from: a */
    public final C3534mc mo16389a(C3269eb ebVar) throws GeneralSecurityException {
        C3600oc ocVar = new C3600oc(ebVar.mo15985d(), ebVar.mo15984c(), (C3567nc) null);
        if (this.f22358b.containsKey(ocVar)) {
            C3269eb ebVar2 = (C3269eb) this.f22358b.get(ocVar);
            if (!ebVar2.equals(ebVar) || !ebVar.equals(ebVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ocVar.toString()));
            }
        } else {
            this.f22358b.put(ocVar, ebVar);
        }
        return this;
    }

    /* renamed from: b */
    public final C3534mc mo16390b(C3401ib ibVar) throws GeneralSecurityException {
        C3666qc qcVar = new C3666qc(ibVar.mo16166b(), ibVar.mo16167c(), (C3633pc) null);
        if (this.f22357a.containsKey(qcVar)) {
            C3401ib ibVar2 = (C3401ib) this.f22357a.get(qcVar);
            if (!ibVar2.equals(ibVar) || !ibVar.equals(ibVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(qcVar.toString()));
            }
        } else {
            this.f22357a.put(qcVar, ibVar);
        }
        return this;
    }

    /* renamed from: c */
    public final C3534mc mo16391c(C3171bc bcVar) throws GeneralSecurityException {
        C3600oc ocVar = new C3600oc(bcVar.mo15798c(), bcVar.mo15797b(), (C3567nc) null);
        if (this.f22360d.containsKey(ocVar)) {
            C3171bc bcVar2 = (C3171bc) this.f22360d.get(ocVar);
            if (!bcVar2.equals(bcVar) || !bcVar.equals(bcVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ocVar.toString()));
            }
        } else {
            this.f22360d.put(ocVar, bcVar);
        }
        return this;
    }

    /* renamed from: d */
    public final C3534mc mo16392d(C3303fc fcVar) throws GeneralSecurityException {
        C3666qc qcVar = new C3666qc(fcVar.mo16024b(), fcVar.mo16025c(), (C3633pc) null);
        if (this.f22359c.containsKey(qcVar)) {
            C3303fc fcVar2 = (C3303fc) this.f22359c.get(qcVar);
            if (!fcVar2.equals(fcVar) || !fcVar.equals(fcVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(qcVar.toString()));
            }
        } else {
            this.f22359c.put(qcVar, fcVar);
        }
        return this;
    }

    public C3534mc(C3732sc scVar) {
        this.f22357a = new HashMap(scVar.f22675a);
        this.f22358b = new HashMap(scVar.f22676b);
        this.f22359c = new HashMap(scVar.f22677c);
        this.f22360d = new HashMap(scVar.f22678d);
    }
}
