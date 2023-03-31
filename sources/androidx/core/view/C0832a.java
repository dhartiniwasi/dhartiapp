package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C0862c;
import androidx.core.view.accessibility.C0866d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p138t.C5493d;

/* renamed from: androidx.core.view.a */
/* compiled from: AccessibilityDelegateCompat */
public class C0832a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f2443c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f2444a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f2445b;

    /* renamed from: androidx.core.view.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0833a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0832a f2446a;

        C0833a(C0832a aVar) {
            this.f2446a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2446a.mo3227a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0866d b = this.f2446a.mo3228b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo3346e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2446a.mo3230f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0862c v0 = C0862c.m3934v0(accessibilityNodeInfo);
            v0.mo3320n0(C0835a0.m3708U(view));
            v0.mo3309h0(C0835a0.m3703P(view));
            v0.mo3314k0(C0835a0.m3744p(view));
            v0.mo3327r0(C0835a0.m3696I(view));
            this.f2446a.mo3231g(view, v0);
            v0.mo3303e(accessibilityNodeInfo.getText(), view);
            List<C0862c.C0863a> c = C0832a.m3665c(view);
            for (int i = 0; i < c.size(); i++) {
                v0.mo3298b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2446a.mo3232h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2446a.mo3233i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2446a.mo3234j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f2446a.mo3235l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2446a.mo3236m(view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.core.view.a$b */
    /* compiled from: AccessibilityDelegateCompat */
    static class C0834b {
        /* renamed from: a */
        static AccessibilityNodeProvider m3678a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m3679b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C0832a() {
        this(f2443c);
    }

    /* renamed from: c */
    static List<C0862c.C0863a> m3665c(View view) {
        List<C0862c.C0863a> list = (List) view.getTag(C5493d.f27870P);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m3666e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p = C0862c.m3931p(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (p != null && i < p.length) {
                if (clickableSpan.equals(p[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m3667k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C5493d.f27871Q);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m3666e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo3227a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2444a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0866d mo3228b(View view) {
        AccessibilityNodeProvider a;
        if (Build.VERSION.SDK_INT < 16 || (a = C0834b.m3678a(this.f2444a, view)) == null) {
            return null;
        }
        return new C0866d(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo3229d() {
        return this.f2445b;
    }

    /* renamed from: f */
    public void mo3230f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2444a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3231g(View view, C0862c cVar) {
        this.f2444a.onInitializeAccessibilityNodeInfo(view, cVar.mo3332u0());
    }

    /* renamed from: h */
    public void mo3232h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2444a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo3233i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2444a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo3234j(View view, int i, Bundle bundle) {
        List<C0862c.C0863a> c = m3665c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C0862c.C0863a aVar = c.get(i2);
            if (aVar.mo3337b() == i) {
                z = aVar.mo3339d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = C0834b.m3679b(this.f2444a, view, i, bundle);
        }
        return (z || i != C5493d.f27881a || bundle == null) ? z : m3667k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo3235l(View view, int i) {
        this.f2444a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo3236m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2444a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0832a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2444a = accessibilityDelegate;
        this.f2445b = new C0833a(this);
    }
}
