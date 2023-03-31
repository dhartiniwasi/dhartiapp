package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.g1 */
/* compiled from: Sta */
public class C8960g1 {

    /* renamed from: a */
    public final Context f36794a;

    /* renamed from: b */
    public String f36795b;

    /* renamed from: c */
    public C8963b f36796c;

    /* renamed from: d */
    public int f36797d;

    /* renamed from: com.startapp.g1$a */
    /* compiled from: Sta */
    public class C8961a implements Runnable {

        /* renamed from: com.startapp.g1$a$a */
        /* compiled from: Sta */
        public class C8962a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f36799a;

            public C8962a(Bitmap bitmap) {
                this.f36799a = bitmap;
            }

            public void run() {
                C8960g1 g1Var = C8960g1.this;
                C8963b bVar = g1Var.f36796c;
                if (bVar != null) {
                    bVar.mo29358a(this.f36799a, g1Var.f36797d);
                }
            }
        }

        public C8961a() {
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C8962a(C8993h1.m48655b(C8960g1.this.f36795b)));
        }
    }

    /* renamed from: com.startapp.g1$b */
    /* compiled from: Sta */
    public interface C8963b {
        /* renamed from: a */
        void mo29358a(Bitmap bitmap, int i);
    }

    public C8960g1(Context context, String str, C8963b bVar, int i) {
        this.f36794a = context;
        this.f36795b = str;
        this.f36796c = bVar;
        this.f36797d = i;
    }

    /* renamed from: a */
    public void mo29368a() {
        ComponentLocator.m50248a(this.f36794a).f39058z.mo29904a().execute(new C8961a());
    }
}
