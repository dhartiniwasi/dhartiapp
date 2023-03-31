package p008a8;

import com.google.firebase.firestore.C7926n;
import com.google.firebase.firestore.C7959y;
import java.util.concurrent.Executor;

/* renamed from: a8.h */
/* compiled from: AsyncEventListener */
public class C6471h<T> implements C7926n<T> {

    /* renamed from: a */
    private final Executor f30761a;

    /* renamed from: b */
    private final C7926n<T> f30762b;

    /* renamed from: c */
    private volatile boolean f30763c = false;

    public C6471h(Executor executor, C7926n<T> nVar) {
        this.f30761a = executor;
        this.f30762b = nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m37730c(Object obj, C7959y yVar) {
        if (!this.f30763c) {
            this.f30762b.mo21951a(obj, yVar);
        }
    }

    /* renamed from: a */
    public void mo21951a(T t, C7959y yVar) {
        this.f30761a.execute(new C0128g(this, t, yVar));
    }

    /* renamed from: d */
    public void mo21952d() {
        this.f30763c = true;
    }
}
