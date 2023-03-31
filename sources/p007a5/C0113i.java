package p007a5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import p007a5.C0111g;

/* renamed from: a5.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C0113i<R extends C0111g> implements C0112h<R> {
    /* renamed from: a */
    public final void mo260a(R r) {
        Status d1 = r.mo259d1();
        if (d1.mo7953M1()) {
            mo262c(r);
            return;
        }
        mo261b(d1);
        if (r instanceof C0108d) {
            try {
                ((C0108d) r).mo256a();
            } catch (RuntimeException e) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r)), e);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo261b(Status status);

    /* renamed from: c */
    public abstract void mo262c(R r);
}
