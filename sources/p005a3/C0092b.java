package p005a3;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p005a3.C0091a;
import p155v3.C5823j0;

/* renamed from: a3.b */
/* compiled from: FilteringManifestParser */
public final class C0092b<T extends C0091a<T>> implements C5823j0.C5824a<T> {

    /* renamed from: a */
    private final C5823j0.C5824a<? extends T> f253a;

    /* renamed from: b */
    private final List<C0093c> f254b;

    public C0092b(C5823j0.C5824a<? extends T> aVar, List<C0093c> list) {
        this.f253a = aVar;
        this.f254b = list;
    }

    /* renamed from: b */
    public T mo216a(Uri uri, InputStream inputStream) throws IOException {
        T t = (C0091a) this.f253a.mo216a(uri, inputStream);
        List<C0093c> list = this.f254b;
        return (list == null || list.isEmpty()) ? t : (C0091a) t.mo215a(this.f254b);
    }
}
