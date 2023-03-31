package p216dd;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import kotlin.jvm.internal.C11669k;
import p204cd.C6855a;
import p225ed.C10109d;
import p243gd.C10340l;

/* renamed from: dd.a */
/* compiled from: DocumentRepository.kt */
public final class C9946a extends C9948c<C6855a> {
    /* renamed from: b */
    public void mo32509b(String str) {
        C11669k.m56787e(str, "id");
        ((C6855a) mo32513d(str)).mo22962a();
        super.mo32509b(str);
    }

    /* renamed from: f */
    public final C6855a mo32510f(C10340l<? extends ParcelFileDescriptor, PdfRenderer> lVar) {
        String b = C10109d.m51424b();
        C11669k.m56784b(lVar);
        C6855a aVar = new C6855a(b, lVar.mo33174b(), (ParcelFileDescriptor) lVar.mo33173a());
        mo32514e(b, aVar);
        return aVar;
    }
}
