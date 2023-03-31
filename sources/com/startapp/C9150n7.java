package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.networkTest.startapp.NetworkTester;
import com.startapp.sdk.jobs.C9529b;

/* renamed from: com.startapp.n7 */
/* compiled from: Sta */
public final class C9150n7 extends C9529b {

    /* renamed from: com.startapp.n7$a */
    /* compiled from: Sta */
    public class C9151a implements NetworkTester.C9175b {
        public C9151a() {
        }

        /* renamed from: a */
        public void mo29069a(boolean z) {
            C9150n7.this.callback.mo31223a(C9150n7.this, z);
        }
    }

    public C9150n7(Context context, C9529b.C9530a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        NetworkTester.runTests(this.context, new C9151a());
    }
}
