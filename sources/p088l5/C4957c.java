package p088l5;

import android.content.Context;
import android.os.IBinder;
import p033d5.C4141r;
import p180z4.C6378j;

/* renamed from: l5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C4957c<T> {

    /* renamed from: a */
    private final String f26037a;

    /* renamed from: b */
    private Object f26038b;

    /* renamed from: l5.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class C4958a extends Exception {
        public C4958a(String str) {
            super(str);
        }

        public C4958a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C4957c(String str) {
        this.f26037a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo13128a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo18828b(Context context) throws C4958a {
        if (this.f26038b == null) {
            C4141r.m28221k(context);
            Context e = C6378j.m37456e(context);
            if (e != null) {
                try {
                    this.f26038b = mo13128a((IBinder) e.getClassLoader().loadClass(this.f26037a).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new C4958a("Could not load creator class.", e2);
                } catch (InstantiationException e3) {
                    throw new C4958a("Could not instantiate creator.", e3);
                } catch (IllegalAccessException e4) {
                    throw new C4958a("Could not access creator.", e4);
                }
            } else {
                throw new C4958a("Could not get remote context.");
            }
        }
        return this.f26038b;
    }
}
