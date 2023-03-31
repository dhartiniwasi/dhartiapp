package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0383m;
import androidx.core.view.C0909g0;

/* renamed from: androidx.appcompat.widget.h0 */
/* compiled from: DecorToolbar */
public interface C0497h0 {
    /* renamed from: a */
    void mo2118a(Drawable drawable);

    /* renamed from: b */
    void mo2119b(Menu menu, C0383m.C0384a aVar);

    /* renamed from: c */
    boolean mo2120c();

    void collapseActionView();

    /* renamed from: d */
    void mo2122d();

    /* renamed from: e */
    boolean mo2123e();

    /* renamed from: f */
    boolean mo2124f();

    /* renamed from: g */
    boolean mo2125g();

    Context getContext();

    CharSequence getTitle();

    int getVisibility();

    /* renamed from: h */
    boolean mo2129h();

    /* renamed from: i */
    void mo2130i();

    /* renamed from: j */
    void mo2131j(C0554t0 t0Var);

    /* renamed from: k */
    boolean mo2132k();

    /* renamed from: l */
    void mo2133l(int i);

    /* renamed from: m */
    Menu mo2134m();

    /* renamed from: n */
    void mo2135n(int i);

    /* renamed from: o */
    int mo2136o();

    /* renamed from: p */
    C0909g0 mo2137p(int i, long j);

    /* renamed from: q */
    void mo2138q(C0383m.C0384a aVar, C0367g.C0368a aVar2);

    /* renamed from: r */
    void mo2139r(int i);

    /* renamed from: s */
    ViewGroup mo2140s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo2146t(boolean z);

    /* renamed from: u */
    int mo2147u();

    /* renamed from: v */
    void mo2148v();

    /* renamed from: w */
    void mo2149w();

    /* renamed from: x */
    void mo2150x(boolean z);
}
