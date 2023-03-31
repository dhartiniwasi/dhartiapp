package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.t5 */
/* compiled from: Sta */
public class C9552t5 extends ArrayAdapter<C9637x5> {

    /* renamed from: a */
    public String f39186a;

    /* renamed from: b */
    public String f39187b;

    public C9552t5(Context context, List list, String str, String str2) {
        super(context, 0, list);
        this.f39186a = str;
        this.f39187b = str2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C9656y5 y5Var;
        long j;
        if (view == null) {
            y5Var = new C9656y5(getContext());
            view2 = y5Var.f39438a;
        } else {
            view2 = view;
            y5Var = (C9656y5) view.getTag();
        }
        C9637x5 x5Var = (C9637x5) getItem(i);
        MetaDataStyle a = AdsCommonMetaData.f38625h.mo30454a(x5Var.f39384q);
        boolean z = true;
        if (y5Var.f39444g != a) {
            y5Var.f39444g = a;
            y5Var.f39438a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a.mo31051e().intValue(), a.mo31050d().intValue()}));
            y5Var.f39440c.setTextSize((float) a.mo31055h().intValue());
            y5Var.f39440c.setTextColor(a.mo31053f().intValue());
            C9265rb.m49238a(y5Var.f39440c, a.mo31054g());
            y5Var.f39441d.setTextSize((float) a.mo31049c().intValue());
            y5Var.f39441d.setTextColor(a.mo31047a().intValue());
            C9265rb.m49238a(y5Var.f39441d, a.mo31048b());
        }
        y5Var.f39440c.setText(x5Var.f39374g);
        y5Var.f39441d.setText(x5Var.f39375h);
        C9677z5 a2 = C8823a6.f36412b.mo29085a(this.f39187b);
        Bitmap a3 = a2.f39552a.mo29385a(i, x5Var.f39368a, x5Var.f39376i);
        if (a3 == null) {
            y5Var.f39439b.setImageResource(17301651);
            y5Var.f39439b.setTag("tag_error");
        } else {
            y5Var.f39439b.setImageBitmap(a3);
            y5Var.f39439b.setTag("tag_ok");
        }
        y5Var.f39443f.setRating(x5Var.f39377j);
        if (x5Var.f39381n == null) {
            z = false;
        }
        y5Var.mo31489a(z);
        C9677z5 a4 = C8823a6.f36412b.mo29085a(this.f39187b);
        Context context = getContext();
        String[] strArr = x5Var.f39370c;
        TrackingParams trackingParams = new TrackingParams(this.f39186a);
        Long l = x5Var.f39382o;
        if (l != null) {
            j = TimeUnit.SECONDS.toMillis(l.longValue());
        } else {
            j = TimeUnit.SECONDS.toMillis(MetaData.f38952k.mo31037r());
        }
        long j2 = j;
        C8968g4 g4Var = a4.f39552a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String a5 = g4Var.mo29386a(strArr, a4.f39554c);
        if (!g4Var.f36812a.containsKey(a5)) {
            C9087k9 k9Var = new C9087k9(context, placement, strArr, trackingParams, j2);
            g4Var.f36812a.put(a5, k9Var);
            k9Var.mo29609b();
        }
        return view2;
    }
}
