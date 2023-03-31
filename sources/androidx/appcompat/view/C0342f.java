package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0336b;
import androidx.appcompat.view.menu.C0373j;
import androidx.appcompat.view.menu.C0387o;
import java.util.ArrayList;
import p124r.C5426g;
import p145u.C5616a;
import p145u.C5617b;

/* renamed from: androidx.appcompat.view.f */
/* compiled from: SupportActionModeWrapper */
public class C0342f extends ActionMode {

    /* renamed from: a */
    final Context f943a;

    /* renamed from: b */
    final C0336b f944b;

    /* renamed from: androidx.appcompat.view.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C0343a implements C0336b.C0337a {

        /* renamed from: a */
        final ActionMode.Callback f945a;

        /* renamed from: b */
        final Context f946b;

        /* renamed from: c */
        final ArrayList<C0342f> f947c = new ArrayList<>();

        /* renamed from: d */
        final C5426g<Menu, Menu> f948d = new C5426g<>();

        public C0343a(Context context, ActionMode.Callback callback) {
            this.f946b = context;
            this.f945a = callback;
        }

        /* renamed from: f */
        private Menu m1672f(Menu menu) {
            Menu menu2 = this.f948d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0387o oVar = new C0387o(this.f946b, (C5616a) menu);
            this.f948d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public void mo998a(C0336b bVar) {
            this.f945a.onDestroyActionMode(mo1140e(bVar));
        }

        /* renamed from: b */
        public boolean mo999b(C0336b bVar, Menu menu) {
            return this.f945a.onCreateActionMode(mo1140e(bVar), m1672f(menu));
        }

        /* renamed from: c */
        public boolean mo1000c(C0336b bVar, Menu menu) {
            return this.f945a.onPrepareActionMode(mo1140e(bVar), m1672f(menu));
        }

        /* renamed from: d */
        public boolean mo1001d(C0336b bVar, MenuItem menuItem) {
            return this.f945a.onActionItemClicked(mo1140e(bVar), new C0373j(this.f946b, (C5617b) menuItem));
        }

        /* renamed from: e */
        public ActionMode mo1140e(C0336b bVar) {
            int size = this.f947c.size();
            for (int i = 0; i < size; i++) {
                C0342f fVar = this.f947c.get(i);
                if (fVar != null && fVar.f944b == bVar) {
                    return fVar;
                }
            }
            C0342f fVar2 = new C0342f(this.f946b, bVar);
            this.f947c.add(fVar2);
            return fVar2;
        }
    }

    public C0342f(Context context, C0336b bVar) {
        this.f943a = context;
        this.f944b = bVar;
    }

    public void finish() {
        this.f944b.mo1087c();
    }

    public View getCustomView() {
        return this.f944b.mo1088d();
    }

    public Menu getMenu() {
        return new C0387o(this.f943a, (C5616a) this.f944b.mo1089e());
    }

    public MenuInflater getMenuInflater() {
        return this.f944b.mo1090f();
    }

    public CharSequence getSubtitle() {
        return this.f944b.mo1091g();
    }

    public Object getTag() {
        return this.f944b.mo1109h();
    }

    public CharSequence getTitle() {
        return this.f944b.mo1092i();
    }

    public boolean getTitleOptionalHint() {
        return this.f944b.mo1110j();
    }

    public void invalidate() {
        this.f944b.mo1093k();
    }

    public boolean isTitleOptional() {
        return this.f944b.mo1094l();
    }

    public void setCustomView(View view) {
        this.f944b.mo1095m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f944b.mo1097o(charSequence);
    }

    public void setTag(Object obj) {
        this.f944b.mo1111p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f944b.mo1099r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f944b.mo1100s(z);
    }

    public void setSubtitle(int i) {
        this.f944b.mo1096n(i);
    }

    public void setTitle(int i) {
        this.f944b.mo1098q(i);
    }
}
