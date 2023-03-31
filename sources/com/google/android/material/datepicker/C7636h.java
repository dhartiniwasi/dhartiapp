package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.util.C0827d;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import androidx.recyclerview.widget.C1407h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p227f6.C10128d;
import p227f6.C10130f;
import p227f6.C10131g;
import p227f6.C10132h;
import p227f6.C10133i;

/* renamed from: com.google.android.material.datepicker.h */
/* compiled from: MaterialCalendar */
public final class C7636h<S> extends C7664p<S> {

    /* renamed from: B0 */
    static final Object f33576B0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: C0 */
    static final Object f33577C0 = "NAVIGATION_PREV_TAG";

    /* renamed from: D0 */
    static final Object f33578D0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: E0 */
    static final Object f33579E0 = "SELECTOR_TOGGLE_TAG";
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public View f33580A0;

    /* renamed from: r0 */
    private int f33581r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public C7631d<S> f33582s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public C7625a f33583t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C7657l f33584u0;

    /* renamed from: v0 */
    private C7647k f33585v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public C7630c f33586w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public RecyclerView f33587x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public RecyclerView f33588y0;

    /* renamed from: z0 */
    private View f33589z0;

    /* renamed from: com.google.android.material.datepicker.h$a */
    /* compiled from: MaterialCalendar */
    class C7637a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f33590a;

        C7637a(int i) {
            this.f33590a = i;
        }

