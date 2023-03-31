package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C0831h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.n */
/* compiled from: SpannableBuilder */
public final class C1041n extends SpannableStringBuilder {

    /* renamed from: a */
    private final Class<?> f2795a;

    /* renamed from: b */
    private final List<C1042a> f2796b = new ArrayList();

    /* renamed from: androidx.emoji2.text.n$a */
    /* compiled from: SpannableBuilder */
    private static class C1042a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        final Object f2797a;

        /* renamed from: b */
        private final AtomicInteger f2798b = new AtomicInteger(0);

        C1042a(Object obj) {
            this.f2797a = obj;
        }

        /* renamed from: b */
        private boolean m4656b(Object obj) {
            return obj instanceof C1030i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3712a() {
            this.f2798b.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2797a).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2797a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo3715c() {
            this.f2798b.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2798b.get() <= 0 || !m4656b(obj)) {
                ((SpanWatcher) this.f2797a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f2798b.get() <= 0 || !m4656b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i6 = i7;
                        i5 = 0;
                    } else {
                        i5 = i3;
                        i6 = i7;
                    }
                } else {
                    i6 = i;
                    i5 = i3;
                }
                ((SpanWatcher) this.f2797a).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2798b.get() <= 0 || !m4656b(obj)) {
                ((SpanWatcher) this.f2797a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2797a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C1041n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C0831h.m3663g(cls, "watcherClass cannot be null");
        this.f2795a = cls;
    }

    /* renamed from: b */
    private void m4647b() {
        for (int i = 0; i < this.f2796b.size(); i++) {
            this.f2796b.get(i).mo3712a();
        }
    }

    /* renamed from: c */
    public static C1041n m4648c(Class<?> cls, CharSequence charSequence) {
        return new C1041n(cls, charSequence);
    }

    /* renamed from: e */
    private void m4649e() {
        for (int i = 0; i < this.f2796b.size(); i++) {
            this.f2796b.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private C1042a m4650f(Object obj) {
        for (int i = 0; i < this.f2796b.size(); i++) {
            C1042a aVar = this.f2796b.get(i);
            if (aVar.f2797a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m4651g(Class<?> cls) {
        return this.f2795a == cls;
    }

    /* renamed from: h */
    private boolean m4652h(Object obj) {
        return obj != null && m4651g(obj.getClass());
    }

    /* renamed from: i */
    private void m4653i() {
        for (int i = 0; i < this.f2796b.size(); i++) {
            this.f2796b.get(i).mo3715c();
        }
    }

    /* renamed from: a */
    public void mo3693a() {
        m4647b();
    }

    /* renamed from: d */
    public void mo3698d() {
        m4653i();
        m4649e();
    }

    public int getSpanEnd(Object obj) {
        C1042a f;
        if (m4652h(obj) && (f = m4650f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C1042a f;
        if (m4652h(obj) && (f = m4650f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C1042a f;
        if (m4652h(obj) && (f = m4650f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m4651g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C1042a[] aVarArr = (C1042a[]) super.getSpans(i, i2, C1042a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f2797a;
        }
        return tArr;
    }

    public int nextSpanTransition(int i, int i2, Class<C1042a> cls) {
        if (cls == null || m4651g(cls)) {
            cls = C1042a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C1042a aVar;
        if (m4652h(obj)) {
            aVar = m4650f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2796b.remove(aVar);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m4652h(obj)) {
            C1042a aVar = new C1042a(obj);
            this.f2796b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return new C1041n(this.f2795a, this, i, i2);
    }

    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m4647b();
        super.replace(i, i2, charSequence);
        m4653i();
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    C1041n(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C0831h.m3663g(cls, "watcherClass cannot be null");
        this.f2795a = cls;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m4647b();
        super.replace(i, i2, charSequence, i3, i4);
        m4653i();
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
