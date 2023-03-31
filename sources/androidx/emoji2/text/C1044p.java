package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.C0810c;
import java.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.p */
/* compiled from: UnprecomputeTextOnModificationSpannable */
class C1044p implements Spannable {

    /* renamed from: a */
    private boolean f2800a = false;

    /* renamed from: b */
    private Spannable f2801b;

    /* renamed from: androidx.emoji2.text.p$a */
    /* compiled from: UnprecomputeTextOnModificationSpannable */
    private static class C1045a {
        /* renamed from: a */
        static IntStream m4663a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        static IntStream m4664b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: androidx.emoji2.text.p$b */
    /* compiled from: UnprecomputeTextOnModificationSpannable */
    static class C1046b {
        C1046b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3735a(CharSequence charSequence) {
            return charSequence instanceof C0810c;
        }
    }

    /* renamed from: androidx.emoji2.text.p$c */
    /* compiled from: UnprecomputeTextOnModificationSpannable */
    static class C1047c extends C1046b {
        C1047c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3735a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof C0810c);
        }
    }

    C1044p(Spannable spannable) {
        this.f2801b = spannable;
    }

    /* renamed from: a */
    private void m4660a() {
        Spannable spannable = this.f2801b;
        if (!this.f2800a && m4661c().mo3735a(spannable)) {
            this.f2801b = new SpannableString(spannable);
        }
        this.f2800a = true;
    }

    /* renamed from: c */
    static C1046b m4661c() {
        return Build.VERSION.SDK_INT < 28 ? new C1046b() : new C1047c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Spannable mo3721b() {
        return this.f2801b;
    }

    public char charAt(int i) {
        return this.f2801b.charAt(i);
    }

    public IntStream chars() {
        return C1045a.m4663a(this.f2801b);
    }

    public IntStream codePoints() {
        return C1045a.m4664b(this.f2801b);
    }

    public int getSpanEnd(Object obj) {
        return this.f2801b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2801b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2801b.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f2801b.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2801b.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2801b.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        m4660a();
        this.f2801b.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        m4660a();
        this.f2801b.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2801b.subSequence(i, i2);
    }

    public String toString() {
        return this.f2801b.toString();
    }

    C1044p(CharSequence charSequence) {
        this.f2801b = new SpannableString(charSequence);
    }
}
