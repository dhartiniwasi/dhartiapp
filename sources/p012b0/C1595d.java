package p012b0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C1014e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: b0.d */
/* compiled from: EmojiInputFilter */
final class C1595d implements InputFilter {

    /* renamed from: a */
    private final TextView f4585a;

    /* renamed from: b */
    private C1014e.C1020e f4586b;

    /* renamed from: b0.d$a */
    /* compiled from: EmojiInputFilter */
    private static class C1596a extends C1014e.C1020e {

        /* renamed from: a */
        private final Reference<TextView> f4587a;

        /* renamed from: b */
        private final Reference<C1595d> f4588b;

        C1596a(TextView textView, C1595d dVar) {
            this.f4587a = new WeakReference(textView);
            this.f4588b = new WeakReference(dVar);
        }

        /* renamed from: c */
        private boolean m7356c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo3647b() {
            CharSequence text;
            CharSequence o;
            super.mo3647b();
            TextView textView = this.f4587a.get();
            if (m7356c(textView, this.f4588b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (o = C1014e.m4544b().mo3633o(text))) {
                int selectionStart = Selection.getSelectionStart(o);
                int selectionEnd = Selection.getSelectionEnd(o);
                textView.setText(o);
                if (o instanceof Spannable) {
                    C1595d.m7355b((Spannable) o, selectionStart, selectionEnd);
                }
            }
        }
    }

    C1595d(TextView textView) {
        this.f4585a = textView;
    }

    /* renamed from: a */
    private C1014e.C1020e m7354a() {
        if (this.f4586b == null) {
            this.f4586b = new C1596a(this.f4585a, this);
        }
        return this.f4586b;
    }

    /* renamed from: b */
    static void m7355b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f4585a.isInEditMode()) {
            return charSequence;
        }
        int d = C1014e.m4544b().mo3628d();
        if (d != 0) {
            boolean z = true;
            if (d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f4585a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C1014e.m4544b().mo3634p(charSequence, 0, charSequence.length());
            } else if (d != 3) {
                return charSequence;
            }
        }
        C1014e.m4544b().mo3637s(m7354a());
        return charSequence;
    }
}
