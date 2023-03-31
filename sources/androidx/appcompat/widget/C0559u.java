package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C0737c;

/* renamed from: androidx.appcompat.widget.u */
/* compiled from: AppCompatProgressBarHelper */
class C0559u {

    /* renamed from: c */
    private static final int[] f1829c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1830a;

    /* renamed from: b */
    private Bitmap f1831b;

    /* renamed from: androidx.appcompat.widget.u$a */
    /* compiled from: AppCompatProgressBarHelper */
    private static class C0560a {
        /* renamed from: a */
        public static void m2689a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    C0559u(ProgressBar progressBar) {
        this.f1830a = progressBar;
    }

    /* renamed from: a */
    private Shape m2684a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: e */
    private Drawable m2685e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d = mo2618d(animationDrawable.getFrame(i), true);
            d.setLevel(10000);
            animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap mo2616b() {
        return this.f1831b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2617c(AttributeSet attributeSet, int i) {
        C0452a1 v = C0452a1.m2210v(this.f1830a.getContext(), attributeSet, f1829c, i, 0);
        Drawable h = v.mo2049h(0);
        if (h != null) {
            this.f1830a.setIndeterminateDrawable(m2685e(h));
        }
        Drawable h2 = v.mo2049h(1);
        if (h2 != null) {
            this.f1830a.setProgressDrawable(mo2618d(h2, false));
        }
        v.mo2061w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Drawable mo2618d(Drawable drawable, boolean z) {
        if (drawable instanceof C0737c) {
            C0737c cVar = (C0737c) drawable;
            Drawable b = cVar.mo3074b();
            if (b != null) {
                cVar.mo3073a(mo2618d(b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = mo2618d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                if (Build.VERSION.SDK_INT >= 23) {
                    C0560a.m2689a(layerDrawable, layerDrawable2, i2);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1831b == null) {
                this.f1831b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m2684a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
