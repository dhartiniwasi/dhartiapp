package p017b5;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p124r.C5413a;
import p137s5.C5489e;

/* renamed from: b5.p0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C1816p0 extends Fragment implements C1793e {

    /* renamed from: d */
    private static final WeakHashMap f5356d = new WeakHashMap();

    /* renamed from: a */
    private final Map f5357a = Collections.synchronizedMap(new C5413a());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f5358b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Bundle f5359c;

    /* renamed from: f */
    public static C1816p0 m8492f(Activity activity) {
        C1816p0 p0Var;
        WeakHashMap weakHashMap = f5356d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (p0Var = (C1816p0) weakReference.get()) != null) {
            return p0Var;
        }
        try {
            C1816p0 p0Var2 = (C1816p0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (p0Var2 == null || p0Var2.isRemoving()) {
                p0Var2 = new C1816p0();
                activity.getFragmentManager().beginTransaction().add(p0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(p0Var2));
            return p0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final void mo6925a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5357a.containsKey(str)) {
            this.f5357a.put(str, lifecycleCallback);
            if (this.f5358b > 0) {
                new C5489e(Looper.getMainLooper()).post(new C1814o0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo6926b(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f5357a.get(str));
    }

    /* renamed from: c */
    public final Activity mo6927c() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f5357a.values()) {
            a.mo8000a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f5357a.values()) {
            e.mo8002e(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5358b = 1;
        this.f5359c = bundle;
        for (Map.Entry entry : this.f5357a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo8003f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5358b = 5;
        for (LifecycleCallback g : this.f5357a.values()) {
            g.mo8004g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f5358b = 3;
        for (LifecycleCallback h : this.f5357a.values()) {
            h.mo8005h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f5357a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo8006i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f5358b = 2;
        for (LifecycleCallback j : this.f5357a.values()) {
            j.mo8007j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f5358b = 4;
        for (LifecycleCallback k : this.f5357a.values()) {
            k.mo8008k();
        }
    }
}
