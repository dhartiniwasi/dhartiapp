package p059h3;

import java.util.Collections;
import java.util.List;
import p005a3.C0091a;

/* renamed from: h3.i */
/* compiled from: HlsPlaylist */
public abstract class C4459i implements C0091a<C4459i> {

    /* renamed from: a */
    public final String f24757a;

    /* renamed from: b */
    public final List<String> f24758b;

    /* renamed from: c */
    public final boolean f24759c;

    protected C4459i(String str, List<String> list, boolean z) {
        this.f24757a = str;
        this.f24758b = Collections.unmodifiableList(list);
        this.f24759c = z;
    }
}
