package com.google.firebase.iid;

import java.util.concurrent.CountDownLatch;
import p218e6.C9965d;
import p218e6.C9975i;

/* renamed from: com.google.firebase.iid.e */
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class C7973e implements C9965d {

    /* renamed from: a */
    private final CountDownLatch f34487a;

    C7973e(CountDownLatch countDownLatch) {
        this.f34487a = countDownLatch;
    }

    /* renamed from: a */
    public void mo283a(C9975i iVar) {
        this.f34487a.countDown();
    }
}
