package p033d5;

import android.content.Context;
import android.content.res.Resources;
import p180z4.C6382l;

/* renamed from: d5.u */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4150u {

    /* renamed from: a */
    private final Resources f23410a;

    /* renamed from: b */
    private final String f23411b;

    public C4150u(Context context) {
        C4141r.m28221k(context);
        Resources resources = context.getResources();
        this.f23410a = resources;
        this.f23411b = resources.getResourcePackageName(C6382l.f30626a);
    }

    /* renamed from: a */
    public String mo17475a(String str) {
        int identifier = this.f23410a.getIdentifier(str, "string", this.f23411b);
        if (identifier == 0) {
            return null;
        }
        return this.f23410a.getString(identifier);
    }
}
