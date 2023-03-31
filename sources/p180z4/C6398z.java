package p180z4;

import java.lang.ref.WeakReference;

/* renamed from: z4.z */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class C6398z extends C6396x {

    /* renamed from: c */
    private static final WeakReference f30643c = new WeakReference((Object) null);

    /* renamed from: b */
    private WeakReference f30644b = f30643c;

    C6398z(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i5 */
    public abstract byte[] mo21817i5();

    /* access modifiers changed from: package-private */
    /* renamed from: o3 */
    public final byte[] mo21820o3() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f30644b.get();
            if (bArr == null) {
                bArr = mo21817i5();
                this.f30644b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
