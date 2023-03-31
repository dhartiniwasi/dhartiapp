package p049g0;

import androidx.lifecycle.C1194g0;
import androidx.lifecycle.C1196h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.C11669k;
import p335qd.C12224a;
import p344rd.C12439l;
import p382vd.C12890c;

/* renamed from: g0.c */
/* compiled from: InitializerViewModelFactory.kt */
public final class C4302c {

    /* renamed from: a */
    private final List<C4305f<?>> f24178a = new ArrayList();

    /* renamed from: a */
    public final <T extends C1194g0> void mo17712a(C12890c<T> cVar, C12439l<? super C4298a, ? extends T> lVar) {
        C11669k.m56787e(cVar, "clazz");
        C11669k.m56787e(lVar, "initializer");
        this.f24178a.add(new C4305f(C12224a.m58665a(cVar), lVar));
    }

    /* renamed from: b */
    public final C1196h0.C1200b mo17713b() {
        Object[] array = this.f24178a.toArray(new C4305f[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        C4305f[] fVarArr = (C4305f[]) array;
        return new C4301b((C4305f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
