package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p048g.C4288a;
import p048g.C4289b;
import p048g.C4291d;
import p048g.C4297j;

/* renamed from: androidx.appcompat.view.a */
/* compiled from: ActionBarPolicy */
public class C0335a {

    /* renamed from: a */
    private Context f927a;

    private C0335a(Context context) {
        this.f927a = context;
    }

    /* renamed from: b */
    public static C0335a m1618b(Context context) {
        return new C0335a(context);
    }

    /* renamed from: a */
    public boolean mo1102a() {
        return this.f927a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo1103c() {
        return this.f927a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo1104d() {
        Configuration configuration = this.f927a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo1105e() {
        return this.f927a.getResources().getDimensionPixelSize(C4291d.f23797b);
    }

    /* renamed from: f */
    public int mo1106f() {
        TypedArray obtainStyledAttributes = this.f927a.obtainStyledAttributes((AttributeSet) null, C4297j.f24045a, C4288a.f23763c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C4297j.f24090j, 0);
        Resources resources = this.f927a.getResources();
        if (!mo1107g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C4291d.f23796a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo1107g() {
        return this.f927a.getResources().getBoolean(C4289b.f23787a);
    }

    /* renamed from: h */
    public boolean mo1108h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f927a).hasPermanentMenuKey();
    }
}
