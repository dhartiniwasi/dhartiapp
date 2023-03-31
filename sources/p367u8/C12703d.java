package p367u8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: u8.d */
/* compiled from: GlobalLibraryVersionRegistrar */
public class C12703d {

    /* renamed from: b */
    private static volatile C12703d f46475b;

    /* renamed from: a */
    private final Set<C12705f> f46476a = new HashSet();

    C12703d() {
    }

    /* renamed from: a */
    public static C12703d m60241a() {
        C12703d dVar = f46475b;
        if (dVar == null) {
            synchronized (C12703d.class) {
                dVar = f46475b;
                if (dVar == null) {
                    dVar = new C12703d();
                    f46475b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C12705f> mo37579b() {
        Set<C12705f> unmodifiableSet;
        synchronized (this.f46476a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f46476a);
        }
        return unmodifiableSet;
    }
}
