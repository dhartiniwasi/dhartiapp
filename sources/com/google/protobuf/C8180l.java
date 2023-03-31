package com.google.protobuf;

import com.google.protobuf.C8094a2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.l */
/* compiled from: CodedOutputStream */
public abstract class C8180l extends C8147h {

    /* renamed from: c */
    private static final Logger f34992c = Logger.getLogger(C8180l.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f34993d = C8268z1.m45986I();

    /* renamed from: a */
    C8191m f34994a;

    /* renamed from: b */
    private boolean f34995b;

    /* renamed from: com.google.protobuf.l$b */
    /* compiled from: CodedOutputStream */
    private static abstract class C8182b extends C8180l {

        /* renamed from: e */
        final byte[] f34996e;

        /* renamed from: f */
        final int f34997f;

        /* renamed from: g */
        int f34998g;

        /* renamed from: h */
        int f34999h;

        C8182b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f34996e = bArr;
                this.f34997f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b1 */
        public final void mo27139b1(byte b) {
            byte[] bArr = this.f34996e;
            int i = this.f34998g;
            this.f34998g = i + 1;
            bArr[i] = b;
            this.f34999h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c1 */
        public final void mo27140c1(int i) {
            byte[] bArr = this.f34996e;
            int i2 = this.f34998g;
            int i3 = i2 + 1;
            this.f34998g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f34998g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f34998g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f34998g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f34999h += 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d1 */
        public final void mo27141d1(long j) {
            byte[] bArr = this.f34996e;
            int i = this.f34998g;
            int i2 = i + 1;
            this.f34998g = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.f34998g = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.f34998g = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.f34998g = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.f34998g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f34998g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f34998g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f34998g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f34999h += 8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e1 */
        public final void mo27142e1(int i) {
            if (i >= 0) {
                mo27144g1(i);
            } else {
                mo27145h1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public final void mo27143f1(int i, int i2) {
            mo27144g1(C8105b2.m44582c(i, i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public final void mo27144g1(int i) {
            if (C8180l.f34993d) {
                long j = (long) this.f34998g;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f34996e;
                    int i2 = this.f34998g;
                    this.f34998g = i2 + 1;
                    C8268z1.m45992O(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f34996e;
                int i3 = this.f34998g;
                this.f34998g = i3 + 1;
                C8268z1.m45992O(bArr2, (long) i3, (byte) i);
                this.f34999h += (int) (((long) this.f34998g) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f34996e;
                int i4 = this.f34998g;
                this.f34998g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f34999h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f34996e;
            int i5 = this.f34998g;
            this.f34998g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f34999h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h1 */
        public final void mo27145h1(long j) {
            if (C8180l.f34993d) {
                long j2 = (long) this.f34998g;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f34996e;
                    int i = this.f34998g;
                    this.f34998g = i + 1;
                    C8268z1.m45992O(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f34996e;
                int i2 = this.f34998g;
                this.f34998g = i2 + 1;
                C8268z1.m45992O(bArr2, (long) i2, (byte) ((int) j));
                this.f34999h += (int) (((long) this.f34998g) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f34996e;
                int i3 = this.f34998g;
                this.f34998g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f34999h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f34996e;
            int i4 = this.f34998g;
            this.f34998g = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f34999h++;
        }

        /* renamed from: i0 */
        public final int mo27121i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: com.google.protobuf.l$c */
    /* compiled from: CodedOutputStream */
    private static class C8183c extends C8180l {

        /* renamed from: e */
        private final byte[] f35000e;

        /* renamed from: f */
        private final int f35001f;

        /* renamed from: g */
        private final int f35002g;

        /* renamed from: h */
        private int f35003h;

        C8183c(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.f35000e = bArr;
                this.f35001f = i;
                this.f35003h = i;
                this.f35002g = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: E0 */
        public final void mo27094E0(int i, int i2) throws IOException {
            mo27112W0(i, 0);
            mo27095F0(i2);
        }

        /* renamed from: F0 */
        public final void mo27095F0(int i) throws IOException {
            if (i >= 0) {
                mo27114Y0(i);
            } else {
                mo27116a1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I0 */
        public final void mo27098I0(int i, C8243v0 v0Var, C8202n1 n1Var) throws IOException {
            mo27112W0(i, 2);
            mo27114Y0(((C8088a) v0Var).mo26775m(n1Var));
            n1Var.mo27198b(v0Var, this.f34994a);
        }

        /* renamed from: J0 */
        public final void mo27099J0(C8243v0 v0Var) throws IOException {
            mo27114Y0(v0Var.mo27319f());
            v0Var.mo27318d(this);
        }

        /* renamed from: K0 */
        public final void mo27100K0(int i, C8243v0 v0Var) throws IOException {
            mo27112W0(1, 3);
            mo27113X0(2, i);
            mo27148d1(3, v0Var);
            mo27112W0(1, 4);
        }

        /* renamed from: L0 */
        public final void mo27101L0(int i, C8153i iVar) throws IOException {
            mo27112W0(1, 3);
            mo27113X0(2, i);
            mo27127o0(3, iVar);
            mo27112W0(1, 4);
        }

        /* renamed from: U0 */
        public final void mo27110U0(int i, String str) throws IOException {
            mo27112W0(i, 2);
            mo27111V0(str);
        }

        /* renamed from: V0 */
        public final void mo27111V0(String str) throws IOException {
            int i = this.f35003h;
            try {
                int X = C8180l.m45140X(str.length() * 3);
                int X2 = C8180l.m45140X(str.length());
                if (X2 == X) {
                    int i2 = i + X2;
                    this.f35003h = i2;
                    int i3 = C8094a2.m44507i(str, this.f35000e, i2, mo27121i0());
                    this.f35003h = i;
                    mo27114Y0((i3 - i) - X2);
                    this.f35003h = i3;
                    return;
                }
                mo27114Y0(C8094a2.m44508j(str));
                this.f35003h = C8094a2.m44507i(str, this.f35000e, this.f35003h, mo27121i0());
            } catch (C8094a2.C8098d e) {
                this.f35003h = i;
                mo27119d0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C8184d(e2);
            }
        }

        /* renamed from: W0 */
        public final void mo27112W0(int i, int i2) throws IOException {
            mo27114Y0(C8105b2.m44582c(i, i2));
        }

        /* renamed from: X0 */
        public final void mo27113X0(int i, int i2) throws IOException {
            mo27112W0(i, 0);
            mo27114Y0(i2);
        }

        /* renamed from: Y0 */
        public final void mo27114Y0(int i) throws IOException {
            while ((i & -128) != 0) {
                byte[] bArr = this.f35000e;
                int i2 = this.f35003h;
                this.f35003h = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr2 = this.f35000e;
                int i3 = this.f35003h;
                this.f35003h = i3 + 1;
                bArr2[i3] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new C8184d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35003h), Integer.valueOf(this.f35002g), 1}), e);
            }
        }

        /* renamed from: Z0 */
        public final void mo27115Z0(int i, long j) throws IOException {
            mo27112W0(i, 0);
            mo27116a1(j);
        }

        /* renamed from: a */
        public final void mo26916a(ByteBuffer byteBuffer) throws IOException {
            mo27146b1(byteBuffer);
        }

        /* renamed from: a1 */
        public final void mo27116a1(long j) throws IOException {
            if (!C8180l.f34993d || mo27121i0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f35000e;
                    int i = this.f35003h;
                    this.f35003h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f35000e;
                    int i2 = this.f35003h;
                    this.f35003h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C8184d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35003h), Integer.valueOf(this.f35002g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f35000e;
                    int i3 = this.f35003h;
                    this.f35003h = i3 + 1;
                    C8268z1.m45992O(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f35000e;
                int i4 = this.f35003h;
                this.f35003h = i4 + 1;
                C8268z1.m45992O(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: b */
        public final void mo26917b(byte[] bArr, int i, int i2) throws IOException {
            mo27147c1(bArr, i, i2);
        }

        /* renamed from: b1 */
        public final void mo27146b1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f35000e, this.f35003h, remaining);
                this.f35003h += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new C8184d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35003h), Integer.valueOf(this.f35002g), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: c0 */
        public void mo27117c0() {
        }

        /* renamed from: c1 */
        public final void mo27147c1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f35000e, this.f35003h, i2);
                this.f35003h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C8184d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35003h), Integer.valueOf(this.f35002g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: d1 */
        public final void mo27148d1(int i, C8243v0 v0Var) throws IOException {
            mo27112W0(i, 2);
            mo27099J0(v0Var);
        }

        /* renamed from: i0 */
        public final int mo27121i0() {
            return this.f35002g - this.f35003h;
        }

        /* renamed from: j0 */
        public final void mo27122j0(byte b) throws IOException {
            try {
                byte[] bArr = this.f35000e;
                int i = this.f35003h;
                this.f35003h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C8184d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35003h), Integer.valueOf(this.f35002g), 1}), e);
            }
        }

        /* renamed from: k0 */
        public final void mo27123k0(int i, boolean z) throws IOException {
            mo27112W0(i, 0);
            mo27122j0(z ? (byte) 1 : 0);
        }

        /* renamed from: n0 */
        public final void mo27126n0(byte[] bArr, int i, int i2) throws IOException {
            mo27114Y0(i2);
            mo27147c1(bArr, i, i2);
        }

        /* renamed from: o0 */
        public final void mo27127o0(int i, C8153i iVar) throws IOException {
            mo27112W0(i, 2);
            mo27128p0(iVar);
        }

        /* renamed from: p0 */
        public final void mo27128p0(C8153i iVar) throws IOException {
            mo27114Y0(iVar.size());
            iVar.mo26883W(this);
        }

        /* renamed from: u0 */
        public final void mo27133u0(int i, int i2) throws IOException {
            mo27112W0(i, 5);
            mo27134v0(i2);
        }

        /* renamed from: v0 */
        public final void mo27134v0(int i) throws IOException {
            try {
                byte[] bArr = this.f35000e;
                int i2 = this.f35003h;
                int i3 = i2 + 1;
                this.f35003h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f35003h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f35003h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f35003h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C8184d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35003h), Integer.valueOf(this.f35002g), 1}), e);
            }
        }

        /* renamed from: w0 */
        public final void mo27135w0(int i, long j) throws IOException {
            mo27112W0(i, 1);
            mo27136x0(j);
        }

        /* renamed from: x0 */
        public final void mo27136x0(long j) throws IOException {
            try {
                byte[] bArr = this.f35000e;
                int i = this.f35003h;
                int i2 = i + 1;
                this.f35003h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f35003h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f35003h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f35003h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f35003h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f35003h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f35003h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f35003h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C8184d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35003h), Integer.valueOf(this.f35002g), 1}), e);
            }
        }
    }

    /* renamed from: com.google.protobuf.l$d */
    /* compiled from: CodedOutputStream */
    public static class C8184d extends IOException {
        C8184d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        C8184d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.protobuf.l$e */
    /* compiled from: CodedOutputStream */
    private static final class C8185e extends C8182b {

        /* renamed from: i */
        private final OutputStream f35004i;

        C8185e(OutputStream outputStream, int i) {
            super(i);
            Objects.requireNonNull(outputStream, "out");
            this.f35004i = outputStream;
        }

        /* renamed from: i1 */
        private void m45258i1() throws IOException {
            this.f35004i.write(this.f34996e, 0, this.f34998g);
            this.f34998g = 0;
        }

        /* renamed from: j1 */
        private void m45259j1(int i) throws IOException {
            if (this.f34997f - this.f34998g < i) {
                m45258i1();
            }
        }

        /* renamed from: E0 */
        public void mo27094E0(int i, int i2) throws IOException {
            m45259j1(20);
            mo27143f1(i, 0);
            mo27142e1(i2);
        }

        /* renamed from: F0 */
        public void mo27095F0(int i) throws IOException {
            if (i >= 0) {
                mo27114Y0(i);
            } else {
                mo27116a1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I0 */
        public void mo27098I0(int i, C8243v0 v0Var, C8202n1 n1Var) throws IOException {
            mo27112W0(i, 2);
            mo27152n1(v0Var, n1Var);
        }

        /* renamed from: J0 */
        public void mo27099J0(C8243v0 v0Var) throws IOException {
            mo27114Y0(v0Var.mo27319f());
            v0Var.mo27318d(this);
        }

        /* renamed from: K0 */
        public void mo27100K0(int i, C8243v0 v0Var) throws IOException {
            mo27112W0(1, 3);
            mo27113X0(2, i);
            mo27151m1(3, v0Var);
            mo27112W0(1, 4);
        }

        /* renamed from: L0 */
        public void mo27101L0(int i, C8153i iVar) throws IOException {
            mo27112W0(1, 3);
            mo27113X0(2, i);
            mo27127o0(3, iVar);
            mo27112W0(1, 4);
        }

        /* renamed from: U0 */
        public void mo27110U0(int i, String str) throws IOException {
            mo27112W0(i, 2);
            mo27111V0(str);
        }

        /* renamed from: V0 */
        public void mo27111V0(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int X = C8180l.m45140X(length);
                int i3 = X + length;
                int i4 = this.f34997f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = C8094a2.m44507i(str, bArr, 0, length);
                    mo27114Y0(i5);
                    mo26917b(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f34998g) {
                    m45258i1();
                }
                int X2 = C8180l.m45140X(str.length());
                i = this.f34998g;
                if (X2 == X) {
                    int i6 = i + X2;
                    this.f34998g = i6;
                    int i7 = C8094a2.m44507i(str, this.f34996e, i6, this.f34997f - i6);
                    this.f34998g = i;
                    i2 = (i7 - i) - X2;
                    mo27144g1(i2);
                    this.f34998g = i7;
                } else {
                    i2 = C8094a2.m44508j(str);
                    mo27144g1(i2);
                    this.f34998g = C8094a2.m44507i(str, this.f34996e, this.f34998g, i2);
                }
                this.f34999h += i2;
            } catch (C8094a2.C8098d e) {
                this.f34999h -= this.f34998g - i;
                this.f34998g = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C8184d(e2);
            } catch (C8094a2.C8098d e3) {
                mo27119d0(str, e3);
            }
        }

        /* renamed from: W0 */
        public void mo27112W0(int i, int i2) throws IOException {
            mo27114Y0(C8105b2.m44582c(i, i2));
        }

        /* renamed from: X0 */
        public void mo27113X0(int i, int i2) throws IOException {
            m45259j1(20);
            mo27143f1(i, 0);
            mo27144g1(i2);
        }

        /* renamed from: Y0 */
        public void mo27114Y0(int i) throws IOException {
            m45259j1(5);
            mo27144g1(i);
        }

        /* renamed from: Z0 */
        public void mo27115Z0(int i, long j) throws IOException {
            m45259j1(20);
            mo27143f1(i, 0);
            mo27145h1(j);
        }

        /* renamed from: a */
        public void mo26916a(ByteBuffer byteBuffer) throws IOException {
            mo27149k1(byteBuffer);
        }

        /* renamed from: a1 */
        public void mo27116a1(long j) throws IOException {
            m45259j1(10);
            mo27145h1(j);
        }

        /* renamed from: b */
        public void mo26917b(byte[] bArr, int i, int i2) throws IOException {
            mo27150l1(bArr, i, i2);
        }

        /* renamed from: c0 */
        public void mo27117c0() throws IOException {
            if (this.f34998g > 0) {
                m45258i1();
            }
        }

        /* renamed from: j0 */
        public void mo27122j0(byte b) throws IOException {
            if (this.f34998g == this.f34997f) {
                m45258i1();
            }
            mo27139b1(b);
        }

        /* renamed from: k0 */
        public void mo27123k0(int i, boolean z) throws IOException {
            m45259j1(11);
            mo27143f1(i, 0);
            mo27139b1(z ? (byte) 1 : 0);
        }

        /* renamed from: k1 */
        public void mo27149k1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f34997f;
            int i2 = this.f34998g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f34996e, i2, remaining);
                this.f34998g += remaining;
                this.f34999h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f34996e, i2, i3);
            int i4 = remaining - i3;
            this.f34998g = this.f34997f;
            this.f34999h += i3;
            m45258i1();
            while (true) {
                int i5 = this.f34997f;
                if (i4 > i5) {
                    byteBuffer.get(this.f34996e, 0, i5);
                    this.f35004i.write(this.f34996e, 0, this.f34997f);
                    int i6 = this.f34997f;
                    i4 -= i6;
                    this.f34999h += i6;
                } else {
                    byteBuffer.get(this.f34996e, 0, i4);
                    this.f34998g = i4;
                    this.f34999h += i4;
                    return;
                }
            }
        }

        /* renamed from: l1 */
        public void mo27150l1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f34997f;
            int i4 = this.f34998g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f34996e, i4, i2);
                this.f34998g += i2;
                this.f34999h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f34996e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f34998g = this.f34997f;
            this.f34999h += i5;
            m45258i1();
            if (i7 <= this.f34997f) {
                System.arraycopy(bArr, i6, this.f34996e, 0, i7);
                this.f34998g = i7;
            } else {
                this.f35004i.write(bArr, i6, i7);
            }
            this.f34999h += i7;
        }

        /* renamed from: m1 */
        public void mo27151m1(int i, C8243v0 v0Var) throws IOException {
            mo27112W0(i, 2);
            mo27099J0(v0Var);
        }

        /* renamed from: n0 */
        public void mo27126n0(byte[] bArr, int i, int i2) throws IOException {
            mo27114Y0(i2);
            mo27150l1(bArr, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n1 */
        public void mo27152n1(C8243v0 v0Var, C8202n1 n1Var) throws IOException {
            mo27114Y0(((C8088a) v0Var).mo26775m(n1Var));
            n1Var.mo27198b(v0Var, this.f34994a);
        }

        /* renamed from: o0 */
        public void mo27127o0(int i, C8153i iVar) throws IOException {
            mo27112W0(i, 2);
            mo27128p0(iVar);
        }

        /* renamed from: p0 */
        public void mo27128p0(C8153i iVar) throws IOException {
            mo27114Y0(iVar.size());
            iVar.mo26883W(this);
        }

        /* renamed from: u0 */
        public void mo27133u0(int i, int i2) throws IOException {
            m45259j1(14);
            mo27143f1(i, 5);
            mo27140c1(i2);
        }

        /* renamed from: v0 */
        public void mo27134v0(int i) throws IOException {
            m45259j1(4);
            mo27140c1(i);
        }

        /* renamed from: w0 */
        public void mo27135w0(int i, long j) throws IOException {
            m45259j1(18);
            mo27143f1(i, 1);
            mo27141d1(j);
        }

        /* renamed from: x0 */
        public void mo27136x0(long j) throws IOException {
            m45259j1(8);
            mo27141d1(j);
        }
    }

    /* renamed from: A */
    public static int m45117A(int i, C8165i0 i0Var) {
        return (m45138V(1) * 2) + m45139W(2, i) + m45118B(3, i0Var);
    }

    /* renamed from: B */
    public static int m45118B(int i, C8165i0 i0Var) {
        return m45138V(i) + m45119C(i0Var);
    }

    /* renamed from: C */
    public static int m45119C(C8165i0 i0Var) {
        return m45120D(i0Var.mo26956b());
    }

    /* renamed from: D */
    static int m45120D(int i) {
        return m45140X(i) + i;
    }

    /* renamed from: E */
    public static int m45121E(int i, C8243v0 v0Var) {
        return (m45138V(1) * 2) + m45139W(2, i) + m45122F(3, v0Var);
    }

    /* renamed from: F */
    public static int m45122F(int i, C8243v0 v0Var) {
        return m45138V(i) + m45124H(v0Var);
    }

    /* renamed from: G */
    static int m45123G(int i, C8243v0 v0Var, C8202n1 n1Var) {
        return m45138V(i) + m45125I(v0Var, n1Var);
    }

    /* renamed from: H */
    public static int m45124H(C8243v0 v0Var) {
        return m45120D(v0Var.mo27319f());
    }

    /* renamed from: I */
    static int m45125I(C8243v0 v0Var, C8202n1 n1Var) {
        return m45120D(((C8088a) v0Var).mo26775m(n1Var));
    }

    /* renamed from: J */
    static int m45126J(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: K */
    public static int m45127K(int i, C8153i iVar) {
        return (m45138V(1) * 2) + m45139W(2, i) + m45151h(3, iVar);
    }

    /* renamed from: L */
    public static int m45128L(int i, int i2) {
        return m45138V(i) + m45129M(i2);
    }

    /* renamed from: M */
    public static int m45129M(int i) {
        return 4;
    }

    /* renamed from: N */
    public static int m45130N(int i, long j) {
        return m45138V(i) + m45131O(j);
    }

    /* renamed from: O */
    public static int m45131O(long j) {
        return 8;
    }

    /* renamed from: P */
    public static int m45132P(int i, int i2) {
        return m45138V(i) + m45133Q(i2);
    }

    /* renamed from: Q */
    public static int m45133Q(int i) {
        return m45140X(m45143a0(i));
    }

    /* renamed from: R */
    public static int m45134R(int i, long j) {
        return m45138V(i) + m45135S(j);
    }

    /* renamed from: S */
    public static int m45135S(long j) {
        return m45142Z(m45144b0(j));
    }

    /* renamed from: T */
    public static int m45136T(int i, String str) {
        return m45138V(i) + m45137U(str);
    }

    /* renamed from: U */
    public static int m45137U(String str) {
        int i;
        try {
            i = C8094a2.m44508j(str);
        } catch (C8094a2.C8098d unused) {
            i = str.getBytes(C8119d0.f34855b).length;
        }
        return m45120D(i);
    }

    /* renamed from: V */
    public static int m45138V(int i) {
        return m45140X(C8105b2.m44582c(i, 0));
    }

    /* renamed from: W */
    public static int m45139W(int i, int i2) {
        return m45138V(i) + m45140X(i2);
    }

    /* renamed from: X */
    public static int m45140X(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: Y */
    public static int m45141Y(int i, long j) {
        return m45138V(i) + m45142Z(j);
    }

    /* renamed from: Z */
    public static int m45142Z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a0 */
    public static int m45143a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b0 */
    public static long m45144b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e */
    public static int m45146e(int i, boolean z) {
        return m45138V(i) + m45147f(z);
    }

    /* renamed from: f */
    public static int m45147f(boolean z) {
        return 1;
    }

    /* renamed from: f0 */
    public static C8180l m45148f0(OutputStream outputStream, int i) {
        return new C8185e(outputStream, i);
    }

    /* renamed from: g */
    public static int m45149g(byte[] bArr) {
        return m45120D(bArr.length);
    }

    /* renamed from: g0 */
    public static C8180l m45150g0(byte[] bArr) {
        return m45152h0(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static int m45151h(int i, C8153i iVar) {
        return m45138V(i) + m45153i(iVar);
    }

    /* renamed from: h0 */
    public static C8180l m45152h0(byte[] bArr, int i, int i2) {
        return new C8183c(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m45153i(C8153i iVar) {
        return m45120D(iVar.size());
    }

    /* renamed from: j */
    public static int m45154j(int i, double d) {
        return m45138V(i) + m45155k(d);
    }

    /* renamed from: k */
    public static int m45155k(double d) {
        return 8;
    }

    /* renamed from: l */
    public static int m45156l(int i, int i2) {
        return m45138V(i) + m45157m(i2);
    }

    /* renamed from: m */
    public static int m45157m(int i) {
        return m45168x(i);
    }

    /* renamed from: n */
    public static int m45158n(int i, int i2) {
        return m45138V(i) + m45159o(i2);
    }

    /* renamed from: o */
    public static int m45159o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m45160p(int i, long j) {
        return m45138V(i) + m45161q(j);
    }

    /* renamed from: q */
    public static int m45161q(long j) {
        return 8;
    }

    /* renamed from: r */
    public static int m45162r(int i, float f) {
        return m45138V(i) + m45163s(f);
    }

    /* renamed from: s */
    public static int m45163s(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: t */
    static int m45164t(int i, C8243v0 v0Var, C8202n1 n1Var) {
        return (m45138V(i) * 2) + m45166v(v0Var, n1Var);
    }

    @Deprecated
    /* renamed from: u */
    public static int m45165u(C8243v0 v0Var) {
        return v0Var.mo27319f();
    }

    @Deprecated
    /* renamed from: v */
    static int m45166v(C8243v0 v0Var, C8202n1 n1Var) {
        return ((C8088a) v0Var).mo26775m(n1Var);
    }

    /* renamed from: w */
    public static int m45167w(int i, int i2) {
        return m45138V(i) + m45168x(i2);
    }

    /* renamed from: x */
    public static int m45168x(int i) {
        if (i >= 0) {
            return m45140X(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m45169y(int i, long j) {
        return m45138V(i) + m45170z(j);
    }

    /* renamed from: z */
    public static int m45170z(long j) {
        return m45142Z(j);
    }

    @Deprecated
    /* renamed from: A0 */
    public final void mo27090A0(int i, C8243v0 v0Var) throws IOException {
        mo27112W0(i, 3);
        mo27092C0(v0Var);
        mo27112W0(i, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: B0 */
    public final void mo27091B0(int i, C8243v0 v0Var, C8202n1 n1Var) throws IOException {
        mo27112W0(i, 3);
        mo27093D0(v0Var, n1Var);
        mo27112W0(i, 4);
    }

    @Deprecated
    /* renamed from: C0 */
    public final void mo27092C0(C8243v0 v0Var) throws IOException {
        v0Var.mo27318d(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: D0 */
    public final void mo27093D0(C8243v0 v0Var, C8202n1 n1Var) throws IOException {
        n1Var.mo27198b(v0Var, this.f34994a);
    }

    /* renamed from: E0 */
    public abstract void mo27094E0(int i, int i2) throws IOException;

    /* renamed from: F0 */
    public abstract void mo27095F0(int i) throws IOException;

    /* renamed from: G0 */
    public final void mo27096G0(int i, long j) throws IOException {
        mo27115Z0(i, j);
    }

    /* renamed from: H0 */
    public final void mo27097H0(long j) throws IOException {
        mo27116a1(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public abstract void mo27098I0(int i, C8243v0 v0Var, C8202n1 n1Var) throws IOException;

    /* renamed from: J0 */
    public abstract void mo27099J0(C8243v0 v0Var) throws IOException;

    /* renamed from: K0 */
    public abstract void mo27100K0(int i, C8243v0 v0Var) throws IOException;

    /* renamed from: L0 */
    public abstract void mo27101L0(int i, C8153i iVar) throws IOException;

    /* renamed from: M0 */
    public final void mo27102M0(int i, int i2) throws IOException {
        mo27133u0(i, i2);
    }

    /* renamed from: N0 */
    public final void mo27103N0(int i) throws IOException {
        mo27134v0(i);
    }

    /* renamed from: O0 */
    public final void mo27104O0(int i, long j) throws IOException {
        mo27135w0(i, j);
    }

    /* renamed from: P0 */
    public final void mo27105P0(long j) throws IOException {
        mo27136x0(j);
    }

    /* renamed from: Q0 */
    public final void mo27106Q0(int i, int i2) throws IOException {
        mo27113X0(i, m45143a0(i2));
    }

    /* renamed from: R0 */
    public final void mo27107R0(int i) throws IOException {
        mo27114Y0(m45143a0(i));
    }

    /* renamed from: S0 */
    public final void mo27108S0(int i, long j) throws IOException {
        mo27115Z0(i, m45144b0(j));
    }

    /* renamed from: T0 */
    public final void mo27109T0(long j) throws IOException {
        mo27116a1(m45144b0(j));
    }

    /* renamed from: U0 */
    public abstract void mo27110U0(int i, String str) throws IOException;

    /* renamed from: V0 */
    public abstract void mo27111V0(String str) throws IOException;

    /* renamed from: W0 */
    public abstract void mo27112W0(int i, int i2) throws IOException;

    /* renamed from: X0 */
    public abstract void mo27113X0(int i, int i2) throws IOException;

    /* renamed from: Y0 */
    public abstract void mo27114Y0(int i) throws IOException;

    /* renamed from: Z0 */
    public abstract void mo27115Z0(int i, long j) throws IOException;

    /* renamed from: a1 */
    public abstract void mo27116a1(long j) throws IOException;

    /* renamed from: b */
    public abstract void mo26917b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c0 */
    public abstract void mo27117c0() throws IOException;

    /* renamed from: d */
    public final void mo27118d() {
        if (mo27121i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final void mo27119d0(String str, C8094a2.C8098d dVar) throws IOException {
        f34992c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C8119d0.f34855b);
        try {
            mo27114Y0(bytes.length);
            mo26917b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C8184d(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public boolean mo27120e0() {
        return this.f34995b;
    }

    /* renamed from: i0 */
    public abstract int mo27121i0();

    /* renamed from: j0 */
    public abstract void mo27122j0(byte b) throws IOException;

    /* renamed from: k0 */
    public abstract void mo27123k0(int i, boolean z) throws IOException;

    /* renamed from: l0 */
    public final void mo27124l0(boolean z) throws IOException {
        mo27122j0(z ? (byte) 1 : 0);
    }

    /* renamed from: m0 */
    public final void mo27125m0(byte[] bArr) throws IOException {
        mo27126n0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public abstract void mo27126n0(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: o0 */
    public abstract void mo27127o0(int i, C8153i iVar) throws IOException;

    /* renamed from: p0 */
    public abstract void mo27128p0(C8153i iVar) throws IOException;

    /* renamed from: q0 */
    public final void mo27129q0(int i, double d) throws IOException {
        mo27135w0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r0 */
    public final void mo27130r0(double d) throws IOException {
        mo27136x0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: s0 */
    public final void mo27131s0(int i, int i2) throws IOException {
        mo27094E0(i, i2);
    }

    /* renamed from: t0 */
    public final void mo27132t0(int i) throws IOException {
        mo27095F0(i);
    }

    /* renamed from: u0 */
    public abstract void mo27133u0(int i, int i2) throws IOException;

    /* renamed from: v0 */
    public abstract void mo27134v0(int i) throws IOException;

    /* renamed from: w0 */
    public abstract void mo27135w0(int i, long j) throws IOException;

    /* renamed from: x0 */
    public abstract void mo27136x0(long j) throws IOException;

    /* renamed from: y0 */
    public final void mo27137y0(int i, float f) throws IOException {
        mo27133u0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: z0 */
    public final void mo27138z0(float f) throws IOException {
        mo27134v0(Float.floatToRawIntBits(f));
    }

    private C8180l() {
    }
}
