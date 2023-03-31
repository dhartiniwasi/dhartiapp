package p081k5;

import android.content.Context;

/* renamed from: k5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4888c {

    /* renamed from: b */
    private static C4888c f25831b = new C4888c();

    /* renamed from: a */
    private C4887b f25832a = null;

    /* renamed from: a */
    public static C4887b m31075a(Context context) {
        return f25831b.mo18676b(context);
    }

    /* renamed from: b */
    public final synchronized C4887b mo18676b(Context context) {
        if (this.f25832a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f25832a = new C4887b(context);
        }
        return this.f25832a;
    }
}
