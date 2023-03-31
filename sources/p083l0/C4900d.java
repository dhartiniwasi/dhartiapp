package p083l0;

import androidx.room.C1450h;
import java.util.concurrent.atomic.AtomicBoolean;
import p111p0.C5257f;

/* renamed from: l0.d */
/* compiled from: SharedSQLiteStatement */
public abstract class C4900d {

    /* renamed from: a */
    private final AtomicBoolean f25856a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C1450h f25857b;

    /* renamed from: c */
    private volatile C5257f f25858c;

    public C4900d(C1450h hVar) {
        this.f25857b = hVar;
    }

    /* renamed from: c */
    private C5257f m31114c() {
        return this.f25857b.mo5593d(mo17721d());
    }

    /* renamed from: e */
    private C5257f m31115e(boolean z) {
        if (!z) {
            return m31114c();
        }
        if (this.f25858c == null) {
            this.f25858c = m31114c();
        }
        return this.f25858c;
    }

    /* renamed from: a */
    public C5257f mo18718a() {
        mo18719b();
        return m31115e(this.f25856a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18719b() {
        this.f25857b.mo5590a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo17721d();

    /* renamed from: f */
    public void mo18720f(C5257f fVar) {
        if (fVar == this.f25858c) {
            this.f25856a.set(false);
        }
    }
}
