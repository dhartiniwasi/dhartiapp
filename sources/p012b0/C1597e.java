package p012b0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C1014e;

/* renamed from: b0.e */
/* compiled from: EmojiKeyListener */
final class C1597e implements KeyListener {

    /* renamed from: a */
    private final KeyListener f4589a;

    /* renamed from: b */
    private final C1598a f4590b;

    /* renamed from: b0.e$a */
    /* compiled from: EmojiKeyListener */
    public static class C1598a {
        /* renamed from: a */
        public boolean mo6428a(Editable editable, int i, KeyEvent keyEvent) {
            return C1014e.m4546f(editable, i, keyEvent);
        }
    }

    C1597e(KeyListener keyListener) {
        this(keyListener, new C1598a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f4589a.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f4589a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f4590b.mo6428a(editable, i, keyEvent) || this.f4589a.onKeyDown(view, editable, i, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f4589a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f4589a.onKeyUp(view, editable, i, keyEvent);
    }

    C1597e(KeyListener keyListener, C1598a aVar) {
        this.f4589a = keyListener;
        this.f4590b = aVar;
    }
}
