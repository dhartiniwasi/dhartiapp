package p157w;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.C0831h;

/* renamed from: w.a */
/* compiled from: EditorInfoCompat */
public final class C5861a {

    /* renamed from: a */
    private static final String[] f28991a = new String[0];

    /* renamed from: w.a$a */
    /* compiled from: EditorInfoCompat */
    private static class C5862a {
        /* renamed from: a */
        static void m34743a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m34735a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f28991a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f28991a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f28991a;
    }

    /* renamed from: b */
    private static boolean m34736b(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    private static boolean m34737c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m34738d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m34739e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        C0831h.m3662f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C5862a.m34743a(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            m34741g(editorInfo, (CharSequence) null, 0, 0);
        } else if (m34737c(editorInfo.inputType)) {
            m34741g(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            m34741g(editorInfo, charSequence, i4, i5);
        } else {
            m34742h(editorInfo, charSequence, i4, i5);
        }
    }

    /* renamed from: f */
    public static void m34740f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C5862a.m34743a(editorInfo, charSequence, 0);
        } else {
            m34739e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m34741g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    private static void m34742h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m34736b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m34736b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i4 + min;
        if (i4 != i3) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)});
        } else {
            charSequence2 = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        m34741g(editorInfo, charSequence2, i8, i4 + i8);
    }
}
