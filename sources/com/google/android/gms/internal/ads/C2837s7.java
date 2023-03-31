package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2837s7 implements C2577l7 {

    /* renamed from: a */
    private final x12 f17283a = new x12(new byte[4], 4);

    /* renamed from: b */
    final /* synthetic */ C2911u7 f17284b;

    public C2837s7(C2911u7 u7Var) {
        this.f17284b = u7Var;
    }

    /* renamed from: a */
    public final void mo8684a(e92 e92, tn4 tn4, C3059y7 y7Var) {
    }

    /* renamed from: b */
    public final void mo8685b(y22 y22) {
        if (y22.mo15306s() == 0 && (y22.mo15306s() & 128) != 0) {
            y22.mo15294g(6);
            int i = y22.mo15296i() / 4;
            for (int i2 = 0; i2 < i; i2++) {
                y22.mo15288a(this.f17283a, 4);
                int c = this.f17283a.mo15034c(16);
                this.f17283a.mo15041j(3);
                if (c == 0) {
                    this.f17283a.mo15041j(13);
                } else {
                    int c2 = this.f17283a.mo15034c(13);
                    if (this.f17284b.f18423e.get(c2) == null) {
                        C2911u7 u7Var = this.f17284b;
                        u7Var.f18423e.put(c2, new C2614m7(new C2874t7(u7Var, c2)));
                        C2911u7 u7Var2 = this.f17284b;
                        u7Var2.f18429k = u7Var2.f18429k + 1;
                    }
                }
            }
            this.f17284b.f18423e.remove(0);
        }
    }
}
