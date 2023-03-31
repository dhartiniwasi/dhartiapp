package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0681a;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0882b;
import p145u.C5617b;

/* renamed from: androidx.appcompat.view.menu.a */
/* compiled from: ActionMenuItem */
public class C0355a implements C5617b {

    /* renamed from: a */
    private final int f1032a;

    /* renamed from: b */
    private final int f1033b;

    /* renamed from: c */
    private final int f1034c;

    /* renamed from: d */
    private CharSequence f1035d;

    /* renamed from: e */
    private CharSequence f1036e;

    /* renamed from: f */
    private Intent f1037f;

    /* renamed from: g */
    private char f1038g;

    /* renamed from: h */
    private int f1039h = 4096;

    /* renamed from: i */
    private char f1040i;

    /* renamed from: j */
    private int f1041j = 4096;

    /* renamed from: k */
    private Drawable f1042k;

    /* renamed from: l */
    private Context f1043l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f1044m;

    /* renamed from: n */
    private CharSequence f1045n;

    /* renamed from: o */
    private CharSequence f1046o;

    /* renamed from: p */
    private ColorStateList f1047p = null;

    /* renamed from: q */
    private PorterDuff.Mode f1048q = null;

    /* renamed from: r */
    private boolean f1049r = false;

    /* renamed from: s */
    private boolean f1050s = false;

    /* renamed from: t */
    private int f1051t = 16;

    public C0355a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1043l = context;
        this.f1032a = i2;
        this.f1033b = i;
        this.f1034c = i4;
        this.f1035d = charSequence;
    }

    /* renamed from: c */
    private void m1726c() {
        Drawable drawable = this.f1042k;
        if (drawable == null) {
            return;
        }
        if (this.f1049r || this.f1050s) {
            Drawable r = C0732a.m3380r(drawable);
            this.f1042k = r;
            Drawable mutate = r.mutate();
            this.f1042k = mutate;
            if (this.f1049r) {
                C0732a.m3377o(mutate, this.f1047p);
            }
            if (this.f1050s) {
                C0732a.m3378p(this.f1042k, this.f1048q);
            }
        }
    }

    /* renamed from: a */
    public C5617b mo1212a(C0882b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C0882b mo1213b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C5617b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C5617b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C5617b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1041j;
    }

    public char getAlphabeticShortcut() {
        return this.f1040i;
    }

    public CharSequence getContentDescription() {
        return this.f1045n;
    }

    public int getGroupId() {
        return this.f1033b;
    }

    public Drawable getIcon() {
        return this.f1042k;
    }

    public ColorStateList getIconTintList() {
        return this.f1047p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1048q;
    }

    public Intent getIntent() {
        return this.f1037f;
    }

    public int getItemId() {
        return this.f1032a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1039h;
    }

    public char getNumericShortcut() {
        return this.f1038g;
    }

    public int getOrder() {
        return this.f1034c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1035d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1036e;
        return charSequence != null ? charSequence : this.f1035d;
    }

    public CharSequence getTooltipText() {
        return this.f1046o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1051t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1051t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1051t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1051t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1040i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1051t = z | (this.f1051t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1051t = (z ? 2 : 0) | (this.f1051t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1051t = (z ? 16 : 0) | (this.f1051t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1042k = drawable;
        m1726c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1047p = colorStateList;
        this.f1049r = true;
        m1726c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1048q = mode;
        this.f1050s = true;
        m1726c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1037f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1038g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1044m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1038g = c;
        this.f1040i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1035d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1036e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1051t & 8;
        if (z) {
            i = 0;
        }
        this.f1051t = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1040i = Character.toLowerCase(c);
        this.f1041j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C5617b setContentDescription(CharSequence charSequence) {
        this.f1045n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1038g = c;
        this.f1039h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1035d = this.f1043l.getResources().getString(i);
        return this;
    }

    public C5617b setTooltipText(CharSequence charSequence) {
        this.f1046o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1042k = C0681a.m3150f(this.f1043l, i);
        m1726c();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1038g = c;
        this.f1039h = KeyEvent.normalizeMetaState(i);
        this.f1040i = Character.toLowerCase(c2);
        this.f1041j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
