package p156v4;

import android.content.Context;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2063c;
import p116p5.C5328j;
import p218e6.C9975i;

/* renamed from: v4.b */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class C5859b extends C2063c<C2051a.C2055d.C2058c> {

    /* renamed from: k */
    private static final C2051a.C2061g<C5328j> f28988k;

    /* renamed from: l */
    private static final C2051a.C2052a<C5328j, C2051a.C2055d.C2058c> f28989l;

    /* renamed from: m */
    private static final C2051a<C2051a.C2055d.C2058c> f28990m;

    static {
        C2051a.C2061g<C5328j> gVar = new C2051a.C2061g<>();
        f28988k = gVar;
        C5860c cVar = new C5860c();
        f28989l = cVar;
        f28990m = new C2051a<>("SmsRetriever.API", cVar, gVar);
    }

    public C5859b(Context context) {
        super(context, f28990m, null, C2063c.C2064a.f6061c);
    }

    /* renamed from: r */
    public abstract C9975i<Void> mo19299r();
}
