package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p145u.C5616a;

/* renamed from: androidx.appcompat.view.menu.o */
/* compiled from: MenuWrapperICS */
public class C0387o extends C0357c implements Menu {

    /* renamed from: d */
    private final C5616a f1207d;

    public C0387o(Context context, C5616a aVar) {
        super(context);
        if (aVar != null) {
            this.f1207d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1287c(this.f1207d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f1207d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo1287c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo1288d(this.f1207d.addSubMenu(charSequence));
    }

    public void clear() {
        mo1289e();
        this.f1207d.clear();
    }

    public void close() {
        this.f1207d.close();
    }

    public MenuItem findItem(int i) {
        return mo1287c(this.f1207d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo1287c(this.f1207d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f1207d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1207d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f1207d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1207d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo1290f(i);
        this.f1207d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo1291g(i);
        this.f1207d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1207d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f1207d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f1207d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f1207d.setQwertyMode(z);
    }

    public int size() {
        return this.f1207d.size();
    }

    public MenuItem add(int i) {
        return mo1287c(this.f1207d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo1288d(this.f1207d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1287c(this.f1207d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo1288d(this.f1207d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1287c(this.f1207d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo1288d(this.f1207d.addSubMenu(i, i2, i3, i4));
    }
}
