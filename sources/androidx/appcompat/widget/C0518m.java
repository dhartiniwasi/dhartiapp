package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p012b0.C1589a;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.m */
/* compiled from: AppCompatEmojiEditTextHelper */
class C0518m {

    /* renamed from: a */
    private final EditText f1706a;

    /* renamed from: b */
    private final C1589a f1707b;

    C0518m(EditText editText) {
        this.f1706a = editText;
        this.f1707b = new C1589a(editText, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyListener mo2435a(KeyListener keyListener) {
        return mo2436b(keyListener) ? this.f1707b.mo6411a(keyListener) : keyListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2436b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2437c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1706a.getContext().obtainStyledAttributes(attributeSet, C4297j.f24076g0, i, 0);
        try {
            int i2 = C4297j.f24146u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2439e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public InputConnection mo2438d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1707b.mo6412b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2439e(boolean z) {
        this.f1707b.mo6413c(z);
    }
}
