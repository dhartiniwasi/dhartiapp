package p077k1;

import android.content.Context;
import java.util.HashMap;
import p186ac.C6539c;
import p186ac.C6568r;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugin.platform.C10732g;

/* renamed from: k1.b */
/* compiled from: FacebookBannerAdPlugin */
public class C4844b extends C10732g {

    /* renamed from: a */
    private final C6539c f25607a;

    C4844b(C6539c cVar) {
        super(C6568r.f31011a);
        this.f25607a = cVar;
    }

    public C10731f create(Context context, int i, Object obj) {
        return new C4845c(context, i, (HashMap) obj, this.f25607a);
    }
}
