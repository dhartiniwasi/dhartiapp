package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3262e4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3672qi f21974a;

    /* renamed from: b */
    private final C3228d3 f21975b;

    private C3262e4(C3228d3 d3Var) {
        C3638ph phVar = C3638ph.f22508b;
        this.f21975b = d3Var;
        this.f21974a = phVar;
    }

    /* renamed from: b */
    public static C3262e4 m25464b(char c) {
        return new C3262e4(new C3158b(new C3570nf('.')));
    }

    /* renamed from: c */
    public static C3262e4 m25465c(String str) {
        C3774tl a = C3748ss.m26943a("[.-]");
        if (!((C3842vn) a.mo16814a("")).f22817a.matches()) {
            return new C3262e4(new C3226d1(a));
        }
        throw new IllegalArgumentException(C3296f5.m25550b("The pattern may not match the empty string: %s", a));
    }

    /* renamed from: d */
    public final List mo15981d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator a = this.f21975b.mo15759a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a.hasNext()) {
            arrayList.add((String) a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
