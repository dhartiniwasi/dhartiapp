package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C2151f implements DynamiteModule.C2143b {
    C2151f() {
    }

    /* renamed from: a */
    public final DynamiteModule.C2143b.C2145b mo8137a(Context context, String str, DynamiteModule.C2143b.C2144a aVar) throws DynamiteModule.C2142a {
        DynamiteModule.C2143b.C2145b bVar = new DynamiteModule.C2143b.C2145b();
        int a = aVar.mo8138a(context, str, false);
        bVar.f6344b = a;
        if (a == 0) {
            bVar.f6345c = 0;
        } else {
            bVar.f6345c = 1;
        }
        return bVar;
    }
}
