package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p048g.C4288a;

/* renamed from: androidx.appcompat.app.c */
/* compiled from: AlertDialog */
public class C0280c extends C0315i {

    /* renamed from: e */
    final AlertController f732e = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    /* compiled from: AlertDialog */
    public static class C0281a {

        /* renamed from: a */
        private final AlertController.C0267f f733a;

        /* renamed from: b */
        private final int f734b;

        public C0281a(Context context) {
            this(context, C0280c.m1324i(context, 0));
        }

        /* renamed from: a */
        public C0280c mo873a() {
            C0280c cVar = new C0280c(this.f733a.f692a, this.f734b);
            this.f733a.mo831a(cVar.f732e);
            cVar.setCancelable(this.f733a.f709r);
            if (this.f733a.f709r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f733a.f710s);
            cVar.setOnDismissListener(this.f733a.f711t);
            DialogInterface.OnKeyListener onKeyListener = this.f733a.f712u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        /* renamed from: b */
        public Context mo874b() {
            return this.f733a.f692a;
        }

        /* renamed from: c */
        public C0281a mo875c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0267f fVar = this.f733a;
            fVar.f714w = listAdapter;
            fVar.f715x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0281a mo876d(View view) {
            this.f733a.f698g = view;
            return this;
        }

        /* renamed from: e */
        public C0281a mo877e(Drawable drawable) {
            this.f733a.f695d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0281a mo878f(CharSequence charSequence) {
            this.f733a.f699h = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0281a mo879g(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0267f fVar = this.f733a;
            fVar.f703l = fVar.f692a.getText(i);
            this.f733a.f705n = onClickListener;
            return this;
        }

        /* renamed from: h */
        public C0281a mo880h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0267f fVar = this.f733a;
            fVar.f703l = charSequence;
            fVar.f705n = onClickListener;
            return this;
        }

        /* renamed from: i */
        public C0281a mo881i(DialogInterface.OnCancelListener onCancelListener) {
            this.f733a.f710s = onCancelListener;
            return this;
        }

        /* renamed from: j */
        public C0281a mo882j(DialogInterface.OnKeyListener onKeyListener) {
            this.f733a.f712u = onKeyListener;
            return this;
        }

        /* renamed from: k */
        public C0281a mo883k(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0267f fVar = this.f733a;
            fVar.f700i = fVar.f692a.getText(i);
            this.f733a.f702k = onClickListener;
            return this;
        }

        /* renamed from: l */
        public C0281a mo884l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0267f fVar = this.f733a;
            fVar.f700i = charSequence;
            fVar.f702k = onClickListener;
            return this;
        }

        /* renamed from: m */
        public C0281a mo885m(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0267f fVar = this.f733a;
            fVar.f714w = listAdapter;
            fVar.f715x = onClickListener;
            fVar.f684I = i;
            fVar.f683H = true;
            return this;
        }

        /* renamed from: n */
        public C0281a mo886n(CharSequence charSequence) {
            this.f733a.f697f = charSequence;
            return this;
        }

        public C0281a(Context context, int i) {
            this.f733a = new AlertController.C0267f(new ContextThemeWrapper(context, C0280c.m1324i(context, i)));
            this.f734b = i;
        }
    }

    protected C0280c(Context context, int i) {
        super(context, m1324i(context, i));
    }

    /* renamed from: i */
    static int m1324i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4288a.f23775o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: h */
    public ListView mo868h() {
        return this.f732e.mo811d();
    }

    /* renamed from: j */
    public void mo869j(View view) {
        this.f732e.mo822s(view);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f732e.mo812e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f732e.mo813g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f732e.mo814h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f732e.mo820q(charSequence);
    }
}
