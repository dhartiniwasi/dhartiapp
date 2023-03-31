package p204cd;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import java.io.File;
import kotlin.jvm.internal.C11669k;
import p225ed.C10108c;

/* renamed from: cd.b */
/* compiled from: Page.kt */
public final class C6856b {

    /* renamed from: a */
    private final String f31520a;

    /* renamed from: b */
    private final String f31521b;

    /* renamed from: c */
    private final PdfRenderer.Page f31522c;

    /* renamed from: cd.b$a */
    /* compiled from: Page.kt */
    public static final class C6857a {

        /* renamed from: a */
        private final int f31523a;

        /* renamed from: b */
        private final int f31524b;

        /* renamed from: c */
        private final String f31525c;

        public C6857a(int i, int i2, String str) {
            C11669k.m56787e(str, "path");
            this.f31523a = i;
            this.f31524b = i2;
            this.f31525c = str;
        }

        /* renamed from: a */
        public final int mo22971a() {
            return this.f31524b;
        }

        /* renamed from: b */
        public final String mo22972b() {
            return this.f31525c;
        }

        /* renamed from: c */
        public final int mo22973c() {
            return this.f31523a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C11669k.m56783a(C6857a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C11669k.m56785c(obj, "null cannot be cast to non-null type io.scer.pdfx.document.Page.Data");
            return this.f31525c.contentEquals(((C6857a) obj).f31525c);
        }

        public int hashCode() {
            return (((this.f31523a * 31) + this.f31524b) * 31) + this.f31525c.hashCode();
        }

        public String toString() {
            return "Data(width=" + this.f31523a + ", height=" + this.f31524b + ", path=" + this.f31525c + ')';
        }
    }

    public C6856b(String str, String str2, PdfRenderer.Page page) {
        C11669k.m56787e(str, "id");
        C11669k.m56787e(str2, "documentId");
        C11669k.m56787e(page, "pageRenderer");
        this.f31520a = str;
        this.f31521b = str2;
        this.f31522c = page;
    }

    /* renamed from: a */
    public final void mo22966a() {
        this.f31522c.close();
    }

    /* renamed from: b */
    public final int mo22967b() {
        return this.f31522c.getHeight();
    }

    /* renamed from: c */
    public final String mo22968c() {
        return this.f31520a;
    }

    /* renamed from: d */
    public final int mo22969d() {
        return this.f31522c.getWidth();
    }

    /* renamed from: e */
    public final C6857a mo22970e(File file, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        C11669k.m56787e(file, "file");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i3);
        this.f31522c.render(createBitmap, (Rect) null, (Matrix) null, z2 ? 2 : 1);
        if (!z || (i7 == i && i8 == i2)) {
            C11669k.m56786d(createBitmap, "bitmap");
            C10108c.m51421a(createBitmap, file, i4, i9);
            String absolutePath = file.getAbsolutePath();
            C11669k.m56786d(absolutePath, "file.absolutePath");
            return new C6857a(i, i2, absolutePath);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i5, i6, i7, i8);
        C11669k.m56786d(createBitmap2, "cropped");
        C10108c.m51421a(createBitmap2, file, i4, i9);
        String absolutePath2 = file.getAbsolutePath();
        C11669k.m56786d(absolutePath2, "file.absolutePath");
        return new C6857a(i7, i8, absolutePath2);
    }
}
