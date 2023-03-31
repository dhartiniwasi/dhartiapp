package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p124r.C5426g;
import p145u.C5617b;
import p145u.C5618c;

/* renamed from: androidx.appcompat.view.menu.c */
/* compiled from: BaseMenuWrapper */
abstract class C0357c {

    /* renamed from: a */
    final Context f1062a;

    /* renamed from: b */
    private C5426g<C5617b, MenuItem> f1063b;

    /* renamed from: c */
    private C5426g<C5618c, SubMenu> f1064c;

    C0357c(Context context) {
        this.f1062a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo1287c(MenuItem menuItem) {
        if (!(menuItem instanceof C5617b)) {
            return menuItem;
        }
        C5617b bVar = (C5617b) menuItem;
        if (this.f1063b == null) {
            this.f1063b = new C5426g<>();
        }
        MenuItem menuItem2 = this.f1063b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0373j jVar = new C0373j(this.f1062a, bVar);
        this.f1063b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo1288d(SubMenu subMenu) {
        if (!(subMenu instanceof C5618c)) {
            return subMenu;
        }
        C5618c cVar = (C5618c) subMenu;
        if (this.f1064c == null) {
            this.f1064c = new C5426g<>();
        }
        SubMenu subMenu2 = this.f1064c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0393s sVar = new C0393s(this.f1062a, cVar);
        this.f1064c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo1289e() {
        C5426g<C5617b, MenuItem> gVar = this.f1063b;
        if (gVar != null) {
            gVar.clear();
        }
        C5426g<C5618c, SubMenu> gVar2 = this.f1064c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo1290f(int i) {
        if (this.f1063b != null) {
            int i2 = 0;
            while (i2 < this.f1063b.size()) {
                if (this.f1063b.mo19668j(i2).getGroupId() == i) {
                    this.f1063b.mo19670l(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo1291g(int i) {
        if (this.f1063b != null) {
            for (int i2 = 0; i2 < this.f1063b.size(); i2++) {
                if (this.f1063b.mo19668j(i2).getItemId() == i) {
                    this.f1063b.mo19670l(i2);
                    return;
                }
            }
        }
    }
}
