package p030d2;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p155v3.C5837p;

/* renamed from: d2.o0 */
/* compiled from: MediaDrmCallbackException */
public final class C4044o0 extends IOException {

    /* renamed from: a */
    public final C5837p f23122a;

    /* renamed from: b */
    public final Uri f23123b;

    /* renamed from: c */
    public final Map<String, List<String>> f23124c;

    /* renamed from: d */
    public final long f23125d;

    public C4044o0(C5837p pVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f23122a = pVar;
        this.f23123b = uri;
        this.f23124c = map;
        this.f23125d = j;
    }
}
