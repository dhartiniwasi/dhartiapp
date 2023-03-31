package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C1194g0;
import androidx.lifecycle.C1196h0;
import androidx.lifecycle.C1207i0;
import androidx.lifecycle.C1215k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p049g0.C4298a;

/* renamed from: androidx.fragment.app.q */
/* compiled from: FragmentManagerViewModel */
final class C1136q extends C1194g0 {

    /* renamed from: k */
    private static final C1196h0.C1200b f3118k = new C1137a();

    /* renamed from: d */
    private final HashMap<String, Fragment> f3119d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1136q> f3120e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C1215k0> f3121f = new HashMap<>();

    /* renamed from: g */
    private final boolean f3122g;

    /* renamed from: h */
    private boolean f3123h = false;

    /* renamed from: i */
    private boolean f3124i = false;

    /* renamed from: j */
    private boolean f3125j = false;

    /* renamed from: androidx.fragment.app.q$a */
    /* compiled from: FragmentManagerViewModel */
    class C1137a implements C1196h0.C1200b {
        C1137a() {
        }

        /* renamed from: a */
        public <T extends C1194g0> T mo4232a(Class<T> cls) {
            return new C1136q(true);
        }

        /* renamed from: b */
        public /* synthetic */ C1194g0 mo4233b(Class cls, C4298a aVar) {
            return C1207i0.m5420b(this, cls, aVar);
        }
    }

    C1136q(boolean z) {
        this.f3122g = z;
    }

    /* renamed from: j */
    static C1136q m5162j(C1215k0 k0Var) {
        return (C1136q) new C1196h0(k0Var, f3118k).mo4395a(C1136q.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4218d() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3123h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1136q.class != obj.getClass()) {
            return false;
        }
        C1136q qVar = (C1136q) obj;
        if (!this.f3119d.equals(qVar.f3119d) || !this.f3120e.equals(qVar.f3120e) || !this.f3121f.equals(qVar.f3121f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4220f(Fragment fragment) {
        if (this.f3125j) {
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f3119d.containsKey(fragment.f2832f)) {
            this.f3119d.put(fragment.f2832f, fragment);
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4221g(Fragment fragment) {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C1136q qVar = this.f3120e.get(fragment.f2832f);
        if (qVar != null) {
            qVar.mo4218d();
            this.f3120e.remove(fragment.f2832f);
        }
        C1215k0 k0Var = this.f3121f.get(fragment.f2832f);
        if (k0Var != null) {
            k0Var.mo4404a();
            this.f3121f.remove(fragment.f2832f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo4222h(String str) {
        return this.f3119d.get(str);
    }

    public int hashCode() {
        return (((this.f3119d.hashCode() * 31) + this.f3120e.hashCode()) * 31) + this.f3121f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1136q mo4224i(Fragment fragment) {
        C1136q qVar = this.f3120e.get(fragment.f2832f);
        if (qVar != null) {
            return qVar;
        }
        C1136q qVar2 = new C1136q(this.f3122g);
        this.f3120e.put(fragment.f2832f, qVar2);
        return qVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Collection<Fragment> mo4225k() {
        return new ArrayList(this.f3119d.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1215k0 mo4226l(Fragment fragment) {
        C1215k0 k0Var = this.f3121f.get(fragment.f2832f);
        if (k0Var != null) {
            return k0Var;
        }
        C1215k0 k0Var2 = new C1215k0();
        this.f3121f.put(fragment.f2832f, k0Var2);
        return k0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo4227m() {
        return this.f3123h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4228n(Fragment fragment) {
        if (!this.f3125j) {
            if ((this.f3119d.remove(fragment.f2832f) != null) && C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4229o(boolean z) {
        this.f3125j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4230p(Fragment fragment) {
        if (!this.f3119d.containsKey(fragment.f2832f)) {
            return true;
        }
        if (this.f3122g) {
            return this.f3123h;
        }
        return !this.f3124i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3119d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3120e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3121f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
