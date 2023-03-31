package p033d5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: d5.o1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4132o1 {

    /* renamed from: f */
    private static final Uri f23368f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f23369a;

    /* renamed from: b */
    private final String f23370b;

    /* renamed from: c */
    private final ComponentName f23371c = null;

    /* renamed from: d */
    private final int f23372d;

    /* renamed from: e */
    private final boolean f23373e;

    public C4132o1(String str, String str2, int i, boolean z) {
        C4141r.m28217g(str);
        this.f23369a = str;
        C4141r.m28217g(str2);
        this.f23370b = str2;
        this.f23372d = i;
        this.f23373e = z;
    }

    /* renamed from: a */
    public final int mo17435a() {
        return this.f23372d;
    }

    /* renamed from: b */
    public final ComponentName mo17436b() {
        return this.f23371c;
    }

    /* renamed from: c */
    public final Intent mo17437c(Context context) {
        Bundle bundle;
        if (this.f23369a == null) {
            return new Intent().setComponent(this.f23371c);
        }
        Intent intent = null;
        if (this.f23373e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f23369a);
            try {
                bundle = context.getContentResolver().call(f23368f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f23369a)));
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f23369a).setPackage(this.f23370b);
    }

    /* renamed from: d */
    public final String mo17438d() {
        return this.f23370b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4132o1)) {
            return false;
        }
        C4132o1 o1Var = (C4132o1) obj;
        return C4133p.m28193a(this.f23369a, o1Var.f23369a) && C4133p.m28193a(this.f23370b, o1Var.f23370b) && C4133p.m28193a(this.f23371c, o1Var.f23371c) && this.f23372d == o1Var.f23372d && this.f23373e == o1Var.f23373e;
    }

    public final int hashCode() {
        return C4133p.m28194b(this.f23369a, this.f23370b, this.f23371c, Integer.valueOf(this.f23372d), Boolean.valueOf(this.f23373e));
    }

    public final String toString() {
        String str = this.f23369a;
        if (str != null) {
            return str;
        }
        C4141r.m28221k(this.f23371c);
        return this.f23371c.flattenToString();
    }
}
