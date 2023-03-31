package p012b0;

import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C0831h;

/* renamed from: b0.a */
/* compiled from: EmojiEditTextHelper */
public final class C1589a {

    /* renamed from: a */
    private final C1591b f4575a;

    /* renamed from: b */
    private int f4576b = Integer.MAX_VALUE;

    /* renamed from: c */
    private int f4577c = 0;

    /* renamed from: b0.a$a */
    /* compiled from: EmojiEditTextHelper */
    private static class C1590a extends C1591b {

        /* renamed from: a */
        private final EditText f4578a;

        /* renamed from: b */
        private final C1603g f4579b;

        C1590a(EditText editText, boolean z) {
            this.f4578a = editText;
            C1603g gVar = new C1603g(editText, z);
            this.f4579b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(C1592b.getInstance());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo6414a(KeyListener keyListener) {
            if (keyListener instanceof C1597e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new C1597e(keyListener);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public InputConnection mo6415b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C1593c) {
                return inputConnection;
            }
            return new C1593c(this.f4578a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6416c(boolean z) {
            this.f4579b.mo6440c(z);
        }
    }

    /* renamed from: b0.a$b */
    /* compiled from: EmojiEditTextHelper */
    static class C1591b {
        C1591b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo6414a(KeyListener keyListener) {
            return keyListener;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public InputConnection mo6415b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6416c(boolean z) {
        }
    }

    public C1589a(EditText editText, boolean z) {
        C0831h.m3663g(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f4575a = new C1591b();
        } else {
            this.f4575a = new C1590a(editText, z);
        }
    }

    /* renamed from: a */
    public KeyListener mo6411a(KeyListener keyListener) {
        return this.f4575a.mo6414a(keyListener);
    }

    /* renamed from: b */
    public InputConnection mo6412b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f4575a.mo6415b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void mo6413c(boolean z) {
        this.f4575a.mo6416c(z);
    }
}
