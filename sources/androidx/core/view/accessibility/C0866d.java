package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.d */
/* compiled from: AccessibilityNodeProviderCompat */
public class C0866d {

    /* renamed from: a */
    private final Object f2529a;

    /* renamed from: androidx.core.view.accessibility.d$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0867a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0866d f2530a;

        C0867a(C0866d dVar) {
            this.f2530a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0862c b = this.f2530a.mo3343b(i);
            if (b == null) {
                return null;
            }
            return b.mo3332u0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0862c> c = this.f2530a.mo3344c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo3332u0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f2530a.mo3347f(i, i2, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.d$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0868b extends C0867a {
        C0868b(C0866d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0862c d = this.f2530a.mo3345d(i);
            if (d == null) {
                return null;
            }
            return d.mo3332u0();
        }
    }

    /* renamed from: androidx.core.view.accessibility.d$c */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0869c extends C0868b {
        C0869c(C0866d dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2530a.mo3342a(i, C0862c.m3934v0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C0866d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f2529a = new C0869c(this);
        } else if (i >= 19) {
            this.f2529a = new C0868b(this);
        } else if (i >= 16) {
            this.f2529a = new C0867a(this);
        } else {
            this.f2529a = null;
        }
    }

    /* renamed from: a */
    public void mo3342a(int i, C0862c cVar, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C0862c mo3343b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C0862c> mo3344c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C0862c mo3345d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo3346e() {
        return this.f2529a;
    }

    /* renamed from: f */
    public boolean mo3347f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0866d(Object obj) {
        this.f2529a = obj;
    }
}
