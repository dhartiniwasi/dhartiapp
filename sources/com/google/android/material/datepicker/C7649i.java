package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.fragment.app.C1086d;
import androidx.fragment.app.C1146w;
import com.google.android.material.datepicker.C7625a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p055h.C4411a;
import p227f6.C10126b;
import p227f6.C10128d;
import p227f6.C10129e;
import p227f6.C10130f;
import p227f6.C10132h;
import p227f6.C10133i;
import p227f6.C10134j;
import p292m6.C11802a;
import p346s6.C12455b;
import p375v6.C12822g;

/* renamed from: com.google.android.material.datepicker.i */
/* compiled from: MaterialDatePicker */
public final class C7649i<S> extends C1086d {

    /* renamed from: W0 */
    static final Object f33611W0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: X0 */
    static final Object f33612X0 = "CANCEL_BUTTON_TAG";

    /* renamed from: Y0 */
    static final Object f33613Y0 = "TOGGLE_BUTTON_TAG";
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public final LinkedHashSet<C7654j<? super S>> f33614G0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public final LinkedHashSet<View.OnClickListener> f33615H0 = new LinkedHashSet<>();

    /* renamed from: I0 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f33616I0 = new LinkedHashSet<>();

    /* renamed from: J0 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f33617J0 = new LinkedHashSet<>();

    /* renamed from: K0 */
    private int f33618K0;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public C7631d<S> f33619L0;

    /* renamed from: M0 */
    private C7664p<S> f33620M0;

    /* renamed from: N0 */
    private C7625a f33621N0;

    /* renamed from: O0 */
    private C7636h<S> f33622O0;

    /* renamed from: P0 */
    private int f33623P0;

    /* renamed from: Q0 */
    private CharSequence f33624Q0;

    /* renamed from: R0 */
    private boolean f33625R0;

    /* renamed from: S0 */
    private TextView f33626S0;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public CheckableImageButton f33627T0;

    /* renamed from: U0 */
    private C12822g f33628U0;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public Button f33629V0;

    /* renamed from: com.google.android.material.datepicker.i$a */
    /* compiled from: MaterialDatePicker */
    class C7650a implements View.OnClickListener {
        C7650a() {
        }

