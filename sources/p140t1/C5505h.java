package p140t1;

import android.content.Context;
import android.os.Build;
import p147u1.C5693a;
import p147u1.C5698e;
import p147u1.C5699g;
import p147u1.C5708y;
import p153v1.C5761d;
import p165x1.C6034a;

/* renamed from: t1.h */
/* compiled from: SchedulingModule */
public abstract class C5505h {
    /* renamed from: a */
    static C5708y m33470a(Context context, C5761d dVar, C5699g gVar, C6034a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C5698e(context, dVar, gVar);
        }
        return new C5693a(context, dVar, aVar, gVar);
    }
}
