package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C2154i implements DynamiteModule.C2143b {
    C2154i() {
    }

    /* renamed from: a */
    public final DynamiteModule.C2143b.C2145b mo8137a(Context context, String str, DynamiteModule.C2143b.C2144a aVar) throws DynamiteModule.C2142a {
        DynamiteModule.C2143b.C2145b bVar = new DynamiteModule.C2143b.C2145b();
        bVar.f6343a = aVar.mo8139b(context, str);
        int a = aVar.mo8138a(context, str, true);
        bVar.f6344b = a;
        int i = bVar.f6343a;
        if (i == 0) {
            if (a == 0) {
                bVar.f6345c = 0;
                return bVar;
            }
            i = 0;
        }
        if (a >= i) {
            bVar.f6345c = 1;
        } else {
            bVar.f6345c = -1;
        }
        return bVar;
    }
}
