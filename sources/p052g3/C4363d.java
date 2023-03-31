package p052g3;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p004a2.C0079u1;
import p037e2.C4215l;
import p037e2.C4216m;
import p085l2.C4912f;
import p092m2.C5017g;
import p092m2.C5028o;
import p106o2.C5168b;
import p106o2.C5173e;
import p106o2.C5178h;
import p106o2.C5179h0;
import p106o2.C5183i0;
import p106o2.C5188j;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5940i0;
import p161w3.C5946k;
import p161w3.C5967v;
import p177z1.C6272r1;
import p219e7.C9998d;

/* renamed from: g3.d */
/* compiled from: DefaultHlsExtractorFactory */
public final class C4363d implements C4373h {

    /* renamed from: d */
    private static final int[] f24317d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    private final int f24318b;

    /* renamed from: c */
    private final boolean f24319c;

    public C4363d() {
        this(0, true);
    }

    /* renamed from: b */
    private static void m29020b(int i, List<Integer> list) {
        if (C9998d.m51072g(f24317d, i) != -1 && !list.contains(Integer.valueOf(i))) {
            list.add(Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    private C4215l m29021d(int i, C6272r1 r1Var, List<C6272r1> list, C5940i0 i0Var) {
        if (i == 0) {
            return new C5168b();
        }
        if (i == 1) {
            return new C5173e();
        }
        if (i == 2) {
            return new C5178h();
        }
        if (i == 7) {
            return new C4912f(0, 0);
        }
        if (i == 8) {
            return m29022e(i0Var, r1Var, list);
        }
        if (i == 11) {
            return m29023f(this.f24318b, this.f24319c, r1Var, list, i0Var);
        }
        if (i != 13) {
            return null;
        }
        return new C4389t(r1Var.f30234c, i0Var);
    }

    /* renamed from: e */
    private static C5017g m29022e(C5940i0 i0Var, C6272r1 r1Var, List<C6272r1> list) {
        int i = m29024g(r1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C5017g(i, i0Var, (C5028o) null, list);
    }

    /* renamed from: f */
    private static C5179h0 m29023f(int i, boolean z, C6272r1 r1Var, List<C6272r1> list, C5940i0 i0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else if (z) {
            list = Collections.singletonList(new C6272r1.C6274b().mo21517e0("application/cea-608").mo21491E());
        } else {
            list = Collections.emptyList();
        }
        String str = r1Var.f30240i;
        if (!TextUtils.isEmpty(str)) {
            if (!C5967v.m35238b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!C5967v.m35238b(str, "video/avc")) {
                i2 |= 4;
            }
        }
        return new C5179h0(2, i0Var, (C5183i0.C5186c) new C5188j(i2, list));
    }

    /* renamed from: g */
    private static boolean m29024g(C6272r1 r1Var) {
        C5432a aVar = r1Var.f30241r;
        if (aVar == null) {
            return false;
        }
        for (int i = 0; i < aVar.mo19696d(); i++) {
            C5432a.C5434b c = aVar.mo19695c(i);
            if (c instanceof C4383q) {
                return !((C4383q) c).f24473c.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private static boolean m29025h(C4215l lVar, C4216m mVar) throws IOException {
        try {
            boolean h = lVar.mo17583h(mVar);
            mVar.mo17560j();
            return h;
        } catch (EOFException unused) {
            mVar.mo17560j();
            return false;
        } catch (Throwable th) {
            mVar.mo17560j();
            throw th;
        }
    }

    /* renamed from: c */
    public C4361b mo17805a(Uri uri, C6272r1 r1Var, List<C6272r1> list, C5940i0 i0Var, Map<String, List<String>> map, C4216m mVar, C0079u1 u1Var) throws IOException {
        int a = C5946k.m35048a(r1Var.f30243t);
        int b = C5946k.m35049b(map);
        int c = C5946k.m35050c(uri);
        int[] iArr = f24317d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m29020b(a, arrayList);
        m29020b(b, arrayList);
        m29020b(c, arrayList);
        for (int b2 : iArr) {
            m29020b(b2, arrayList);
        }
        C4215l lVar = null;
        mVar.mo17560j();
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = ((Integer) arrayList.get(i)).intValue();
            C4215l lVar2 = (C4215l) C5917a.m34872e(m29021d(intValue, r1Var, list, i0Var));
            if (m29025h(lVar2, mVar)) {
                return new C4361b(lVar2, r1Var, i0Var);
            }
            if (lVar == null && (intValue == a || intValue == b || intValue == c || intValue == 11)) {
                lVar = lVar2;
            }
        }
        return new C4361b((C4215l) C5917a.m34872e(lVar), r1Var, i0Var);
    }

    public C4363d(int i, boolean z) {
        this.f24318b = i;
        this.f24319c = z;
    }
}
