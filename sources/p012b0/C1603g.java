package p012b0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C1014e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: b0.g */
/* compiled from: EmojiTextWatcher */
final class C1603g implements TextWatcher {

    /* renamed from: a */
    private final EditText f4596a;

    /* renamed from: b */
    private final boolean f4597b;

    /* renamed from: c */
    private C1014e.C1020e f4598c;

    /* renamed from: d */
    private int f4599d = Integer.MAX_VALUE;

    /* renamed from: e */
    private int f4600e = 0;

    /* renamed from: f */
    private boolean f4601f;

    /* renamed from: b0.g$a */
    /* compiled from: EmojiTextWatcher */
    private static class C1604a extends C1014e.C1020e {

        /* renamed from: a */
        private final Reference<EditText> f4602a;

        C1604a(EditText editText) {
            this.f4602a = new WeakReference(editText);
        }

        /* renamed from: b */
        public void mo3647b() {
            super.mo3647b();
            C1603g.m7382b(this.f4602a.get(), 1);
        }
    }

    C1603g(EditText editText, boolean z) {
        this.f4596a = editText;
        this.f4597b = z;
        this.f4601f = true;
    }

    /* renamed from: a */
    private C1014e.C1020e m7381a() {
        if (this.f4598c == null) {
            this.f4598c = new C1604a(this.f4596a);
        }
        return this.f4598c;
    }

    /* renamed from: b */
    static void m7382b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1014e.m4544b().mo3633o(editableText);
            C1595d.m7355b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: d */
    private boolean m7383d() {
        return !this.f4601f || (!this.f4597b && !C1014e.m4548h());
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public void mo6440c(boolean z) {
        if (this.f4601f != z) {
            if (this.f4598c != null) {
                C1014e.m4544b().mo3638t(this.f4598c);
            }
            this.f4601f = z;
            if (z) {
                m7382b(this.f4596a, C1014e.m4544b().mo3628d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f4596a.isInEditMode() && !m7383d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int d = C1014e.m4544b().mo3628d();
            if (d != 0) {
                if (d == 1) {
                    C1014e.m4544b().mo3636r((Spannable) charSequence, i, i + i3, this.f4599d, this.f4600e);
                    return;
                } else if (d != 3) {
                    return;
                }
            }
            C1014e.m4544b().mo3637s(m7381a());
        }
    }
}
