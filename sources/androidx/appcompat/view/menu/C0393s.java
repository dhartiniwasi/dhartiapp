package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p145u.C5618c;

/* renamed from: androidx.appcompat.view.menu.s */
/* compiled from: SubMenuWrapperICS */
class C0393s extends C0387o implements SubMenu {

    /* renamed from: e */
    private final C5618c f1233e;

    C0393s(Context context, C5618c cVar) {
        super(context, cVar);
        this.f1233e = cVar;
    }

    public void clearHeader() {
        this.f1233e.clearHeader();
    }

    public MenuItem getItem() {
        return mo1287c(this.f1233e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f1233e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f1233e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1233e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1233e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1233e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1233e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1233e.setIcon(drawable);
        return this;
    }
}
