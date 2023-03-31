package p093m3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p079k3.C4864b;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5980z;

/* renamed from: m3.b */
/* compiled from: DvbParser */
final class C5033b {

    /* renamed from: h */
    private static final byte[] f26382h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f26383i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f26384j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f26385a;

    /* renamed from: b */
    private final Paint f26386b;

    /* renamed from: c */
    private final Canvas f26387c = new Canvas();

    /* renamed from: d */
    private final C5035b f26388d = new C5035b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    private final C5034a f26389e = new C5034a(0, m31742c(), m31743d(), m31744e());

    /* renamed from: f */
    private final C5041h f26390f;

    /* renamed from: g */
    private Bitmap f26391g;

    /* renamed from: m3.b$a */
    /* compiled from: DvbParser */
    private static final class C5034a {

        /* renamed from: a */
        public final int f26392a;

        /* renamed from: b */
        public final int[] f26393b;

        /* renamed from: c */
        public final int[] f26394c;

        /* renamed from: d */
        public final int[] f26395d;

        public C5034a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f26392a = i;
            this.f26393b = iArr;
            this.f26394c = iArr2;
            this.f26395d = iArr3;
        }
    }

    /* renamed from: m3.b$b */
    /* compiled from: DvbParser */
    private static final class C5035b {

        /* renamed from: a */
        public final int f26396a;

        /* renamed from: b */
        public final int f26397b;

        /* renamed from: c */
        public final int f26398c;

        /* renamed from: d */
        public final int f26399d;

        /* renamed from: e */
        public final int f26400e;

        /* renamed from: f */
        public final int f26401f;

        public C5035b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f26396a = i;
            this.f26397b = i2;
            this.f26398c = i3;
            this.f26399d = i4;
            this.f26400e = i5;
            this.f26401f = i6;
        }
    }

    /* renamed from: m3.b$c */
    /* compiled from: DvbParser */
    private static final class C5036c {

        /* renamed from: a */
        public final int f26402a;

        /* renamed from: b */
        public final boolean f26403b;

        /* renamed from: c */
        public final byte[] f26404c;

        /* renamed from: d */
        public final byte[] f26405d;

        public C5036c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f26402a = i;
            this.f26403b = z;
            this.f26404c = bArr;
            this.f26405d = bArr2;
        }
    }

    /* renamed from: m3.b$d */
    /* compiled from: DvbParser */
    private static final class C5037d {

        /* renamed from: a */
        public final int f26406a;

        /* renamed from: b */
        public final int f26407b;

        /* renamed from: c */
        public final int f26408c;

        /* renamed from: d */
        public final SparseArray<C5038e> f26409d;

        public C5037d(int i, int i2, int i3, SparseArray<C5038e> sparseArray) {
            this.f26406a = i;
            this.f26407b = i2;
            this.f26408c = i3;
            this.f26409d = sparseArray;
        }
    }

    /* renamed from: m3.b$e */
    /* compiled from: DvbParser */
    private static final class C5038e {

        /* renamed from: a */
        public final int f26410a;

        /* renamed from: b */
        public final int f26411b;

        public C5038e(int i, int i2) {
            this.f26410a = i;
            this.f26411b = i2;
        }
    }

    /* renamed from: m3.b$f */
    /* compiled from: DvbParser */
    private static final class C5039f {

        /* renamed from: a */
        public final int f26412a;

        /* renamed from: b */
        public final boolean f26413b;

        /* renamed from: c */
        public final int f26414c;

        /* renamed from: d */
        public final int f26415d;

        /* renamed from: e */
        public final int f26416e;

        /* renamed from: f */
        public final int f26417f;

        /* renamed from: g */
        public final int f26418g;

        /* renamed from: h */
        public final int f26419h;

        /* renamed from: i */
        public final int f26420i;

        /* renamed from: j */
        public final int f26421j;

        /* renamed from: k */
        public final SparseArray<C5040g> f26422k;

        public C5039f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C5040g> sparseArray) {
            this.f26412a = i;
            this.f26413b = z;
            this.f26414c = i2;
            this.f26415d = i3;
            this.f26416e = i4;
            this.f26417f = i5;
            this.f26418g = i6;
            this.f26419h = i7;
            this.f26420i = i8;
            this.f26421j = i9;
            this.f26422k = sparseArray;
        }

        /* renamed from: a */
        public void mo18966a(C5039f fVar) {
            SparseArray<C5040g> sparseArray = fVar.f26422k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f26422k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* renamed from: m3.b$g */
    /* compiled from: DvbParser */
    private static final class C5040g {

        /* renamed from: a */
        public final int f26423a;

        /* renamed from: b */
        public final int f26424b;

        /* renamed from: c */
        public final int f26425c;

        /* renamed from: d */
        public final int f26426d;

        /* renamed from: e */
        public final int f26427e;

        /* renamed from: f */
        public final int f26428f;

        public C5040g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f26423a = i;
            this.f26424b = i2;
            this.f26425c = i3;
            this.f26426d = i4;
            this.f26427e = i5;
            this.f26428f = i6;
        }
    }

    /* renamed from: m3.b$h */
    /* compiled from: DvbParser */
    private static final class C5041h {

        /* renamed from: a */
        public final int f26429a;

        /* renamed from: b */
        public final int f26430b;

        /* renamed from: c */
        public final SparseArray<C5039f> f26431c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C5034a> f26432d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C5036c> f26433e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C5034a> f26434f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C5036c> f26435g = new SparseArray<>();

        /* renamed from: h */
        public C5035b f26436h;

        /* renamed from: i */
        public C5037d f26437i;

        public C5041h(int i, int i2) {
            this.f26429a = i;
            this.f26430b = i2;
        }

        /* renamed from: a */
        public void mo18967a() {
            this.f26431c.clear();
            this.f26432d.clear();
            this.f26433e.clear();
            this.f26434f.clear();
            this.f26435g.clear();
            this.f26436h = null;
            this.f26437i = null;
        }
    }

    public C5033b(int i, int i2) {
        Paint paint = new Paint();
        this.f26385a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f26386b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f26390f = new C5041h(i, i2);
    }

    /* renamed from: a */
    private static byte[] m31741a(int i, int i2, C5980z zVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zVar.mo20676h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    private static int[] m31742c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    private static int[] m31743d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m31745f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m31745f(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static int[] m31744e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m31745f(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m31745f(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m31745f(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m31745f(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m31745f(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    private static int m31745f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[LOOP:0: B:1:0x0009->B:31:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m31746g(p161w3.C5980z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.mo20676h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0061
        L_0x0014:
            boolean r4 = r13.mo20675g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.mo20676h(r6)
            int r4 = r4 + r6
            int r3 = r13.mo20676h(r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0061
        L_0x0028:
            boolean r4 = r13.mo20675g()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.mo20676h(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005a
            if (r4 == r3) goto L_0x004e
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0061
        L_0x0041:
            r4 = 8
            int r4 = r13.mo20676h(r4)
            int r4 = r4 + 29
            int r3 = r13.mo20676h(r3)
            goto L_0x0024
        L_0x004e:
            r4 = 4
            int r4 = r13.mo20676h(r4)
            int r4 = r4 + 12
            int r3 = r13.mo20676h(r3)
            goto L_0x0024
        L_0x005a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0061
        L_0x005e:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0061:
            if (r12 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            if (r15 == 0) goto L_0x0069
            byte r4 = r15[r4]
        L_0x0069:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007f:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0083
            return r10
        L_0x0083:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p093m3.C5033b.m31746g(w3.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[LOOP:0: B:1:0x0009->B:34:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m31747h(p161w3.C5980z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.mo20676h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0016
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x006e
        L_0x0016:
            boolean r4 = r13.mo20675g()
            r7 = 3
            if (r4 != 0) goto L_0x002c
            int r3 = r13.mo20676h(r7)
            if (r3 == 0) goto L_0x0029
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x006e
        L_0x0029:
            r4 = 0
            r11 = 1
            goto L_0x004d
        L_0x002c:
            boolean r4 = r13.mo20675g()
            if (r4 != 0) goto L_0x003f
            int r4 = r13.mo20676h(r5)
            int r5 = r4 + 4
            int r4 = r13.mo20676h(r3)
        L_0x003c:
            r11 = r2
            r12 = r5
            goto L_0x006e
        L_0x003f:
            int r4 = r13.mo20676h(r5)
            if (r4 == 0) goto L_0x006b
            if (r4 == r6) goto L_0x0067
            if (r4 == r5) goto L_0x005c
            if (r4 == r7) goto L_0x004f
            r11 = r2
            r4 = 0
        L_0x004d:
            r12 = 0
            goto L_0x006e
        L_0x004f:
            r4 = 8
            int r4 = r13.mo20676h(r4)
            int r5 = r4 + 25
            int r4 = r13.mo20676h(r3)
            goto L_0x003c
        L_0x005c:
            int r4 = r13.mo20676h(r3)
            int r5 = r4 + 9
            int r4 = r13.mo20676h(r3)
            goto L_0x003c
        L_0x0067:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x006e
        L_0x006b:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x006e:
            if (r12 == 0) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            if (r15 == 0) goto L_0x0076
            byte r4 = r15[r4]
        L_0x0076:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008a:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x008e
            return r10
        L_0x008e:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p093m3.C5033b.m31747h(w3.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m31748i(p161w3.C5980z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.mo20676h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.mo20675g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.mo20676h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.mo20676h(r6)
            int r3 = r13.mo20676h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p093m3.C5033b.m31748i(w3.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: j */
    private static void m31749j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i4 = i;
        byte[] bArr5 = bArr;
        C5980z zVar = new C5980z(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (zVar.mo20670b() != 0) {
            int h = zVar.mo20676h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                i5 = m31746g(zVar, iArr, bArr2, i5, i6, paint, canvas);
                                zVar.mo20671c();
                                break;
                            } else {
                                bArr3 = bArr8 == null ? f26382h : bArr8;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f26383i : bArr6;
                        }
                        bArr2 = bArr3;
                        i5 = m31746g(zVar, iArr, bArr2, i5, i6, paint, canvas);
                        zVar.mo20671c();
                    case 17:
                        if (i4 == 3) {
                            bArr4 = bArr7 == null ? f26384j : bArr7;
                        } else {
                            bArr4 = null;
                        }
                        i5 = m31747h(zVar, iArr, bArr4, i5, i6, paint, canvas);
                        zVar.mo20671c();
                        break;
                    case 18:
                        i5 = m31748i(zVar, iArr, (byte[]) null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (h) {
                            case 32:
                                bArr8 = m31741a(4, 4, zVar);
                                break;
                            case 33:
                                bArr6 = m31741a(4, 8, zVar);
                                break;
                            case 34:
                                bArr7 = m31741a(16, 8, zVar);
                                break;
                        }
                }
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: k */
    private static void m31750k(C5036c cVar, C5034a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f26395d;
        } else if (i == 2) {
            iArr = aVar.f26394c;
        } else {
            iArr = aVar.f26393b;
        }
        int[] iArr2 = iArr;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m31749j(cVar.f26404c, iArr2, i4, i5, i3, paint2, canvas2);
        m31749j(cVar.f26405d, iArr2, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: l */
    private static C5034a m31751l(C5980z zVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C5980z zVar2 = zVar;
        int i7 = 8;
        int h = zVar2.mo20676h(8);
        zVar2.mo20686r(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m31742c();
        int[] d = m31743d();
        int[] e = m31744e();
        while (i9 > 0) {
            int h2 = zVar2.mo20676h(i7);
            int h3 = zVar2.mo20676h(i7);
            int i10 = i9 - 2;
            int[] iArr = (h3 & 128) != 0 ? c : (h3 & 64) != 0 ? d : e;
            if ((h3 & 1) != 0) {
                i5 = zVar2.mo20676h(i7);
                i4 = zVar2.mo20676h(i7);
                i3 = zVar2.mo20676h(i7);
                i2 = zVar2.mo20676h(i7);
                i6 = i10 - 4;
            } else {
                i3 = zVar2.mo20676h(4) << 4;
                i6 = i10 - 2;
                int h4 = zVar2.mo20676h(4) << 4;
                i2 = zVar2.mo20676h(i8) << 6;
                i5 = zVar2.mo20676h(6) << i8;
                i4 = h4;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            double d2 = (double) i5;
            double d3 = (double) (i4 - 128);
            double d4 = (double) (i3 - 128);
            iArr[h2] = m31745f((byte) (255 - (i2 & 255)), C5953m0.m35152q((int) (d2 + (1.402d * d3)), 0, 255), C5953m0.m35152q((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C5953m0.m35152q((int) (d2 + (d4 * 1.772d)), 0, 255));
            i9 = i6;
            h = h;
            i7 = 8;
            i8 = 2;
        }
        return new C5034a(h, c, d, e);
    }

    /* renamed from: m */
    private static C5035b m31752m(C5980z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        zVar.mo20686r(4);
        boolean g = zVar.mo20675g();
        zVar.mo20686r(3);
        int h = zVar.mo20676h(16);
        int h2 = zVar.mo20676h(16);
        if (g) {
            int h3 = zVar.mo20676h(16);
            int h4 = zVar.mo20676h(16);
            int h5 = zVar.mo20676h(16);
            i = zVar.mo20676h(16);
            i3 = h4;
            i2 = h5;
            i4 = h3;
        } else {
            i3 = h;
            i = h2;
            i4 = 0;
            i2 = 0;
        }
        return new C5035b(h, h2, i4, i3, i2, i);
    }

    /* renamed from: n */
    private static C5036c m31753n(C5980z zVar) {
        byte[] bArr;
        int h = zVar.mo20676h(16);
        zVar.mo20686r(4);
        int h2 = zVar.mo20676h(2);
        boolean g = zVar.mo20675g();
        zVar.mo20686r(1);
        byte[] bArr2 = C5953m0.f29115f;
        if (h2 == 1) {
            zVar.mo20686r(zVar.mo20676h(8) * 16);
        } else if (h2 == 0) {
            int h3 = zVar.mo20676h(16);
            int h4 = zVar.mo20676h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                zVar.mo20679k(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                zVar.mo20679k(bArr, 0, h4);
                return new C5036c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C5036c(h, g, bArr2, bArr);
    }

    /* renamed from: o */
    private static C5037d m31754o(C5980z zVar, int i) {
        int h = zVar.mo20676h(8);
        int h2 = zVar.mo20676h(4);
        int h3 = zVar.mo20676h(2);
        zVar.mo20686r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = zVar.mo20676h(8);
            zVar.mo20686r(8);
            i2 -= 6;
            sparseArray.put(h4, new C5038e(zVar.mo20676h(16), zVar.mo20676h(16)));
        }
        return new C5037d(h, h2, h3, sparseArray);
    }

    /* renamed from: p */
    private static C5039f m31755p(C5980z zVar, int i) {
        int i2;
        int i3;
        C5980z zVar2 = zVar;
        int h = zVar2.mo20676h(8);
        zVar2.mo20686r(4);
        boolean g = zVar.mo20675g();
        zVar2.mo20686r(3);
        int i4 = 16;
        int h2 = zVar2.mo20676h(16);
        int h3 = zVar2.mo20676h(16);
        int h4 = zVar2.mo20676h(3);
        int h5 = zVar2.mo20676h(3);
        int i5 = 2;
        zVar2.mo20686r(2);
        int h6 = zVar2.mo20676h(8);
        int h7 = zVar2.mo20676h(8);
        int h8 = zVar2.mo20676h(4);
        int h9 = zVar2.mo20676h(2);
        zVar2.mo20686r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = zVar2.mo20676h(i4);
            int h11 = zVar2.mo20676h(i5);
            int h12 = zVar2.mo20676h(i5);
            int h13 = zVar2.mo20676h(12);
            int i7 = h9;
            zVar2.mo20686r(4);
            int h14 = zVar2.mo20676h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = zVar2.mo20676h(8);
                i2 = zVar2.mo20676h(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            sparseArray.put(h10, new C5040g(h11, h12, h13, h14, i3, i2));
            h9 = i7;
            i5 = 2;
            i4 = 16;
        }
        return new C5039f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
    }

    /* renamed from: q */
    private static void m31756q(C5980z zVar, C5041h hVar) {
        C5039f fVar;
        int h = zVar.mo20676h(8);
        int h2 = zVar.mo20676h(16);
        int h3 = zVar.mo20676h(16);
        int d = zVar.mo20672d() + h3;
        if (h3 * 8 > zVar.mo20670b()) {
            C5961r.m35215i("DvbParser", "Data field length exceeds limit");
            zVar.mo20686r(zVar.mo20670b());
            return;
        }
        switch (h) {
            case 16:
                if (h2 == hVar.f26429a) {
                    C5037d dVar = hVar.f26437i;
                    C5037d o = m31754o(zVar, h3);
                    if (o.f26408c == 0) {
                        if (!(dVar == null || dVar.f26407b == o.f26407b)) {
                            hVar.f26437i = o;
                            break;
                        }
                    } else {
                        hVar.f26437i = o;
                        hVar.f26431c.clear();
                        hVar.f26432d.clear();
                        hVar.f26433e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C5037d dVar2 = hVar.f26437i;
                if (h2 == hVar.f26429a && dVar2 != null) {
                    C5039f p = m31755p(zVar, h3);
                    if (dVar2.f26408c == 0 && (fVar = hVar.f26431c.get(p.f26412a)) != null) {
                        p.mo18966a(fVar);
                    }
                    hVar.f26431c.put(p.f26412a, p);
                    break;
                }
            case 18:
                if (h2 != hVar.f26429a) {
                    if (h2 == hVar.f26430b) {
                        C5034a l = m31751l(zVar, h3);
                        hVar.f26434f.put(l.f26392a, l);
                        break;
                    }
                } else {
                    C5034a l2 = m31751l(zVar, h3);
                    hVar.f26432d.put(l2.f26392a, l2);
                    break;
                }
                break;
            case 19:
                if (h2 != hVar.f26429a) {
                    if (h2 == hVar.f26430b) {
                        C5036c n = m31753n(zVar);
                        hVar.f26435g.put(n.f26402a, n);
                        break;
                    }
                } else {
                    C5036c n2 = m31753n(zVar);
                    hVar.f26433e.put(n2.f26402a, n2);
                    break;
                }
                break;
            case 20:
                if (h2 == hVar.f26429a) {
                    hVar.f26436h = m31752m(zVar);
                    break;
                }
                break;
        }
        zVar.mo20687s(d - zVar.mo20672d());
    }

    /* renamed from: b */
    public List<C4864b> mo18964b(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<C5040g> sparseArray;
        C5980z zVar = new C5980z(bArr, i);
        while (zVar.mo20670b() >= 48 && zVar.mo20676h(8) == 15) {
            m31756q(zVar, this.f26390f);
        }
        C5041h hVar = this.f26390f;
        C5037d dVar = hVar.f26437i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C5035b bVar = hVar.f26436h;
        if (bVar == null) {
            bVar = this.f26388d;
        }
        Bitmap bitmap = this.f26391g;
        if (!(bitmap != null && bVar.f26396a + 1 == bitmap.getWidth() && bVar.f26397b + 1 == this.f26391g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f26396a + 1, bVar.f26397b + 1, Bitmap.Config.ARGB_8888);
            this.f26391g = createBitmap;
            this.f26387c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C5038e> sparseArray2 = dVar.f26409d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f26387c.save();
            C5038e valueAt = sparseArray2.valueAt(i4);
            C5039f fVar = this.f26390f.f26431c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f26410a + bVar.f26398c;
            int i6 = valueAt.f26411b + bVar.f26400e;
            this.f26387c.clipRect(i5, i6, Math.min(fVar.f26414c + i5, bVar.f26399d), Math.min(fVar.f26415d + i6, bVar.f26401f));
            C5034a aVar = this.f26390f.f26432d.get(fVar.f26418g);
            if (aVar == null && (aVar = this.f26390f.f26434f.get(fVar.f26418g)) == null) {
                aVar = this.f26389e;
            }
            SparseArray<C5040g> sparseArray3 = fVar.f26422k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C5040g valueAt2 = sparseArray3.valueAt(i7);
                C5036c cVar = this.f26390f.f26433e.get(keyAt);
                C5036c cVar2 = cVar == null ? this.f26390f.f26435g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    Paint paint = cVar2.f26403b ? null : this.f26385a;
                    i3 = i7;
                    int i8 = i6 + valueAt2.f26426d;
                    sparseArray = sparseArray3;
                    m31750k(cVar2, aVar, fVar.f26417f, valueAt2.f26425c + i5, i8, paint, this.f26387c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f26413b) {
                int i9 = fVar.f26417f;
                if (i9 == 3) {
                    i2 = aVar.f26395d[fVar.f26419h];
                } else if (i9 == 2) {
                    i2 = aVar.f26394c[fVar.f26420i];
                } else {
                    i2 = aVar.f26393b[fVar.f26421j];
                }
                this.f26386b.setColor(i2);
                this.f26387c.drawRect((float) i5, (float) i6, (float) (fVar.f26414c + i5), (float) (fVar.f26415d + i6), this.f26386b);
            }
            arrayList.add(new C4864b.C4866b().mo18629f(Bitmap.createBitmap(this.f26391g, i5, i6, fVar.f26414c, fVar.f26415d)).mo18634k(((float) i5) / ((float) bVar.f26396a)).mo18635l(0).mo18631h(((float) i6) / ((float) bVar.f26397b), 0).mo18632i(0).mo18637n(((float) fVar.f26414c) / ((float) bVar.f26396a)).mo18630g(((float) fVar.f26415d) / ((float) bVar.f26397b)).mo18624a());
            this.f26387c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f26387c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void mo18965r() {
        this.f26390f.mo18967a();
    }
}
