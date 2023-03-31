package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p049g0.C4298a;
import p049g0.C4303d;

/* renamed from: androidx.lifecycle.h0 */
/* compiled from: ViewModelProvider.kt */
public class C1196h0 {

    /* renamed from: a */
    private final C1215k0 f3314a;

    /* renamed from: b */
    private final C1200b f3315b;

    /* renamed from: c */
    private final C4298a f3316c;

    /* renamed from: androidx.lifecycle.h0$b */
    /* compiled from: ViewModelProvider.kt */
    public interface C1200b {

        /* renamed from: a */
        public static final C1201a f3322a = C1201a.f3323a;

        /* renamed from: androidx.lifecycle.h0$b$a */
        /* compiled from: ViewModelProvider.kt */
        public static final class C1201a {

            /* renamed from: a */
            static final /* synthetic */ C1201a f3323a = new C1201a();

            private C1201a() {
            }
        }

        /* renamed from: a */
        <T extends C1194g0> T mo4232a(Class<T> cls);

        /* renamed from: b */
        <T extends C1194g0> T mo4233b(Class<T> cls, C4298a aVar);
    }

    /* renamed from: androidx.lifecycle.h0$c */
    /* compiled from: ViewModelProvider.kt */
    public static class C1202c implements C1200b {

        /* renamed from: b */
        public static final C1203a f3324b = new C1203a((C11665g) null);
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static C1202c f3325c;

        /* renamed from: d */
        public static final C4298a.C4300b<String> f3326d = C1203a.C1204a.f3327a;

        /* renamed from: androidx.lifecycle.h0$c$a */
        /* compiled from: ViewModelProvider.kt */
        public static final class C1203a {

            /* renamed from: androidx.lifecycle.h0$c$a$a */
            /* compiled from: ViewModelProvider.kt */
            private static final class C1204a implements C4298a.C4300b<String> {

                /* renamed from: a */
                public static final C1204a f3327a = new C1204a();

                private C1204a() {
                }
            }

            private C1203a() {
            }

            public /* synthetic */ C1203a(C11665g gVar) {
                this();
            }

            /* renamed from: a */
            public final C1202c mo4398a() {
                if (C1202c.f3325c == null) {
                    C1202c.f3325c = new C1202c();
                }
                C1202c c = C1202c.f3325c;
                C11669k.m56784b(c);
                return c;
            }
        }

        /* renamed from: a */
        public <T extends C1194g0> T mo4232a(Class<T> cls) {
            C11669k.m56787e(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                C11669k.m56786d(newInstance, "{\n                modelC…wInstance()\n            }");
                return (C1194g0) newInstance;
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }

        /* renamed from: b */
        public /* synthetic */ C1194g0 mo4233b(Class cls, C4298a aVar) {
            return C1207i0.m5420b(this, cls, aVar);
        }
    }

