package p007a5;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p007a5.C0111g;

/* renamed from: a5.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C0106c<R extends C0111g> {

    /* renamed from: a5.c$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C0107a {
        /* renamed from: a */
        void mo255a(Status status);
    }

    /* renamed from: a */
    public abstract void mo253a(C0107a aVar);

    /* renamed from: b */
    public abstract R mo254b(long j, TimeUnit timeUnit);
}
