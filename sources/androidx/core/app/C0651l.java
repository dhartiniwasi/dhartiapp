package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import p138t.C5491b;
import p138t.C5492c;

/* renamed from: androidx.core.app.l */
/* compiled from: NotificationCompat */
public class C0651l {

    /* renamed from: androidx.core.app.l$a */
    /* compiled from: NotificationCompat */
    public static class C0652a {

        /* renamed from: a */
        final Bundle f2075a;

        /* renamed from: b */
        private IconCompat f2076b;

        /* renamed from: c */
        private final C0676r[] f2077c;

        /* renamed from: d */
        private final C0676r[] f2078d;

        /* renamed from: e */
        private boolean f2079e;

        /* renamed from: f */
        boolean f2080f;

        /* renamed from: g */
        private final int f2081g;

        /* renamed from: h */
        private final boolean f2082h;
        @Deprecated

        /* renamed from: i */
        public int f2083i;

        /* renamed from: j */
        public CharSequence f2084j;

        /* renamed from: k */
        public PendingIntent f2085k;

        /* renamed from: l */
        private boolean f2086l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0652a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m3333n((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent mo2897a() {
            return this.f2085k;
        }

        /* renamed from: b */
        public boolean mo2898b() {
            return this.f2079e;
        }

        /* renamed from: c */
        public C0676r[] mo2899c() {
            return this.f2078d;
        }

        /* renamed from: d */
        public Bundle mo2900d() {
            return this.f2075a;
        }

        @Deprecated
        /* renamed from: e */
        public int mo2901e() {
            return this.f2083i;
        }

        /* renamed from: f */
        public IconCompat mo2902f() {
            int i;
            if (this.f2076b == null && (i = this.f2083i) != 0) {
                this.f2076b = IconCompat.m3333n((Resources) null, "", i);
            }
            return this.f2076b;
        }

        /* renamed from: g */
        public C0676r[] mo2903g() {
            return this.f2077c;
        }

        /* renamed from: h */
        public int mo2904h() {
            return this.f2081g;
        }

        /* renamed from: i */
        public boolean mo2905i() {
            return this.f2080f;
        }

        /* renamed from: j */
        public CharSequence mo2906j() {
            return this.f2084j;
        }

        /* renamed from: k */
        public boolean mo2907k() {
            return this.f2086l;
        }

        /* renamed from: l */
        public boolean mo2908l() {
            return this.f2082h;
        }

        public C0652a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C0676r[]) null, (C0676r[]) null, true, 0, true, false, false);
        }

