package kotlin.coroutines.jvm.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C11669k;

/* renamed from: kotlin.coroutines.jvm.internal.i */
/* compiled from: DebugMetadata.kt */
final class C11653i {

    /* renamed from: a */
    public static final C11653i f44221a = new C11653i();

    /* renamed from: b */
    private static final C11654a f44222b = new C11654a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    private static C11654a f44223c;

    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    /* compiled from: DebugMetadata.kt */
    private static final class C11654a {

        /* renamed from: a */
        public final Method f44224a;

        /* renamed from: b */
        public final Method f44225b;

        /* renamed from: c */
        public final Method f44226c;

        public C11654a(Method method, Method method2, Method method3) {
            this.f44224a = method;
            this.f44225b = method2;
            this.f44226c = method3;
        }
    }

    private C11653i() {
    }

    /* renamed from: a */
    private final C11654a m56772a(C11645a aVar) {
        try {
            C11654a aVar2 = new C11654a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(MediationMetaData.KEY_NAME, new Class[0]));
            f44223c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C11654a aVar3 = f44222b;
            f44223c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo35814b(C11645a aVar) {
        C11669k.m56787e(aVar, "continuation");
        C11654a aVar2 = f44223c;
        if (aVar2 == null) {
            aVar2 = m56772a(aVar);
        }
        if (aVar2 == f44222b) {
            return null;
        }
        Method method = aVar2.f44224a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f44225b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f44226c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
