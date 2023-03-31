package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import p033d5.C4141r;
import p060h4.C4584t;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b20 extends RelativeLayout {

    /* renamed from: b */
    private static final float[] f7073b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: a */
    private AnimationDrawable f7074a;

    public b20(Context context, a20 a20, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C4141r.m28221k(a20);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f7073b, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(a20.mo8183b());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(a20.mo8184c())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(a20.mo8184c());
            textView.setTextColor(a20.mo8182a());
            textView.setTextSize((float) a20.mo8179J6());
            C4584t.m30036b();
            int y = im0.m14418y(context, 4);
            C4584t.m30036b();
            textView.setPadding(y, 0, im0.m14418y(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<d20> K6 = a20.mo8180K6();
        if (K6 != null && K6.size() > 1) {
            this.f7074a = new AnimationDrawable();
            for (d20 T : K6) {
                try {
                    this.f7074a.addFrame((Drawable) C4956b.m31384P0(T.mo9422T()), a20.mo8185d());
                } catch (Exception e) {
                    pm0.m18665e("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.f7074a);
        } else if (K6.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C4956b.m31384P0(((d20) K6.get(0)).mo9422T()));
            } catch (Exception e2) {
                pm0.m18665e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f7074a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
