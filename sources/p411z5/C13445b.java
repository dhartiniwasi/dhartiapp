package p411z5;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import p040e5.C4240a;

/* renamed from: z5.b */
public class C13445b extends C4240a {
    public static final Parcelable.Creator<C13445b> CREATOR = new C13460o();

    /* renamed from: h */
    private static final String f47789h = C13445b.class.getSimpleName();

    /* renamed from: a */
    private String f47790a;

    /* renamed from: b */
    private DataHolder f47791b;

    /* renamed from: c */
    private ParcelFileDescriptor f47792c;

    /* renamed from: d */
    private long f47793d;

    /* renamed from: e */
    private byte[] f47794e;

    /* renamed from: f */
    private byte[] f47795f;

    /* renamed from: g */
    private File f47796g;

    public C13445b() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    public C13445b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.f47790a = str;
        this.f47791b = dataHolder;
        this.f47792c = parcelFileDescriptor;
        this.f47793d = j;
        this.f47794e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.FileOutputStream m62477N1() {
        /*
            r5 = this;
            java.io.File r0 = r5.f47796g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch:{ IOException -> 0x002f, all -> 0x0025 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r5.f47792c = r3     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            if (r0 == 0) goto L_0x0020
            r0.delete()
        L_0x0020:
            return r2
        L_0x0021:
            r1 = move-exception
            goto L_0x0029
        L_0x0023:
            goto L_0x0030
        L_0x0025:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.delete()
        L_0x002e:
            throw r1
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.delete()
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p411z5.C13445b.m62477N1():java.io.FileOutputStream");
    }

    /* renamed from: O1 */
    private static void m62478O1(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: I1 */
    public DataHolder mo38533I1() {
        return this.f47791b;
    }

    /* renamed from: J1 */
    public ParcelFileDescriptor mo38534J1() {
        return this.f47792c;
    }

    /* renamed from: K1 */
    public long mo38535K1() {
        return this.f47793d;
    }

    /* renamed from: L1 */
    public String mo38536L1() {
        return this.f47790a;
    }

    /* renamed from: M1 */
    public byte[] mo38537M1() {
        return this.f47794e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f47792c
            r1 = 1
            if (r0 != 0) goto L_0x0031
            byte[] r0 = r3.f47795f
            if (r0 == 0) goto L_0x0031
            java.io.FileOutputStream r0 = r3.m62477N1()
            if (r0 == 0) goto L_0x0031
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.f47795f     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            int r2 = r2.length     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.writeInt(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            byte[] r2 = r3.f47795f     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.write(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            m62478O1(r0)
            r0 = 1
            goto L_0x0032
        L_0x0029:
            r4 = move-exception
            m62478O1(r0)
            throw r4
        L_0x002e:
            m62478O1(r0)
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r5 | r1
        L_0x0036:
            p411z5.C13460o.m62489a(r3, r4, r5)
            r4 = 0
            r3.f47792c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p411z5.C13445b.writeToParcel(android.os.Parcel, int):void");
    }
}
