package com.startapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;

/* renamed from: com.startapp.y5 */
/* compiled from: Sta */
public class C9656y5 {

    /* renamed from: a */
    public RelativeLayout f39438a;

    /* renamed from: b */
    public ImageView f39439b;

    /* renamed from: c */
    public TextView f39440c;

    /* renamed from: d */
    public TextView f39441d;

    /* renamed from: e */
    public TextView f39442e;

    /* renamed from: f */
    public RatingBar f39443f;

    /* renamed from: g */
    public MetaDataStyle f39444g = null;

    /* renamed from: com.startapp.y5$a */
    /* compiled from: Sta */
    public class C9657a extends ShapeDrawable {
        public C9657a(C9656y5 y5Var, Shape shape) {
            super(shape);
        }

        public void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public C9656y5(Context context) {
        Context context2 = context;
        context2.setTheme(16973829);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        this.f39438a = new RelativeLayout(context2);
        this.f39438a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.m49636k().mo30471p(), AdsCommonMetaData.m49636k().mo30470o()}));
        this.f39438a.setLayoutParams(layoutParams);
        int a = C9265rb.m49233a(context2, 3);
        int a2 = C9265rb.m49233a(context2, 4);
        int a3 = C9265rb.m49233a(context2, 5);
        int a4 = C9265rb.m49233a(context2, 6);
        int a5 = C9265rb.m49233a(context2, 10);
        int a6 = C9265rb.m49233a(context2, 84);
        this.f39438a.setPadding(a5, a, a5, a);
        this.f39438a.setTag(this);
        ImageView imageView = new ImageView(context2);
        this.f39439b = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a6, a6);
        layoutParams2.addRule(15);
        this.f39439b.setLayoutParams(layoutParams2);
        this.f39439b.setPadding(0, 0, a4, 0);
        TextView textView = new TextView(context2);
        this.f39440c = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(C8837b0.m48293a(17), 1);
        layoutParams3.addRule(6, 1);
        this.f39440c.setLayoutParams(layoutParams3);
        this.f39440c.setPadding(0, 0, 0, a3);
        this.f39440c.setTextColor(AdsCommonMetaData.m49636k().mo30472q().intValue());
        this.f39440c.setTextSize((float) AdsCommonMetaData.m49636k().mo30474s().intValue());
        this.f39440c.setSingleLine(true);
        this.f39440c.setEllipsize(TextUtils.TruncateAt.END);
        C9265rb.m49238a(this.f39440c, AdsCommonMetaData.m49636k().mo30473r());
        TextView textView2 = new TextView(context2);
        this.f39441d = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(C8837b0.m48293a(17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, a3);
        this.f39441d.setLayoutParams(layoutParams4);
        this.f39441d.setTextColor(AdsCommonMetaData.m49636k().mo30467l().intValue());
        this.f39441d.setTextSize((float) AdsCommonMetaData.m49636k().mo30469n().intValue());
        this.f39441d.setSingleLine(true);
        this.f39441d.setEllipsize(TextUtils.TruncateAt.END);
        C9265rb.m49238a(this.f39441d, AdsCommonMetaData.m49636k().mo30468m());
        this.f39443f = new RatingBar(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(C8837b0.m48293a(17), 1);
        layoutParams5.addRule(8, 1);
        layoutParams5.setMargins(0, 0, 0, -a3);
        this.f39443f.setLayoutParams(layoutParams5);
        this.f39443f.setPadding(0, 0, 0, a2);
        this.f39443f.setId(5);
        this.f39442e = new TextView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(C8837b0.m48293a(21));
        layoutParams6.addRule(8, 1);
        this.f39442e.setLayoutParams(layoutParams6);
        mo31489a(false);
        this.f39442e.setTextColor(-1);
        this.f39442e.setTextSize(12.0f);
        this.f39442e.setTypeface((Typeface) null, 1);
        this.f39442e.setPadding(a5, a4, a5, a4);
        this.f39442e.setId(4);
        this.f39442e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f39442e.setBackgroundDrawable(new C9657a(this, new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, (RectF) null, (float[]) null)));
        this.f39438a.addView(this.f39439b);
        this.f39438a.addView(this.f39440c);
        this.f39438a.addView(this.f39441d);
        this.f39438a.addView(this.f39443f);
        this.f39438a.addView(this.f39442e);
    }

    /* renamed from: a */
    public void mo31489a(boolean z) {
        if (z) {
            this.f39442e.setText("Open");
        } else {
            this.f39442e.setText("Download");
        }
    }
}
