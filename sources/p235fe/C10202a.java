package p235fe;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import p212d9.C9909a;
import p212d9.C9911c;
import p212d9.C9913e;
import p212d9.C9917i;
import p212d9.C9918j;
import p212d9.C9919k;
import p212d9.C9921m;
import p212d9.C9922n;
import p226ee.C10110a;
import p226ee.C10119f;
import p248h9.C10484j;

/* renamed from: fe.a */
/* compiled from: ZXingScannerView */
public class C10202a extends C10110a {

    /* renamed from: F */
    public static final List<C9909a> f40641F;

    /* renamed from: C */
    private C9917i f40642C;

    /* renamed from: D */
    private List<C9909a> f40643D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C10204b f40644E;

    /* renamed from: fe.a$a */
    /* compiled from: ZXingScannerView */
    class C10203a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9922n f40645a;

        C10203a(C9922n nVar) {
            this.f40645a = nVar;
        }

        public void run() {
            C10204b j = C10202a.this.f40644E;
            C10204b unused = C10202a.this.f40644E = null;
            C10202a.this.mo32731h();
            if (j != null) {
                j.mo32515a(this.f40645a);
            }
        }
    }

    /* renamed from: fe.a$b */
    /* compiled from: ZXingScannerView */
    public interface C10204b {
        /* renamed from: a */
        void mo32515a(C9922n nVar);
    }

    static {
        ArrayList arrayList = new ArrayList();
        f40641F = arrayList;
        arrayList.add(C9909a.AZTEC);
        arrayList.add(C9909a.CODABAR);
        arrayList.add(C9909a.CODE_39);
        arrayList.add(C9909a.CODE_93);
        arrayList.add(C9909a.CODE_128);
        arrayList.add(C9909a.DATA_MATRIX);
        arrayList.add(C9909a.EAN_8);
        arrayList.add(C9909a.EAN_13);
        arrayList.add(C9909a.ITF);
        arrayList.add(C9909a.MAXICODE);
        arrayList.add(C9909a.PDF_417);
        arrayList.add(C9909a.QR_CODE);
        arrayList.add(C9909a.RSS_14);
        arrayList.add(C9909a.RSS_EXPANDED);
        arrayList.add(C9909a.UPC_A);
        arrayList.add(C9909a.UPC_E);
        arrayList.add(C9909a.UPC_EAN_EXTENSION);
    }

    public C10202a(Context context) {
        super(context);
        m51709m();
    }

    /* renamed from: m */
    private void m51709m() {
        EnumMap enumMap = new EnumMap(C9913e.class);
        enumMap.put(C9913e.POSSIBLE_FORMATS, getFormats());
        C9917i iVar = new C9917i();
        this.f40642C = iVar;
        iVar.mo32468d(enumMap);
    }

    public Collection<C9909a> getFormats() {
        List<C9909a> list = this.f40643D;
        return list == null ? f40641F : list;
    }

    /* renamed from: l */
    public C9919k mo32870l(byte[] bArr, int i, int i2) {
        Rect b = mo32724b(i, i2);
        if (b == null) {
            return null;
        }
        try {
            return new C9919k(bArr, i, i2, b.left, b.top, b.width(), b.height(), false);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        C9922n nVar;
        C9917i iVar;
        C9917i iVar2;
        if (this.f40644E != null) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                int i = previewSize.width;
                int i2 = previewSize.height;
                if (C10119f.m51455a(getContext()) == 1) {
                    int rotationCount = getRotationCount();
                    if (rotationCount == 1 || rotationCount == 3) {
                        int i3 = i;
                        i = i2;
                        i2 = i3;
                    }
                    bArr = mo32725c(bArr, camera);
                }
                nVar = null;
                C9919k l = mo32870l(bArr, i, i2);
                if (l != null) {
                    nVar = this.f40642C.mo32467c(new C9911c(new C10484j(l)));
                    iVar = this.f40642C;
                    iVar.reset();
                    if (nVar == null) {
                        nVar = this.f40642C.mo32467c(new C9911c(new C10484j(l.mo32464e())));
                        iVar2 = this.f40642C;
                        iVar2.reset();
                    }
                }
            } catch (C9918j unused) {
                iVar2 = this.f40642C;
            } catch (C9921m unused2) {
                iVar = this.f40642C;
            } catch (NullPointerException unused3) {
                iVar = this.f40642C;
            } catch (ArrayIndexOutOfBoundsException unused4) {
                iVar = this.f40642C;
            } catch (RuntimeException e) {
                Log.e("ZXingScannerView", e.toString(), e);
                return;
            } catch (Throwable th) {
                this.f40642C.reset();
                throw th;
            }
            if (nVar != null) {
                new Handler(Looper.getMainLooper()).post(new C10203a(nVar));
            } else {
                camera.setOneShotPreviewCallback(this);
            }
        }
    }

    public void setFormats(List<C9909a> list) {
        this.f40643D = list;
        m51709m();
    }

    public void setResultHandler(C10204b bVar) {
        this.f40644E = bVar;
    }
}
