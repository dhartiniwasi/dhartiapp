package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.appcompat.view.b */
/* compiled from: ActionMode */
public abstract class C0336b {

    /* renamed from: a */
    private Object f928a;

    /* renamed from: b */
    private boolean f929b;

    /* renamed from: androidx.appcompat.view.b$a */
    /* compiled from: ActionMode */
    public interface C0337a {
        /* renamed from: a */
        void mo998a(C0336b bVar);

        /* renamed from: b */
        boolean mo999b(C0336b bVar, Menu menu);

        /* renamed from: c */
        boolean mo1000c(C0336b bVar, Menu menu);

        /* renamed from: d */
        boolean mo1001d(C0336b bVar, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo1087c();

    /* renamed from: d */
    public abstract View mo1088d();

    /* renamed from: e */
    public abstract Menu mo1089e();

    /* renamed from: f */
    public abstract MenuInflater mo1090f();

    /* renamed from: g */
    public abstract CharSequence mo1091g();

    /* renamed from: h */
    public Object mo1109h() {
        return this.f928a;
    }

    /* renamed from: i */
    public abstract CharSequence mo1092i();

    /* renamed from: j */
    public boolean mo1110j() {
        return this.f929b;
    }

    /* renamed from: k */
    public abstract void mo1093k();

    /* renamed from: l */
    public abstract boolean mo1094l();

    /* renamed from: m */
    public abstract void mo1095m(View view);

    /* renamed from: n */
    public abstract void mo1096n(int i);

    /* renamed from: o */
    public abstract void mo1097o(CharSequence charSequence);

    /* renamed from: p */
    public void mo1111p(Object obj) {
        this.f928a = obj;
    }

    /* renamed from: q */
    public abstract void mo1098q(int i);

    /* renamed from: r */
    public abstract void mo1099r(CharSequence charSequence);

    /* renamed from: s */
    public void mo1100s(boolean z) {
        this.f929b = z;
    }
}
