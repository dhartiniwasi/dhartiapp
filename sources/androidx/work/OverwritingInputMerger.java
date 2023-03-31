package androidx.work;

import androidx.work.C1536b;
import java.util.HashMap;
import java.util.List;
import p170y0.C6091h;

public final class OverwritingInputMerger extends C6091h {
    /* renamed from: b */
    public C1536b mo6236b(List<C1536b> list) {
        C1536b.C1537a aVar = new C1536b.C1537a();
        HashMap hashMap = new HashMap();
        for (C1536b j : list) {
            hashMap.putAll(j.mo6304j());
        }
        aVar.mo6312d(hashMap);
        return aVar.mo6309a();
    }
}