        public void run() {
            C7636h.this.f33588y0.smoothScrollToPosition(this.f33590a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    /* compiled from: MaterialCalendar */
    class C7638b extends C0832a {
        C7638b() {
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            super.mo3231g(view, cVar);
            cVar.mo3295Z((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    /* compiled from: MaterialCalendar */
    class C7639c extends C7665q {

        /* renamed from: I */
        final /* synthetic */ int f33593I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7639c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f33593I = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M1 */
        public void mo4743M1(RecyclerView.C1330a0 a0Var, int[] iArr) {
            if (this.f33593I == 0) {
                iArr[0] = C7636h.this.f33588y0.getWidth();
                iArr[1] = C7636h.this.f33588y0.getWidth();
                return;
            }
            iArr[0] = C7636h.this.f33588y0.getHeight();
            iArr[1] = C7636h.this.f33588y0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    /* compiled from: MaterialCalendar */
    class C7640d implements C7648l {
        C7640d() {
        }

        /* renamed from: a */
        public void mo25423a(long j) {
            if (C7636h.this.f33583t0.mo25374e().mo25389Q0(j)) {
                C7636h.this.f33582s0.mo25399x1(j);
                Iterator it = C7636h.this.f33657q0.iterator();
                while (it.hasNext()) {
                    ((C7663o) it.next()).mo25431a(C7636h.this.f33582s0.mo25398h1());
                }
                C7636h.this.f33588y0.getAdapter().mo5065h();
                if (C7636h.this.f33587x0 != null) {
                    C7636h.this.f33587x0.getAdapter().mo5065h();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$e */
    /* compiled from: MaterialCalendar */
    class C7641e extends RecyclerView.C1349n {

        /* renamed from: a */
        private final Calendar f33596a = C7667r.m42694k();

        /* renamed from: b */
        private final Calendar f33597b = C7667r.m42694k();

        C7641e() {
        }

        /* renamed from: g */
        public void mo5111g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1330a0 a0Var) {
            int i;
            if ((recyclerView.getAdapter() instanceof C7668s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C7668s sVar = (C7668s) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0827d next : C7636h.this.f33582s0.mo25394L()) {
                    F f = next.f2438a;
                    if (!(f == null || next.f2439b == null)) {
                        this.f33596a.setTimeInMillis(((Long) f).longValue());
                        this.f33597b.setTimeInMillis(((Long) next.f2439b).longValue());
                        int w = sVar.mo25472w(this.f33596a.get(1));
                        int w2 = sVar.mo25472w(this.f33597b.get(1));
                        View C = gridLayoutManager.mo4736C(w);
                        View C2 = gridLayoutManager.mo4736C(w2);
                        int X2 = w / gridLayoutManager.mo4712X2();
                        int X22 = w2 / gridLayoutManager.mo4712X2();
                        int i2 = X2;
                        while (i2 <= X22) {
                            View C3 = gridLayoutManager.mo4736C(gridLayoutManager.mo4712X2() * i2);
                            if (C3 != null) {
                                int top = C3.getTop() + C7636h.this.f33586w0.f33566d.mo25391c();
                                int bottom = C3.getBottom() - C7636h.this.f33586w0.f33566d.mo25390b();
                                int left = i2 == X2 ? C.getLeft() + (C.getWidth() / 2) : 0;
                                if (i2 == X22) {
                                    i = C2.getLeft() + (C2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, C7636h.this.f33586w0.f33570h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$f */
    /* compiled from: MaterialCalendar */
    class C7642f extends C0832a {
        C7642f() {
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            String str;
            super.mo3231g(view, cVar);
            if (C7636h.this.f33580A0.getVisibility() == 0) {
                str = C7636h.this.mo3769O(C10133i.mtrl_picker_toggle_to_year_selection);
            } else {
                str = C7636h.this.mo3769O(C10133i.mtrl_picker_toggle_to_day_selection);
            }
            cVar.mo3311i0(str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$g */
    /* compiled from: MaterialCalendar */
    class C7643g extends RecyclerView.C1359t {

        /* renamed from: a */
        final /* synthetic */ C7660n f33600a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f33601b;

        C7643g(C7660n nVar, MaterialButton materialButton) {
            this.f33600a = nVar;
            this.f33601b = materialButton;
        }

        /* renamed from: a */
        public void mo5223a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f33601b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        /* renamed from: b */
        public void mo5224b(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = C7636h.this.mo25418V1().mo4750Z1();
            } else {
                i3 = C7636h.this.mo25418V1().mo4753c2();
            }
            C7657l unused = C7636h.this.f33584u0 = this.f33600a.mo25464v(i3);
            this.f33601b.setText(this.f33600a.mo25465w(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    /* compiled from: MaterialCalendar */
    class C7644h implements View.OnClickListener {
        C7644h() {
        }

        public void onClick(View view) {
            C7636h.this.mo25421a2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$i */
    /* compiled from: MaterialCalendar */
    class C7645i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7660n f33604a;

        C7645i(C7660n nVar) {
            this.f33604a = nVar;
        }

        public void onClick(View view) {
            int Z1 = C7636h.this.mo25418V1().mo4750Z1() + 1;
            if (Z1 < C7636h.this.f33588y0.getAdapter().mo5060c()) {
                C7636h.this.mo25419Y1(this.f33604a.mo25464v(Z1));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$j */
    /* compiled from: MaterialCalendar */
    class C7646j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7660n f33606a;

        C7646j(C7660n nVar) {
            this.f33606a = nVar;
        }

        public void onClick(View view) {
            int c2 = C7636h.this.mo25418V1().mo4753c2() - 1;
            if (c2 >= 0) {
                C7636h.this.mo25419Y1(this.f33606a.mo25464v(c2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$k */
    /* compiled from: MaterialCalendar */
    enum C7647k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.h$l */
    /* compiled from: MaterialCalendar */
    interface C7648l {
        /* renamed from: a */
        void mo25423a(long j);
    }

    /* renamed from: O1 */
    private void m42590O1(View view, C7660n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C10130f.month_navigation_fragment_toggle);
        materialButton.setTag(f33579E0);
        C0835a0.m3741n0(materialButton, new C7642f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C10130f.month_navigation_previous);
        materialButton2.setTag(f33577C0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C10130f.month_navigation_next);
        materialButton3.setTag(f33578D0);
        this.f33589z0 = view.findViewById(C10130f.mtrl_calendar_year_selector_frame);
        this.f33580A0 = view.findViewById(C10130f.mtrl_calendar_day_selector_frame);
        mo25420Z1(C7647k.DAY);
        materialButton.setText(this.f33584u0.mo25441n());
        this.f33588y0.addOnScrollListener(new C7643g(nVar, materialButton));
        materialButton.setOnClickListener(new C7644h());
        materialButton3.setOnClickListener(new C7645i(nVar));
        materialButton2.setOnClickListener(new C7646j(nVar));
    }

    /* renamed from: P1 */
    private RecyclerView.C1349n m42591P1() {
        return new C7641e();
    }

    /* renamed from: U1 */
    static int m42592U1(Context context) {
        return context.getResources().getDimensionPixelSize(C10128d.mtrl_calendar_day_height);
    }

    /* renamed from: W1 */
    static <T> C7636h<T> m42593W1(C7631d<T> dVar, int i, C7625a aVar) {
        C7636h<T> hVar = new C7636h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.mo25378h());
        hVar.mo3855u1(bundle);
        return hVar;
    }

    /* renamed from: X1 */
    private void m42594X1(int i) {
        this.f33588y0.post(new C7637a(i));
    }

    /* renamed from: I0 */
    public void mo3758I0(Bundle bundle) {
        super.mo3758I0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f33581r0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f33582s0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f33583t0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f33584u0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public C7625a mo25414Q1() {
        return this.f33583t0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public C7630c mo25415R1() {
        return this.f33586w0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public C7657l mo25416S1() {
        return this.f33584u0;
    }

    /* renamed from: T1 */
    public C7631d<S> mo25417T1() {
        return this.f33582s0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public LinearLayoutManager mo25418V1() {
        return (LinearLayoutManager) this.f33588y0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public void mo25419Y1(C7657l lVar) {
        C7660n nVar = (C7660n) this.f33588y0.getAdapter();
        int x = nVar.mo25466x(lVar);
        int x2 = x - nVar.mo25466x(this.f33584u0);
        boolean z = true;
        boolean z2 = Math.abs(x2) > 3;
        if (x2 <= 0) {
            z = false;
        }
        this.f33584u0 = lVar;
        if (z2 && z) {
            this.f33588y0.scrollToPosition(x - 3);
            m42594X1(x);
        } else if (z2) {
            this.f33588y0.scrollToPosition(x + 3);
            m42594X1(x);
        } else {
            m42594X1(x);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public void mo25420Z1(C7647k kVar) {
        this.f33585v0 = kVar;
        if (kVar == C7647k.YEAR) {
            this.f33587x0.getLayoutManager().mo4769x1(((C7668s) this.f33587x0.getAdapter()).mo25472w(this.f33584u0.f33640d));
            this.f33589z0.setVisibility(0);
            this.f33580A0.setVisibility(8);
        } else if (kVar == C7647k.DAY) {
            this.f33589z0.setVisibility(8);
            this.f33580A0.setVisibility(0);
            mo25419Y1(this.f33584u0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public void mo25421a2() {
        C7647k kVar = this.f33585v0;
        C7647k kVar2 = C7647k.YEAR;
        if (kVar == kVar2) {
            mo25420Z1(C7647k.DAY);
        } else if (kVar == C7647k.DAY) {
            mo25420Z1(kVar2);
        }
    }

    /* renamed from: m0 */
    public void mo3826m0(Bundle bundle) {
        super.mo3826m0(bundle);
        if (bundle == null) {
            bundle = mo3828n();
        }
        this.f33581r0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f33582s0 = (C7631d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f33583t0 = (C7625a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f33584u0 = (C7657l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: q0 */
    public View mo3840q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo3837p(), this.f33581r0);
        this.f33586w0 = new C7630c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C7657l i3 = this.f33583t0.mo25380i();
        if (C7649i.m42627j2(contextThemeWrapper)) {
            i2 = C10132h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C10132h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C10130f.mtrl_calendar_days_of_week);
        C0835a0.m3741n0(gridView, new C7638b());
        gridView.setAdapter(new C7635g());
        gridView.setNumColumns(i3.f33641e);
        gridView.setEnabled(false);
        this.f33588y0 = (RecyclerView) inflate.findViewById(C10130f.mtrl_calendar_months);
        this.f33588y0.setLayoutManager(new C7639c(mo3837p(), i, false, i));
        this.f33588y0.setTag(f33576B0);
        C7660n nVar = new C7660n(contextThemeWrapper, this.f33582s0, this.f33583t0, new C7640d());
        this.f33588y0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(C10131g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C10130f.mtrl_calendar_year_selector_frame);
        this.f33587x0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f33587x0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f33587x0.setAdapter(new C7668s(this));
            this.f33587x0.addItemDecoration(m42591P1());
        }
        if (inflate.findViewById(C10130f.month_navigation_fragment_toggle) != null) {
            m42590O1(inflate, nVar);
        }
        if (!C7649i.m42627j2(contextThemeWrapper)) {
            new C1407h().mo5524b(this.f33588y0);
        }
        this.f33588y0.scrollToPosition(nVar.mo25466x(this.f33584u0));
        return inflate;
    }
}
