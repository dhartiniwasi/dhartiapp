package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p017b5.C1791d;
import p017b5.C1793e;
import p017b5.C1816p0;
import p017b5.C1820r0;
import p033d5.C4141r;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class LifecycleCallback {

    /* renamed from: a */
    protected final C1793e f6083a;

    protected LifecycleCallback(C1793e eVar) {
        this.f6083a = eVar;
    }

    /* renamed from: c */
    public static C1793e m9130c(Activity activity) {
        return m9131d(new C1791d(activity));
    }

    /* renamed from: d */
    protected static C1793e m9131d(C1791d dVar) {
        if (dVar.mo6923d()) {
            return C1820r0.m8498H1(dVar.mo6921b());
        }
        if (dVar.mo6922c()) {
            return C1816p0.m8492f(dVar.mo6920a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C1793e getChimeraLifecycleFragmentImpl(C1791d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo8000a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity mo8001b() {
        Activity c = this.f6083a.mo6927c();
        C4141r.m28221k(c);
        return c;
    }

    /* renamed from: e */
    public void mo8002e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo8003f(Bundle bundle) {
    }

    /* renamed from: g */
    public void mo8004g() {
    }

    /* renamed from: h */
    public void mo8005h() {
    }

    /* renamed from: i */
    public void mo8006i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo8007j() {
    }

    /* renamed from: k */
    public void mo8008k() {
    }
}
