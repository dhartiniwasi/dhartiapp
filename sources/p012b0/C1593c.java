package p012b0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C1014e;

/* renamed from: b0.c */
/* compiled from: EmojiInputConnection */
final class C1593c extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f4583a;

    /* renamed from: b */
    private final C1594a f4584b;

    /* renamed from: b0.c$a */
    /* compiled from: EmojiInputConnection */
    public static class C1594a {
        /* renamed from: a */
        public boolean mo6420a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C1014e.m4545e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void mo6421b(EditorInfo editorInfo) {
            if (C1014e.m4548h()) {
                C1014e.m4544b().mo3639u(editorInfo);
            }
        }
    }

    C1593c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C1594a());
    }

    /* renamed from: a */
    private Editable m7351a() {
        return this.f4583a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        return this.f4584b.mo6420a(this, m7351a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f4584b.mo6420a(this, m7351a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    C1593c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C1594a aVar) {
        super(inputConnection, false);
        this.f4583a = textView;
        this.f4584b = aVar;
        aVar.mo6421b(editorInfo);
    }
}
