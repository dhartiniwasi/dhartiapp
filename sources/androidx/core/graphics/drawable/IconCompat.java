package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.res.C0707h;
import androidx.core.util.C0825c;
import androidx.core.util.C0831h;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f2271k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2272a = -1;

    /* renamed from: b */
    Object f2273b;

    /* renamed from: c */
    public byte[] f2274c = null;

    /* renamed from: d */
    public Parcelable f2275d = null;

    /* renamed from: e */
    public int f2276e = 0;

    /* renamed from: f */
    public int f2277f = 0;

    /* renamed from: g */
    public ColorStateList f2278g = null;

    /* renamed from: h */
    PorterDuff.Mode f2279h = f2271k;

    /* renamed from: i */
    public String f2280i = null;

    /* renamed from: j */
    public String f2281j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    static class C0728a {
        /* renamed from: a */
        static IconCompat m3349a(Object obj) {
            C0831h.m3662f(obj);
            int d = m3352d(obj);
            if (d == 2) {
                return IconCompat.m3333n((Resources) null, m3351c(obj), m3350b(obj));
            }
            if (d == 4) {
                return IconCompat.m3330k(m3353e(obj));
            }
            if (d == 6) {
                return IconCompat.m3327h(m3353e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f2273b = obj;
            return iconCompat;
        }

        /* renamed from: b */
        static int m3350b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0730c.m3358a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        /* renamed from: c */
        static String m3351c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0730c.m3359b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: d */
        static int m3352d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0730c.m3360c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        /* renamed from: e */
        static Uri m3353e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0730c.m3361d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        /* renamed from: f */
        static Drawable m3354f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        static Icon m3355g(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f2272a) {
                case -1:
                    return (Icon) iconCompat.f2273b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f2273b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.mo3062q(), iconCompat.f2276e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f2273b, iconCompat.f2276e, iconCompat.f2277f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f2273b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.m3326g((Bitmap) iconCompat.f2273b, false));
                        break;
                    } else {
                        icon = C0729b.m3357b((Bitmap) iconCompat.f2273b);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        icon = C0731d.m3362a(iconCompat.mo3064t());
                        break;
                    } else if (context != null) {
                        InputStream u = iconCompat.mo3066u(context);
                        if (u != null) {
                            if (i < 26) {
                                icon = Icon.createWithBitmap(IconCompat.m3326g(BitmapFactory.decodeStream(u), false));
                                break;
                            } else {
                                icon = C0729b.m3357b(BitmapFactory.decodeStream(u));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.mo3064t());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.mo3064t());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f2278g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2279h;
            if (mode != IconCompat.f2271k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    static class C0729b {
        /* renamed from: a */
        static Drawable m3356a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m3357b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    static class C0730c {
        /* renamed from: a */
        static int m3358a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        static String m3359b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        static int m3360c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        static Uri m3361d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    static class C0731d {
        /* renamed from: a */
        static Icon m3362a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
    }

    /* renamed from: f */
    public static IconCompat m3325f(Icon icon) {
        return C0728a.m3349a(icon);
    }

    /* renamed from: g */
    static Bitmap m3326g(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: h */
    public static IconCompat m3327h(Uri uri) {
        C0825c.m3645d(uri);
        return m3328i(uri.toString());
    }

    /* renamed from: i */
    public static IconCompat m3328i(String str) {
        C0825c.m3645d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f2273b = str;
        return iconCompat;
    }

    /* renamed from: j */
    public static IconCompat m3329j(Bitmap bitmap) {
        C0825c.m3645d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2273b = bitmap;
        return iconCompat;
    }

    /* renamed from: k */
    public static IconCompat m3330k(Uri uri) {
        C0825c.m3645d(uri);
        return m3331l(uri.toString());
    }

    /* renamed from: l */
    public static IconCompat m3331l(String str) {
        C0825c.m3645d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f2273b = str;
        return iconCompat;
    }

    /* renamed from: m */
    public static IconCompat m3332m(Context context, int i) {
        C0825c.m3645d(context);
        return m3333n(context.getResources(), context.getPackageName(), i);
    }

    /* renamed from: n */
    public static IconCompat m3333n(Resources resources, String str, int i) {
        C0825c.m3645d(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2276e = i;
            if (resources != null) {
                try {
                    iconCompat.f2273b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2273b = str;
            }
            iconCompat.f2281j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: r */
    static Resources m3334r(Context context, String str) {
        if (MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    /* renamed from: w */
    private Drawable m3335w(Context context) {
        switch (this.f2272a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f2273b);
            case 2:
                String q = mo3062q();
                if (TextUtils.isEmpty(q)) {
                    q = context.getPackageName();
                }
                try {
                    return C0707h.m3258d(m3334r(context, q), this.f2276e, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f2276e), this.f2273b}), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f2273b, this.f2276e, this.f2277f));
            case 4:
                InputStream u = mo3066u(context);
                if (u != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(u));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), m3326g((Bitmap) this.f2273b, false));
            case 6:
                InputStream u2 = mo3066u(context);
                if (u2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return C0729b.m3356a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(u2)));
                    }
                    return new BitmapDrawable(context.getResources(), m3326g(BitmapFactory.decodeStream(u2), false));
                }
                break;
        }
        return null;
    }

    /* renamed from: z */
    private static String m3336z(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public void mo3057c() {
        this.f2279h = PorterDuff.Mode.valueOf(this.f2280i);
        switch (this.f2272a) {
            case -1:
                Parcelable parcelable = this.f2275d;
                if (parcelable != null) {
                    this.f2273b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2275d;
                if (parcelable2 != null) {
                    this.f2273b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2274c;
                this.f2273b = bArr;
                this.f2272a = 3;
                this.f2276e = 0;
                this.f2277f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2274c, Charset.forName("UTF-16"));
                this.f2273b = str;
                if (this.f2272a == 2 && this.f2281j == null) {
                    this.f2281j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2273b = this.f2274c;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        this.f2280i = this.f2279h.name();
        switch (this.f2272a) {
            case -1:
                if (!z) {
                    this.f2275d = (Parcelable) this.f2273b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2273b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2274c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f2275d = (Parcelable) this.f2273b;
                return;
            case 2:
                this.f2274c = ((String) this.f2273b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2274c = (byte[]) this.f2273b;
                return;
            case 4:
            case 6:
                this.f2274c = this.f2273b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public void mo3059e(Context context) {
        Object obj;
        if (this.f2272a == 2 && (obj = this.f2273b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String q = mo3062q();
                int identifier = m3334r(context, q).getIdentifier(str4, str3, str5);
                if (this.f2276e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + q + " " + str);
                    this.f2276e = identifier;
                }
            }
        }
    }

    /* renamed from: o */
    public Bitmap mo3060o() {
        int i = this.f2272a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2273b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f2273b;
        } else {
            if (i == 5) {
                return m3326g((Bitmap) this.f2273b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: p */
    public int mo3061p() {
        int i = this.f2272a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0728a.m3350b(this.f2273b);
        }
        if (i == 2) {
            return this.f2276e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: q */
    public String mo3062q() {
        int i = this.f2272a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0728a.m3351c(this.f2273b);
        }
        if (i == 2) {
            String str = this.f2281j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f2273b).split(":", -1)[0];
            }
            return this.f2281j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: s */
    public int mo3063s() {
        int i = this.f2272a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C0728a.m3352d(this.f2273b);
    }

    /* renamed from: t */
    public Uri mo3064t() {
        int i = this.f2272a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0728a.m3353e(this.f2273b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2273b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public String toString() {
        if (this.f2272a == -1) {
            return String.valueOf(this.f2273b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m3336z(this.f2272a));
        switch (this.f2272a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2273b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2273b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2281j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo3061p())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2276e);
                if (this.f2277f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2277f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2273b);
                break;
        }
        if (this.f2278g != null) {
            sb.append(" tint=");
            sb.append(this.f2278g);
        }
        if (this.f2279h != f2271k) {
            sb.append(" mode=");
            sb.append(this.f2279h);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public InputStream mo3066u(Context context) {
        Uri t = mo3064t();
        String scheme = t.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(t);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + t, e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2273b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + t, e2);
                return null;
            }
        }
    }

    /* renamed from: v */
    public Drawable mo3067v(Context context) {
        mo3059e(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return C0728a.m3354f(mo3069y(context), context);
        }
        Drawable w = m3335w(context);
        if (!(w == null || (this.f2278g == null && this.f2279h == f2271k))) {
            w.mutate();
            C0732a.m3377o(w, this.f2278g);
            C0732a.m3378p(w, this.f2279h);
        }
        return w;
    }

    @Deprecated
    /* renamed from: x */
    public Icon mo3068x() {
        return mo3069y((Context) null);
    }

    /* renamed from: y */
    public Icon mo3069y(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0728a.m3355g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    IconCompat(int i) {
        this.f2272a = i;
    }
}
