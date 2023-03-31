package p073j4;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j4.k */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C4783k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f25453a;

    public /* synthetic */ C4783k(AtomicInteger atomicInteger) {
        this.f25453a = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f25453a.set(i);
    }
}
