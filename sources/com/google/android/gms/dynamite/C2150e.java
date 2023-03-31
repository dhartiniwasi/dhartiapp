package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C2150e implements DynamiteModule.C2143b {
    C2150e() {
    }

    /* renamed from: a */
    public final DynamiteModule.C2143b.C2145b mo8137a(Context context, String str, DynamiteModule.C2143b.C2144a aVar) throws DynamiteModule.C2142a {
        DynamiteModule.C2143b.C2145b bVar = new DynamiteModule.C2143b.C2145b();
        int b = aVar.mo8139b(context, str);
        bVar.f6343a = b;
        if (b != 0) {
            bVar.f6345c = -1;
        } else {
            int a = aVar.mo8138a(context, str, true);
            bVar.f6344b = a;
            if (a != 0) {
                bVar.f6345c = 1;
            }
        }
        return bVar;
    }
}
