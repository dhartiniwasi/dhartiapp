package p216dd;

import android.graphics.pdf.PdfRenderer;
import kotlin.jvm.internal.C11669k;
import p204cd.C6856b;
import p225ed.C10109d;

/* renamed from: dd.b */
/* compiled from: PageRepository.kt */
public final class C9947b extends C9948c<C6856b> {
    /* renamed from: b */
    public void mo32509b(String str) {
        C11669k.m56787e(str, "id");
        ((C6856b) mo32513d(str)).mo22966a();
        super.mo32509b(str);
    }

    /* renamed from: f */
    public final C6856b mo32511f(String str, PdfRenderer.Page page) {
        C11669k.m56787e(str, "documentId");
        C11669k.m56787e(page, "pageRenderer");
        String b = C10109d.m51424b();
        C6856b bVar = new C6856b(b, str, page);
        mo32514e(b, bVar);
        return bVar;
    }
}