    /* renamed from: androidx.lifecycle.h0$d */
    /* compiled from: ViewModelProvider.kt */
    public static class C1205d {
        /* renamed from: c */
        public void mo4376c(C1194g0 g0Var) {
            C11669k.m56787e(g0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1196h0(C1215k0 k0Var, C1200b bVar) {
        this(k0Var, bVar, (C4298a) null, 4, (C11665g) null);
        C11669k.m56787e(k0Var, "store");
        C11669k.m56787e(bVar, "factory");
    }

    public C1196h0(C1215k0 k0Var, C1200b bVar, C4298a aVar) {
        C11669k.m56787e(k0Var, "store");
        C11669k.m56787e(bVar, "factory");
        C11669k.m56787e(aVar, "defaultCreationExtras");
        this.f3314a = k0Var;
        this.f3315b = bVar;
        this.f3316c = aVar;
    }

    /* renamed from: a */
    public <T extends C1194g0> T mo4395a(Class<T> cls) {
        C11669k.m56787e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4396b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C1194g0> T mo4396b(String str, Class<T> cls) {
        T t;
        C11669k.m56787e(str, "key");
        C11669k.m56787e(cls, "modelClass");
        T b = this.f3314a.mo4405b(str);
        if (cls.isInstance(b)) {
            C1200b bVar = this.f3315b;
            C1205d dVar = bVar instanceof C1205d ? (C1205d) bVar : null;
            if (dVar != null) {
                C11669k.m56786d(b, "viewModel");
                dVar.mo4376c(b);
            }
            Objects.requireNonNull(b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b;
        }
        C4303d dVar2 = new C4303d(this.f3316c);
        dVar2.mo17714c(C1202c.f3326d, str);
        try {
            t = this.f3315b.mo4233b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t = this.f3315b.mo4232a(cls);
        }
        this.f3314a.mo4407d(str, t);
        return t;
    }

    /* renamed from: androidx.lifecycle.h0$a */
    /* compiled from: ViewModelProvider.kt */
    public static class C1197a extends C1202c {

        /* renamed from: f */
        public static final C1198a f3317f = new C1198a((C11665g) null);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static C1197a f3318g;

        /* renamed from: h */
        public static final C4298a.C4300b<Application> f3319h = C1198a.C1199a.f3321a;

        /* renamed from: e */
        private final Application f3320e;

        /* renamed from: androidx.lifecycle.h0$a$a */
        /* compiled from: ViewModelProvider.kt */
        public static final class C1198a {

            /* renamed from: androidx.lifecycle.h0$a$a$a */
            /* compiled from: ViewModelProvider.kt */
            private static final class C1199a implements C4298a.C4300b<Application> {

                /* renamed from: a */
                public static final C1199a f3321a = new C1199a();

                private C1199a() {
                }
            }

            private C1198a() {
            }

            public /* synthetic */ C1198a(C11665g gVar) {
                this();
            }

            /* renamed from: a */
            public final C1197a mo4397a(Application application) {
                C11669k.m56787e(application, "application");
                if (C1197a.f3318g == null) {
                    C1197a.f3318g = new C1197a(application);
                }
                C1197a e = C1197a.f3318g;
                C11669k.m56784b(e);
                return e;
            }
        }

        private C1197a(Application application, int i) {
            this.f3320e = application;
        }

        /* renamed from: g */
        private final <T extends C1194g0> T m5407g(Class<T> cls, Application application) {
            if (!C1173a.class.isAssignableFrom(cls)) {
                return super.mo4232a(cls);
            }
            try {
                T t = (C1194g0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                C11669k.m56786d(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        /* renamed from: a */
        public <T extends C1194g0> T mo4232a(Class<T> cls) {
            C11669k.m56787e(cls, "modelClass");
            Application application = this.f3320e;
            if (application != null) {
                return m5407g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* renamed from: b */
        public <T extends C1194g0> T mo4233b(Class<T> cls, C4298a aVar) {
            C11669k.m56787e(cls, "modelClass");
            C11669k.m56787e(aVar, "extras");
            if (this.f3320e != null) {
                return mo4232a(cls);
            }
            Application application = (Application) aVar.mo17710a(f3319h);
            if (application != null) {
                return m5407g(cls, application);
            }
            if (!C1173a.class.isAssignableFrom(cls)) {
                return super.mo4232a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public C1197a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1197a(Application application) {
            this(application, 0);
            C11669k.m56787e(application, "application");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1196h0(C1215k0 k0Var, C1200b bVar, C4298a aVar, int i, C11665g gVar) {
        this(k0Var, bVar, (i & 4) != 0 ? C4298a.C4299a.f24176b : aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1196h0(androidx.lifecycle.C1217l0 r3, androidx.lifecycle.C1196h0.C1200b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.C11669k.m56787e(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C11669k.m56787e(r4, r0)
            androidx.lifecycle.k0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.C11669k.m56786d(r0, r1)
            g0.a r3 = androidx.lifecycle.C1212j0.m5429a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1196h0.<init>(androidx.lifecycle.l0, androidx.lifecycle.h0$b):void");
    }
}
