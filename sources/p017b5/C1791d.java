package p017b5;

import android.app.Activity;
import androidx.fragment.app.C1093e;
import p033d5.C4141r;

/* renamed from: b5.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C1791d {

    /* renamed from: a */
    private final Object f5319a;

    public C1791d(Activity activity) {
        C4141r.m28222l(activity, "Activity must not be null");
        this.f5319a = activity;
    }

    /* renamed from: a */
    public final Activity mo6920a() {
        return (Activity) this.f5319a;
    }

    /* renamed from: b */
    public final C1093e mo6921b() {
        return (C1093e) this.f5319a;
    }

    /* renamed from: c */
    public final boolean mo6922c() {
        return this.f5319a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo6923d() {
        return this.f5319a instanceof C1093e;
    }
}
