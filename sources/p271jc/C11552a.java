package p271jc;

import android.content.Context;
import java.util.List;
import java.util.Objects;
import p403y6.C13049a;

/* renamed from: jc.a */
/* compiled from: ConsentDebugSettingsWrapper */
class C11552a {

    /* renamed from: a */
    private final Integer f44021a;

    /* renamed from: b */
    private final List<String> f44022b;

    C11552a(Integer num, List<String> list) {
        this.f44021a = num;
        this.f44022b = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13049a mo35646a(Context context) {
        C13049a.C13050a aVar = new C13049a.C13050a(context);
        Integer num = this.f44021a;
        if (num != null) {
            aVar.mo38085c(num.intValue());
        }
        List<String> list = this.f44022b;
        if (list != null) {
            for (String a : list) {
                aVar.mo38083a(a);
            }
        }
        return aVar.mo38084b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Integer mo35647b() {
        return this.f44021a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<String> mo35648c() {
        return this.f44022b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11552a)) {
            return false;
        }
        C11552a aVar = (C11552a) obj;
        if (!Objects.equals(this.f44021a, aVar.mo35647b()) || !Objects.equals(this.f44022b, aVar.mo35648c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f44021a, this.f44022b});
    }
}
