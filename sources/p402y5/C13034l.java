package p402y5;

import com.google.android.gms.internal.measurement.C6899bf;
import com.google.android.gms.measurement.internal.C7331d4;
import com.google.android.gms.measurement.internal.C7548x3;
import java.util.concurrent.Callable;

/* renamed from: y5.l */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C13034l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C7331d4 f47283a;

    /* renamed from: b */
    public final /* synthetic */ String f47284b;

    public /* synthetic */ C13034l(C7331d4 d4Var, String str) {
        this.f47283a = d4Var;
        this.f47284b = str;
    }

    public final Object call() {
        return new C6899bf("internal.appMetadata", new C7548x3(this.f47283a, this.f47284b));
    }
}
