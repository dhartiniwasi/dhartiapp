package p149u3;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p015b3.C1776x0;
import p015b3.C1780z0;
import p149u3.C5739u;
import p155v3.C5804g0;
import p177z1.C6290v3;
import p190b7.C6685q;

/* renamed from: u3.a0 */
/* compiled from: TrackSelectionUtil */
public final class C5716a0 {
    /* renamed from: a */
    public static C6290v3 m34077a(C5739u.C5740a aVar, List<? extends C5741v>[] listArr) {
        boolean z;
        C5739u.C5740a aVar2 = aVar;
        C6685q.C6686a aVar3 = new C6685q.C6686a();
        for (int i = 0; i < aVar.mo20221d(); i++) {
            C1780z0 f = aVar2.mo20223f(i);
            List<? extends C5741v> list = listArr[i];
            for (int i2 = 0; i2 < f.f5296a; i2++) {
                C1776x0 b = f.mo6903b(i2);
                boolean z2 = aVar2.mo20218a(i, i2, false) != 0;
                int i3 = b.f5280a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < b.f5280a; i4++) {
                    iArr[i4] = aVar2.mo20224g(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        C5741v vVar = (C5741v) list.get(i5);
                        if (vVar.mo20142a().equals(b) && vVar.mo20146e(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                aVar3.mo22506a(new C6290v3.C6291a(b, z2, iArr, zArr));
            }
        }
        C1780z0 h = aVar.mo20225h();
        for (int i6 = 0; i6 < h.f5296a; i6++) {
            C1776x0 b2 = h.mo6903b(i6);
            int[] iArr2 = new int[b2.f5280a];
            Arrays.fill(iArr2, 0);
            aVar3.mo22506a(new C6290v3.C6291a(b2, false, iArr2, new boolean[b2.f5280a]));
        }
        return new C6290v3(aVar3.mo22547h());
    }

    /* renamed from: b */
    public static C6290v3 m34078b(C5739u.C5740a aVar, C5741v[] vVarArr) {
        List[] listArr = new List[vVarArr.length];
        for (int i = 0; i < vVarArr.length; i++) {
            C5741v vVar = vVarArr[i];
            listArr[i] = vVar != null ? C6685q.m38446y(vVar) : C6685q.m38445x();
        }
        return m34077a(aVar, listArr);
    }

    /* renamed from: c */
    public static C5804g0.C5805a m34079c(C5735s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (sVar.mo20151k(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new C5804g0.C5805a(1, 0, length, i);
    }
}
