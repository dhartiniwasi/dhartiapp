package p073j4;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j4.m */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C4789m implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C4810t f25467a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f25468b;

    /* renamed from: c */
    public final /* synthetic */ int f25469c;

    /* renamed from: d */
    public final /* synthetic */ int f25470d;

    /* renamed from: e */
    public final /* synthetic */ int f25471e;

    public /* synthetic */ C4789m(C4810t tVar, AtomicInteger atomicInteger, int i, int i2, int i3) {
        this.f25467a = tVar;
        this.f25468b = atomicInteger;
        this.f25469c = i;
        this.f25470d = i2;
        this.f25471e = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f25467a.mo18538h(this.f25468b, this.f25469c, this.f25470d, this.f25471e, dialogInterface, i);
    }
}
