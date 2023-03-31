package p226ee;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* renamed from: ee.a */
/* compiled from: BarcodeScannerView */
public abstract class C10110a extends FrameLayout implements Camera.PreviewCallback {

    /* renamed from: A */
    private int f40173A = 0;

    /* renamed from: B */
    private float f40174B = 0.1f;

    /* renamed from: a */
    private C10118e f40175a;

    /* renamed from: b */
    private C10114c f40176b;

    /* renamed from: c */
    private C10120g f40177c;

    /* renamed from: d */
    private Rect f40178d;

    /* renamed from: e */
    private C10111b f40179e;

    /* renamed from: f */
    private Boolean f40180f;

    /* renamed from: g */
    private boolean f40181g = true;

    /* renamed from: h */
    private boolean f40182h = true;

    /* renamed from: i */
    private boolean f40183i = true;

    /* renamed from: r */
    private int f40184r = getResources().getColor(C10121h.viewfinder_laser);

    /* renamed from: s */
    private int f40185s = getResources().getColor(C10121h.viewfinder_border);

    /* renamed from: t */
    private int f40186t = getResources().getColor(C10121h.viewfinder_mask);

    /* renamed from: u */
    private int f40187u = getResources().getInteger(C10122i.viewfinder_border_width);

    /* renamed from: v */
    private int f40188v = getResources().getInteger(C10122i.viewfinder_border_length);

    /* renamed from: w */
    private boolean f40189w = false;

    /* renamed from: x */
    private int f40190x = 0;

    /* renamed from: y */
    private boolean f40191y = false;

    /* renamed from: z */
    private float f40192z = 1.0f;

    public C10110a(Context context) {
        super(context);
        m51425d();
    }

    /* renamed from: d */
    private void m51425d() {
        this.f40177c = mo32723a(getContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10120g mo32723a(Context context) {
        C10123j jVar = new C10123j(context);
        jVar.setBorderColor(this.f40185s);
        jVar.setLaserColor(this.f40184r);
        jVar.setLaserEnabled(this.f40183i);
        jVar.setBorderStrokeWidth(this.f40187u);
        jVar.setBorderLineLength(this.f40188v);
        jVar.setMaskColor(this.f40186t);
        jVar.setBorderCornerRounded(this.f40189w);
        jVar.setBorderCornerRadius(this.f40190x);
        jVar.setSquareViewFinder(this.f40191y);
        jVar.setViewFinderOffset(this.f40173A);
        return jVar;
    }

    /* renamed from: b */
    public synchronized Rect mo32724b(int i, int i2) {
        if (this.f40178d == null) {
            Rect framingRect = this.f40177c.getFramingRect();
            int width = this.f40177c.getWidth();
            int height = this.f40177c.getHeight();
            if (!(framingRect == null || width == 0)) {
                if (height != 0) {
                    Rect rect = new Rect(framingRect);
                    if (i < width) {
                        rect.left = (rect.left * i) / width;
                        rect.right = (rect.right * i) / width;
                    }
                    if (i2 < height) {
                        rect.top = (rect.top * i2) / height;
                        rect.bottom = (rect.bottom * i2) / height;
                    }
                    this.f40178d = rect;
                }
            }
            return null;
        }
        return this.f40178d;
    }

    /* renamed from: c */
    public byte[] mo32725c(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        int rotationCount = getRotationCount();
        if (rotationCount == 1 || rotationCount == 3) {
            int i3 = 0;
            while (i3 < rotationCount) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i4 = 0; i4 < i2; i4++) {
                    for (int i5 = 0; i5 < i; i5++) {
                        bArr2[(((i5 * i2) + i2) - i4) - 1] = bArr[(i4 * i) + i5];
                    }
                }
                i3++;
                bArr = bArr2;
                int i6 = i;
                i = i2;
                i2 = i6;
            }
        }
        return bArr;
    }

    /* renamed from: e */
    public void mo32726e() {
        mo32727f(C10117d.m51452b());
    }

    /* renamed from: f */
    public void mo32727f(int i) {
        if (this.f40179e == null) {
            this.f40179e = new C10111b(this);
        }
        this.f40179e.mo32749b(i);
    }

    /* renamed from: g */
    public void mo32728g() {
        if (this.f40175a != null) {
            this.f40176b.mo32758o();
            this.f40176b.mo32755k((C10118e) null, (Camera.PreviewCallback) null);
            this.f40175a.f40210a.release();
            this.f40175a = null;
        }
        C10111b bVar = this.f40179e;
        if (bVar != null) {
            bVar.quit();
            this.f40179e = null;
        }
    }

