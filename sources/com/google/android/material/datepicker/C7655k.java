package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.k */
/* compiled from: MaterialTextInputPicker */
public final class C7655k<S> extends C7664p<S> {

    /* renamed from: r0 */
    private C7631d<S> f33634r0;

    /* renamed from: s0 */
    private C7625a f33635s0;

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* compiled from: MaterialTextInputPicker */
    class C7656a implements C7663o<S> {
        C7656a() {
        }

        /* renamed from: a */
        public void mo25431a(S s) {
            Iterator it = C7655k.this.f33657q0.iterator();
            while (it.hasNext()) {
                ((C7663o) it.next()).mo25431a(s);
            }
        }
    }

    /* renamed from: H1 */
    static <T> C7655k<T> m42642H1(C7631d<T> dVar, C7625a aVar) {
        C7655k<T> kVar = new C7655k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.mo3855u1(bundle);
        return kVar;
    }

    /* renamed from: I0 */
    public void mo3758I0(Bundle bundle) {
        super.mo3758I0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f33634r0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f33635s0);
    }

    /* renamed from: m0 */
    public void mo3826m0(Bundle bundle) {
        super.mo3826m0(bundle);
        if (bundle == null) {
            bundle = mo3828n();
        }
        this.f33634r0 = (C7631d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f33635s0 = (C7625a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: q0 */
    public View mo3840q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f33634r0.mo25400y0(layoutInflater, viewGroup, bundle, this.f33635s0, new C7656a());
    }
}
