package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C7636h;
import java.util.Calendar;
import java.util.Locale;
import p227f6.C10132h;
import p227f6.C10133i;

/* renamed from: com.google.android.material.datepicker.s */
/* compiled from: YearGridAdapter */
class C7668s extends RecyclerView.C1339g<C7670b> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7636h<?> f33659c;

    /* renamed from: com.google.android.material.datepicker.s$a */
    /* compiled from: YearGridAdapter */
    class C7669a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f33660a;

        C7669a(int i) {
            this.f33660a = i;
        }

        public void onClick(View view) {
            C7668s.this.f33659c.mo25419Y1(C7657l.m42647b(this.f33660a, C7668s.this.f33659c.mo25416S1().f33639c));
            C7668s.this.f33659c.mo25420Z1(C7636h.C7647k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.s$b */
    /* compiled from: YearGridAdapter */
    public static class C7670b extends RecyclerView.C1336d0 {

        /* renamed from: t */
        final TextView f33662t;

        C7670b(TextView textView) {
            super(textView);
            this.f33662t = textView;
        }
    }

    C7668s(C7636h<?> hVar) {
        this.f33659c = hVar;
    }

    /* renamed from: v */
    private View.OnClickListener m42700v(int i) {
        return new C7669a(i);
    }

    /* renamed from: c */
    public int mo5060c() {
        return this.f33659c.mo25414Q1().mo25381j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public int mo25472w(int i) {
        return i - this.f33659c.mo25414Q1().mo25380i().f33640d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo25473x(int i) {
        return this.f33659c.mo25414Q1().mo25380i().f33640d + i;
    }

    /* renamed from: y */
    public void mo5067j(C7670b bVar, int i) {
        int x = mo25473x(i);
        String string = bVar.f33662t.getContext().getString(C10133i.mtrl_picker_navigate_to_year_description);
        bVar.f33662t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(x)}));
        bVar.f33662t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(x)}));
        C7630c R1 = this.f33659c.mo25415R1();
        Calendar i2 = C7667r.m42692i();
        C7629b bVar2 = i2.get(1) == x ? R1.f33568f : R1.f33566d;
        for (Long longValue : this.f33659c.mo25417T1().mo25397c1()) {
            i2.setTimeInMillis(longValue.longValue());
            if (i2.get(1) == x) {
                bVar2 = R1.f33567e;
            }
        }
        bVar2.mo25392d(bVar.f33662t);
        bVar.f33662t.setOnClickListener(m42700v(x));
    }

    /* renamed from: z */
    public C7670b mo5069l(ViewGroup viewGroup, int i) {
        return new C7670b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C10132h.mtrl_calendar_year, viewGroup, false));
    }
}
