package p012b0;

import android.text.Editable;
import androidx.emoji2.text.C1041n;

/* renamed from: b0.b */
/* compiled from: EmojiEditableFactory */
final class C1592b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f4580a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f4581b;

    /* renamed from: c */
    private static Class<?> f4582c;

    private C1592b() {
        try {
            f4582c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1592b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f4581b == null) {
            synchronized (f4580a) {
                if (f4581b == null) {
                    f4581b = new C1592b();
                }
            }
        }
        return f4581b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f4582c;
        if (cls != null) {
            return C1041n.m4648c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
