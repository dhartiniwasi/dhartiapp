package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p145u.C5617b;

/* renamed from: androidx.core.view.l */
/* compiled from: MenuItemCompat */
public final class C0937l {

    /* renamed from: androidx.core.view.l$a */
    /* compiled from: MenuItemCompat */
    static class C0938a {
        /* renamed from: a */
        static int m4258a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        static CharSequence m4259b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        static ColorStateList m4260c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        static PorterDuff.Mode m4261d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        static int m4262e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        static CharSequence m4263f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        static MenuItem m4264g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        static MenuItem m4265h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        static MenuItem m4266i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        static MenuItem m4267j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        static MenuItem m4268k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        static MenuItem m4269l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        static MenuItem m4270m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m4251a(MenuItem menuItem, C0882b bVar) {
        if (menuItem instanceof C5617b) {
            return ((C5617b) menuItem).mo1212a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m4252b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C5617b) {
            ((C5617b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0938a.m4264g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m4253c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C5617b) {
            ((C5617b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0938a.m4265h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m4254d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C5617b) {
            ((C5617b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0938a.m4266i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m4255e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C5617b) {
            ((C5617b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0938a.m4267j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m4256f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C5617b) {
            ((C5617b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0938a.m4268k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m4257g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C5617b) {
            ((C5617b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0938a.m4270m(menuItem, charSequence);
        }
    }
}
