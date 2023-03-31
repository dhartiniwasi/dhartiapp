package p196bd;

import kotlin.jvm.internal.C11669k;
import p216dd.C9946a;
import p216dd.C9947b;
import p270jb.C11517a;
import p270jb.C11544m;
import p351sb.C12502a;

/* renamed from: bd.d */
/* compiled from: PdfxPlugin.kt */
public final class C6743d implements C12502a {

    /* renamed from: a */
    private final C9946a f31256a = new C9946a();

    /* renamed from: b */
    private final C9947b f31257b = new C9947b();

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "flutterPluginBinding");
        C11544m.m56461x(bVar.mo37293b(), new C6738a(bVar, this.f31256a, this.f31257b));
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        C11544m.m56461x(bVar.mo37293b(), (C11517a.C11524g) null);
        this.f31256a.mo32512a();
        this.f31257b.mo32512a();
    }
}
