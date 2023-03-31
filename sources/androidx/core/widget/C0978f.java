package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.f */
/* compiled from: ImageViewCompat */
public class C0978f {

    /* renamed from: androidx.core.widget.f$a */
    /* compiled from: ImageViewCompat */
    static class C0979a {
        /* renamed from: a */
        static ColorStateList m4433a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m4434b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m4435c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m4436d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m4429a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0979a.m4433a(imageView);
        }
        if (imageView instanceof C0999o) {
            return ((C0999o) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m4430b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0979a.m4434b(imageView);
        }
        if (imageView instanceof C0999o) {
            return ((C0999o) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m4431c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0979a.m4435c(imageView, colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && C0979a.m4433a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0999o) {
            ((C0999o) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m4432d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0979a.m4436d(imageView, mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && C0979a.m4433a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0999o) {
            ((C0999o) imageView).setSupportImageTintMode(mode);
        }
    }
}
