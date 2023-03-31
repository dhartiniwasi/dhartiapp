package p144t5;

import android.app.Application;
import android.content.Context;

/* renamed from: t5.o1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public abstract class C5582o1 {

    /* renamed from: a */
    private static C5582o1 f28177a;

    /* renamed from: a */
    public static C5582o1 m33665a(Context context) {
        C5582o1 o1Var;
        synchronized (C5582o1.class) {
            if (f28177a == null) {
                C5555h hVar = new C5555h((C5551g) null);
                hVar.mo19857b((Application) context.getApplicationContext());
                f28177a = hVar.mo19856a();
            }
            o1Var = f28177a;
        }
        return o1Var;
    }

    /* renamed from: b */
    public abstract C5603v1 mo19870b();

    /* renamed from: c */
    public abstract C5536c0 mo19871c();
}
