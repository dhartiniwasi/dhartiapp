package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p246h7.C10412f;
import p257i8.C10559h;
import p257i8.C10561i;
import p266j7.C11495a;
import p266j7.C11496b;
import p285l8.C11765e;
import p285l8.C11766f;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11943f0;
import p302n7.C11966r;
import p311o7.C12024i;
import p367u8.C12707h;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ C11765e lambda$getComponents$0(C11940e eVar) {
        return new C7998c((C10412f) eVar.mo36263a(C10412f.class), eVar.mo36266d(C10561i.class), (ExecutorService) eVar.mo36269g(C11943f0.m57674a(C11495a.class, ExecutorService.class)), C12024i.m57922a((Executor) eVar.mo36269g(C11943f0.m57674a(C11496b.class, Executor.class))));
    }

    public List<C11934c<?>> getComponents() {
        return Arrays.asList(new C11934c[]{C11934c.m57617c(C11765e.class).mo36261h(LIBRARY_NAME).mo36256b(C11966r.m57744j(C10412f.class)).mo36256b(C11966r.m57743i(C10561i.class)).mo36256b(C11966r.m57745k(C11943f0.m57674a(C11495a.class, ExecutorService.class))).mo36256b(C11966r.m57745k(C11943f0.m57674a(C11496b.class, Executor.class))).mo36260f(C11766f.f44385a).mo36258d(), C10559h.m53091a(), C12707h.m60249b(LIBRARY_NAME, "17.1.2")});
    }
}
