package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0385n;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0882b;
import p048g.C4295h;
import p055h.C4411a;
import p145u.C5617b;

/* renamed from: androidx.appcompat.view.menu.i */
/* compiled from: MenuItemImpl */
public final class C0371i implements C5617b {

    /* renamed from: A */
    private View f1150A;

    /* renamed from: B */
    private C0882b f1151B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1152C;

    /* renamed from: D */
    private boolean f1153D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1154E;

    /* renamed from: a */
    private final int f1155a;

    /* renamed from: b */
    private final int f1156b;

    /* renamed from: c */
    private final int f1157c;

    /* renamed from: d */
    private final int f1158d;

    /* renamed from: e */
    private CharSequence f1159e;

    /* renamed from: f */
    private CharSequence f1160f;

    /* renamed from: g */
    private Intent f1161g;

    /* renamed from: h */
    private char f1162h;

    /* renamed from: i */
    private int f1163i = 4096;

    /* renamed from: j */
    private char f1164j;

    /* renamed from: k */
    private int f1165k = 4096;

    /* renamed from: l */
    private Drawable f1166l;

    /* renamed from: m */
    private int f1167m = 0;

    /* renamed from: n */
    C0367g f1168n;

    /* renamed from: o */
    private C0392r f1169o;

    /* renamed from: p */
    private Runnable f1170p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1171q;

    /* renamed from: r */
    private CharSequence f1172r;

    /* renamed from: s */
    private CharSequence f1173s;

    /* renamed from: t */
    private ColorStateList f1174t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1175u = null;

    /* renamed from: v */
    private boolean f1176v = false;

    /* renamed from: w */
    private boolean f1177w = false;

    /* renamed from: x */
    private boolean f1178x = false;

    /* renamed from: y */
    private int f1179y = 16;

