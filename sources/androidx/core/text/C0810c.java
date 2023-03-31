package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C0825c;

/* renamed from: androidx.core.text.c */
/* compiled from: PrecomputedTextCompat */
public class C0810c implements Spannable {

    /* renamed from: d */
    private static final Object f2412d = new Object();

    /* renamed from: a */
    private final Spannable f2413a;

    /* renamed from: b */
    private final C0811a f2414b;

    /* renamed from: c */
    private final PrecomputedText f2415c;

    /* renamed from: a */
    public C0811a mo3194a() {
        return this.f2414b;
    }

    /* renamed from: b */
    public PrecomputedText mo3195b() {
        Spannable spannable = this.f2413a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f2413a.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f2413a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2413a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2413a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f2415c.getSpans(i, i2, cls);
        }
        return this.f2413a.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2413a.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2413a.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2415c.removeSpan(obj);
        } else {
            this.f2413a.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2415c.setSpan(obj, i, i2, i3);
        } else {
            this.f2413a.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2413a.subSequence(i, i2);
    }

    public String toString() {
        return this.f2413a.toString();
    }

    /* renamed from: androidx.core.text.c$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C0811a {

        /* renamed from: a */
        private final TextPaint f2416a;

        /* renamed from: b */
        private final TextDirectionHeuristic f2417b;

        /* renamed from: c */
        private final int f2418c;

        /* renamed from: d */
        private final int f2419d;

        /* renamed from: e */
        final PrecomputedText.Params f2420e;

        /* renamed from: androidx.core.text.c$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C0812a {

            /* renamed from: a */
            private final TextPaint f2421a;

            /* renamed from: b */
            private TextDirectionHeuristic f2422b;

            /* renamed from: c */
            private int f2423c;

            /* renamed from: d */
            private int f2424d;

            public C0812a(TextPaint textPaint) {
                this.f2421a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f2423c = 1;
                    this.f2424d = 1;
                } else {
                    this.f2424d = 0;
                    this.f2423c = 0;
                }
                if (i >= 18) {
                    this.f2422b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f2422b = null;
                }
            }

            /* renamed from: a */
            public C0811a mo3215a() {
                return new C0811a(this.f2421a, this.f2422b, this.f2423c, this.f2424d);
            }

            /* renamed from: b */
            public C0812a mo3216b(int i) {
                this.f2423c = i;
                return this;
            }

            /* renamed from: c */
            public C0812a mo3217c(int i) {
                this.f2424d = i;
                return this;
            }

            /* renamed from: d */
            public C0812a mo3218d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2422b = textDirectionHeuristic;
                return this;
            }
        }

        C0811a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2420e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2420e = null;
            }
            this.f2416a = textPaint;
            this.f2417b = textDirectionHeuristic;
            this.f2418c = i;
            this.f2419d = i2;
        }

        /* renamed from: a */
        public boolean mo3207a(C0811a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f2418c != aVar.mo3208b() || this.f2419d != aVar.mo3209c())) || this.f2416a.getTextSize() != aVar.mo3211e().getTextSize() || this.f2416a.getTextScaleX() != aVar.mo3211e().getTextScaleX() || this.f2416a.getTextSkewX() != aVar.mo3211e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f2416a.getLetterSpacing() != aVar.mo3211e().getLetterSpacing() || !TextUtils.equals(this.f2416a.getFontFeatureSettings(), aVar.mo3211e().getFontFeatureSettings()))) || this.f2416a.getFlags() != aVar.mo3211e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f2416a.getTextLocales().equals(aVar.mo3211e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f2416a.getTextLocale().equals(aVar.mo3211e().getTextLocale())) {
                return false;
            }
            if (this.f2416a.getTypeface() == null) {
                if (aVar.mo3211e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f2416a.getTypeface().equals(aVar.mo3211e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int mo3208b() {
            return this.f2418c;
        }

        /* renamed from: c */
        public int mo3209c() {
            return this.f2419d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo3210d() {
            return this.f2417b;
        }

        /* renamed from: e */
        public TextPaint mo3211e() {
            return this.f2416a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0811a)) {
                return false;
            }
            C0811a aVar = (C0811a) obj;
            if (!mo3207a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f2417b == aVar.mo3210d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0825c.m3643b(Float.valueOf(this.f2416a.getTextSize()), Float.valueOf(this.f2416a.getTextScaleX()), Float.valueOf(this.f2416a.getTextSkewX()), Float.valueOf(this.f2416a.getLetterSpacing()), Integer.valueOf(this.f2416a.getFlags()), this.f2416a.getTextLocales(), this.f2416a.getTypeface(), Boolean.valueOf(this.f2416a.isElegantTextHeight()), this.f2417b, Integer.valueOf(this.f2418c), Integer.valueOf(this.f2419d));
            } else if (i >= 21) {
                return C0825c.m3643b(Float.valueOf(this.f2416a.getTextSize()), Float.valueOf(this.f2416a.getTextScaleX()), Float.valueOf(this.f2416a.getTextSkewX()), Float.valueOf(this.f2416a.getLetterSpacing()), Integer.valueOf(this.f2416a.getFlags()), this.f2416a.getTextLocale(), this.f2416a.getTypeface(), Boolean.valueOf(this.f2416a.isElegantTextHeight()), this.f2417b, Integer.valueOf(this.f2418c), Integer.valueOf(this.f2419d));
            } else if (i >= 18) {
                return C0825c.m3643b(Float.valueOf(this.f2416a.getTextSize()), Float.valueOf(this.f2416a.getTextScaleX()), Float.valueOf(this.f2416a.getTextSkewX()), Integer.valueOf(this.f2416a.getFlags()), this.f2416a.getTextLocale(), this.f2416a.getTypeface(), this.f2417b, Integer.valueOf(this.f2418c), Integer.valueOf(this.f2419d));
            } else if (i >= 17) {
                return C0825c.m3643b(Float.valueOf(this.f2416a.getTextSize()), Float.valueOf(this.f2416a.getTextScaleX()), Float.valueOf(this.f2416a.getTextSkewX()), Integer.valueOf(this.f2416a.getFlags()), this.f2416a.getTextLocale(), this.f2416a.getTypeface(), this.f2417b, Integer.valueOf(this.f2418c), Integer.valueOf(this.f2419d));
            } else {
                return C0825c.m3643b(Float.valueOf(this.f2416a.getTextSize()), Float.valueOf(this.f2416a.getTextScaleX()), Float.valueOf(this.f2416a.getTextSkewX()), Integer.valueOf(this.f2416a.getFlags()), this.f2416a.getTypeface(), this.f2417b, Integer.valueOf(this.f2418c), Integer.valueOf(this.f2419d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2416a.getTextSize());
            sb.append(", textScaleX=" + this.f2416a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2416a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb.append(", letterSpacing=" + this.f2416a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f2416a.isElegantTextHeight());
            }
            if (i >= 24) {
                sb.append(", textLocale=" + this.f2416a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f2416a.getTextLocale());
            }
            sb.append(", typeface=" + this.f2416a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f2416a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2417b);
            sb.append(", breakStrategy=" + this.f2418c);
            sb.append(", hyphenationFrequency=" + this.f2419d);
            sb.append("}");
            return sb.toString();
        }

        public C0811a(PrecomputedText.Params params) {
            this.f2416a = params.getTextPaint();
            this.f2417b = params.getTextDirection();
            this.f2418c = params.getBreakStrategy();
            this.f2419d = params.getHyphenationFrequency();
            this.f2420e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
