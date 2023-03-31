package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.x0 */
/* compiled from: TintContextWrapper */
public class C0569x0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1866c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0569x0>> f1867d;

    /* renamed from: a */
    private final Resources f1868a;

    /* renamed from: b */
    private final Resources.Theme f1869b;

    private C0569x0(Context context) {
        super(context);
        if (C0501i1.m2469c()) {
            C0501i1 i1Var = new C0501i1(this, context.getResources());
            this.f1868a = i1Var;
            Resources.Theme newTheme = i1Var.newTheme();
            this.f1869b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1868a = new C0573z0(this, context.getResources());
        this.f1869b = null;
    }

    /* renamed from: a */
    private static boolean m2724a(Context context) {
        if ((context instanceof C0569x0) || (context.getResources() instanceof C0573z0) || (context.getResources() instanceof C0501i1)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || C0501i1.m2469c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m2725b(Context context) {
        if (!m2724a(context)) {
            return context;
        }
        synchronized (f1866c) {
            ArrayList<WeakReference<C0569x0>> arrayList = f1867d;
            if (arrayList == null) {
                f1867d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1867d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1867d.remove(size);
                    }
                }
                for (int size2 = f1867d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1867d.get(size2);
                    C0569x0 x0Var = weakReference2 != null ? (C0569x0) weakReference2.get() : null;
                    if (x0Var != null && x0Var.getBaseContext() == context) {
                        return x0Var;
                    }
                }
            }
            C0569x0 x0Var2 = new C0569x0(context);
            f1867d.add(new WeakReference(x0Var2));
            return x0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1868a.getAssets();
    }

    public Resources getResources() {
        return this.f1868a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1869b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1869b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
