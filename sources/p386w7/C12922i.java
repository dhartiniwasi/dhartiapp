package p386w7;

import java.io.IOException;
import p356t7.C12540b;
import p356t7.C12541c;
import p356t7.C12547g;

/* renamed from: w7.i */
/* compiled from: ProtobufValueEncoderContext */
class C12922i implements C12547g {

    /* renamed from: a */
    private boolean f47145a = false;

    /* renamed from: b */
    private boolean f47146b = false;

    /* renamed from: c */
    private C12541c f47147c;

    /* renamed from: d */
    private final C12917f f47148d;

    C12922i(C12917f fVar) {
        this.f47148d = fVar;
    }

    /* renamed from: a */
    private void m61050a() {
        if (!this.f47145a) {
            this.f47145a = true;
            return;
        }
        throw new C12540b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37963b(C12541c cVar, boolean z) {
        this.f47145a = false;
        this.f47147c = cVar;
        this.f47146b = z;
    }

    /* renamed from: d */
    public C12547g mo37371d(String str) throws IOException {
        m61050a();
        this.f47148d.mo37951g(this.f47147c, str, this.f47146b);
        return this;
    }

    /* renamed from: e */
    public C12547g mo37372e(boolean z) throws IOException {
        m61050a();
        this.f47148d.mo37956l(this.f47147c, z, this.f47146b);
        return this;
    }
}
