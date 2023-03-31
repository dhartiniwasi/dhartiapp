package p377v8;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11953j;

/* renamed from: v8.b */
/* compiled from: ComponentMonitor */
public class C12853b implements C11953j {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m60796c(String str, C11934c cVar, C11940e eVar) {
        try {
            C12854c.m60799b(str);
            return cVar.mo36247h().mo25989a(eVar);
        } finally {
            C12854c.m60798a();
        }
    }

    /* renamed from: a */
    public List<C11934c<?>> mo36279a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C11934c next : componentRegistrar.getComponents()) {
            String i = next.mo36248i();
            if (i != null) {
                next = next.mo36254t(new C12852a(i, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
