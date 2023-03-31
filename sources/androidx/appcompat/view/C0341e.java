package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0336b;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.e */
/* compiled from: StandaloneActionMode */
public class C0341e extends C0336b implements C0367g.C0368a {

    /* renamed from: c */
    private Context f936c;

    /* renamed from: d */
    private ActionBarContextView f937d;

    /* renamed from: e */
    private C0336b.C0337a f938e;

    /* renamed from: f */
    private WeakReference<View> f939f;

    /* renamed from: g */
    private boolean f940g;

    /* renamed from: h */
    private boolean f941h;

    /* renamed from: i */
    private C0367g f942i;

    public C0341e(Context context, ActionBarContextView actionBarContextView, C0336b.C0337a aVar, boolean z) {
        this.f936c = context;
        this.f937d = actionBarContextView;
        this.f938e = aVar;
        C0367g S = new C0367g(actionBarContextView.getContext()).mo1350S(1);
        this.f942i = S;
        S.mo1349R(this);
        this.f941h = z;
    }

    /* renamed from: a */
    public boolean mo967a(C0367g gVar, MenuItem menuItem) {
        return this.f938e.mo1001d(this, menuItem);
    }

    /* renamed from: b */
    public void mo968b(C0367g gVar) {
        mo1093k();
        this.f937d.mo1632l();
    }

    /* renamed from: c */
    public void mo1087c() {
        if (!this.f940g) {
            this.f940g = true;
            this.f938e.mo998a(this);
        }
    }

    /* renamed from: d */
    public View mo1088d() {
        WeakReference<View> weakReference = this.f939f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo1089e() {
        return this.f942i;
    }

    /* renamed from: f */
    public MenuInflater mo1090f() {
        return new C0344g(this.f937d.getContext());
    }

    /* renamed from: g */
    public CharSequence mo1091g() {
        return this.f937d.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo1092i() {
        return this.f937d.getTitle();
    }

    /* renamed from: k */
    public void mo1093k() {
        this.f938e.mo1000c(this, this.f942i);
    }

    /* renamed from: l */
    public boolean mo1094l() {
        return this.f937d.mo1630j();
    }

    /* renamed from: m */
    public void mo1095m(View view) {
        this.f937d.setCustomView(view);
        this.f939f = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo1096n(int i) {
        mo1097o(this.f936c.getString(i));
    }

    /* renamed from: o */
    public void mo1097o(CharSequence charSequence) {
        this.f937d.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo1098q(int i) {
        mo1099r(this.f936c.getString(i));
    }

    /* renamed from: r */
    public void mo1099r(CharSequence charSequence) {
        this.f937d.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo1100s(boolean z) {
        super.mo1100s(z);
        this.f937d.setTitleOptional(z);
    }
}
