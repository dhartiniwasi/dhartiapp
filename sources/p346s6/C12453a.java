package p346s6;

import android.graphics.Typeface;

/* renamed from: s6.a */
/* compiled from: CancelableFontCallback */
public final class C12453a extends C12461f {

    /* renamed from: a */
    private final Typeface f45800a;

    /* renamed from: b */
    private final C12454a f45801b;

    /* renamed from: c */
    private boolean f45802c;

    /* renamed from: s6.a$a */
    /* compiled from: CancelableFontCallback */
    public interface C12454a {
        /* renamed from: a */
        void mo25716a(Typeface typeface);
    }

    public C12453a(C12454a aVar, Typeface typeface) {
        this.f45800a = typeface;
        this.f45801b = aVar;
    }

    /* renamed from: d */
    private void m59411d(Typeface typeface) {
        if (!this.f45802c) {
            this.f45801b.mo25716a(typeface);
        }
    }

    /* renamed from: a */
    public void mo25210a(int i) {
        m59411d(this.f45800a);
    }

    /* renamed from: b */
    public void mo25211b(Typeface typeface, boolean z) {
        m59411d(typeface);
    }

    /* renamed from: c */
    public void mo37206c() {
        this.f45802c = true;
    }
}
