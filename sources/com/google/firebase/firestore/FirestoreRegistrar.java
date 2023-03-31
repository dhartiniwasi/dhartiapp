package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p238g8.C10265p;
import p246h7.C10412f;
import p246h7.C10423n;
import p257i8.C10562j;
import p284l7.C11760b;
import p293m7.C11806b;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11966r;
import p367u8.C12707h;
import p367u8.C12709i;

@Keep
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* access modifiers changed from: private */
    public static /* synthetic */ C7893a0 lambda$getComponents$0(C11940e eVar) {
        return new C7893a0((Context) eVar.mo36263a(Context.class), (C10412f) eVar.mo36263a(C10412f.class), eVar.mo36271i(C11806b.class), eVar.mo36271i(C11760b.class), new C10265p(eVar.mo36266d(C12709i.class), eVar.mo36266d(C10562j.class), (C10423n) eVar.mo36263a(C10423n.class)));
    }

    @Keep
    public List<C11934c<?>> getComponents() {
        return Arrays.asList(new C11934c[]{C11934c.m57617c(C7893a0.class).mo36261h(LIBRARY_NAME).mo36256b(C11966r.m57744j(C10412f.class)).mo36256b(C11966r.m57744j(Context.class)).mo36256b(C11966r.m57743i(C10562j.class)).mo36256b(C11966r.m57743i(C12709i.class)).mo36256b(C11966r.m57740a(C11806b.class)).mo36256b(C11966r.m57740a(C11760b.class)).mo36256b(C11966r.m57742h(C10423n.class)).mo36260f(C7897b0.f34316a).mo36258d(), C12707h.m60249b(LIBRARY_NAME, "24.4.3")});
    }
}
