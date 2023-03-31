package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C0698e;
import androidx.core.provider.C0795g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.k */
/* compiled from: TypefaceCompatApi29Impl */
public class C0750k extends C0751l {
    /* renamed from: l */
    private Font m3465l(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m = m3466m(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int m2 = m3466m(fontStyle, font2.getStyle());
            if (m2 < m) {
                font = font2;
                m = m2;
            }
        }
        return font;
    }

    /* renamed from: m */
    private static int m3466m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* renamed from: b */
    public Typeface mo3119b(Context context, C0698e.C0701c cVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0698e.C0702d dVar : cVar.mo3026a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.mo3028b()).setWeight(dVar.mo3031e()).setSlant(dVar.mo3032f() ? 1 : 0).setTtcIndex(dVar.mo3029c()).setFontVariationSettings(dVar.mo3030d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m3465l(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Typeface mo3120c(Context context, CancellationSignal cancellationSignal, C0795g.C0797b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0795g.C0797b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.mo3179d(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.mo3180e()).setSlant(bVar.mo3181f() ? 1 : 0).setTtcIndex(bVar.mo3178c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m3465l(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo3130d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: e */
    public Typeface mo3123e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0795g.C0797b mo3131i(C0795g.C0797b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
