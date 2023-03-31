package p077k1;

import android.content.Context;
import java.util.HashMap;
import p186ac.C6539c;
import p186ac.C6568r;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugin.platform.C10732g;

/* renamed from: k1.e */
/* compiled from: FacebookNativeAdPlugin */
class C4848e extends C10732g {

    /* renamed from: a */
    private final C6539c f25615a;

    C4848e(C6539c cVar) {
        super(C6568r.f31011a);
        this.f25615a = cVar;
    }

    public C10731f create(Context context, int i, Object obj) {
        return new C4849f(context, i, (HashMap) obj, this.f25615a);
    }
}
