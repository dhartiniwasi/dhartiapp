package p144t5;

import android.app.Activity;
import android.app.Application;
import p403y6.C13049a;
import p403y6.C13056d;

/* renamed from: t5.y1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5612y1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Application f28248a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5532b0 f28249b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5577n f28250c;

    C5612y1(Application application, C5532b0 b0Var, C5577n nVar) {
        this.f28248a = application;
        this.f28249b = b0Var;
        this.f28250c = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C5605w0 mo19910d(Activity activity, C13056d dVar) throws C5600u1 {
        C13049a a = dVar.mo38086a();
        if (a == null) {
            a = new C13049a.C13050a(this.f28248a).mo38084b();
        }
        return C5615z1.m33703a(new C5615z1(this, activity, a, dVar, (C5609x1) null));
    }
}
