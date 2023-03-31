package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* compiled from: ActionProvider */
public abstract class C0882b {

    /* renamed from: a */
    private final Context f2532a;

    /* renamed from: b */
    private C0883a f2533b;

    /* renamed from: c */
    private C0884b f2534c;

    /* renamed from: androidx.core.view.b$a */
    /* compiled from: ActionProvider */
    public interface C0883a {
    }

    /* renamed from: androidx.core.view.b$b */
    /* compiled from: ActionProvider */
    public interface C0884b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0882b(Context context) {
        this.f2532a = context;
    }

    /* renamed from: a */
    public boolean mo1527a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1531b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1528c();

    /* renamed from: d */
    public View mo1532d(MenuItem menuItem) {
        return mo1528c();
    }

    /* renamed from: e */
    public boolean mo1529e() {
        return false;
    }

    /* renamed from: f */
    public void mo1530f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo1533g() {
        return false;
    }

    /* renamed from: h */
    public void mo3355h() {
        this.f2534c = null;
        this.f2533b = null;
    }

    /* renamed from: i */
    public void mo3356i(C0883a aVar) {
        this.f2533b = aVar;
    }

    /* renamed from: j */
    public void mo1534j(C0884b bVar) {
        if (!(this.f2534c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2534c = bVar;
    }
}
