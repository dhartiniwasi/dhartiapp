package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.v */
/* compiled from: FragmentStore */
class C1145v {

    /* renamed from: a */
    private final ArrayList<Fragment> f3147a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1142u> f3148b = new HashMap<>();

    /* renamed from: c */
    private C1136q f3149c;

    C1145v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4264a(Fragment fragment) {
        if (!this.f3147a.contains(fragment)) {
            synchronized (this.f3147a) {
                this.f3147a.add(fragment);
            }
            fragment.f2848t = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4265b() {
        this.f3148b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4266c(String str) {
        return this.f3148b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4267d(int i) {
        for (C1142u next : this.f3148b.values()) {
            if (next != null) {
                next.mo4259t(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4268e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3148b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1142u next : this.f3148b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.mo4252k();
                    printWriter.println(k);
                    k.mo3804f(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3147a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3147a.get(i).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo4269f(String str) {
        C1142u uVar = this.f3148b.get(str);
        if (uVar != null) {
            return uVar.mo4252k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo4270g(int i) {
        for (int size = this.f3147a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3147a.get(size);
            if (fragment != null && fragment.f2807E == i) {
                return fragment;
            }
        }
        for (C1142u next : this.f3148b.values()) {
            if (next != null) {
                Fragment k = next.mo4252k();
                if (k.f2807E == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo4271h(String str) {
        if (str != null) {
            for (int size = this.f3147a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3147a.get(size);
                if (fragment != null && str.equals(fragment.f2809G)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1142u next : this.f3148b.values()) {
            if (next != null) {
                Fragment k = next.mo4252k();
                if (str.equals(k.f2809G)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo4272i(String str) {
        Fragment h;
        for (C1142u next : this.f3148b.values()) {
            if (next != null && (h = next.mo4252k().mo3809h(str)) != null) {
                return h;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo4273j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f2817O;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3147a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f3147a.get(i);
            if (fragment2.f2817O == viewGroup && (view2 = fragment2.f2818P) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3147a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3147a.get(indexOf);
            if (fragment3.f2817O == viewGroup && (view = fragment3.f2818P) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C1142u> mo4274k() {
        ArrayList arrayList = new ArrayList();
        for (C1142u next : this.f3148b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> mo4275l() {
        ArrayList arrayList = new ArrayList();
        for (C1142u next : this.f3148b.values()) {
            if (next != null) {
                arrayList.add(next.mo4252k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C1142u mo4276m(String str) {
        return this.f3148b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public List<Fragment> mo4277n() {
        ArrayList arrayList;
        if (this.f3147a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3147a) {
            arrayList = new ArrayList(this.f3147a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C1136q mo4278o() {
        return this.f3149c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4279p(C1142u uVar) {
        Fragment k = uVar.mo4252k();
        if (!mo4266c(k.f2832f)) {
            this.f3148b.put(k.f2832f, uVar);
            if (k.f2813K) {
                if (k.f2812J) {
                    this.f3149c.mo4220f(k);
                } else {
                    this.f3149c.mo4228n(k);
                }
                k.f2813K = false;
            }
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4280q(C1142u uVar) {
        Fragment k = uVar.mo4252k();
        if (k.f2812J) {
            this.f3149c.mo4228n(k);
        }
        if (this.f3148b.put(k.f2832f, (Object) null) != null && C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4281r() {
        Iterator<Fragment> it = this.f3147a.iterator();
        while (it.hasNext()) {
            C1142u uVar = this.f3148b.get(it.next().f2832f);
            if (uVar != null) {
                uVar.mo4253m();
            }
        }
        for (C1142u next : this.f3148b.values()) {
            if (next != null) {
                next.mo4253m();
                Fragment k = next.mo4252k();
                if (k.f2849u && !k.mo3787Y()) {
                    mo4280q(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4282s(Fragment fragment) {
        synchronized (this.f3147a) {
            this.f3147a.remove(fragment);
        }
        fragment.f2848t = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4283t() {
        this.f3148b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4284u(List<String> list) {
        this.f3147a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo4269f(next);
                if (f != null) {
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo4264a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList<C1140t> mo4285v() {
        ArrayList<C1140t> arrayList = new ArrayList<>(this.f3148b.size());
        for (C1142u next : this.f3148b.values()) {
            if (next != null) {
                Fragment k = next.mo4252k();
                C1140t r = next.mo4257r();
                arrayList.add(r);
                if (C1114n.m4999F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + r.f3138u);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList<String> mo4286w() {
        synchronized (this.f3147a) {
            if (this.f3147a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3147a.size());
            Iterator<Fragment> it = this.f3147a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2832f);
                if (C1114n.m4999F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2832f + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4287x(C1136q qVar) {
        this.f3149c = qVar;
    }
}
