package p264io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import p297mb.C11881b;
import p408yb.C13247a;
import p408yb.C13258c;

/* renamed from: io.flutter.embedding.android.g */
/* compiled from: FlutterImageView */
public class C10635g extends View implements C13258c {

    /* renamed from: a */
    private ImageReader f41752a;

    /* renamed from: b */
    private Image f41753b;

    /* renamed from: c */
    private Bitmap f41754c;

    /* renamed from: d */
    private C13247a f41755d;

    /* renamed from: e */
    private C10637b f41756e;

    /* renamed from: f */
    private boolean f41757f;

    /* renamed from: io.flutter.embedding.android.g$a */
    /* compiled from: FlutterImageView */
    static /* synthetic */ class C10636a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41758a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.embedding.android.g$b[] r0 = p264io.flutter.embedding.android.C10635g.C10637b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41758a = r0
                io.flutter.embedding.android.g$b r1 = p264io.flutter.embedding.android.C10635g.C10637b.background     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41758a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.g$b r1 = p264io.flutter.embedding.android.C10635g.C10637b.overlay     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.embedding.android.C10635g.C10636a.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.embedding.android.g$b */
    /* compiled from: FlutterImageView */
    public enum C10637b {
        background,
        overlay
    }

    public C10635g(Context context, int i, int i2, C10637b bVar) {
        this(context, m53349f(i, i2), bVar);
    }

    /* renamed from: d */
    private void m53348d() {
        Image image = this.f41753b;
        if (image != null) {
            image.close();
            this.f41753b = null;
        }
    }

    /* renamed from: f */
    private static ImageReader m53349f(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0) {
            m53351h("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
            i3 = 1;
        } else {
            i3 = i;
        }
        if (i2 <= 0) {
            m53351h("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return ImageReader.newInstance(i3, i4, 1, 3, 768);
        }
        return ImageReader.newInstance(i3, i4, 1, 3);
    }

    /* renamed from: g */
    private void m53350g() {
        setAlpha(0.0f);
    }

    /* renamed from: h */
    private static void m53351h(String str, Object... objArr) {
        C11881b.m57389g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    /* renamed from: j */
    private void m53352j() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f41753b.getHardwareBuffer();
            this.f41754c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f41753b.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f41753b.getHeight();
            Bitmap bitmap = this.f41754c;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f41754c.getHeight() == height)) {
                this.f41754c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.f41754c.copyPixelsFromBuffer(buffer);
        }
    }

    /* renamed from: a */
    public void mo33918a() {
        if (this.f41757f) {
            setAlpha(0.0f);
            mo33920c();
            this.f41754c = null;
            m53348d();
            invalidate();
            this.f41757f = false;
        }
    }

    /* renamed from: b */
    public void mo33919b(C13247a aVar) {
        if (C10636a.f41758a[this.f41756e.ordinal()] == 1) {
            aVar.mo38362x(this.f41752a.getSurface());
        }
        setAlpha(1.0f);
        this.f41755d = aVar;
        this.f41757f = true;
    }

    /* renamed from: c */
    public boolean mo33920c() {
        if (!this.f41757f) {
            return false;
        }
        Image acquireLatestImage = this.f41752a.acquireLatestImage();
        if (acquireLatestImage != null) {
            m53348d();
            this.f41753b = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo33921e() {
        this.f41752a.close();
    }

    public C13247a getAttachedRenderer() {
        return this.f41755d;
    }

    public ImageReader getImageReader() {
        return this.f41752a;
    }

    public Surface getSurface() {
        return this.f41752a.getSurface();
    }

    /* renamed from: i */
    public void mo33925i(int i, int i2) {
        if (this.f41755d != null) {
            if (i != this.f41752a.getWidth() || i2 != this.f41752a.getHeight()) {
                m53348d();
                mo33921e();
                this.f41752a = m53349f(i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f41753b != null) {
            m53352j();
        }
        Bitmap bitmap = this.f41754c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.f41752a.getWidth() && i2 == this.f41752a.getHeight()) && this.f41756e == C10637b.background && this.f41757f) {
            mo33925i(i, i2);
            this.f41755d.mo38362x(this.f41752a.getSurface());
        }
    }

    public void pause() {
    }

    C10635g(Context context, ImageReader imageReader, C10637b bVar) {
        super(context, (AttributeSet) null);
        this.f41757f = false;
        this.f41752a = imageReader;
        this.f41756e = bVar;
        m53350g();
    }
}
