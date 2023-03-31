package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.widget.C0452a1;

public final class ExpandedMenuView extends ListView implements C0367g.C0369b, C0385n, AdapterView.OnItemClickListener {

    /* renamed from: c */
    private static final int[] f1012c = {16842964, 16843049};

    /* renamed from: a */
    private C0367g f1013a;

    /* renamed from: b */
    private int f1014b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public boolean mo1197a(C0371i iVar) {
        return this.f1013a.mo1344L(iVar, 0);
    }

    /* renamed from: b */
    public void mo1198b(C0367g gVar) {
        this.f1013a = gVar;
    }

    public int getWindowAnimations() {
        return this.f1014b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1197a((C0371i) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0452a1 v = C0452a1.m2210v(context, attributeSet, f1012c, i, 0);
        if (v.mo2060s(0)) {
            setBackgroundDrawable(v.mo2048g(0));
        }
        if (v.mo2060s(1)) {
            setDivider(v.mo2048g(1));
        }
        v.mo2061w();
    }
}
