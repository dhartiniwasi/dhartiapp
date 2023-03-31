package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.p */
/* compiled from: PickerFragment */
abstract class C7664p<S> extends Fragment {

    /* renamed from: q0 */
    protected final LinkedHashSet<C7663o<S>> f33657q0 = new LinkedHashSet<>();

    C7664p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public boolean mo25470F1(C7663o<S> oVar) {
        return this.f33657q0.add(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public void mo25471G1() {
        this.f33657q0.clear();
    }
}
