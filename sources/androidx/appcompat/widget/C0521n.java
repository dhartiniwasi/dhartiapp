package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p012b0.C1599f;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.n */
/* compiled from: AppCompatEmojiTextHelper */
class C0521n {

    /* renamed from: a */
    private final TextView f1723a;

    /* renamed from: b */
    private final C1599f f1724b;

    C0521n(TextView textView) {
        this.f1723a = textView;
        this.f1724b = new C1599f(textView, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public InputFilter[] mo2480a(InputFilter[] inputFilterArr) {
        return this.f1724b.mo6429a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2481b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1723a.getContext().obtainStyledAttributes(attributeSet, C4297j.f24076g0, i, 0);
        try {
            int i2 = C4297j.f24146u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2483d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2482c(boolean z) {
        this.f1724b.mo6430b(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2483d(boolean z) {
        this.f1724b.mo6431c(z);
    }
}
