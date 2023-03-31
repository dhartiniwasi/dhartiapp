package p120q2;

import java.io.IOException;
import p120q2.C5365b;
import p120q2.C5376l;
import p120q2.C5394x;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;

/* renamed from: q2.j */
/* compiled from: DefaultMediaCodecAdapterFactory */
public final class C5374j implements C5376l.C5378b {

    /* renamed from: a */
    private int f27500a = 0;

    /* renamed from: b */
    private boolean f27501b;

    /* renamed from: a */
    public C5376l mo19446a(C5376l.C5377a aVar) throws IOException {
        int i;
        int i2 = C5953m0.f29110a;
        if (i2 < 23 || ((i = this.f27500a) != 1 && (i != 0 || i2 < 31))) {
            return new C5394x.C5396b().mo19446a(aVar);
        }
        int k = C5967v.m35247k(aVar.f27509c.f30243t);
        C5961r.m35212f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + C5953m0.m35141k0(k));
        return new C5365b.C5367b(k, this.f27501b).mo19446a(aVar);
    }
}
