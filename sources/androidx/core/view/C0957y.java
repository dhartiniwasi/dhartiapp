package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: androidx.core.view.y */
/* compiled from: TintableBackgroundView */
public interface C0957y {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
