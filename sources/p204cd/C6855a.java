package p204cd;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import kotlin.jvm.internal.C11669k;

/* renamed from: cd.a */
/* compiled from: Document.kt */
public final class C6855a {

    /* renamed from: a */
    private final String f31517a;

    /* renamed from: b */
    private final PdfRenderer f31518b;

    /* renamed from: c */
    private final ParcelFileDescriptor f31519c;

    public C6855a(String str, PdfRenderer pdfRenderer, ParcelFileDescriptor parcelFileDescriptor) {
        C11669k.m56787e(str, "id");
        C11669k.m56787e(pdfRenderer, "documentRenderer");
        C11669k.m56787e(parcelFileDescriptor, "fileDescriptor");
        this.f31517a = str;
        this.f31518b = pdfRenderer;
        this.f31519c = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final void mo22962a() {
        this.f31518b.close();
        this.f31519c.close();
    }

    /* renamed from: b */
    public final String mo22963b() {
        return this.f31517a;
    }

    /* renamed from: c */
    public final int mo22964c() {
        return this.f31518b.getPageCount();
    }

    /* renamed from: d */
    public final PdfRenderer.Page mo22965d(int i) {
        PdfRenderer.Page openPage = this.f31518b.openPage(i - 1);
        C11669k.m56786d(openPage, "documentRenderer.openPage(pageNumber - 1)");
        return openPage;
    }
}
