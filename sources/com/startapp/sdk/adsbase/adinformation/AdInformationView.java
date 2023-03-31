package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.C9265rb;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class AdInformationView extends RelativeLayout {

    /* renamed from: a */
    public ImageView f38733a;

    /* renamed from: b */
    public RelativeLayout f38734b;

    /* renamed from: c */
    public View.OnClickListener f38735c = null;

    /* renamed from: d */
    public AdInformationConfig f38736d;

    /* renamed from: e */
    public ImageResourceConfig f38737e;

    /* renamed from: f */
    public final AdInformationPositions.Position f38738f;

    /* renamed from: com.startapp.sdk.adsbase.adinformation.AdInformationView$a */
    /* compiled from: Sta */
    public class C9399a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ View.OnClickListener f38739a;

        public C9399a(AdInformationView adInformationView, View.OnClickListener onClickListener) {
            this.f38739a = onClickListener;
        }

        public void onClick(View view) {
            this.f38739a.onClick(view);
        }
    }

    public AdInformationView(Context context, AdInformationObject.Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, View.OnClickListener onClickListener) {
        super(context);
        this.f38735c = new C9399a(this, onClickListener);
        AdInformationConfig a = AdInformationMetaData.m49810c().mo30603a();
        this.f38736d = a;
        if (a == null) {
            this.f38736d = AdInformationConfig.m49798a();
        }
        this.f38737e = this.f38736d.mo30592a(size.mo30610a());
        if (adInformationOverrides == null || !adInformationOverrides.mo30617e()) {
            this.f38738f = this.f38736d.mo30591a(placement);
        } else {
            this.f38738f = adInformationOverrides.mo30614b();
        }
        ImageView imageView = new ImageView(getContext());
        this.f38733a = imageView;
        imageView.setContentDescription("info");
        this.f38733a.setId(1475346433);
        this.f38733a.setImageBitmap(this.f38737e.mo30628a(getContext()));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f38734b = relativeLayout;
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(mo30625d(), mo30624c());
        layoutParams.setMargins(0, 0, 0, 0);
        this.f38733a.setPadding(0, 0, 0, 0);
        this.f38738f.addRules(layoutParams);
        this.f38734b.addView(this.f38733a, layoutParams);
        this.f38734b.setOnClickListener(this.f38735c);
        addView(this.f38734b, new RelativeLayout.LayoutParams(mo30623b(), mo30622a()));
    }

    /* renamed from: a */
    public int mo30622a() {
        return (int) (this.f38736d.mo30598e() * ((float) mo30624c()));
    }

    /* renamed from: b */
    public int mo30623b() {
        return (int) (this.f38736d.mo30598e() * ((float) mo30625d()));
    }

    /* renamed from: c */
    public int mo30624c() {
        return C9265rb.m49233a(getContext(), this.f38737e.mo30627a());
    }

    /* renamed from: d */
    public int mo30625d() {
        return C9265rb.m49233a(getContext(), this.f38737e.mo30634d());
    }
}
