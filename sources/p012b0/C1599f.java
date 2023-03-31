package p012b0;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.C0831h;
import androidx.emoji2.text.C1014e;

/* renamed from: b0.f */
/* compiled from: EmojiTextViewHelper */
public final class C1599f {

    /* renamed from: a */
    private final C1601b f4591a;

    /* renamed from: b0.f$a */
    /* compiled from: EmojiTextViewHelper */
    private static class C1600a extends C1601b {

        /* renamed from: a */
        private final TextView f4592a;

        /* renamed from: b */
        private final C1595d f4593b;

        /* renamed from: c */
        private boolean f4594c = true;

        C1600a(TextView textView) {
            this.f4592a = textView;
            this.f4593b = new C1595d(textView);
        }

        /* renamed from: d */
        private InputFilter[] m7362d(InputFilter[] inputFilterArr) {
            for (C1595d dVar : inputFilterArr) {
                if (dVar == this.f4593b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f4593b;
            return inputFilterArr2;
        }

        /* renamed from: e */
        private SparseArray<InputFilter> m7363e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                if (inputFilterArr[i] instanceof C1595d) {
                    sparseArray.put(i, inputFilterArr[i]);
                }
            }
            return sparseArray;
        }

        /* renamed from: f */
        private InputFilter[] m7364f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> e = m7363e(inputFilterArr);
            if (e.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - e.size())];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (e.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: h */
        private TransformationMethod m7365h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C1605h ? ((C1605h) transformationMethod).mo6442a() : transformationMethod;
        }

        /* renamed from: i */
        private void m7366i() {
            this.f4592a.setFilters(mo6432a(this.f4592a.getFilters()));
        }

        /* renamed from: k */
        private TransformationMethod m7367k(TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof C1605h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new C1605h(transformationMethod);
            }
            return transformationMethod;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo6432a(InputFilter[] inputFilterArr) {
            if (!this.f4594c) {
                return m7364f(inputFilterArr);
            }
            return m7362d(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6433b(boolean z) {
            if (z) {
                mo6436j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6434c(boolean z) {
            this.f4594c = z;
            mo6436j();
            m7366i();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo6435g(boolean z) {
            this.f4594c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6436j() {
            this.f4592a.setTransformationMethod(mo6437l(this.f4592a.getTransformationMethod()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public TransformationMethod mo6437l(TransformationMethod transformationMethod) {
            if (this.f4594c) {
                return m7367k(transformationMethod);
            }
            return m7365h(transformationMethod);
        }
    }

    /* renamed from: b0.f$b */
    /* compiled from: EmojiTextViewHelper */
    static class C1601b {
        C1601b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo6432a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6433b(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6434c(boolean z) {
        }
    }

    /* renamed from: b0.f$c */
    /* compiled from: EmojiTextViewHelper */
    private static class C1602c extends C1601b {

        /* renamed from: a */
        private final C1600a f4595a;

        C1602c(TextView textView) {
            this.f4595a = new C1600a(textView);
        }

        /* renamed from: d */
        private boolean m7377d() {
            return !C1014e.m4548h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo6432a(InputFilter[] inputFilterArr) {
            if (m7377d()) {
                return inputFilterArr;
            }
            return this.f4595a.mo6432a(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6433b(boolean z) {
            if (!m7377d()) {
                this.f4595a.mo6433b(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6434c(boolean z) {
            if (m7377d()) {
                this.f4595a.mo6435g(z);
            } else {
                this.f4595a.mo6434c(z);
            }
        }
    }

    public C1599f(TextView textView, boolean z) {
        C0831h.m3663g(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f4591a = new C1601b();
        } else if (!z) {
            this.f4591a = new C1602c(textView);
        } else {
            this.f4591a = new C1600a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] mo6429a(InputFilter[] inputFilterArr) {
        return this.f4591a.mo6432a(inputFilterArr);
    }

    /* renamed from: b */
    public void mo6430b(boolean z) {
        this.f4591a.mo6433b(z);
    }

    /* renamed from: c */
    public void mo6431c(boolean z) {
        this.f4591a.mo6434c(z);
    }
}
