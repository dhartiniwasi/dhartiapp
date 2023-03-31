package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0385n;
import androidx.appcompat.widget.C0452a1;
import androidx.core.view.C0835a0;
import p048g.C4288a;
import p048g.C4293f;
import p048g.C4294g;
import p048g.C4297j;

public class ListMenuItemView extends LinearLayout implements C0385n.C0386a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0371i f1015a;

    /* renamed from: b */
    private ImageView f1016b;

    /* renamed from: c */
    private RadioButton f1017c;

    /* renamed from: d */
    private TextView f1018d;

    /* renamed from: e */
    private CheckBox f1019e;

    /* renamed from: f */
    private TextView f1020f;

    /* renamed from: g */
    private ImageView f1021g;

    /* renamed from: h */
    private ImageView f1022h;

    /* renamed from: i */
    private LinearLayout f1023i;

    /* renamed from: r */
    private Drawable f1024r;

    /* renamed from: s */
    private int f1025s;

    /* renamed from: t */
    private Context f1026t;

    /* renamed from: u */
    private boolean f1027u;

    /* renamed from: v */
    private Drawable f1028v;

    /* renamed from: w */
    private boolean f1029w;

    /* renamed from: x */
    private LayoutInflater f1030x;

    /* renamed from: y */
    private boolean f1031y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23751D);
    }

    /* renamed from: a */
    private void m1718a(View view) {
        m1719b(view, -1);
    }

    /* renamed from: b */
    private void m1719b(View view, int i) {
        LinearLayout linearLayout = this.f1023i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m1720c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C4294g.f23905h, this, false);
        this.f1019e = checkBox;
        m1718a(checkBox);
    }

    /* renamed from: f */
    private void m1721f() {
        ImageView imageView = (ImageView) getInflater().inflate(C4294g.f23906i, this, false);
        this.f1016b = imageView;
        m1719b(imageView, 0);
    }

    /* renamed from: g */
    private void m1722g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C4294g.f23908k, this, false);
        this.f1017c = radioButton;
        m1718a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1030x == null) {
            this.f1030x = LayoutInflater.from(getContext());
        }
        return this.f1030x;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1021g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1022h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1022h.getLayoutParams();
            rect.top += this.f1022h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: d */
    public boolean mo1176d() {
        return false;
    }

    /* renamed from: e */
    public void mo1177e(C0371i iVar, int i) {
        this.f1015a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo1432i(this));
        setCheckable(iVar.isCheckable());
        mo1203h(iVar.mo1413A(), iVar.mo1417g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public C0371i getItemData() {
        return this.f1015a;
    }

    /* renamed from: h */
    public void mo1203h(boolean z, char c) {
        int i = (!z || !this.f1015a.mo1413A()) ? 8 : 0;
        if (i == 0) {
            this.f1020f.setText(this.f1015a.mo1430h());
        }
        if (this.f1020f.getVisibility() != i) {
            this.f1020f.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0835a0.m3749r0(this, this.f1024r);
        TextView textView = (TextView) findViewById(C4293f.f23868M);
        this.f1018d = textView;
        int i = this.f1025s;
        if (i != -1) {
            textView.setTextAppearance(this.f1026t, i);
        }
        this.f1020f = (TextView) findViewById(C4293f.f23861F);
        ImageView imageView = (ImageView) findViewById(C4293f.f23864I);
        this.f1021g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1028v);
        }
        this.f1022h = (ImageView) findViewById(C4293f.f23889r);
        this.f1023i = (LinearLayout) findViewById(C4293f.f23883l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1016b != null && this.f1027u) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1016b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1017c != null || this.f1019e != null) {
            if (this.f1015a.mo1440m()) {
                if (this.f1017c == null) {
                    m1722g();
                }
                compoundButton2 = this.f1017c;
                compoundButton = this.f1019e;
            } else {
                if (this.f1019e == null) {
                    m1720c();
                }
                compoundButton2 = this.f1019e;
                compoundButton = this.f1017c;
            }
            if (z) {
                compoundButton2.setChecked(this.f1015a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1019e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1017c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1015a.mo1440m()) {
            if (this.f1017c == null) {
                m1722g();
            }
            compoundButton = this.f1017c;
        } else {
            if (this.f1019e == null) {
                m1720c();
            }
            compoundButton = this.f1019e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1031y = z;
        this.f1027u = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1022h;
        if (imageView != null) {
            imageView.setVisibility((this.f1029w || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1015a.mo1470z() || this.f1031y;
        if (z || this.f1027u) {
            ImageView imageView = this.f1016b;
            if (imageView != null || drawable != null || this.f1027u) {
                if (imageView == null) {
                    m1721f();
                }
                if (drawable != null || this.f1027u) {
                    ImageView imageView2 = this.f1016b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f1016b.getVisibility() != 0) {
                        this.f1016b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1016b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1018d.setText(charSequence);
            if (this.f1018d.getVisibility() != 0) {
                this.f1018d.setVisibility(0);
            }
        } else if (this.f1018d.getVisibility() != 8) {
            this.f1018d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0452a1 v = C0452a1.m2210v(getContext(), attributeSet, C4297j.f24019T1, i, 0);
        this.f1024r = v.mo2048g(C4297j.f24027V1);
        this.f1025s = v.mo2055n(C4297j.f24023U1, -1);
        this.f1027u = v.mo2042a(C4297j.f24031W1, false);
        this.f1026t = context;
        this.f1028v = v.mo2048g(C4297j.f24035X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C4288a.f23748A, 0);
        this.f1029w = obtainStyledAttributes.hasValue(0);
        v.mo2061w();
        obtainStyledAttributes.recycle();
    }
}