    public boolean getFlash() {
        C10118e eVar = this.f40175a;
        if (eVar == null || !C10117d.m51453c(eVar.f40210a) || !this.f40175a.f40210a.getParameters().getFlashMode().equals("torch")) {
            return false;
        }
        return true;
    }

    public int getRotationCount() {
        return this.f40176b.getDisplayOrientation() / 90;
    }

    /* renamed from: h */
    public void mo32731h() {
        C10114c cVar = this.f40176b;
        if (cVar != null) {
            cVar.mo32758o();
        }
    }

    /* renamed from: i */
    public void mo32732i() {
        C10118e eVar = this.f40175a;
        if (eVar != null && C10117d.m51453c(eVar.f40210a)) {
            Camera.Parameters parameters = this.f40175a.f40210a.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode("off");
            } else {
                parameters.setFlashMode("torch");
            }
            this.f40175a.f40210a.setParameters(parameters);
        }
    }

    public void setAspectTolerance(float f) {
        this.f40174B = f;
    }

    public void setAutoFocus(boolean z) {
        this.f40181g = z;
        C10114c cVar = this.f40176b;
        if (cVar != null) {
            cVar.setAutoFocus(z);
        }
    }

    public void setBorderAlpha(float f) {
        this.f40192z = f;
        this.f40177c.setBorderAlpha(f);
        this.f40177c.mo32767a();
    }

    public void setBorderColor(int i) {
        this.f40185s = i;
        this.f40177c.setBorderColor(i);
        this.f40177c.mo32767a();
    }

    public void setBorderCornerRadius(int i) {
        this.f40190x = i;
        this.f40177c.setBorderCornerRadius(i);
        this.f40177c.mo32767a();
    }

    public void setBorderLineLength(int i) {
        this.f40188v = i;
        this.f40177c.setBorderLineLength(i);
        this.f40177c.mo32767a();
    }

    public void setBorderStrokeWidth(int i) {
        this.f40187u = i;
        this.f40177c.setBorderStrokeWidth(i);
        this.f40177c.mo32767a();
    }

    public void setFlash(boolean z) {
        this.f40180f = Boolean.valueOf(z);
        C10118e eVar = this.f40175a;
        if (eVar != null && C10117d.m51453c(eVar.f40210a)) {
            Camera.Parameters parameters = this.f40175a.f40210a.getParameters();
            if (z) {
                if (!parameters.getFlashMode().equals("torch")) {
                    parameters.setFlashMode("torch");
                } else {
                    return;
                }
            } else if (!parameters.getFlashMode().equals("off")) {
                parameters.setFlashMode("off");
            } else {
                return;
            }
            this.f40175a.f40210a.setParameters(parameters);
        }
    }

    public void setIsBorderCornerRounded(boolean z) {
        this.f40189w = z;
        this.f40177c.setBorderCornerRounded(z);
        this.f40177c.mo32767a();
    }

    public void setLaserColor(int i) {
        this.f40184r = i;
        this.f40177c.setLaserColor(i);
        this.f40177c.mo32767a();
    }

    public void setLaserEnabled(boolean z) {
        this.f40183i = z;
        this.f40177c.setLaserEnabled(z);
        this.f40177c.mo32767a();
    }

    public void setMaskColor(int i) {
        this.f40186t = i;
        this.f40177c.setMaskColor(i);
        this.f40177c.mo32767a();
    }

    public void setShouldScaleToFill(boolean z) {
        this.f40182h = z;
    }

    public void setSquareViewFinder(boolean z) {
        this.f40191y = z;
        this.f40177c.setSquareViewFinder(z);
        this.f40177c.mo32767a();
    }

    public void setupCameraPreview(C10118e eVar) {
        this.f40175a = eVar;
        if (eVar != null) {
            setupLayout(eVar);
            this.f40177c.mo32767a();
            Boolean bool = this.f40180f;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.f40181g);
        }
    }

    public final void setupLayout(C10118e eVar) {
        removeAllViews();
        C10114c cVar = new C10114c(getContext(), eVar, this);
        this.f40176b = cVar;
        cVar.setAspectTolerance(this.f40174B);
        this.f40176b.setShouldScaleToFill(this.f40182h);
        if (!this.f40182h) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(this.f40176b);
            addView(relativeLayout);
        } else {
            addView(this.f40176b);
        }
        C10120g gVar = this.f40177c;
        if (gVar instanceof View) {
            addView((View) gVar);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }
}
