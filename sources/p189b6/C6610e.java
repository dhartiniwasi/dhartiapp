package p189b6;

import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Scope;
import p198c6.C6752a;

/* renamed from: b6.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6610e {

    /* renamed from: a */
    public static final C2051a.C2061g<C6752a> f31071a;

    /* renamed from: b */
    public static final C2051a.C2061g<C6752a> f31072b;

    /* renamed from: c */
    public static final C2051a.C2052a<C6752a, C6606a> f31073c;

    /* renamed from: d */
    static final C2051a.C2052a<C6752a, C6609d> f31074d;

    /* renamed from: e */
    public static final Scope f31075e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f31076f = new Scope("email");

    /* renamed from: g */
    public static final C2051a<C6606a> f31077g;

    /* renamed from: h */
    public static final C2051a<C6609d> f31078h;

    static {
        C2051a.C2061g<C6752a> gVar = new C2051a.C2061g<>();
        f31071a = gVar;
        C2051a.C2061g<C6752a> gVar2 = new C2051a.C2061g<>();
        f31072b = gVar2;
        C6607b bVar = new C6607b();
        f31073c = bVar;
        C6608c cVar = new C6608c();
        f31074d = cVar;
        f31077g = new C2051a<>("SignIn.API", bVar, gVar);
        f31078h = new C2051a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
