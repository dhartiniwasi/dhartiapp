package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.C0810c;
import androidx.core.util.C0831h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.j */
/* compiled from: TextViewCompat */
public final class C0986j {

    /* renamed from: androidx.core.widget.j$a */
    /* compiled from: TextViewCompat */
    static class C0987a {
        /* renamed from: a */
        static boolean m4469a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m4470b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m4471c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: androidx.core.widget.j$b */
    /* compiled from: TextViewCompat */
    static class C0988b {
        /* renamed from: a */
        static Drawable[] m4472a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m4473b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m4474c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m4475d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m4476e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m4477f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m4478g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m4479h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.core.widget.j$c */
    /* compiled from: TextViewCompat */
    static class C0989c {
        /* renamed from: a */
        static int m4480a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m4481b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m4482c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m4483d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m4484e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        static void m4485f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m4486g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m4487h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: androidx.core.widget.j$d */
    /* compiled from: TextViewCompat */
    static class C0990d {
        /* renamed from: a */
        static DecimalFormatSymbols m4488a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: androidx.core.widget.j$e */
    /* compiled from: TextViewCompat */
    static class C0991e {
        /* renamed from: a */
        static String[] m4489a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        static PrecomputedText.Params m4490b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        static void m4491c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: androidx.core.widget.j$f */
    /* compiled from: TextViewCompat */
    private static class C0992f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2701a;

        /* renamed from: b */
        private final TextView f2702b;

        /* renamed from: c */
        private Class<?> f2703c;

        /* renamed from: d */
        private Method f2704d;

        /* renamed from: e */
        private boolean f2705e;

        /* renamed from: f */
        private boolean f2706f = false;

        C0992f(ActionMode.Callback callback, TextView textView) {
            this.f2701a = callback;
            this.f2702b = textView;
        }

        /* renamed from: a */
        private Intent m4492a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m4493b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m4492a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m4495e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m4494c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(m4492a(), 0)) {
                if (m4496f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        private boolean m4495e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        private boolean m4496f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private void m4497g(Menu menu) {
            Method method;
            Context context = this.f2702b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2706f) {
                this.f2706f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2703c = cls;
                    this.f2704d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2705e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2703c = null;
                    this.f2704d = null;
                    this.f2705e = false;
                }
            }
            try {
                if (!this.f2705e || !this.f2703c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f2704d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = m4494c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m4493b(resolveInfo, this.f2702b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public ActionMode.Callback mo3599d() {
            return this.f2701a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2701a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2701a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2701a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m4497g(menu);
            return this.f2701a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m4452a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return C0988b.m4472a(textView);
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (C0988b.m4473b(textView) != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: b */
    public static int m4453b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m4454c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    private static int m4455d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: e */
    private static TextDirectionHeuristic m4456e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C0988b.m4473b(textView) == 1) {
                z = true;
            }
            switch (C0988b.m4474c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C0991e.m4489a(C0990d.m4488a(C0988b.m4475d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: f */
    public static C0810c.C0811a m4457f(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0810c.C0811a(C0991e.m4490b(textView));
        }
        C0810c.C0811a.C0812a aVar = new C0810c.C0811a.C0812a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            aVar.mo3216b(C0989c.m4480a(textView));
            aVar.mo3217c(C0989c.m4483d(textView));
        }
        if (i >= 18) {
            aVar.mo3218d(m4456e(textView));
        }
        return aVar.mo3215a();
    }

    /* renamed from: g */
    public static void m4458g(TextView textView, ColorStateList colorStateList) {
        C0831h.m3662f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C0989c.m4485f(textView, colorStateList);
        } else if (textView instanceof C0998n) {
            ((C0998n) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: h */
    public static void m4459h(TextView textView, PorterDuff.Mode mode) {
        C0831h.m3662f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C0989c.m4486g(textView, mode);
        } else if (textView instanceof C0998n) {
            ((C0998n) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: i */
    public static void m4460i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            C0988b.m4476e(textView, drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (C0988b.m4473b(textView) != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: j */
    public static void m4461j(TextView textView, int i) {
        int i2;
        C0831h.m3659c(i);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            C0991e.m4491c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (i3 < 16 || C0987a.m4469a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: k */
    public static void m4462k(TextView textView, int i) {
        int i2;
        C0831h.m3659c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || C0987a.m4469a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: l */
    public static void m4463l(TextView textView, int i) {
        C0831h.m3659c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: m */
    public static void m4464m(TextView textView, C0810c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(cVar.mo3195b());
        } else if (m4457f(textView).mo3207a(cVar.mo3194a())) {
            textView.setText(cVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: n */
    public static void m4465n(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: o */
    public static void m4466o(TextView textView, C0810c.C0811a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            C0988b.m4479h(textView, m4455d(aVar.mo3210d()));
        }
        if (i < 23) {
            float textScaleX = aVar.mo3211e().getTextScaleX();
            textView.getPaint().set(aVar.mo3211e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo3211e());
        C0989c.m4484e(textView, aVar.mo3208b());
        C0989c.m4487h(textView, aVar.mo3209c());
    }

    /* renamed from: p */
    public static ActionMode.Callback m4467p(ActionMode.Callback callback) {
        return (!(callback instanceof C0992f) || Build.VERSION.SDK_INT < 26) ? callback : ((C0992f) callback).mo3599d();
    }

    /* renamed from: q */
    public static ActionMode.Callback m4468q(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0992f) || callback == null) ? callback : new C0992f(callback, textView);
    }
}
