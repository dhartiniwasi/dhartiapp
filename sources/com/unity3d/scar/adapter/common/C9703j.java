package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p389wa.C12937a;
import p398xa.C12987a;
import p398xa.C12988b;

/* renamed from: com.unity3d.scar.adapter.common.j */
/* compiled from: ScarAdapterBase */
public abstract class C9703j implements C9699f {

    /* renamed from: a */
    protected C12988b f39608a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public Map<String, C12937a> f39609b = new ConcurrentHashMap();

    /* renamed from: c */
    protected C12937a f39610c;

    /* renamed from: d */
    protected C9697d f39611d;

    /* renamed from: com.unity3d.scar.adapter.common.j$a */
    /* compiled from: ScarAdapterBase */
    class C9704a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f39612a;

        C9704a(Activity activity) {
            this.f39612a = activity;
        }

        public void run() {
            C9703j.this.f39610c.mo22952a(this.f39612a);
        }
    }

    public C9703j(C9697d dVar) {
        this.f39611d = dVar;
    }

    /* renamed from: a */
    public void mo31572a(Context context, String[] strArr, String[] strArr2, C12987a aVar) {
        this.f39608a.mo22122a(context, strArr, strArr2, aVar);
    }

    /* renamed from: c */
    public void mo31573c(Activity activity, String str, String str2) {
        C12937a aVar = this.f39609b.get(str2);
        if (aVar == null) {
            C9697d dVar = this.f39611d;
            dVar.handleError(C9695b.m50617f(str2, str, "Could not find ad for placement '" + str2 + "'."));
            return;
        }
        this.f39610c = aVar;
        C9705k.m50625a(new C9704a(activity));
    }
}
