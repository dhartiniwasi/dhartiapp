package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.j */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C2155j implements DynamiteModule.C2143b {
    C2155j() {
    }

    /* renamed from: a */
    public final DynamiteModule.C2143b.C2145b mo8137a(Context context, String str, DynamiteModule.C2143b.C2144a aVar) throws DynamiteModule.C2142a {
        int i;
        DynamiteModule.C2143b.C2145b bVar = new DynamiteModule.C2143b.C2145b();
        int b = aVar.mo8139b(context, str);
        bVar.f6343a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo8138a(context, str, false);
            bVar.f6344b = i;
        } else {
            i = aVar.mo8138a(context, str, true);
            bVar.f6344b = i;
        }
        int i3 = bVar.f6343a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f6345c = 0;
            return bVar;
        }
        if (i >= i2) {
            bVar.f6345c = 1;
        } else {
            bVar.f6345c = -1;
        }
        return bVar;
    }
}
