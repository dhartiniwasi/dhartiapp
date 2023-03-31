package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p055h.C4411a;
import p227f6.C10129e;
import p227f6.C10133i;

/* renamed from: com.google.android.material.textfield.h */
/* compiled from: PasswordToggleEndIconDelegate */
class C7755h extends C7751e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f34022d = new C7756a();

    /* renamed from: e */
    private final TextInputLayout.C7726f f34023e = new C7757b();

    /* renamed from: f */
    private final TextInputLayout.C7727g f34024f = new C7758c();

    /* renamed from: com.google.android.material.textfield.h$a */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7756a implements TextWatcher {
        C7756a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7755h hVar = C7755h.this;
            hVar.f33995c.setChecked(!hVar.m43143f());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7757b implements TextInputLayout.C7726f {
        C7757b() {
        }

        /* renamed from: a */
        public void mo25897a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C7755h hVar = C7755h.this;
            hVar.f33995c.setChecked(!hVar.m43143f());
            editText.removeTextChangedListener(C7755h.this.f34022d);
            editText.addTextChangedListener(C7755h.this.f34022d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7758c implements TextInputLayout.C7727g {
        C7758c() {
        }

        /* renamed from: a */
        public void mo25898a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7759d implements View.OnClickListener {
        C7759d() {
        }

        public void onClick(View view) {
            EditText editText = C7755h.this.f33993a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C7755h.this.m43143f()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    C7755h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m43143f() {
        EditText editText = this.f33993a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25906a() {
        this.f33993a.setEndIconDrawable(C4411a.m29346b(this.f33994b, C10129e.design_password_eye));
        TextInputLayout textInputLayout = this.f33993a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C10133i.password_toggle_content_description));
        this.f33993a.setEndIconOnClickListener(new C7759d());
        this.f33993a.mo25784c(this.f34023e);
        this.f33993a.mo25786d(this.f34024f);
    }
}
