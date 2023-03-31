package p052g3;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p161w3.C5917a;

/* renamed from: g3.e */
/* compiled from: FullSegmentEncryptionKeyCache */
final class C4364e {

    /* renamed from: a */
    private final LinkedHashMap<Uri, byte[]> f24320a;

    /* renamed from: g3.e$a */
    /* compiled from: FullSegmentEncryptionKeyCache */
    class C4365a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a */
        final /* synthetic */ int f24321a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4365a(C4364e eVar, int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.f24321a = i2;
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f24321a;
        }
    }

    public C4364e(int i) {
        this.f24320a = new C4365a(this, i + 1, 1.0f, false, i);
    }

    /* renamed from: a */
    public byte[] mo17807a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f24320a.get(uri);
    }

    /* renamed from: b */
    public byte[] mo17808b(Uri uri, byte[] bArr) {
        return (byte[]) this.f24320a.put((Uri) C5917a.m34872e(uri), (byte[]) C5917a.m34872e(bArr));
    }

    /* renamed from: c */
    public byte[] mo17809c(Uri uri) {
        return (byte[]) this.f24320a.remove(C5917a.m34872e(uri));
    }
}
