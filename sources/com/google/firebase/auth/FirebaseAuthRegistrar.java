package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p246h7.C10412f;
import p257i8.C10559h;
import p257i8.C10561i;
import p293m7.C11806b;
import p293m7.C11835k1;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11966r;
import p367u8.C12707h;

@Keep
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(C11940e eVar) {
        return new C11835k1((C10412f) eVar.mo36263a(C10412f.class), eVar.mo36266d(C10561i.class));
    }

    @Keep
    public List<C11934c<?>> getComponents() {
        return Arrays.asList(new C11934c[]{C11934c.m57618d(FirebaseAuth.class, C11806b.class).mo36256b(C11966r.m57744j(C10412f.class)).mo36256b(C11966r.m57746l(C10561i.class)).mo36260f(C7809h2.f34135a).mo36259e().mo36258d(), C10559h.m53091a(), C12707h.m60249b("fire-auth", "21.1.0")});
    }
}
