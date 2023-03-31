package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0338c;
import androidx.core.view.C0882b;
import java.lang.reflect.Method;
import p145u.C5617b;

/* renamed from: androidx.appcompat.view.menu.j */
/* compiled from: MenuItemWrapperICS */
public class C0373j extends C0357c implements MenuItem {

    /* renamed from: d */
    private final C5617b f1182d;

    /* renamed from: e */
    private Method f1183e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* compiled from: MenuItemWrapperICS */
    private class C0374a extends C0882b {

        /* renamed from: d */
        final ActionProvider f1184d;

        C0374a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1184d = actionProvider;
        }

        /* renamed from: a */
        public boolean mo1527a() {
            return this.f1184d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo1528c() {
            return this.f1184d.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo1529e() {
            return this.f1184d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo1530f(SubMenu subMenu) {
            this.f1184d.onPrepareSubMenu(C0373j.this.mo1288d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* compiled from: MenuItemWrapperICS */
    private class C0375b extends C0374a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private C0882b.C0884b f1186f;

        C0375b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo1531b() {
            return this.f1184d.isVisible();
        }

        /* renamed from: d */
        public View mo1532d(MenuItem menuItem) {
            return this.f1184d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo1533g() {
            return this.f1184d.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo1534j(C0882b.C0884b bVar) {
            this.f1186f = bVar;
            this.f1184d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0882b.C0884b bVar = this.f1186f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* compiled from: MenuItemWrapperICS */
    static class C0376c extends FrameLayout implements C0338c {

        /* renamed from: a */
        final CollapsibleActionView f1188a;

        C0376c(View view) {
            super(view.getContext());
            this.f1188a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1536a() {
            return (View) this.f1188a;
        }

        /* renamed from: c */
        public void mo1112c() {
            this.f1188a.onActionViewExpanded();
        }

        /* renamed from: f */
        public void mo1113f() {
            this.f1188a.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* compiled from: MenuItemWrapperICS */
    private class C0377d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1189a;

        C0377d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1189a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1189a.onMenuItemActionCollapse(C0373j.this.mo1287c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1189a.onMenuItemActionExpand(C0373j.this.mo1287c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* compiled from: MenuItemWrapperICS */
    private class C0378e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f1191a;

        C0378e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1191a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1191a.onMenuItemClick(C0373j.this.mo1287c(menuItem));
        }
    }

    public C0373j(Context context, C5617b bVar) {
        super(context);
        if (bVar != null) {
            this.f1182d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1182d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1182d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0882b b = this.f1182d.mo1213b();
        if (b instanceof C0374a) {
            return ((C0374a) b).f1184d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1182d.getActionView();
        return actionView instanceof C0376c ? ((C0376c) actionView).mo1536a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1182d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1182d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1182d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1182d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1182d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1182d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1182d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1182d.getIntent();
    }

    public int getItemId() {
        return this.f1182d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1182d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1182d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1182d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1182d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo1288d(this.f1182d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1182d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1182d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1182d.getTooltipText();
    }

    /* renamed from: h */
    public void mo1493h(boolean z) {
        try {
            if (this.f1183e == null) {
                this.f1183e = this.f1182d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1183e.invoke(this.f1182d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f1182d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1182d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1182d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1182d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1182d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1182d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0882b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new C0375b(this.f1062a, actionProvider);
        } else {
            bVar = new C0374a(this.f1062a, actionProvider);
        }
        C5617b bVar2 = this.f1182d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo1212a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0376c(view);
        }
        this.f1182d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1182d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1182d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1182d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1182d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1182d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1182d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1182d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1182d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1182d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1182d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1182d.setOnActionExpandListener(onActionExpandListener != null ? new C0377d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1182d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0378e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1182d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1182d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1182d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1182d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1182d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1182d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1182d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1182d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1182d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1182d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1182d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1182d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1182d.setActionView(i);
        View actionView = this.f1182d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1182d.setActionView((View) new C0376c(actionView));
        }
        return this;
    }
}
