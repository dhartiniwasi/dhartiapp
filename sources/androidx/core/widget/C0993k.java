package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0886c;
import androidx.core.view.C0954v;

/* renamed from: androidx.core.widget.k */
/* compiled from: TextViewOnReceiveContentListener */
public final class C0993k implements C0954v {

    /* renamed from: androidx.core.widget.k$a */
    /* compiled from: TextViewOnReceiveContentListener */
    private static final class C0994a {
        /* renamed from: a */
        static CharSequence m4502a(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* renamed from: androidx.core.widget.k$b */
    /* compiled from: TextViewOnReceiveContentListener */
    private static final class C0995b {
        /* renamed from: a */
        static CharSequence m4503a(Context context, ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    /* renamed from: b */
    private static CharSequence m4499b(Context context, ClipData.Item item, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0994a.m4502a(context, item, i);
        }
        return C0995b.m4503a(context, item, i);
    }

    /* renamed from: c */
    private static void m4500c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* renamed from: a */
    public C0886c mo3496a(View view, C0886c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        if (cVar.mo3360d() == 2) {
            return cVar;
        }
        ClipData b = cVar.mo3358b();
        int c = cVar.mo3359c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence b2 = m4499b(context, b.getItemAt(i), c);
            if (b2 != null) {
                if (!z) {
                    m4500c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
        }
        return null;
    }
}
