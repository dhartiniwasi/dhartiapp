package p410yd;

import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11719p;
import kotlinx.coroutines.internal.C11721r;

/* renamed from: yd.a2 */
/* compiled from: JobSupport.kt */
public final class C13267a2 extends C11719p implements C13319k1 {
    /* renamed from: b */
    public boolean mo38390b() {
        return true;
    }

    /* renamed from: e */
    public C13267a2 mo38391e() {
        return this;
    }

    public String toString() {
        return C13330n0.m62283c() ? mo38392x("Active") : super.toString();
    }

    /* renamed from: x */
    public final String mo38392x(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (C11721r rVar = (C11721r) mo35930n(); !C11669k.m56783a(rVar, this); rVar = rVar.mo35931o()) {
            if (rVar instanceof C13357v1) {
                C13357v1 v1Var = (C13357v1) rVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(v1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        C11669k.m56786d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
