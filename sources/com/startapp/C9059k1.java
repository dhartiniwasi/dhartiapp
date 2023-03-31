package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.k1 */
/* compiled from: Sta */
public class C9059k1 extends C8825a8<String> implements C9620w7 {

    /* renamed from: j */
    public final C9441e f37031j;

    /* renamed from: k */
    public final C8923e2 f37032k;

    /* renamed from: l */
    public final C8908d3<BluetoothConfig> f37033l;

    public C9059k1(Context context, C9441e eVar, C9441e eVar2, C8923e2 e2Var, C9256r3 r3Var, C8908d3<BluetoothConfig> d3Var) {
        super(context, eVar2, r3Var, "26787005dc4a1477", "c8ef3e50475fc527");
        this.f37031j = eVar;
        this.f37032k = e2Var;
        this.f37033l = d3Var;
    }

    /* renamed from: a */
    public Object mo29087a(String str) {
        return str;
    }

    /* renamed from: a */
    public void mo29232a(Object obj) {
        mo29088b(obj != null ? obj.toString() : null);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo29309c() {
        return "";
    }

    /* renamed from: d */
    public long mo29090d() {
        BluetoothConfig call = this.f37033l.call();
        if (call != null) {
            return call.mo30962b();
        }
        return 0;
    }

    /* renamed from: f */
    public boolean mo29092f() {
        BluetoothConfig call;
        if (!this.f37032k.mo29324c() || (call = this.f37033l.call()) == null || !call.mo30964d()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo29093g() {
        if (C8837b0.m48304a(this.f36944a, "android.permission.BLUETOOTH")) {
            Context context = this.f36944a;
            ComponentLocator.m50248a(context).mo31175k().execute(new C9041j3(context, this.f37031j, this).f39427d);
        }
    }
}
