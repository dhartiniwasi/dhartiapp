package p012b0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C1014e;

/* renamed from: b0.h */
/* compiled from: EmojiTransformationMethod */
class C1605h implements TransformationMethod {

    /* renamed from: a */
    private final TransformationMethod f4603a;

    C1605h(TransformationMethod transformationMethod) {
        this.f4603a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod mo6442a() {
        return this.f4603a;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4603a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C1014e.m4544b().mo3628d() != 1) ? charSequence : C1014e.m4544b().mo3633o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f4603a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
