package p115p4;

import com.google.android.gms.internal.ads.bv1;
import java.util.ArrayDeque;

/* renamed from: p4.b */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C5278b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5312t f27222a;

    /* renamed from: b */
    public final /* synthetic */ bv1 f27223b;

    /* renamed from: c */
    public final /* synthetic */ ArrayDeque f27224c;

    /* renamed from: d */
    public final /* synthetic */ ArrayDeque f27225d;

    public /* synthetic */ C5278b(C5312t tVar, bv1 bv1, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.f27222a = tVar;
        this.f27223b = bv1;
        this.f27224c = arrayDeque;
        this.f27225d = arrayDeque2;
    }

    public final void run() {
        this.f27222a.mo19287e(this.f27223b, this.f27224c, this.f27225d);
    }
}
