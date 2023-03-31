package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C0831h;

/* renamed from: androidx.appcompat.widget.b0 */
/* compiled from: AppCompatTextClassifierHelper */
final class C0455b0 {

    /* renamed from: a */
    private TextView f1503a;

    /* renamed from: b */
    private TextClassifier f1504b;

    /* renamed from: androidx.appcompat.widget.b0$a */
    /* compiled from: AppCompatTextClassifierHelper */
    private static final class C0456a {
        /* renamed from: a */
        static TextClassifier m2234a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    C0455b0(TextView textView) {
        this.f1503a = (TextView) C0831h.m3662f(textView);
    }

    /* renamed from: a */
    public TextClassifier mo2067a() {
        TextClassifier textClassifier = this.f1504b;
        return textClassifier == null ? C0456a.m2234a(this.f1503a) : textClassifier;
    }

    /* renamed from: b */
    public void mo2068b(TextClassifier textClassifier) {
        this.f1504b = textClassifier;
    }
}