        C0652a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0676r[] rVarArr, C0676r[] rVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f2080f = true;
            this.f2076b = iconCompat;
            if (iconCompat != null && iconCompat.mo3063s() == 2) {
                this.f2083i = iconCompat.mo3061p();
            }
            this.f2084j = C0659e.m3023i(charSequence);
            this.f2085k = pendingIntent;
            this.f2075a = bundle == null ? new Bundle() : bundle;
            this.f2077c = rVarArr;
            this.f2078d = rVarArr2;
            this.f2079e = z;
            this.f2081g = i;
            this.f2080f = z2;
            this.f2082h = z3;
            this.f2086l = z4;
        }
    }

    /* renamed from: androidx.core.app.l$b */
    /* compiled from: NotificationCompat */
    public static class C0653b extends C0662h {

        /* renamed from: e */
        private IconCompat f2087e;

        /* renamed from: f */
        private IconCompat f2088f;

        /* renamed from: g */
        private boolean f2089g;

        /* renamed from: h */
        private CharSequence f2090h;

        /* renamed from: i */
        private boolean f2091i;

        /* renamed from: androidx.core.app.l$b$a */
        /* compiled from: NotificationCompat */
        private static class C0654a {
            /* renamed from: a */
            static void m3012a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m3013b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.l$b$b */
        /* compiled from: NotificationCompat */
        private static class C0655b {
            /* renamed from: a */
            static void m3014a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.l$b$c */
        /* compiled from: NotificationCompat */
        private static class C0656c {
            /* renamed from: a */
            static void m3015a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            static void m3016b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            static void m3017c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        /* renamed from: b */
        public void mo2909b(C0650k kVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kVar.mo2896a()).setBigContentTitle(this.f2144b);
                IconCompat iconCompat = this.f2087e;
                Context context = null;
                if (iconCompat != null) {
                    if (i >= 31) {
                        C0656c.m3015a(bigContentTitle, this.f2087e.mo3069y(kVar instanceof C0663m ? ((C0663m) kVar).mo2964f() : null));
                    } else if (iconCompat.mo3063s() == 1) {
                        bigContentTitle = bigContentTitle.bigPicture(this.f2087e.mo3060o());
                    }
                }
                if (this.f2089g) {
                    IconCompat iconCompat2 = this.f2088f;
                    if (iconCompat2 == null) {
                        C0654a.m3012a(bigContentTitle, (Bitmap) null);
                    } else if (i >= 23) {
                        if (kVar instanceof C0663m) {
                            context = ((C0663m) kVar).mo2964f();
                        }
                        C0655b.m3014a(bigContentTitle, this.f2088f.mo3069y(context));
                    } else if (iconCompat2.mo3063s() == 1) {
                        C0654a.m3012a(bigContentTitle, this.f2088f.mo3060o());
                    } else {
                        C0654a.m3012a(bigContentTitle, (Bitmap) null);
                    }
                }
                if (this.f2146d) {
                    C0654a.m3013b(bigContentTitle, this.f2145c);
                }
                if (i >= 31) {
                    C0656c.m3017c(bigContentTitle, this.f2091i);
                    C0656c.m3016b(bigContentTitle, this.f2090h);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo2910h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: m */
        public C0653b mo2911m(Bitmap bitmap) {
            this.f2088f = bitmap == null ? null : IconCompat.m3329j(bitmap);
            this.f2089g = true;
            return this;
        }

        /* renamed from: n */
        public C0653b mo2912n(Bitmap bitmap) {
            this.f2087e = bitmap == null ? null : IconCompat.m3329j(bitmap);
            return this;
        }

        /* renamed from: o */
        public C0653b mo2913o(CharSequence charSequence) {
            this.f2145c = C0659e.m3023i(charSequence);
            this.f2146d = true;
            return this;
        }
    }

    /* renamed from: androidx.core.app.l$c */
    /* compiled from: NotificationCompat */
    public static class C0657c extends C0662h {

        /* renamed from: e */
        private CharSequence f2092e;

        /* renamed from: a */
        public void mo2914a(Bundle bundle) {
            super.mo2914a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2092e);
            }
        }

        /* renamed from: b */
        public void mo2909b(C0650k kVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(kVar.mo2896a()).setBigContentTitle(this.f2144b).bigText(this.f2092e);
                if (this.f2146d) {
                    bigText.setSummaryText(this.f2145c);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo2910h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: m */
        public C0657c mo2915m(CharSequence charSequence) {
            this.f2092e = C0659e.m3023i(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.l$d */
    /* compiled from: NotificationCompat */
    public static final class C0658d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m3022a(C0658d dVar) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.l$f */
    /* compiled from: NotificationCompat */
    public interface C0660f {
        /* renamed from: a */
        C0659e mo2953a(C0659e eVar);
    }

    /* renamed from: androidx.core.app.l$g */
    /* compiled from: NotificationCompat */
    public static class C0661g extends C0662h {

        /* renamed from: e */
        private ArrayList<CharSequence> f2142e = new ArrayList<>();

        /* renamed from: b */
        public void mo2909b(C0650k kVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(kVar.mo2896a()).setBigContentTitle(this.f2144b);
                if (this.f2146d) {
                    bigContentTitle.setSummaryText(this.f2145c);
                }
                Iterator<CharSequence> it = this.f2142e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo2910h() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* renamed from: m */
        public C0661g mo2954m(CharSequence charSequence) {
            if (charSequence != null) {
                this.f2142e.add(C0659e.m3023i(charSequence));
            }
            return this;
        }

        /* renamed from: n */
        public C0661g mo2955n(CharSequence charSequence) {
            this.f2144b = C0659e.m3023i(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.l$h */
    /* compiled from: NotificationCompat */
    public static abstract class C0662h {

        /* renamed from: a */
        protected C0659e f2143a;

        /* renamed from: b */
        CharSequence f2144b;

        /* renamed from: c */
        CharSequence f2145c;

        /* renamed from: d */
        boolean f2146d = false;

        /* renamed from: e */
        private Bitmap m3068e(int i, int i2, int i3) {
            return m3069f(IconCompat.m3332m(this.f2143a.f2116a, i), i2, i3);
        }

        /* renamed from: f */
        private Bitmap m3069f(IconCompat iconCompat, int i, int i2) {
            Drawable v = iconCompat.mo3067v(this.f2143a.f2116a);
            int intrinsicWidth = i2 == 0 ? v.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = v.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            v.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                v.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            v.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: g */
        private Bitmap m3070g(int i, int i2, int i3, int i4) {
            int i5 = C5492c.f27852c;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap e = m3068e(i5, i4, i2);
            Canvas canvas = new Canvas(e);
            Drawable mutate = this.f2143a.f2116a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e;
        }

        /* renamed from: a */
        public void mo2914a(Bundle bundle) {
            if (this.f2146d) {
                bundle.putCharSequence("android.summaryText", this.f2145c);
            }
            CharSequence charSequence = this.f2144b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h = mo2910h();
            if (h != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h);
            }
        }

        /* renamed from: b */
        public abstract void mo2909b(C0650k kVar);

        /* JADX WARNING: Removed duplicated region for block: B:60:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01f5  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0206  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo2956c(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                androidx.core.app.l$e r1 = r0.f2143a
                android.content.Context r1 = r1.f2116a
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                androidx.core.app.l$e r2 = r0.f2143a
                android.content.Context r2 = r2.f2116a
                java.lang.String r2 = r2.getPackageName()
                r3 = r18
                r8.<init>(r2, r3)
                androidx.core.app.l$e r2 = r0.f2143a
                int r2 = r2.mo2936g()
                r3 = -1
                r9 = 1
                r10 = 0
                if (r2 >= r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                int r11 = android.os.Build.VERSION.SDK_INT
                r4 = 21
                r12 = 16
                if (r11 < r12) goto L_0x0052
                if (r11 >= r4) goto L_0x0052
                java.lang.String r5 = "setBackgroundResource"
                if (r2 == 0) goto L_0x0044
                int r2 = p138t.C5493d.f27867M
                int r6 = p138t.C5492c.f27851b
                r8.setInt(r2, r5, r6)
                int r2 = p138t.C5493d.f27863I
                int r6 = p138t.C5492c.f27854e
                r8.setInt(r2, r5, r6)
                goto L_0x0052
            L_0x0044:
                int r2 = p138t.C5493d.f27867M
                int r6 = p138t.C5492c.f27850a
                r8.setInt(r2, r5, r6)
                int r2 = p138t.C5493d.f27863I
                int r6 = p138t.C5492c.f27853d
                r8.setInt(r2, r5, r6)
            L_0x0052:
                androidx.core.app.l$e r2 = r0.f2143a
                android.graphics.Bitmap r5 = r2.f2125j
                r13 = 8
                if (r5 == 0) goto L_0x00b3
                if (r11 < r12) goto L_0x0069
                int r2 = p138t.C5493d.f27863I
                r8.setViewVisibility(r2, r10)
                androidx.core.app.l$e r5 = r0.f2143a
                android.graphics.Bitmap r5 = r5.f2125j
                r8.setImageViewBitmap(r2, r5)
                goto L_0x006e
            L_0x0069:
                int r2 = p138t.C5493d.f27863I
                r8.setViewVisibility(r2, r13)
            L_0x006e:
                if (r17 == 0) goto L_0x00f4
                androidx.core.app.l$e r2 = r0.f2143a
                android.app.Notification r2 = r2.f2112T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = p138t.C5491b.f27846e
                int r2 = r1.getDimensionPixelSize(r2)
                int r5 = p138t.C5491b.f27847f
                int r5 = r1.getDimensionPixelSize(r5)
                int r5 = r5 * 2
                int r5 = r2 - r5
                if (r11 < r4) goto L_0x009e
                androidx.core.app.l$e r3 = r0.f2143a
                android.app.Notification r6 = r3.f2112T
                int r6 = r6.icon
                int r3 = r3.mo2934e()
                android.graphics.Bitmap r2 = r0.m3070g(r6, r2, r5, r3)
                int r3 = p138t.C5493d.f27868N
                r8.setImageViewBitmap(r3, r2)
                goto L_0x00ad
            L_0x009e:
                int r2 = p138t.C5493d.f27868N
                androidx.core.app.l$e r5 = r0.f2143a
                android.app.Notification r5 = r5.f2112T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo2957d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00ad:
                int r2 = p138t.C5493d.f27868N
                r8.setViewVisibility(r2, r10)
                goto L_0x00f4
            L_0x00b3:
                if (r17 == 0) goto L_0x00f4
                android.app.Notification r2 = r2.f2112T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = p138t.C5493d.f27863I
                r8.setViewVisibility(r2, r10)
                if (r11 < r4) goto L_0x00e7
                int r3 = p138t.C5491b.f27845d
                int r3 = r1.getDimensionPixelSize(r3)
                int r5 = p138t.C5491b.f27844c
                int r5 = r1.getDimensionPixelSize(r5)
                int r3 = r3 - r5
                int r5 = p138t.C5491b.f27848g
                int r5 = r1.getDimensionPixelSize(r5)
                androidx.core.app.l$e r6 = r0.f2143a
                android.app.Notification r7 = r6.f2112T
                int r7 = r7.icon
                int r6 = r6.mo2934e()
                android.graphics.Bitmap r3 = r0.m3070g(r7, r3, r5, r6)
                r8.setImageViewBitmap(r2, r3)
                goto L_0x00f4
            L_0x00e7:
                androidx.core.app.l$e r5 = r0.f2143a
                android.app.Notification r5 = r5.f2112T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo2957d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00f4:
                androidx.core.app.l$e r2 = r0.f2143a
                java.lang.CharSequence r2 = r2.f2120e
                if (r2 == 0) goto L_0x00ff
                int r3 = p138t.C5493d.f27892f0
                r8.setTextViewText(r3, r2)
            L_0x00ff:
                androidx.core.app.l$e r2 = r0.f2143a
                java.lang.CharSequence r2 = r2.f2121f
                if (r2 == 0) goto L_0x010c
                int r3 = p138t.C5493d.f27886c0
                r8.setTextViewText(r3, r2)
                r2 = 1
                goto L_0x010d
            L_0x010c:
                r2 = 0
            L_0x010d:
                if (r11 >= r4) goto L_0x0117
                androidx.core.app.l$e r3 = r0.f2143a
                android.graphics.Bitmap r3 = r3.f2125j
                if (r3 == 0) goto L_0x0117
                r3 = 1
                goto L_0x0118
            L_0x0117:
                r3 = 0
            L_0x0118:
                androidx.core.app.l$e r4 = r0.f2143a
                java.lang.CharSequence r5 = r4.f2126k
                if (r5 == 0) goto L_0x0129
                int r2 = p138t.C5493d.f27864J
                r8.setTextViewText(r2, r5)
                r8.setViewVisibility(r2, r10)
            L_0x0126:
                r14 = 1
                r15 = 1
                goto L_0x0164
            L_0x0129:
                int r4 = r4.f2127l
                if (r4 <= 0) goto L_0x015d
                int r2 = p138t.C5494e.f27913a
                int r2 = r1.getInteger(r2)
                androidx.core.app.l$e r3 = r0.f2143a
                int r3 = r3.f2127l
                if (r3 <= r2) goto L_0x0145
                int r2 = p138t.C5493d.f27864J
                int r3 = p138t.C5495f.f27914a
                java.lang.String r3 = r1.getString(r3)
                r8.setTextViewText(r2, r3)
                goto L_0x0157
            L_0x0145:
                java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance()
                int r3 = p138t.C5493d.f27864J
                androidx.core.app.l$e r4 = r0.f2143a
                int r4 = r4.f2127l
                long r4 = (long) r4
                java.lang.String r2 = r2.format(r4)
                r8.setTextViewText(r3, r2)
            L_0x0157:
                int r2 = p138t.C5493d.f27864J
                r8.setViewVisibility(r2, r10)
                goto L_0x0126
            L_0x015d:
                int r4 = p138t.C5493d.f27864J
                r8.setViewVisibility(r4, r13)
                r14 = r2
                r15 = r3
            L_0x0164:
                androidx.core.app.l$e r2 = r0.f2143a
                java.lang.CharSequence r2 = r2.f2133r
                if (r2 == 0) goto L_0x0186
                if (r11 < r12) goto L_0x0186
                int r3 = p138t.C5493d.f27886c0
                r8.setTextViewText(r3, r2)
                androidx.core.app.l$e r2 = r0.f2143a
                java.lang.CharSequence r2 = r2.f2121f
                if (r2 == 0) goto L_0x0181
                int r3 = p138t.C5493d.f27888d0
                r8.setTextViewText(r3, r2)
                r8.setViewVisibility(r3, r10)
                r2 = 1
                goto L_0x0187
            L_0x0181:
                int r2 = p138t.C5493d.f27888d0
                r8.setViewVisibility(r2, r13)
            L_0x0186:
                r2 = 0
            L_0x0187:
                if (r2 == 0) goto L_0x01a3
                if (r11 < r12) goto L_0x01a3
                if (r19 == 0) goto L_0x0199
                int r2 = p138t.C5491b.f27849h
                int r1 = r1.getDimensionPixelSize(r2)
                float r1 = (float) r1
                int r2 = p138t.C5493d.f27886c0
                r8.setTextViewTextSize(r2, r10, r1)
            L_0x0199:
                int r3 = p138t.C5493d.f27865K
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r2 = r8
                r2.setViewPadding(r3, r4, r5, r6, r7)
            L_0x01a3:
                androidx.core.app.l$e r1 = r0.f2143a
                long r1 = r1.mo2937h()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x01f5
                androidx.core.app.l$e r1 = r0.f2143a
                boolean r1 = r1.f2130o
                if (r1 == 0) goto L_0x01e4
                if (r11 < r12) goto L_0x01e4
                int r1 = p138t.C5493d.f27862H
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.f2143a
                long r2 = r2.mo2937h()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r6
                long r2 = r2 + r4
                java.lang.String r4 = "setBase"
                r8.setLong(r1, r4, r2)
                java.lang.String r2 = "setStarted"
                r8.setBoolean(r1, r2, r9)
                androidx.core.app.l$e r2 = r0.f2143a
                boolean r2 = r2.f2131p
                if (r2 == 0) goto L_0x01f6
                r3 = 24
                if (r11 < r3) goto L_0x01f6
                r8.setChronometerCountDown(r1, r2)
                goto L_0x01f6
            L_0x01e4:
                int r1 = p138t.C5493d.f27890e0
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.f2143a
                long r2 = r2.mo2937h()
                java.lang.String r4 = "setTime"
                r8.setLong(r1, r4, r2)
                goto L_0x01f6
            L_0x01f5:
                r9 = r15
            L_0x01f6:
                int r1 = p138t.C5493d.f27869O
                if (r9 == 0) goto L_0x01fc
                r2 = 0
                goto L_0x01fe
            L_0x01fc:
                r2 = 8
            L_0x01fe:
                r8.setViewVisibility(r1, r2)
                int r1 = p138t.C5493d.f27866L
                if (r14 == 0) goto L_0x0206
                goto L_0x0208
            L_0x0206:
                r10 = 8
            L_0x0208:
                r8.setViewVisibility(r1, r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0651l.C0662h.mo2956c(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: d */
        public Bitmap mo2957d(int i, int i2) {
            return m3068e(i, i2, 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo2910h() {
            return null;
        }

        /* renamed from: i */
        public RemoteViews mo2958i(C0650k kVar) {
            return null;
        }

        /* renamed from: j */
        public RemoteViews mo2959j(C0650k kVar) {
            return null;
        }

        /* renamed from: k */
        public RemoteViews mo2960k(C0650k kVar) {
            return null;
        }

        /* renamed from: l */
        public void mo2961l(C0659e eVar) {
            if (this.f2143a != eVar) {
                this.f2143a = eVar;
                if (eVar != null) {
                    eVar.mo2924I(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2993a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0664n.m3090c(notification);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m2994b(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            if ((notification.flags & 512) != 0) {
                return true;
            }
            return false;
        } else if (i >= 19) {
            return notification.extras.getBoolean("android.support.isGroupSummary");
        } else {
            if (i >= 16) {
                return C0664n.m3090c(notification).getBoolean("android.support.isGroupSummary");
            }
            return false;
        }
    }

    /* renamed from: androidx.core.app.l$e */
    /* compiled from: NotificationCompat */
    public static class C0659e {

        /* renamed from: A */
        boolean f2093A;

        /* renamed from: B */
        boolean f2094B;

        /* renamed from: C */
        boolean f2095C;

        /* renamed from: D */
        String f2096D;

        /* renamed from: E */
        Bundle f2097E;

        /* renamed from: F */
        int f2098F;

        /* renamed from: G */
        int f2099G;

        /* renamed from: H */
        Notification f2100H;

        /* renamed from: I */
        RemoteViews f2101I;

        /* renamed from: J */
        RemoteViews f2102J;

        /* renamed from: K */
        RemoteViews f2103K;

        /* renamed from: L */
        String f2104L;

        /* renamed from: M */
        int f2105M;

        /* renamed from: N */
        String f2106N;

        /* renamed from: O */
        long f2107O;

        /* renamed from: P */
        int f2108P;

        /* renamed from: Q */
        int f2109Q;

        /* renamed from: R */
        boolean f2110R;

        /* renamed from: S */
        C0658d f2111S;

        /* renamed from: T */
        Notification f2112T;

        /* renamed from: U */
        boolean f2113U;

        /* renamed from: V */
        Icon f2114V;
        @Deprecated

        /* renamed from: W */
        public ArrayList<String> f2115W;

        /* renamed from: a */
        public Context f2116a;

        /* renamed from: b */
        public ArrayList<C0652a> f2117b;

        /* renamed from: c */
        public ArrayList<C0672p> f2118c;

        /* renamed from: d */
        ArrayList<C0652a> f2119d;

        /* renamed from: e */
        CharSequence f2120e;

        /* renamed from: f */
        CharSequence f2121f;

        /* renamed from: g */
        PendingIntent f2122g;

        /* renamed from: h */
        PendingIntent f2123h;

        /* renamed from: i */
        RemoteViews f2124i;

        /* renamed from: j */
        Bitmap f2125j;

        /* renamed from: k */
        CharSequence f2126k;

        /* renamed from: l */
        int f2127l;

        /* renamed from: m */
        int f2128m;

        /* renamed from: n */
        boolean f2129n;

        /* renamed from: o */
        boolean f2130o;

        /* renamed from: p */
        boolean f2131p;

        /* renamed from: q */
        C0662h f2132q;

        /* renamed from: r */
        CharSequence f2133r;

        /* renamed from: s */
        CharSequence f2134s;

        /* renamed from: t */
        CharSequence[] f2135t;

        /* renamed from: u */
        int f2136u;

        /* renamed from: v */
        int f2137v;

        /* renamed from: w */
        boolean f2138w;

        /* renamed from: x */
        String f2139x;

        /* renamed from: y */
        boolean f2140y;

        /* renamed from: z */
        String f2141z;

        public C0659e(Context context, String str) {
            this.f2117b = new ArrayList<>();
            this.f2118c = new ArrayList<>();
            this.f2119d = new ArrayList<>();
            this.f2129n = true;
            this.f2093A = false;
            this.f2098F = 0;
            this.f2099G = 0;
            this.f2105M = 0;
            this.f2108P = 0;
            this.f2109Q = 0;
            Notification notification = new Notification();
            this.f2112T = notification;
            this.f2116a = context;
            this.f2104L = str;
            notification.when = System.currentTimeMillis();
            this.f2112T.audioStreamType = -1;
            this.f2128m = 0;
            this.f2115W = new ArrayList<>();
            this.f2110R = true;
        }

        /* renamed from: i */
        protected static CharSequence m3023i(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: j */
        private Bitmap m3024j(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2116a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C5491b.f27843b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C5491b.f27842a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        /* renamed from: t */
        private void m3025t(int i, boolean z) {
            if (z) {
                Notification notification = this.f2112T;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f2112T;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: A */
        public C0659e mo2916A(int i) {
            this.f2127l = i;
            return this;
        }

        /* renamed from: B */
        public C0659e mo2917B(boolean z) {
            m3025t(2, z);
            return this;
        }

        /* renamed from: C */
        public C0659e mo2918C(boolean z) {
            m3025t(8, z);
            return this;
        }

        /* renamed from: D */
        public C0659e mo2919D(int i) {
            this.f2128m = i;
            return this;
        }

        /* renamed from: E */
        public C0659e mo2920E(int i, int i2, boolean z) {
            this.f2136u = i;
            this.f2137v = i2;
            this.f2138w = z;
            return this;
        }

        /* renamed from: F */
        public C0659e mo2921F(boolean z) {
            this.f2129n = z;
            return this;
        }

        /* renamed from: G */
        public C0659e mo2922G(int i) {
            this.f2112T.icon = i;
            return this;
        }

        /* renamed from: H */
        public C0659e mo2923H(Uri uri) {
            Notification notification = this.f2112T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: I */
        public C0659e mo2924I(C0662h hVar) {
            if (this.f2132q != hVar) {
                this.f2132q = hVar;
                if (hVar != null) {
                    hVar.mo2961l(this);
                }
            }
            return this;
        }

        /* renamed from: J */
        public C0659e mo2925J(CharSequence charSequence) {
            this.f2133r = m3023i(charSequence);
            return this;
        }

        /* renamed from: K */
        public C0659e mo2926K(CharSequence charSequence) {
            this.f2112T.tickerText = m3023i(charSequence);
            return this;
        }

        /* renamed from: L */
        public C0659e mo2927L(long[] jArr) {
            this.f2112T.vibrate = jArr;
            return this;
        }

        /* renamed from: M */
        public C0659e mo2928M(int i) {
            this.f2099G = i;
            return this;
        }

        /* renamed from: N */
        public C0659e mo2929N(long j) {
            this.f2112T.when = j;
            return this;
        }

        /* renamed from: a */
        public C0659e mo2930a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2117b.add(new C0652a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public C0659e mo2931b(C0652a aVar) {
            if (aVar != null) {
                this.f2117b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification mo2932c() {
            return new C0663m(this).mo2962c();
        }

        /* renamed from: d */
        public C0659e mo2933d(C0660f fVar) {
            fVar.mo2953a(this);
            return this;
        }

        /* renamed from: e */
        public int mo2934e() {
            return this.f2098F;
        }

        /* renamed from: f */
        public Bundle mo2935f() {
            if (this.f2097E == null) {
                this.f2097E = new Bundle();
            }
            return this.f2097E;
        }

        /* renamed from: g */
        public int mo2936g() {
            return this.f2128m;
        }

        /* renamed from: h */
        public long mo2937h() {
            if (this.f2129n) {
                return this.f2112T.when;
            }
            return 0;
        }

        /* renamed from: k */
        public C0659e mo2938k(boolean z) {
            m3025t(16, z);
            return this;
        }

        /* renamed from: l */
        public C0659e mo2939l(String str) {
            this.f2104L = str;
            return this;
        }

        /* renamed from: m */
        public C0659e mo2940m(int i) {
            this.f2098F = i;
            return this;
        }

        /* renamed from: n */
        public C0659e mo2941n(RemoteViews remoteViews) {
            this.f2112T.contentView = remoteViews;
            return this;
        }

        /* renamed from: o */
        public C0659e mo2942o(PendingIntent pendingIntent) {
            this.f2122g = pendingIntent;
            return this;
        }

        /* renamed from: p */
        public C0659e mo2943p(CharSequence charSequence) {
            this.f2121f = m3023i(charSequence);
            return this;
        }

        /* renamed from: q */
        public C0659e mo2944q(CharSequence charSequence) {
            this.f2120e = m3023i(charSequence);
            return this;
        }

        /* renamed from: r */
        public C0659e mo2945r(int i) {
            Notification notification = this.f2112T;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: s */
        public C0659e mo2946s(PendingIntent pendingIntent) {
            this.f2112T.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: u */
        public C0659e mo2947u(String str) {
            this.f2139x = str;
            return this;
        }

        /* renamed from: v */
        public C0659e mo2948v(int i) {
            this.f2108P = i;
            return this;
        }

        /* renamed from: w */
        public C0659e mo2949w(boolean z) {
            this.f2140y = z;
            return this;
        }

        /* renamed from: x */
        public C0659e mo2950x(Bitmap bitmap) {
            this.f2125j = m3024j(bitmap);
            return this;
        }

        /* renamed from: y */
        public C0659e mo2951y(int i, int i2, int i3) {
            Notification notification = this.f2112T;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        /* renamed from: z */
        public C0659e mo2952z(boolean z) {
            this.f2093A = z;
            return this;
        }

        @Deprecated
        public C0659e(Context context) {
            this(context, (String) null);
        }
    }
}
