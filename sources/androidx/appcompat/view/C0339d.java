package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p048g.C4296i;

/* renamed from: androidx.appcompat.view.d */
/* compiled from: ContextThemeWrapper */
public class C0339d extends ContextWrapper {

    /* renamed from: f */
    private static Configuration f930f;

    /* renamed from: a */
    private int f931a;

    /* renamed from: b */
    private Resources.Theme f932b;

    /* renamed from: c */
    private LayoutInflater f933c;

    /* renamed from: d */
    private Configuration f934d;

    /* renamed from: e */
    private Resources f935e;

    /* renamed from: androidx.appcompat.view.d$a */
    /* compiled from: ContextThemeWrapper */
    static class C0340a {
        /* renamed from: a */
        static Context m1655a(C0339d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public C0339d() {
        super((Context) null);
    }

    /* renamed from: b */
    private Resources m1649b() {
        int i;
        if (this.f935e == null) {
            Configuration configuration = this.f934d;
            if (configuration == null || ((i = Build.VERSION.SDK_INT) >= 26 && m1651e(configuration))) {
                this.f935e = super.getResources();
            } else if (i >= 17) {
                this.f935e = C0340a.m1655a(this, this.f934d).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f934d);
                this.f935e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f935e;
    }

    /* renamed from: d */
    private void m1650d() {
        boolean z = this.f932b == null;
        if (z) {
            this.f932b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f932b.setTo(theme);
            }
        }
        mo1117f(this.f932b, this.f931a, z);
    }

    /* renamed from: e */
    private static boolean m1651e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f930f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f930f = configuration2;
        }
        return configuration.equals(f930f);
    }

    /* renamed from: a */
    public void mo1114a(Configuration configuration) {
        if (this.f935e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f934d == null) {
            this.f934d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo1116c() {
        return this.f931a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo1117f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m1649b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f933c == null) {
            this.f933c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f933c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f932b;
        if (theme != null) {
            return theme;
        }
        if (this.f931a == 0) {
            this.f931a = C4296i.f23934e;
        }
        m1650d();
        return this.f932b;
    }

    public void setTheme(int i) {
        if (this.f931a != i) {
            this.f931a = i;
            m1650d();
        }
    }

    public C0339d(Context context, int i) {
        super(context);
        this.f931a = i;
    }

    public C0339d(Context context, Resources.Theme theme) {
        super(context);
        this.f932b = theme;
    }
}