    /* renamed from: z */
    private int f1180z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* compiled from: MenuItemImpl */
    class C0372a implements C0882b.C0884b {
        C0372a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0371i iVar = C0371i.this;
            iVar.f1168n.mo1342J(iVar);
        }
    }

    C0371i(C0367g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1168n = gVar;
        this.f1155a = i2;
        this.f1156b = i;
        this.f1157c = i3;
        this.f1158d = i4;
        this.f1159e = charSequence;
        this.f1180z = i5;
    }

    /* renamed from: d */
    private static void m1858d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1859e(Drawable drawable) {
        if (drawable != null && this.f1178x && (this.f1176v || this.f1177w)) {
            drawable = C0732a.m3380r(drawable).mutate();
            if (this.f1176v) {
                C0732a.m3377o(drawable, this.f1174t);
            }
            if (this.f1177w) {
                C0732a.m3378p(drawable, this.f1175u);
            }
            this.f1178x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo1413A() {
        return this.f1168n.mo1340H() && mo1417g() != 0;
    }

    /* renamed from: B */
    public boolean mo1414B() {
        return (this.f1180z & 4) == 4;
    }

    /* renamed from: a */
    public C5617b mo1212a(C0882b bVar) {
        C0882b bVar2 = this.f1151B;
        if (bVar2 != null) {
            bVar2.mo3355h();
        }
        this.f1150A = null;
        this.f1151B = bVar;
        this.f1168n.mo1343K(true);
        C0882b bVar3 = this.f1151B;
        if (bVar3 != null) {
            bVar3.mo1534j(new C0372a());
        }
        return this;
    }

    /* renamed from: b */
    public C0882b mo1213b() {
        return this.f1151B;
    }

    /* renamed from: c */
    public void mo1415c() {
        this.f1168n.mo1341I(this);
    }

    public boolean collapseActionView() {
        if ((this.f1180z & 8) == 0) {
            return false;
        }
        if (this.f1150A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1152C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1168n.mo1377f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo1437j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1152C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1168n.mo1383k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo1416f() {
        return this.f1158d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo1417g() {
        return this.f1168n.mo1339G() ? this.f1164j : this.f1162h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1150A;
        if (view != null) {
            return view;
        }
        C0882b bVar = this.f1151B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo1532d(this);
        this.f1150A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f1165k;
    }

    public char getAlphabeticShortcut() {
        return this.f1164j;
    }

    public CharSequence getContentDescription() {
        return this.f1172r;
    }

    public int getGroupId() {
        return this.f1156b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1166l;
        if (drawable != null) {
            return m1859e(drawable);
        }
        if (this.f1167m == 0) {
            return null;
        }
        Drawable b = C4411a.m29346b(this.f1168n.mo1402u(), this.f1167m);
        this.f1167m = 0;
        this.f1166l = b;
        return m1859e(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1174t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1175u;
    }

    public Intent getIntent() {
        return this.f1161g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1155a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1154E;
    }

    public int getNumericModifiers() {
        return this.f1163i;
    }

    public char getNumericShortcut() {
        return this.f1162h;
    }

    public int getOrder() {
        return this.f1157c;
    }

    public SubMenu getSubMenu() {
        return this.f1169o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1159e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1160f;
        if (charSequence == null) {
            charSequence = this.f1159e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1173s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo1430h() {
        char g = mo1417g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f1168n.mo1402u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1168n.mo1402u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C4295h.f23928k));
        }
        int i = this.f1168n.mo1339G() ? this.f1165k : this.f1163i;
        m1858d(sb, i, 65536, resources.getString(C4295h.f23924g));
        m1858d(sb, i, 4096, resources.getString(C4295h.f23920c));
        m1858d(sb, i, 2, resources.getString(C4295h.f23919b));
        m1858d(sb, i, 1, resources.getString(C4295h.f23925h));
        m1858d(sb, i, 4, resources.getString(C4295h.f23927j));
        m1858d(sb, i, 8, resources.getString(C4295h.f23923f));
        if (g == 8) {
            sb.append(resources.getString(C4295h.f23921d));
        } else if (g == 10) {
            sb.append(resources.getString(C4295h.f23922e));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(C4295h.f23926i));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f1169o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo1432i(C0385n.C0386a aVar) {
        if (aVar == null || !aVar.mo1176d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f1153D;
    }

    public boolean isCheckable() {
        return (this.f1179y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1179y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1179y & 16) != 0;
    }

    public boolean isVisible() {
        C0882b bVar = this.f1151B;
        if (bVar == null || !bVar.mo1533g()) {
            if ((this.f1179y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1179y & 8) != 0 || !this.f1151B.mo1531b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public boolean mo1437j() {
        C0882b bVar;
        if ((this.f1180z & 8) == 0) {
            return false;
        }
        if (this.f1150A == null && (bVar = this.f1151B) != null) {
            this.f1150A = bVar.mo1532d(this);
        }
        if (this.f1150A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1438k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1171q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0367g gVar = this.f1168n;
        if (gVar.mo1380h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1170p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1161g != null) {
            try {
                this.f1168n.mo1402u().startActivity(this.f1161g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0882b bVar = this.f1151B;
        if (bVar == null || !bVar.mo1529e()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo1439l() {
        return (this.f1179y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo1440m() {
        return (this.f1179y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo1441n() {
        return (this.f1180z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo1442o() {
        return (this.f1180z & 2) == 2;
    }

    /* renamed from: p */
    public C5617b setActionView(int i) {
        Context u = this.f1168n.mo1402u();
        setActionView(LayoutInflater.from(u).inflate(i, new LinearLayout(u), false));
        return this;
    }

    /* renamed from: q */
    public C5617b setActionView(View view) {
        int i;
        this.f1150A = view;
        this.f1151B = null;
        if (view != null && view.getId() == -1 && (i = this.f1155a) > 0) {
            view.setId(i);
        }
        this.f1168n.mo1341I(this);
        return this;
    }

    /* renamed from: r */
    public void mo1445r(boolean z) {
        this.f1153D = z;
        this.f1168n.mo1343K(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1446s(boolean z) {
        int i = this.f1179y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f1179y = i2;
        if (i != i2) {
            this.f1168n.mo1343K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1164j == c) {
            return this;
        }
        this.f1164j = Character.toLowerCase(c);
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1179y;
        boolean z2 = z | (i & true);
        this.f1179y = z2 ? 1 : 0;
        if (i != z2) {
            this.f1168n.mo1343K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1179y & 4) != 0) {
            this.f1168n.mo1351T(this);
        } else {
            mo1446s(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1179y |= 16;
        } else {
            this.f1179y &= -17;
        }
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1167m = 0;
        this.f1166l = drawable;
        this.f1178x = true;
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1174t = colorStateList;
        this.f1176v = true;
        this.f1178x = true;
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1175u = mode;
        this.f1177w = true;
        this.f1178x = true;
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1161g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1162h == c) {
            return this;
        }
        this.f1162h = c;
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1152C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1171q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1162h = c;
        this.f1164j = Character.toLowerCase(c2);
        this.f1168n.mo1343K(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1180z = i;
            this.f1168n.mo1341I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1159e = charSequence;
        this.f1168n.mo1343K(false);
        C0392r rVar = this.f1169o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1160f = charSequence;
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1469y(z)) {
            this.f1168n.mo1342J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo1463t(boolean z) {
        this.f1179y = (z ? 4 : 0) | (this.f1179y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f1159e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo1465u(boolean z) {
        if (z) {
            this.f1179y |= 32;
        } else {
            this.f1179y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1466v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1154E = contextMenuInfo;
    }

    /* renamed from: w */
    public C5617b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo1468x(C0392r rVar) {
        this.f1169o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo1469y(boolean z) {
        int i = this.f1179y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f1179y = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo1470z() {
        return this.f1168n.mo1334A();
    }

    public C5617b setContentDescription(CharSequence charSequence) {
        this.f1172r = charSequence;
        this.f1168n.mo1343K(false);
        return this;
    }

    public C5617b setTooltipText(CharSequence charSequence) {
        this.f1173s = charSequence;
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1164j == c && this.f1165k == i) {
            return this;
        }
        this.f1164j = Character.toLowerCase(c);
        this.f1165k = KeyEvent.normalizeMetaState(i);
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1162h == c && this.f1163i == i) {
            return this;
        }
        this.f1162h = c;
        this.f1163i = KeyEvent.normalizeMetaState(i);
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1162h = c;
        this.f1163i = KeyEvent.normalizeMetaState(i);
        this.f1164j = Character.toLowerCase(c2);
        this.f1165k = KeyEvent.normalizeMetaState(i2);
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1166l = null;
        this.f1167m = i;
        this.f1178x = true;
        this.f1168n.mo1343K(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1168n.mo1402u().getString(i));
    }
}
