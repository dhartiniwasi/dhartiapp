package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.C0316j;
import androidx.appcompat.widget.C0478d0;
import androidx.appcompat.widget.C0490f;
import androidx.appcompat.widget.C0493g;
import androidx.appcompat.widget.C0563v;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import p255i6.C10547a;
import p337r6.C12256a;

@Keep
public class MaterialComponentsViewInflater extends C0316j {
    private static int floatingToolbarItemBackgroundResId = -1;

    /* access modifiers changed from: protected */
    public C0490f createButton(Context context, AttributeSet attributeSet) {
        if (shouldInflateAppCompatButton(context, attributeSet)) {
            return new C0490f(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0493g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C10547a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0563v createRadioButton(Context context, AttributeSet attributeSet) {
        return new C12256a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0478d0 createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (i != 23 && i != 24 && i != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        }
        int i2 = floatingToolbarItemBackgroundResId;
        if (!(i2 == 0 || i2 == -1)) {
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16842964 && floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i3, (String[]) null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
