package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.startapp.p3 */
/* compiled from: Sta */
public class C9210p3 extends C9649y0 {

    /* renamed from: com.startapp.p3$a */
    /* compiled from: Sta */
    public class C9211a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9222p9 f38047a;

        public C9211a(C9222p9 p9Var) {
            this.f38047a = p9Var;
        }

        public void run() {
            JSONArray jSONArray;
            C9222p9 p9Var = this.f38047a;
            p9Var.f38075c.unregisterListener(p9Var.f38078f);
            C9620w7 w7Var = C9210p3.this.f39425b;
            C9222p9 p9Var2 = this.f38047a;
            p9Var2.getClass();
            try {
                jSONArray = p9Var2.f38074b.mo29794a();
            } catch (Exception unused) {
                jSONArray = null;
            }
            w7Var.mo29232a(jSONArray);
        }
    }

    public C9210p3(Context context, C9620w7 w7Var) {
        super(context, w7Var);
    }

    /* renamed from: a */
    public void mo29502a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.f38952k.mo30992H().mo31126k());
            C9222p9 p9Var = new C9222p9(this.f39424a, this.f39425b);
            this.f39426c.postDelayed(new C9211a(p9Var), millis);
            p9Var.mo29825b();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            this.f39425b.mo29232a((Object) null);
        }
    }
}
