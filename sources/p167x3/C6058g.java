package p167x3;

import android.view.Surface;
import p120q2.C5380m;
import p120q2.C5381n;

/* renamed from: x3.g */
/* compiled from: MediaCodecVideoDecoderException */
public class C6058g extends C5380m {

    /* renamed from: c */
    public final int f29360c;

    /* renamed from: d */
    public final boolean f29361d;

    public C6058g(Throwable th, C5381n nVar, Surface surface) {
        super(th, nVar);
        this.f29360c = System.identityHashCode(surface);
        this.f29361d = surface == null || surface.isValid();
    }
}
