package p073j4;

import com.google.android.gms.internal.ads.C2876t9;
import com.google.android.gms.internal.ads.C2913u9;
import com.google.android.gms.internal.ads.C2951va;
import com.google.android.gms.internal.ads.C2986w8;
import com.google.android.gms.internal.ads.om0;
import java.util.Collections;
import java.util.Map;

/* renamed from: j4.k0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4784k0 extends C2951va {

    /* renamed from: w */
    final /* synthetic */ byte[] f25454w;

    /* renamed from: x */
    final /* synthetic */ Map f25455x;

    /* renamed from: y */
    final /* synthetic */ om0 f25456y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4784k0(C4802q0 q0Var, int i, String str, C2913u9 u9Var, C2876t9 t9Var, byte[] bArr, Map map, om0 om0) {
        super(i, str, u9Var, t9Var);
        this.f25454w = bArr;
        this.f25455x = map;
        this.f25456y = om0;
    }

    /* renamed from: E */
    public final byte[] mo13173E() throws C2986w8 {
        byte[] bArr = this.f25454w;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo14700G(String str) {
        this.f25456y.mo12981g(str);
        super.mo14700G(str);
    }

    /* renamed from: s */
    public final Map mo13185s() throws C2986w8 {
        Map map = this.f25455x;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ void mo13189v(Object obj) {
        mo14700G((String) obj);
    }
}
