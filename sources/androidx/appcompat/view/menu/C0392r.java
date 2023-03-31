package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0367g;

/* renamed from: androidx.appcompat.view.menu.r */
/* compiled from: SubMenuBuilder */
public class C0392r extends C0367g implements SubMenu {

    /* renamed from: B */
    private C0367g f1231B;

    /* renamed from: C */
    private C0371i f1232C;

    public C0392r(Context context, C0367g gVar, C0371i iVar) {
        super(context);
        this.f1231B = gVar;
        this.f1232C = iVar;
    }

    /* renamed from: D */
    public C0367g mo1336D() {
        return this.f1231B.mo1336D();
    }

    /* renamed from: F */
    public boolean mo1338F() {
        return this.f1231B.mo1338F();
    }

    /* renamed from: G */
    public boolean mo1339G() {
        return this.f1231B.mo1339G();
    }

    /* renamed from: H */
    public boolean mo1340H() {
        return this.f1231B.mo1340H();
    }

    /* renamed from: R */
    public void mo1349R(C0367g.C0368a aVar) {
        this.f1231B.mo1349R(aVar);
    }

    /* renamed from: e0 */
    public Menu mo1585e0() {
        return this.f1231B;
    }

    /* renamed from: f */
    public boolean mo1377f(C0371i iVar) {
        return this.f1231B.mo1377f(iVar);
    }

    public MenuItem getItem() {
        return this.f1232C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1380h(C0367g gVar, MenuItem menuItem) {
        return super.mo1380h(gVar, menuItem) || this.f1231B.mo1380h(gVar, menuItem);
    }

    /* renamed from: k */
    public boolean mo1383k(C0371i iVar) {
        return this.f1231B.mo1383k(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1231B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo1353V(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1355Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1356Z(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1232C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1231B.setQwertyMode(z);
    }

    /* renamed from: t */
    public String mo1401t() {
        C0371i iVar = this.f1232C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1401t() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo1352U(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1354X(i);
    }

    public SubMenu setIcon(int i) {
        this.f1232C.setIcon(i);
        return this;
    }
}
