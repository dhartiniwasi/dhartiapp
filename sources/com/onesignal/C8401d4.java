package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.C8338d3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.onesignal.d4 */
/* compiled from: TrackAmazonPurchase */
class C8401d4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f35555a;

    /* renamed from: b */
    private boolean f35556b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8403b f35557c;

    /* renamed from: d */
    private boolean f35558d = false;

    /* renamed from: e */
    private Object f35559e;

    /* renamed from: f */
    private Field f35560f;

    /* renamed from: com.onesignal.d4$a */
    /* compiled from: TrackAmazonPurchase */
    class C8402a implements Runnable {
        C8402a() {
        }

        public void run() {
            PurchasingService.registerListener(C8401d4.this.f35555a, C8401d4.this.f35557c);
        }
    }

    /* renamed from: com.onesignal.d4$b */
    /* compiled from: TrackAmazonPurchase */
    private class C8403b implements PurchasingListener {

        /* renamed from: a */
        PurchasingListener f35562a;

        private C8403b() {
        }

        /* synthetic */ C8403b(C8401d4 d4Var, C8402a aVar) {
            this();
        }
    }

    C8401d4(Context context) {
        this.f35555a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.f35559e = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (NullPointerException unused) {
                this.f35559e = cls.getMethod("e", new Class[0]).invoke((Object) null, new Object[0]);
                this.f35558d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f35560f = declaredField;
            declaredField.setAccessible(true);
            C8403b bVar = new C8403b(this, (C8402a) null);
            this.f35557c = bVar;
            bVar.f35562a = (PurchasingListener) this.f35560f.get(this.f35559e);
            this.f35556b = true;
            m46642e();
        } catch (ClassNotFoundException e) {
            m46641d(e);
        } catch (IllegalAccessException e2) {
            m46641d(e2);
        } catch (InvocationTargetException e3) {
            m46641d(e3);
        } catch (NoSuchMethodException e4) {
            m46641d(e4);
        } catch (NoSuchFieldException e5) {
            m46641d(e5);
        } catch (ClassCastException e6) {
            m46641d(e6);
        }
    }

    /* renamed from: d */
    private static void m46641d(Exception exc) {
        C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    /* renamed from: e */
    private void m46642e() {
        if (this.f35558d) {
            OSUtils.m46187T(new C8402a());
        } else {
            PurchasingService.registerListener(this.f35555a, this.f35557c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27759c() {
        if (this.f35556b) {
            try {
                C8403b bVar = (PurchasingListener) this.f35560f.get(this.f35559e);
                C8403b bVar2 = this.f35557c;
                if (bVar != bVar2) {
                    bVar2.f35562a = bVar;
                    m46642e();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