        public void onClick(View view) {
            Iterator it = C7649i.this.f33614G0.iterator();
            while (it.hasNext()) {
                ((C7654j) it.next()).mo25433a(C7649i.this.mo25428g2());
            }
            C7649i.this.mo3968I1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    /* compiled from: MaterialDatePicker */
    class C7651b implements View.OnClickListener {
        C7651b() {
        }

        public void onClick(View view) {
            Iterator it = C7649i.this.f33615H0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C7649i.this.mo3968I1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$c */
    /* compiled from: MaterialDatePicker */
    class C7652c implements C7663o<S> {
        C7652c() {
        }

        /* renamed from: a */
        public void mo25431a(S s) {
            C7649i.this.m42630m2();
            if (C7649i.this.f33619L0.mo25396V0()) {
                C7649i.this.f33629V0.setEnabled(true);
            } else {
                C7649i.this.f33629V0.setEnabled(false);
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$d */
    /* compiled from: MaterialDatePicker */
    class C7653d implements View.OnClickListener {
        C7653d() {
        }

        public void onClick(View view) {
            C7649i.this.f33627T0.toggle();
            C7649i iVar = C7649i.this;
            iVar.m42631n2(iVar.f33627T0);
            C7649i.this.m42628k2();
        }
    }

    /* renamed from: c2 */
    private static Drawable m42622c2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C4411a.m29346b(context, C10129e.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C4411a.m29346b(context, C10129e.ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: d2 */
    private static int m42623d2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C10128d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C10128d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C10128d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C10128d.mtrl_calendar_days_of_week_height);
        int i = C7659m.f33644e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C10128d.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C10128d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C10128d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: f2 */
    private static int m42624f2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C10128d.mtrl_calendar_content_padding);
        int i = C7657l.m42649r().f33641e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C10128d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C10128d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: h2 */
    private int m42625h2(Context context) {
        int i = this.f33618K0;
        if (i != 0) {
            return i;
        }
        return this.f33619L0.mo25395N0(context);
    }

    /* renamed from: i2 */
    private void m42626i2(Context context) {
        this.f33627T0.setTag(f33613Y0);
        this.f33627T0.setImageDrawable(m42622c2(context));
        C0835a0.m3741n0(this.f33627T0, (C0832a) null);
        m42631n2(this.f33627T0);
        this.f33627T0.setOnClickListener(new C7653d());
    }

    /* renamed from: j2 */
    static boolean m42627j2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C12455b.m59418c(context, C10126b.materialCalendarStyle, C7636h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m42628k2() {
        this.f33622O0 = C7636h.m42593W1(this.f33619L0, m42625h2(mo3827m1()), this.f33621N0);
        this.f33620M0 = this.f33627T0.isChecked() ? C7655k.m42642H1(this.f33619L0, this.f33621N0) : this.f33622O0;
        m42630m2();
        C1146w l = mo3831o().mo4154l();
        l.mo4293m(C10130f.mtrl_calendar_frame, this.f33620M0);
        l.mo3885h();
        this.f33620M0.mo25470F1(new C7652c());
    }

    /* renamed from: l2 */
    public static long m42629l2() {
        return C7657l.m42649r().f33643g;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public void m42630m2() {
        String e2 = mo25427e2();
        this.f33626S0.setContentDescription(String.format(mo3769O(C10133i.mtrl_picker_announce_current_selection), new Object[]{e2}));
        this.f33626S0.setText(e2);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m42631n2(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f33627T0.isChecked()) {
            str = checkableImageButton.getContext().getString(C10133i.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C10133i.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f33627T0.setContentDescription(str);
    }

    /* renamed from: I0 */
    public final void mo3758I0(Bundle bundle) {
        super.mo3758I0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f33618K0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f33619L0);
        C7625a.C7627b bVar = new C7625a.C7627b(this.f33621N0);
        if (this.f33622O0.mo25416S1() != null) {
            bVar.mo25388b(this.f33622O0.mo25416S1().f33643g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo25387a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f33623P0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f33624Q0);
    }

    /* renamed from: J0 */
    public void mo3760J0() {
        super.mo3760J0();
        Window window = mo3974Q1().getWindow();
        if (this.f33625R0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f33628U0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo3757I().getDimensionPixelOffset(C10128d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f33628U0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C11802a(mo3974Q1(), rect));
        }
        m42628k2();
    }

    /* renamed from: K0 */
    public void mo3762K0() {
        this.f33620M0.mo25471G1();
        super.mo3762K0();
    }

    /* renamed from: M1 */
    public final Dialog mo3971M1(Bundle bundle) {
        Dialog dialog = new Dialog(mo3827m1(), m42625h2(mo3827m1()));
        Context context = dialog.getContext();
        this.f33625R0 = m42627j2(context);
        int c = C12455b.m59418c(context, C10126b.colorSurface, C7649i.class.getCanonicalName());
        C12822g gVar = new C12822g(context, (AttributeSet) null, C10126b.materialCalendarStyle, C10134j.Widget_MaterialComponents_MaterialCalendar);
        this.f33628U0 = gVar;
        gVar.mo37741L(context);
        this.f33628U0.mo37745T(ColorStateList.valueOf(c));
        this.f33628U0.mo37744S(C0835a0.m3756v(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* renamed from: e2 */
    public String mo25427e2() {
        return this.f33619L0.mo25393G(mo3837p());
    }

    /* renamed from: g2 */
    public final S mo25428g2() {
        return this.f33619L0.mo25398h1();
    }

    /* renamed from: m0 */
    public final void mo3826m0(Bundle bundle) {
        super.mo3826m0(bundle);
        if (bundle == null) {
            bundle = mo3828n();
        }
        this.f33618K0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f33619L0 = (C7631d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f33621N0 = (C7625a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f33623P0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f33624Q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f33616I0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f33617J0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) mo3773Q();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: q0 */
    public final View mo3840q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f33625R0 ? C10132h.mtrl_picker_fullscreen : C10132h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f33625R0) {
            inflate.findViewById(C10130f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m42624f2(context), -2));
        } else {
            View findViewById = inflate.findViewById(C10130f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C10130f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m42624f2(context), -1));
            findViewById2.setMinimumHeight(m42623d2(mo3827m1()));
        }
        TextView textView = (TextView) inflate.findViewById(C10130f.mtrl_picker_header_selection_text);
        this.f33626S0 = textView;
        C0835a0.m3745p0(textView, 1);
        this.f33627T0 = (CheckableImageButton) inflate.findViewById(C10130f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C10130f.mtrl_picker_title_text);
        CharSequence charSequence = this.f33624Q0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f33623P0);
        }
        m42626i2(context);
        this.f33629V0 = (Button) inflate.findViewById(C10130f.confirm_button);
        if (this.f33619L0.mo25396V0()) {
            this.f33629V0.setEnabled(true);
        } else {
            this.f33629V0.setEnabled(false);
        }
        this.f33629V0.setTag(f33611W0);
        this.f33629V0.setOnClickListener(new C7650a());
        Button button = (Button) inflate.findViewById(C10130f.cancel_button);
        button.setTag(f33612X0);
        button.setOnClickListener(new C7651b());
        return inflate;
    }
}
