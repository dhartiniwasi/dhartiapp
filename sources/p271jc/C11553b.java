package p271jc;

import android.content.Context;
import java.util.Objects;
import p403y6.C13056d;

/* renamed from: jc.b */
/* compiled from: ConsentRequestParametersWrapper */
class C11553b {

    /* renamed from: a */
    private final Boolean f44023a;

    /* renamed from: b */
    private final C11552a f44024b;

    C11553b(Boolean bool, C11552a aVar) {
        this.f44023a = bool;
        this.f44024b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13056d mo35651a(Context context) {
        C13056d.C13057a aVar = new C13056d.C13057a();
        Boolean bool = this.f44023a;
        if (bool != null) {
            aVar.mo38091c(bool.booleanValue());
        }
        C11552a aVar2 = this.f44024b;
        if (aVar2 != null) {
            aVar.mo38090b(aVar2.mo35646a(context));
        }
        return aVar.mo38089a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11552a mo35652b() {
        return this.f44024b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Boolean mo35653c() {
        return this.f44023a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11553b)) {
            return false;
        }
        C11553b bVar = (C11553b) obj;
        if (!Objects.equals(this.f44023a, bVar.mo35653c()) || !Objects.equals(this.f44024b, bVar.mo35652b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f44023a, this.f44024b});
    }
}
