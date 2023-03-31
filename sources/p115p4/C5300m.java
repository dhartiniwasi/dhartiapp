package p115p4;

import com.google.android.gms.internal.ads.b02;
import com.google.android.gms.internal.ads.cf3;
import com.google.android.gms.internal.ads.ie3;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.yg0;
import java.util.concurrent.Executor;

/* renamed from: p4.m */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C5300m implements ie3 {

    /* renamed from: a */
    private final Executor f27298a;

    /* renamed from: b */
    private final b02 f27299b;

    public C5300m(Executor executor, b02 b02) {
        this.f27298a = executor;
        this.f27299b = b02;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ lf3 mo8156b(Object obj) throws Exception {
        yg0 yg0 = (yg0) obj;
        return cf3.m10916n(this.f27299b.mo8641b(yg0), new C5298l(yg0), this.f27298a);
    }
}
