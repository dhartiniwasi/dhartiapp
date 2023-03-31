package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.core.util.C0824b;
import androidx.lifecycle.C1194g0;
import androidx.lifecycle.C1196h0;
import androidx.lifecycle.C1207i0;
import androidx.lifecycle.C1215k0;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1228t;
import androidx.lifecycle.C1229u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p049g0.C4298a;
import p056h0.C4412a;
import p124r.C5427h;

/* renamed from: androidx.loader.app.b */
/* compiled from: LoaderManagerImpl */
class C1243b extends C1242a {

    /* renamed from: c */
    static boolean f3373c = false;

    /* renamed from: a */
    private final C1220n f3374a;

    /* renamed from: b */
    private final C1245b f3375b;

    /* renamed from: androidx.loader.app.b$a */
    /* compiled from: LoaderManagerImpl */
    public static class C1244a<D> extends C1228t<D> {

        /* renamed from: l */
        private final int f3376l;

        /* renamed from: m */
        private final Bundle f3377m;

        /* renamed from: n */
        private final C4412a<D> f3378n;

        /* renamed from: o */
        private C1220n f3379o;

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo4350f() {
            if (C1243b.f3373c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo4351g() {
            if (C1243b.f3373c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* renamed from: i */
        public void mo4353i(C1229u<? super D> uVar) {
            super.mo4353i(uVar);
            this.f3379o = null;
        }

        /* renamed from: j */
        public void mo4354j(D d) {
            super.mo4354j(d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C4412a<D> mo4459k(boolean z) {
            if (C1243b.f3373c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        /* renamed from: l */
        public void mo4460l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3376l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3377m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3378n);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo4461m() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3376l);
            sb.append(" : ");
            C0824b.m3641a(this.f3378n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    /* compiled from: LoaderManagerImpl */
    static class C1245b extends C1194g0 {

        /* renamed from: f */
        private static final C1196h0.C1200b f3380f = new C1246a();

        /* renamed from: d */
        private C5427h<C1244a> f3381d = new C5427h<>();

        /* renamed from: e */
        private boolean f3382e = false;

        /* renamed from: androidx.loader.app.b$b$a */
        /* compiled from: LoaderManagerImpl */
        static class C1246a implements C1196h0.C1200b {
            C1246a() {
            }

            /* renamed from: a */
            public <T extends C1194g0> T mo4232a(Class<T> cls) {
                return new C1245b();
            }

            /* renamed from: b */
            public /* synthetic */ C1194g0 mo4233b(Class cls, C4298a aVar) {
                return C1207i0.m5420b(this, cls, aVar);
            }
        }

        C1245b() {
        }

        /* renamed from: g */
        static C1245b m5505g(C1215k0 k0Var) {
            return (C1245b) new C1196h0(k0Var, f3380f).mo4395a(C1245b.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo4218d() {
            super.mo4218d();
            int j = this.f3381d.mo19690j();
            for (int i = 0; i < j; i++) {
                this.f3381d.mo19691k(i).mo4459k(true);
            }
            this.f3381d.mo19682b();
        }

        /* renamed from: f */
        public void mo4463f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3381d.mo19690j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f3381d.mo19690j(); i++) {
                    C1244a k = this.f3381d.mo19691k(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3381d.mo19688h(i));
                    printWriter.print(": ");
                    printWriter.println(k.toString());
                    k.mo4460l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4464h() {
            int j = this.f3381d.mo19690j();
            for (int i = 0; i < j; i++) {
                this.f3381d.mo19691k(i).mo4461m();
            }
        }
    }

    C1243b(C1220n nVar, C1215k0 k0Var) {
        this.f3374a = nVar;
        this.f3375b = C1245b.m5505g(k0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo4456a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3375b.mo4463f(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo4457c() {
        this.f3375b.mo4464h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0824b.m3641a(this.f3374a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
