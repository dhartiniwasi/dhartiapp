package p314oa;

import android.app.Activity;
import android.content.Context;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6568r;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugin.platform.C10732g;

/* renamed from: oa.a */
/* compiled from: BannerAdFactory */
public class C12047a extends C10732g {

    /* renamed from: a */
    private final C6539c f45047a;

    /* renamed from: b */
    private Activity f45048b;

    public C12047a(C6539c cVar) {
        super(C6568r.f31011a);
        this.f45047a = cVar;
    }

    /* renamed from: a */
    public void mo36418a(Activity activity) {
        this.f45048b = activity;
    }

    public C10731f create(Context context, int i, Object obj) {
        return new C12050c(this.f45048b, i, (Map) obj, this.f45047a);
    }
}
