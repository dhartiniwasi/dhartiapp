package p226ee;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;

/* renamed from: ee.c */
/* compiled from: CameraPreview */
public class C10114c extends SurfaceView implements SurfaceHolder.Callback {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10118e f40198a;

    /* renamed from: b */
    private Handler f40199b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f40200c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f40201d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f40202e = false;

    /* renamed from: f */
    private boolean f40203f = true;

    /* renamed from: g */
    private Camera.PreviewCallback f40204g;

    /* renamed from: h */
    private float f40205h = 0.1f;

    /* renamed from: i */
    private Runnable f40206i = new C10115a();

    /* renamed from: r */
    Camera.AutoFocusCallback f40207r = new C10116b();

    /* renamed from: ee.c$a */
    /* compiled from: CameraPreview */
    class C10115a implements Runnable {
        C10115a() {
        }

        public void run() {
            if (C10114c.this.f40198a != null && C10114c.this.f40200c && C10114c.this.f40201d && C10114c.this.f40202e) {
                C10114c.this.mo32754i();
            }
        }
    }

    /* renamed from: ee.c$b */
    /* compiled from: CameraPreview */
    class C10116b implements Camera.AutoFocusCallback {
        C10116b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C10114c.this.m51443j();
        }
    }

    public C10114c(Context context, C10118e eVar, Camera.PreviewCallback previewCallback) {
        super(context);
        mo32753h(eVar, previewCallback);
    }

    /* renamed from: f */
    private void m51441f(Camera.Size size) {
        Point g = m51442g(new Point(getWidth(), getHeight()));
        float f = ((float) size.width) / ((float) size.height);
        int i = g.x;
        int i2 = g.y;
        if (((float) i) / ((float) i2) > f) {
            m51444l((int) (((float) i2) * f), i2);
        } else {
            m51444l(i, (int) (((float) i) / f));
        }
    }

    /* renamed from: g */
    private Point m51442g(Point point) {
        if (getDisplayOrientation() % 180 == 0) {
            return point;
        }
        return new Point(point.y, point.x);
    }

    private Camera.Size getOptimalPreviewSize() {
        C10118e eVar = this.f40198a;
        Camera.Size size = null;
        if (eVar == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = eVar.f40210a.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (C10119f.m51455a(getContext()) == 1) {
            int i = height;
            height = width;
            width = i;
        }
        double d = ((double) width) / ((double) height);
        if (supportedPreviewSizes == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Camera.Size next : supportedPreviewSizes) {
            if (Math.abs((((double) next.width) / ((double) next.height)) - d) <= ((double) this.f40205h) && ((double) Math.abs(next.height - height)) < d3) {
                d3 = (double) Math.abs(next.height - height);
                size = next;
            }
        }
        if (size == null) {
            for (Camera.Size next2 : supportedPreviewSizes) {
                if (((double) Math.abs(next2.height - height)) < d2) {
                    size = next2;
                    d2 = (double) Math.abs(next2.height - height);
                }
            }
        }
        return size;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m51443j() {
        this.f40199b.postDelayed(this.f40206i, 1000);
    }

    /* renamed from: l */
    private void m51444l(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % 180 != 0) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        if (this.f40203f) {
            float f = (float) i;
            float width = ((float) ((View) getParent()).getWidth()) / f;
            float f2 = (float) i2;
            float height = ((float) ((View) getParent()).getHeight()) / f2;
            if (width <= height) {
                width = height;
            }
            i = Math.round(f * width);
            i2 = Math.round(f2 * width);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public int getDisplayOrientation() {
        int i = 0;
        if (this.f40198a == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = this.f40198a.f40211b;
        if (i2 == -1) {
            Camera.getCameraInfo(0, cameraInfo);
        } else {
            Camera.getCameraInfo(i2, cameraInfo);
        }
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    /* renamed from: h */
    public void mo32753h(C10118e eVar, Camera.PreviewCallback previewCallback) {
        mo32755k(eVar, previewCallback);
        this.f40199b = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    /* renamed from: i */
    public void mo32754i() {
        try {
            this.f40198a.f40210a.autoFocus(this.f40207r);
        } catch (RuntimeException unused) {
            m51443j();
        }
    }

    /* renamed from: k */
    public void mo32755k(C10118e eVar, Camera.PreviewCallback previewCallback) {
        this.f40198a = eVar;
        this.f40204g = previewCallback;
    }

    /* renamed from: m */
    public void mo32756m() {
        Camera.Size optimalPreviewSize = getOptimalPreviewSize();
        Camera.Parameters parameters = this.f40198a.f40210a.getParameters();
        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
        this.f40198a.f40210a.setParameters(parameters);
        m51441f(optimalPreviewSize);
    }

    /* renamed from: n */
    public void mo32757n() {
        if (this.f40198a != null) {
            try {
                getHolder().addCallback(this);
                this.f40200c = true;
                mo32756m();
                this.f40198a.f40210a.setPreviewDisplay(getHolder());
                this.f40198a.f40210a.setDisplayOrientation(getDisplayOrientation());
                this.f40198a.f40210a.setOneShotPreviewCallback(this.f40204g);
                this.f40198a.f40210a.startPreview();
                if (!this.f40201d) {
                    return;
                }
                if (this.f40202e) {
                    mo32754i();
                } else {
                    m51443j();
                }
            } catch (Exception e) {
                Log.e("CameraPreview", e.toString(), e);
            }
        }
    }

    /* renamed from: o */
    public void mo32758o() {
        if (this.f40198a != null) {
            try {
                this.f40200c = false;
                getHolder().removeCallback(this);
                this.f40198a.f40210a.cancelAutoFocus();
                this.f40198a.f40210a.setOneShotPreviewCallback((Camera.PreviewCallback) null);
                this.f40198a.f40210a.stopPreview();
            } catch (Exception e) {
                Log.e("CameraPreview", e.toString(), e);
            }
        }
    }

    public void setAspectTolerance(float f) {
        this.f40205h = f;
    }

    public void setAutoFocus(boolean z) {
        if (this.f40198a != null && this.f40200c && z != this.f40201d) {
            this.f40201d = z;
            if (!z) {
                Log.v("CameraPreview", "Cancelling autofocus");
                this.f40198a.f40210a.cancelAutoFocus();
            } else if (this.f40202e) {
                Log.v("CameraPreview", "Starting autofocus");
                mo32754i();
            } else {
                m51443j();
            }
        }
    }

    public void setShouldScaleToFill(boolean z) {
        this.f40203f = z;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() != null) {
            mo32758o();
            mo32757n();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f40202e = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f40202e = false;
        mo32758o();
    }
}
