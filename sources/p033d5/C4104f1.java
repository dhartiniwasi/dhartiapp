package p033d5;

import android.util.Log;

/* renamed from: d5.f1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C4104f1 {

    /* renamed from: a */
    private Object f23315a;

    /* renamed from: b */
    private boolean f23316b = false;

    /* renamed from: c */
    final /* synthetic */ C4087c f23317c;

    public C4104f1(C4087c cVar, Object obj) {
        this.f23317c = cVar;
        this.f23315a = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17387a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo17388b();

    /* renamed from: c */
    public final void mo17389c() {
        Object obj;
        synchronized (this) {
            obj = this.f23315a;
            if (this.f23316b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo17387a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f23316b = true;
        }
        mo17391e();
    }

    /* renamed from: d */
    public final void mo17390d() {
        synchronized (this) {
            this.f23315a = null;
        }
    }

    /* renamed from: e */
    public final void mo17391e() {
        mo17390d();
        synchronized (this.f23317c.f23267z) {
            this.f23317c.f23267z.remove(this);
        }
    }
}
