package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C0827d;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.d */
/* compiled from: DateSelector */
public interface C7631d<S> extends Parcelable {
    /* renamed from: G */
    String mo25393G(Context context);

    /* renamed from: L */
    Collection<C0827d<Long, Long>> mo25394L();

    /* renamed from: N0 */
    int mo25395N0(Context context);

    /* renamed from: V0 */
    boolean mo25396V0();

    /* renamed from: c1 */
    Collection<Long> mo25397c1();

    /* renamed from: h1 */
    S mo25398h1();

    /* renamed from: x1 */
    void mo25399x1(long j);

    /* renamed from: y0 */
    View mo25400y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C7625a aVar, C7663o<S> oVar);
}
