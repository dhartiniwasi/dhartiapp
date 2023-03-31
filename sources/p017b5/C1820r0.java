package p017b5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.C1093e;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p124r.C5413a;
import p137s5.C5489e;

/* renamed from: b5.r0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C1820r0 extends Fragment implements C1793e {

    /* renamed from: t0 */
    private static final WeakHashMap f5364t0 = new WeakHashMap();

    /* renamed from: q0 */
    private final Map f5365q0 = Collections.synchronizedMap(new C5413a());
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public int f5366r0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public Bundle f5367s0;

    /* renamed from: H1 */
    public static C1820r0 m8498H1(C1093e eVar) {
        C1820r0 r0Var;
        WeakHashMap weakHashMap = f5364t0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (r0Var = (C1820r0) weakReference.get()) != null) {
            return r0Var;
        }
        try {
            C1820r0 r0Var2 = (C1820r0) eVar.getSupportFragmentManager().mo4147i0("SupportLifecycleFragmentImpl");
            if (r0Var2 == null || r0Var2.mo3793b0()) {
                r0Var2 = new C1820r0();
                eVar.getSupportFragmentManager().mo4154l().mo4290d(r0Var2, "SupportLifecycleFragmentImpl").mo3884g();
            }
            weakHashMap.put(eVar, new WeakReference(r0Var2));
            return r0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: H0 */
    public final void mo3756H0() {
        super.mo3756H0();
        this.f5366r0 = 3;
        for (LifecycleCallback h : this.f5365q0.values()) {
            h.mo8005h();
        }
    }

    /* renamed from: I0 */
    public final void mo3758I0(Bundle bundle) {
        super.mo3758I0(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f5365q0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo8006i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* renamed from: J0 */
    public final void mo3760J0() {
        super.mo3760J0();
        this.f5366r0 = 2;
        for (LifecycleCallback j : this.f5365q0.values()) {
            j.mo8007j();
        }
    }

    /* renamed from: K0 */
    public final void mo3762K0() {
        super.mo3762K0();
        this.f5366r0 = 4;
        for (LifecycleCallback k : this.f5365q0.values()) {
            k.mo8008k();
        }
    }

    /* renamed from: a */
    public final void mo6925a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5365q0.containsKey(str)) {
            this.f5365q0.put(str, lifecycleCallback);
            if (this.f5366r0 > 0) {
                new C5489e(Looper.getMainLooper()).post(new C1818q0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo6926b(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f5365q0.get(str));
    }

    /* renamed from: c */
    public final /* synthetic */ Activity mo6927c() {
        return mo3813i();
    }

    /* renamed from: f */
    public final void mo3804f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3804f(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f5365q0.values()) {
            a.mo8000a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: h0 */
    public final void mo3810h0(int i, int i2, Intent intent) {
        super.mo3810h0(i, i2, intent);
        for (LifecycleCallback e : this.f5365q0.values()) {
            e.mo8002e(i, i2, intent);
        }
    }

    /* renamed from: m0 */
    public final void mo3826m0(Bundle bundle) {
        super.mo3826m0(bundle);
        this.f5366r0 = 1;
        this.f5367s0 = bundle;
        for (Map.Entry entry : this.f5365q0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo8003f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* renamed from: r0 */
    public final void mo3843r0() {
        super.mo3843r0();
        this.f5366r0 = 5;
        for (LifecycleCallback g : this.f5365q0.values()) {
            g.mo8004g();
        }
    }
}
