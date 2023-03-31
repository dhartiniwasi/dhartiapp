package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4243c;

/* renamed from: z5.o */
public final class C13460o implements Parcelable.Creator<C13445b> {
    /* renamed from: a */
    static void m62489a(C13445b bVar, Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, bVar.mo38536L1(), false);
        C4243c.m28619p(parcel, 3, bVar.mo38533I1(), i, false);
        C4243c.m28619p(parcel, 4, bVar.mo38534J1(), i, false);
        C4243c.m28617n(parcel, 5, bVar.mo38535K1());
        C4243c.m28609f(parcel, 6, bVar.mo38537M1(), false);
        C4243c.m28605b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = p040e5.C4241b.m28602y(r12)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r10 = r7
            r8 = r2
        L_0x000c:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0050
            int r1 = p040e5.C4241b.m28595r(r12)
            int r2 = p040e5.C4241b.m28589l(r1)
            r3 = 2
            if (r2 == r3) goto L_0x004b
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r3 = 4
            if (r2 == r3) goto L_0x0037
            r3 = 5
            if (r2 == r3) goto L_0x0032
            r3 = 6
            if (r2 == r3) goto L_0x002d
            p040e5.C4241b.m28601x(r12, r1)
            goto L_0x000c
        L_0x002d:
            byte[] r10 = p040e5.C4241b.m28579b(r12, r1)
            goto L_0x000c
        L_0x0032:
            long r8 = p040e5.C4241b.m28598u(r12, r1)
            goto L_0x000c
        L_0x0037:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = p040e5.C4241b.m28582e(r12, r1, r2)
            r7 = r1
            android.os.ParcelFileDescriptor r7 = (android.os.ParcelFileDescriptor) r7
            goto L_0x000c
        L_0x0041:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r2 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = p040e5.C4241b.m28582e(r12, r1, r2)
            r6 = r1
            com.google.android.gms.common.data.DataHolder r6 = (com.google.android.gms.common.data.DataHolder) r6
            goto L_0x000c
        L_0x004b:
            java.lang.String r5 = p040e5.C4241b.m28583f(r12, r1)
            goto L_0x000c
        L_0x0050:
            p040e5.C4241b.m28588k(r12, r0)
            z5.b r12 = new z5.b
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p411z5.C13460o.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C13445b[i];
    }
}
