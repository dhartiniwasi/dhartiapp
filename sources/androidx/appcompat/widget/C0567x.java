package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0835a0;
import androidx.core.view.C0886c;

/* renamed from: androidx.appcompat.widget.x */
/* compiled from: AppCompatReceiveContentHelper */
final class C0567x {

    /* renamed from: androidx.appcompat.widget.x$a */
    /* compiled from: AppCompatReceiveContentHelper */
    private static final class C0568a {
        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        static boolean m2722a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0835a0.m3721d0(textView, new C0886c.C0887a(dragEvent.getClipData(), 3).mo3363a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m2723b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0835a0.m3721d0(view, new C0886c.C0887a(dragEvent.getClipData(), 3).mo3363a());
            return true;
        }
    }

    /* renamed from: a */
    static boolean m2719a(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C0835a0.m3688E(view) != null) {
            Activity c = m2721c(view);
            if (c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C0568a.m2722a(dragEvent, (TextView) view, c);
                    }
                    return C0568a.m2723b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    static boolean m2720b(TextView textView, int i) {
        ClipData clipData;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C0835a0.m3688E(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            C0886c.C0887a aVar = new C0886c.C0887a(clipData, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C0835a0.m3721d0(textView, aVar.mo3365c(i2).mo3363a());
        }
        return true;
    }

    /* renamed from: c */
    static Activity m2721c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
