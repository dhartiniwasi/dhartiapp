package p036e1;

import android.content.Context;
import p064i1.C4647a;

/* renamed from: e1.g */
/* compiled from: Trackers */
public class C4182g {

    /* renamed from: e */
    private static C4182g f23451e;

    /* renamed from: a */
    private C4172a f23452a;

    /* renamed from: b */
    private C4173b f23453b;

    /* renamed from: c */
    private C4178e f23454c;

    /* renamed from: d */
    private C4181f f23455d;

    private C4182g(Context context, C4647a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f23452a = new C4172a(applicationContext, aVar);
        this.f23453b = new C4173b(applicationContext, aVar);
        this.f23454c = new C4178e(applicationContext, aVar);
        this.f23455d = new C4181f(applicationContext, aVar);
    }

    /* renamed from: c */
    public static synchronized C4182g m28319c(Context context, C4647a aVar) {
        C4182g gVar;
        synchronized (C4182g.class) {
            if (f23451e == null) {
                f23451e = new C4182g(context, aVar);
            }
            gVar = f23451e;
        }
        return gVar;
    }

    /* renamed from: a */
    public C4172a mo17521a() {
        return this.f23452a;
    }

    /* renamed from: b */
    public C4173b mo17522b() {
        return this.f23453b;
    }

    /* renamed from: d */
    public C4178e mo17523d() {
        return this.f23454c;
    }

    /* renamed from: e */
    public C4181f mo17524e() {
        return this.f23455d;
    }
}
