package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.se */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3734se {

    /* renamed from: a */
    private ArrayList f22680a = new ArrayList();

    /* renamed from: b */
    private C3635pe f22681b = C3635pe.f22506b;

    /* renamed from: c */
    private Integer f22682c = null;

    /* renamed from: a */
    public final C3734se mo16753a(C3429j6 j6Var, int i, C3726s6 s6Var) {
        ArrayList arrayList = this.f22680a;
        if (arrayList != null) {
            arrayList.add(new C3800ue(j6Var, i, s6Var, (C3767te) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    /* renamed from: b */
    public final C3734se mo16754b(C3635pe peVar) {
        if (this.f22680a != null) {
            this.f22681b = peVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    /* renamed from: c */
    public final C3734se mo16755c(int i) {
        if (this.f22680a != null) {
            this.f22682c = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    /* renamed from: d */
    public final C3865we mo16756d() throws GeneralSecurityException {
        if (this.f22680a != null) {
            Integer num = this.f22682c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f22680a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((C3800ue) arrayList.get(i)).mo16872a() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            C3865we weVar = new C3865we(this.f22681b, Collections.unmodifiableList(this.f22680a), this.f22682c, (C3833ve) null);
            this.f22680a = null;
            return weVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
