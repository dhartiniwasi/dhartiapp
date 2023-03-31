package com.p206h2.dynamic_app;

import android.content.Context;
import android.view.LayoutInflater;
import com.ryanheise.audioservice.C8796a;
import p264io.flutter.embedding.android.C10628d;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.plugins.googlemobileads.C10839h0;

/* renamed from: com.h2.dynamic_app.MainActivity */
public class MainActivity extends C10628d {
    /* renamed from: k */
    public C10685a mo27478k(Context context) {
        return C8796a.m48122B(context);
    }

    /* renamed from: m */
    public void mo27479m(C10685a aVar) {
        aVar.mo34079p().mo34096f(new C10839h0());
        super.mo27479m(aVar);
        C10839h0.m54153c(aVar, "NativeAdmobFactory", new C8274a(LayoutInflater.from(this)));
    }

    /* renamed from: r */
    public void mo27480r(C10685a aVar) {
        C10839h0.m54157g(aVar, "NativeAdmobFactory");
    }
}
