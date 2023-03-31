package p325pc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: pc.h */
/* compiled from: ViewUtils */
public final class C12172h {

    /* renamed from: pc.h$a */
    /* compiled from: ViewUtils */
    public interface C12173a {
        /* renamed from: a */
        boolean mo36690a(View view);
    }

    /* renamed from: c */
    public static boolean m58452c(View view) {
        return m58458i(view, C12171g.f45259a);
    }

    /* renamed from: d */
    public static int m58453d(int i) {
        return Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : i;
    }

    /* renamed from: e */
    public static Activity m58454e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m58454e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m58455f(View view, Class<? extends View>[] clsArr) {
        return m58458i(view, new C12170f(clsArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ boolean m58457h(Class[] clsArr, View view) {
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m58458i(View view, C12173a aVar) {
        if (view == null) {
            return false;
        }
        if (aVar.mo36690a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (m58458i(viewGroup.getChildAt(i), aVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
