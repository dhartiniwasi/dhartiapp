package com.google.android.gms.measurement.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.measurement.internal.c3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7319c3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f32381a;

    /* renamed from: b */
    final /* synthetic */ String f32382b;

    /* renamed from: c */
    final /* synthetic */ Object f32383c;

    /* renamed from: d */
    final /* synthetic */ Object f32384d;

    /* renamed from: e */
    final /* synthetic */ Object f32385e;

    /* renamed from: f */
    final /* synthetic */ C7352f3 f32386f;

    C7319c3(C7352f3 f3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f32386f = f3Var;
        this.f32381a = i;
        this.f32382b = str;
        this.f32383c = obj;
        this.f32384d = obj2;
        this.f32385e = obj3;
    }

    public final void run() {
        C7495s3 F = this.f32386f.f32389a.mo24416F();
        if (F.mo24239m()) {
            C7352f3 f3Var = this.f32386f;
            if (f3Var.f32463c == 0) {
                if (f3Var.f32389a.mo24443z().mo24285H()) {
                    C7352f3 f3Var2 = this.f32386f;
                    f3Var2.f32389a.mo24118b();
                    f3Var2.f32463c = 'C';
                } else {
                    C7352f3 f3Var3 = this.f32386f;
                    f3Var3.f32389a.mo24118b();
                    f3Var3.f32463c = 'c';
                }
            }
            C7352f3 f3Var4 = this.f32386f;
            if (f3Var4.f32464d < 0) {
                f3Var4.f32389a.mo24443z().mo24292p();
                f3Var4.f32464d = 74029;
            }
            char charAt = "01VDIWEA?".charAt(this.f32381a);
            C7352f3 f3Var5 = this.f32386f;
            String str = "2" + charAt + f3Var5.f32463c + f3Var5.f32464d + ":" + C7352f3.m41468A(true, this.f32382b, this.f32383c, this.f32384d, this.f32385e);
            if (str.length() > 1024) {
                str = this.f32382b.substring(0, 1024);
            }
            C7473q3 q3Var = F.f32946d;
            if (q3Var != null) {
                q3Var.mo24618b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f32386f.mo24253C(), "Persisted config not initialized. Not logging error/warn");
    }
}
