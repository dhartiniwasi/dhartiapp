package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p084l1.C4907g;
import p246h7.C10412f;
import p257i8.C10562j;
import p267j8.C11499a;
import p285l8.C11765e;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11966r;
import p367u8.C12707h;
import p367u8.C12709i;
import p395x7.C12980d;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C11940e eVar) {
        return new FirebaseMessaging((C10412f) eVar.mo36263a(C10412f.class), (C11499a) eVar.mo36263a(C11499a.class), eVar.mo36266d(C12709i.class), eVar.mo36266d(C10562j.class), (C11765e) eVar.mo36263a(C11765e.class), (C4907g) eVar.mo36263a(C4907g.class), (C12980d) eVar.mo36263a(C12980d.class));
    }

    @Keep
    public List<C11934c<?>> getComponents() {
        return Arrays.asList(new C11934c[]{C11934c.m57617c(FirebaseMessaging.class).mo36261h(LIBRARY_NAME).mo36256b(C11966r.m57744j(C10412f.class)).mo36256b(C11966r.m57742h(C11499a.class)).mo36256b(C11966r.m57743i(C12709i.class)).mo36256b(C11966r.m57743i(C10562j.class)).mo36256b(C11966r.m57742h(C4907g.class)).mo36256b(C11966r.m57744j(C11765e.class)).mo36256b(C11966r.m57744j(C12980d.class)).mo36260f(C8018b0.f34626a).mo36257c().mo36258d(), C12707h.m60249b(LIBRARY_NAME, "23.1.1")});
    }
}
